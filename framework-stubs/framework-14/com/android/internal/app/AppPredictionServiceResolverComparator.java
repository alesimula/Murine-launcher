package com.android.internal.app;

abstract class AppPredictionServiceResolverComparator extends com.android.internal.app.AbstractResolverComparator {
    AppPredictionServiceResolverComparator(android.content.Context p0, android.content.Intent p1, java.lang.String p2, android.app.prediction.AppPredictor p3, android.os.UserHandle p4, com.android.internal.app.ChooserActivityLogger p5) { super((android.content.Context)null, (android.content.Intent)null, (android.os.UserHandle)null); }
    void destroy() {}
    int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    float getScore(com.android.internal.app.chooser.TargetInfo p0) { return 0.0f; }
    void updateModel(com.android.internal.app.chooser.TargetInfo p0) {}
    void handleResultMessage(android.os.Message p0) {}
    void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}

    static class AppPredictionServiceComparatorModel implements com.android.internal.app.ResolverComparatorModel {
        AppPredictionServiceComparatorModel(android.app.prediction.AppPredictor p0, android.os.UserHandle p1, java.util.Map<android.content.ComponentName, java.lang.Integer> p2) {}
        public java.util.Comparator<android.content.pm.ResolveInfo> getComparator() { return null; }
        public float getScore(com.android.internal.app.chooser.TargetInfo p0) { return 0.0f; }
        public void notifyOnTargetSelected(com.android.internal.app.chooser.TargetInfo p0) {}
    }

    static class ModelBuilder {
        ModelBuilder(android.app.prediction.AppPredictor p0, android.os.UserHandle p1) {}
        com.android.internal.app.ResolverComparatorModel buildFromRankedList(java.util.List<android.app.prediction.AppTarget> p0) { return null; }
        com.android.internal.app.ResolverComparatorModel buildFallbackModel(com.android.internal.app.ResolverRankerServiceResolverComparator p0) { return null; }
    }
}
