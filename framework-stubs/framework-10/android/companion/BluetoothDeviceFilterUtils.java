package android.companion;

public class BluetoothDeviceFilterUtils {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = "BluetoothDeviceFilterUtils";
    private BluetoothDeviceFilterUtils() {}
    static java.lang.String patternToString(java.util.regex.Pattern p0) { return null; }
    static java.util.regex.Pattern patternFromString(java.lang.String p0) { return null; }
    static boolean matches(android.bluetooth.le.ScanFilter p0, android.bluetooth.BluetoothDevice p1) { return false; }
    static boolean matchesAddress(java.lang.String p0, android.bluetooth.BluetoothDevice p1) { return false; }
    static boolean matchesServiceUuids(java.util.List<android.os.ParcelUuid> p0, java.util.List<android.os.ParcelUuid> p1, android.bluetooth.BluetoothDevice p2) { return false; }
    static boolean matchesServiceUuid(android.os.ParcelUuid p0, android.os.ParcelUuid p1, android.bluetooth.BluetoothDevice p2) { return false; }
    static boolean matchesName(java.util.regex.Pattern p0, android.bluetooth.BluetoothDevice p1) { return false; }
    static boolean matchesName(java.util.regex.Pattern p0, android.net.wifi.ScanResult p1) { return false; }
    private static void debugLogMatchResult(boolean p0, android.bluetooth.BluetoothDevice p1, java.lang.Object p2) {}
    private static void debugLogMatchResult(boolean p0, android.net.wifi.ScanResult p1, java.lang.Object p2) {}
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getDeviceDisplayNameInternal(android.bluetooth.BluetoothDevice p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getDeviceDisplayNameInternal(android.net.wifi.ScanResult p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getDeviceMacAddress(android.os.Parcelable p0) { return null; }
}
