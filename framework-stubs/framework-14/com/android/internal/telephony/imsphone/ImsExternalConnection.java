package com.android.internal.telephony.imsphone;

public class ImsExternalConnection extends com.android.internal.telephony.Connection {
    protected ImsExternalConnection(com.android.internal.telephony.Phone p0, int p1, android.net.Uri p2, boolean p3) { super(0); }
    public int getCallId() { return 0; }
    public com.android.internal.telephony.Call getCall() { return null; }
    public long getDisconnectTime() { return 0L; }
    public long getHoldDurationMillis() { return 0L; }
    public java.lang.String getVendorDisconnectCause() { return null; }
    public void hangup() throws com.android.internal.telephony.CallStateException {}
    public void deflect(java.lang.String p0) throws com.android.internal.telephony.CallStateException {}
    public void transfer(java.lang.String p0, boolean p1) throws com.android.internal.telephony.CallStateException {}
    public void consultativeTransfer(com.android.internal.telephony.Connection p0) throws com.android.internal.telephony.CallStateException {}
    public void separate() throws com.android.internal.telephony.CallStateException {}
    public void proceedAfterWaitChar() {}
    public void proceedAfterWildChar(java.lang.String p0) {}
    public void cancelPostDial() {}
    public int getNumberPresentation() { return 0; }
    public com.android.internal.telephony.UUSInfo getUUSInfo() { return null; }
    public int getPreciseDisconnectCause() { return 0; }
    public boolean isMultiparty() { return false; }
    public void pullExternalCall() {}
    public void setActive() {}
    public void setTerminated() {}
    public void setIsPullable(boolean p0) {}
    public void setExternalConnectionAddress(android.net.Uri p0) {}
    public void addListener(com.android.internal.telephony.imsphone.ImsExternalConnection.Listener p0) {}
    public void removeListener(com.android.internal.telephony.imsphone.ImsExternalConnection.Listener p0) {}
    public java.lang.String toString() { return null; }

    public static interface Listener {
        public void onPullExternalCall(com.android.internal.telephony.imsphone.ImsExternalConnection p0);
    }
}
