package com.android.server;

public interface DeviceIdleInternal {
    public void onConstraintStateChanged(com.android.server.deviceidle.IDeviceIdleConstraint p0, boolean p1);
    public void registerDeviceIdleConstraint(com.android.server.deviceidle.IDeviceIdleConstraint p0, java.lang.String p1, int p2);
    public void unregisterDeviceIdleConstraint(com.android.server.deviceidle.IDeviceIdleConstraint p0);
    public void exitIdle(java.lang.String p0);
    public void addPowerSaveTempWhitelistApp(int p0, java.lang.String p1, long p2, int p3, boolean p4, int p5, java.lang.String p6);
    public void addPowerSaveTempWhitelistApp(int p0, java.lang.String p1, long p2, int p3, int p4, boolean p5, int p6, java.lang.String p7);
    public void addPowerSaveTempWhitelistAppDirect(int p0, long p1, int p2, boolean p3, int p4, java.lang.String p5, int p6);
    public long getNotificationAllowlistDuration();
    public void setJobsActive(boolean p0);
    public void setAlarmsActive(boolean p0);
    public boolean isAppOnWhitelist(int p0);
    public int[] getPowerSaveWhitelistUserAppIds();
    public int[] getPowerSaveTempWhitelistAppIds();
    public void registerStationaryListener(com.android.server.DeviceIdleInternal.StationaryListener p0);
    public void unregisterStationaryListener(com.android.server.DeviceIdleInternal.StationaryListener p0);
    public int getTempAllowListType(int p0, int p1);

    public static interface StationaryListener {
        public void onDeviceStationaryChanged(boolean p0);
    }
}
