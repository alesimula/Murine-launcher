package com.android.internal.telephony;

public class IccCard {
    public IccCard() {}
    public IccCard(com.android.internal.telephony.IccCardConstants.State p0) {}
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
    public boolean getIccFdnAvailable() { return false; }
    public boolean getIccFdnEnabled() { return false; }
    public void setIccLockEnabled(boolean p0, java.lang.String p1, android.os.Message p2) {}
    public void setIccFdnEnabled(boolean p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccLockPassword(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public void changeIccFdnPassword(java.lang.String p0, java.lang.String p1, android.os.Message p2) {}
    public java.lang.String getServiceProviderName() { return null; }
    public boolean isApplicationOnIcc(com.android.internal.telephony.uicc.IccCardApplicationStatus.AppType p0) { return false; }
    public boolean hasIccCard() { return false; }
    public boolean getIccPin2Blocked() { return false; }
    public boolean getIccPuk2Blocked() { return false; }
    public boolean isEmptyProfile() { return false; }
}
