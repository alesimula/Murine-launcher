package com.android.internal.app;

class ResolverRankerServiceResolverComparator extends com.android.internal.app.AbstractResolverComparator {
    private static final java.lang.String TAG = "RRSResolverComparator";
    private static final boolean DEBUG = false;
    private static final long USAGE_STATS_PERIOD = 604800000L;
    private static final long RECENCY_TIME_PERIOD = 43200000L;
    private static final float RECENCY_MULTIPLIER = 2.0f;
    private static final int CONNECTION_COST_TIMEOUT_MILLIS = 200;
    private final java.text.Collator mCollator = null;
    private final java.util.Map<java.lang.String, android.app.usage.UsageStats> mStats = null;
    private final long mCurrentTime = 0L;
    private final long mSinceTime = 0L;
    private final java.util.LinkedHashMap<android.content.ComponentName, android.service.resolver.ResolverTarget> mTargetsDict = null;
    private final java.lang.String mReferrerPackage = null;
    private final java.lang.Object mLock = null;
    private java.util.ArrayList<android.service.resolver.ResolverTarget> mTargets;
    private java.lang.String mAction;
    private android.content.ComponentName mResolvedRankerName;
    private android.content.ComponentName mRankerServiceName;
    private android.service.resolver.IResolverRankerService mRanker;
    private com.android.internal.app.ResolverRankerServiceResolverComparator.ResolverRankerServiceConnection mConnection;
    private android.content.Context mContext;
    private java.util.concurrent.CountDownLatch mConnectSignal;
    public ResolverRankerServiceResolverComparator(android.content.Context p0, android.content.Intent p1, java.lang.String p2, com.android.internal.app.AbstractResolverComparator.AfterCompute p3) { super(null, null); }
    public void handleResultMessage(android.os.Message p0) {}
    public void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    public int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    public float getScore(android.content.ComponentName p0) { return 0.0f; }
    java.util.List<android.content.ComponentName> getTopComponentNames(int p0) { return null; }
    public void updateModel(android.content.ComponentName p0) {}
    public void destroy() {}
    private void logMetrics(int p0) {}
    private void initRanker(android.content.Context p0) {}
    private android.content.Intent resolveRankerService() { return null; }
    void beforeCompute() {}
    private void predictSelectProbabilities(java.util.List<android.service.resolver.ResolverTarget> p0) {}
    private void addDefaultSelectProbability(android.service.resolver.ResolverTarget p0) {}
    private void setFeatures(android.service.resolver.ResolverTarget p0, float p1, float p2, float p3, float p4) {}
    static boolean isPersistentProcess(com.android.internal.app.ResolverActivity.ResolvedComponentInfo p0) { return false; }

    private class ResolverRankerServiceConnection implements android.content.ServiceConnection {
        private final java.util.concurrent.CountDownLatch mConnectSignal = null;
        public final android.service.resolver.IResolverRankerResult resolverRankerResult = null;
        public ResolverRankerServiceConnection(com.android.internal.app.ResolverRankerServiceResolverComparator p0, java.util.concurrent.CountDownLatch p1) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void destroy() {}
    }
}
