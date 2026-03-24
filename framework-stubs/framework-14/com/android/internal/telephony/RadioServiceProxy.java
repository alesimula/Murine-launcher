package com.android.internal.telephony;

public abstract class RadioServiceProxy {
    boolean mIsAidl;
    com.android.internal.telephony.HalVersion mHalVersion;
    volatile android.hardware.radio.V1_0.IRadio mRadioProxy;
    public RadioServiceProxy() {}
    public boolean isAidl() { return false; }
    public void setHidl(com.android.internal.telephony.HalVersion p0, android.hardware.radio.V1_0.IRadio p1) {}
    public android.hardware.radio.V1_0.IRadio getHidl() { return null; }
    public void clear() {}
    public boolean isEmpty() { return false; }
    public void responseAcknowledgement() throws android.os.RemoteException {}
    public java.lang.String toString() { return null; }
}
