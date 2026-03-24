package android.bluetooth;

public final class BluetoothLeBroadcastMetadata implements android.os.Parcelable {
    public static final int AUDIO_CONFIG_QUALITY_HIGH = 2;
    public static final int AUDIO_CONFIG_QUALITY_NONE = 0;
    public static final int AUDIO_CONFIG_QUALITY_STANDARD = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeBroadcastMetadata> CREATOR = null;
    public static final int PA_SYNC_INTERVAL_UNKNOWN = 65535;
    BluetoothLeBroadcastMetadata() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int getSourceAddressType() { return 0; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothDevice getSourceDevice() { return null; }
    public int getSourceAdvertisingSid() { return 0; }
    public int getBroadcastId() { return 0; }
    public int getPaSyncInterval() { return 0; }
    public boolean isEncrypted() { return false; }
    public boolean isPublicBroadcast() { return false; }
    @android.annotation.Nullable
    public java.lang.String getBroadcastName() { return null; }
    @android.annotation.Nullable
    public byte[] getBroadcastCode() { return null; }
    public int getPresentationDelayMicros() { return 0; }
    public int getAudioConfigQuality() { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothLeAudioContentMetadata getPublicBroadcastMetadata() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeBroadcastSubgroup> getSubgroups() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothLeBroadcastMetadata p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setSourceDevice(android.bluetooth.BluetoothDevice p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setSourceAdvertisingSid(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setBroadcastId(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setPaSyncInterval(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setEncrypted(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setPublicBroadcast(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setBroadcastName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setBroadcastCode(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setPresentationDelayMicros(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setAudioConfigQuality(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder setPublicBroadcastMetadata(android.bluetooth.BluetoothLeAudioContentMetadata p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder addSubgroup(android.bluetooth.BluetoothLeBroadcastSubgroup p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata.Builder clearSubgroup() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastMetadata build() { return null; }
    }
}
