package android.bluetooth;

public final class BluetoothLeAudioCodecStatus implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeAudioCodecStatus> CREATOR = null;
    public static final java.lang.String EXTRA_LE_AUDIO_CODEC_STATUS = "android.bluetooth.extra.LE_AUDIO_CODEC_STATUS";
    public BluetoothLeAudioCodecStatus(android.bluetooth.BluetoothLeAudioCodecConfig p0, android.bluetooth.BluetoothLeAudioCodecConfig p1, java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> p2, java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> p3, java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> p4, java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> p5) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean isInputCodecConfigSelectable(android.bluetooth.BluetoothLeAudioCodecConfig p0) { return false; }
    public boolean isOutputCodecConfigSelectable(android.bluetooth.BluetoothLeAudioCodecConfig p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.Nullable
    public android.bluetooth.BluetoothLeAudioCodecConfig getInputCodecConfig() { return null; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothLeAudioCodecConfig getOutputCodecConfig() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> getInputCodecLocalCapabilities() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> getOutputCodecLocalCapabilities() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> getInputCodecSelectableCapabilities() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.bluetooth.BluetoothLeAudioCodecConfig> getOutputCodecSelectableCapabilities() { return null; }
}
