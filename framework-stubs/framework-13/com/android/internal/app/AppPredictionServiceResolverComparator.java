package com.android.internal.app;

abstract class AppPredictionServiceResolverComparator extends com.android.internal.app.AbstractResolverComparator {
    AppPredictionServiceResolverComparator(android.content.Context p0, android.content.Intent p1, java.lang.String p2, android.app.prediction.AppPredictor p3, android.os.UserHandle p4, com.android.internal.app.ChooserActivityLogger p5) { super(null, null); }
    int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    void handleResultMessage(android.os.Message p0) {}
    float getScore(android.content.ComponentName p0) { return 0.0f; }
    void updateModel(android.content.ComponentName p0) {}
    void destroy() {}

    static class AppPredictionServiceComparatorModel implements com.android.internal.app.ResolverComparatorModel {
        AppPredictionServiceComparatorModel(android.app.prediction.AppPredictor p0, com.android.internal.app.ResolverRankerServiceResolverComparator p1, android.os.UserHandle p2, java.util.Map<android.content.ComponentName, java.lang.Integer> p3) {}
        public java.util.Comparator<android.content.pm.ResolveInfo> getComparator() { return null; }
        public float getScore(android.content.ComponentName p0) { return 0.0f; }
        public void notifyOnTargetSelected(android.content.ComponentName p0) {}
    }
}
