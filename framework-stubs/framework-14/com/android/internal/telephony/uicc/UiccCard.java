package com.android.internal.telephony.uicc;

public class UiccCard {
    protected static final java.lang.String LOG_TAG = "UiccCard";
    protected static final boolean DBG = true;
    public static final java.lang.String EXTRA_ICC_CARD_ADDED = "com.android.internal.telephony.uicc.ICC_CARD_ADDED";
    protected final java.lang.Object mLock = null;
    protected java.lang.String mCardId;
    protected com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode mSupportedMepMode;
    protected java.util.LinkedHashMap<java.lang.Integer, com.android.internal.telephony.uicc.UiccPort> mUiccPorts;
    public UiccCard(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, int p3, java.lang.Object p4, com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode p5) {}
    public void dispose() {}
    public void disposePort(int p0) {}
    public void update(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, int p3) {}
    protected void finalize() {}
    protected void updateCardId(java.lang.String p0) {}
    public void updateSupportedMepMode(com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode p0) {}
    public com.android.internal.telephony.uicc.IccCardStatus.CardState getCardState() { return null; }
    public java.lang.String getCardId() { return null; }
    public com.android.internal.telephony.uicc.UiccPort[] getUiccPortList() { return null; }
    public com.android.internal.telephony.uicc.UiccPort getUiccPortForPhone(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccPort getUiccPort(int p0) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
