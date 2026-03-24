package android.bluetooth;

public final class BluetoothLeAudioContentMetadata implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeAudioContentMetadata> CREATOR = null;
    BluetoothLeAudioContentMetadata() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getProgramInfo() { return null; }
    @android.annotation.Nullable
    public java.lang.String getLanguage() { return null; }
    @android.annotation.NonNull
    public byte[] getRawMetadata() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public static android.bluetooth.BluetoothLeAudioContentMetadata fromRawBytes(byte[] p0) { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothLeAudioContentMetadata p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioContentMetadata.Builder setProgramInfo(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioContentMetadata.Builder setLanguage(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioContentMetadata build() { return null; }
    }
}
