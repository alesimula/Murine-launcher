package com.android.internal.os;

public final class RailStats {
    private static final java.lang.String TAG = "RailStats";
    private static final java.lang.String WIFI_SUBSYSTEM = "wifi";
    private static final java.lang.String CELLULAR_SUBSYSTEM = "cellular";
    private java.util.Map<java.lang.Long, com.android.internal.os.RailStats.RailInfoData> mRailInfoData;
    private long mCellularTotalEnergyUseduWs;
    private long mWifiTotalEnergyUseduWs;
    private boolean mRailStatsAvailability;
    public RailStats() {}
    public void updateRailData(long p0, java.lang.String p1, java.lang.String p2, long p3, long p4) {}
    public void resetCellularTotalEnergyUsed() {}
    public void resetWifiTotalEnergyUsed() {}
    public long getCellularTotalEnergyUseduWs() { return 0L; }
    public long getWifiTotalEnergyUseduWs() { return 0L; }
    public void reset() {}
    public com.android.internal.os.RailStats getRailStats() { return null; }
    public void setRailStatsAvailability(boolean p0) {}
    public boolean isRailStatsAvailable() { return false; }

    public static class RailInfoData {
        private static final java.lang.String TAG = "RailInfoData";
        public long index;
        public java.lang.String railName;
        public java.lang.String subSystemName;
        public long timestampSinceBootMs;
        public long energyUsedSinceBootuWs;
        private RailInfoData(long p0, java.lang.String p1, java.lang.String p2, long p3, long p4) {}
        public void printData() {}
    }
}
