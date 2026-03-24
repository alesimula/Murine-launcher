package com.android.internal.telephony;

public class CarrierPrivilegesTracker extends android.os.Handler {
    public CarrierPrivilegesTracker(android.os.Looper p0, com.android.internal.telephony.Phone p1, android.content.Context p2) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void onUiccAccessRulesLoaded() {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void setTestOverrideCarrierPrivilegeRules(java.lang.String p0) {}
    public void setTestOverrideCarrierServicePackage(java.lang.String p0) {}
    public int getCarrierPrivilegeStatusForPackage(java.lang.String p0) { return 0; }
    public java.util.Set<java.lang.String> getPackagesWithCarrierPrivileges() { return null; }
    public int getCarrierPrivilegeStatusForUid(int p0) { return 0; }
    public java.lang.String getCarrierServicePackageName() { return null; }
    public int getCarrierServicePackageUid() { return 0; }
    public java.util.List<java.lang.String> getCarrierPackageNamesForIntent(android.content.Intent p0) { return null; }

    private static final class PrivilegedPackageInfo {
        final java.util.Set<java.lang.String> mPackageNames = null;
        final java.util.Set<java.lang.Integer> mUids = null;
        final android.util.Pair<java.lang.String, java.lang.Integer> mCarrierService = null;
        PrivilegedPackageInfo() {}
        PrivilegedPackageInfo(java.util.Set<java.lang.String> p0, java.util.Set<java.lang.Integer> p1, android.util.Pair<java.lang.String, java.lang.Integer> p2) {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
