package com.android.internal.app;

public class ResolverActivity extends android.app.Activity implements com.android.internal.app.ResolverListAdapter.ResolverListCommunicator {
    private boolean mSafeForwardingMode;
    private android.widget.Button mAlwaysButton;
    private android.widget.Button mOnceButton;
    protected android.view.View mProfileView;
    private int mLastSelected;
    private boolean mResolvingHome;
    private int mProfileSwitchMessageId;
    private int mLayoutId;
    protected final java.util.ArrayList<android.content.Intent> mIntents = null;
    private com.android.internal.app.ResolverActivity.PickTargetOptionRequest mPickOptionRequest;
    private java.lang.String mReferrerPackage;
    private java.lang.CharSequence mTitle;
    private int mDefaultTitleResId;
    protected boolean mSupportsAlwaysUseOption;
    protected com.android.internal.widget.ResolverDrawerLayout mResolverDrawerLayout;
    protected android.content.pm.PackageManager mPm;
    protected int mLaunchedFromUid;
    private static final java.lang.String TAG = "ResolverActivity";
    private static final boolean DEBUG = false;
    private static final java.lang.String LAST_SHOWN_TAB_KEY = "last_shown_tab_key";
    private boolean mRegistered;
    protected android.graphics.Insets mSystemWindowInsets;
    private android.widget.Space mFooterSpacer;
    private boolean mRetainInOnStop;
    private static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGS = ":settings:show_fragment_args";
    private static final java.lang.String EXTRA_FRAGMENT_ARG_KEY = ":settings:fragment_args_key";
    private static final java.lang.String OPEN_LINKS_COMPONENT_KEY = "app_link_state";
    protected static final java.lang.String METRICS_CATEGORY_RESOLVER = "intent_resolver";
    protected static final java.lang.String METRICS_CATEGORY_CHOOSER = "intent_chooser";
    private boolean mWorkProfileHasBeenEnabled;
    public static boolean ENABLE_TABBED_VIEW;
    private static final java.lang.String TAB_TAG_PERSONAL = "personal";
    private static final java.lang.String TAB_TAG_WORK = "work";
    private com.android.internal.content.PackageMonitor mPersonalPackageMonitor;
    private com.android.internal.content.PackageMonitor mWorkPackageMonitor;
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter mMultiProfilePagerAdapter;
    public static final java.lang.String EXTRA_IS_AUDIO_CAPTURE_DEVICE = "is_audio_capture_device";
    static final java.lang.String EXTRA_SELECTED_PROFILE = "com.android.internal.app.ResolverActivity.EXTRA_SELECTED_PROFILE";
    static final java.lang.String EXTRA_CALLING_USER = "com.android.internal.app.ResolverActivity.EXTRA_CALLING_USER";
    static final int PROFILE_PERSONAL = 0;
    static final int PROFILE_WORK = 1;
    private android.content.BroadcastReceiver mWorkProfileStateReceiver;
    private android.os.UserHandle mHeaderCreatorUser;
    private android.os.UserHandle mWorkProfileUserHandle;
    public ResolverActivity() { super(); }
    public static int getLabelRes(java.lang.String p0) { return 0; }
    protected com.android.internal.content.PackageMonitor createPackageMonitor(com.android.internal.app.ResolverListAdapter p0) { return null; }
    private android.content.Intent makeMyIntent() { return null; }
    protected void onCreate(android.os.Bundle p0) {}
    protected void onCreate(android.os.Bundle p0, android.content.Intent p1, java.lang.CharSequence p2, android.content.Intent[] p3, java.util.List<android.content.pm.ResolveInfo> p4, boolean p5) {}
    protected void onCreate(android.os.Bundle p0, android.content.Intent p1, java.lang.CharSequence p2, int p3, android.content.Intent[] p4, java.util.List<android.content.pm.ResolveInfo> p5, boolean p6) {}
    private boolean isIntentPicker() { return false; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter createMultiProfilePagerAdapter(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private com.android.internal.app.ResolverMultiProfilePagerAdapter createResolverMultiProfilePagerAdapterForOneProfile(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    private com.android.internal.app.ResolverMultiProfilePagerAdapter createResolverMultiProfilePagerAdapterForTwoProfiles(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    protected int appliedThemeResId() { return 0; }
    int getSelectedProfileExtra() { return 0; }
    @com.android.internal.app.AbstractMultiProfilePagerAdapter.Profile
    protected int getCurrentProfile() { return 0; }
    protected android.os.UserHandle getPersonalProfileUserHandle() { return null; }
    protected android.os.UserHandle getWorkProfileUserHandle() { return null; }
    protected android.os.UserHandle fetchWorkProfileUserProfile() { return null; }
    private boolean hasWorkProfile() { return false; }
    protected boolean shouldShowTabs() { return false; }
    protected void onProfileClick(android.view.View p0) {}
    protected boolean shouldAddFooterView() { return false; }
    protected void applyFooterView(int p0) {}
    protected android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1) { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    private void updateIntentPickerPaddings() {}
    public void sendVoiceChoicesIfNeeded() {}
    android.app.VoiceInteractor.PickOptionRequest.Option optionForChooserTarget(com.android.internal.app.chooser.TargetInfo p0, int p1) { return null; }
    protected final void setAdditionalTargets(android.content.Intent[] p0) {}
    public android.content.Intent getTargetIntent() { return null; }
    protected java.lang.String getReferrerPackageName() { return null; }
    public int getLayoutResource() { return 0; }
    public void updateProfileViewButton() {}
    private void setProfileSwitchMessageId(int p0) {}
    public void setSafeForwardingMode(boolean p0) {}
    protected java.lang.CharSequence getTitleForAction(android.content.Intent p0, int p1) { return null; }
    void dismiss() {}
    protected void onRestart() {}
    protected void onStart() {}
    private boolean isWorkProfileEnabled() { return false; }
    private void registerWorkProfileStateReceiver() {}
    protected void onStop() {}
    protected void onDestroy() {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    private boolean hasManagedProfile() { return false; }
    private boolean supportsManagedProfiles(android.content.pm.ResolveInfo p0) { return false; }
    private void setAlwaysButtonEnabled(boolean p0, int p1, boolean p2) {}
    public void onButtonClick(android.view.View p0) {}
    public void startSelected(int p0, boolean p1, boolean p2) {}
    public android.content.Intent getReplacementIntent(android.content.pm.ActivityInfo p0, android.content.Intent p1) { return null; }
    public final void onPostListReady(com.android.internal.app.ResolverListAdapter p0, boolean p1, boolean p2) {}
    protected void onListRebuilt(com.android.internal.app.ResolverListAdapter p0) {}
    protected boolean onTargetSelected(com.android.internal.app.chooser.TargetInfo p0, boolean p1) { return false; }
    private void prepareIntentForCrossProfileLaunch(android.content.Intent p0) {}
    private boolean isLaunchingTargetInOtherProfile() { return false; }
    public void safelyStartActivity(com.android.internal.app.chooser.TargetInfo p0) {}
    public void safelyStartActivityAsUser(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1) {}
    private void safelyStartActivityInternal(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1) {}
    private void maybeLogCrossProfileTargetLaunch(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1) {}
    public boolean startAsCallerImpl(android.content.Intent p0, android.os.Bundle p1, boolean p2, int p3) { return false; }
    public void onActivityStarted(com.android.internal.app.chooser.TargetInfo p0) {}
    public boolean shouldGetActivityMetadata() { return false; }
    public boolean shouldAutoLaunchSingleChoice(com.android.internal.app.chooser.TargetInfo p0) { return false; }
    void showTargetDetails(android.content.pm.ResolveInfo p0) {}
    protected com.android.internal.app.ResolverListAdapter createResolverListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, android.os.UserHandle p5) { return null; }
    protected com.android.internal.app.ResolverListController createListController(android.os.UserHandle p0) { return null; }
    private boolean configureContentView() { return false; }
    protected boolean postRebuildList(boolean p0) { return false; }
    final boolean postRebuildListInternal(boolean p0) { return false; }
    private int isPermissionGranted(java.lang.String p0, int p1) { return 0; }
    private boolean maybeAutolaunchActivity() { return false; }
    private boolean maybeAutolaunchIfSingleTarget() { return false; }
    private boolean maybeAutolaunchIfNoAppsOnInactiveTab() { return false; }
    private boolean maybeAutolaunchIfCrossProfileSupported() { return false; }
    private boolean canAppInteractCrossProfiles(java.lang.String p0) { return false; }
    private boolean isAutolaunching() { return false; }
    private void setupProfileTabs() {}
    void onHorizontalSwipeStateChanged(int p0) {}
    private void maybeHideDivider() {}
    protected void onProfileTabSelected() {}
    private void resetCheckedItem() {}
    private void resetTabsHeaderStyle(android.widget.TabWidget p0) {}
    private static int getAttrColor(android.content.Context p0, int p1) { return 0; }
    private void updateActiveTabStyle(android.widget.TabHost p0) {}
    private void setupViewVisibilities() {}
    public void addUseDifferentAppLabelIfNecessary(com.android.internal.app.ResolverListAdapter p0) {}
    private void setupAdapterListView(android.widget.ListView p0, com.android.internal.app.ResolverActivity.ItemClickListener p1) {}
    private void maybeCreateHeader(com.android.internal.app.ResolverListAdapter p0) {}
    protected void resetButtonBar() {}
    private void setButtonBarIgnoreOffset(boolean p0) {}
    private void resetAlwaysOrOnceButtonBar() {}
    public boolean useLayoutWithDefault() { return false; }
    protected void setRetainInOnStop(boolean p0) {}
    public boolean resolveInfoMatch(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return false; }
    protected java.lang.String getMetricsCategory() { return null; }
    public void onHandlePackagesChanged(com.android.internal.app.ResolverListAdapter p0) {}
    private boolean inactiveListAdapterHasItems() { return false; }
    private android.content.BroadcastReceiver createWorkProfileStateReceiver() { return null; }
    static final boolean isSpecificUriMatch(int p0) { return false; }
    protected void maybeLogProfileChange() {}

    private static enum ActionTitle {
        VIEW(0, 0),
        EDIT(0, 0),
        SEND(0, 0),
        SENDTO(0, 0),
        SEND_MULTIPLE(0, 0),
        CAPTURE_IMAGE(0, 0),
        DEFAULT(0, 0),
        HOME(0, 0);
        public static final int BROWSABLE_TITLE_RES = 17041624;
        public static final int BROWSABLE_HOST_TITLE_RES = 17041622;
        public static final int BROWSABLE_HOST_APP_TITLE_RES = 17041623;
        public static final int BROWSABLE_APP_TITLE_RES = 17041625;
        public final java.lang.String action = null;
        public final int titleRes = 0;
        public final int namedTitleRes = 0;
        public final int labelRes = 0;
        private ActionTitle(int p0, int p1) {}
        public static com.android.internal.app.ResolverActivity.ActionTitle forAction(java.lang.String p0) { return null; }
    }

    class ItemClickListener implements android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener {
        ItemClickListener(com.android.internal.app.ResolverActivity p0) {}
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
        public boolean onItemLongClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) { return false; }
    }

    static class PickTargetOptionRequest extends android.app.VoiceInteractor.PickOptionRequest {
        public PickTargetOptionRequest(android.app.VoiceInteractor.Prompt p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) { super((android.app.VoiceInteractor.Prompt)null, (android.app.VoiceInteractor.PickOptionRequest.Option[])null, (android.os.Bundle)null); }
        public void onCancel() {}
        public void onPickOptionResult(boolean p0, android.app.VoiceInteractor.PickOptionRequest.Option[] p1, android.os.Bundle p2) {}
    }

    public static final class ResolvedComponentInfo {
        public final android.content.ComponentName name = null;
        private final java.util.List<android.content.Intent> mIntents = null;
        private final java.util.List<android.content.pm.ResolveInfo> mResolveInfos = null;
        private boolean mPinned;
        public ResolvedComponentInfo(android.content.ComponentName p0, android.content.Intent p1, android.content.pm.ResolveInfo p2) {}
        public void add(android.content.Intent p0, android.content.pm.ResolveInfo p1) {}
        public int getCount() { return 0; }
        public android.content.Intent getIntentAt(int p0) { return null; }
        public android.content.pm.ResolveInfo getResolveInfoAt(int p0) { return null; }
        public int findIntent(android.content.Intent p0) { return 0; }
        public int findResolveInfo(android.content.pm.ResolveInfo p0) { return 0; }
        public boolean isPinned() { return false; }
        public void setPinned(boolean p0) {}
    }
}
