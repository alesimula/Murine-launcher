package com.android.net.module.util;

public final class NetworkCapabilitiesUtils {
    public static final int TRANSPORT_USB = 8;
    private static final int[] DISPLAY_TRANSPORT_PRIORITIES = null;
    public static final int NET_CAPABILITY_OEM_PRIVATE = 26;
    public static final int NET_CAPABILITY_VEHICLE_INTERNAL = 27;
    public static final int NET_CAPABILITY_NOT_VCN_MANAGED = 28;
    public static final int NET_CAPABILITY_ENTERPRISE = 29;
    public static final int NET_CAPABILITY_VSIM = 30;
    public static final int NET_CAPABILITY_BIP = 31;
    static final long RESTRICTED_CAPABILITIES = -394262596L;
    private static final long FORCE_RESTRICTED_CAPABILITIES = 608174080L;
    static final long UNRESTRICTED_CAPABILITIES = 4163L;
    public NetworkCapabilitiesUtils() {}
    public static int getDisplayTransport(int[] p0) { return 0; }
    public static boolean inferRestrictedCapability(android.net.NetworkCapabilities p0) { return false; }
    public static int[] unpackBits(long p0) { return null; }
    public static long packBits(int[] p0) { return 0L; }
}
