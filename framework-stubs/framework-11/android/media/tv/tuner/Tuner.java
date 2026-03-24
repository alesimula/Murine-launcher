package android.media.tv.tuner;

@android.annotation.SystemApi
public class Tuner implements java.lang.AutoCloseable {
    public static final int INVALID_TS_PID = 65535;
    public static final int INVALID_STREAM_ID = 65535;
    public static final int INVALID_FILTER_ID = -1;
    public static final int INVALID_AV_SYNC_ID = -1;
    public static final long INVALID_TIMESTAMP = -1L;
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
    private static final java.lang.String TAG = "MediaTvTuner";
    private static final boolean DEBUG = false;
    private static final int MSG_RESOURCE_LOST = 1;
    private static final int MSG_ON_FILTER_EVENT = 2;
    private static final int MSG_ON_FILTER_STATUS = 3;
    private static final int MSG_ON_LNB_EVENT = 4;
    public static final int DVR_TYPE_RECORD = 0;
    public static final int DVR_TYPE_PLAYBACK = 1;
    private final android.content.Context mContext = null;
    private final android.media.tv.tunerresourcemanager.TunerResourceManager mTunerResourceManager = null;
    private final int mClientId = 0;
    private android.media.tv.tuner.Tuner.Frontend mFrontend;
    private android.media.tv.tuner.Tuner.EventHandler mHandler;
    private android.media.tv.tuner.frontend.FrontendInfo mFrontendInfo;
    private java.lang.Integer mFrontendHandle;
    private int mFrontendType;
    private int mUserId;
    private android.media.tv.tuner.Lnb mLnb;
    private java.lang.Integer mLnbHandle;
    private android.media.tv.tuner.frontend.OnTuneEventListener mOnTuneEventListener;
    private java.util.concurrent.Executor mOnTunerEventExecutor;
    private android.media.tv.tuner.frontend.ScanCallback mScanCallback;
    private java.util.concurrent.Executor mScanCallbackExecutor;
    private android.media.tv.tuner.Tuner.OnResourceLostListener mOnResourceLostListener;
    private java.util.concurrent.Executor mOnResourceLostListenerExecutor;
    private java.lang.Integer mDemuxHandle;
    private java.util.Map<java.lang.Integer, android.media.tv.tuner.Descrambler> mDescramblers;
    private java.util.List<android.media.tv.tuner.filter.Filter> mFilters;
    private final android.media.tv.tunerresourcemanager.TunerResourceManager.ResourcesReclaimListener mResourceListener = null;
    private long mNativeContext;
    public Tuner(android.content.Context p0, java.lang.String p1, int p2) {}
    private void setFrontendInfoList() {}
    public java.util.List<java.lang.Integer> getFrontendIds() { return null; }
    private void setLnbIds() {}
    public void setResourceLostListener(java.util.concurrent.Executor p0, android.media.tv.tuner.Tuner.OnResourceLostListener p1) {}
    public void clearResourceLostListener() {}
    public void shareFrontendFromTuner(android.media.tv.tuner.Tuner p0) {}
    public void updateResourcePriority(int p0, int p1) {}
    public void close() {}
    private static native void nativeInit();
    private native void nativeSetup();
    private native java.util.List<java.lang.Integer> nativeGetFrontendIds();
    private native android.media.tv.tuner.Tuner.Frontend nativeOpenFrontendByHandle(int p0);
    private native int nativeCloseFrontendByHandle(int p0);
    private native int nativeTune(int p0, android.media.tv.tuner.frontend.FrontendSettings p1);
    private native int nativeStopTune();
    private native int nativeScan(int p0, android.media.tv.tuner.frontend.FrontendSettings p1, int p2);
    private native int nativeStopScan();
    private native int nativeSetLnb(int p0);
    private native int nativeSetLna(boolean p0);
    private native android.media.tv.tuner.frontend.FrontendStatus nativeGetFrontendStatus(int[] p0);
    private native java.lang.Integer nativeGetAvSyncHwId(android.media.tv.tuner.filter.Filter p0);
    private native java.lang.Long nativeGetAvSyncTime(int p0);
    private native int nativeConnectCiCam(int p0);
    private native int nativeDisconnectCiCam();
    private native android.media.tv.tuner.frontend.FrontendInfo nativeGetFrontendInfo(int p0);
    private native android.media.tv.tuner.filter.Filter nativeOpenFilter(int p0, int p1, long p2);
    private native android.media.tv.tuner.filter.TimeFilter nativeOpenTimeFilter();
    private native int[] nativeGetLnbIds();
    private native android.media.tv.tuner.Lnb nativeOpenLnbByHandle(int p0);
    private native android.media.tv.tuner.Lnb nativeOpenLnbByName(java.lang.String p0);
    private native android.media.tv.tuner.Descrambler nativeOpenDescramblerByHandle(int p0);
    private native int nativeOpenDemuxByhandle(int p0);
    private native android.media.tv.tuner.dvr.DvrRecorder nativeOpenDvrRecorder(long p0);
    private native android.media.tv.tuner.dvr.DvrPlayback nativeOpenDvrPlayback(long p0);
    private native android.media.tv.tuner.DemuxCapabilities nativeGetDemuxCapabilities();
    private native int nativeCloseDemux(int p0);
    private native int nativeCloseFrontend(int p0);
    private native int nativeClose();
    private android.media.tv.tuner.Tuner.EventHandler createEventHandler() { return null; }
    public void setOnTuneEventListener(java.util.concurrent.Executor p0, android.media.tv.tuner.frontend.OnTuneEventListener p1) {}
    public void clearOnTuneEventListener() {}
    public int tune(android.media.tv.tuner.frontend.FrontendSettings p0) { return 0; }
    public int cancelTuning() { return 0; }
    public int scan(android.media.tv.tuner.frontend.FrontendSettings p0, int p1, java.util.concurrent.Executor p2, android.media.tv.tuner.frontend.ScanCallback p3) { return 0; }
    public int cancelScanning() { return 0; }
    private boolean requestFrontend() { return false; }
    private int setLnb(android.media.tv.tuner.Lnb p0) { return 0; }
    public int setLnaEnabled(boolean p0) { return 0; }
    public android.media.tv.tuner.frontend.FrontendStatus getFrontendStatus(int[] p0) { return null; }
    public int getAvSyncHwId(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public long getAvSyncTime(int p0) { return 0L; }
    public int connectCiCam(int p0) { return 0; }
    public int disconnectCiCam() { return 0; }
    public android.media.tv.tuner.frontend.FrontendInfo getFrontendInfo() { return null; }
    public android.media.tv.tuner.frontend.FrontendInfo getFrontendInfoById(int p0) { return null; }
    public android.media.tv.tuner.DemuxCapabilities getDemuxCapabilities() { return null; }
    private void onFrontendEvent(int p0) {}
    private void onLocked() {}
    private void onScanStopped() {}
    private void onProgress(int p0) {}
    private void onFrequenciesReport(int[] p0) {}
    private void onSymbolRates(int[] p0) {}
    private void onHierarchy(int p0) {}
    private void onSignalType(int p0) {}
    private void onPlpIds(int[] p0) {}
    private void onGroupIds(int[] p0) {}
    private void onInputStreamIds(int[] p0) {}
    private void onDvbsStandard(int p0) {}
    private void onDvbtStandard(int p0) {}
    private void onAnalogSifStandard(int p0) {}
    private void onAtsc3PlpInfos(android.media.tv.tuner.frontend.Atsc3PlpInfo[] p0) {}
    public android.media.tv.tuner.filter.Filter openFilter(int p0, int p1, long p2, java.util.concurrent.Executor p3, android.media.tv.tuner.filter.FilterCallback p4) { return null; }
    public android.media.tv.tuner.Lnb openLnb(java.util.concurrent.Executor p0, android.media.tv.tuner.LnbCallback p1) { return null; }
    public android.media.tv.tuner.Lnb openLnbByName(java.lang.String p0, java.util.concurrent.Executor p1, android.media.tv.tuner.LnbCallback p2) { return null; }
    private boolean requestLnb() { return false; }
    public android.media.tv.tuner.filter.TimeFilter openTimeFilter() { return null; }
    public android.media.tv.tuner.Descrambler openDescrambler() { return null; }
    public android.media.tv.tuner.dvr.DvrRecorder openDvrRecorder(long p0, java.util.concurrent.Executor p1, android.media.tv.tuner.dvr.OnRecordStatusChangedListener p2) { return null; }
    public android.media.tv.tuner.dvr.DvrPlayback openDvrPlayback(long p0, java.util.concurrent.Executor p1, android.media.tv.tuner.dvr.OnPlaybackStatusChangedListener p2) { return null; }
    private boolean requestDemux() { return false; }
    private android.media.tv.tuner.Descrambler requestDescrambler() { return null; }
    private boolean checkResource(int p0) { return false; }
    void releaseLnb() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DvrType {
    }

    private class EventHandler extends android.os.Handler {
        private EventHandler(android.media.tv.tuner.Tuner p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class Frontend {
        private int mId;
        private Frontend(android.media.tv.tuner.Tuner p0, int p1) {}
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
