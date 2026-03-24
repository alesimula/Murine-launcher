package android.hardware.biometrics;

sealed interface PromptContentViewParcelable extends android.hardware.biometrics.PromptContentView, android.os.Parcelable permits PromptVerticalListContentView, PromptContentViewWithMoreOptionsButton {
}
