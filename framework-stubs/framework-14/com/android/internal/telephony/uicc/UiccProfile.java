package com.android.internal.telephony.uicc;

public class UiccProfile extends com.android.internal.telephony.IccCard {
    protected static final java.lang.String LOG_TAG = "UiccProfile";
    protected static final boolean DBG = true;
    public static final int EVENT_APP_READY = 3;
    public int mCurrentAppType;
    public final android.os.Handler mHandler = null;
    public UiccProfile(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, int p3, com.android.internal.telephony.uicc.UiccCard p4, java.lang.Object p5) { super(); }
    public void dispose() {}
    public void setVoiceRadioTech(int p0) {}
    void resetProperties() {}
    public void updateExternalState() {}
    public boolean getIccRecordsLoaded() { return false; }
    public com.android.internal.telephony.IccCardConstants.State getState() { return null; }
    public com.android.internal.telephony.uicc.IccRecords getIccRecords() { return null; }
    public void registerForNetworkLocked(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForNetworkLocked(android.os.Handler p0) {}
    public void supplyPin(java.lang.String p0, android.os.Message p1) {}
    public void supplyPuk(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyPin2(java.lang.String p0, android.os.Message p1) {}
    public void supplyPuk2(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void supplyNetworkDepersonalization(java.lang.String p0, android.os.Message p1) {}
    public void supplySimDepersonalization(com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p0, java.lang.String p1, android.os.Message p2) {}
    public boolean getIccLockEnabled() { return false; }
    public boolean getIccFdnEnabled() { return false; }
    public boolean getIccFdnAvailable() { return false; }
    public boolean getIccPin2Blocked() { return false; }
    public boolean getIccPuk2Blocked() { return false; }
    public boolean isEmptyProfile() { return false; }
    public void setIccLockEnabled(boolean p0, java.lang.String p1, android.os.Message p2) {}
    public void setIccFdnEnabled(boolean p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccLockPassword(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccFdnPassword(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public java.lang.String getServiceProviderName() { return null; }
    public boolean hasIccCard() { return false; }
    public void update(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2) {}
    protected void finalize() {}
    public void registerForOpertorBrandOverride(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForOperatorBrandOverride(android.os.Handler p0) {}
    static boolean isPackageBundled(android.content.Context p0, java.lang.String p1) { return false; }
    public static java.util.Map<java.lang.String, java.lang.String> parseToCertificateToPackageMap(java.lang.String p0) { return null; }
    public boolean isApplicationOnIcc(com.android.internal.telephony.uicc.IccCardApplicationStatus.AppType p0) { return false; }
    public com.android.internal.telephony.uicc.IccCardStatus.PinState getUniversalPinState() { return null; }
    public com.android.internal.telephony.uicc.UiccCardApplication getApplication(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccCardApplication getApplicationIndex(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccCardApplication getApplicationByType(int p0) { return null; }
    public boolean resetAppWithAid(java.lang.String p0, boolean p1) { return false; }
    public void iccOpenLogicalChannel(java.lang.String p0, int p1, android.os.Message p2) {}
    public void iccCloseLogicalChannel(int p0, boolean p1, android.os.Message p2) {}
    public void iccTransmitApduLogicalChannel(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, boolean p7, android.os.Message p8) {}
    public void iccTransmitApduBasicChannel(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, android.os.Message p6) {}
    public void iccExchangeSimIO(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, android.os.Message p6) {}
    public void sendEnvelopeWithStatus(java.lang.String p0, android.os.Message p1) {}
    public int getNumApplications() { return 0; }
    public int getPhoneId() { return 0; }
    public boolean areCarrierPrivilegeRulesLoaded() { return false; }
    public java.util.List<java.lang.String> getCertsFromCarrierPrivilegeAccessRules() { return null; }
    public java.util.List<android.telephony.UiccAccessRule> getCarrierPrivilegeAccessRules() { return null; }
    public boolean setOperatorBrandOverride(java.lang.String p0) { return false; }
    public java.lang.String getOperatorBrandOverride() { return null; }
    public java.lang.String getIccId() { return null; }
    public void refresh() {}
    public void setTestOverrideCarrierPrivilegeRules(java.util.List<android.telephony.UiccAccessRule> p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}
