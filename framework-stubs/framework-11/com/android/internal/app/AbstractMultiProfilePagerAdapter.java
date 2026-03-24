package com.android.internal.app;

public abstract class AbstractMultiProfilePagerAdapter extends com.android.internal.widget.PagerAdapter {
    private static final java.lang.String TAG = "AbstractMultiProfilePagerAdapter";
    static final int PROFILE_PERSONAL = 0;
    static final int PROFILE_WORK = 1;
    private final android.content.Context mContext = null;
    private int mCurrentPage;
    private com.android.internal.app.AbstractMultiProfilePagerAdapter.OnProfileSelectedListener mOnProfileSelectedListener;
    private com.android.internal.app.AbstractMultiProfilePagerAdapter.OnSwitchOnWorkSelectedListener mOnSwitchOnWorkSelectedListener;
    private java.util.Set<java.lang.Integer> mLoadedPages;
    private final android.os.UserHandle mPersonalProfileUserHandle = null;
    private final android.os.UserHandle mWorkProfileUserHandle = null;
    private com.android.internal.app.AbstractMultiProfilePagerAdapter.Injector mInjector;
    private boolean mIsWaitingToEnableWorkProfile;
    AbstractMultiProfilePagerAdapter(android.content.Context p0, int p1, android.os.UserHandle p2, android.os.UserHandle p3) { super(); }
    protected void markWorkProfileEnabledBroadcastReceived() {}
    protected boolean isWaitingToEnableWorkProfile() { return false; }
    public void setInjector(com.android.internal.app.AbstractMultiProfilePagerAdapter.Injector p0) {}
    protected boolean isQuietModeEnabled(android.os.UserHandle p0) { return false; }
    void setOnProfileSelectedListener(com.android.internal.app.AbstractMultiProfilePagerAdapter.OnProfileSelectedListener p0) {}
    void setOnSwitchOnWorkSelectedListener(com.android.internal.app.AbstractMultiProfilePagerAdapter.OnSwitchOnWorkSelectedListener p0) {}
    android.content.Context getContext() { return null; }
    void setupViewPager(com.android.internal.widget.ViewPager p0) {}
    void clearInactiveProfileCache() {}
    public android.view.ViewGroup instantiateItem(android.view.ViewGroup p0, int p1) { return null; }
    public void destroyItem(android.view.ViewGroup p0, int p1, java.lang.Object p2) {}
    public int getCount() { return 0; }
    protected int getCurrentPage() { return 0; }
    public android.os.UserHandle getCurrentUserHandle() { return null; }
    public boolean isViewFromObject(android.view.View p0, java.lang.Object p1) { return false; }
    public java.lang.CharSequence getPageTitle(int p0) { return null; }
    abstract com.android.internal.app.AbstractMultiProfilePagerAdapter.ProfileDescriptor getItem(int p0);
    abstract int getItemCount();
    abstract void setupListAdapter(int p0);
    public abstract java.lang.Object getAdapterForIndex(int p0);
    abstract com.android.internal.app.ResolverListAdapter getListAdapterForUserHandle(android.os.UserHandle p0);
    public abstract com.android.internal.app.ResolverListAdapter getActiveListAdapter();
    public abstract com.android.internal.app.ResolverListAdapter getInactiveListAdapter();
    public abstract com.android.internal.app.ResolverListAdapter getPersonalListAdapter();
    public abstract com.android.internal.app.ResolverListAdapter getWorkListAdapter();
    abstract java.lang.Object getCurrentRootAdapter();
    abstract android.view.ViewGroup getActiveAdapterView();
    abstract android.view.ViewGroup getInactiveAdapterView();
    abstract java.lang.String getMetricsCategory();
    boolean rebuildActiveTab(boolean p0) { return false; }
    boolean rebuildInactiveTab(boolean p0) { return false; }
    private int userHandleToPageIndex(android.os.UserHandle p0) { return 0; }
    private boolean rebuildTab(com.android.internal.app.ResolverListAdapter p0, boolean p1) { return false; }
    private boolean shouldShowNoCrossProfileIntentsEmptyState(com.android.internal.app.ResolverListAdapter p0) { return false; }
    boolean allowShowNoCrossProfileIntentsEmptyState() { return false; }
    protected abstract void showWorkProfileOffEmptyState(com.android.internal.app.ResolverListAdapter p0, android.view.View.OnClickListener p1);
    protected abstract void showNoPersonalToWorkIntentsEmptyState(com.android.internal.app.ResolverListAdapter p0);
    protected abstract void showNoPersonalAppsAvailableEmptyState(com.android.internal.app.ResolverListAdapter p0);
    protected abstract void showNoWorkAppsAvailableEmptyState(com.android.internal.app.ResolverListAdapter p0);
    protected abstract void showNoWorkToPersonalIntentsEmptyState(com.android.internal.app.ResolverListAdapter p0);
    void updateAfterConfigChange() {}
    private void updateIconVisibility(android.widget.ImageView p0, android.view.ViewGroup p1) {}
    void showEmptyResolverListEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    private boolean maybeShowNoCrossProfileIntentsEmptyState(com.android.internal.app.ResolverListAdapter p0) { return false; }
    private boolean maybeShowWorkProfileOffEmptyState(com.android.internal.app.ResolverListAdapter p0) { return false; }
    private void maybeShowNoAppsAvailableEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showEmptyState(com.android.internal.app.ResolverListAdapter p0, int p1, int p2, int p3) {}
    protected void showEmptyState(com.android.internal.app.ResolverListAdapter p0, int p1, int p2, int p3, android.view.View.OnClickListener p4) {}
    protected void setupContainerPadding(android.view.View p0) {}
    private void showConsumerUserNoAppsAvailableEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    private boolean isSpinnerShowing(android.view.View p0) { return false; }
    private void showSpinner(android.view.View p0) {}
    private void resetViewVisibilitiesForWorkProfileEmptyState(android.view.View p0) {}
    private void resetViewVisibilitiesForConsumerUserEmptyState(android.view.View p0) {}
    protected void showListView(com.android.internal.app.ResolverListAdapter p0) {}
    private boolean hasCrossProfileIntents(java.util.List<android.content.Intent> p0, int p1, int p2) { return false; }
    private boolean hasAppsInOtherProfile(com.android.internal.app.ResolverListAdapter p0) { return false; }
    boolean shouldShowEmptyStateScreen(com.android.internal.app.ResolverListAdapter p0) { return false; }

    public static interface Injector {
        public boolean hasCrossProfileIntents(java.util.List<android.content.Intent> p0, int p1, int p2);
        public boolean isQuietModeEnabled(android.os.UserHandle p0);
        public void requestQuietModeEnabled(boolean p0, android.os.UserHandle p1);
    }

    public static interface OnProfileSelectedListener {
        public void onProfileSelected(int p0);
        public void onProfilePageStateChanged(int p0);
    }

    static interface OnSwitchOnWorkSelectedListener {
        public void onSwitchOnWorkSelected();
    }

    static @interface Profile {
    }

    protected class ProfileDescriptor {
        final android.view.ViewGroup rootView = null;
        private final android.view.ViewGroup mEmptyStateView = null;
        ProfileDescriptor(com.android.internal.app.AbstractMultiProfilePagerAdapter p0, android.view.ViewGroup p1) {}
        protected android.view.ViewGroup getEmptyStateView() { return null; }
    }
}
