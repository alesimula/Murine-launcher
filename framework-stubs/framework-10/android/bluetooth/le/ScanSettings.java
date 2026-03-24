package android.bluetooth.le;

public final class ScanSettings implements android.os.Parcelable {
    public static final int SCAN_MODE_OPPORTUNISTIC = -1;
    public static final int SCAN_MODE_LOW_POWER = 0;
    public static final int SCAN_MODE_BALANCED = 1;
    public static final int SCAN_MODE_LOW_LATENCY = 2;
    public static final int CALLBACK_TYPE_ALL_MATCHES = 1;
    public static final int CALLBACK_TYPE_FIRST_MATCH = 2;
    public static final int CALLBACK_TYPE_MATCH_LOST = 4;
    public static final int MATCH_NUM_ONE_ADVERTISEMENT = 1;
    public static final int MATCH_NUM_FEW_ADVERTISEMENT = 2;
    public static final int MATCH_NUM_MAX_ADVERTISEMENT = 3;
    public static final int MATCH_MODE_AGGRESSIVE = 1;
    public static final int MATCH_MODE_STICKY = 2;
    @android.annotation.SystemApi
    public static final int SCAN_RESULT_TYPE_FULL = 0;
    @android.annotation.SystemApi
    public static final int SCAN_RESULT_TYPE_ABBREVIATED = 1;
    public static final int PHY_LE_ALL_SUPPORTED = 255;
    private int mScanMode;
    private int mCallbackType;
    private int mScanResultType;
    private long mReportDelayMillis;
    private int mMatchMode;
    private int mNumOfMatchesPerFilter;
    private boolean mLegacy;
    private int mPhy;
    public static final android.os.Parcelable.Creator<android.bluetooth.le.ScanSettings> CREATOR = null;
    public int getScanMode() { return 0; }
    public int getCallbackType() { return 0; }
    public int getScanResultType() { return 0; }
    public int getMatchMode() { return 0; }
    public int getNumOfMatches() { return 0; }
    public boolean getLegacy() { return false; }
    public int getPhy() { return 0; }
    public long getReportDelayMillis() { return 0L; }
    private ScanSettings(int p0, int p1, int p2, long p3, int p4, int p5, boolean p6, int p7) {}
    private ScanSettings(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        private int mScanMode;
        private int mCallbackType;
        private int mScanResultType;
        private long mReportDelayMillis;
        private int mMatchMode;
        private int mNumOfMatchesPerFilter;
        private boolean mLegacy;
        private int mPhy;
        public Builder() {}
        public android.bluetooth.le.ScanSettings.Builder setScanMode(int p0) { return null; }
        public android.bluetooth.le.ScanSettings.Builder setCallbackType(int p0) { return null; }
        private boolean isValidCallbackType(int p0) { return false; }
        @android.annotation.SystemApi
        public android.bluetooth.le.ScanSettings.Builder setScanResultType(int p0) { return null; }
        public android.bluetooth.le.ScanSettings.Builder setReportDelay(long p0) { return null; }
        public android.bluetooth.le.ScanSettings.Builder setNumOfMatches(int p0) { return null; }
        public android.bluetooth.le.ScanSettings.Builder setMatchMode(int p0) { return null; }
        public android.bluetooth.le.ScanSettings.Builder setLegacy(boolean p0) { return null; }
        public android.bluetooth.le.ScanSettings.Builder setPhy(int p0) { return null; }
        public android.bluetooth.le.ScanSettings build() { return null; }
    }
}
