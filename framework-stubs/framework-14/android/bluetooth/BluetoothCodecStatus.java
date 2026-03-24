package android.bluetooth;

public final class BluetoothCodecStatus implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothCodecStatus> CREATOR = null;
    public static final java.lang.String EXTRA_CODEC_STATUS = "android.bluetooth.extra.CODEC_STATUS";
    BluetoothCodecStatus() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean isCodecConfigSelectable(android.bluetooth.BluetoothCodecConfig p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.Nullable
    public android.bluetooth.BluetoothCodecConfig getCodecConfig() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothCodecConfig> getCodecsLocalCapabilities() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothCodecConfig> getCodecsSelectableCapabilities() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecStatus.Builder setCodecConfig(android.bluetooth.BluetoothCodecConfig p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecStatus.Builder setCodecsLocalCapabilities(java.util.List<android.bluetooth.BluetoothCodecConfig> p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecStatus.Builder setCodecsSelectableCapabilities(java.util.List<android.bluetooth.BluetoothCodecConfig> p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecStatus build() { return null; }
    }
}
