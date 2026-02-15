/*
 * Copyright (C) 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settingslib.metadata

import android.content.Context
import android.database.MatrixCursor
import android.os.SystemClock
import android.provider.SearchIndexablesContract
import android.provider.SearchIndexablesProvider
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking

/**
 * [SearchIndexablesProvider] to generate indexing data consistently for preference screens that are
 * built on top of Catalyst framework.
 *
 * A screen is qualified as indexable only when:
 * - [PreferenceScreenMetadata.hasCompleteHierarchy] is true: hybrid mode is not supported to avoid
 *   potential conflict.
 * - **AND** [PreferenceScreenMetadata.isPreferenceIndexable] is true.
 * - **AND** [PreferenceScreenMetadata.isFlagEnabled] is true.
 *
 * The strategy to provide indexing data is:
 * - A preference is treated dynamic (and handled by [queryDynamicRawData]) only when:
 *     - it or any of its parent implements [PreferenceAvailabilityProvider]
 *     - **OR** it has dynamic content (i.e. implements [PreferenceTitleProvider] and
 *       [PreferenceIconProvider])
 * - A preference is treated static (and handled by [queryRawData]) only when:
 *     - it and all of its parents do no implement [PreferenceAvailabilityProvider]
 *     - **AND** it does not contain any dynamic content
 *
 * With this strategy, [queryNonIndexableKeys] simply returns an empty data.
 *
 * Nevertheless, it is possible to design other strategy. For example, a preference implements
 * [PreferenceAvailabilityProvider] and does not contain any dynamic content can be treated as
 * static. Then it will reduce the data returned by [queryDynamicRawData] but need more time to
 * traversal all the screens for [queryNonIndexableKeys].
 */
abstract class PreferenceSearchIndexablesProvider : SearchIndexablesProvider() {

    /**
     * Returns if Catalyst indexable provider is enabled.
     *
     * This is mainly for flagging purpose.
     */
    abstract val isCatalystSearchEnabled: Boolean

