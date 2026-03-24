package com.android.internal.telephony.cdnr;

public class CarrierDisplayNameResolver {
    public CarrierDisplayNameResolver(com.android.internal.telephony.GsmCdmaPhone p0) {}
    public void updateEfFromRuim(com.android.internal.telephony.uicc.RuimRecords p0) {}
    public void updateEfFromUsim(com.android.internal.telephony.uicc.SIMRecords p0) {}
    public void updateEfFromCarrierConfig(android.os.PersistableBundle p0) {}
    public void updateEfForEri(java.lang.String p0) {}
    public void updateEfForBrandOverride(java.lang.String p0) {}
    public com.android.internal.telephony.cdnr.CarrierDisplayNameData getCarrierDisplayNameData() { return null; }
    public java.lang.String toString() { return null; }
    public void dump(com.android.internal.telephony.IndentingPrintWriter p0) {}

    private static final class CarrierDisplayNameConditionRule {
        CarrierDisplayNameConditionRule(int p0) {}
        boolean shouldShowSpn(java.lang.String p0) { return false; }
        boolean shouldShowPlmn(java.lang.String p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    private static final class WfcCarrierNameFormatter {
        final java.lang.String mVoiceFormat = null;
        final java.lang.String mDataFormat = null;
        WfcCarrierNameFormatter(android.os.PersistableBundle p0, java.lang.String[] p1, boolean p2) {}
        public java.lang.String formatVoiceName(java.lang.String p0) { return null; }
        public java.lang.String formatDataName(java.lang.String p0) { return null; }
    }
}
