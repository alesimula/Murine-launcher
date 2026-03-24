package com.android.internal.app;

public class NoCrossProfileEmptyStateProvider implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider {
    public NoCrossProfileEmptyStateProvider(android.os.UserHandle p0, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState p1, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState p2, com.android.internal.app.AbstractMultiProfilePagerAdapter.CrossProfileIntentsChecker p3, android.os.UserHandle p4) {}
    public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState getEmptyState(com.android.internal.app.ResolverListAdapter p0) { return null; }

    public static class DevicePolicyBlockerEmptyState implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState {
        public DevicePolicyBlockerEmptyState(android.content.Context p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5, java.lang.String p6) {}
        public java.lang.String getTitle() { return null; }
        public java.lang.String getSubtitle() { return null; }
        public void onEmptyStateShown() {}
        public boolean shouldSkipDataRebuild() { return false; }
    }
}
