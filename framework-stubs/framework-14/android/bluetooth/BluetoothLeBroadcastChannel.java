package android.bluetooth;

public final class BluetoothLeBroadcastChannel implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeBroadcastChannel> CREATOR = null;
    BluetoothLeBroadcastChannel() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isSelected() { return false; }
    public int getChannelIndex() { return 0; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothLeAudioCodecConfigMetadata getCodecMetadata() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothLeBroadcastChannel p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastChannel.Builder setSelected(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastChannel.Builder setChannelIndex(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastChannel.Builder setCodecMetadata(android.bluetooth.BluetoothLeAudioCodecConfigMetadata p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastChannel build() { return null; }
    }
}
