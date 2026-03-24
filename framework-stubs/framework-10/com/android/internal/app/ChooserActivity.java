package com.android.internal.app;

public class ChooserActivity extends com.android.internal.app.ResolverActivity {
    private static final java.lang.String TAG = "ChooserActivity";
    public static final java.lang.String EXTRA_PRIVATE_RETAIN_IN_ON_STOP = "com.android.internal.app.ChooserActivity.EXTRA_PRIVATE_RETAIN_IN_ON_STOP";
    private static final java.lang.String PREF_NUM_SHEET_EXPANSIONS = "pref_num_sheet_expansions";
    private static final boolean DEBUG = false;
    private static final boolean USE_PREDICTION_MANAGER_FOR_DIRECT_TARGETS = true;
    private static final boolean USE_PREDICTION_MANAGER_FOR_SHARE_ACTIVITIES = true;
    private static final java.lang.String APP_PREDICTION_SHARE_UI_SURFACE = "share";
    public static final java.lang.String LAUNCH_LOCATON_DIRECT_SHARE = "direct_share";
    private static final int APP_PREDICTION_SHARE_TARGET_QUERY_PACKAGE_LIMIT = 20;
    public static final java.lang.String APP_PREDICTION_INTENT_FILTER_KEY = "intent_filter";
    private android.app.prediction.AppPredictor mAppPredictor;
    private android.app.prediction.AppPredictor.Callback mAppPredictorCallback;
    private java.util.Map<android.service.chooser.ChooserTarget, android.app.prediction.AppTarget> mDirectShareAppTargetCache;
    private static final boolean USE_SHORTCUT_MANAGER_FOR_DIRECT_TARGETS = true;
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
    private com.android.internal.app.ChooserActivity.ChooserListAdapter mChooserListAdapter;
    private com.android.internal.app.ChooserActivity.ChooserRowAdapter mChooserRowAdapter;
    private int mChooserRowServiceSpacing;
    private int mCurrAvailableWidth;
    private static final float CALLER_TARGET_SCORE_BOOST = 900.0f;
    private static final float SHORTCUT_TARGET_SCORE_BOOST = 90.0f;
    private static final java.lang.String TARGET_DETAILS_FRAGMENT_TAG = "targetDetailsFragment";
    private static final int MAX_RANKED_TARGETS = 4;
    private final java.util.List<com.android.internal.app.ChooserActivity.ChooserTargetServiceConnection> mServiceConnections = null;
    private final java.util.Set<android.content.ComponentName> mServicesRequested = null;
    private static final int MAX_LOG_RANK_POSITION = 12;
    public static final int LIST_VIEW_UPDATE_INTERVAL_IN_MILLIS = 250;
    private static final int MAX_EXTRA_INITIAL_INTENTS = 2;
    private static final int MAX_EXTRA_CHOOSER_TARGETS = 2;
    private boolean mListViewDataChanged;
    private static final int CONTENT_PREVIEW_IMAGE = 1;
    private static final int CONTENT_PREVIEW_FILE = 2;
    private static final int CONTENT_PREVIEW_TEXT = 3;
    protected com.android.internal.logging.MetricsLogger mMetricsLogger;
    private java.util.List<com.android.internal.app.ResolverActivity.DisplayResolveInfo> mSortedList;
    private com.android.internal.app.ChooserActivity.ContentPreviewCoordinator mPreviewCoord;
    private final com.android.internal.app.ChooserActivity.ChooserHandler mChooserHandler = null;
    public ChooserActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    protected boolean isWorkProfile() { return false; }
    protected com.android.internal.content.PackageMonitor createPackageMonitor() { return null; }
    private void onCopyButtonClicked(android.view.View p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    private boolean shouldDisplayLandscape(int p0) { return false; }
    private void adjustPreviewWidth(int p0, android.view.View p1) {}
    private void updateLayoutWidth(int p0, int p1, android.view.View p2) {}
    private android.view.ViewGroup displayContentPreview(int p0, android.content.Intent p1, android.view.LayoutInflater p2, android.view.ViewGroup p3, android.view.ViewGroup p4) { return null; }
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
    public void onActivityStarted(com.android.internal.app.ResolverActivity.TargetInfo p0) {}
    public void onPrepareAdapterView(android.widget.AbsListView p0, com.android.internal.app.ResolverActivity.ResolveListAdapter p1) {}
    public int getLayoutResource() { return 0; }
    public boolean shouldGetActivityMetadata() { return false; }
    public boolean shouldAutoLaunchSingleChoice(com.android.internal.app.ResolverActivity.TargetInfo p0) { return false; }
    public void showTargetDetails(android.content.pm.ResolveInfo p0) {}
    private void modifyTargetIntent(android.content.Intent p0) {}
    protected boolean onTargetSelected(com.android.internal.app.ResolverActivity.TargetInfo p0, boolean p1) { return false; }
    public void startSelected(int p0, boolean p1, boolean p2) {}
    private int getRankedPosition(com.android.internal.app.ChooserActivity.SelectableTargetInfo p0) { return 0; }
    void queryTargetServices(com.android.internal.app.ChooserActivity.ChooserListAdapter p0) {}
    private android.content.IntentFilter getTargetIntentFilter() { return null; }
    private java.util.List<com.android.internal.app.ResolverActivity.DisplayResolveInfo> getDisplayResolveInfos(com.android.internal.app.ChooserActivity.ChooserListAdapter p0) { return null; }
    private void queryDirectShareTargets(com.android.internal.app.ChooserActivity.ChooserListAdapter p0, boolean p1) {}
    private void sendShareShortcutInfoList(java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p0, java.util.List<com.android.internal.app.ResolverActivity.DisplayResolveInfo> p1, java.util.List<android.app.prediction.AppTarget> p2) {}
    private void sendShortcutManagerShareTargetResultCompleted() {}
    private boolean isPackageEnabled(java.lang.String p0) { return false; }
    private android.service.chooser.ChooserTarget convertToChooserTarget(android.content.pm.ShortcutManager.ShareShortcutInfo p0, float p1) { return null; }
    private java.lang.String convertServiceName(java.lang.String p0, java.lang.String p1) { return null; }
    void unbindRemainingServices() {}
    public void onSetupVoiceInteraction() {}
    private void logDirectShareTargetReceived(int p0) {}
    void updateModelAndChooserCounts(com.android.internal.app.ResolverActivity.TargetInfo p0) {}
    private void sendClickToAppPredictor(com.android.internal.app.ResolverActivity.TargetInfo p0) {}
    private android.app.prediction.AppPredictor getAppPredictor() { return null; }
    private android.app.prediction.AppPredictor getAppPredictorForDirectShareIfEnabled() { return null; }
    private android.app.prediction.AppPredictor getAppPredictorForShareActivitesIfEnabled() { return null; }
    void onRefinementResult(com.android.internal.app.ResolverActivity.TargetInfo p0, android.content.Intent p1) {}
    void onRefinementCanceled() {}
    boolean checkTargetSourceIntent(com.android.internal.app.ResolverActivity.TargetInfo p0, android.content.Intent p1) { return false; }
    void filterServiceTargets(java.lang.String p0, java.util.List<android.service.chooser.ChooserTarget> p1) {}
    private void updateAlphabeticalList() {}
    protected com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    public com.android.internal.app.ResolverActivity.ResolveListAdapter createAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, int p4, boolean p5) { return null; }
    protected com.android.internal.app.ResolverListController createListController() { return null; }
    protected android.graphics.Bitmap loadThumbnail(android.net.Uri p0, android.util.Size p1) { return null; }
    private void handleScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    private void handleLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    private boolean isSendAction(android.content.Intent p0) { return false; }

