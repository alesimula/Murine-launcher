package android.hardware.biometrics;

public final class PromptContentViewWithMoreOptionsButton implements android.hardware.biometrics.PromptContentViewParcelable {
    static final int MAX_DESCRIPTION_CHARACTER_NUMBER = 225;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.PromptContentViewWithMoreOptionsButton> CREATOR = null;
    @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
    @android.annotation.Nullable
    public java.lang.String getDescription() { return null; }
    @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
    @android.annotation.NonNull
    public android.content.DialogInterface.OnClickListener getMoreOptionsButtonListener() { return null; }
    android.hardware.biometrics.BiometricPrompt.ButtonInfo getButtonInfo() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder setDescription(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton.Builder setMoreOptionsButtonListener(java.util.concurrent.Executor p0, android.content.DialogInterface.OnClickListener p1) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
        public android.hardware.biometrics.PromptContentViewWithMoreOptionsButton build() { return null; }
    }
}
