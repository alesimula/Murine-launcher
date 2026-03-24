package com.android.internal.app;

public class ResolverMultiProfilePagerAdapter extends com.android.internal.app.AbstractMultiProfilePagerAdapter {
    private final com.android.internal.app.ResolverMultiProfilePagerAdapter.ResolverProfileDescriptor[] mItems = null;
    private final boolean mShouldShowNoCrossProfileIntentsEmptyState = false;
    private boolean mUseLayoutWithDefault;
    ResolverMultiProfilePagerAdapter(android.content.Context p0, com.android.internal.app.ResolverListAdapter p1, android.os.UserHandle p2, android.os.UserHandle p3) { super(null, 0, null, null); }
    ResolverMultiProfilePagerAdapter(android.content.Context p0, com.android.internal.app.ResolverListAdapter p1, com.android.internal.app.ResolverListAdapter p2, int p3, android.os.UserHandle p4, android.os.UserHandle p5, boolean p6) { super(null, 0, null, null); }
    void updateAfterConfigChange() {}
    private com.android.internal.app.ResolverMultiProfilePagerAdapter.ResolverProfileDescriptor createProfileDescriptor(com.android.internal.app.ResolverListAdapter p0) { return null; }
    android.widget.ListView getListViewForIndex(int p0) { return null; }
    com.android.internal.app.ResolverMultiProfilePagerAdapter.ResolverProfileDescriptor getItem(int p0) { return null; }
    int getItemCount() { return 0; }
    void setupListAdapter(int p0) {}
    public com.android.internal.app.ResolverListAdapter getAdapterForIndex(int p0) { return null; }
    public android.view.ViewGroup instantiateItem(android.view.ViewGroup p0, int p1) { return null; }
    com.android.internal.app.ResolverListAdapter getListAdapterForUserHandle(android.os.UserHandle p0) { return null; }
    public com.android.internal.app.ResolverListAdapter getActiveListAdapter() { return null; }
    public com.android.internal.app.ResolverListAdapter getInactiveListAdapter() { return null; }
    public com.android.internal.app.ResolverListAdapter getPersonalListAdapter() { return null; }
    public com.android.internal.app.ResolverListAdapter getWorkListAdapter() { return null; }
    com.android.internal.app.ResolverListAdapter getCurrentRootAdapter() { return null; }
    android.widget.ListView getActiveAdapterView() { return null; }
    android.view.ViewGroup getInactiveAdapterView() { return null; }
    java.lang.String getMetricsCategory() { return null; }
    boolean allowShowNoCrossProfileIntentsEmptyState() { return false; }
    protected void showWorkProfileOffEmptyState(com.android.internal.app.ResolverListAdapter p0, android.view.View.OnClickListener p1) {}
    protected void showNoPersonalToWorkIntentsEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showNoWorkToPersonalIntentsEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showNoPersonalAppsAvailableEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showNoWorkAppsAvailableEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    void setUseLayoutWithDefault(boolean p0) {}
    protected void setupContainerPadding(android.view.View p0) {}

    class ResolverProfileDescriptor extends com.android.internal.app.AbstractMultiProfilePagerAdapter.ProfileDescriptor {
        private com.android.internal.app.ResolverListAdapter resolverListAdapter;
        final android.widget.ListView listView = null;
        ResolverProfileDescriptor(com.android.internal.app.ResolverMultiProfilePagerAdapter p0, android.view.ViewGroup p1, com.android.internal.app.ResolverListAdapter p2) { super(null, null); }
    }
}
