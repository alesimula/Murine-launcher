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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.cancel

/** Returns the preference screen title. */
fun PreferenceScreenMetadata.getPreferenceScreenTitle(context: Context): CharSequence? =
    when {
        screenTitle != 0 -> context.getString(screenTitle)
        else -> getScreenTitle(context) ?: (this as? PreferenceTitleProvider)?.getTitle(context)
    }

/** Returns the preference title. */
fun PreferenceMetadata.getPreferenceTitle(context: Context): CharSequence? =
    when {
        title != 0 -> context.getText(title)
        this is PreferenceTitleProvider -> getTitle(context)
        else -> null
    }

/** Returns the preference summary. */
fun PreferenceMetadata.getPreferenceSummary(context: Context): CharSequence? =
    when {
        summary != 0 -> context.getText(summary)
        this is PreferenceSummaryProvider -> getSummary(context)
        else -> null
    }

/** Returns the preference icon. */
fun PreferenceMetadata.getPreferenceIcon(context: Context): Int =
    when {
        icon != 0 -> icon
        this is PreferenceIconProvider -> getIcon(context)
        else -> 0
    }

/**
 * Returns whether the preference is indexable.
 *
 * @return [PreferenceIndexableProvider.isIndexable] if implemented, otherwise
 *   [PreferenceMetadata.indexable]
 */
fun PreferenceMetadata.isPreferenceIndexable(context: Context): Boolean =
    if (this is PreferenceIndexableProvider) isIndexable(context) else indexable

/**
 * Performs preference hierarchy operation with a new [CoroutineScope].
 *
 * The coroutine scope will be cancelled automatically (when the block is finished) to cancel
 * pending tasks (e.g. async hierarchy).
 */
suspend fun <T> usePreferenceHierarchyScope(block: suspend CoroutineScope.() -> T): T {
    // the block is likely to be CPU intensive and SupervisorJob is used to isolate sub tasks
    val scope = CoroutineScope(Dispatchers.Default + SupervisorJob())
    return try {
        scope.async { block() }.await()
    } finally {
        scope.cancel()
    }
}
