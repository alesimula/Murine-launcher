package com.android.internal.telephony;

public final class CarrierAppUtils {
    private static final java.lang.String TAG = "CarrierAppUtils";
    private static final boolean DEBUG = false;
    private CarrierAppUtils() {}
    public static synchronized void disableCarrierAppsUntilPrivileged(java.lang.String p0, android.content.pm.IPackageManager p1, android.telephony.TelephonyManager p2, android.content.ContentResolver p3, int p4) {}
    public static synchronized void disableCarrierAppsUntilPrivileged(java.lang.String p0, android.content.pm.IPackageManager p1, android.content.ContentResolver p2, int p3) {}
    public static void disableCarrierAppsUntilPrivileged(java.lang.String p0, android.content.pm.IPackageManager p1, android.telephony.TelephonyManager p2, android.content.ContentResolver p3, int p4, android.util.ArraySet<java.lang.String> p5, android.util.ArrayMap<java.lang.String, java.util.List<java.lang.String>> p6) {}
    public static java.util.List<android.content.pm.ApplicationInfo> getDefaultCarrierApps(android.content.pm.IPackageManager p0, android.telephony.TelephonyManager p1, int p2) { return null; }
    public static java.util.List<android.content.pm.ApplicationInfo> getDefaultCarrierAppCandidates(android.content.pm.IPackageManager p0, int p1) { return null; }
    private static java.util.List<android.content.pm.ApplicationInfo> getDefaultCarrierAppCandidatesHelper(android.content.pm.IPackageManager p0, int p1, android.util.ArraySet<java.lang.String> p2) { return null; }
    private static java.util.Map<java.lang.String, java.util.List<android.content.pm.ApplicationInfo>> getDefaultCarrierAssociatedAppsHelper(android.content.pm.IPackageManager p0, int p1, android.util.ArrayMap<java.lang.String, java.util.List<java.lang.String>> p2) { return null; }
    private static android.content.pm.ApplicationInfo getApplicationInfoIfSystemApp(android.content.pm.IPackageManager p0, int p1, java.lang.String p2) { return null; }
}
