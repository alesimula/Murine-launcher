package android.bluetooth;

public final class BluetoothUuid {
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static final android.os.ParcelUuid AudioSink = null;
    public static final android.os.ParcelUuid AudioSource = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static final android.os.ParcelUuid AdvAudioDist = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static final android.os.ParcelUuid HSP = null;
    public static final android.os.ParcelUuid HSP_AG = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static final android.os.ParcelUuid Handsfree = null;
    public static final android.os.ParcelUuid Handsfree_AG = null;
    public static final android.os.ParcelUuid AvrcpController = null;
    public static final android.os.ParcelUuid AvrcpTarget = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.ParcelUuid ObexObjectPush = null;
    public static final android.os.ParcelUuid Hid = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.ParcelUuid Hogp = null;
    public static final android.os.ParcelUuid PANU = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.ParcelUuid NAP = null;
    public static final android.os.ParcelUuid BNEP = null;
    public static final android.os.ParcelUuid PBAP_PCE = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.ParcelUuid PBAP_PSE = null;
    public static final android.os.ParcelUuid MAP = null;
    public static final android.os.ParcelUuid MNS = null;
    public static final android.os.ParcelUuid MAS = null;
    public static final android.os.ParcelUuid SAP = null;
    public static final android.os.ParcelUuid HearingAid = null;
    public static final android.os.ParcelUuid BASE_UUID = null;
    public static final int UUID_BYTES_16_BIT = 2;
    public static final int UUID_BYTES_32_BIT = 4;
    public static final int UUID_BYTES_128_BIT = 16;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.ParcelUuid[] RESERVED_UUIDS = null;
    public BluetoothUuid() {}
    @android.annotation.UnsupportedAppUsage
    public static boolean isAudioSource(android.os.ParcelUuid p0) { return false; }
    public static boolean isAudioSink(android.os.ParcelUuid p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isAdvAudioDist(android.os.ParcelUuid p0) { return false; }
    public static boolean isHandsfree(android.os.ParcelUuid p0) { return false; }
    public static boolean isHeadset(android.os.ParcelUuid p0) { return false; }
    public static boolean isAvrcpController(android.os.ParcelUuid p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isAvrcpTarget(android.os.ParcelUuid p0) { return false; }
    public static boolean isInputDevice(android.os.ParcelUuid p0) { return false; }
    public static boolean isPanu(android.os.ParcelUuid p0) { return false; }
    public static boolean isNap(android.os.ParcelUuid p0) { return false; }
    public static boolean isBnep(android.os.ParcelUuid p0) { return false; }
    public static boolean isMap(android.os.ParcelUuid p0) { return false; }
    public static boolean isMns(android.os.ParcelUuid p0) { return false; }
    public static boolean isMas(android.os.ParcelUuid p0) { return false; }
    public static boolean isSap(android.os.ParcelUuid p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isUuidPresent(android.os.ParcelUuid[] p0, android.os.ParcelUuid p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean containsAnyUuid(android.os.ParcelUuid[] p0, android.os.ParcelUuid[] p1) { return false; }
    public static boolean containsAllUuids(android.os.ParcelUuid[] p0, android.os.ParcelUuid[] p1) { return false; }
    public static int getServiceIdentifierFromParcelUuid(android.os.ParcelUuid p0) { return 0; }
    public static android.os.ParcelUuid parseUuidFrom(byte[] p0) { return null; }
    public static byte[] uuidToBytes(android.os.ParcelUuid p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static boolean is16BitUuid(android.os.ParcelUuid p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean is32BitUuid(android.os.ParcelUuid p0) { return false; }
}
