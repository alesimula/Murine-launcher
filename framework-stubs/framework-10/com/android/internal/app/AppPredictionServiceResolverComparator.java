package com.android.internal.app;

class AppPredictionServiceResolverComparator extends com.android.internal.app.AbstractResolverComparator {
    private static final java.lang.String TAG = "APSResolverComparator";
    private static final boolean DEBUG = false;
    private final android.app.prediction.AppPredictor mAppPredictor = null;
    private final android.content.Context mContext = null;
    private final java.util.Map<android.content.ComponentName, java.lang.Integer> mTargetRanks = null;
    private final android.os.UserHandle mUser = null;
    private final android.content.Intent mIntent = null;
    private final java.lang.String mReferrerPackage = null;
    private com.android.internal.app.ResolverRankerServiceResolverComparator mResolverRankerService;
    AppPredictionServiceResolverComparator(android.content.Context p0, android.content.Intent p1, java.lang.String p2, android.app.prediction.AppPredictor p3, android.os.UserHandle p4) { super(null, null); }
    int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    void handleResultMessage(android.os.Message p0) {}
    float getScore(android.content.ComponentName p0) { return 0.0f; }
    void updateModel(android.content.ComponentName p0) {}
    void destroy() {}
}
