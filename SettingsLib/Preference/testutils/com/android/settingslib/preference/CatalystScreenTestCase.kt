/*
 * Copyright (C) 2024 The Android Open Source Project
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
import android.util.Log
import androidx.fragment.app.testing.FragmentScenario
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceGroup
import androidx.preference.PreferenceScreen
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage
import java.util.concurrent.atomic.AtomicBoolean
import org.junit.Test
import org.junit.runner.RunWith

/** Test case for catalyst screen. */
@RunWith(AndroidJUnit4::class)
abstract class CatalystScreenTestCase {
    protected val appContext: Context = ApplicationProvider.getApplicationContext()

    /** Catalyst screen. */
    protected abstract val preferenceScreenCreator: PreferenceScreenCreator

    /**
     * Test to compare the preference screen hierarchy between legacy screen (flag is disabled) and
     * catalyst screen (flag is enabled).
     */
    @Test
    open fun migration() {
        enableCatalystScreen()
        assertThat(preferenceScreenCreator.isFlagEnabled(appContext)).isTrue()
        val catalystScreen = dumpPreferenceScreen()
        Log.i(TAG, "Catalyst screen: $catalystScreen")

        disableCatalystScreen()
        assertThat(preferenceScreenCreator.isFlagEnabled(appContext)).isFalse()
        val legacyScreen = dumpPreferenceScreen()
        assertWithMessage("Legacy screen: %s", legacyScreen)
            .that(catalystScreen)
            .isEqualTo(legacyScreen)
    }

    /** Enables the flag to test catalyst screen. */
    abstract fun enableCatalystScreen()

    /** Disables the flag to test legacy screen. */
    abstract fun disableCatalystScreen()

    private fun dumpPreferenceScreen(): String {
        // Dump threads for troubleshooting when the test thread is stuck.
        // Latest junit Timeout rule supports similar feature but it is not yet available on AOSP.
        val taskFinished = AtomicBoolean()
        Thread {
                Thread.sleep(20000)
                if (!taskFinished.get()) dumpThreads()
            }
            .apply {
                isDaemon = true
                @Suppress("DEPRECATION") start()
            }

        @Suppress("UNCHECKED_CAST")
        val clazz = preferenceScreenCreator.fragmentClass() as Class<PreferenceFragmentCompat>
        val builder = StringBuilder()
        launchFragment(clazz) { fragment ->
            taskFinished.set(true)
            fragment.preferenceScreen.toString(builder)
        }
        return builder.toString()
    }

    protected open fun launchFragment(
        fragmentClass: Class<PreferenceFragmentCompat>,
        action: (PreferenceFragmentCompat) -> Unit,
    ): Unit = launchFragmentScenario(fragmentClass).use { it.onFragment(action) }

    protected open fun launchFragmentScenario(fragmentClass: Class<PreferenceFragmentCompat>) =
        FragmentScenario.launch(fragmentClass)

    private fun Preference.toString(builder: StringBuilder, indent: String = "") {
        val clazz = getPreferenceClass(this)
        builder.append(indent).append(clazz).append(" {\n")
        val indent2 = "$indent  "
        if (clazz != PreferenceScreen::class.java) {
            key?.let { builder.append(indent2).append("key: \"$it\"\n") }
        }
        title?.let { builder.append(indent2).append("title: \"$it\"\n") }
        summary?.let { builder.append(indent2).append("summary: \"$it\"\n") }
        fragment?.let { builder.append(indent2).append("fragment: \"$it\"\n") }
        builder.append(indent2).append("order: $order\n")
        builder.append(indent2).append("isCopyingEnabled: $isCopyingEnabled\n")
        builder.append(indent2).append("isEnabled: $isEnabled\n")
        builder.append(indent2).append("isVisible: $isVisible\n")
        builder.append(indent2).append("isIconSpaceReserved: $isIconSpaceReserved\n")
        if (
            clazz != Preference::class.java && !PreferenceGroup::class.java.isAssignableFrom(clazz)
        ) {
            builder.append(indent2).append("isPersistent: $isPersistent\n")
        }
        builder.append(indent2).append("isSelectable: $isSelectable\n")
        if (this is PreferenceGroup) {
            val count = preferenceCount
            builder.append(indent2).append("preferenceCount: $count\n")
            val indent4 = "$indent2  "
            for (index in 0..<count) {
                getPreference(index).toString(builder, indent4)
            }
        }
        builder.append(indent).append("}\n")
    }

    /**
     * Returns the preference class to dump.
     *
     * Subclass could override to take care of preference widget change after migration.
     */
    protected open fun getPreferenceClass(preference: Preference): Class<*> = preference.javaClass

    companion object {
        const val TAG = "CatalystScreenTestCase"

        fun dumpThreads() {
            for ((thread, stack) in Thread.getAllStackTraces()) {
                Log.i(TAG, "$thread")
                for (frame in stack) Log.i(TAG, "  $frame")
                Log.i(TAG, "")
            }
        }
    }
}
