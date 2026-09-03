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
import android.os.Parcel
import android.os.Parcelable

/** Returns if the two bundles are equal (`null` values are ignored). */
@Suppress("DEPRECATION")
infix fun Bundle?.contentEquals(other: Bundle?): Boolean {
    if (this == null) return other == null
    if (other == null) return false
    // entry could have null value, so compare all keys
    val keys = keySet() + other.keySet()
    return keys.all { key -> get(key).valueEquals(other.get(key)) }
}

private fun Any?.valueEquals(other: Any?) =
    when (this) {
        is Bundle -> other is Bundle && contentEquals(other)
        is Intent -> other is Intent && filterEquals(other) && extras contentEquals other.extras
        is BooleanArray -> other is BooleanArray && this contentEquals other
        is ByteArray -> other is ByteArray && this contentEquals other
        is CharArray -> other is CharArray && this contentEquals other
        is DoubleArray -> other is DoubleArray && this contentEquals other
        is FloatArray -> other is FloatArray && this contentEquals other
        is IntArray -> other is IntArray && this contentEquals other
        is LongArray -> other is LongArray && this contentEquals other
        is ShortArray -> other is ShortArray && this contentEquals other
        is Array<*> -> other is Array<*> && this contentDeepEquals other
        else -> this == other
    }

/** Marshall a [Parcelable] to byte array. */
fun Parcelable.marshallParcel(): ByteArray = useParcel { parcel ->
    writeToParcel(parcel, 0)
    return@useParcel parcel.marshall()
}

/**
 * Unmarshall a byte array to [Bundle].
 *
 * Proper [ClassLoader] should be provided if needed (e.g. [Parcelable]) when read entry.
 */
fun ByteArray.unmarshallBundle(): Bundle = unmarshallParcel(Bundle.CREATOR)

/** Unmarshall a byte array to [Parcelable]. */
fun <T> ByteArray.unmarshallParcel(creator: Parcelable.Creator<T>): T = useParcel { parcel ->
    parcel.unmarshall(this, 0, size)
    parcel.setDataPosition(0)
    return@useParcel creator.createFromParcel(parcel)
}

/** Unmarshall a byte array to [Parcelable] with given class loader. */
inline fun <reified T> ByteArray.unmarshallParcel(
    creator: Parcelable.ClassLoaderCreator<T>,
    classLoader: ClassLoader,
): T = useParcel { parcel ->
    parcel.unmarshall(this, 0, size)
    parcel.setDataPosition(0)
    return@useParcel creator.createFromParcel(parcel, classLoader)
}

/**
 * Obtains a [Parcel] and performs an action.
 *
 * The parcel is ensured to be recycled when exception is thrown.
 */
fun <R> useParcel(block: (Parcel) -> R): R {
    val parcel = Parcel.obtain()
    try {
        return block(parcel)
    } finally {
        parcel.recycle()
    }
}
