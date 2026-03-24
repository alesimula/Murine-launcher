package android.media.tv.tuner;

@android.annotation.SystemApi
public class Tuner implements java.lang.AutoCloseable {
    public static final int INVALID_TS_PID = 65535;
    public static final int INVALID_STREAM_ID = 65535;
    public static final int INVALID_FILTER_ID = -1;
    public static final int INVALID_AV_SYNC_ID = -1;
    public static final long INVALID_TIMESTAMP = -1L;
    public static final int INVALID_MMTP_RECORD_EVENT_MPT_SEQUENCE_NUM = -1;
    public static final int INVALID_FIRST_MACROBLOCK_IN_SLICE = -1;
    public static final int INVALID_LTS_ID = -1;
    public static final long INVALID_FILTER_ID_LONG = -1L;
    public static final int INVALID_FRONTEND_SETTING_FREQUENCY = -1;
    public static final int INVALID_FRONTEND_ID = -1;
    public static final int INVALID_LNB_ID = -1;
    public static final byte[] VOID_KEYTOKEN = null;
    public static final int SCAN_TYPE_UNDEFINED = 0;
    public static final int SCAN_TYPE_AUTO = 1;
    public static final int SCAN_TYPE_BLIND = 2;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_UNAVAILABLE = 1;
    public static final int RESULT_NOT_INITIALIZED = 2;
    public static final int RESULT_INVALID_STATE = 3;
    public static final int RESULT_INVALID_ARGUMENT = 4;
    public static final int RESULT_OUT_OF_MEMORY = 5;
    public static final int RESULT_UNKNOWN_ERROR = 6;
    public static final int DVR_TYPE_RECORD = 0;
    public static final int DVR_TYPE_PLAYBACK = 1;
    @android.annotation.RequiresPermission("android.permission.ACCESS_TV_TUNER")
    public Tuner(android.content.Context p0, java.lang.String p1, int p2) {}
    public static int getTunerVersion() { return 0; }
    public java.util.List<java.lang.Integer> getFrontendIds() { return null; }
    public void setResourceLostListener(java.util.concurrent.Executor p0, android.media.tv.tuner.Tuner.OnResourceLostListener p1) {}
    public void clearResourceLostListener() {}
    public void shareFrontendFromTuner(android.media.tv.tuner.Tuner p0) {}
    public int transferOwner(android.media.tv.tuner.Tuner p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.TUNER_RESOURCE_ACCESS")
    public void updateResourcePriority(int p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.TUNER_RESOURCE_ACCESS")
    public boolean hasUnusedFrontend(int p0) { return false; }
    public boolean isLowestPriority(int p0) { return false; }
    long getNativeContext() { return 0L; }
    public void close() {}
    public void closeFrontend() {}
    public void setOnTuneEventListener(java.util.concurrent.Executor p0, android.media.tv.tuner.frontend.OnTuneEventListener p1) {}
    public void clearOnTuneEventListener() {}
    public int tune(android.media.tv.tuner.frontend.FrontendSettings p0) { return 0; }
    public int cancelTuning() { return 0; }
    public int scan(android.media.tv.tuner.frontend.FrontendSettings p0, int p1, java.util.concurrent.Executor p2, android.media.tv.tuner.frontend.ScanCallback p3) { return 0; }
    public int cancelScanning() { return 0; }
    public boolean isLnaSupported() { return false; }
    public int setLnaEnabled(boolean p0) { return 0; }
    public android.media.tv.tuner.frontend.FrontendStatus getFrontendStatus(int[] p0) { return null; }
    public int getAvSyncHwId(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public long getAvSyncTime(int p0) { return 0L; }
    public int connectCiCam(int p0) { return 0; }
    public int connectFrontendToCiCam(int p0) { return 0; }
    public int disconnectCiCam() { return 0; }
    public int disconnectFrontendToCiCam(int p0) { return 0; }
    public int removeOutputPid(int p0) { return 0; }
    public java.util.List<android.media.tv.tuner.frontend.FrontendStatusReadiness> getFrontendStatusReadiness(int[] p0) { return null; }
    public android.media.tv.tuner.frontend.FrontendInfo getFrontendInfo() { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.List<android.media.tv.tuner.frontend.FrontendInfo> getAvailableFrontendInfos() { return null; }
    public java.lang.String getCurrentFrontendHardwareInfo() { return null; }
    public int setMaxNumberOfFrontends(int p0, int p1) { return 0; }
    public int getMaxNumberOfFrontends(int p0) { return 0; }
    public android.media.tv.tuner.frontend.FrontendInfo getFrontendInfoById(int p0) { return null; }
    public android.media.tv.tuner.DemuxCapabilities getDemuxCapabilities() { return null; }
    public android.media.tv.tuner.DemuxInfo getCurrentDemuxInfo() { return null; }
    public android.media.tv.tuner.DemuxInfo getDesiredDemuxInfo() { return null; }
    public android.media.tv.tuner.filter.Filter openFilter(int p0, int p1, long p2, java.util.concurrent.Executor p3, android.media.tv.tuner.filter.FilterCallback p4) { return null; }
    public android.media.tv.tuner.Lnb openLnb(java.util.concurrent.Executor p0, android.media.tv.tuner.LnbCallback p1) { return null; }
    public android.media.tv.tuner.Lnb openLnbByName(java.lang.String p0, java.util.concurrent.Executor p1, android.media.tv.tuner.LnbCallback p2) { return null; }
    public android.media.tv.tuner.filter.TimeFilter openTimeFilter() { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_TV_DESCRAMBLER")
    public android.media.tv.tuner.Descrambler openDescrambler() { return null; }
    public android.media.tv.tuner.dvr.DvrRecorder openDvrRecorder(long p0, java.util.concurrent.Executor p1, android.media.tv.tuner.dvr.OnRecordStatusChangedListener p2) { return null; }
    public android.media.tv.tuner.dvr.DvrPlayback openDvrPlayback(long p0, java.util.concurrent.Executor p1, android.media.tv.tuner.dvr.OnPlaybackStatusChangedListener p2) { return null; }
    public int applyFrontend(android.media.tv.tuner.frontend.FrontendInfo p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_TV_SHARED_FILTER")
    public static android.media.tv.tuner.filter.SharedFilter openSharedFilter(android.content.Context p0, java.lang.String p1, java.util.concurrent.Executor p2, android.media.tv.tuner.filter.SharedFilterCallback p3) { return null; }
    public int configureDemux(android.media.tv.tuner.DemuxInfo p0) { return 0; }
    void releaseLnb() {}
    public int getClientId() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DvrType {
    }

    private class EventHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }

    private class Frontend {
    }

    public static interface OnResourceLostListener {
        public void onResourceLost(android.media.tv.tuner.Tuner p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Result {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanType {
    }
}
