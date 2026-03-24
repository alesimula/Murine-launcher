package com.android.internal.app;

public class ChooserMultiProfilePagerAdapter extends com.android.internal.app.AbstractMultiProfilePagerAdapter {
    ChooserMultiProfilePagerAdapter(android.content.Context p0, com.android.internal.app.ChooserActivity.ChooserGridAdapter p1, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider p2, com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager p3, android.os.UserHandle p4, android.os.UserHandle p5, int p6) { super(null, 0, null, null, null, null); }
    ChooserMultiProfilePagerAdapter(android.content.Context p0, com.android.internal.app.ChooserActivity.ChooserGridAdapter p1, com.android.internal.app.ChooserActivity.ChooserGridAdapter p2, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider p3, com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager p4, int p5, android.os.UserHandle p6, android.os.UserHandle p7, int p8) { super(null, 0, null, null, null, null); }
    public void setMaxTargetsPerRow(int p0) {}
    com.android.internal.widget.RecyclerView getListViewForIndex(int p0) { return null; }
    public com.android.internal.app.ChooserMultiProfilePagerAdapter.ChooserProfileDescriptor getItem(int p0) { return null; }
    int getItemCount() { return 0; }
    public com.android.internal.app.ChooserActivity.ChooserGridAdapter getAdapterForIndex(int p0) { return null; }
    @android.annotation.Nullable
    com.android.internal.app.ChooserListAdapter getListAdapterForUserHandle(android.os.UserHandle p0) { return null; }
    void setupListAdapter(int p0) {}
    public com.android.internal.app.ChooserListAdapter getActiveListAdapter() { return null; }
    public com.android.internal.app.ChooserListAdapter getInactiveListAdapter() { return null; }
    public com.android.internal.app.ChooserListAdapter getPersonalListAdapter() { return null; }
    @android.annotation.Nullable
    public com.android.internal.app.ChooserListAdapter getWorkListAdapter() { return null; }
    com.android.internal.app.ChooserActivity.ChooserGridAdapter getCurrentRootAdapter() { return null; }
    com.android.internal.widget.RecyclerView getActiveAdapterView() { return null; }
    @android.annotation.Nullable
    com.android.internal.widget.RecyclerView getInactiveAdapterView() { return null; }
    void setEmptyStateBottomOffset(int p0) {}
    protected void setupContainerPadding(android.view.View p0) {}

    class ChooserProfileDescriptor extends com.android.internal.app.AbstractMultiProfilePagerAdapter.ProfileDescriptor {
        ChooserProfileDescriptor(com.android.internal.app.ChooserMultiProfilePagerAdapter p0, android.view.ViewGroup p1, com.android.internal.app.ChooserActivity.ChooserGridAdapter p2) { super(null); }
    }
}
