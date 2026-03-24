package com.android.internal.telephony;

public final class CarrierAppUtils {
    private static final java.lang.String TAG = "CarrierAppUtils";
    private static final boolean DEBUG = false;
    private CarrierAppUtils() {}
    public static synchronized void disableCarrierAppsUntilPrivileged(java.lang.String p0, android.telephony.TelephonyManager p1, int p2, android.content.Context p3) {}
    public static synchronized void disableCarrierAppsUntilPrivileged(java.lang.String p0, int p1, android.content.Context p2) {}
    private static android.content.ContentResolver getContentResolverForUser(android.content.Context p0, int p1) { return null; }
    private static boolean isUpdatedSystemApp(android.content.pm.ApplicationInfo p0) { return false; }
    public static void disableCarrierAppsUntilPrivileged(java.lang.String p0, android.telephony.TelephonyManager p1, android.content.ContentResolver p2, int p3, java.util.Set<java.lang.String> p4, java.util.Map<java.lang.String, java.util.List<android.os.CarrierAssociatedAppEntry>> p5, android.content.Context p6) {}
    public static java.util.List<android.content.pm.ApplicationInfo> getDefaultCarrierApps(android.telephony.TelephonyManager p0, int p1, android.content.Context p2) { return null; }
    public static java.util.List<android.content.pm.ApplicationInfo> getDefaultCarrierAppCandidates(int p0, android.content.Context p1) { return null; }
    private static java.util.List<android.content.pm.ApplicationInfo> getDefaultCarrierAppCandidatesHelper(int p0, java.util.Set<java.lang.String> p1, android.content.Context p2) { return null; }
    private static java.util.Map<java.lang.String, java.util.List<com.android.internal.telephony.CarrierAppUtils.AssociatedAppInfo>> getDefaultCarrierAssociatedAppsHelper(int p0, java.util.Map<java.lang.String, java.util.List<android.os.CarrierAssociatedAppEntry>> p1, android.content.Context p2) { return null; }
    private static android.content.pm.ApplicationInfo getApplicationInfoIfSystemApp(int p0, java.lang.String p1, android.content.Context p2) { return null; }

    private static final class AssociatedAppInfo {
        public final android.content.pm.ApplicationInfo appInfo = null;
        public final int addedInSdk = 0;
        AssociatedAppInfo(android.content.pm.ApplicationInfo p0, int p1) {}
    }
}
