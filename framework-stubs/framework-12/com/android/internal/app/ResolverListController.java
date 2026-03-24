package com.android.internal.app;

public class ResolverListController {
    private final android.content.Context mContext = null;
    private final android.content.pm.PackageManager mpm = null;
    private final int mLaunchedFromUid = 0;
    private final android.content.Intent mTargetIntent = null;
    private final java.lang.String mReferrerPackage = null;
    private static final java.lang.String TAG = "ResolverListController";
    private static final boolean DEBUG = false;
    private final android.os.UserHandle mUserHandle = null;
    private com.android.internal.app.AbstractResolverComparator mResolverComparator;
    private boolean isComputed;
    public ResolverListController(android.content.Context p0, android.content.pm.PackageManager p1, android.content.Intent p2, java.lang.String p3, int p4, android.os.UserHandle p5) {}
    public ResolverListController(android.content.Context p0, android.content.pm.PackageManager p1, android.content.Intent p2, java.lang.String p3, int p4, android.os.UserHandle p5, com.android.internal.app.AbstractResolverComparator p6) {}
    public android.content.pm.ResolveInfo getLastChosen() throws android.os.RemoteException { return null; }
    public void setLastChosen(android.content.Intent p0, android.content.IntentFilter p1, int p2) throws android.os.RemoteException {}
    public java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> getResolversForIntent(boolean p0, boolean p1, java.util.List<android.content.Intent> p2) { return null; }
    public java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> getResolversForIntentAsUser(boolean p0, boolean p1, java.util.List<android.content.Intent> p2, android.os.UserHandle p3) { return null; }
    private java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> getResolversForIntentAsUserInternal(java.util.List<android.content.Intent> p0, android.os.UserHandle p1, int p2) { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public void addResolveListDedupe(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, android.content.Intent p1, java.util.List<android.content.pm.ResolveInfo> p2) {}
    public boolean isComponentPinned(android.content.ComponentName p0) { return false; }
    public java.util.ArrayList<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> filterIneligibleActivities(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, boolean p1) { return null; }
    public java.util.ArrayList<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> filterLowPriority(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, boolean p1) { return null; }
    private void compute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) throws java.lang.InterruptedException {}
    public void sort(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    public void topK(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0, int p1) {}
    private static boolean isSameResolvedComponent(android.content.pm.ResolveInfo p0, com.android.internal.app.ResolverActivity.ResolvedComponentInfo p1) { return false; }
    boolean isComponentFiltered(android.content.ComponentName p0) { return false; }
    public float getScore(com.android.internal.app.chooser.DisplayResolveInfo p0) { return 0.0f; }
    public float getScore(android.content.ComponentName p0) { return 0.0f; }
    public java.util.List<android.content.ComponentName> getTopComponentNames(int p0) { return null; }
    public void updateModel(android.content.ComponentName p0) {}
    public void updateChooserCounts(java.lang.String p0, int p1, java.lang.String p2) {}
    public void destroy() {}

    private class ComputeCallback implements com.android.internal.app.AbstractResolverComparator.AfterCompute {
        private java.util.concurrent.CountDownLatch mFinishComputeSignal;
        public ComputeCallback(com.android.internal.app.ResolverListController p0, java.util.concurrent.CountDownLatch p1) {}
        public void afterCompute() {}
    }
}
