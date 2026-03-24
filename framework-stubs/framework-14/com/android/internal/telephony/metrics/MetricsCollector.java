package com.android.internal.telephony.metrics;

public class MetricsCollector implements android.app.StatsManager.StatsPullAtomCallback {
    public MetricsCollector(android.content.Context p0) {}
    public MetricsCollector(android.content.Context p0, com.android.internal.telephony.metrics.PersistAtomsStorage p1, com.android.internal.telephony.metrics.DeviceStateHelper p2) {}
    public int onPullAtom(int p0, java.util.List<android.util.StatsEvent> p1) { return 0; }
    public com.android.internal.telephony.metrics.PersistAtomsStorage getAtomsStorage() { return null; }
    public com.android.internal.telephony.metrics.DeviceStateHelper getDeviceStateHelper() { return null; }
    public void flushAtomsStorage() {}
    public void clearAtomsStorage() {}
    public void registerOngoingDataCallStat(com.android.internal.telephony.metrics.DataCallSessionStats p0) {}
    public void unregisterOngoingDataCallStat(com.android.internal.telephony.metrics.DataCallSessionStats p0) {}
    static com.android.internal.telephony.Phone[] getPhonesIfAny() { return null; }
}
