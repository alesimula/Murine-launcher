package com.android.internal.app;

abstract class ResolverRankerServiceResolverComparator extends com.android.internal.app.AbstractResolverComparator {
    public ResolverRankerServiceResolverComparator(android.content.Context p0, android.content.Intent p1, java.lang.String p2, com.android.internal.app.AbstractResolverComparator.AfterCompute p3, com.android.internal.app.ChooserActivityLogger p4) { super(null, null); }
    public void handleResultMessage(android.os.Message p0) {}
    public void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    public int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    public float getScore(android.content.ComponentName p0) { return 0.0f; }
    public void updateModel(android.content.ComponentName p0) {}
    public void destroy() {}
    void beforeCompute() {}
    static boolean isPersistentProcess(com.android.internal.app.ResolverActivity.ResolvedComponentInfo p0) { return false; }

    static class ResolverRankerServiceComparatorModel implements com.android.internal.app.ResolverComparatorModel {
        ResolverRankerServiceComparatorModel(java.util.Map<java.lang.String, android.app.usage.UsageStats> p0, java.util.Map<android.content.ComponentName, android.service.resolver.ResolverTarget> p1, java.util.List<android.service.resolver.ResolverTarget> p2, java.text.Collator p3, android.service.resolver.IResolverRankerService p4, android.content.ComponentName p5, boolean p6, android.content.pm.PackageManager p7) {}
        public java.util.Comparator<android.content.pm.ResolveInfo> getComparator() { return null; }
        public float getScore(android.content.ComponentName p0) { return 0.0f; }
        public void notifyOnTargetSelected(android.content.ComponentName p0) {}
    }

    private class ResolverRankerServiceConnection implements android.content.ServiceConnection {
        public final android.service.resolver.IResolverRankerResult resolverRankerResult = null;
        public ResolverRankerServiceConnection(com.android.internal.app.ResolverRankerServiceResolverComparator p0, java.util.concurrent.CountDownLatch p1) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void destroy() {}
    }
}
