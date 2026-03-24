package com.android.internal.telephony.metrics;

public class ImsStats {
    int mLastTransportType;
    public ImsStats(com.android.internal.telephony.imsphone.ImsPhone p0) {}
    public synchronized void conclude() {}
    public synchronized void onImsCapabilitiesChanged(int p0, android.telephony.ims.feature.MmTelFeature.MmTelCapabilities p1) {}
    public synchronized void onSetFeatureResponse(int p0, int p1, int p2) {}
    public synchronized void onImsRegistering(int p0) {}
    public synchronized void onImsRegistered(int p0) {}
    public synchronized void onImsUnregistered(android.telephony.ims.ImsReasonInfo p0) {}
    public synchronized void onServiceStateChanged(android.telephony.ServiceState p0) {}
    public synchronized int getImsVoiceRadioTech() { return 0; }
    protected long getTimeMillis() { return 0L; }
    public static java.lang.String filterExtraMessage(java.lang.String p0) { return null; }
}
