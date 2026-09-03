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
import android.os.Bundle
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.android.settingslib.preference.PreferenceFragment
import com.android.settingslib.preference.PreferenceScreenCreator
import com.android.settingslib.preference.launchFragmentScenario
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.flowOf
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PreferenceScreenMetadataTest {

    @Test
    fun isContainer_isEntryPoint() {
        val innerScreen = Screen("Screen2")
        val screen =
            object : Screen("Screen1") {
                override fun getPreferenceHierarchy(
                    context: Context,
                    coroutineScope: CoroutineScope,
                ) = preferenceHierarchy(context) { +innerScreen.key }
            }
        PreferenceScreenRegistry.preferenceScreenMetadataFactories =
            FixedArrayMap(2) {
                it.put(screen.key) { screen }
                it.put(innerScreen.key) { innerScreen }
            }
        screen
            .launchFragmentScenario()
            .onFragment {
                val context = screen.preferenceLifecycleContext
                assertThat(screen.isContainer(context)).isTrue()
                assertThat(screen.isEntryPoint(context)).isFalse()
                assertThat(innerScreen.isContainer(context)).isFalse()
                assertThat(innerScreen.isEntryPoint(context)).isTrue()
            }
            .close()
    }

    @Test
    fun isContainer_isEntryPoint_parameterizedScreen() {
        val innerScreen =
            object : Screen("Screen2", 0.toArgument()) {
                override val bindingKey
                    get() = "screen2:0"
            }
        val screen =
            object : Screen("Screen1", 0.toArgument()) {
                override val bindingKey
                    get() = "screen1:0"

                override fun getPreferenceHierarchy(
                    context: Context,
                    coroutineScope: CoroutineScope,
                ) = preferenceHierarchy(context) { +(innerScreen.key args 0.toArgument()) }
            }
        PreferenceScreenRegistry.preferenceScreenMetadataFactories =
            FixedArrayMap(2) {
                it.put(
                    screen.key,
                    object : PreferenceScreenMetadataParameterizedFactory {
                        override fun create(context: Context, args: Bundle) = screen

                        override fun parameters(context: Context) = flowOf(0.toArgument())
                    },
                )
                it.put(
                    innerScreen.key,
                    object : PreferenceScreenMetadataParameterizedFactory {
                        override fun create(context: Context, args: Bundle) = innerScreen

                        override fun parameters(context: Context) = flowOf(0.toArgument())
                    },
                )
            }
        screen
            .launchFragmentScenario()
            .onFragment {
                val context = screen.preferenceLifecycleContext
                assertThat(screen.isContainer(context)).isTrue()
                assertThat(screen.isEntryPoint(context)).isFalse()
                assertThat(innerScreen.isContainer(context)).isFalse()
                assertThat(innerScreen.isEntryPoint(context)).isTrue()
            }
            .close()
    }

    fun Int.toArgument() = Bundle().also { it.putInt(null, this) }

    open class Screen(override val key: String, override val arguments: Bundle? = null) :
        PreferenceScreenCreator, PreferenceLifecycleProvider {

        lateinit var preferenceLifecycleContext: PreferenceLifecycleContext

        override fun fragmentClass() = PreferenceFragment::class.java

        override fun onCreate(context: PreferenceLifecycleContext) {
            preferenceLifecycleContext = context
        }

        override fun getPreferenceHierarchy(context: Context, coroutineScope: CoroutineScope) =
            preferenceHierarchy(context) {}
    }
}
