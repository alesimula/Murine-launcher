package com.android.internal.app;

public class ChooserMultiProfilePagerAdapter extends com.android.internal.app.AbstractMultiProfilePagerAdapter {
    private static final int SINGLE_CELL_SPAN_SIZE = 1;
    private final com.android.internal.app.ChooserMultiProfilePagerAdapter.ChooserProfileDescriptor[] mItems = null;
    private final boolean mIsSendAction = false;
    private int mBottomOffset;
    ChooserMultiProfilePagerAdapter(android.content.Context p0, com.android.internal.app.ChooserActivity.ChooserGridAdapter p1, android.os.UserHandle p2, android.os.UserHandle p3, boolean p4) { super(null, 0, null, null); }
    ChooserMultiProfilePagerAdapter(android.content.Context p0, com.android.internal.app.ChooserActivity.ChooserGridAdapter p1, com.android.internal.app.ChooserActivity.ChooserGridAdapter p2, int p3, android.os.UserHandle p4, android.os.UserHandle p5, boolean p6) { super(null, 0, null, null); }
    private com.android.internal.app.ChooserMultiProfilePagerAdapter.ChooserProfileDescriptor createProfileDescriptor(com.android.internal.app.ChooserActivity.ChooserGridAdapter p0) { return null; }
    com.android.internal.widget.RecyclerView getListViewForIndex(int p0) { return null; }
    com.android.internal.app.ChooserMultiProfilePagerAdapter.ChooserProfileDescriptor getItem(int p0) { return null; }
    int getItemCount() { return 0; }
    public com.android.internal.app.ChooserActivity.ChooserGridAdapter getAdapterForIndex(int p0) { return null; }
    com.android.internal.app.ChooserListAdapter getListAdapterForUserHandle(android.os.UserHandle p0) { return null; }
    void setupListAdapter(int p0) {}
    public com.android.internal.app.ChooserListAdapter getActiveListAdapter() { return null; }
    public com.android.internal.app.ChooserListAdapter getInactiveListAdapter() { return null; }
    public com.android.internal.app.ResolverListAdapter getPersonalListAdapter() { return null; }
    public com.android.internal.app.ResolverListAdapter getWorkListAdapter() { return null; }
    com.android.internal.app.ChooserActivity.ChooserGridAdapter getCurrentRootAdapter() { return null; }
    com.android.internal.widget.RecyclerView getActiveAdapterView() { return null; }
    com.android.internal.widget.RecyclerView getInactiveAdapterView() { return null; }
    java.lang.String getMetricsCategory() { return null; }
    protected void showWorkProfileOffEmptyState(com.android.internal.app.ResolverListAdapter p0, android.view.View.OnClickListener p1) {}
    protected void showNoPersonalToWorkIntentsEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showNoWorkToPersonalIntentsEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showNoPersonalAppsAvailableEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    protected void showNoWorkAppsAvailableEmptyState(com.android.internal.app.ResolverListAdapter p0) {}
    void setEmptyStateBottomOffset(int p0) {}
    protected void setupContainerPadding(android.view.View p0) {}

    class ChooserProfileDescriptor extends com.android.internal.app.AbstractMultiProfilePagerAdapter.ProfileDescriptor {
        private com.android.internal.app.ChooserActivity.ChooserGridAdapter chooserGridAdapter;
        private com.android.internal.widget.RecyclerView recyclerView;
        ChooserProfileDescriptor(com.android.internal.app.ChooserMultiProfilePagerAdapter p0, android.view.ViewGroup p1, com.android.internal.app.ChooserActivity.ChooserGridAdapter p2) { super(null, null); }
    }
}
