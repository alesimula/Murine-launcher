package com.android.internal.telephony.metrics;

public class ServiceStateStats extends com.android.internal.telephony.data.DataNetworkController.DataNetworkControllerCallback {
    public ServiceStateStats(com.android.internal.telephony.Phone p0) { super(null); }
    public void conclude() {}
    public void onImsVoiceRegistrationChanged() {}
    public void registerDataNetworkControllerCallback() {}
    public void onInternetDataNetworkConnected(java.util.List<com.android.internal.telephony.data.DataNetwork> p0) {}
    public void onInternetDataNetworkDisconnected() {}
    public void onServiceStateChanged(android.telephony.ServiceState p0) {}
    public void onFoldStateChanged(int p0) {}
    static int getBand(com.android.internal.telephony.Phone p0) { return 0; }
    static int getBand(android.telephony.ServiceState p0) { return 0; }
    static int getVoiceRat(com.android.internal.telephony.Phone p0, android.telephony.ServiceState p1) { return 0; }
    public static int getVoiceRat(com.android.internal.telephony.Phone p0, android.telephony.ServiceState p1, int p2) { return 0; }
    public static int getRat(android.telephony.ServiceState p0, int p1) { return 0; }
    protected long getTimeMillis() { return 0L; }

    private static final class TimestampedServiceState {
        TimestampedServiceState(com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState p0, long p1) {}
    }
}
