package android.bluetooth;

public final class BluetoothCodecStatus implements android.os.Parcelable {
    public static final java.lang.String EXTRA_CODEC_STATUS = "android.bluetooth.extra.CODEC_STATUS";
    private final android.bluetooth.BluetoothCodecConfig mCodecConfig = null;
    private final android.bluetooth.BluetoothCodecConfig[] mCodecsLocalCapabilities = null;
    private final android.bluetooth.BluetoothCodecConfig[] mCodecsSelectableCapabilities = null;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothCodecStatus> CREATOR = null;
    public BluetoothCodecStatus(android.bluetooth.BluetoothCodecConfig p0, android.bluetooth.BluetoothCodecConfig[] p1, android.bluetooth.BluetoothCodecConfig[] p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public static boolean sameCapabilities(android.bluetooth.BluetoothCodecConfig[] p0, android.bluetooth.BluetoothCodecConfig[] p1) { return false; }
    public boolean isCodecConfigSelectable(android.bluetooth.BluetoothCodecConfig p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.bluetooth.BluetoothCodecConfig getCodecConfig() { return null; }
    public android.bluetooth.BluetoothCodecConfig[] getCodecsLocalCapabilities() { return null; }
    public android.bluetooth.BluetoothCodecConfig[] getCodecsSelectableCapabilities() { return null; }
}
