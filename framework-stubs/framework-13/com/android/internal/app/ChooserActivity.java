package com.android.internal.app;

public class ChooserActivity extends com.android.internal.app.ResolverActivity implements com.android.internal.app.ChooserListAdapter.ChooserListCommunicator, com.android.internal.app.chooser.SelectableTargetInfo.SelectableTargetInfoCommunicator {
    public static final java.lang.String EXTRA_PRIVATE_RETAIN_IN_ON_STOP = "com.android.internal.app.ChooserActivity.EXTRA_PRIVATE_RETAIN_IN_ON_STOP";
    public static final java.lang.String FIRST_IMAGE_PREVIEW_TRANSITION_NAME = "screenshot_preview_image";
    public static final java.lang.String LAUNCH_LOCATION_DIRECT_SHARE = "direct_share";
    public static final java.lang.String CHOOSER_TARGET = "chooser_target";
    public static final java.lang.String APP_PREDICTION_INTENT_FILTER_KEY = "intent_filter";
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
    protected com.android.internal.app.ChooserActivityLogger mChooserActivityLogger;
    int mListViewUpdateDelayMs;
    protected boolean mIsSuccessfullySelected;
    protected static final int CONTENT_PREVIEW_IMAGE = 1;
    protected static final int CONTENT_PREVIEW_FILE = 2;
    protected static final int CONTENT_PREVIEW_TEXT = 3;
    protected com.android.internal.logging.MetricsLogger mMetricsLogger;
    protected com.android.internal.app.ChooserMultiProfilePagerAdapter mChooserMultiProfilePagerAdapter;
    public ChooserActivity() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    protected int appliedThemeResId() { return 0; }
    static android.content.SharedPreferences getPinnedSharedPrefs(android.content.Context p0) { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter createMultiProfilePagerAdapter(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    protected boolean postRebuildList(boolean p0) { return false; }
    protected boolean isWorkProfile() { return false; }
    protected com.android.internal.content.PackageMonitor createPackageMonitor(com.android.internal.app.ResolverListAdapter p0) { return null; }
    public void handlePackagesChanged() {}
    protected void onResume() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected android.content.ComponentName getNearbySharingComponent() { return null; }
    protected android.content.ComponentName getEditSharingComponent() { return null; }
    protected com.android.internal.app.chooser.TargetInfo getEditSharingTarget(android.content.Intent p0) { return null; }
    protected com.android.internal.app.chooser.TargetInfo getNearbySharingTarget(android.content.Intent p0) { return null; }
    public android.database.Cursor queryResolver(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
    protected boolean isImageType(java.lang.String p0) { return false; }
    protected void onDestroy() {}
    public android.content.Intent getReplacementIntent(android.content.pm.ActivityInfo p0, android.content.Intent p1) { return null; }
    public void onActivityStarted(com.android.internal.app.chooser.TargetInfo p0) {}
    public void addUseDifferentAppLabelIfNecessary(com.android.internal.app.ResolverListAdapter p0) {}
    public int getLayoutResource() { return 0; }
    public boolean shouldGetActivityMetadata() { return false; }
    public boolean shouldAutoLaunchSingleChoice(com.android.internal.app.chooser.TargetInfo p0) { return false; }
    protected boolean onTargetSelected(com.android.internal.app.chooser.TargetInfo p0, boolean p1) { return false; }
    public void startSelected(int p0, boolean p1, boolean p2) {}
    protected boolean shouldAddFooterView() { return false; }
    protected void applyFooterView(int p0) {}
    protected void queryDirectShareTargets(com.android.internal.app.ChooserListAdapter p0, boolean p1) {}
    public java.util.List<android.service.chooser.ChooserTarget> convertToChooserTarget(java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p0, java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> p1, java.util.List<android.app.prediction.AppTarget> p2, int p3) { return null; }
    void updateModelAndChooserCounts(com.android.internal.app.chooser.TargetInfo p0) {}
    void onRefinementResult(com.android.internal.app.chooser.TargetInfo p0, android.content.Intent p1) {}
    void onRefinementCanceled() {}
    boolean checkTargetSourceIntent(com.android.internal.app.chooser.TargetInfo p0, android.content.Intent p1) { return false; }
    protected com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    protected com.android.internal.app.ChooserActivityLogger getChooserActivityLogger() { return null; }
    public com.android.internal.app.ChooserActivity.ChooserGridAdapter createChooserGridAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, android.os.UserHandle p5) { return null; }
    public com.android.internal.app.ChooserListAdapter createChooserListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, com.android.internal.app.ResolverListController p5) { return null; }
    protected com.android.internal.app.ResolverListController createListController(android.os.UserHandle p0) { return null; }
    protected android.graphics.Bitmap loadThumbnail(android.net.Uri p0, android.util.Size p1) { return null; }
    public void onHandlePackagesChanged(com.android.internal.app.ResolverListAdapter p0) {}
    public com.android.internal.app.ResolverListAdapter.ActivityInfoPresentationGetter makePresentationGetter(android.content.pm.ActivityInfo p0) { return null; }
    public android.content.Intent getReferrerFillInIntent() { return null; }
    public int getMaxRankedTargets() { return 0; }
    public void sendListViewUpdateMessage(android.os.UserHandle p0) {}
    public void onListRebuilt(com.android.internal.app.ResolverListAdapter p0, boolean p1) {}
    protected boolean isUserRunning(android.os.UserHandle p0) { return false; }
    protected boolean isUserUnlocked(android.os.UserHandle p0) { return false; }
    protected boolean isQuietModeEnabled(android.os.UserHandle p0) { return false; }
    public boolean isSendAction(android.content.Intent p0) { return false; }
    public void onButtonClick(android.view.View p0) {}
    protected void resetButtonBar() {}
    protected java.lang.String getMetricsCategory() { return null; }
    protected void onProfileTabSelected() {}
    protected android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1) { return null; }
    void onHorizontalSwipeStateChanged(int p0) {}
    protected void maybeLogProfileChange() {}

