package com.android.internal.app;

public class ResolverMultiProfilePagerAdapter extends com.android.internal.app.AbstractMultiProfilePagerAdapter {
    ResolverMultiProfilePagerAdapter(android.content.Context p0, com.android.internal.app.ResolverListAdapter p1, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider p2, com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager p3, android.os.UserHandle p4, android.os.UserHandle p5) { super(null, 0, null, null, null, null); }
    ResolverMultiProfilePagerAdapter(android.content.Context p0, com.android.internal.app.ResolverListAdapter p1, com.android.internal.app.ResolverListAdapter p2, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider p3, com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager p4, int p5, android.os.UserHandle p6, android.os.UserHandle p7) { super(null, 0, null, null, null, null); }
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
    void setUseLayoutWithDefault(boolean p0) {}
    protected void setupContainerPadding(android.view.View p0) {}

    class ResolverProfileDescriptor extends com.android.internal.app.AbstractMultiProfilePagerAdapter.ProfileDescriptor {
        final android.widget.ListView listView = null;
        ResolverProfileDescriptor(com.android.internal.app.ResolverMultiProfilePagerAdapter p0, android.view.ViewGroup p1, com.android.internal.app.ResolverListAdapter p2) { super(null, null); }
    }
}
