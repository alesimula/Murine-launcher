package com.android.internal.app;

public class ChooserActivity extends com.android.internal.app.ResolverActivity implements com.android.internal.app.ChooserListAdapter.ChooserListCommunicator, com.android.internal.app.chooser.SelectableTargetInfo.SelectableTargetInfoCommunicator {
    private static final java.lang.String TAG = "ChooserActivity";
    private android.app.prediction.AppPredictor mPersonalAppPredictor;
    private android.app.prediction.AppPredictor mWorkAppPredictor;
    private boolean mShouldDisplayLandscape;
    private static final int MAX_TARGETS_PER_ROW_PORTRAIT = 4;
    private static final int MAX_TARGETS_PER_ROW_LANDSCAPE = 8;
    public static final java.lang.String EXTRA_PRIVATE_RETAIN_IN_ON_STOP = "com.android.internal.app.ChooserActivity.EXTRA_PRIVATE_RETAIN_IN_ON_STOP";
    public static final java.lang.String FIRST_IMAGE_PREVIEW_TRANSITION_NAME = "screenshot_preview_image";
    private static final java.lang.String PREF_NUM_SHEET_EXPANSIONS = "pref_num_sheet_expansions";
    private static final java.lang.String CHIP_LABEL_METADATA_KEY = "android.service.chooser.chip_label";
    private static final java.lang.String CHIP_ICON_METADATA_KEY = "android.service.chooser.chip_icon";
    private static final boolean DEBUG = true;
    private static final boolean USE_PREDICTION_MANAGER_FOR_SHARE_ACTIVITIES = true;
    private static final java.lang.String APP_PREDICTION_SHARE_UI_SURFACE = "share";
    public static final java.lang.String LAUNCH_LOCATION_DIRECT_SHARE = "direct_share";
    public static final java.lang.String CHOOSER_TARGET = "chooser_target";
    private static final java.lang.String SHORTCUT_TARGET = "shortcut_target";
    private static final int APP_PREDICTION_SHARE_TARGET_QUERY_PACKAGE_LIMIT = 20;
    public static final java.lang.String APP_PREDICTION_INTENT_FILTER_KEY = "intent_filter";
    public static final int LIST_VIEW_UPDATE_INTERVAL_IN_MILLIS = 250;
    private boolean mIsAppPredictorComponentAvailable;
    private java.util.Map<android.service.chooser.ChooserTarget, android.app.prediction.AppTarget> mDirectShareAppTargetCache;
    private java.util.Map<android.service.chooser.ChooserTarget, android.content.pm.ShortcutInfo> mDirectShareShortcutInfoCache;
    private java.util.Map<android.content.ComponentName, android.content.ComponentName> mChooserTargetComponentNameCache;
    public static final int TARGET_TYPE_DEFAULT = 0;
    public static final int TARGET_TYPE_CHOOSER_TARGET = 1;
    public static final int TARGET_TYPE_SHORTCUTS_FROM_SHORTCUT_MANAGER = 2;
    public static final int TARGET_TYPE_SHORTCUTS_FROM_PREDICTION_SERVICE = 3;
    public static final int SELECTION_TYPE_SERVICE = 1;
    public static final int SELECTION_TYPE_APP = 2;
    public static final int SELECTION_TYPE_STANDARD = 3;
    public static final int SELECTION_TYPE_COPY = 4;
    public static final int SELECTION_TYPE_NEARBY = 5;
    public static final int SELECTION_TYPE_EDIT = 6;
    private static final int SCROLL_STATUS_IDLE = 0;
    private static final int SCROLL_STATUS_SCROLLING_VERTICAL = 1;
    private static final int SCROLL_STATUS_SCROLLING_HORIZONTAL = 2;
    protected com.android.internal.app.ChooserActivityLogger mChooserActivityLogger;
    private static final boolean USE_CHOOSER_TARGET_SERVICE_FOR_DIRECT_TARGETS = true;
    private static final int NO_DIRECT_SHARE_ANIM_IN_MILLIS = 200;
    private static final float DIRECT_SHARE_EXPANSION_RATE = 0.7799999713897705f;
    private static final int SHARE_TARGET_QUERY_PACKAGE_LIMIT = 20;
    private static final int QUERY_TARGET_SERVICE_LIMIT = 5;
    private static final int DEFAULT_SALT_EXPIRATION_DAYS = 7;
    private int mMaxHashSaltDays;
    private android.os.Bundle mReplacementExtras;
    private android.content.IntentSender mChosenComponentSender;
    private android.content.IntentSender mRefinementIntentSender;
    private com.android.internal.app.ChooserActivity.RefinementResultReceiver mRefinementResultReceiver;
    private android.service.chooser.ChooserTarget[] mCallerChooserTargets;
    private android.content.ComponentName[] mFilteredComponentNames;
    private android.content.Intent mReferrerFillInIntent;
    private long mChooserShownTime;
    protected boolean mIsSuccessfullySelected;
    private long mQueriedTargetServicesTimeMs;
    private long mQueriedSharingShortcutsTimeMs;
    private int mChooserRowServiceSpacing;
    private int mCurrAvailableWidth;
    private int mLastNumberOfChildren;
    private static final java.lang.String TARGET_DETAILS_FRAGMENT_TAG = "targetDetailsFragment";
    private final java.util.List<com.android.internal.app.ChooserActivity.ChooserTargetServiceConnection> mServiceConnections = null;
    private final java.util.Set<android.util.Pair<android.content.ComponentName, android.os.UserHandle>> mServicesRequested = null;
    private static final int MAX_LOG_RANK_POSITION = 12;
    private static final int MAX_EXTRA_INITIAL_INTENTS = 2;
    private static final int MAX_EXTRA_CHOOSER_TARGETS = 2;
    private android.content.SharedPreferences mPinnedSharedPrefs;
    private static final java.lang.String PINNED_SHARED_PREFS_NAME = "chooser_pin_settings";
    protected static final int CONTENT_PREVIEW_IMAGE = 1;
    protected static final int CONTENT_PREVIEW_FILE = 2;
    protected static final int CONTENT_PREVIEW_TEXT = 3;
    protected com.android.internal.logging.MetricsLogger mMetricsLogger;
    private com.android.internal.app.ChooserActivity.ContentPreviewCoordinator mPreviewCoord;
    private int mScrollStatus;
    protected com.android.internal.app.ChooserMultiProfilePagerAdapter mChooserMultiProfilePagerAdapter;
    private boolean mRemoveSharedElements;
    private final com.android.internal.app.ChooserActivity.ChooserHandler mChooserHandler = null;
    public ChooserActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    protected int appliedThemeResId() { return 0; }
    private android.app.prediction.AppPredictor setupAppPredictorForUser(android.os.UserHandle p0, android.app.prediction.AppPredictor.Callback p1) { return null; }
    private android.app.prediction.AppPredictor.Callback createAppPredictorCallback(com.android.internal.app.ChooserListAdapter p0) { return null; }
    static android.content.SharedPreferences getPinnedSharedPrefs(android.content.Context p0) { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter createMultiProfilePagerAdapter(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private com.android.internal.app.ChooserMultiProfilePagerAdapter createChooserMultiProfilePagerAdapterForOneProfile(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private com.android.internal.app.ChooserMultiProfilePagerAdapter createChooserMultiProfilePagerAdapterForTwoProfiles(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private int findSelectedProfile() { return 0; }
    protected boolean postRebuildList(boolean p0) { return false; }
    public boolean isAppPredictionServiceAvailable() { return false; }
    protected boolean isWorkProfile() { return false; }
    protected com.android.internal.content.PackageMonitor createPackageMonitor(com.android.internal.app.ResolverListAdapter p0) { return null; }
    public void handlePackagesChanged() {}
    private void handlePackagesChanged(com.android.internal.app.ResolverListAdapter p0) {}
    private void onCopyButtonClicked(android.view.View p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    private boolean shouldDisplayLandscape(int p0) { return false; }
    private void adjustPreviewWidth(int p0, android.view.View p1) {}
    private void updateLayoutWidth(int p0, int p1, android.view.View p2) {}
    private android.view.ViewGroup createContentPreviewView(android.view.ViewGroup p0) { return null; }
    protected android.content.ComponentName getNearbySharingComponent() { return null; }
    protected android.content.ComponentName getEditSharingComponent() { return null; }
    protected com.android.internal.app.chooser.TargetInfo getEditSharingTarget(android.content.Intent p0) { return null; }
    protected com.android.internal.app.chooser.TargetInfo getNearbySharingTarget(android.content.Intent p0) { return null; }
    private android.widget.Button createActionButton(android.graphics.drawable.Drawable p0, java.lang.CharSequence p1, android.view.View.OnClickListener p2) { return null; }
    private android.widget.Button createCopyButton() { return null; }
    private android.widget.Button createNearbyButton(android.content.Intent p0) { return null; }
    private android.widget.Button createEditButton(android.content.Intent p0) { return null; }
    private void addActionButton(android.view.ViewGroup p0, android.widget.Button p1) {}
    private android.view.ViewGroup displayContentPreview(int p0, android.content.Intent p1, android.view.LayoutInflater p2, android.view.ViewGroup p3) { return null; }
    private android.view.ViewGroup displayTextContentPreview(android.content.Intent p0, android.view.LayoutInflater p1, android.view.ViewGroup p2) { return null; }
    private android.view.ViewGroup displayImageContentPreview(android.content.Intent p0, android.view.LayoutInflater p1, android.view.ViewGroup p2) { return null; }
    public android.database.Cursor queryResolver(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
    private com.android.internal.app.ChooserActivity.FileInfo extractFileInfo(android.net.Uri p0, android.content.ContentResolver p1) { return null; }
    private void logContentPreviewWarning(android.net.Uri p0) {}
    private android.view.ViewGroup displayFileContentPreview(android.content.Intent p0, android.view.LayoutInflater p1, android.view.ViewGroup p2) { return null; }
    private void loadFileUriIntoView(android.net.Uri p0, android.view.View p1) {}
    protected boolean isImageType(java.lang.String p0) { return false; }
    private int findPreferredContentPreview(android.net.Uri p0, android.content.ContentResolver p1) { return 0; }
    private int findPreferredContentPreview(android.content.Intent p0, android.content.ContentResolver p1) { return 0; }
    private int getNumSheetExpansions() { return 0; }
    private void incrementNumSheetExpansions() {}
    protected void onDestroy() {}
    public android.content.Intent getReplacementIntent(android.content.pm.ActivityInfo p0, android.content.Intent p1) { return null; }
    public void onActivityStarted(com.android.internal.app.chooser.TargetInfo p0) {}
    public void addUseDifferentAppLabelIfNecessary(com.android.internal.app.ResolverListAdapter p0) {}
    public int getLayoutResource() { return 0; }
    public boolean shouldGetActivityMetadata() { return false; }
    public boolean shouldAutoLaunchSingleChoice(com.android.internal.app.chooser.TargetInfo p0) { return false; }
    private void showTargetDetails(com.android.internal.app.chooser.DisplayResolveInfo p0) {}
    private void modifyTargetIntent(android.content.Intent p0) {}
    protected boolean onTargetSelected(com.android.internal.app.chooser.TargetInfo p0, boolean p1) { return false; }
    public void startSelected(int p0, boolean p1, boolean p2) {}
    private int getRankedPosition(com.android.internal.app.chooser.SelectableTargetInfo p0) { return 0; }
    protected boolean shouldAddFooterView() { return false; }
    protected void applyFooterView(int p0) {}
    protected void queryTargetServices(com.android.internal.app.ChooserListAdapter p0) {}
    private android.content.IntentFilter getTargetIntentFilter() { return null; }
    protected void queryDirectShareTargets(com.android.internal.app.ChooserListAdapter p0, boolean p1) {}
    private boolean shouldQueryShortcutManager(android.os.UserHandle p0) { return false; }
    private void sendShareShortcutInfoList(java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p0, com.android.internal.app.ChooserListAdapter p1, java.util.List<android.app.prediction.AppTarget> p2, android.os.UserHandle p3) {}
    private void sendShortcutManagerShareTargetResultCompleted() {}
    private boolean isPackageEnabled(android.content.Context p0, java.lang.String p1) { return false; }
    public java.util.List<android.service.chooser.ChooserTarget> convertToChooserTarget(java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p0, java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p1, java.util.List<android.app.prediction.AppTarget> p2, int p3) { return null; }
    private java.lang.String convertServiceName(java.lang.String p0, java.lang.String p1) { return null; }
    void unbindRemainingServices() {}
    private void logDirectShareTargetReceived(int p0) {}
    void updateModelAndChooserCounts(com.android.internal.app.chooser.TargetInfo p0) {}
    private void sendImpressionToAppPredictor(com.android.internal.app.chooser.TargetInfo p0, com.android.internal.app.ChooserListAdapter p1) {}
    private void sendClickToAppPredictor(com.android.internal.app.chooser.TargetInfo p0) {}
    private android.app.prediction.AppPredictor createAppPredictor(android.os.UserHandle p0) { return null; }
    private android.app.prediction.AppPredictor getAppPredictorForDirectShareIfEnabled(android.os.UserHandle p0) { return null; }
    private android.app.prediction.AppPredictor getAppPredictorForShareActivitiesIfEnabled(android.os.UserHandle p0) { return null; }
    void onRefinementResult(com.android.internal.app.chooser.TargetInfo p0, android.content.Intent p1) {}
    void onRefinementCanceled() {}
    boolean checkTargetSourceIntent(com.android.internal.app.chooser.TargetInfo p0, android.content.Intent p1) { return false; }
    void filterServiceTargets(android.content.Context p0, java.lang.String p1, java.util.List<android.service.chooser.ChooserTarget> p2) {}
    protected com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    protected com.android.internal.app.ChooserActivityLogger getChooserActivityLogger() { return null; }
    public com.android.internal.app.ChooserActivity.ChooserGridAdapter createChooserGridAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, android.os.UserHandle p5) { return null; }
    public com.android.internal.app.ChooserListAdapter createChooserListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, com.android.internal.app.ResolverListController p5) { return null; }
    protected com.android.internal.app.ResolverListController createListController(android.os.UserHandle p0) { return null; }
    protected android.graphics.Bitmap loadThumbnail(android.net.Uri p0, android.util.Size p1) { return null; }
    private void handleScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    private void handleLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    private boolean shouldShowExtraRow(int p0) { return false; }
    private int getProfileForUser(android.os.UserHandle p0) { return 0; }
    private android.view.ViewGroup getActiveEmptyStateView() { return null; }
    public void onHandlePackagesChanged(com.android.internal.app.ResolverListAdapter p0) {}
    public com.android.internal.app.ResolverListAdapter.ActivityInfoPresentationGetter makePresentationGetter(android.content.pm.ActivityInfo p0) { return null; }
    public android.content.Intent getReferrerFillInIntent() { return null; }
    public int getMaxRankedTargets() { return 0; }
    public void sendListViewUpdateMessage(android.os.UserHandle p0) {}
    public void onListRebuilt(com.android.internal.app.ResolverListAdapter p0) {}
    protected boolean isUserRunning(android.os.UserHandle p0) { return false; }
    protected boolean isUserUnlocked(android.os.UserHandle p0) { return false; }
    protected boolean isQuietModeEnabled(android.os.UserHandle p0) { return false; }
    private void setupScrollListener() {}
    private void maybeSetupGlobalLayoutListener() {}
    public boolean isSendAction(android.content.Intent p0) { return false; }
    private boolean shouldShowStickyContentPreview() { return false; }
    private boolean shouldShowStickyContentPreviewNoOrientationCheck() { return false; }
    private void updateStickyContentPreview() {}
    private void showStickyContentPreview() {}
    private boolean isStickyContentPreviewShowing() { return false; }
    private void hideStickyContentPreview() {}
    private void logActionShareWithPreview() {}
    public void onButtonClick(android.view.View p0) {}
    protected void resetButtonBar() {}
    protected java.lang.String getMetricsCategory() { return null; }
    protected void onProfileTabSelected() {}
    protected android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1) { return null; }
    private void setHorizontalScrollingEnabled(boolean p0) {}
    private void setVerticalScrollEnabled(boolean p0) {}
    void onHorizontalSwipeStateChanged(int p0) {}
    int getMaxTargetsPerRow() { return 0; }
    protected void maybeLogProfileChange() {}

    static class AzInfoComparator implements java.util.Comparator<com.android.internal.app.chooser.DisplayResolveInfo> {
        java.text.Collator mCollator;
        AzInfoComparator(android.content.Context p0) {}
        public int compare(com.android.internal.app.chooser.DisplayResolveInfo p0, com.android.internal.app.chooser.DisplayResolveInfo p1) { return 0; }
    }

    static class BaseChooserTargetComparator implements java.util.Comparator<android.service.chooser.ChooserTarget> {
        BaseChooserTargetComparator() {}
        public int compare(android.service.chooser.ChooserTarget p0, android.service.chooser.ChooserTarget p1) { return 0; }
    }

    public final class ChooserGridAdapter extends com.android.internal.widget.RecyclerView.Adapter<com.android.internal.widget.RecyclerView.ViewHolder> {
        private com.android.internal.app.ChooserListAdapter mChooserListAdapter;
        private final android.view.LayoutInflater mLayoutInflater = null;
        private com.android.internal.app.ChooserActivity.DirectShareViewHolder mDirectShareViewHolder;
        private int mChooserTargetWidth;
        private boolean mShowAzLabelIfPoss;
        private boolean mHideContentPreview;
        private boolean mLayoutRequested;
        private int mFooterHeight;
        private static final int VIEW_TYPE_DIRECT_SHARE = 0;
        private static final int VIEW_TYPE_NORMAL = 1;
        private static final int VIEW_TYPE_CONTENT_PREVIEW = 2;
        private static final int VIEW_TYPE_PROFILE = 3;
        private static final int VIEW_TYPE_AZ_LABEL = 4;
        private static final int VIEW_TYPE_CALLER_AND_RANK = 5;
        private static final int VIEW_TYPE_FOOTER = 6;
        private static final int NUM_EXPANSIONS_TO_HIDE_AZ_LABEL = 20;
        ChooserGridAdapter(com.android.internal.app.ChooserActivity p0, com.android.internal.app.ChooserListAdapter p1) { super(); }
        public void setFooterHeight(int p0) {}
        public boolean calculateChooserTargetWidth(int p0) { return false; }
        public void hideContentPreview() {}
        public boolean consumeLayoutRequest() { return false; }
        public int getRowCount() { return 0; }
        public int getSystemRowCount() { return 0; }
        public int getProfileRowCount() { return 0; }
        public int getFooterRowCount() { return 0; }
        public int getCallerAndRankedTargetRowCount() { return 0; }
        public int getServiceTargetRowCount() { return 0; }
        public int getAzLabelRowCount() { return 0; }
        public int getItemCount() { return 0; }
        public com.android.internal.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup p0, int p1) { return null; }
        public void onBindViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) {}
        public int getItemViewType(int p0) { return 0; }
        public int getTargetType(int p0) { return 0; }
        private android.view.View createProfileView(android.view.ViewGroup p0) { return null; }
        private android.view.View createAzLabelView(android.view.ViewGroup p0) { return null; }
        private com.android.internal.app.ChooserActivity.ItemGroupViewHolder loadViewsIntoGroup(com.android.internal.app.ChooserActivity.ItemGroupViewHolder p0) { return null; }
        private void setViewBounds(android.view.View p0, int p1, int p2) {}
        com.android.internal.app.ChooserActivity.ItemGroupViewHolder createItemGroupViewHolder(int p0, android.view.ViewGroup p1) { return null; }
        int getRowType(int p0) { return 0; }
        void bindItemViewHolder(int p0, com.android.internal.app.ChooserActivity.ItemViewHolder p1) {}
        void bindItemGroupViewHolder(int p0, com.android.internal.app.ChooserActivity.ItemGroupViewHolder p1) {}
        int getListPosition(int p0) { return 0; }
        public void handleScroll(android.view.View p0, int p1, int p2) {}
        private boolean canExpandDirectShare() { return false; }
        public com.android.internal.app.ChooserListAdapter getListAdapter() { return null; }
        boolean shouldCellSpan(int p0) { return false; }
        void updateDirectShareExpansion() {}
    }

    private class ChooserHandler extends android.os.Handler {
        private static final int CHOOSER_TARGET_SERVICE_RESULT = 1;
        private static final int CHOOSER_TARGET_SERVICE_WATCHDOG_MIN_TIMEOUT = 2;
        private static final int CHOOSER_TARGET_SERVICE_WATCHDOG_MAX_TIMEOUT = 3;
        private static final int SHORTCUT_MANAGER_SHARE_TARGET_RESULT = 4;
        private static final int SHORTCUT_MANAGER_SHARE_TARGET_RESULT_COMPLETED = 5;
        private static final int LIST_VIEW_UPDATE_MESSAGE = 6;
        private static final int WATCHDOG_TIMEOUT_MAX_MILLIS = 1000;
        private static final int WATCHDOG_TIMEOUT_MIN_MILLIS = 300;
        private boolean mMinTimeoutPassed;
        private ChooserHandler(com.android.internal.app.ChooserActivity p0) { super(); }
        private void removeAllMessages() {}
        private void restartServiceRequestTimer() {}
        private void maybeStopServiceRequestTimer() {}
        public void handleMessage(android.os.Message p0) {}
    }

    public class ChooserListController extends com.android.internal.app.ResolverListController {
        public ChooserListController(com.android.internal.app.ChooserActivity p0, android.content.Context p1, android.content.pm.PackageManager p2, android.content.Intent p3, java.lang.String p4, int p5, android.os.UserHandle p6, com.android.internal.app.AbstractResolverComparator p7) { super((android.content.Context)null, (android.content.pm.PackageManager)null, (android.content.Intent)null, (java.lang.String)null, 0, (android.os.UserHandle)null); }
        boolean isComponentFiltered(android.content.ComponentName p0) { return false; }
        public boolean isComponentPinned(android.content.ComponentName p0) { return false; }
    }

    static class ChooserTargetRankingInfo {
        public final java.util.List<android.app.prediction.AppTarget> scores = null;
        public final android.os.UserHandle userHandle = null;
        ChooserTargetRankingInfo(java.util.List<android.app.prediction.AppTarget> p0, android.os.UserHandle p1) {}
    }

    static class ChooserTargetServiceConnection implements android.content.ServiceConnection {
        private com.android.internal.app.chooser.DisplayResolveInfo mOriginalTarget;
        private android.content.ComponentName mConnectedComponent;
        private com.android.internal.app.ChooserActivity mChooserActivity;
        private final android.os.UserHandle mUserHandle = null;
        private final java.lang.Object mLock = null;
        private final android.service.chooser.IChooserTargetResult mChooserTargetResult = null;
        public ChooserTargetServiceConnection(com.android.internal.app.ChooserActivity p0, com.android.internal.app.chooser.DisplayResolveInfo p1, android.os.UserHandle p2) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void destroy() {}
        public java.lang.String toString() { return null; }
        public android.content.ComponentName getComponentName() { return null; }
    }

    private class ContentPreviewCoordinator {
        private static final int IMAGE_FADE_IN_MILLIS = 150;
        private static final int IMAGE_LOAD_TIMEOUT = 1;
        private static final int IMAGE_LOAD_INTO_VIEW = 2;
        private final int mImageLoadTimeoutMillis = 0;
        private final android.view.View mParentView = null;
        private boolean mHideParentOnFail;
        private boolean mAtLeastOneLoaded;
        private final android.os.Handler mHandler = null;
        private void setupPreDrawForSharedElementTransition(android.view.View p0) {}
        ContentPreviewCoordinator(com.android.internal.app.ChooserActivity p0, android.view.View p1, boolean p2) {}
        private void loadUriIntoView(int p0, android.net.Uri p1, int p2) {}
        private void cancelLoads() {}
        private void maybeHideContentPreview() {}
        private void collapseParentView() {}

        class LoadUriTask {
            public final android.net.Uri mUri = null;
            public final int mImageResourceId = 0;
            public final int mExtraCount = 0;
            public final android.graphics.Bitmap mBmp = null;
            LoadUriTask(com.android.internal.app.ChooserActivity.ContentPreviewCoordinator p0, int p1, android.net.Uri p2, int p3, android.graphics.Bitmap p4) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ContentPreviewType {
    }

    class DirectShareViewHolder extends com.android.internal.app.ChooserActivity.ItemGroupViewHolder {
        private final android.view.ViewGroup mParent = null;
        private final java.util.List<android.view.ViewGroup> mRows = null;
        private int mCellCountPerRow;
        private boolean mHideDirectShareExpansion;
        private int mDirectShareMinHeight;
        private int mDirectShareCurrHeight;
        private int mDirectShareMaxHeight;
        private final boolean[] mCellVisibility = null;
        DirectShareViewHolder(android.view.ViewGroup p0, java.util.List<android.view.ViewGroup> p1, int p2, int p3) { super(null, 0, null, 0); }
        public android.view.ViewGroup addView(int p0, android.view.View p1) { return null; }
        public android.view.ViewGroup getViewGroup() { return null; }
        public android.view.ViewGroup getRowByIndex(int p0) { return null; }
        public android.view.ViewGroup getRow(int p0) { return null; }
        public void measure() {}
        public int getMeasuredRowHeight() { return 0; }
        public int getMinRowHeight() { return 0; }
        public void setViewVisibility(int p0, int p1) {}
        public void handleScroll(com.android.internal.widget.RecyclerView p0, int p1, int p2, int p3) {}
        void expand(com.android.internal.widget.RecyclerView p0) {}
        void collapse(com.android.internal.widget.RecyclerView p0) {}
        private void updateDirectShareRowHeight(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
    }

    protected static final class EmptyTargetInfo extends com.android.internal.app.chooser.NotSelectableTargetInfo {
        public EmptyTargetInfo() { super(); }
        public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    }

    private static class FileInfo {
        public final java.lang.String name = null;
        public final boolean hasThumbnail = false;
        FileInfo(java.lang.String p0, boolean p1) {}
    }

    final class FooterViewHolder extends com.android.internal.app.ChooserActivity.ViewHolderBase {
        FooterViewHolder(com.android.internal.app.ChooserActivity p0, android.view.View p1, int p2) { super(null, null, 0); }
    }

    abstract class ItemGroupViewHolder extends com.android.internal.app.ChooserActivity.ViewHolderBase {
        protected int mMeasuredRowHeight;
        private int[] mItemIndices;
        protected final android.view.View[] mCells = null;
        private final int mColumnCount = 0;
        ItemGroupViewHolder(com.android.internal.app.ChooserActivity p0, int p1, android.view.View p2, int p3) { super(null, null, 0); }
        abstract android.view.ViewGroup addView(int p0, android.view.View p1);
        abstract android.view.ViewGroup getViewGroup();
        abstract android.view.ViewGroup getRowByIndex(int p0);
        abstract android.view.ViewGroup getRow(int p0);
        abstract void setViewVisibility(int p0, int p1);
        public int getColumnCount() { return 0; }
        public void measure() {}
        public int getMeasuredRowHeight() { return 0; }
        public void setItemIndex(int p0, int p1) {}
        public int getItemIndex(int p0) { return 0; }
        public android.view.View getView(int p0) { return null; }
    }

    final class ItemViewHolder extends com.android.internal.app.ChooserActivity.ViewHolderBase {
        com.android.internal.app.ResolverListAdapter.ViewHolder mWrappedViewHolder;
        int mListPosition;
        ItemViewHolder(com.android.internal.app.ChooserActivity p0, android.view.View p1, boolean p2, int p3) { super(null, null, 0); }
    }

    static final class PlaceHolderTargetInfo extends com.android.internal.app.chooser.NotSelectableTargetInfo {
        PlaceHolderTargetInfo() { super(); }
        public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    }

    static class RefinementResultReceiver extends android.os.ResultReceiver {
        private com.android.internal.app.ChooserActivity mChooserActivity;
        private com.android.internal.app.chooser.TargetInfo mSelectedTarget;
        public RefinementResultReceiver(com.android.internal.app.ChooserActivity p0, com.android.internal.app.chooser.TargetInfo p1, android.os.Handler p2) { super((android.os.Handler)null); }
        protected void onReceiveResult(int p0, android.os.Bundle p1) {}
        public void destroy() {}
    }

    public static class RoundedRectImageView extends android.widget.ImageView {
        private int mRadius;
        private android.graphics.Path mPath;
        private android.graphics.Paint mOverlayPaint;
        private android.graphics.Paint mRoundRectPaint;
        private android.graphics.Paint mTextPaint;
        private java.lang.String mExtraImageCount;
        public RoundedRectImageView(android.content.Context p0) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        private void updatePath(int p0, int p1) {}
        public void setRadius(int p0) {}
        public void setExtraImageCount(int p0) {}
        protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
        protected void onDraw(android.graphics.Canvas p0) {}
    }

    static class ServiceResultInfo {
        public final com.android.internal.app.chooser.DisplayResolveInfo originalTarget = null;
        public final java.util.List<android.service.chooser.ChooserTarget> resultTargets = null;
        public final com.android.internal.app.ChooserActivity.ChooserTargetServiceConnection connection = null;
        public final android.os.UserHandle userHandle = null;
        public ServiceResultInfo(com.android.internal.app.chooser.DisplayResolveInfo p0, java.util.List<android.service.chooser.ChooserTarget> p1, com.android.internal.app.ChooserActivity.ChooserTargetServiceConnection p2, android.os.UserHandle p3) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShareTargetType {
    }

    class SingleRowViewHolder extends com.android.internal.app.ChooserActivity.ItemGroupViewHolder {
        private final android.view.ViewGroup mRow = null;
        SingleRowViewHolder(com.android.internal.app.ChooserActivity p0, android.view.ViewGroup p1, int p2, int p3) { super(null, 0, null, 0); }
        public android.view.ViewGroup getViewGroup() { return null; }
        public android.view.ViewGroup getRowByIndex(int p0) { return null; }
        public android.view.ViewGroup getRow(int p0) { return null; }
        public android.view.ViewGroup addView(int p0, android.view.View p1) { return null; }
        public void setViewVisibility(int p0, int p1) {}
    }

    class ViewHolderBase extends com.android.internal.widget.RecyclerView.ViewHolder {
        private int mViewType;
        ViewHolderBase(com.android.internal.app.ChooserActivity p0, android.view.View p1, int p2) { super(null); }
        int getViewType() { return 0; }
    }
}
