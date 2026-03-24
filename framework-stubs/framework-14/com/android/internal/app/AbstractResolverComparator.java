package com.android.internal.app;

public abstract class AbstractResolverComparator implements java.util.Comparator<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> {
    protected com.android.internal.app.AbstractResolverComparator.AfterCompute mAfterCompute;
    protected final java.util.Map<android.os.UserHandle, android.content.pm.PackageManager> mPmMap = null;
    protected final java.util.Map<android.os.UserHandle, android.app.usage.UsageStatsManager> mUsmMap = null;
    protected java.lang.String[] mAnnotations;
    protected java.lang.String mContentType;
    static final int RANKER_SERVICE_RESULT = 0;
    static final int RANKER_RESULT_TIMEOUT = 1;
    protected final android.os.Handler mHandler = null;
    public AbstractResolverComparator(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    public AbstractResolverComparator(android.content.Context p0, android.content.Intent p1, java.util.List<android.os.UserHandle> p2) {}
    void setCallBack(com.android.internal.app.AbstractResolverComparator.AfterCompute p0) {}
    void setChooserActivityLogger(com.android.internal.app.ChooserActivityLogger p0) {}
    com.android.internal.app.ChooserActivityLogger getChooserActivityLogger() { return null; }
    protected final void afterCompute() {}
    public final int compare(com.android.internal.app.ResolverActivity.ResolvedComponentInfo p0, com.android.internal.app.ResolverActivity.ResolvedComponentInfo p1) { return 0; }
    abstract int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1);
    final void compute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    abstract void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0);
    abstract float getScore(com.android.internal.app.chooser.TargetInfo p0);
    abstract void handleResultMessage(android.os.Message p0);
    final void updateChooserCounts(java.lang.String p0, android.os.UserHandle p1, java.lang.String p2) {}
    void updateModel(com.android.internal.app.chooser.TargetInfo p0) {}
    void beforeCompute() {}
    void destroy() {}

    static interface AfterCompute {
        public void afterCompute();
    }

    abstract class AzInfoComparator implements java.util.Comparator<android.content.pm.ResolveInfo> {
        java.text.Collator mCollator;
        AzInfoComparator(com.android.internal.app.AbstractResolverComparator p0, android.content.Context p1) {}
        public int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    }
}
