package android.hardware.biometrics;

sealed interface PromptContentItemParcelable extends android.hardware.biometrics.PromptContentItem, android.os.Parcelable permits PromptContentItemPlainText, PromptContentItemBulletedText {
}
