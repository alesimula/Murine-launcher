package android.bluetooth;

public final class BluetoothLeBroadcastSubgroup implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeBroadcastSubgroup> CREATOR = null;
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public long getCodecId() { return 0L; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothLeAudioCodecConfigMetadata getCodecSpecificConfig() { return null; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothLeAudioContentMetadata getContentMetadata() { return null; }
    public boolean hasChannelPreference() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeBroadcastChannel> getChannels() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothLeBroadcastSubgroup p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroup.Builder setCodecId(long p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroup.Builder setCodecSpecificConfig(android.bluetooth.BluetoothLeAudioCodecConfigMetadata p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroup.Builder setContentMetadata(android.bluetooth.BluetoothLeAudioContentMetadata p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroup.Builder addChannel(android.bluetooth.BluetoothLeBroadcastChannel p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroup.Builder clearChannel() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroup build() { return null; }
    }
}
