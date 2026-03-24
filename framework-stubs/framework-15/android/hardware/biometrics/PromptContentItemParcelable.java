package android.hardware.biometrics;

@android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
sealed interface PromptContentItemParcelable extends android.hardware.biometrics.PromptContentItem, android.os.Parcelable permits PromptContentItemPlainText, PromptContentItemBulletedText {
}
