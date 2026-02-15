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
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.function.Consumer
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking

@RunWith(AndroidJUnit4::class)
class PreferenceScreenRegistryTest {

    private val context: Context = ApplicationProvider.getApplicationContext()
    private val screenKey = "screen_key"
    private val notAScreenKey = "not_a_screen_key"


    @Before
    fun setUp() {
        PreferenceScreenRegistry.preferenceScreenMetadataFactories = FixedArrayMap()
    }

    private fun setMetadataFactory(screenKey: String, factory: PreferenceScreenMetadataFactory) {
        PreferenceScreenRegistry.preferenceScreenMetadataFactories = FixedArrayMap(1, Consumer { initializer ->
            initializer.put(screenKey, factory)
        })
    }

    @Test
    fun isParameterized_screenIsParameterized_returnsTrue() {
        setMetadataFactory(screenKey, object : PreferenceScreenMetadataParameterizedFactory {
            override fun create(context: Context, args: Bundle) = error("A")
            override fun parameters(context: Context) = error("A")
        })

        val result = PreferenceScreenRegistry.isParameterized(context, screenKey)

        assertThat(result).isTrue()
    }

    @Test
    fun isParameterized_screenIsNotParameterized_returnsFalse() {
        setMetadataFactory(screenKey, object : PreferenceScreenMetadataFactory {
            override fun create(context: Context) = error("A")
        })

        val result = PreferenceScreenRegistry.isParameterized(context, screenKey)

        assertThat(result).isFalse()
    }

    @Test
    fun isParameterized_screenKeyNotFound_returnsFalse() {
        val result = PreferenceScreenRegistry.isParameterized(context, notAScreenKey)

        assertThat(result).isFalse()
    }

    @Test
    fun getParameters_screenIsParameterized_returnsParameters() {
        runBlocking {
            val flow = flowOf(Bundle().apply { putString("key", "value") })
            setMetadataFactory(screenKey, object : PreferenceScreenMetadataParameterizedFactory {
                override fun create(context: Context, args: Bundle) = error("A")
                override fun parameters(context: Context) = flow
            })

            val parameters = PreferenceScreenRegistry.getParameters(context, screenKey)
            val parametersList = parameters.toList()

            assertThat(parametersList).hasSize(1)
            assertThat(parametersList.get(0).getString("key")).isEqualTo("value")
        }
    }

    @Test
    fun getParameters_screenIsNotParameterized_returnsEmptyFlow() {
        runBlocking {
            setMetadataFactory(screenKey, object : PreferenceScreenMetadataFactory {
                override fun create(context: Context) = error("A")
            })

            val parameters = PreferenceScreenRegistry.getParameters(context, screenKey)
            val parametersList = parameters.toList()

            assertThat(parametersList).isEmpty()
        }
    }

    @Test
    fun getParameters_screenKeyNotFound_returnsEmptyFlow() {
        runBlocking {
            val parameters = PreferenceScreenRegistry.getParameters(context, screenKey)
            val parametersList = parameters.toList()

            assertThat(parametersList).isEmpty()
        }
    }
}