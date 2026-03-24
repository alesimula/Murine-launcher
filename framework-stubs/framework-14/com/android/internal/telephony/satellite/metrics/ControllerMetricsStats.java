package com.android.internal.telephony.satellite.metrics;

public class ControllerMetricsStats {
    public static com.android.internal.telephony.satellite.metrics.ControllerMetricsStats getInstance() { return null; }
    public static com.android.internal.telephony.satellite.metrics.ControllerMetricsStats make(android.content.Context p0) { return null; }
    public static com.android.internal.telephony.satellite.metrics.ControllerMetricsStats make(android.content.Context p0, com.android.internal.telephony.metrics.SatelliteStats p1) { return null; }
    ControllerMetricsStats(android.content.Context p0) {}
    protected ControllerMetricsStats(android.content.Context p0, com.android.internal.telephony.metrics.SatelliteStats p1) {}
    public void reportServiceEnablementSuccessCount() {}
    public void reportServiceEnablementFailCount() {}
    public void reportOutgoingDatagramSuccessCount(int p0) {}
    public void reportOutgoingDatagramFailCount(int p0) {}
    public void reportIncomingDatagramCount(int p0) {}
    public void reportProvisionCount(int p0) {}
    public void reportDeprovisionCount(int p0) {}
    public int captureTotalServiceUpTimeSec() { return 0; }
    public int captureTotalBatteryChargeTimeSec() { return 0; }
    public void onSatelliteEnabled() {}
    public void onSatelliteDisabled() {}
    public void startCaptureBatteryLevel() {}
    public int captureTotalBatteryConsumptionPercent(android.content.Context p0) { return 0; }
    public boolean isSatelliteModemOn() { return false; }
    public long getCurrentTime() { return 0L; }
}
