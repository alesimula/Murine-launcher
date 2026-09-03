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

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.os.Process
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.parcelableCreator
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BundlesTest {

    @Test
    fun bundle_marshall_unmarshall() {
        val userHandle = Process.myUserHandle()
        val bundle =
            Bundle().apply {
                putString("nullString", null)
                putString("string", "string")
                putByteArray("bytes", byteArrayOf(1))
                putInt("int", 1)
                putLong("long", 2)
                putBoolean("boolean", true)
                putDouble("double", 3.0)
                putFloat("float", 4f)
                putParcelable(Intent.EXTRA_USER, userHandle)
                putParcelable("foo", Foo("foo"))
                putParcelable("bar", Bar("bar"))
            }
        val result = bundle.marshallParcel().unmarshallBundle()
        result.classLoader = Foo::class.java.classLoader
        @Suppress("DEPRECATION") val foo = result.getParcelable<Foo>("foo")!!
        assertThat(foo.name).isEqualTo("foo")
        result.classLoader = Bar::class.java.classLoader
        assertThat(bundle contentEquals result).isTrue()
    }

    @Test
    fun marshallParcel_unmarshallParcel() {
        val parcelable = Foo("foo")
        val result = parcelable.marshallParcel().unmarshallParcel(parcelableCreator<Foo>())
        assertThat(result).isEqualTo(parcelable)
    }

    @Parcelize data class Foo(val name: String) : Parcelable

    @Parcelize data class Bar(val name: String) : Parcelable
}
