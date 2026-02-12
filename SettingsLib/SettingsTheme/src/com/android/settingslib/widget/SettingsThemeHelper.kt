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

package com.android.settingslib.widget

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

object SettingsThemeHelper {
    private const val IS_EXPRESSIVE_DESIGN_ENABLED = "is_expressive_design_enabled"
    private const val RO_BUILD_CHARACTERISTICS = "ro.build.characteristics"

    @JvmStatic
    fun isTablet(context: Context): Boolean {
        val result = getPropString(context, RO_BUILD_CHARACTERISTICS, "").split(',')
        return result.contains("tablet")
    }

    @ChecksSdkIntAtLeast(Build.VERSION_CODES.BAKLAVA)
    @JvmStatic
    fun isExpressiveTheme(context: Context): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.BAKLAVA) {
            return false
        }
        // Enable if overridden by system property
        if (getPropBoolean(context, IS_EXPRESSIVE_DESIGN_ENABLED, false)) {
            return true
        }
        // Allow the activity to override.
        val activity = getActivityFromContext(context)
        if (activity is ExpressiveDesignEnabledProvider) {
            return activity.isExpressiveDesignEnabled()
        }
        return isExpressiveDesignEnabled()
    }

    @JvmStatic
    fun isExpressiveDesignEnabled(): Boolean {
        return true
    }

    private fun getActivityFromContext(context: Context): Activity? {
        var currentContext = context
        while (true) {
            when (currentContext) {
                is Activity -> return currentContext
                is ContextWrapper -> currentContext = currentContext.baseContext
                else -> return null
            }
        }
    }

    private fun getPropBoolean(context: Context, property: String, def: Boolean): Boolean {
        return try {
            val systemProperties = context.classLoader.loadClass("android.os.SystemProperties")

            val paramTypes =
                arrayOf<Class<*>?>(String::class.java, Boolean::class.javaPrimitiveType)
            val getBoolean = systemProperties.getMethod("getBoolean", *paramTypes)

            val params = arrayOf<Any>(property, def)
            getBoolean.invoke(systemProperties, *params) as Boolean
        } catch (iae: IllegalArgumentException) {
            throw iae
        } catch (exception: Exception) {
            def
        }
    }

    private fun getPropString(context: Context, property: String, def: String): String {
        return try {
            val systemProperties = context.classLoader.loadClass("android.os.SystemProperties")

            val paramTypes =
                arrayOf<Class<*>?>(String::class.java, String::class.java)
            val get = systemProperties.getMethod("get", *paramTypes)
            get.invoke(systemProperties, property, def) as String
        } catch (iae: IllegalArgumentException) {
            throw iae
        } catch (exception: Exception) {
            def
        }
    }
}
