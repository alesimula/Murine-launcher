package android.bluetooth;

public final class BluetoothLeAudioCodecConfigMetadata implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeAudioCodecConfigMetadata> CREATOR = null;
    BluetoothLeAudioCodecConfigMetadata() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.bluetooth.BluetoothLeAudioCodecConfigMetadata fromRawBytes(byte[] p0) { return null; }
    public long getAudioLocation() { return 0L; }
    public int getFrameDuration() { return 0; }
    public int getOctetsPerFrame() { return 0; }
    @android.annotation.NonNull
    public byte[] getRawMetadata() { return null; }
    public int getSampleRate() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothLeAudioCodecConfigMetadata p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfigMetadata build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfigMetadata.Builder setAudioLocation(long p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfigMetadata.Builder setFrameDuration(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfigMetadata.Builder setOctetsPerFrame(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfigMetadata.Builder setSampleRate(int p0) { return null; }
    }
}