    static abstract class AzInfoComparator implements java.util.Comparator<com.android.internal.app.chooser.DisplayResolveInfo> {
        java.text.Collator mCollator;
        AzInfoComparator(android.content.Context p0) {}
        public int compare(com.android.internal.app.chooser.DisplayResolveInfo p0, com.android.internal.app.chooser.DisplayResolveInfo p1) { return 0; }
    }

    static abstract class BaseChooserTargetComparator implements java.util.Comparator<android.service.chooser.ChooserTarget> {
        BaseChooserTargetComparator() {}
        public int compare(android.service.chooser.ChooserTarget p0, android.service.chooser.ChooserTarget p1) { return 0; }
    }

    public final class ChooserGridAdapter extends com.android.internal.widget.RecyclerView.Adapter<com.android.internal.widget.RecyclerView.ViewHolder> {
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
        com.android.internal.app.ChooserActivity.ItemGroupViewHolder createItemGroupViewHolder(int p0, android.view.ViewGroup p1) { return null; }
        int getRowType(int p0) { return 0; }
        void bindItemViewHolder(int p0, com.android.internal.app.ChooserActivity.ItemViewHolder p1) {}
        void bindItemGroupViewHolder(int p0, com.android.internal.app.ChooserActivity.ItemGroupViewHolder p1) {}
        int getListPosition(int p0) { return 0; }
        public void handleScroll(android.view.View p0, int p1, int p2) {}
        public com.android.internal.app.ChooserListAdapter getListAdapter() { return null; }
        boolean shouldCellSpan(int p0) { return false; }
        void updateDirectShareExpansion() {}
    }

