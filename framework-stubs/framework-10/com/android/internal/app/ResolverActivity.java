package com.android.internal.app;

public class ResolverActivity extends android.app.Activity {
    boolean mEnableChooserDelegate;
    @android.annotation.UnsupportedAppUsage
    protected com.android.internal.app.ResolverActivity.ResolveListAdapter mAdapter;
    private boolean mSafeForwardingMode;
    protected android.widget.AbsListView mAdapterView;
    private android.widget.Button mAlwaysButton;
    private android.widget.Button mOnceButton;
    protected android.view.View mProfileView;
    private int mIconDpi;
    private int mLastSelected;
    private boolean mResolvingHome;
    private int mProfileSwitchMessageId;
    private int mLayoutId;
    private final java.util.ArrayList<android.content.Intent> mIntents = null;
    private com.android.internal.app.ResolverActivity.PickTargetOptionRequest mPickOptionRequest;
    private java.lang.String mReferrerPackage;
    private java.lang.CharSequence mTitle;
    private int mDefaultTitleResId;
    private boolean mUseLayoutForBrowsables;
    private boolean mSupportsAlwaysUseOption;
    protected com.android.internal.widget.ResolverDrawerLayout mResolverDrawerLayout;
    @android.annotation.UnsupportedAppUsage
    protected android.content.pm.PackageManager mPm;
    protected int mLaunchedFromUid;
    private static final java.lang.String TAG = "ResolverActivity";
    private static final boolean DEBUG = false;
    private java.lang.Runnable mPostListReadyRunnable;
    private boolean mRegistered;
    private android.graphics.ColorMatrixColorFilter mSuspendedMatrixColorFilter;
    protected android.graphics.Insets mSystemWindowInsets;
    private android.widget.Space mFooterSpacer;
    private boolean mRetainInOnStop;
    private static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGS = ":settings:show_fragment_args";
    private static final java.lang.String EXTRA_FRAGMENT_ARG_KEY = ":settings:fragment_args_key";
    private static final java.lang.String OPEN_LINKS_COMPONENT_KEY = "app_link_state";
    private final com.android.internal.content.PackageMonitor mPackageMonitor = null;
    public ResolverActivity() { super(); }
    public static int getLabelRes(java.lang.String p0) { return 0; }
    protected com.android.internal.content.PackageMonitor createPackageMonitor() { return null; }
    private android.content.Intent makeMyIntent() { return null; }
    protected void onCreate(android.os.Bundle p0) {}
    @android.annotation.UnsupportedAppUsage
    protected void onCreate(android.os.Bundle p0, android.content.Intent p1, java.lang.CharSequence p2, android.content.Intent[] p3, java.util.List<android.content.pm.ResolveInfo> p4, boolean p5) {}
    protected void onCreate(android.os.Bundle p0, android.content.Intent p1, java.lang.CharSequence p2, int p3, android.content.Intent[] p4, java.util.List<android.content.pm.ResolveInfo> p5, boolean p6) {}
    protected void onProfileClick(android.view.View p0) {}
    protected android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1) { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    private void initSuspendedColorMatrix() {}
    public void onSetupVoiceInteraction() {}
    public void sendVoiceChoicesIfNeeded() {}
    android.app.VoiceInteractor.PickOptionRequest.Option optionForChooserTarget(com.android.internal.app.ResolverActivity.TargetInfo p0, int p1) { return null; }
    protected final void setAdditionalTargets(android.content.Intent[] p0) {}
    public android.content.Intent getTargetIntent() { return null; }
    protected java.lang.String getReferrerPackageName() { return null; }
    public int getLayoutResource() { return 0; }
    protected void bindProfileView() {}
    private void setProfileSwitchMessageId(int p0) {}
    public void setSafeForwardingMode(boolean p0) {}
    protected java.lang.CharSequence getTitleForAction(android.content.Intent p0, int p1) { return null; }
    void dismiss() {}
    com.android.internal.app.ResolverActivity.ResolveInfoPresentationGetter makePresentationGetter(android.content.pm.ResolveInfo p0) { return null; }
    protected com.android.internal.app.ResolverActivity.ActivityInfoPresentationGetter makePresentationGetter(android.content.pm.ActivityInfo p0) { return null; }
    android.graphics.drawable.Drawable loadIconForResolveInfo(android.content.pm.ResolveInfo p0) { return null; }
    protected void onRestart() {}
    protected void onStop() {}
    protected void onDestroy() {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    private boolean isHttpSchemeAndViewAction(android.content.Intent p0) { return false; }
    private boolean hasManagedProfile() { return false; }
    private boolean supportsManagedProfiles(android.content.pm.ResolveInfo p0) { return false; }
    private void setAlwaysButtonEnabled(boolean p0, int p1, boolean p2) {}
    public void onButtonClick(android.view.View p0) {}
    private void showSettingsForSelected(android.content.pm.ResolveInfo p0) {}
    public void startSelected(int p0, boolean p1, boolean p2) {}
    public android.content.Intent getReplacementIntent(android.content.pm.ActivityInfo p0, android.content.Intent p1) { return null; }
    protected boolean onTargetSelected(com.android.internal.app.ResolverActivity.TargetInfo p0, boolean p1) { return false; }
    public void safelyStartActivity(com.android.internal.app.ResolverActivity.TargetInfo p0) {}
    private void safelyStartActivityInternal(com.android.internal.app.ResolverActivity.TargetInfo p0) {}
    boolean startAsCallerImpl(android.content.Intent p0, android.os.Bundle p1, boolean p2, int p3) { return false; }
    public void onActivityStarted(com.android.internal.app.ResolverActivity.TargetInfo p0) {}
    public boolean shouldGetActivityMetadata() { return false; }
    public boolean shouldAutoLaunchSingleChoice(com.android.internal.app.ResolverActivity.TargetInfo p0) { return false; }
    public void showTargetDetails(android.content.pm.ResolveInfo p0) {}
    public com.android.internal.app.ResolverActivity.ResolveListAdapter createAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, int p4, boolean p5) { return null; }
    protected com.android.internal.app.ResolverListController createListController() { return null; }
    public boolean configureContentView(java.util.List<android.content.Intent> p0, android.content.Intent[] p1, java.util.List<android.content.pm.ResolveInfo> p2) { return false; }
    public void onPrepareAdapterView(android.widget.AbsListView p0, com.android.internal.app.ResolverActivity.ResolveListAdapter p1) {}
    public void setHeader() {}
    private void resetButtonBar() {}
    private void resetAlwaysOrOnceButtonBar() {}
    private boolean useLayoutWithDefault() { return false; }
    protected void setRetainInOnStop(boolean p0) {}
    static boolean resolveInfoMatch(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return false; }
    java.util.List<com.android.internal.app.ResolverActivity.DisplayResolveInfo> getDisplayList() { return null; }
    static final boolean isSpecificUriMatch(int p0) { return false; }

    static class ViewHolder {
        public android.view.View itemView;
        public android.graphics.drawable.Drawable defaultItemViewBackground;
        public android.widget.TextView text;
        public android.widget.TextView text2;
        public android.widget.ImageView icon;
        public ViewHolder(android.view.View p0) {}
    }

    private static abstract class TargetPresentationGetter {
        private android.content.Context mCtx;
        private final int mIconDpi = 0;
        private final boolean mHasSubstitutePermission = false;
        private final android.content.pm.ApplicationInfo mAi = null;
        protected android.content.pm.PackageManager mPm;
        abstract android.graphics.drawable.Drawable getIconSubstituteInternal();
        abstract java.lang.String getAppSubLabelInternal();
        TargetPresentationGetter(android.content.Context p0, int p1, android.content.pm.ApplicationInfo p2) {}
        public android.graphics.drawable.Drawable getIcon(android.os.UserHandle p0) { return null; }
        public android.graphics.Bitmap getIconBitmap(android.os.UserHandle p0) { return null; }
        public java.lang.String getLabel() { return null; }
        public java.lang.String getSubLabel() { return null; }
        protected java.lang.String loadLabelFromResource(android.content.res.Resources p0, int p1) { return null; }
        protected android.graphics.drawable.Drawable loadIconFromResource(android.content.res.Resources p0, int p1) { return null; }
    }

    public static interface TargetInfo {
        public android.content.Intent getResolvedIntent();
        public android.content.ComponentName getResolvedComponentName();
        public boolean start(android.app.Activity p0, android.os.Bundle p1);
        public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2);
        public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2);
        public android.content.pm.ResolveInfo getResolveInfo();
        public java.lang.CharSequence getDisplayLabel();
        public java.lang.CharSequence getExtendedInfo();
        public android.graphics.drawable.Drawable getDisplayIcon();
        public com.android.internal.app.ResolverActivity.TargetInfo cloneFilledIn(android.content.Intent p0, int p1);
        public java.util.List<android.content.Intent> getAllSourceIntents();
        public boolean isSuspended();
    }

    public static final class ResolvedComponentInfo {
        public final android.content.ComponentName name = null;
        private final java.util.List<android.content.Intent> mIntents = null;
        private final java.util.List<android.content.pm.ResolveInfo> mResolveInfos = null;
        public ResolvedComponentInfo(android.content.ComponentName p0, android.content.Intent p1, android.content.pm.ResolveInfo p2) {}
        public void add(android.content.Intent p0, android.content.pm.ResolveInfo p1) {}
        public int getCount() { return 0; }
        public android.content.Intent getIntentAt(int p0) { return null; }
        public android.content.pm.ResolveInfo getResolveInfoAt(int p0) { return null; }
        public int findIntent(android.content.Intent p0) { return 0; }
        public int findResolveInfo(android.content.pm.ResolveInfo p0) { return 0; }
    }

    public class ResolveListAdapter extends android.widget.BaseAdapter {
        private final java.util.List<android.content.Intent> mIntents = null;
        private final android.content.Intent[] mInitialIntents = null;
        private final java.util.List<android.content.pm.ResolveInfo> mBaseResolveList = null;
        protected android.content.pm.ResolveInfo mLastChosen;
        private com.android.internal.app.ResolverActivity.DisplayResolveInfo mOtherProfile;
        private com.android.internal.app.ResolverListController mResolverListController;
        private int mPlaceholderCount;
        private boolean mAllTargetsAreBrowsers;
        protected final android.view.LayoutInflater mInflater = null;
        java.util.List<com.android.internal.app.ResolverActivity.DisplayResolveInfo> mDisplayList;
        java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> mUnfilteredResolveList;
        private int mLastChosenPosition;
        private boolean mFilterLastUsed;
        public ResolveListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, int p4, boolean p5, com.android.internal.app.ResolverListController p6) { super(); }
        public void handlePackagesChanged() {}
        public void setPlaceholderCount(int p0) {}
        public int getPlaceholderCount() { return 0; }
        public com.android.internal.app.ResolverActivity.DisplayResolveInfo getFilteredItem() { return null; }
        public com.android.internal.app.ResolverActivity.DisplayResolveInfo getOtherProfile() { return null; }
        public int getFilteredPosition() { return 0; }
        public boolean hasFilteredItem() { return false; }
        public float getScore(com.android.internal.app.ResolverActivity.DisplayResolveInfo p0) { return 0.0f; }
        public void updateModel(android.content.ComponentName p0) {}
        public void updateChooserCounts(java.lang.String p0, int p1, java.lang.String p2) {}
        public boolean areAllTargetsBrowsers() { return false; }
        protected boolean rebuildList() { return false; }
        private void processSortedList(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
        private void postListReadyRunnable() {}
        public void onListRebuilt() {}
        public boolean shouldGetResolvedFilter() { return false; }
        private void addResolveInfoWithAlternates(com.android.internal.app.ResolverActivity.ResolvedComponentInfo p0, java.lang.CharSequence p1, java.lang.CharSequence p2) {}
        private void updateLastChosenPosition(android.content.pm.ResolveInfo p0) {}
        private void addResolveInfo(com.android.internal.app.ResolverActivity.DisplayResolveInfo p0) {}
        public android.content.pm.ResolveInfo resolveInfoForPosition(int p0, boolean p1) { return null; }
        public com.android.internal.app.ResolverActivity.TargetInfo targetInfoForPosition(int p0, boolean p1) { return null; }
        public int getCount() { return 0; }
        public int getUnfilteredCount() { return 0; }
        public com.android.internal.app.ResolverActivity.TargetInfo getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public int getDisplayResolveInfoCount() { return 0; }
        public com.android.internal.app.ResolverActivity.DisplayResolveInfo getDisplayResolveInfo(int p0) { return null; }
        public final android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public final android.view.View createView(android.view.ViewGroup p0) { return null; }
        public android.view.View onCreateView(android.view.ViewGroup p0) { return null; }
        public final void bindView(int p0, android.view.View p1) {}
        protected void onBindView(android.view.View p0, com.android.internal.app.ResolverActivity.TargetInfo p1) {}
    }

    public static class ResolveInfoPresentationGetter extends com.android.internal.app.ResolverActivity.ActivityInfoPresentationGetter {
        private final android.content.pm.ResolveInfo mRi = null;
        public ResolveInfoPresentationGetter(android.content.Context p0, int p1, android.content.pm.ResolveInfo p2) { super(null, 0, null); }
        android.graphics.drawable.Drawable getIconSubstituteInternal() { return null; }
        java.lang.String getAppSubLabelInternal() { return null; }
    }

    static class PickTargetOptionRequest extends android.app.VoiceInteractor.PickOptionRequest {
        public PickTargetOptionRequest(android.app.VoiceInteractor.Prompt p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) { super((android.app.VoiceInteractor.Prompt)null, (android.app.VoiceInteractor.PickOptionRequest.Option[])null, (android.os.Bundle)null); }
        public void onCancel() {}
        public void onPickOptionResult(boolean p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) {}
    }

    class LoadIconTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.graphics.drawable.Drawable> {
        protected final com.android.internal.app.ResolverActivity.DisplayResolveInfo mDisplayResolveInfo = null;
        private final android.content.pm.ResolveInfo mResolveInfo = null;
        private final android.widget.ImageView mTargetView = null;
        LoadIconTask(com.android.internal.app.ResolverActivity p0, com.android.internal.app.ResolverActivity.DisplayResolveInfo p1, android.widget.ImageView p2) { super(); }
        protected android.graphics.drawable.Drawable doInBackground(java.lang.Void... p0) { return null; }
        protected void onPostExecute(android.graphics.drawable.Drawable p0) {}
    }

    class ItemClickListener implements android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener {
        ItemClickListener(com.android.internal.app.ResolverActivity p0) {}
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
        public boolean onItemLongClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) { return false; }
    }

    public final class DisplayResolveInfo implements com.android.internal.app.ResolverActivity.TargetInfo {
        private final android.content.pm.ResolveInfo mResolveInfo = null;
        private final java.lang.CharSequence mDisplayLabel = null;
        private android.graphics.drawable.Drawable mDisplayIcon;
        private android.graphics.drawable.Drawable mBadge;
        private final java.lang.CharSequence mExtendedInfo = null;
        private final android.content.Intent mResolvedIntent = null;
        private final java.util.List<android.content.Intent> mSourceIntents = null;
        private boolean mIsSuspended;
        public DisplayResolveInfo(com.android.internal.app.ResolverActivity p0, android.content.Intent p1, android.content.pm.ResolveInfo p2, java.lang.CharSequence p3, java.lang.CharSequence p4, android.content.Intent p5) {}
        private DisplayResolveInfo(com.android.internal.app.ResolverActivity p0, com.android.internal.app.ResolverActivity.DisplayResolveInfo p1, android.content.Intent p2, int p3) {}
        public android.content.pm.ResolveInfo getResolveInfo() { return null; }
        public java.lang.CharSequence getDisplayLabel() { return null; }
        public android.graphics.drawable.Drawable getDisplayIcon() { return null; }
        public com.android.internal.app.ResolverActivity.TargetInfo cloneFilledIn(android.content.Intent p0, int p1) { return null; }
        public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
        public void addAlternateSourceIntent(android.content.Intent p0) {}
        public void setDisplayIcon(android.graphics.drawable.Drawable p0) {}
        public boolean hasDisplayIcon() { return false; }
        public java.lang.CharSequence getExtendedInfo() { return null; }
        public android.content.Intent getResolvedIntent() { return null; }
        public android.content.ComponentName getResolvedComponentName() { return null; }
        public boolean start(android.app.Activity p0, android.os.Bundle p1) { return false; }
        public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2) { return false; }
        public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
        public boolean isSuspended() { return false; }
    }

    public static class ActivityInfoPresentationGetter extends com.android.internal.app.ResolverActivity.TargetPresentationGetter {
        private final android.content.pm.ActivityInfo mActivityInfo = null;
        public ActivityInfoPresentationGetter(android.content.Context p0, int p1, android.content.pm.ActivityInfo p2) { super(null, 0, null); }
        android.graphics.drawable.Drawable getIconSubstituteInternal() { return null; }
        java.lang.String getAppSubLabelInternal() { return null; }
    }

    private static enum ActionTitle {
        VIEW(0, 0),
        EDIT(0, 0),
        SEND(0, 0),
        SENDTO(0, 0),
        SEND_MULTIPLE(0, 0),
        CAPTURE_IMAGE(0, 0),
        DEFAULT(0, 0),
        HOME(0, 0);
        public static final int BROWSABLE_TITLE_RES = 17041257;
        public static final int BROWSABLE_HOST_TITLE_RES = 17041255;
        public static final int BROWSABLE_HOST_APP_TITLE_RES = 17041256;
        public static final int BROWSABLE_APP_TITLE_RES = 17041258;
        public final java.lang.String action = null;
        public final int titleRes = 0;
        public final int namedTitleRes = 0;
        public final int labelRes = 0;
        private ActionTitle(int p0, int p1) {}
        public static com.android.internal.app.ResolverActivity.ActionTitle forAction(java.lang.String p0) { return null; }
    }
}
