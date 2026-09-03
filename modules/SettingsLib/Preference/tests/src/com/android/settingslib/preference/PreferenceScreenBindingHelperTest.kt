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

package com.android.settingslib.preference

import android.content.Context
import androidx.preference.PreferenceGroup
import androidx.preference.PreferenceScreen
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.android.settingslib.metadata.FixedArrayMap
import com.android.settingslib.metadata.PreferenceCategory
import com.android.settingslib.metadata.PreferenceMetadata
import com.android.settingslib.metadata.PreferenceScreenRegistry
import com.android.settingslib.metadata.PreferenceTitleProvider
import com.android.settingslib.metadata.preferenceHierarchy
import com.google.common.truth.Truth.assertThat
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PreferenceScreenBindingHelperTest {

    @Test
    fun asyncHierarchy() = runTest {
        val screenMetadata = AsyncHierarchyScreen(this)
        PreferenceScreenRegistry.preferenceScreenMetadataFactories =
            FixedArrayMap(1) { it.put(screenMetadata.key) { screenMetadata } }
        screenMetadata.test()
    }
}

private class AsyncHierarchyScreen(testScope: TestScope) : Screen(testScope) {
    override fun getPreferenceHierarchy(context: Context, coroutineScope: CoroutineScope) =
        preferenceHierarchy(context) {
            +Metadata("1")
            // exception raised in a sub async hierarchy should not impact other hierarchy
            addAsync(coroutineScope, coroutineContext) {
                delay(1.seconds)
                throw RuntimeException("expected")
            }
            addAsync(coroutineScope, coroutineContext) {
                delay(20.seconds)
                +Metadata("2") order 10
            }
            addAsync(coroutineScope, coroutineContext) {
                delay(10.seconds)
                +Metadata("3") order 20
            }
            addAsync(coroutineScope, coroutineContext) {
                delay(30.seconds)
                +Group("g") order 30 += {
                    // recursive async hierarchy is supported
                    addAsync(coroutineScope, coroutineContext) {
                        delay(10.seconds)
                        +Metadata("4")
                        +Metadata("5")
                    }
                }
                +Metadata("6") order 40
            }
            +Metadata("7") order 50
        }

    override fun verify(preferenceScreen: PreferenceScreen) {
        assertThat(preferenceScreen.toTitleList())
            .isEqualTo(listOf<Any>("1".prefTitle(), "7".prefTitle()))

        advanceTimeBy(11.seconds)
        assertThat(preferenceScreen.toTitleList())
            .isEqualTo(listOf<Any>("1".prefTitle(), "3".prefTitle(), "7".prefTitle()))

        advanceTimeBy(11.seconds)
        assertThat(preferenceScreen.toTitleList())
            .isEqualTo(
                listOf<Any>("1".prefTitle(), "2".prefTitle(), "3".prefTitle(), "7".prefTitle())
            )

        advanceTimeBy(11.seconds)
        assertThat(preferenceScreen.toTitleList())
            .isEqualTo(
                listOf<Any>(
                    "1".prefTitle(),
                    "2".prefTitle(),
                    "3".prefTitle(),
                    "g".groupTitle(),
                    listOf<Any>(),
                    "6".prefTitle(),
                    "7".prefTitle(),
                )
            )

        advanceTimeBy(11.seconds)
        assertThat(preferenceScreen.toTitleList())
            .isEqualTo(
                listOf<Any>(
                    "1".prefTitle(),
                    "2".prefTitle(),
                    "3".prefTitle(),
                    "g".groupTitle(),
                    listOf<Any>("4".prefTitle(), "5".prefTitle()),
                    "6".prefTitle(),
                    "7".prefTitle(),
                )
            )
    }
}

private abstract class Screen(val testScope: TestScope) : PreferenceScreenCreator {
    private val supervisorScope = CoroutineScope(testScope.coroutineContext + SupervisorJob())

    val coroutineContext
        get() = supervisorScope.coroutineContext

    override val key: String
        get() = "screen"

    override fun fragmentClass() = PreferenceFragment::class.java

    fun test() {
        launchFragmentScenario().onFragment { verify(it.preferenceScreen) }.close()
    }

    abstract fun verify(preferenceScreen: PreferenceScreen)

    fun advanceTimeBy(delayTime: Duration) {
        testScope.testScheduler.advanceTimeBy(delayTime)
        waitForIdleSync()
    }
}

private class Metadata(override val key: String) : PreferenceMetadata, PreferenceTitleProvider {

    override fun getTitle(context: Context) = key.prefTitle()
}

private fun String.prefTitle() = "pref $this"

private class Group(key: String) : PreferenceCategory(key, 0), PreferenceTitleProvider {

    override fun getTitle(context: Context) = key.groupTitle()
}

private fun String.groupTitle() = "group $this"

private fun PreferenceGroup.toTitleList(): List<Any> =
    mutableListOf<Any>().apply {
        for (i in 0 until preferenceCount) {
            val preference = getPreference(i)
            add(preference.title!!)
            if (preference is PreferenceGroup) {
                add(preference.toTitleList())
            }
        }
    }

private fun waitForIdleSync() = InstrumentationRegistry.getInstrumentation().waitForIdleSync()