    private class ChooserHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }

    public class ChooserListController extends com.android.internal.app.ResolverListController {
        public ChooserListController(com.android.internal.app.ChooserActivity p0, android.content.Context p1, android.content.pm.PackageManager p2, android.content.Intent p3, java.lang.String p4, int p5, android.os.UserHandle p6, com.android.internal.app.AbstractResolverComparator p7) { super((android.content.Context)null, (android.content.pm.PackageManager)null, (android.content.Intent)null, (java.lang.String)null, 0, (android.os.UserHandle)null); }
        boolean isComponentFiltered(android.content.ComponentName p0) { return false; }
        public boolean isComponentPinned(android.content.ComponentName p0) { return false; }
        public boolean isFixedAtTop(android.content.ComponentName p0) { return false; }
    }

    static class ChooserTargetRankingInfo {
        public final java.util.List<android.app.prediction.AppTarget> scores = null;
        public final android.os.UserHandle userHandle = null;
        ChooserTargetRankingInfo(java.util.List<android.app.prediction.AppTarget> p0, android.os.UserHandle p1) {}
    }

    private class ContentPreviewCoordinator {
        ContentPreviewCoordinator(com.android.internal.app.ChooserActivity p0, android.view.View p1, boolean p2) {}

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

    static class DirectShareViewHolder extends com.android.internal.app.ChooserActivity.ItemGroupViewHolder {
        DirectShareViewHolder(android.view.ViewGroup p0, java.util.List<android.view.ViewGroup> p1, int p2, int p3, java.util.function.Supplier<com.android.internal.app.ChooserListAdapter> p4) { super(0, null, 0); }
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
    }

    protected static final class EmptyTargetInfo extends com.android.internal.app.chooser.NotSelectableTargetInfo {
        public EmptyTargetInfo() { super(); }
        public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    }

    private class EnterTransitionAnimationDelegate implements android.view.View.OnLayoutChangeListener {
        void postponeTransition() {}
        void markImagePreviewReady() {}
        void markOffsetCalculated() {}
        public void onLayoutChange(android.view.View p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    }

    private static class FileInfo {
        public final java.lang.String name = null;
        public final boolean hasThumbnail = false;
        FileInfo(java.lang.String p0, boolean p1) {}
    }

    static final class FooterViewHolder extends com.android.internal.app.ChooserActivity.ViewHolderBase {
        FooterViewHolder(android.view.View p0, int p1) { super(null, 0); }
    }

    static abstract class ItemGroupViewHolder extends com.android.internal.app.ChooserActivity.ViewHolderBase {
        protected int mMeasuredRowHeight;
        protected final android.view.View[] mCells = null;
        ItemGroupViewHolder(int p0, android.view.View p1, int p2) { super(null, 0); }
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
        ItemViewHolder(com.android.internal.app.ChooserActivity p0, android.view.View p1, boolean p2, int p3) { super(null, 0); }
    }

    static final class PlaceHolderTargetInfo extends com.android.internal.app.chooser.NotSelectableTargetInfo {
        PlaceHolderTargetInfo() { super(); }
        public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    }

    static class RefinementResultReceiver extends android.os.ResultReceiver {
        public RefinementResultReceiver(com.android.internal.app.ChooserActivity p0, com.android.internal.app.chooser.TargetInfo p1, android.os.Handler p2) { super((android.os.Handler)null); }
        protected void onReceiveResult(int p0, android.os.Bundle p1) {}
        public void destroy() {}
    }

    public static class RoundedRectImageView extends android.widget.ImageView {
        public RoundedRectImageView(android.content.Context p0) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public RoundedRectImageView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        public void setRadius(int p0) {}
        public void setExtraImageCount(int p0) {}
        protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
        protected void onDraw(android.graphics.Canvas p0) {}
    }

    static class ServiceResultInfo {
        public final com.android.internal.app.chooser.DisplayResolveInfo originalTarget = null;
        public final java.util.List<android.service.chooser.ChooserTarget> resultTargets = null;
        public final android.os.UserHandle userHandle = null;
        public ServiceResultInfo(com.android.internal.app.chooser.DisplayResolveInfo p0, java.util.List<android.service.chooser.ChooserTarget> p1, android.os.UserHandle p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShareTargetType {
    }

    static class SingleRowViewHolder extends com.android.internal.app.ChooserActivity.ItemGroupViewHolder {
        SingleRowViewHolder(android.view.ViewGroup p0, int p1, int p2) { super(0, null, 0); }
        public android.view.ViewGroup getViewGroup() { return null; }
        public android.view.ViewGroup getRowByIndex(int p0) { return null; }
        public android.view.ViewGroup getRow(int p0) { return null; }
        public android.view.ViewGroup addView(int p0, android.view.View p1) { return null; }
        public void setViewVisibility(int p0, int p1) {}
    }

    static abstract class ViewHolderBase extends com.android.internal.widget.RecyclerView.ViewHolder {
        ViewHolderBase(android.view.View p0, int p1) { super(null); }
        int getViewType() { return 0; }
    }
}
