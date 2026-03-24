package com.android.internal.telephony.imsphone;

public class ImsNrSaModeHandler extends android.os.Handler {
    public static final java.lang.String TAG = "ImsNrSaModeHandler";
    public static final java.lang.String MMTEL_FEATURE_TAG = "+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel\"";
    public ImsNrSaModeHandler(com.android.internal.telephony.imsphone.ImsPhone p0, android.os.Looper p1) { super(); }
    public void tearDown() {}
    public void onImsRegistered(int p0, java.util.Set<java.lang.String> p1) {}
    public void onImsUnregistered(int p0) {}
    public void onPreciseCallStateChanged() {}
    public void handleMessage(android.os.Message p0) {}
    public void setVowifiRegStatus(boolean p0) {}
    public void setImsCallStatus(boolean p0) {}
    public boolean isVowifiRegistered() { return false; }
    public boolean isImsCallOngoing() { return false; }
    public boolean isNrSaDisabledForWfc() { return false; }
    public void setNrSaDisabledForWfc(boolean p0) {}
}
