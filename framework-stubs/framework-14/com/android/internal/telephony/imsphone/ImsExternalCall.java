package com.android.internal.telephony.imsphone;

public class ImsExternalCall extends com.android.internal.telephony.Call {
    public ImsExternalCall(com.android.internal.telephony.Phone p0, com.android.internal.telephony.imsphone.ImsExternalConnection p1) { super(); }
    public com.android.internal.telephony.Phone getPhone() { return null; }
    public boolean isMultiparty() { return false; }
    public void hangup() throws com.android.internal.telephony.CallStateException {}
    public void hangup(int p0) throws com.android.internal.telephony.CallStateException {}
    public void setActive() {}
    public void setTerminated() {}
}
