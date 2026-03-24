package android.bluetooth;

@android.annotation.SystemApi
public final class BluetoothUuid {
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid A2DP_SINK = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid A2DP_SOURCE = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid ADV_AUDIO_DIST = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid HSP = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid HSP_AG = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid HFP = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid HFP_AG = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid AVRCP_CONTROLLER = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid AVRCP_TARGET = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid OBEX_OBJECT_PUSH = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid HID = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid HOGP = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid PANU = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid NAP = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid BNEP = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid PBAP_PCE = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid PBAP_PSE = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid MAP = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid MNS = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid MAS = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid SAP = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid HEARING_AID = null;
    @android.annotation.SystemApi
    public static final android.os.ParcelUuid BASE_UUID = null;
    @android.annotation.SystemApi
    public static final int UUID_BYTES_16_BIT = 2;
    @android.annotation.SystemApi
    public static final int UUID_BYTES_32_BIT = 4;
    @android.annotation.SystemApi
    public static final int UUID_BYTES_128_BIT = 16;
    @android.annotation.SystemApi
    public static boolean containsAnyUuid(android.os.ParcelUuid[] p0, android.os.ParcelUuid[] p1) { return false; }
    private static int getServiceIdentifierFromParcelUuid(android.os.ParcelUuid p0) { return 0; }
    @android.annotation.SystemApi
    public static android.os.ParcelUuid parseUuidFrom(byte[] p0) { return null; }
    public static byte[] uuidToBytes(android.os.ParcelUuid p0) { return null; }
    public static boolean is16BitUuid(android.os.ParcelUuid p0) { return false; }
    public static boolean is32BitUuid(android.os.ParcelUuid p0) { return false; }
    private BluetoothUuid() {}
}
