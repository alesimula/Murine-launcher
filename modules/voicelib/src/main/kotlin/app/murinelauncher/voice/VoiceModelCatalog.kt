// SPDX-License-Identifier: Apache-2.0
package app.murinelauncher.voice

data class CatalogModel(
    val id: String,
    val size: ModelSize,
    val multilingual: Boolean,
    val downloadUrl: String,
    val bytes: Long,
    val sha256: String,
    val approxRamMb: Int,
) {
    val fileName: String get() = "$id.bin"
}

object VoiceModelCatalog {
    const val MODELS_PAGE = "https://keyboard.futo.tech/voice-input-models"
    const val LICENSE_PAGE = "https://huggingface.co/futo-org/acft-whisper-base"

    private const val BASE_URL = "https://keyboard.futo.org/voice-input-"

    val models: List<CatalogModel> = listOf(
        CatalogModel(
            "futo-english-39", ModelSize.TINY, false, "${BASE_URL}english-39.bin", 43_550_795L,
            "4b5480aa1b14a7efc5b578ef176510970a898049671c3cd237285b3e3f6bfbfc", 80,
        ),
        CatalogModel(
            "futo-english-74", ModelSize.BASE, false, "${BASE_URL}english-74.bin", 81_781_811L,
            "e9b4b7b81b8a28769e8aa9962aa39bb9f21b622cf6a63982e93f065ed5caf1c8", 130,
        ),
        CatalogModel(
            "futo-english-244", ModelSize.SMALL, false, "${BASE_URL}english-244.bin", 264_477_561L,
            "58fbe949992dafed917590d58bc12ca577b08b9957f0b3e0d7ee71b64bed3aa8", 350,
        ),
        CatalogModel(
            "futo-multilingual-39", ModelSize.TINY, true, "${BASE_URL}multilingual-39.bin", 43_537_450L,
            "07aa4d514144deacf5ffec5cacb36c93dee272fda9e64ac33a801f8cd5cbd953", 80,
        ),
        CatalogModel(
            "futo-multilingual-74", ModelSize.BASE, true, "${BASE_URL}multilingual-74.bin", 81_768_602L,
            "e44f352c9aa2c3609dece20c733c4ad4a75c28cd9ab07d005383df55fa96efc4", 130,
        ),
        CatalogModel(
            "futo-multilingual-244", ModelSize.SMALL, true, "${BASE_URL}multilingual-244.bin", 264_464_624L,
            "15ef255465a6dc582ecf1ec651a4618c7ee2c18c05570bbe46493d248d465ac4", 350,
        ),
    )

    val recommended: CatalogModel get() = models[1]

    fun byId(id: String): CatalogModel? = models.firstOrNull { it.id == id }

    fun bySha256(sha256: String): CatalogModel? =
        models.firstOrNull { it.sha256.equals(sha256, ignoreCase = true) }
}
