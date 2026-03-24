package com.android.internal.app;

public interface IBatteryStats extends android.os.IInterface {
    public static final java.lang.String KEY_UID_SNAPSHOTS = "uid_snapshots";
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStartSensor(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStopSensor(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStartVideo(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStopVideo(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStartAudio(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStopAudio(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteResetVideo() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteResetAudio() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteFlashlightOn(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteFlashlightOff(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStartCamera(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStopCamera(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteResetCamera() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteResetFlashlight() throws android.os.RemoteException;
    public void noteWakeupSensorEvent(long p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BATTERY_STATS")
    public java.util.List<android.os.BatteryUsageStats> getBatteryUsageStats(java.util.List<android.os.BatteryUsageStatsQuery> p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isCharging() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public long computeBatteryTimeRemaining() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public long computeChargeTimeRemaining() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BATTERY_STATS")
    public long computeBatteryScreenOffRealtimeMs() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BATTERY_STATS")
    public long getScreenOffDischargeMah() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteEvent(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteSyncStart(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteSyncFinish(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteJobStart(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteJobFinish(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStartWakelock(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStopWakelock(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStartWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteChangeWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, android.os.WorkSource p5, int p6, java.lang.String p7, java.lang.String p8, int p9, boolean p10) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteStopWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteLongPartialWakelockStart(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteLongPartialWakelockStartFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteLongPartialWakelockFinish(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteLongPartialWakelockFinishFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteVibratorOn(int p0, long p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteVibratorOff(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteGpsChanged(android.os.WorkSource p0, android.os.WorkSource p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteGpsSignalQuality(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteScreenState(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteScreenBrightness(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteUserActivity(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWakeUp(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteInteractive(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteConnectivityChanged(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteMobileRadioPowerState(int p0, long p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void notePhoneOn() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void notePhoneOff() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void notePhoneSignalStrength(android.telephony.SignalStrength p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void notePhoneDataConnectionState(int p0, boolean p1, int p2, int p3, int p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void notePhoneState(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiOn() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiOff() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiRunning(android.os.WorkSource p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiRunningChanged(android.os.WorkSource p0, android.os.WorkSource p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiStopped(android.os.WorkSource p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiState(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiSupplicantStateChanged(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiRssiChanged(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteFullWifiLockAcquired(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteFullWifiLockReleased(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiScanStarted(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiScanStopped(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiMulticastEnabled(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiMulticastDisabled(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteFullWifiLockAcquiredFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteFullWifiLockReleasedFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiScanStartedFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiScanStoppedFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiBatchedScanStartedFromSource(android.os.WorkSource p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiBatchedScanStoppedFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiRadioPowerState(int p0, long p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.NETWORK_STACK", "android.permission.MAINLINE_NETWORK_STACK"})
    public void noteNetworkInterfaceForTransports(java.lang.String p0, int[] p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteNetworkStatsEnabled() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteDeviceIdleMode(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void setBatteryState(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BATTERY_STATS")
    public long getAwakeTimeBattery() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BATTERY_STATS")
    public long getAwakeTimePlugged() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteBleScanStarted(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteBleScanStopped(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteBleScanReset() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteBleScanResults(android.os.WorkSource p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.UPDATE_DEVICE_STATS", "android.permission.BATTERY_STATS"})
    public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() throws android.os.RemoteException;
    @android.annotation.EnforcePermission(anyOf={"android.permission.UPDATE_DEVICE_STATS", "android.permission.BATTERY_STATS"})
    public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BATTERY_STATS")
    public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BATTERY_STATS")
    public android.os.WakeLockStats getWakeLockStats() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.BATTERY_STATS")
    public android.os.BluetoothBatteryStats getBluetoothBatteryStats() throws android.os.RemoteException;
    public android.os.health.HealthStatsParceler takeUidSnapshot(int p0) throws android.os.RemoteException;
    public android.os.health.HealthStatsParceler[] takeUidSnapshots(int[] p0) throws android.os.RemoteException;
    public void takeUidSnapshotsAsync(int[] p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteBluetoothControllerActivity(android.bluetooth.BluetoothActivityEnergyInfo p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteModemControllerActivity(android.telephony.ModemActivityInfo p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.UPDATE_DEVICE_STATS")
    public void noteWifiControllerActivity(android.os.connectivity.WifiActivityEnergyInfo p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.POWER_SAVER")
    public boolean setChargingStateUpdateDelayMillis(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DEVICE_POWER")
    public void setChargerAcOnline(boolean p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DEVICE_POWER")
    public void setBatteryLevel(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DEVICE_POWER")
    public void unplugBattery(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DEVICE_POWER")
    public void resetBattery(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.DEVICE_POWER")
    public void suspendBatteryInput() throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IBatteryStats {
        public Default() {}
        public void noteStartSensor(int p0, int p1) throws android.os.RemoteException {}
        public void noteStopSensor(int p0, int p1) throws android.os.RemoteException {}
        public void noteStartVideo(int p0) throws android.os.RemoteException {}
        public void noteStopVideo(int p0) throws android.os.RemoteException {}
        public void noteStartAudio(int p0) throws android.os.RemoteException {}
        public void noteStopAudio(int p0) throws android.os.RemoteException {}
        public void noteResetVideo() throws android.os.RemoteException {}
        public void noteResetAudio() throws android.os.RemoteException {}
        public void noteFlashlightOn(int p0) throws android.os.RemoteException {}
        public void noteFlashlightOff(int p0) throws android.os.RemoteException {}
        public void noteStartCamera(int p0) throws android.os.RemoteException {}
        public void noteStopCamera(int p0) throws android.os.RemoteException {}
        public void noteResetCamera() throws android.os.RemoteException {}
        public void noteResetFlashlight() throws android.os.RemoteException {}
        public void noteWakeupSensorEvent(long p0, int p1, int p2) throws android.os.RemoteException {}
        public java.util.List<android.os.BatteryUsageStats> getBatteryUsageStats(java.util.List<android.os.BatteryUsageStatsQuery> p0) throws android.os.RemoteException { return null; }
        public boolean isCharging() throws android.os.RemoteException { return false; }
        public long computeBatteryTimeRemaining() throws android.os.RemoteException { return 0L; }
        public long computeChargeTimeRemaining() throws android.os.RemoteException { return 0L; }
        public long computeBatteryScreenOffRealtimeMs() throws android.os.RemoteException { return 0L; }
        public long getScreenOffDischargeMah() throws android.os.RemoteException { return 0L; }
        public void noteEvent(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void noteSyncStart(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void noteSyncFinish(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void noteJobStart(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void noteJobFinish(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void noteStartWakelock(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void noteStopWakelock(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
        public void noteStartWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) throws android.os.RemoteException {}
        public void noteChangeWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, android.os.WorkSource p5, int p6, java.lang.String p7, java.lang.String p8, int p9, boolean p10) throws android.os.RemoteException {}
        public void noteStopWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
        public void noteLongPartialWakelockStart(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void noteLongPartialWakelockStartFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) throws android.os.RemoteException {}
        public void noteLongPartialWakelockFinish(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void noteLongPartialWakelockFinishFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) throws android.os.RemoteException {}
        public void noteVibratorOn(int p0, long p1) throws android.os.RemoteException {}
        public void noteVibratorOff(int p0) throws android.os.RemoteException {}
        public void noteGpsChanged(android.os.WorkSource p0, android.os.WorkSource p1) throws android.os.RemoteException {}
        public void noteGpsSignalQuality(int p0) throws android.os.RemoteException {}
        public void noteScreenState(int p0) throws android.os.RemoteException {}
        public void noteScreenBrightness(int p0) throws android.os.RemoteException {}
        public void noteUserActivity(int p0, int p1) throws android.os.RemoteException {}
        public void noteWakeUp(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void noteInteractive(boolean p0) throws android.os.RemoteException {}
        public void noteConnectivityChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void noteMobileRadioPowerState(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void notePhoneOn() throws android.os.RemoteException {}
        public void notePhoneOff() throws android.os.RemoteException {}
        public void notePhoneSignalStrength(android.telephony.SignalStrength p0) throws android.os.RemoteException {}
        public void notePhoneDataConnectionState(int p0, boolean p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public void notePhoneState(int p0) throws android.os.RemoteException {}
        public void noteWifiOn() throws android.os.RemoteException {}
        public void noteWifiOff() throws android.os.RemoteException {}
        public void noteWifiRunning(android.os.WorkSource p0) throws android.os.RemoteException {}
        public void noteWifiRunningChanged(android.os.WorkSource p0, android.os.WorkSource p1) throws android.os.RemoteException {}
        public void noteWifiStopped(android.os.WorkSource p0) throws android.os.RemoteException {}
        public void noteWifiState(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void noteWifiSupplicantStateChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void noteWifiRssiChanged(int p0) throws android.os.RemoteException {}
        public void noteFullWifiLockAcquired(int p0) throws android.os.RemoteException {}
        public void noteFullWifiLockReleased(int p0) throws android.os.RemoteException {}
        public void noteWifiScanStarted(int p0) throws android.os.RemoteException {}
        public void noteWifiScanStopped(int p0) throws android.os.RemoteException {}
        public void noteWifiMulticastEnabled(int p0) throws android.os.RemoteException {}
        public void noteWifiMulticastDisabled(int p0) throws android.os.RemoteException {}
        public void noteFullWifiLockAcquiredFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
        public void noteFullWifiLockReleasedFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
        public void noteWifiScanStartedFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
        public void noteWifiScanStoppedFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
        public void noteWifiBatchedScanStartedFromSource(android.os.WorkSource p0, int p1) throws android.os.RemoteException {}
        public void noteWifiBatchedScanStoppedFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
        public void noteWifiRadioPowerState(int p0, long p1, int p2) throws android.os.RemoteException {}
        public void noteNetworkInterfaceForTransports(java.lang.String p0, int[] p1) throws android.os.RemoteException {}
        public void noteNetworkStatsEnabled() throws android.os.RemoteException {}
        public void noteDeviceIdleMode(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setBatteryState(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8) throws android.os.RemoteException {}
        public long getAwakeTimeBattery() throws android.os.RemoteException { return 0L; }
        public long getAwakeTimePlugged() throws android.os.RemoteException { return 0L; }
        public void noteBleScanStarted(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException {}
        public void noteBleScanStopped(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException {}
        public void noteBleScanReset() throws android.os.RemoteException {}
        public void noteBleScanResults(android.os.WorkSource p0, int p1) throws android.os.RemoteException {}
        public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() throws android.os.RemoteException { return null; }
        public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() throws android.os.RemoteException { return null; }
        public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() throws android.os.RemoteException { return null; }
        public android.os.WakeLockStats getWakeLockStats() throws android.os.RemoteException { return null; }
        public android.os.BluetoothBatteryStats getBluetoothBatteryStats() throws android.os.RemoteException { return null; }
        public android.os.health.HealthStatsParceler takeUidSnapshot(int p0) throws android.os.RemoteException { return null; }
        public android.os.health.HealthStatsParceler[] takeUidSnapshots(int[] p0) throws android.os.RemoteException { return null; }
        public void takeUidSnapshotsAsync(int[] p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void noteBluetoothControllerActivity(android.bluetooth.BluetoothActivityEnergyInfo p0) throws android.os.RemoteException {}
        public void noteModemControllerActivity(android.telephony.ModemActivityInfo p0) throws android.os.RemoteException {}
        public void noteWifiControllerActivity(android.os.connectivity.WifiActivityEnergyInfo p0) throws android.os.RemoteException {}
        public boolean setChargingStateUpdateDelayMillis(int p0) throws android.os.RemoteException { return false; }
        public void setChargerAcOnline(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void setBatteryLevel(int p0, boolean p1) throws android.os.RemoteException {}
        public void unplugBattery(boolean p0) throws android.os.RemoteException {}
        public void resetBattery(boolean p0) throws android.os.RemoteException {}
        public void suspendBatteryInput() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IBatteryStats {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IBatteryStats";
        static final int TRANSACTION_noteStartSensor = 1;
        static final int TRANSACTION_noteStopSensor = 2;
        static final int TRANSACTION_noteStartVideo = 3;
        static final int TRANSACTION_noteStopVideo = 4;
        static final int TRANSACTION_noteStartAudio = 5;
        static final int TRANSACTION_noteStopAudio = 6;
        static final int TRANSACTION_noteResetVideo = 7;
        static final int TRANSACTION_noteResetAudio = 8;
        static final int TRANSACTION_noteFlashlightOn = 9;
        static final int TRANSACTION_noteFlashlightOff = 10;
        static final int TRANSACTION_noteStartCamera = 11;
        static final int TRANSACTION_noteStopCamera = 12;
        static final int TRANSACTION_noteResetCamera = 13;
        static final int TRANSACTION_noteResetFlashlight = 14;
        static final int TRANSACTION_noteWakeupSensorEvent = 15;
        static final int TRANSACTION_getBatteryUsageStats = 16;
        static final int TRANSACTION_isCharging = 17;
        static final int TRANSACTION_computeBatteryTimeRemaining = 18;
        static final int TRANSACTION_computeChargeTimeRemaining = 19;
        static final int TRANSACTION_computeBatteryScreenOffRealtimeMs = 20;
        static final int TRANSACTION_getScreenOffDischargeMah = 21;
        static final int TRANSACTION_noteEvent = 22;
        static final int TRANSACTION_noteSyncStart = 23;
        static final int TRANSACTION_noteSyncFinish = 24;
        static final int TRANSACTION_noteJobStart = 25;
        static final int TRANSACTION_noteJobFinish = 26;
        static final int TRANSACTION_noteStartWakelock = 27;
        static final int TRANSACTION_noteStopWakelock = 28;
        static final int TRANSACTION_noteStartWakelockFromSource = 29;
        static final int TRANSACTION_noteChangeWakelockFromSource = 30;
        static final int TRANSACTION_noteStopWakelockFromSource = 31;
        static final int TRANSACTION_noteLongPartialWakelockStart = 32;
        static final int TRANSACTION_noteLongPartialWakelockStartFromSource = 33;
        static final int TRANSACTION_noteLongPartialWakelockFinish = 34;
        static final int TRANSACTION_noteLongPartialWakelockFinishFromSource = 35;
        static final int TRANSACTION_noteVibratorOn = 36;
        static final int TRANSACTION_noteVibratorOff = 37;
        static final int TRANSACTION_noteGpsChanged = 38;
        static final int TRANSACTION_noteGpsSignalQuality = 39;
        static final int TRANSACTION_noteScreenState = 40;
        static final int TRANSACTION_noteScreenBrightness = 41;
        static final int TRANSACTION_noteUserActivity = 42;
        static final int TRANSACTION_noteWakeUp = 43;
        static final int TRANSACTION_noteInteractive = 44;
        static final int TRANSACTION_noteConnectivityChanged = 45;
        static final int TRANSACTION_noteMobileRadioPowerState = 46;
        static final int TRANSACTION_notePhoneOn = 47;
        static final int TRANSACTION_notePhoneOff = 48;
        static final int TRANSACTION_notePhoneSignalStrength = 49;
        static final int TRANSACTION_notePhoneDataConnectionState = 50;
        static final int TRANSACTION_notePhoneState = 51;
        static final int TRANSACTION_noteWifiOn = 52;
        static final int TRANSACTION_noteWifiOff = 53;
        static final int TRANSACTION_noteWifiRunning = 54;
        static final int TRANSACTION_noteWifiRunningChanged = 55;
        static final int TRANSACTION_noteWifiStopped = 56;
        static final int TRANSACTION_noteWifiState = 57;
        static final int TRANSACTION_noteWifiSupplicantStateChanged = 58;
        static final int TRANSACTION_noteWifiRssiChanged = 59;
        static final int TRANSACTION_noteFullWifiLockAcquired = 60;
        static final int TRANSACTION_noteFullWifiLockReleased = 61;
        static final int TRANSACTION_noteWifiScanStarted = 62;
        static final int TRANSACTION_noteWifiScanStopped = 63;
        static final int TRANSACTION_noteWifiMulticastEnabled = 64;
        static final int TRANSACTION_noteWifiMulticastDisabled = 65;
        static final int TRANSACTION_noteFullWifiLockAcquiredFromSource = 66;
        static final int TRANSACTION_noteFullWifiLockReleasedFromSource = 67;
        static final int TRANSACTION_noteWifiScanStartedFromSource = 68;
        static final int TRANSACTION_noteWifiScanStoppedFromSource = 69;
        static final int TRANSACTION_noteWifiBatchedScanStartedFromSource = 70;
        static final int TRANSACTION_noteWifiBatchedScanStoppedFromSource = 71;
        static final int TRANSACTION_noteWifiRadioPowerState = 72;
        static final int TRANSACTION_noteNetworkInterfaceForTransports = 73;
        static final java.lang.String[] PERMISSIONS_noteNetworkInterfaceForTransports = null;
        static final int TRANSACTION_noteNetworkStatsEnabled = 74;
        static final int TRANSACTION_noteDeviceIdleMode = 75;
        static final int TRANSACTION_setBatteryState = 76;
        static final int TRANSACTION_getAwakeTimeBattery = 77;
        static final int TRANSACTION_getAwakeTimePlugged = 78;
        static final int TRANSACTION_noteBleScanStarted = 79;
        static final int TRANSACTION_noteBleScanStopped = 80;
        static final int TRANSACTION_noteBleScanReset = 81;
        static final int TRANSACTION_noteBleScanResults = 82;
        static final int TRANSACTION_getCellularBatteryStats = 83;
        static final java.lang.String[] PERMISSIONS_getCellularBatteryStats = null;
        static final int TRANSACTION_getWifiBatteryStats = 84;
        static final java.lang.String[] PERMISSIONS_getWifiBatteryStats = null;
        static final int TRANSACTION_getGpsBatteryStats = 85;
        static final int TRANSACTION_getWakeLockStats = 86;
        static final int TRANSACTION_getBluetoothBatteryStats = 87;
        static final int TRANSACTION_takeUidSnapshot = 88;
        static final int TRANSACTION_takeUidSnapshots = 89;
        static final int TRANSACTION_takeUidSnapshotsAsync = 90;
        static final int TRANSACTION_noteBluetoothControllerActivity = 91;
        static final int TRANSACTION_noteModemControllerActivity = 92;
        static final int TRANSACTION_noteWifiControllerActivity = 93;
        static final int TRANSACTION_setChargingStateUpdateDelayMillis = 94;
        static final int TRANSACTION_setChargerAcOnline = 95;
        static final int TRANSACTION_setBatteryLevel = 96;
        static final int TRANSACTION_unplugBattery = 97;
        static final int TRANSACTION_resetBattery = 98;
        static final int TRANSACTION_suspendBatteryInput = 99;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static com.android.internal.app.IBatteryStats asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void noteStartSensor_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStopSensor_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStartVideo_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStopVideo_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStartAudio_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStopAudio_enforcePermission() throws java.lang.SecurityException {}
        protected void noteResetVideo_enforcePermission() throws java.lang.SecurityException {}
        protected void noteResetAudio_enforcePermission() throws java.lang.SecurityException {}
        protected void noteFlashlightOn_enforcePermission() throws java.lang.SecurityException {}
        protected void noteFlashlightOff_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStartCamera_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStopCamera_enforcePermission() throws java.lang.SecurityException {}
        protected void noteResetCamera_enforcePermission() throws java.lang.SecurityException {}
        protected void noteResetFlashlight_enforcePermission() throws java.lang.SecurityException {}
        protected void getBatteryUsageStats_enforcePermission() throws java.lang.SecurityException {}
        protected void computeBatteryScreenOffRealtimeMs_enforcePermission() throws java.lang.SecurityException {}
        protected void getScreenOffDischargeMah_enforcePermission() throws java.lang.SecurityException {}
        protected void noteEvent_enforcePermission() throws java.lang.SecurityException {}
        protected void noteSyncStart_enforcePermission() throws java.lang.SecurityException {}
        protected void noteSyncFinish_enforcePermission() throws java.lang.SecurityException {}
        protected void noteJobStart_enforcePermission() throws java.lang.SecurityException {}
        protected void noteJobFinish_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStartWakelock_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStopWakelock_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStartWakelockFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteChangeWakelockFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteStopWakelockFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteLongPartialWakelockStart_enforcePermission() throws java.lang.SecurityException {}
        protected void noteLongPartialWakelockStartFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteLongPartialWakelockFinish_enforcePermission() throws java.lang.SecurityException {}
        protected void noteLongPartialWakelockFinishFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteVibratorOn_enforcePermission() throws java.lang.SecurityException {}
        protected void noteVibratorOff_enforcePermission() throws java.lang.SecurityException {}
        protected void noteGpsChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void noteGpsSignalQuality_enforcePermission() throws java.lang.SecurityException {}
        protected void noteScreenState_enforcePermission() throws java.lang.SecurityException {}
        protected void noteScreenBrightness_enforcePermission() throws java.lang.SecurityException {}
        protected void noteUserActivity_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWakeUp_enforcePermission() throws java.lang.SecurityException {}
        protected void noteInteractive_enforcePermission() throws java.lang.SecurityException {}
        protected void noteConnectivityChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void noteMobileRadioPowerState_enforcePermission() throws java.lang.SecurityException {}
        protected void notePhoneOn_enforcePermission() throws java.lang.SecurityException {}
        protected void notePhoneOff_enforcePermission() throws java.lang.SecurityException {}
        protected void notePhoneSignalStrength_enforcePermission() throws java.lang.SecurityException {}
        protected void notePhoneDataConnectionState_enforcePermission() throws java.lang.SecurityException {}
        protected void notePhoneState_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiOn_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiOff_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiRunning_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiRunningChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiStopped_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiState_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiSupplicantStateChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiRssiChanged_enforcePermission() throws java.lang.SecurityException {}
        protected void noteFullWifiLockAcquired_enforcePermission() throws java.lang.SecurityException {}
        protected void noteFullWifiLockReleased_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiScanStarted_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiScanStopped_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiMulticastEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiMulticastDisabled_enforcePermission() throws java.lang.SecurityException {}
        protected void noteFullWifiLockAcquiredFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteFullWifiLockReleasedFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiScanStartedFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiScanStoppedFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiBatchedScanStartedFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiBatchedScanStoppedFromSource_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiRadioPowerState_enforcePermission() throws java.lang.SecurityException {}
        protected void noteNetworkInterfaceForTransports_enforcePermission() throws java.lang.SecurityException {}
        protected void noteNetworkStatsEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void noteDeviceIdleMode_enforcePermission() throws java.lang.SecurityException {}
        protected void setBatteryState_enforcePermission() throws java.lang.SecurityException {}
        protected void getAwakeTimeBattery_enforcePermission() throws java.lang.SecurityException {}
        protected void getAwakeTimePlugged_enforcePermission() throws java.lang.SecurityException {}
        protected void noteBleScanStarted_enforcePermission() throws java.lang.SecurityException {}
        protected void noteBleScanStopped_enforcePermission() throws java.lang.SecurityException {}
        protected void noteBleScanReset_enforcePermission() throws java.lang.SecurityException {}
        protected void noteBleScanResults_enforcePermission() throws java.lang.SecurityException {}
        protected void getCellularBatteryStats_enforcePermission() throws java.lang.SecurityException {}
        protected void getWifiBatteryStats_enforcePermission() throws java.lang.SecurityException {}
        protected void getGpsBatteryStats_enforcePermission() throws java.lang.SecurityException {}
        protected void getWakeLockStats_enforcePermission() throws java.lang.SecurityException {}
        protected void getBluetoothBatteryStats_enforcePermission() throws java.lang.SecurityException {}
        protected void noteBluetoothControllerActivity_enforcePermission() throws java.lang.SecurityException {}
        protected void noteModemControllerActivity_enforcePermission() throws java.lang.SecurityException {}
        protected void noteWifiControllerActivity_enforcePermission() throws java.lang.SecurityException {}
        protected void setChargingStateUpdateDelayMillis_enforcePermission() throws java.lang.SecurityException {}
        protected void setChargerAcOnline_enforcePermission() throws java.lang.SecurityException {}
        protected void setBatteryLevel_enforcePermission() throws java.lang.SecurityException {}
        protected void unplugBattery_enforcePermission() throws java.lang.SecurityException {}
        protected void resetBattery_enforcePermission() throws java.lang.SecurityException {}
        protected void suspendBatteryInput_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.IBatteryStats {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void noteStartSensor(int p0, int p1) throws android.os.RemoteException {}
            public void noteStopSensor(int p0, int p1) throws android.os.RemoteException {}
            public void noteStartVideo(int p0) throws android.os.RemoteException {}
            public void noteStopVideo(int p0) throws android.os.RemoteException {}
            public void noteStartAudio(int p0) throws android.os.RemoteException {}
            public void noteStopAudio(int p0) throws android.os.RemoteException {}
            public void noteResetVideo() throws android.os.RemoteException {}
            public void noteResetAudio() throws android.os.RemoteException {}
            public void noteFlashlightOn(int p0) throws android.os.RemoteException {}
            public void noteFlashlightOff(int p0) throws android.os.RemoteException {}
            public void noteStartCamera(int p0) throws android.os.RemoteException {}
            public void noteStopCamera(int p0) throws android.os.RemoteException {}
            public void noteResetCamera() throws android.os.RemoteException {}
            public void noteResetFlashlight() throws android.os.RemoteException {}
            public void noteWakeupSensorEvent(long p0, int p1, int p2) throws android.os.RemoteException {}
            public java.util.List<android.os.BatteryUsageStats> getBatteryUsageStats(java.util.List<android.os.BatteryUsageStatsQuery> p0) throws android.os.RemoteException { return null; }
            public boolean isCharging() throws android.os.RemoteException { return false; }
            public long computeBatteryTimeRemaining() throws android.os.RemoteException { return 0L; }
            public long computeChargeTimeRemaining() throws android.os.RemoteException { return 0L; }
            public long computeBatteryScreenOffRealtimeMs() throws android.os.RemoteException { return 0L; }
            public long getScreenOffDischargeMah() throws android.os.RemoteException { return 0L; }
            public void noteEvent(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void noteSyncStart(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void noteSyncFinish(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void noteJobStart(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void noteJobFinish(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void noteStartWakelock(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void noteStopWakelock(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
            public void noteStartWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) throws android.os.RemoteException {}
            public void noteChangeWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, android.os.WorkSource p5, int p6, java.lang.String p7, java.lang.String p8, int p9, boolean p10) throws android.os.RemoteException {}
            public void noteStopWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException {}
            public void noteLongPartialWakelockStart(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void noteLongPartialWakelockStartFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) throws android.os.RemoteException {}
            public void noteLongPartialWakelockFinish(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void noteLongPartialWakelockFinishFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) throws android.os.RemoteException {}
            public void noteVibratorOn(int p0, long p1) throws android.os.RemoteException {}
            public void noteVibratorOff(int p0) throws android.os.RemoteException {}
            public void noteGpsChanged(android.os.WorkSource p0, android.os.WorkSource p1) throws android.os.RemoteException {}
            public void noteGpsSignalQuality(int p0) throws android.os.RemoteException {}
            public void noteScreenState(int p0) throws android.os.RemoteException {}
            public void noteScreenBrightness(int p0) throws android.os.RemoteException {}
            public void noteUserActivity(int p0, int p1) throws android.os.RemoteException {}
            public void noteWakeUp(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void noteInteractive(boolean p0) throws android.os.RemoteException {}
            public void noteConnectivityChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void noteMobileRadioPowerState(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void notePhoneOn() throws android.os.RemoteException {}
            public void notePhoneOff() throws android.os.RemoteException {}
            public void notePhoneSignalStrength(android.telephony.SignalStrength p0) throws android.os.RemoteException {}
            public void notePhoneDataConnectionState(int p0, boolean p1, int p2, int p3, int p4) throws android.os.RemoteException {}
            public void notePhoneState(int p0) throws android.os.RemoteException {}
            public void noteWifiOn() throws android.os.RemoteException {}
            public void noteWifiOff() throws android.os.RemoteException {}
            public void noteWifiRunning(android.os.WorkSource p0) throws android.os.RemoteException {}
            public void noteWifiRunningChanged(android.os.WorkSource p0, android.os.WorkSource p1) throws android.os.RemoteException {}
            public void noteWifiStopped(android.os.WorkSource p0) throws android.os.RemoteException {}
            public void noteWifiState(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void noteWifiSupplicantStateChanged(int p0, boolean p1) throws android.os.RemoteException {}
            public void noteWifiRssiChanged(int p0) throws android.os.RemoteException {}
            public void noteFullWifiLockAcquired(int p0) throws android.os.RemoteException {}
            public void noteFullWifiLockReleased(int p0) throws android.os.RemoteException {}
            public void noteWifiScanStarted(int p0) throws android.os.RemoteException {}
            public void noteWifiScanStopped(int p0) throws android.os.RemoteException {}
            public void noteWifiMulticastEnabled(int p0) throws android.os.RemoteException {}
            public void noteWifiMulticastDisabled(int p0) throws android.os.RemoteException {}
            public void noteFullWifiLockAcquiredFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
            public void noteFullWifiLockReleasedFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
            public void noteWifiScanStartedFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
            public void noteWifiScanStoppedFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
            public void noteWifiBatchedScanStartedFromSource(android.os.WorkSource p0, int p1) throws android.os.RemoteException {}
            public void noteWifiBatchedScanStoppedFromSource(android.os.WorkSource p0) throws android.os.RemoteException {}
            public void noteWifiRadioPowerState(int p0, long p1, int p2) throws android.os.RemoteException {}
            public void noteNetworkInterfaceForTransports(java.lang.String p0, int[] p1) throws android.os.RemoteException {}
            public void noteNetworkStatsEnabled() throws android.os.RemoteException {}
            public void noteDeviceIdleMode(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setBatteryState(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8) throws android.os.RemoteException {}
            public long getAwakeTimeBattery() throws android.os.RemoteException { return 0L; }
            public long getAwakeTimePlugged() throws android.os.RemoteException { return 0L; }
            public void noteBleScanStarted(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException {}
            public void noteBleScanStopped(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException {}
            public void noteBleScanReset() throws android.os.RemoteException {}
            public void noteBleScanResults(android.os.WorkSource p0, int p1) throws android.os.RemoteException {}
            public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() throws android.os.RemoteException { return null; }
            public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() throws android.os.RemoteException { return null; }
            public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() throws android.os.RemoteException { return null; }
            public android.os.WakeLockStats getWakeLockStats() throws android.os.RemoteException { return null; }
            public android.os.BluetoothBatteryStats getBluetoothBatteryStats() throws android.os.RemoteException { return null; }
            public android.os.health.HealthStatsParceler takeUidSnapshot(int p0) throws android.os.RemoteException { return null; }
            public android.os.health.HealthStatsParceler[] takeUidSnapshots(int[] p0) throws android.os.RemoteException { return null; }
            public void takeUidSnapshotsAsync(int[] p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void noteBluetoothControllerActivity(android.bluetooth.BluetoothActivityEnergyInfo p0) throws android.os.RemoteException {}
            public void noteModemControllerActivity(android.telephony.ModemActivityInfo p0) throws android.os.RemoteException {}
            public void noteWifiControllerActivity(android.os.connectivity.WifiActivityEnergyInfo p0) throws android.os.RemoteException {}
            public boolean setChargingStateUpdateDelayMillis(int p0) throws android.os.RemoteException { return false; }
            public void setChargerAcOnline(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void setBatteryLevel(int p0, boolean p1) throws android.os.RemoteException {}
            public void unplugBattery(boolean p0) throws android.os.RemoteException {}
            public void resetBattery(boolean p0) throws android.os.RemoteException {}
            public void suspendBatteryInput() throws android.os.RemoteException {}
        }
    }
}
