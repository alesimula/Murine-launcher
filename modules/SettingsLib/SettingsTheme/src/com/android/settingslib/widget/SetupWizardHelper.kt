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

package com.android.settingslib.widget

import android.content.Intent
import android.os.Build

object SetupWizardHelper {

    private const val EXTRA_IS_SETUP_FLOW = "isSetupFlow"
    private const val EXTRA_IS_FIRST_RUN = "firstRun"
    private const val EXTRA_IS_PRE_DEFERRED_SETUP = "preDeferredSetup"
    private const val EXTRA_IS_DEFERRED_SETUP = "deferredSetup"

    /**
     * Checks if the current context is within any setup wizard flow.
     *
     * On Android Q and above, it checks for the presence of the [EXTRA_IS_SETUP_FLOW] intent extra.
     * On older versions, it checks for the presence of specific extras indicating initial,
     * pre-deferred, or deferred setup ([EXTRA_IS_FIRST_RUN], [EXTRA_IS_PRE_DEFERRED_SETUP],
     * [EXTRA_IS_DEFERRED_SETUP]).
     *
     * @param intent The intent to check.
     * @return True if within any setup wizard flow, false otherwise.
     */
    @JvmStatic
    fun isAnySetupWizard(intent: Intent?): Boolean {
        if (intent == null) {
            return false
        }

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            intent.getBooleanExtra(EXTRA_IS_SETUP_FLOW, false)
        } else {
            isLegacySetupWizard(intent)
        }
    }

    private fun isLegacySetupWizard(intent: Intent): Boolean {
        return intent.run {
            getBooleanExtra(EXTRA_IS_FIRST_RUN, false) ||
                    getBooleanExtra(EXTRA_IS_PRE_DEFERRED_SETUP, false) ||
                    getBooleanExtra(EXTRA_IS_DEFERRED_SETUP, false)
        }
    }
}