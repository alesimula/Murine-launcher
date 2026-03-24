package android.hardware.biometrics;

@android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
sealed interface PromptContentViewParcelable extends android.hardware.biometrics.PromptContentView, android.os.Parcelable permits PromptVerticalListContentView, PromptContentViewWithMoreOptionsButton {
}
