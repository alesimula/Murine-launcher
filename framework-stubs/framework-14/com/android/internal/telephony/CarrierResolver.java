package com.android.internal.telephony;

public class CarrierResolver extends android.os.Handler {
    public CarrierResolver(com.android.internal.telephony.Phone p0) { super(); }
    public void resolveSubscriptionCarrierId(java.lang.String p0) {}
    public void handleMessage(android.os.Message p0) {}
    public void setTestOverrideApn(java.lang.String p0) {}
    public void setTestOverrideCarrierPriviledgeRule(java.lang.String p0) {}
    public int getCarrierListVersion() { return 0; }
    public int getCarrierId() { return 0; }
    public int getSpecificCarrierId() { return 0; }
    public java.lang.String getCarrierName() { return null; }
    public java.lang.String getSpecificCarrierName() { return null; }
    public int getMnoCarrierId() { return 0; }
    public static int getCarrierIdFromIdentifier(android.content.Context p0, android.service.carrier.CarrierIdentifier p1) { return 0; }
    public static java.util.List<java.lang.Integer> getCarrierIdsFromApnQuery(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    public static int getCarrierIdFromMccMnc(android.content.Context p0, java.lang.String p1) { return 0; }
    public static java.lang.String getCarrierNameFromMccMnc(android.content.Context p0, java.lang.String p1) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static class CarrierMatchingRule {
        public final java.lang.String mccMnc = null;
        public final java.lang.String imsiPrefixPattern = null;
        public final java.lang.String iccidPrefix = null;
        public final java.lang.String gid1 = null;
        public final java.lang.String gid2 = null;
        public final java.lang.String plmn = null;
        public final java.lang.String spn = null;
        public final java.lang.String apn = null;
        public final java.util.List<java.lang.String> privilegeAccessRule = null;
        public CarrierMatchingRule(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.util.List<java.lang.String> p8, int p9, java.lang.String p10, int p11) {}
        public void match(com.android.internal.telephony.CarrierResolver.CarrierMatchingRule p0) {}
        public java.lang.String toString() { return null; }
    }
}
