package com.android.internal.app;

public abstract class AbstractMultiProfilePagerAdapter extends com.android.internal.widget.PagerAdapter {
    static final int PROFILE_PERSONAL = 0;
    static final int PROFILE_WORK = 1;
    AbstractMultiProfilePagerAdapter(android.content.Context p0, int p1, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider p2, com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager p3, android.os.UserHandle p4, android.os.UserHandle p5) { super(); }
    void setOnProfileSelectedListener(com.android.internal.app.AbstractMultiProfilePagerAdapter.OnProfileSelectedListener p0) {}
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
    public android.os.UserHandle getCloneUserHandle() { return null; }
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
    boolean rebuildActiveTab(boolean p0) { return false; }
    boolean rebuildInactiveTab(boolean p0) { return false; }
    void showEmptyResolverListEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showEmptyState(com.android.internal.app.ResolverListAdapter p0, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState p1, android.view.View.OnClickListener p2) {}
    protected void setupContainerPadding(android.view.View p0) {}
    protected void showListView(com.android.internal.app.ResolverListAdapter p0) {}
    boolean shouldShowEmptyStateScreen(com.android.internal.app.ResolverListAdapter p0) { return false; }

    public static class CompositeEmptyStateProvider implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider {
        public CompositeEmptyStateProvider(com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider... p0) {}
        public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState getEmptyState(com.android.internal.app.ResolverListAdapter p0) { return null; }
    }

    public static class CrossProfileIntentsChecker {
        public CrossProfileIntentsChecker(android.content.ContentResolver p0) {}
        public boolean hasCrossProfileIntents(java.util.List<android.content.Intent> p0, int p1, int p2) { return false; }
    }

    public static interface EmptyState {
        default public java.lang.String getTitle() { return null; }
        default public java.lang.String getSubtitle() { return null; }
        default public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState.ClickListener getButtonClickListener() { return null; }
        default public boolean useDefaultEmptyView() { return false; }
        default public boolean shouldSkipDataRebuild() { return false; }
        default public void onEmptyStateShown() {}

        public static interface ClickListener {
            public void onClick(com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState.TabControl p0);
        }

        public static interface TabControl {
            public void showSpinner();
        }
    }

    public static interface EmptyStateProvider {
        default public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState getEmptyState(com.android.internal.app.ResolverListAdapter p0) { return null; }
    }

    public static class MyUserIdProvider {
        public MyUserIdProvider() {}
        public int getMyUserId() { return 0; }
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
        ProfileDescriptor(com.android.internal.app.AbstractMultiProfilePagerAdapter p0, android.view.ViewGroup p1) {}
        protected android.view.ViewGroup getEmptyStateView() { return null; }
    }

    public static interface QuietModeManager {
        public boolean isQuietModeEnabled(android.os.UserHandle p0);
        public void requestQuietModeEnabled(boolean p0, android.os.UserHandle p1);
        public void markWorkProfileEnabledBroadcastReceived();
        public boolean isWaitingToEnableWorkProfile();
    }
}
