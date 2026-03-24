package com.android.internal.telephony.uicc;

public class UiccPort {
    protected static final java.lang.String LOG_TAG = "UiccPort";
    protected static final boolean DBG = true;
    protected final java.lang.Object mLock = null;
    protected java.lang.String mCardId;
    public UiccPort(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, int p3, java.lang.Object p4, com.android.internal.telephony.uicc.UiccCard p5) {}
    public void update(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, com.android.internal.telephony.uicc.UiccCard p3) {}
    public void dispose() {}
    protected void finalize() {}
    @java.lang.Deprecated
    public boolean isApplicationOnIcc(com.android.internal.telephony.uicc.IccCardApplicationStatus.AppType p0) { return false; }
    @java.lang.Deprecated
    public com.android.internal.telephony.uicc.IccCardStatus.PinState getUniversalPinState() { return null; }
    @java.lang.Deprecated
    public com.android.internal.telephony.uicc.UiccCardApplication getApplication(int p0) { return null; }
    @java.lang.Deprecated
    public com.android.internal.telephony.uicc.UiccCardApplication getApplicationIndex(int p0) { return null; }
    @java.lang.Deprecated
    public com.android.internal.telephony.uicc.UiccCardApplication getApplicationByType(int p0) { return null; }
    @java.lang.Deprecated
    public boolean resetAppWithAid(java.lang.String p0, boolean p1) { return false; }
    @java.lang.Deprecated
    public void iccOpenLogicalChannel(java.lang.String p0, int p1, android.os.Message p2) {}
    @java.lang.Deprecated
    public void iccCloseLogicalChannel(int p0, android.os.Message p1) {}
    @java.lang.Deprecated
    public void iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, android.os.Message p7) {}
    @java.lang.Deprecated
    public void iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, android.os.Message p6) {}
    @java.lang.Deprecated
    public void iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, android.os.Message p6) {}
    @java.lang.Deprecated
    public void sendEnvelopeWithStatus(java.lang.String p0, android.os.Message p1) {}
    @java.lang.Deprecated
    public int getNumApplications() { return 0; }
    public int getPhoneId() { return 0; }
    public int getPortIdx() { return 0; }
    public com.android.internal.telephony.uicc.UiccProfile getUiccProfile() { return null; }
    @java.lang.Deprecated
    public boolean setOperatorBrandOverride(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public java.lang.String getOperatorBrandOverride() { return null; }
    public java.lang.String getIccId() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void onLogicalChannelOpened(com.android.internal.telephony.IccLogicalChannelRequest p0) {}
    public void onLogicalChannelClosed(int p0) {}
    public com.android.internal.telephony.uicc.UiccPort.OpenLogicalChannelRecord getOpenLogicalChannelRecord(int p0) { return null; }

    public class OpenLogicalChannelRecord implements android.os.IBinder.DeathRecipient {
        com.android.internal.telephony.IccLogicalChannelRequest mRequest;
        OpenLogicalChannelRecord(com.android.internal.telephony.uicc.UiccPort p0, com.android.internal.telephony.IccLogicalChannelRequest p1) {}
        public void binderDied() {}
        public java.lang.String toString() { return null; }
    }
}
