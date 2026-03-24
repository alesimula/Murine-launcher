package com.android.internal.app;

abstract class AbstractResolverComparator implements java.util.Comparator<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> {
    private static final int NUM_OF_TOP_ANNOTATIONS_TO_USE = 3;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "AbstractResolverComp";
    protected com.android.internal.app.AbstractResolverComparator.AfterCompute mAfterCompute;
    protected final android.content.pm.PackageManager mPm = null;
    protected final android.app.usage.UsageStatsManager mUsm = null;
    protected java.lang.String[] mAnnotations;
    protected java.lang.String mContentType;
    private final boolean mHttp = false;
    private final java.lang.String mDefaultBrowserPackageName = null;
    static final int RANKER_SERVICE_RESULT = 0;
    static final int RANKER_RESULT_TIMEOUT = 1;
    private static final int WATCHDOG_TIMEOUT_MILLIS = 500;
    protected final android.os.Handler mHandler = null;
    AbstractResolverComparator(android.content.Context p0, android.content.Intent p1) {}
    private void getContentAnnotations(android.content.Intent p0) {}
    void setCallBack(com.android.internal.app.AbstractResolverComparator.AfterCompute p0) {}
    protected final void afterCompute() {}
    public final int compare(com.android.internal.app.ResolverActivity.ResolvedComponentInfo p0, com.android.internal.app.ResolverActivity.ResolvedComponentInfo p1) { return 0; }
    abstract int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1);
    final void compute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    abstract void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0);
    abstract float getScore(android.content.ComponentName p0);
    abstract void handleResultMessage(android.os.Message p0);
    final void updateChooserCounts(java.lang.String p0, int p1, java.lang.String p2) {}
    void updateModel(android.content.ComponentName p0) {}
    void beforeCompute() {}
    void destroy() {}
    private boolean isDefaultBrowser(android.content.pm.ResolveInfo p0) { return false; }

    static interface AfterCompute {
        public void afterCompute();
    }
}
