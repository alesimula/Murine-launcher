package com.android.internal.telephony;

public final class TelephonyPermissions {
    private static final java.lang.String LOG_TAG = "TelephonyPermissions";
    private static final boolean DBG = false;
    private static final java.lang.String PROPERTY_DEVICE_IDENTIFIER_ACCESS_RESTRICTIONS_DISABLED = "device_identifier_access_restrictions_disabled";
    private static final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> sReportedDeviceIDPackages = null;
    private TelephonyPermissions() {}
    public static boolean checkCallingOrSelfReadPhoneState(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkCallingOrSelfReadPhoneStateNoThrow(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkReadPhoneState(android.content.Context p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return false; }
    public static boolean checkCarrierPrivilegeForSubId(android.content.Context p0, int p1) { return false; }
    public static boolean checkReadPhoneStateOnAnyActiveSub(android.content.Context p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) { return false; }
    public static boolean checkCallingOrSelfReadDeviceIdentifiers(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return false; }
    public static boolean checkCallingOrSelfReadDeviceIdentifiers(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkCallingOrSelfReadSubscriberIdentifiers(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    private static boolean checkPrivilegedReadPermissionOrCarrierPrivilegePermission(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5) { return false; }
    private static boolean reportAccessDeniedToReadIdentifiers(android.content.Context p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5) { return false; }
    public static boolean checkReadCallLog(android.content.Context p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5) { return false; }
    public static boolean checkCallingOrSelfReadPhoneNumber(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkReadPhoneNumber(android.content.Context p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return false; }
    public static void enforceCallingOrSelfModifyPermissionOrCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void enforeceCallingOrSelfReadPhoneStatePermissionOrCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void enforeceCallingOrSelfReadPrivilegedPhoneStatePermissionOrCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void enforeceCallingOrSelfReadPrecisePhoneStatePermissionOrCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void enforceCallingOrSelfCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    private static void enforceCarrierPrivilege(android.content.Context p0, int p1, int p2, java.lang.String p3) {}
    private static boolean checkCarrierPrivilegeForAnySubId(android.content.Context p0, int p1) { return false; }
    private static int getCarrierPrivilegeStatus(android.content.Context p0, int p1, int p2) { return 0; }
    public static void enforceShellOnly(int p0, java.lang.String p1) {}
}
