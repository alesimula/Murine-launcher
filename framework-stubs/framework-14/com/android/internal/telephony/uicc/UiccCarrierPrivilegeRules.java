package com.android.internal.telephony.uicc;

public class UiccCarrierPrivilegeRules extends android.os.Handler {
    public UiccCarrierPrivilegeRules(com.android.internal.telephony.uicc.UiccProfile p0, android.os.Message p1) { super(); }
    public UiccCarrierPrivilegeRules(java.util.List<android.telephony.UiccAccessRule> p0) { super(); }
    public boolean areCarrierPriviligeRulesLoaded() { return false; }
    public boolean hasCarrierPrivilegeRules() { return false; }
    public java.util.List<java.lang.String> getPackageNames() { return null; }
    public java.util.List<android.telephony.UiccAccessRule> getAccessRules() { return null; }
    public int getCarrierPrivilegeStatus(android.content.pm.Signature p0, java.lang.String p1) { return 0; }
    public int getCarrierPrivilegeStatus(android.content.pm.PackageManager p0, java.lang.String p1) { return 0; }
    public int getCarrierPrivilegeStatus(android.content.pm.PackageInfo p0) { return 0; }
    public int getCarrierPrivilegeStatusForCurrentTransaction(android.content.pm.PackageManager p0) { return 0; }
    public int getCarrierPrivilegeStatusForUid(android.content.pm.PackageManager p0, int p1) { return 0; }
    public static boolean shouldRetry(android.os.AsyncResult p0, int p1) { return false; }
    public void handleMessage(android.os.Message p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static class TLV {
        public TLV(java.lang.String p0) {}
        public java.lang.String getValue() { return null; }
        public java.lang.String parseLength(java.lang.String p0) { return null; }
        public java.lang.String parse(java.lang.String p0, boolean p1) { return null; }
    }
}
