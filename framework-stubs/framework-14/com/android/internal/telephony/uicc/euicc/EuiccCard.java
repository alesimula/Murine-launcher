package com.android.internal.telephony.uicc.euicc;

public class EuiccCard extends com.android.internal.telephony.uicc.UiccCard {
    public EuiccCard(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, int p3, java.lang.Object p4, com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode p5) { super(null, null, null, 0, null, null); }
    public void updateSupportedMepMode(com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode p0) {}
    public void update(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, int p3) {}
    protected void updateCardId(java.lang.String p0) {}
    public void registerForEidReady(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForEidReady(android.os.Handler p0) {}
    protected void loadEidAndNotifyRegistrants() {}
    public java.lang.String getEid() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
