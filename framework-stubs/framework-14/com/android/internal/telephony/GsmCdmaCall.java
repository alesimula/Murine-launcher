package com.android.internal.telephony;

public class GsmCdmaCall extends com.android.internal.telephony.Call {
    com.android.internal.telephony.GsmCdmaCallTracker mOwner;
    public GsmCdmaCall(com.android.internal.telephony.GsmCdmaCallTracker p0) { super(); }
    public com.android.internal.telephony.Phone getPhone() { return null; }
    public boolean isMultiparty() { return false; }
    public void hangup() throws com.android.internal.telephony.CallStateException {}
    public void hangup(int p0) throws com.android.internal.telephony.CallStateException {}
    public java.lang.String toString() { return null; }
    public void attach(com.android.internal.telephony.Connection p0, com.android.internal.telephony.DriverCall p1) {}
    public void attachFake(com.android.internal.telephony.Connection p0, com.android.internal.telephony.Call.State p1) {}
    public boolean connectionDisconnected(com.android.internal.telephony.GsmCdmaConnection p0) { return false; }
    public void detach(com.android.internal.telephony.GsmCdmaConnection p0) {}
    boolean update(com.android.internal.telephony.GsmCdmaConnection p0, com.android.internal.telephony.DriverCall p1) { return false; }
    boolean isFull() { return false; }
    public void onHangupLocal() {}
}