    override fun queryDynamicRawData(projection: Array<out String>?): MatrixCursor {
        val cursor = MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS)
        if (!isCatalystSearchEnabled) return cursor
        val start = SystemClock.elapsedRealtime()
        val context = requireContext()
        visitPreferenceScreen(context) { preferenceScreenMetadata, coroutineScope ->
            val screenTitle = preferenceScreenMetadata.getIndexableTitle(context)
            suspend fun PreferenceHierarchyNode.visitRecursively(
                isParentAvailableOnCondition: Boolean
            ) {
                if (!metadata.isAvailable(context)) return
                val isAvailableOnCondition =
                    isParentAvailableOnCondition || metadata.isAvailableOnCondition
                if (
                    metadata.isPreferenceIndexable(context) &&
                        (isAvailableOnCondition || metadata.isDynamic) &&
                        !metadata.isScreenEntryPoint(preferenceScreenMetadata)
                ) {
                    metadata
                        .toRawColumnValues(context, preferenceScreenMetadata, screenTitle)
                        ?.let { cursor.addRow(it) }
                }
                (this as? PreferenceHierarchy)?.forEachAsync {
                    it.visitRecursively(isAvailableOnCondition)
                }
            }
            preferenceScreenMetadata
                .getPreferenceHierarchy(context, coroutineScope)
                .visitRecursively(preferenceScreenMetadata is PreferenceIndexableProvider)
        }
        Log.d(TAG, "dynamicRawData: ${cursor.count} in ${SystemClock.elapsedRealtime() - start}ms")
        return cursor
    }

    override fun queryRawData(projection: Array<String>?): MatrixCursor {
        val cursor = MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS)
        if (!isCatalystSearchEnabled) return cursor
        val start = SystemClock.elapsedRealtime()
        val context = requireContext()
        visitPreferenceScreen(context) { preferenceScreenMetadata, coroutineScope ->
            val screenTitle = preferenceScreenMetadata.getIndexableTitle(context)
            fun PreferenceHierarchyNode.visitRecursively() {
                if (metadata.isAvailableOnCondition) return
                if (
                    metadata.isPreferenceIndexable(context) &&
                        !metadata.isDynamic &&
                        !metadata.isScreenEntryPoint(preferenceScreenMetadata)
                ) {
                    metadata
                        .toRawColumnValues(context, preferenceScreenMetadata, screenTitle)
                        ?.let { cursor.addRow(it) }
                }
                // forEachAsync is not used so as to ignore async nodes, which are treated as
                // available on condition
                (this as? PreferenceHierarchy)?.forEach { it.visitRecursively() }
            }
            preferenceScreenMetadata
                .getPreferenceHierarchy(context, coroutineScope)
                .visitRecursively()
        }
        Log.d(TAG, "rawData: ${cursor.count} in ${SystemClock.elapsedRealtime() - start}ms")
        return cursor
    }

    override fun queryNonIndexableKeys(projection: Array<String>?) =
        // Just return empty as queryRawData ignores conditional available preferences recursively
        MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS)

    private fun visitPreferenceScreen(
        context: Context,
        action: suspend (PreferenceScreenMetadata, CoroutineScope) -> Unit,
    ) = runBlocking {
        usePreferenceHierarchyScope {
            // TODO: support visiting screens concurrently and setting timeout for each screen
            PreferenceScreenRegistry.preferenceScreenMetadataFactories.forEachAsync { _, factory ->
                // parameterized screen is not supported as there is no way to provide arguments
                if (factory is PreferenceScreenMetadataParameterizedFactory) return@forEachAsync
                val preferenceScreenMetadata = factory.create(context)
                if (
                    preferenceScreenMetadata.hasCompleteHierarchy() &&
                        preferenceScreenMetadata.isPreferenceIndexable(context) &&
                        preferenceScreenMetadata.isFlagEnabled(context)
                ) {
                    if (preferenceScreenMetadata.isEnabled(context)) {
                        action(preferenceScreenMetadata, this)
                    } else if (preferenceScreenMetadata !is PreferenceIndexableProvider) {
                        val key = preferenceScreenMetadata.key
                        Log.e(TAG, "Screen $key does not implement PreferenceIndexableProvider")
                    } else {
                        val key = preferenceScreenMetadata.key
                        Log.d(TAG, "Screen $key is disabled thus not indexable")
                    }
                }
            }
        }
    }

    private fun PreferenceMetadata.toRawColumnValues(
        context: Context,
        preferenceScreenMetadata: PreferenceScreenMetadata,
        screenTitle: CharSequence?,
    ): Array<Any?>? {
        val intent = preferenceScreenMetadata.getLaunchIntent(context, this) ?: return null
        val columnValues = arrayOfNulls<Any>(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.size)

        columnValues[SearchIndexablesContract.COLUMN_INDEX_RAW_TITLE] = getIndexableTitle(context)
        columnValues[SearchIndexablesContract.COLUMN_INDEX_RAW_KEYWORDS] = getKeywords(context)
        columnValues[SearchIndexablesContract.COLUMN_INDEX_RAW_SCREEN_TITLE] = screenTitle
        val iconResId = getPreferenceIcon(context)
        if (iconResId != 0) {
            columnValues[SearchIndexablesContract.COLUMN_INDEX_RAW_ICON_RESID] = iconResId
        }
        columnValues[SearchIndexablesContract.COLUMN_INDEX_RAW_KEY] =
            "$PREFIX${preferenceScreenMetadata.key}/$bindingKey"

        columnValues[SearchIndexablesContract.COLUMN_INDEX_RAW_INTENT_ACTION] = intent.action
        intent.component?.let {
            columnValues[SearchIndexablesContract.COLUMN_INDEX_RAW_INTENT_TARGET_PACKAGE] =
                it.packageName
            columnValues[SearchIndexablesContract.COLUMN_INDEX_RAW_INTENT_TARGET_CLASS] =
                it.className
        }
        return columnValues
    }

    private fun PreferenceScreenMetadata.getIndexableTitle(context: Context) =
        when (this) {
            is PreferenceIndexableTitleProvider -> getIndexableTitle(context)
            else -> getPreferenceScreenTitle(context)
        }

    private fun PreferenceMetadata.getIndexableTitle(context: Context) =
        when (this) {
            is PreferenceIndexableTitleProvider -> getIndexableTitle(context)
            else -> getPreferenceTitle(context)
        }

    private fun PreferenceMetadata.getKeywords(context: Context) =
        if (keywords != 0) context.getString(keywords) else null

    private fun PreferenceMetadata.isAvailable(context: Context) =
        (this as? PreferenceAvailabilityProvider)?.isAvailable(context) != false

    /**
     * Returns if the preference has dynamic content.
     *
     * Dynamic summary is not taken into account because it is not used by settings search now.
     */
    private val PreferenceMetadata.isDynamic: Boolean
        get() =
            this is PreferenceTitleProvider ||
                this is PreferenceIconProvider ||
                this is PreferenceIndexableProvider

    /**
     * Returns if the preference is an entry point of another screen.
     *
     * If true, the preference will be excluded to avoid duplication on search result.
     */
    private fun PreferenceMetadata.isScreenEntryPoint(
        preferenceScreenMetadata: PreferenceScreenMetadata
    ) = this is PreferenceScreenMetadata && preferenceScreenMetadata != this

    companion object {
        private const val TAG = "CatalystSearch"
        /** Prefix to distinguish preference key for Catalyst search. */
        private const val PREFIX = "CS:"

        fun getHighlightKey(key: String?): String? {
            if (key?.startsWith(PREFIX) != true) return key
            val lastSlash = key.lastIndexOf('/')
            return key.substring(lastSlash + 1)
        }
    }
}
