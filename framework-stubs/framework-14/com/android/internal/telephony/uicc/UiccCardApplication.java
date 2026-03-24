package com.android.internal.telephony.uicc;

public class UiccCardApplication {
    public static final int AUTH_CONTEXT_EAP_SIM = 128;
    public static final int AUTH_CONTEXT_EAP_AKA = 129;
    public static final int AUTH_CONTEXT_GBA_BOOTSTRAP = 132;
    public static final int AUTHTYPE_GBA_NAF_KEY_EXTERNAL = 133;
    public static final int AUTH_CONTEXT_UNDEFINED = -1;
    public UiccCardApplication(com.android.internal.telephony.uicc.UiccProfile p0, com.android.internal.telephony.uicc.IccCardApplicationStatus p1, android.content.Context p2, com.android.internal.telephony.CommandsInterface p3) {}
    public void update(com.android.internal.telephony.uicc.IccCardApplicationStatus p0, android.content.Context p1, com.android.internal.telephony.CommandsInterface p2) {}
    void dispose() {}
    public void queryFdn() {}
    public void registerForReady(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForReady(android.os.Handler p0) {}
    public void registerForDetected(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForDetected(android.os.Handler p0) {}
    protected void registerForLocked(android.os.Handler p0, int p1, java.lang.Object p2) {}
    protected void unregisterForLocked(android.os.Handler p0) {}
    protected void registerForNetworkLocked(android.os.Handler p0, int p1, java.lang.Object p2) {}
    protected void unregisterForNetworkLocked(android.os.Handler p0) {}
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.AppState getState() { return null; }
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.AppType getType() { return null; }
    public int getAuthContext() { return 0; }
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState getPersoSubState() { return null; }
    public java.lang.String getAid() { return null; }
    public java.lang.String getAppLabel() { return null; }
    public com.android.internal.telephony.uicc.IccCardStatus.PinState getPin1State() { return null; }
    public com.android.internal.telephony.uicc.IccFileHandler getIccFileHandler() { return null; }
    public com.android.internal.telephony.uicc.IccRecords getIccRecords() { return null; }
    public void supplyPin(java.lang.String p0, android.os.Message p1) {}
    public void supplyPuk(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyPin2(java.lang.String p0, android.os.Message p1) {}
    public void supplyPuk2(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyNetworkDepersonalization(java.lang.String p0, android.os.Message p1) {}
    public void supplySimDepersonalization(com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p0, java.lang.String p1, android.os.Message p2) {}
    public boolean getIccLockEnabled() { return false; }
    public boolean getIccFdnEnabled() { return false; }
    public boolean getIccFdnAvailable() { return false; }
    public void setIccLockEnabled(boolean p0, java.lang.String p1, android.os.Message p2) {}
    public void setIccFdnEnabled(boolean p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccLockPassword(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccFdnPassword(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public boolean isReady() { return false; }
    public boolean getIccPin2Blocked() { return false; }
    public boolean getIccPuk2Blocked() { return false; }
    public int getPhoneId() { return 0; }
    public boolean isAppIgnored() { return false; }
    public void setAppIgnoreState(boolean p0) {}
    protected com.android.internal.telephony.uicc.UiccProfile getUiccProfile() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
