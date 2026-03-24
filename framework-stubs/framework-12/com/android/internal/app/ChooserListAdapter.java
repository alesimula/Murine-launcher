package com.android.internal.app;

public class ChooserListAdapter extends com.android.internal.app.ResolverListAdapter {
    private static final java.lang.String TAG = "ChooserListAdapter";
    private static final boolean DEBUG = false;
    private boolean mEnableStackedApps;
    public static final int NO_POSITION = -1;
    public static final int TARGET_BAD = -1;
    public static final int TARGET_CALLER = 0;
    public static final int TARGET_SERVICE = 1;
    public static final int TARGET_STANDARD = 2;
    public static final int TARGET_STANDARD_AZ = 3;
    private static final int MAX_SUGGESTED_APP_TARGETS = 4;
    private static final int MAX_CHOOSER_TARGETS_PER_APP = 2;
    public static final float CALLER_TARGET_SCORE_BOOST = 900.0f;
    public static final float SHORTCUT_TARGET_SCORE_BOOST = 90.0f;
    private final int mMaxShortcutTargetsPerApp = 0;
    private final com.android.internal.app.ChooserListAdapter.ChooserListCommunicator mChooserListCommunicator = null;
    private final com.android.internal.app.chooser.SelectableTargetInfo.SelectableTargetInfoCommunicator mSelectableTargetInfoCommunicator = null;
    private final com.android.internal.app.ChooserActivityLogger mChooserActivityLogger = null;
    private int mNumShortcutResults;
    private java.util.Map<com.android.internal.app.chooser.DisplayResolveInfo, com.android.internal.app.ResolverListAdapter.LoadIconTask> mIconLoaders;
    private boolean mApplySharingAppLimits;
    private com.android.internal.app.chooser.ChooserTargetInfo mPlaceHolderTargetInfo;
    private final java.util.List<com.android.internal.app.chooser.ChooserTargetInfo> mServiceTargets = null;
    private final java.util.List<com.android.internal.app.chooser.DisplayResolveInfo> mCallerTargets = null;
    private final com.android.internal.app.ChooserActivity.BaseChooserTargetComparator mBaseTargetComparator = null;
    private boolean mListViewDataChanged;
    private java.util.List<com.android.internal.app.chooser.DisplayResolveInfo> mSortedList;
    private android.app.prediction.AppPredictor mAppPredictor;
    private android.app.prediction.AppPredictor.Callback mAppPredictorCallback;
    public ChooserListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, com.android.internal.app.ResolverListController p5, com.android.internal.app.ChooserListAdapter.ChooserListCommunicator p6, com.android.internal.app.chooser.SelectableTargetInfo.SelectableTargetInfoCommunicator p7, android.content.pm.PackageManager p8, com.android.internal.app.ChooserActivityLogger p9) { super(null, null, null, null, false, null, null, false); }
    android.app.prediction.AppPredictor getAppPredictor() { return null; }
    public void handlePackagesChanged() {}
    public void notifyDataSetChanged() {}
    void refreshListView() {}
    private void createPlaceHolders() {}
    android.view.View onCreateView(android.view.ViewGroup p0) { return null; }
    protected void onBindView(android.view.View p0, com.android.internal.app.chooser.TargetInfo p1, int p2) {}
    void updateAlphabeticalList() {}
    public int getCount() { return 0; }
    public int getUnfilteredCount() { return 0; }
    public int getCallerTargetCount() { return 0; }
    public int getSelectableServiceTargetCount() { return 0; }
    public int getServiceTargetCount() { return 0; }
    int getAlphaTargetCount() { return 0; }
    public int getRankedTargetCount() { return 0; }
    public int getPositionTargetType(int p0) { return 0; }
    public com.android.internal.app.chooser.TargetInfo getItem(int p0) { return null; }
    public com.android.internal.app.chooser.TargetInfo targetInfoForPosition(int p0, boolean p1) { return null; }
    protected boolean shouldAddResolveInfo(com.android.internal.app.chooser.DisplayResolveInfo p0) { return false; }
    public java.util.List<com.android.internal.app.chooser.ChooserTargetInfo> getSurfacedTargetInfo() { return null; }
    public void addServiceResults(com.android.internal.app.chooser.DisplayResolveInfo p0, java.util.List<android.service.chooser.ChooserTarget> p1, int p2, java.util.Map<android.service.chooser.ChooserTarget, android.content.pm.ShortcutInfo> p3, java.util.List<com.android.internal.app.ChooserActivity.ChooserTargetServiceConnection> p4) {}
    int getNumServiceTargetsForExpand() { return 0; }
    public float getBaseScore(com.android.internal.app.chooser.DisplayResolveInfo p0, int p1) { return 0.0f; }
    public void completeServiceTargetLoading() {}
    private boolean insertServiceTarget(com.android.internal.app.chooser.ChooserTargetInfo p0) { return false; }
    public android.service.chooser.ChooserTarget getChooserTargetForValue(int p0) { return null; }
    protected boolean alwaysShowSubLabel() { return false; }
    android.os.AsyncTask<java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo>, java.lang.Void, java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo>> createSortingTask(boolean p0) { return null; }
    public void setAppPredictor(android.app.prediction.AppPredictor p0) {}
    public void setAppPredictorCallback(android.app.prediction.AppPredictor.Callback p0) {}
    public void destroyAppPredictor() {}

    static interface ChooserListCommunicator extends com.android.internal.app.ResolverListAdapter.ResolverListCommunicator {
        public int getMaxRankedTargets();
        public void sendListViewUpdateMessage(android.os.UserHandle p0);
        public boolean isSendAction(android.content.Intent p0);
    }
}
