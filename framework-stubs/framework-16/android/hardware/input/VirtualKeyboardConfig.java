package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualKeyboardConfig extends android.hardware.input.VirtualInputDeviceConfig implements android.os.Parcelable {
    public static final java.lang.String DEFAULT_LANGUAGE_TAG = "en-Latn-US";
    public static final java.lang.String DEFAULT_LAYOUT_TYPE = "qwerty";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualKeyboardConfig> CREATOR = null;
    VirtualKeyboardConfig() { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    @android.annotation.NonNull
    public java.lang.String getLanguageTag() { return null; }
    @android.annotation.NonNull
    public java.lang.String getLayoutType() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    java.lang.String additionalFieldsToString() { return null; }

    public static final class Builder extends android.hardware.input.VirtualInputDeviceConfig.Builder<android.hardware.input.VirtualKeyboardConfig.Builder> {
        public Builder() { super(); }
        @android.annotation.NonNull
        public android.hardware.input.VirtualKeyboardConfig.Builder setLanguageTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualKeyboardConfig.Builder setLayoutType(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualKeyboardConfig build() { return null; }
    }
}