    class SingleRowViewHolder extends com.android.internal.app.ChooserActivity.RowViewHolder {
        private final android.view.ViewGroup mRow = null;
        SingleRowViewHolder(com.android.internal.app.ChooserActivity p0, android.view.ViewGroup p1, int p2) { super(null, 0); }
        public android.view.ViewGroup getViewGroup() { return null; }
        public android.view.ViewGroup getRowByIndex(int p0) { return null; }
        public android.view.ViewGroup getRow(int p0) { return null; }
        public android.view.ViewGroup addView(int p0, android.view.View p1) { return null; }
        public void setViewVisibility(int p0, int p1) {}
    }

    static class ServiceResultInfo {
        public final com.android.internal.app.ResolverActivity.DisplayResolveInfo originalTarget = null;
        public final java.util.List<android.service.chooser.ChooserTarget> resultTargets = null;
        public final com.android.internal.app.ChooserActivity.ChooserTargetServiceConnection connection = null;
        public ServiceResultInfo(com.android.internal.app.ResolverActivity.DisplayResolveInfo p0, java.util.List<android.service.chooser.ChooserTarget> p1, com.android.internal.app.ChooserActivity.ChooserTargetServiceConnection p2) {}
    }

    final class SelectableTargetInfo implements com.android.internal.app.ChooserActivity.ChooserTargetInfo {
        private final com.android.internal.app.ResolverActivity.DisplayResolveInfo mSourceInfo = null;
        private final android.content.pm.ResolveInfo mBackupResolveInfo = null;
        private final android.service.chooser.ChooserTarget mChooserTarget = null;
        private final java.lang.String mDisplayLabel = null;
        private android.graphics.drawable.Drawable mBadgeIcon;
        private java.lang.CharSequence mBadgeContentDescription;
        private android.graphics.drawable.Drawable mDisplayIcon;
        private final android.content.Intent mFillInIntent = null;
        private final int mFillInFlags = 0;
        private final float mModifiedScore = 0.0f;
        private boolean mIsSuspended;
        SelectableTargetInfo(com.android.internal.app.ChooserActivity p0, com.android.internal.app.ResolverActivity.DisplayResolveInfo p1, android.service.chooser.ChooserTarget p2, float p3) {}
        private SelectableTargetInfo(com.android.internal.app.ChooserActivity p0, com.android.internal.app.ChooserActivity.SelectableTargetInfo p1, android.content.Intent p2, int p3) {}
        private java.lang.String sanitizeDisplayLabel(java.lang.CharSequence p0) { return null; }
        public boolean isSuspended() { return false; }
        private android.graphics.drawable.Drawable getChooserTargetIconDrawable(android.service.chooser.ChooserTarget p0) { return null; }
        public float getModifiedScore() { return 0.0f; }
        public android.content.Intent getResolvedIntent() { return null; }
        public android.content.ComponentName getResolvedComponentName() { return null; }
        private android.content.Intent getBaseIntentToSend() { return null; }
        public boolean start(android.app.Activity p0, android.os.Bundle p1) { return false; }
        public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2) { return false; }
        public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
        public android.content.pm.ResolveInfo getResolveInfo() { return null; }
        public java.lang.CharSequence getDisplayLabel() { return null; }
        public java.lang.CharSequence getExtendedInfo() { return null; }
        public android.graphics.drawable.Drawable getDisplayIcon() { return null; }
        public android.service.chooser.ChooserTarget getChooserTarget() { return null; }
        public com.android.internal.app.ResolverActivity.TargetInfo cloneFilledIn(android.content.Intent p0, int p1) { return null; }
        public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
    }

    abstract class RowViewHolder {
        protected int mMeasuredRowHeight;
        private int[] mItemIndices;
        protected final android.view.View[] mCells = null;
        private final int mColumnCount = 0;
        RowViewHolder(com.android.internal.app.ChooserActivity p0, int p1) {}
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

    static class RefinementResultReceiver extends android.os.ResultReceiver {
        private com.android.internal.app.ChooserActivity mChooserActivity;
        private com.android.internal.app.ResolverActivity.TargetInfo mSelectedTarget;
        public RefinementResultReceiver(com.android.internal.app.ChooserActivity p0, com.android.internal.app.ResolverActivity.TargetInfo p1, android.os.Handler p2) { super((android.os.Handler)null); }
        protected void onReceiveResult(int p0, android.os.Bundle p1) {}
        public void destroy() {}
    }

    final class PlaceHolderTargetInfo extends com.android.internal.app.ChooserActivity.NotSelectableTargetInfo {
        PlaceHolderTargetInfo(com.android.internal.app.ChooserActivity p0) { super(null); }
        public android.graphics.drawable.Drawable getDisplayIcon() { return null; }
    }

    abstract class NotSelectableTargetInfo implements com.android.internal.app.ChooserActivity.ChooserTargetInfo {
        NotSelectableTargetInfo(com.android.internal.app.ChooserActivity p0) {}
        public android.content.Intent getResolvedIntent() { return null; }
        public android.content.ComponentName getResolvedComponentName() { return null; }
        public boolean start(android.app.Activity p0, android.os.Bundle p1) { return false; }
        public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2) { return false; }
        public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
        public android.content.pm.ResolveInfo getResolveInfo() { return null; }
        public java.lang.CharSequence getDisplayLabel() { return null; }
        public java.lang.CharSequence getExtendedInfo() { return null; }
        public com.android.internal.app.ResolverActivity.TargetInfo cloneFilledIn(android.content.Intent p0, int p1) { return null; }
        public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
        public float getModifiedScore() { return 0.0f; }
        public android.service.chooser.ChooserTarget getChooserTarget() { return null; }
        public boolean isSuspended() { return false; }
    }

    private static class FileInfo {
        public final java.lang.String name = null;
        public final boolean hasThumbnail = false;
        FileInfo(java.lang.String p0, boolean p1) {}
    }

    final class EmptyTargetInfo extends com.android.internal.app.ChooserActivity.NotSelectableTargetInfo {
        EmptyTargetInfo(com.android.internal.app.ChooserActivity p0) { super(null); }
        public android.graphics.drawable.Drawable getDisplayIcon() { return null; }
    }

    class DirectShareViewHolder extends com.android.internal.app.ChooserActivity.RowViewHolder {
        private final android.view.ViewGroup mParent = null;
        private final java.util.List<android.view.ViewGroup> mRows = null;
        private int mCellCountPerRow;
        private boolean mHideDirectShareExpansion;
        private int mDirectShareMinHeight;
        private int mDirectShareCurrHeight;
        private int mDirectShareMaxHeight;
        private final boolean[] mCellVisibility = null;
        DirectShareViewHolder(android.view.ViewGroup p0, java.util.List<android.view.ViewGroup> p1, int p2) { super(null, 0); }
        public android.view.ViewGroup addView(int p0, android.view.View p1) { return null; }
        public android.view.ViewGroup getViewGroup() { return null; }
        public android.view.ViewGroup getRowByIndex(int p0) { return null; }
        public android.view.ViewGroup getRow(int p0) { return null; }
        public void measure() {}
        public int getMeasuredRowHeight() { return 0; }
        public int getMinRowHeight() { return 0; }
        public void setViewVisibility(int p0, int p1) {}
        public void handleScroll(android.widget.AbsListView p0, int p1, int p2, int p3) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface ContentPreviewType {
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

    static class ChooserTargetServiceConnection implements android.content.ServiceConnection {
        private com.android.internal.app.ResolverActivity.DisplayResolveInfo mOriginalTarget;
        private android.content.ComponentName mConnectedComponent;
        private com.android.internal.app.ChooserActivity mChooserActivity;
        private final java.lang.Object mLock = null;
        private final android.service.chooser.IChooserTargetResult mChooserTargetResult = null;
        public ChooserTargetServiceConnection(com.android.internal.app.ChooserActivity p0, com.android.internal.app.ResolverActivity.DisplayResolveInfo p1) {}
        public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
        public void onServiceDisconnected(android.content.ComponentName p0) {}
        public void destroy() {}
        public java.lang.String toString() { return null; }
    }

    static interface ChooserTargetInfo extends com.android.internal.app.ResolverActivity.TargetInfo {
        public float getModifiedScore();
        public android.service.chooser.ChooserTarget getChooserTarget();
        default public boolean isSimilar(com.android.internal.app.ChooserActivity.ChooserTargetInfo p0) { return false; }
    }

    class ChooserRowAdapter extends android.widget.BaseAdapter {
        private com.android.internal.app.ChooserActivity.ChooserListAdapter mChooserListAdapter;
        private final android.view.LayoutInflater mLayoutInflater = null;
        private com.android.internal.app.ChooserActivity.DirectShareViewHolder mDirectShareViewHolder;
        private int mChooserTargetWidth;
        private boolean mShowAzLabelIfPoss;
        private boolean mHideContentPreview;
        private boolean mLayoutRequested;
        private static final int VIEW_TYPE_DIRECT_SHARE = 0;
        private static final int VIEW_TYPE_NORMAL = 1;
        private static final int VIEW_TYPE_CONTENT_PREVIEW = 2;
        private static final int VIEW_TYPE_PROFILE = 3;
        private static final int VIEW_TYPE_AZ_LABEL = 4;
        private static final int MAX_TARGETS_PER_ROW_PORTRAIT = 4;
        private static final int MAX_TARGETS_PER_ROW_LANDSCAPE = 8;
        private static final int NUM_EXPANSIONS_TO_HIDE_AZ_LABEL = 20;
        public ChooserRowAdapter(com.android.internal.app.ChooserActivity p0, com.android.internal.app.ChooserActivity.ChooserListAdapter p1) { super(); }
        public boolean calculateChooserTargetWidth(int p0) { return false; }
        private int getMaxTargetsPerRow() { return 0; }
        public void hideContentPreview() {}
        public boolean consumeLayoutRequest() { return false; }
        public boolean areAllItemsEnabled() { return false; }
        public boolean isEnabled(int p0) { return false; }
        public int getCount() { return 0; }
        public int getContentPreviewRowCount() { return 0; }
        public int getProfileRowCount() { return 0; }
        public int getCallerAndRankedTargetRowCount() { return 0; }
        public int getServiceTargetRowCount() { return 0; }
        public int getAzLabelRowCount() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public int getItemViewType(int p0) { return 0; }
        public int getViewTypeCount() { return 0; }
        private android.view.ViewGroup createContentPreviewView(android.view.View p0, android.view.ViewGroup p1) { return null; }
        private android.view.View createProfileView(android.view.View p0, android.view.ViewGroup p1) { return null; }
        private android.view.View createAzLabelView(android.view.ViewGroup p0) { return null; }
        private com.android.internal.app.ChooserActivity.RowViewHolder loadViewsIntoRow(com.android.internal.app.ChooserActivity.RowViewHolder p0) { return null; }
        private void setViewBounds(android.view.View p0, int p1, int p2) {}
        com.android.internal.app.ChooserActivity.RowViewHolder createViewHolder(int p0, android.view.ViewGroup p1) { return null; }
        int getRowType(int p0) { return 0; }
        void bindViewHolder(int p0, com.android.internal.app.ChooserActivity.RowViewHolder p1) {}
        int getFirstRowPosition(int p0) { return 0; }
        public void handleScroll(android.view.View p0, int p1, int p2) {}
    }

    public class ChooserListController extends com.android.internal.app.ResolverListController {
        public ChooserListController(com.android.internal.app.ChooserActivity p0, android.content.Context p1, android.content.pm.PackageManager p2, android.content.Intent p3, java.lang.String p4, int p5, com.android.internal.app.AbstractResolverComparator p6) { super((android.content.Context)null, (android.content.pm.PackageManager)null, (android.content.Intent)null, (java.lang.String)null, 0); }
        boolean isComponentFiltered(android.content.ComponentName p0) { return false; }
    }

    public class ChooserListAdapter extends com.android.internal.app.ResolverActivity.ResolveListAdapter {
        public static final int TARGET_BAD = -1;
        public static final int TARGET_CALLER = 0;
        public static final int TARGET_SERVICE = 1;
        public static final int TARGET_STANDARD = 2;
        public static final int TARGET_STANDARD_AZ = 3;
        private static final int MAX_SUGGESTED_APP_TARGETS = 4;
        private static final int MAX_CHOOSER_TARGETS_PER_APP = 2;
        private static final int MAX_SERVICE_TARGETS = 8;
        private final int mMaxShortcutTargetsPerApp = 0;
        private int mNumShortcutResults;
        private com.android.internal.app.ChooserActivity.ChooserTargetInfo mPlaceHolderTargetInfo;
        private final java.util.List<com.android.internal.app.ChooserActivity.ChooserTargetInfo> mServiceTargets = null;
        private final java.util.List<com.android.internal.app.ResolverActivity.TargetInfo> mCallerTargets = null;
        private final com.android.internal.app.ChooserActivity.BaseChooserTargetComparator mBaseTargetComparator = null;
        public ChooserListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, int p4, boolean p5, com.android.internal.app.ResolverListController p6) { super(null, null, null, null, 0, false, null); }
        public void handlePackagesChanged() {}
        public void notifyDataSetChanged() {}
        private void refreshListView() {}
        private void createPlaceHolders() {}
        public android.view.View onCreateView(android.view.ViewGroup p0) { return null; }
        protected void onBindView(android.view.View p0, com.android.internal.app.ResolverActivity.TargetInfo p1) {}
        public void onListRebuilt() {}
        public boolean shouldGetResolvedFilter() { return false; }
        public int getCount() { return 0; }
        public int getUnfilteredCount() { return 0; }
        public int getCallerTargetCount() { return 0; }
        public int getSelectableServiceTargetCount() { return 0; }
        public int getServiceTargetCount() { return 0; }
        int getAlphaTargetCount() { return 0; }
        int getRankedTargetCount() { return 0; }
        private int getMaxRankedTargets() { return 0; }
        public int getPositionTargetType(int p0) { return 0; }
        public com.android.internal.app.ResolverActivity.TargetInfo getItem(int p0) { return null; }
        public com.android.internal.app.ResolverActivity.TargetInfo targetInfoForPosition(int p0, boolean p1) { return null; }
        public void addServiceResults(com.android.internal.app.ResolverActivity.DisplayResolveInfo p0, java.util.List<android.service.chooser.ChooserTarget> p1, boolean p2) {}
        private int getNumShortcutResults() { return 0; }
        private float getBaseScore(com.android.internal.app.ResolverActivity.DisplayResolveInfo p0, boolean p1) { return 0.0f; }
        public void completeServiceTargetLoading() {}
        private boolean insertServiceTarget(com.android.internal.app.ChooserActivity.ChooserTargetInfo p0) { return false; }
    }

    private class ChooserHandler extends android.os.Handler {
        private static final int CHOOSER_TARGET_SERVICE_RESULT = 1;
        private static final int CHOOSER_TARGET_SERVICE_WATCHDOG_MIN_TIMEOUT = 2;
        private static final int CHOOSER_TARGET_SERVICE_WATCHDOG_MAX_TIMEOUT = 3;
        private static final int SHORTCUT_MANAGER_SHARE_TARGET_RESULT = 4;
        private static final int SHORTCUT_MANAGER_SHARE_TARGET_RESULT_COMPLETED = 5;
        private static final int LIST_VIEW_UPDATE_MESSAGE = 6;
        private static final int WATCHDOG_TIMEOUT_MAX_MILLIS = 10000;
        private static final int WATCHDOG_TIMEOUT_MIN_MILLIS = 3000;
        private boolean mMinTimeoutPassed;
        private ChooserHandler(com.android.internal.app.ChooserActivity p0) { super(); }
        private void removeAllMessages() {}
        private void restartServiceRequestTimer() {}
        private void maybeStopServiceRequestTimer() {}
        public void handleMessage(android.os.Message p0) {}
    }

    static class BaseChooserTargetComparator implements java.util.Comparator<android.service.chooser.ChooserTarget> {
        BaseChooserTargetComparator() {}
        public int compare(android.service.chooser.ChooserTarget p0, android.service.chooser.ChooserTarget p1) { return 0; }
    }

    class AzInfoComparator implements java.util.Comparator<com.android.internal.app.ResolverActivity.DisplayResolveInfo> {
        java.text.Collator mCollator;
        AzInfoComparator(com.android.internal.app.ChooserActivity p0, android.content.Context p1) {}
        public int compare(com.android.internal.app.ResolverActivity.DisplayResolveInfo p0, com.android.internal.app.ResolverActivity.DisplayResolveInfo p1) { return 0; }
    }
}
