package android.bluetooth;

public final class BluetoothLeBroadcastSettings implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeBroadcastSettings> CREATOR = null;
    BluetoothLeBroadcastSettings() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public byte[] getBroadcastCode() { return null; }
    @android.annotation.Nullable
    public java.lang.String getBroadcastName() { return null; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothLeAudioContentMetadata getPublicBroadcastMetadata() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeBroadcastSubgroupSettings> getSubgroupSettings() { return null; }
    public boolean isPublicBroadcast() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothLeBroadcastSettings p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSettings.Builder addSubgroupSettings(android.bluetooth.BluetoothLeBroadcastSubgroupSettings p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSettings build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSettings.Builder clearSubgroupSettings() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSettings.Builder setBroadcastCode(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSettings.Builder setBroadcastName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSettings.Builder setPublicBroadcast(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSettings.Builder setPublicBroadcastMetadata(android.bluetooth.BluetoothLeAudioContentMetadata p0) { return null; }
    }
}
