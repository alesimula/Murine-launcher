/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.content.Context
import android.text.InputFilter
import android.widget.EditText
import android.widget.ArrayAdapter
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import com.android.launcher3.R
import com.android.launcher3.model.data.AppInfo
import android.app.AlertDialog
import androidx.appcompat.content.res.AppCompatResources

/** Editing UI shared by drawer tabs, app shortcuts, and launcher settings. */
object CategoryDialogs {
    @JvmStatic
    fun manage(context: Context, repository: CategoryRepository) {
        val categories = repository.state().categories.toList()
        AlertDialog.Builder(context)
            .setTitle(R.string.drawer_manage_categories)
            .setItems(categories.map(repository::title).toTypedArray()) { _, index ->
                edit(context, repository, categories[index].id)
            }
            .setPositiveButton(R.string.drawer_category_create) { _, _ ->
                name(context, repository, null)
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    @JvmStatic
    fun assign(context: Context, repository: CategoryRepository, app: AppInfo) {
        val categories = repository.state().categories.toList()
        val current = categories.indexOfFirst { it.id == repository.categoryFor(app) }
        AlertDialog.Builder(context)
            .setTitle(context.getString(R.string.drawer_category_move_app, app.title))
            .setSingleChoiceItems(categories.map(repository::title).toTypedArray(), current) { dialog, index ->
                repository.edit { it.assign(repository.key(app), categories[index].id) }
                dialog.dismiss()
            }
            .setNeutralButton(R.string.drawer_category_automatic) { _, _ ->
                repository.edit { it.assignments.remove(repository.key(app)) }
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    fun edit(context: Context, repository: CategoryRepository, id: String) {
        val category = repository.state().categories.firstOrNull { it.id == id } ?: return
        val actions = mutableListOf(
            R.string.drawer_category_rename,
            R.string.drawer_category_icon,
            R.string.drawer_category_move_earlier,
            R.string.drawer_category_move_later,
        )
        if (id != CategoryState.OTHER) actions.add(R.string.drawer_category_delete)
        AlertDialog.Builder(context)
            .setTitle(repository.title(category))
            .setItems(actions.map(context::getString).toTypedArray()) { _, index ->
                when (actions[index]) {
                    R.string.drawer_category_rename -> name(context, repository, id)
                    R.string.drawer_category_icon -> icon(context, repository, id)
                    R.string.drawer_category_move_earlier -> repository.edit { it.move(id, -1) }
                    R.string.drawer_category_move_later -> repository.edit { it.move(id, 1) }
                    R.string.drawer_category_delete -> AlertDialog.Builder(context)
                        .setTitle(R.string.drawer_category_delete)
                        .setMessage(R.string.drawer_category_delete_message)
                        .setPositiveButton(android.R.string.ok) { _, _ ->
                            repository.edit { it.delete(id) }
                        }
                        .setNegativeButton(android.R.string.cancel, null)
                        .show()
                }
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    private fun icon(context: Context, repository: CategoryRepository, id: String) {
        val icons = CategoryState.ICON_IDS
        val labels = icons.map { context.getString(CategoryIcons.label(it)) }
        val adapter = object : ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, labels) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                return (super.getView(position, convertView, parent) as TextView).apply {
                    val icon = AppCompatResources.getDrawable(context, CategoryIcons.drawable(icons[position]))!!.mutate()
                    val size = (24 * resources.displayMetrics.density).toInt()
                    icon.setBounds(0, 0, size, size)
                    icon.setTint(currentTextColor)
                    setCompoundDrawablesRelative(icon, null, null, null)
                    compoundDrawablePadding = (16 * resources.displayMetrics.density).toInt()
                }
            }
        }
        AlertDialog.Builder(context)
            .setTitle(R.string.drawer_category_icon)
            .setAdapter(adapter) { _, position ->
                repository.edit { it.setIcon(id, icons[position]) }
            }
            .setNegativeButton(android.R.string.cancel, null)
            .show()
    }

    private fun name(context: Context, repository: CategoryRepository, id: String?) {
        val input = EditText(context).apply {
            setSingleLine()
            filters = arrayOf(InputFilter.LengthFilter(64))
            hint = context.getString(R.string.drawer_category_name)
            if (id != null) {
                repository.state().categories.firstOrNull { it.id == id }?.let {
                    setText(repository.title(it))
                    selectAll()
                }
            }
        }
        val dialog = AlertDialog.Builder(context)
            .setTitle(if (id == null) R.string.drawer_category_create else R.string.drawer_category_rename)
            .setView(input)
            .setPositiveButton(android.R.string.ok, null)
            .setNegativeButton(android.R.string.cancel, null)
            .create()
        dialog.setOnShowListener {
            dialog.getButton(android.content.DialogInterface.BUTTON_POSITIVE).setOnClickListener {
                val name = input.text.toString().trim()
                if (name.isBlank() || repository.state().categories.any {
                        it.id != id && repository.title(it).equals(name, ignoreCase = true)
                    }) {
                    input.error = context.getString(R.string.drawer_category_name_error)
                } else {
                    repository.edit { if (id == null) it.create(name) else it.rename(id, name) }
                    dialog.dismiss()
                }
            }
        }
        dialog.show()
    }
}
