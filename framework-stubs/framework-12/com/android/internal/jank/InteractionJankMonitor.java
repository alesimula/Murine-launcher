package com.android.internal.jank;

public class InteractionJankMonitor {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private static final java.lang.String ACTION_PREFIX = null;
    private static final java.lang.String DEFAULT_WORKER_NAME = null;
    private static final long DEFAULT_TIMEOUT_MS = Long.valueOf(0L);
    private static final java.lang.String SETTINGS_ENABLED_KEY = "enabled";
    private static final java.lang.String SETTINGS_SAMPLING_INTERVAL_KEY = "sampling_interval";
    private static final java.lang.String SETTINGS_THRESHOLD_MISSED_FRAMES_KEY = "trace_threshold_missed_frames";
    private static final java.lang.String SETTINGS_THRESHOLD_FRAME_TIME_MILLIS_KEY = "trace_threshold_frame_time_millis";
    private static final boolean DEFAULT_ENABLED = Boolean.valueOf(false);
    private static final int DEFAULT_SAMPLING_INTERVAL = 1;
    private static final int DEFAULT_TRACE_THRESHOLD_MISSED_FRAMES = 3;
    private static final int DEFAULT_TRACE_THRESHOLD_FRAME_TIME_MILLIS = 64;
    public static final java.lang.String ACTION_SESSION_BEGIN = null;
    public static final java.lang.String ACTION_SESSION_END = null;
    public static final java.lang.String ACTION_SESSION_CANCEL = null;
    public static final java.lang.String ACTION_METRICS_LOGGED = null;
    public static final java.lang.String BUNDLE_KEY_CUJ_NAME = null;
    public static final java.lang.String BUNDLE_KEY_TIMESTAMP = null;
    public static final java.lang.String PROP_NOTIFY_CUJ_EVENT = "debug.jank.notify_cuj_events";
    public static final int CUJ_NOTIFICATION_SHADE_EXPAND_COLLAPSE = 0;
    public static final int CUJ_NOTIFICATION_SHADE_EXPAND_COLLAPSE_LOCK = 1;
    public static final int CUJ_NOTIFICATION_SHADE_SCROLL_FLING = 2;
    public static final int CUJ_NOTIFICATION_SHADE_ROW_EXPAND = 3;
    public static final int CUJ_NOTIFICATION_SHADE_ROW_SWIPE = 4;
    public static final int CUJ_NOTIFICATION_SHADE_QS_EXPAND_COLLAPSE = 5;
    public static final int CUJ_NOTIFICATION_SHADE_QS_SCROLL_SWIPE = 6;
    public static final int CUJ_LAUNCHER_APP_LAUNCH_FROM_RECENTS = 7;
    public static final int CUJ_LAUNCHER_APP_LAUNCH_FROM_ICON = 8;
    public static final int CUJ_LAUNCHER_APP_CLOSE_TO_HOME = 9;
    public static final int CUJ_LAUNCHER_APP_CLOSE_TO_PIP = 10;
    public static final int CUJ_LAUNCHER_QUICK_SWITCH = 11;
    public static final int CUJ_NOTIFICATION_HEADS_UP_APPEAR = 12;
    public static final int CUJ_NOTIFICATION_HEADS_UP_DISAPPEAR = 13;
    public static final int CUJ_NOTIFICATION_ADD = 14;
    public static final int CUJ_NOTIFICATION_REMOVE = 15;
    public static final int CUJ_NOTIFICATION_APP_START = 16;
    public static final int CUJ_LOCKSCREEN_PASSWORD_APPEAR = 17;
    public static final int CUJ_LOCKSCREEN_PATTERN_APPEAR = 18;
    public static final int CUJ_LOCKSCREEN_PIN_APPEAR = 19;
    public static final int CUJ_LOCKSCREEN_PASSWORD_DISAPPEAR = 20;
    public static final int CUJ_LOCKSCREEN_PATTERN_DISAPPEAR = 21;
    public static final int CUJ_LOCKSCREEN_PIN_DISAPPEAR = 22;
    public static final int CUJ_LOCKSCREEN_TRANSITION_FROM_AOD = 23;
    public static final int CUJ_LOCKSCREEN_TRANSITION_TO_AOD = 24;
    public static final int CUJ_LAUNCHER_OPEN_ALL_APPS = 25;
    public static final int CUJ_LAUNCHER_ALL_APPS_SCROLL = 26;
    public static final int CUJ_LAUNCHER_APP_LAUNCH_FROM_WIDGET = 27;
    public static final int CUJ_SETTINGS_PAGE_SCROLL = 28;
    public static final int CUJ_LOCKSCREEN_UNLOCK_ANIMATION = 29;
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_HISTORY_BUTTON = 30;
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_MEDIA_PLAYER = 31;
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_QS_TILE = 32;
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_SETTINGS_BUTTON = 33;
    public static final int CUJ_STATUS_BAR_APP_LAUNCH_FROM_CALL_CHIP = 34;
    private static final int NO_STATSD_LOGGING = -1;
    public static final int[] CUJ_TO_STATSD_INTERACTION_TYPE = null;
    private static volatile com.android.internal.jank.InteractionJankMonitor sInstance;
    private final android.provider.DeviceConfig.OnPropertiesChangedListener mPropertiesChangedListener = null;
    private com.android.internal.jank.FrameTracker.FrameMetricsWrapper mMetrics;
    private android.util.SparseArray<com.android.internal.jank.FrameTracker> mRunningTrackers;
    private android.util.SparseArray<java.lang.Runnable> mTimeoutActions;
    private android.os.HandlerThread mWorker;
    private boolean mEnabled;
    private int mSamplingInterval;
    private int mTraceThresholdMissedFrames;
    private int mTraceThresholdFrameTimeMillis;
    public static com.android.internal.jank.InteractionJankMonitor getInstance() { return null; }
    public InteractionJankMonitor(android.os.HandlerThread p0) {}
    public com.android.internal.jank.FrameTracker createFrameTracker(com.android.internal.jank.InteractionJankMonitor.Configuration p0, com.android.internal.jank.InteractionJankMonitor.Session p1) { return null; }
    private void handleCujEvents(android.content.Context p0, java.lang.String p1, com.android.internal.jank.InteractionJankMonitor.Session p2) {}
    private boolean needRemoveTasks(java.lang.String p0, com.android.internal.jank.InteractionJankMonitor.Session p1) { return false; }
    private void notifyEvents(android.content.Context p0, java.lang.String p1, com.android.internal.jank.InteractionJankMonitor.Session p2) {}
    private void removeTimeout(int p0) {}
    public boolean begin(android.view.View p0, int p1) { return false; }
    public boolean begin(com.android.internal.jank.InteractionJankMonitor.Configuration.Builder p0) { return false; }
    private boolean beginInternal(com.android.internal.jank.InteractionJankMonitor.Configuration p0) { return false; }
    public boolean end(int p0) { return false; }
    public boolean cancel(int p0) { return false; }
    private com.android.internal.jank.FrameTracker getTracker(int p0) { return null; }
    private void removeTracker(int p0) {}
    private void updateProperties(android.provider.DeviceConfig.Properties p0) {}
    public android.provider.DeviceConfig.OnPropertiesChangedListener getPropertiesChangedListener() { return null; }
    public void trigger(com.android.internal.jank.InteractionJankMonitor.Session p0) {}
    public static java.lang.String getNameOfInteraction(int p0) { return null; }
    public static java.lang.String getNameOfCuj(int p0) { return null; }

