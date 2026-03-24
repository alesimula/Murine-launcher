package android.net.wifi;

public final class SoftApConfToXmlMigrationUtil {
    private static final java.lang.String TAG = "SoftApConfToXmlMigrationUtil";
    private static final java.lang.String LEGACY_WIFI_STORE_DIRECTORY_NAME = "wifi";
    private static final java.lang.String LEGACY_AP_CONFIG_FILE = "softap.conf";
    private static final int WIFICONFIG_AP_BAND_2GHZ = 0;
    private static final int WIFICONFIG_AP_BAND_5GHZ = 1;
    private static final int WIFICONFIG_AP_BAND_ANY = -1;
    private static final int CONFIG_STORE_DATA_VERSION = 3;
    private static final java.lang.String XML_TAG_DOCUMENT_HEADER = "WifiConfigStoreData";
    private static final java.lang.String XML_TAG_VERSION = "Version";
    private static final java.lang.String XML_TAG_SECTION_HEADER_SOFTAP = "SoftAp";
    private static final java.lang.String XML_TAG_SSID = "SSID";
    private static final java.lang.String XML_TAG_BSSID = "Bssid";
    private static final java.lang.String XML_TAG_CHANNEL = "Channel";
    private static final java.lang.String XML_TAG_HIDDEN_SSID = "HiddenSSID";
    private static final java.lang.String XML_TAG_SECURITY_TYPE = "SecurityType";
    private static final java.lang.String XML_TAG_AP_BAND = "ApBand";
    private static final java.lang.String XML_TAG_PASSPHRASE = "Passphrase";
    private static final java.lang.String XML_TAG_MAX_NUMBER_OF_CLIENTS = "MaxNumberOfClients";
    private static final java.lang.String XML_TAG_AUTO_SHUTDOWN_ENABLED = "AutoShutdownEnabled";
    private static final java.lang.String XML_TAG_SHUTDOWN_TIMEOUT_MILLIS = "ShutdownTimeoutMillis";
    private static final java.lang.String XML_TAG_CLIENT_CONTROL_BY_USER = "ClientControlByUser";
    private static final java.lang.String XML_TAG_BLOCKED_CLIENT_LIST = "BlockedClientList";
    private static final java.lang.String XML_TAG_ALLOWED_CLIENT_LIST = "AllowedClientList";
    public static final java.lang.String XML_TAG_CLIENT_MACADDRESS = "ClientMacAddress";
    private static java.io.File getLegacyWifiSharedDirectory() { return null; }
    public static int convertWifiConfigBandToSoftApConfigBand(int p0) { return 0; }
    private static android.net.wifi.SoftApConfiguration loadFromLegacyFile(java.io.InputStream p0) { return null; }
    private static byte[] convertConfToXml(android.net.wifi.SoftApConfiguration p0) { return null; }
    private SoftApConfToXmlMigrationUtil() {}
    public static java.io.InputStream convert(java.io.InputStream p0) { return null; }
    public static java.io.InputStream convert() { return null; }
    public static void remove() {}
}
