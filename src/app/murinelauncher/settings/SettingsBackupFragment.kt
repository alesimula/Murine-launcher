/*
 * Copyright (C) 2026 The Murine Launcher Authors
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
package app.murinelauncher.settings

import android.app.AlertDialog
import android.net.Uri
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.preference.Preference
import app.murinelauncher.backup.LayoutBackup
import app.murinelauncher.settings.common.AbstractSettingsFragment
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.util.DisplayController

/**
 * Export the workspace to a zip, or import one back.
 *
 * The archive is the raw Launcher3 workspace database plus the shared
 * preferences file, so a Lawnchair `.lawnchairbackup` imports unchanged —
 * both launchers are Launcher3 forks and share the `favorites` schema.
 */
public final class SettingsBackupFragment : AbstractSettingsFragment() {

    companion object {
        const val PREF_EXPORT: String = "pref_layout_export"
        const val PREF_IMPORT: String = "pref_layout_import"

        private const val DEFAULT_NAME = "murine-layout.zip"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_backup

    override fun getPreferenceTitle(): Int? = R.string.pref_category_backup_title

    private val exportPicker = registerForActivityResult(
        ActivityResultContracts.CreateDocument("application/zip")
    ) { uri: Uri? ->
        if (uri == null) return@registerForActivityResult
        runCatching { LayoutBackup.export(requireContext(), uri) }
            .onSuccess { toast(getString(R.string.layout_export_done)) }
            .onFailure { toast(getString(R.string.layout_export_failed, it.message ?: "")) }
    }

    private val importPicker = registerForActivityResult(
        ActivityResultContracts.OpenDocument()
    ) { uri: Uri? ->
        if (uri == null) return@registerForActivityResult
        val summary = runCatching { LayoutBackup.stageImport(requireContext(), uri) }
            .getOrElse {
                toast(it.message ?: getString(R.string.layout_import_failed))
                return@registerForActivityResult
            }
        confirmImport(summary)
    }

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            PREF_EXPORT -> preference.setOnPreferenceClickListener {
                exportPicker.launch(DEFAULT_NAME)
                true
            }
            PREF_IMPORT -> preference.setOnPreferenceClickListener {
                // Deliberately unfiltered. A `.lawnchairbackup` is a zip, but its
                // extension resolves to no MIME type on most providers, so a
                // "application/zip" filter would hide the very file we want.
                importPicker.launch(arrayOf("*/*"))
                true
            }
        }
        return true
    }

    /**
     * Nothing has touched the live workspace yet — the archive sits in a staging
     * directory. Show the user what is in it before committing.
     */
    private fun confirmImport(summary: LayoutBackup.Summary) {
        val context = requireContext()
        val details = buildString {
            append(getString(R.string.layout_import_grid, summary.columns, summary.rows, summary.pages))
            append("\n")
            append(getString(
                R.string.layout_import_contents,
                summary.items, summary.folders, summary.widgets, summary.shortcuts,
            ))
            if (summary.customLabels > 0) {
                append("\n")
                append(getString(R.string.layout_import_labels, summary.customLabels))
            }
        }
        AlertDialog.Builder(context)
            .setTitle(R.string.layout_import_confirm_title)
            .setMessage(getString(R.string.layout_import_confirm_message, details))
            .setNegativeButton(android.R.string.cancel) { _, _ ->
                LayoutBackup.discardPendingImport(context)
            }
            .setOnCancelListener { LayoutBackup.discardPendingImport(context) }
            .setPositiveButton(R.string.layout_import_confirm_button) { _, _ ->
                // The staged database is applied from LauncherApplication.onCreate,
                // before anything opens the current one.
                LayoutBackup.commitPendingImport(context)
                toast(getString(R.string.layout_import_restarting))
                activity?.finish()
                Utilities.restart()
            }
            .show()
    }

    private fun toast(message: String) =
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
}
