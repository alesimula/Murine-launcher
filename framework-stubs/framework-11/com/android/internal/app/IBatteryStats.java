package com.android.internal.app;

public interface IBatteryStats extends android.os.IInterface {
    public void noteStartSensor(int p0, int p1) throws android.os.RemoteException;
    public void noteStopSensor(int p0, int p1) throws android.os.RemoteException;
    public void noteStartVideo(int p0) throws android.os.RemoteException;
    public void noteStopVideo(int p0) throws android.os.RemoteException;
    public void noteStartAudio(int p0) throws android.os.RemoteException;
    public void noteStopAudio(int p0) throws android.os.RemoteException;
    public void noteResetVideo() throws android.os.RemoteException;
    public void noteResetAudio() throws android.os.RemoteException;
    public void noteFlashlightOn(int p0) throws android.os.RemoteException;
    public void noteFlashlightOff(int p0) throws android.os.RemoteException;
    public void noteStartCamera(int p0) throws android.os.RemoteException;
    public void noteStopCamera(int p0) throws android.os.RemoteException;
    public void noteResetCamera() throws android.os.RemoteException;
    public void noteResetFlashlight() throws android.os.RemoteException;
    public byte[] getStatistics() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getStatisticsStream() throws android.os.RemoteException;
    public boolean isCharging() throws android.os.RemoteException;
    public long computeBatteryTimeRemaining() throws android.os.RemoteException;
    public long computeChargeTimeRemaining() throws android.os.RemoteException;
    public void noteEvent(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void noteSyncStart(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void noteSyncFinish(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void noteJobStart(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void noteJobFinish(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void noteStartWakelock(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) throws android.os.RemoteException;
    public void noteStopWakelock(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void noteStartWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5) throws android.os.RemoteException;
    public void noteChangeWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4, android.os.WorkSource p5, int p6, java.lang.String p7, java.lang.String p8, int p9, boolean p10) throws android.os.RemoteException;
    public void noteStopWakelockFromSource(android.os.WorkSource p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void noteLongPartialWakelockStart(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void noteLongPartialWakelockStartFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) throws android.os.RemoteException;
    public void noteLongPartialWakelockFinish(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void noteLongPartialWakelockFinishFromSource(java.lang.String p0, java.lang.String p1, android.os.WorkSource p2) throws android.os.RemoteException;
    public void noteVibratorOn(int p0, long p1) throws android.os.RemoteException;
    public void noteVibratorOff(int p0) throws android.os.RemoteException;
    public void noteGpsChanged(android.os.WorkSource p0, android.os.WorkSource p1) throws android.os.RemoteException;
    public void noteGpsSignalQuality(int p0) throws android.os.RemoteException;
    public void noteScreenState(int p0) throws android.os.RemoteException;
    public void noteScreenBrightness(int p0) throws android.os.RemoteException;
    public void noteUserActivity(int p0, int p1) throws android.os.RemoteException;
    public void noteWakeUp(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void noteInteractive(boolean p0) throws android.os.RemoteException;
    public void noteConnectivityChanged(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void noteMobileRadioPowerState(int p0, long p1, int p2) throws android.os.RemoteException;
    public void notePhoneOn() throws android.os.RemoteException;
    public void notePhoneOff() throws android.os.RemoteException;
    public void notePhoneSignalStrength(android.telephony.SignalStrength p0) throws android.os.RemoteException;
    public void notePhoneDataConnectionState(int p0, boolean p1, int p2) throws android.os.RemoteException;
    public void notePhoneState(int p0) throws android.os.RemoteException;
    public void noteWifiOn() throws android.os.RemoteException;
    public void noteWifiOff() throws android.os.RemoteException;
    public void noteWifiRunning(android.os.WorkSource p0) throws android.os.RemoteException;
    public void noteWifiRunningChanged(android.os.WorkSource p0, android.os.WorkSource p1) throws android.os.RemoteException;
    public void noteWifiStopped(android.os.WorkSource p0) throws android.os.RemoteException;
    public void noteWifiState(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void noteWifiSupplicantStateChanged(int p0, boolean p1) throws android.os.RemoteException;
    public void noteWifiRssiChanged(int p0) throws android.os.RemoteException;
    public void noteFullWifiLockAcquired(int p0) throws android.os.RemoteException;
    public void noteFullWifiLockReleased(int p0) throws android.os.RemoteException;
    public void noteWifiScanStarted(int p0) throws android.os.RemoteException;
    public void noteWifiScanStopped(int p0) throws android.os.RemoteException;
    public void noteWifiMulticastEnabled(int p0) throws android.os.RemoteException;
    public void noteWifiMulticastDisabled(int p0) throws android.os.RemoteException;
    public void noteFullWifiLockAcquiredFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    public void noteFullWifiLockReleasedFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    public void noteWifiScanStartedFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    public void noteWifiScanStoppedFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    public void noteWifiBatchedScanStartedFromSource(android.os.WorkSource p0, int p1) throws android.os.RemoteException;
    public void noteWifiBatchedScanStoppedFromSource(android.os.WorkSource p0) throws android.os.RemoteException;
    public void noteWifiRadioPowerState(int p0, long p1, int p2) throws android.os.RemoteException;
    public void noteNetworkInterfaceType(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void noteNetworkStatsEnabled() throws android.os.RemoteException;
    public void noteDeviceIdleMode(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setBatteryState(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8) throws android.os.RemoteException;
    public long getAwakeTimeBattery() throws android.os.RemoteException;
    public long getAwakeTimePlugged() throws android.os.RemoteException;
    public void noteBleScanStarted(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException;
    public void noteBleScanStopped(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException;
    public void noteResetBleScan() throws android.os.RemoteException;
    public void noteBleScanResults(android.os.WorkSource p0, int p1) throws android.os.RemoteException;
    public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() throws android.os.RemoteException;
    public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() throws android.os.RemoteException;
    public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() throws android.os.RemoteException;
    public android.os.health.HealthStatsParceler takeUidSnapshot(int p0) throws android.os.RemoteException;
    public android.os.health.HealthStatsParceler[] takeUidSnapshots(int[] p0) throws android.os.RemoteException;
    public void noteBluetoothControllerActivity(android.bluetooth.BluetoothActivityEnergyInfo p0) throws android.os.RemoteException;
    public void noteModemControllerActivity(android.telephony.ModemActivityInfo p0) throws android.os.RemoteException;
    public void noteWifiControllerActivity(android.os.connectivity.WifiActivityEnergyInfo p0) throws android.os.RemoteException;
    public boolean setChargingStateUpdateDelayMillis(int p0) throws android.os.RemoteException;

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
        public byte[] getStatistics() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getStatisticsStream() throws android.os.RemoteException { return null; }
        public boolean isCharging() throws android.os.RemoteException { return false; }
        public long computeBatteryTimeRemaining() throws android.os.RemoteException { return 0L; }
        public long computeChargeTimeRemaining() throws android.os.RemoteException { return 0L; }
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
        public void notePhoneDataConnectionState(int p0, boolean p1, int p2) throws android.os.RemoteException {}
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
        public void noteNetworkInterfaceType(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void noteNetworkStatsEnabled() throws android.os.RemoteException {}
        public void noteDeviceIdleMode(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setBatteryState(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8) throws android.os.RemoteException {}
        public long getAwakeTimeBattery() throws android.os.RemoteException { return 0L; }
        public long getAwakeTimePlugged() throws android.os.RemoteException { return 0L; }
        public void noteBleScanStarted(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException {}
        public void noteBleScanStopped(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException {}
        public void noteResetBleScan() throws android.os.RemoteException {}
        public void noteBleScanResults(android.os.WorkSource p0, int p1) throws android.os.RemoteException {}
        public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() throws android.os.RemoteException { return null; }
        public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() throws android.os.RemoteException { return null; }
        public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() throws android.os.RemoteException { return null; }
        public android.os.health.HealthStatsParceler takeUidSnapshot(int p0) throws android.os.RemoteException { return null; }
        public android.os.health.HealthStatsParceler[] takeUidSnapshots(int[] p0) throws android.os.RemoteException { return null; }
        public void noteBluetoothControllerActivity(android.bluetooth.BluetoothActivityEnergyInfo p0) throws android.os.RemoteException {}
        public void noteModemControllerActivity(android.telephony.ModemActivityInfo p0) throws android.os.RemoteException {}
        public void noteWifiControllerActivity(android.os.connectivity.WifiActivityEnergyInfo p0) throws android.os.RemoteException {}
        public boolean setChargingStateUpdateDelayMillis(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IBatteryStats {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IBatteryStats";
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
        static final int TRANSACTION_getStatistics = 15;
        static final int TRANSACTION_getStatisticsStream = 16;
        static final int TRANSACTION_isCharging = 17;
        static final int TRANSACTION_computeBatteryTimeRemaining = 18;
        static final int TRANSACTION_computeChargeTimeRemaining = 19;
        static final int TRANSACTION_noteEvent = 20;
        static final int TRANSACTION_noteSyncStart = 21;
        static final int TRANSACTION_noteSyncFinish = 22;
        static final int TRANSACTION_noteJobStart = 23;
        static final int TRANSACTION_noteJobFinish = 24;
        static final int TRANSACTION_noteStartWakelock = 25;
        static final int TRANSACTION_noteStopWakelock = 26;
        static final int TRANSACTION_noteStartWakelockFromSource = 27;
        static final int TRANSACTION_noteChangeWakelockFromSource = 28;
        static final int TRANSACTION_noteStopWakelockFromSource = 29;
        static final int TRANSACTION_noteLongPartialWakelockStart = 30;
        static final int TRANSACTION_noteLongPartialWakelockStartFromSource = 31;
        static final int TRANSACTION_noteLongPartialWakelockFinish = 32;
        static final int TRANSACTION_noteLongPartialWakelockFinishFromSource = 33;
        static final int TRANSACTION_noteVibratorOn = 34;
        static final int TRANSACTION_noteVibratorOff = 35;
        static final int TRANSACTION_noteGpsChanged = 36;
        static final int TRANSACTION_noteGpsSignalQuality = 37;
        static final int TRANSACTION_noteScreenState = 38;
        static final int TRANSACTION_noteScreenBrightness = 39;
        static final int TRANSACTION_noteUserActivity = 40;
        static final int TRANSACTION_noteWakeUp = 41;
        static final int TRANSACTION_noteInteractive = 42;
        static final int TRANSACTION_noteConnectivityChanged = 43;
        static final int TRANSACTION_noteMobileRadioPowerState = 44;
        static final int TRANSACTION_notePhoneOn = 45;
        static final int TRANSACTION_notePhoneOff = 46;
        static final int TRANSACTION_notePhoneSignalStrength = 47;
        static final int TRANSACTION_notePhoneDataConnectionState = 48;
        static final int TRANSACTION_notePhoneState = 49;
        static final int TRANSACTION_noteWifiOn = 50;
        static final int TRANSACTION_noteWifiOff = 51;
        static final int TRANSACTION_noteWifiRunning = 52;
        static final int TRANSACTION_noteWifiRunningChanged = 53;
        static final int TRANSACTION_noteWifiStopped = 54;
        static final int TRANSACTION_noteWifiState = 55;
        static final int TRANSACTION_noteWifiSupplicantStateChanged = 56;
        static final int TRANSACTION_noteWifiRssiChanged = 57;
        static final int TRANSACTION_noteFullWifiLockAcquired = 58;
        static final int TRANSACTION_noteFullWifiLockReleased = 59;
        static final int TRANSACTION_noteWifiScanStarted = 60;
        static final int TRANSACTION_noteWifiScanStopped = 61;
        static final int TRANSACTION_noteWifiMulticastEnabled = 62;
        static final int TRANSACTION_noteWifiMulticastDisabled = 63;
        static final int TRANSACTION_noteFullWifiLockAcquiredFromSource = 64;
        static final int TRANSACTION_noteFullWifiLockReleasedFromSource = 65;
        static final int TRANSACTION_noteWifiScanStartedFromSource = 66;
        static final int TRANSACTION_noteWifiScanStoppedFromSource = 67;
        static final int TRANSACTION_noteWifiBatchedScanStartedFromSource = 68;
        static final int TRANSACTION_noteWifiBatchedScanStoppedFromSource = 69;
        static final int TRANSACTION_noteWifiRadioPowerState = 70;
        static final int TRANSACTION_noteNetworkInterfaceType = 71;
        static final int TRANSACTION_noteNetworkStatsEnabled = 72;
        static final int TRANSACTION_noteDeviceIdleMode = 73;
        static final int TRANSACTION_setBatteryState = 74;
        static final int TRANSACTION_getAwakeTimeBattery = 75;
        static final int TRANSACTION_getAwakeTimePlugged = 76;
        static final int TRANSACTION_noteBleScanStarted = 77;
        static final int TRANSACTION_noteBleScanStopped = 78;
        static final int TRANSACTION_noteResetBleScan = 79;
        static final int TRANSACTION_noteBleScanResults = 80;
        static final int TRANSACTION_getCellularBatteryStats = 81;
        static final int TRANSACTION_getWifiBatteryStats = 82;
        static final int TRANSACTION_getGpsBatteryStats = 83;
        static final int TRANSACTION_takeUidSnapshot = 84;
        static final int TRANSACTION_takeUidSnapshots = 85;
        static final int TRANSACTION_noteBluetoothControllerActivity = 86;
        static final int TRANSACTION_noteModemControllerActivity = 87;
        static final int TRANSACTION_noteWifiControllerActivity = 88;
        static final int TRANSACTION_setChargingStateUpdateDelayMillis = 89;
        public Stub() { super(); }
        public static com.android.internal.app.IBatteryStats asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IBatteryStats p0) { return false; }
        public static com.android.internal.app.IBatteryStats getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IBatteryStats {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IBatteryStats sDefaultImpl;
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
            public byte[] getStatistics() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getStatisticsStream() throws android.os.RemoteException { return null; }
            public boolean isCharging() throws android.os.RemoteException { return false; }
            public long computeBatteryTimeRemaining() throws android.os.RemoteException { return 0L; }
            public long computeChargeTimeRemaining() throws android.os.RemoteException { return 0L; }
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
            public void notePhoneDataConnectionState(int p0, boolean p1, int p2) throws android.os.RemoteException {}
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
            public void noteNetworkInterfaceType(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void noteNetworkStatsEnabled() throws android.os.RemoteException {}
            public void noteDeviceIdleMode(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setBatteryState(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8) throws android.os.RemoteException {}
            public long getAwakeTimeBattery() throws android.os.RemoteException { return 0L; }
            public long getAwakeTimePlugged() throws android.os.RemoteException { return 0L; }
            public void noteBleScanStarted(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException {}
            public void noteBleScanStopped(android.os.WorkSource p0, boolean p1) throws android.os.RemoteException {}
            public void noteResetBleScan() throws android.os.RemoteException {}
            public void noteBleScanResults(android.os.WorkSource p0, int p1) throws android.os.RemoteException {}
            public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() throws android.os.RemoteException { return null; }
            public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() throws android.os.RemoteException { return null; }
            public android.os.connectivity.GpsBatteryStats getGpsBatteryStats() throws android.os.RemoteException { return null; }
            public android.os.health.HealthStatsParceler takeUidSnapshot(int p0) throws android.os.RemoteException { return null; }
            public android.os.health.HealthStatsParceler[] takeUidSnapshots(int[] p0) throws android.os.RemoteException { return null; }
            public void noteBluetoothControllerActivity(android.bluetooth.BluetoothActivityEnergyInfo p0) throws android.os.RemoteException {}
            public void noteModemControllerActivity(android.telephony.ModemActivityInfo p0) throws android.os.RemoteException {}
            public void noteWifiControllerActivity(android.os.connectivity.WifiActivityEnergyInfo p0) throws android.os.RemoteException {}
            public boolean setChargingStateUpdateDelayMillis(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
