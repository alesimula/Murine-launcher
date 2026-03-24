package com.android.internal.app;

public class ResolverActivity extends android.app.Activity implements com.android.internal.app.ResolverListAdapter.ResolverListCommunicator {
    protected android.view.View mProfileView;
    protected final java.util.ArrayList<android.content.Intent> mIntents = null;
    protected boolean mSupportsAlwaysUseOption;
    protected com.android.internal.widget.ResolverDrawerLayout mResolverDrawerLayout;
    protected android.content.pm.PackageManager mPm;
    protected int mLaunchedFromUid;
    protected android.graphics.Insets mSystemWindowInsets;
    protected static final java.lang.String METRICS_CATEGORY_RESOLVER = "intent_resolver";
    protected static final java.lang.String METRICS_CATEGORY_CHOOSER = "intent_chooser";
    public static boolean ENABLE_TABBED_VIEW;
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter mMultiProfilePagerAdapter;
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager mQuietModeManager;
    public static final java.lang.String EXTRA_IS_AUDIO_CAPTURE_DEVICE = "is_audio_capture_device";
    protected static final java.lang.String EXTRA_RESTRICT_TO_SINGLE_USER = "com.android.internal.app.ResolverActivity.EXTRA_RESTRICT_TO_SINGLE_USER";
    protected static final java.lang.String EXTRA_SELECTED_PROFILE = "com.android.internal.app.ResolverActivity.EXTRA_SELECTED_PROFILE";
    static final java.lang.String EXTRA_CALLING_USER = "com.android.internal.app.ResolverActivity.EXTRA_CALLING_USER";
    protected static final int PROFILE_PERSONAL = 0;
    protected static final int PROFILE_WORK = 1;
    protected final com.android.internal.util.LatencyTracker mLatencyTracker = null;
    public ResolverActivity() { super(); }
    protected ResolverActivity(boolean p0) { super(); }
    public static int getLabelRes(java.lang.String p0) { return 0; }
    protected com.android.internal.content.PackageMonitor createPackageMonitor(com.android.internal.app.ResolverListAdapter p0) { return null; }
    protected void super_onCreate(android.os.Bundle p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onCreate(android.os.Bundle p0, android.content.Intent p1, java.lang.CharSequence p2, android.content.Intent[] p3, java.util.List<android.content.pm.ResolveInfo> p4, boolean p5) {}
    protected void onCreate(android.os.Bundle p0, android.content.Intent p1, java.lang.CharSequence p2, int p3, android.content.Intent[] p4, java.util.List<android.content.pm.ResolveInfo> p5, boolean p6) {}
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter createMultiProfilePagerAdapter(android.content.Intent[] p0, java.util.List<android.content.pm.ResolveInfo> p1, boolean p2) { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.MyUserIdProvider createMyUserIdProvider() { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.CrossProfileIntentsChecker createCrossProfileIntentsChecker() { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager createQuietModeManager() { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider createBlockerEmptyStateProvider() { return null; }
    protected com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider createEmptyStateProvider(android.os.UserHandle p0) { return null; }
    protected int appliedThemeResId() { return 0; }
    int getSelectedProfileExtra() { return 0; }
    @com.android.internal.app.AbstractMultiProfilePagerAdapter.Profile
    protected int getCurrentProfile() { return 0; }
    protected android.os.UserHandle getPersonalProfileUserHandle() { return null; }
    @android.annotation.Nullable
    protected android.os.UserHandle getWorkProfileUserHandle() { return null; }
    @android.annotation.Nullable
    protected android.os.UserHandle getCloneProfileUserHandle() { return null; }
    protected android.os.UserHandle getTabOwnerUserHandleForLaunch() { return null; }
    protected android.os.UserHandle getPrivateProfileUserHandle() { return null; }
    protected android.os.UserHandle fetchPersonalProfileUserHandle() { return null; }
    @android.annotation.Nullable
    protected android.os.UserHandle fetchWorkProfileUserProfile() { return null; }
    @android.annotation.Nullable
    protected android.os.UserHandle fetchCloneProfileUserHandle() { return null; }
    @android.annotation.Nullable
    protected android.os.UserHandle fetchPrivateProfileUserHandle() { return null; }
    protected final boolean isLaunchedAsCloneProfile() { return false; }
    protected final boolean isLaunchedAsPrivateProfile() { return false; }
    protected final boolean isLaunchedInSingleUserMode() { return false; }
    protected boolean shouldShowTabs() { return false; }
    protected void onProfileClick(android.view.View p0) {}
    protected boolean shouldAddFooterView() { return false; }
    protected void applyFooterView(int p0) {}
    protected android.view.WindowInsets onApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1) { return null; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void sendVoiceChoicesIfNeeded() {}
    android.app.VoiceInteractor.PickOptionRequest.Option optionForChooserTarget(com.android.internal.app.chooser.TargetInfo p0, int p1) { return null; }
    protected final void setAdditionalTargets(android.content.Intent[] p0) {}
    public android.content.Intent getTargetIntent() { return null; }
    protected java.lang.String getReferrerPackageName() { return null; }
    public int getLayoutResource() { return 0; }
    public void updateProfileViewButton() {}
    public void setSafeForwardingMode(boolean p0) {}
    protected java.lang.CharSequence getTitleForAction(android.content.Intent p0, int p1) { return null; }
    void dismiss() {}
    protected void onRestart() {}
    protected void onStart() {}
    protected void onStop() {}
    protected void onDestroy() {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    public void onButtonClick(android.view.View p0) {}
    public void startSelected(int p0, boolean p1, boolean p2) {}
    public android.content.Intent getReplacementIntent(android.content.pm.ActivityInfo p0, android.content.Intent p1) { return null; }
    public final void onPostListReady(com.android.internal.app.ResolverListAdapter p0, boolean p1, boolean p2) {}
    protected void onListRebuilt(com.android.internal.app.ResolverListAdapter p0, boolean p1) {}
    protected boolean onTargetSelected(com.android.internal.app.chooser.TargetInfo p0, boolean p1) { return false; }
    public final void safelyStartActivity(com.android.internal.app.chooser.TargetInfo p0) {}
    public final void safelyStartActivityAsUser(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1) {}
    protected final void safelyStartActivityAsUser(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1, android.os.Bundle p2) {}
    protected void safelyStartActivityInternal(com.android.internal.app.chooser.TargetInfo p0, android.os.UserHandle p1, android.os.Bundle p2) {}
    public void onActivityStarted(com.android.internal.app.chooser.TargetInfo p0) {}
    public boolean shouldGetActivityMetadata() { return false; }
    public boolean shouldAutoLaunchSingleChoice(com.android.internal.app.chooser.TargetInfo p0) { return false; }
    void showTargetDetails(android.content.pm.ResolveInfo p0) {}
    protected com.android.internal.app.ResolverListAdapter createResolverListAdapter(android.content.Context p0, java.util.List<android.content.Intent> p1, android.content.Intent[] p2, java.util.List<android.content.pm.ResolveInfo> p3, boolean p4, android.os.UserHandle p5) { return null; }
    protected com.android.internal.app.ResolverListController createListController(android.os.UserHandle p0) { return null; }
    protected boolean postRebuildList(boolean p0) { return false; }
    final boolean postRebuildListInternal(boolean p0) { return false; }
    void onHorizontalSwipeStateChanged(int p0) {}
    protected void onProfileTabSelected() {}
    public void addUseDifferentAppLabelIfNecessary(com.android.internal.app.ResolverListAdapter p0) {}
    protected void resetButtonBar() {}
    public boolean useLayoutWithDefault() { return false; }
    protected void setRetainInOnStop(boolean p0) {}
    public boolean resolveInfoMatch(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return false; }
    protected java.lang.String getMetricsCategory() { return null; }
    public void onHandlePackagesChanged(com.android.internal.app.ResolverListAdapter p0) {}
    static final boolean isSpecificUriMatch(int p0) { return false; }
    protected void maybeLogProfileChange() {}
    protected final android.os.UserHandle getQueryIntentsUser(android.os.UserHandle p0) { return null; }
    public final java.util.List<android.os.UserHandle> getResolverRankerServiceUserHandleList(android.os.UserHandle p0) { return null; }
    protected java.util.List<android.os.UserHandle> getResolverRankerServiceUserHandleListInternal(android.os.UserHandle p0) { return null; }

    private static enum ActionTitle {
        VIEW,
        EDIT,
        SEND,
        SENDTO,
        SEND_MULTIPLE,
        CAPTURE_IMAGE,
        DEFAULT,
        HOME;
        public static final int BROWSABLE_TITLE_RES = 17042139;
        public static final int BROWSABLE_HOST_TITLE_RES = 17042137;
        public static final int BROWSABLE_HOST_APP_TITLE_RES = 17042138;
        public static final int BROWSABLE_APP_TITLE_RES = 17042140;
        public final java.lang.String action = null;
        public final int titleRes = 0;
        public final int namedTitleRes = 0;
        public final int labelRes = 0;
        public static com.android.internal.app.ResolverActivity.ActionTitle forAction(java.lang.String p0) { return null; }
    }

    public static class AppListAccessibilityDelegate extends android.view.View.AccessibilityDelegate {
        public AppListAccessibilityDelegate(com.android.internal.widget.ResolverDrawerLayout p0) { super(); }
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2) { return false; }
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
        public ResolvedComponentInfo(android.content.ComponentName p0, android.content.Intent p1, android.content.pm.ResolveInfo p2) {}
        public void add(android.content.Intent p0, android.content.pm.ResolveInfo p1) {}
        public int getCount() { return 0; }
        public android.content.Intent getIntentAt(int p0) { return null; }
        public android.content.pm.ResolveInfo getResolveInfoAt(int p0) { return null; }
        public int findIntent(android.content.Intent p0) { return 0; }
        public int findResolveInfo(android.content.pm.ResolveInfo p0) { return 0; }
        public boolean isPinned() { return false; }
        public void setPinned(boolean p0) {}
        public boolean isFixedAtTop() { return false; }
        public void setFixedAtTop(boolean p0) {}
    }
}
