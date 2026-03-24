package com.android.internal.telephony.emergency;

public class RadioOnHelper implements com.android.internal.telephony.emergency.RadioOnStateListener.Callback {
    public RadioOnHelper(android.content.Context p0) {}
    public void triggerRadioOnAndListen(com.android.internal.telephony.emergency.RadioOnStateListener.Callback p0, boolean p1, com.android.internal.telephony.Phone p2, boolean p3, int p4) {}
    public void onComplete(com.android.internal.telephony.emergency.RadioOnStateListener p0, boolean p1) {}
    public boolean isOkToCall(com.android.internal.telephony.Phone p0, int p1, boolean p2) { return false; }
    public boolean onTimeout(com.android.internal.telephony.Phone p0, int p1, boolean p2) { return false; }
}
