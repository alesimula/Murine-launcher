package com.android.internal.telephony.imsphone;

public interface ImsRcsStatusListener {
    public void onRcsConnected(int p0, com.android.ims.RcsFeatureManager p1);
    public void onRcsDisconnected(int p0);
}
