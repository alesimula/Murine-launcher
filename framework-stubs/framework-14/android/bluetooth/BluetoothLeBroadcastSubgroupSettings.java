package android.bluetooth;

public final class BluetoothLeBroadcastSubgroupSettings implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeBroadcastSubgroupSettings> CREATOR = null;
    public static final int QUALITY_HIGH = 1;
    public static final int QUALITY_STANDARD = 0;
    BluetoothLeBroadcastSubgroupSettings() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothLeAudioContentMetadata getContentMetadata() { return null; }
    public int getPreferredQuality() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothLeBroadcastSubgroupSettings p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroupSettings.Builder setPreferredQuality(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroupSettings.Builder setContentMetadata(android.bluetooth.BluetoothLeAudioContentMetadata p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeBroadcastSubgroupSettings build() { return null; }
    }
}