    public static class Configuration {
        private final android.view.View mView = null;
        private final long mTimeout = 0L;
        private final java.lang.String mTag = null;
        private final int mCujType = 0;
        private Configuration(int p0, android.view.View p1, java.lang.String p2, long p3) {}
        private void validate() {}

        public static class Builder {
            private android.view.View mAttrView;
            private long mAttrTimeout;
            private java.lang.String mAttrTag;
            private int mAttrCujType;
            public Builder(int p0) {}
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setView(android.view.View p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setTimeout(long p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setTag(java.lang.String p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration build() throws java.lang.IllegalArgumentException { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CujType {
    }

    public static class Session {
        private final int mCujType = 0;
        private final long mTimeStamp = 0L;
        private int mReason;
        private final boolean mShouldNotify = false;
        private final java.lang.String mName = null;
        public Session(int p0, java.lang.String p1) {}
        public int getCuj() { return 0; }
        public int getStatsdInteractionType() { return 0; }
        public boolean logToStatsd() { return false; }
        public java.lang.String getPerfettoTrigger() { return null; }
        public java.lang.String getName() { return null; }
        public long getTimeStamp() { return 0L; }
        public void setReason(int p0) {}
        public int getReason() { return 0; }
        public boolean shouldNotify() { return false; }
    }
}
