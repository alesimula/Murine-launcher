/*
 * Copyright (C) 2026
 * SPDX-License-Identifier: Apache-2.0
 */
package app.murinelauncher.backup

import java.io.File
import java.io.FileOutputStream
import java.io.IOException

internal class RestoreJournal(
    private val directory: File,
    private val targets: List<File>,
    private val syncDirectory: (File) -> Unit,
    private val move: (File, File) -> Unit,
) {
    private val state = File(directory, "state")
    private fun preservedOriginal(file: File) = File(file.path + ".restore-old")

    fun exists() = state.exists()
    fun phase() = state.readText()

    private fun transition(value: String) {
        write(File(directory, "state.tmp"), value.toByteArray())
        move(File(directory, "state.tmp"), state)
        syncDirectory(directory)
    }

    private fun write(file: File, bytes: ByteArray) {
        FileOutputStream(file).use { it.write(bytes); it.fd.sync() }
    }

    private fun ensureParent(file: File) {
        val parent = requireNotNull(file.parentFile)
        if (!parent.exists()) {
            if (!parent.mkdirs()) throw IOException("Cannot create restore directory")
            syncDirectory(requireNotNull(parent.parentFile))
        }
    }

    private fun copyAndSync(source: File, target: File) {
        ensureParent(target)
        val temp = File(target.path + ".restore-new")
        FileOutputStream(temp).use { output ->
            source.inputStream().use { it.copyTo(output) }
            output.fd.sync()
        }
        move(temp, target)
        syncDirectory(requireNotNull(target.parentFile))
    }

    private fun delete(file: File) {
        if (file.exists()) {
            if (!file.delete()) throw IOException("Cannot remove restore file")
            syncDirectory(requireNotNull(file.parentFile))
        }
    }

    fun install(replacements: Map<File, File>) {
        check(!exists())
        check(targets.none { preservedOriginal(it).exists() })
        check(replacements.keys.all { it in targets })
        write(File(directory, "present"), targets.joinToString("\n") {
            if (it.exists()) "1" else "0"
        }.toByteArray())
        syncDirectory(directory)
        transition("saving")
        targets.forEach { target ->
            if (target.exists()) {
                FileOutputStream(target, true).use { it.fd.sync() }
                move(target, preservedOriginal(target))
                syncDirectory(requireNotNull(target.parentFile))
            }
        }
        transition("installing")
        replacements.forEach { (target, source) -> copyAndSync(source, target) }
        transition("loading")
    }

    fun rollback() {
        val phase = phase()
        check(phase in listOf("saving", "installing", "loading", "rolled-back"))
        if (phase == "rolled-back") return
        val originallyPresent = File(directory, "present").readLines()
        check(originallyPresent.size == targets.size
                && originallyPresent.all { it == "0" || it == "1" })
        targets.forEachIndexed { index, target ->
            val saved = preservedOriginal(target)
            if (saved.exists()) {
                copyAndSync(saved, target)
            } else if (originallyPresent[index] == "0") {
                delete(target)
            } else if (phase != "saving" || !target.exists()) {
                throw IOException("Restore rollback source is missing")
            }
        }
        transition("rolled-back")
    }

    fun commit() {
        check(phase() == "loading")
        transition("committed")
    }

    fun cleanup() {
        check(phase() in listOf("committed", "rolled-back"))
        targets.forEach {
            delete(preservedOriginal(it))
            delete(File(it.path + ".restore-new"))
        }
    }
}
