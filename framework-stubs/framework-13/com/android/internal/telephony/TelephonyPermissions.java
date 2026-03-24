package com.android.internal.telephony;

public final class TelephonyPermissions {
    public static boolean checkCallingOrSelfReadPhoneState(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkCallingOrSelfReadPhoneStateNoThrow(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkCallingOrSelfReadNonDangerousPhoneStateNoThrow(android.content.Context p0, java.lang.String p1) { return false; }
    public static boolean checkReadPhoneState(android.content.Context p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return false; }
    public static boolean checkCarrierPrivilegeForSubId(android.content.Context p0, int p1) { return false; }
    public static boolean checkReadPhoneStateOnAnyActiveSub(android.content.Context p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) { return false; }
    public static boolean checkCallingOrSelfReadDeviceIdentifiers(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return false; }
    public static boolean checkCallingOrSelfReadDeviceIdentifiers(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkCallingOrSelfReadSubscriberIdentifiers(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkCallingOrSelfReadSubscriberIdentifiers(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5) { return false; }
    public static boolean checkCallingOrSelfUseIccAuthWithDeviceIdentifier(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return false; }
    public static boolean checkReadCallLog(android.content.Context p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5) { return false; }
    public static boolean checkCallingOrSelfReadPhoneNumber(android.content.Context p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return false; }
    public static boolean checkReadPhoneNumber(android.content.Context p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6) { return false; }
    public static void enforceCallingOrSelfModifyPermissionOrCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static boolean checkLastKnownCellIdAccessPermission(android.content.Context p0) { return false; }
    public static void enforceCallingOrSelfReadPhoneStatePermissionOrCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void enforceCallingOrSelfReadPrivilegedPhoneStatePermissionOrCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void enforceCallingOrSelfReadPrecisePhoneStatePermissionOrCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void enforceCallingOrSelfCarrierPrivilege(android.content.Context p0, int p1, java.lang.String p2) {}
    public static void enforceAnyPermissionGranted(android.content.Context p0, int p1, java.lang.String p2, java.lang.String... p3) {}
    public static void enforceAnyPermissionGrantedOrCarrierPrivileges(android.content.Context p0, int p1, int p2, java.lang.String p3, java.lang.String... p4) {}
    public static void enforceShellOnly(int p0, java.lang.String p1) {}
    public static int getTargetSdk(android.content.Context p0, java.lang.String p1) { return 0; }
}
