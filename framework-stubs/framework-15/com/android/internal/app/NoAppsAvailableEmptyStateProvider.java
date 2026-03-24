package com.android.internal.app;

public class NoAppsAvailableEmptyStateProvider implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider {
    public NoAppsAvailableEmptyStateProvider(android.content.Context p0, android.os.UserHandle p1, android.os.UserHandle p2, java.lang.String p3, android.os.UserHandle p4) {}
    @android.annotation.Nullable
    public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState getEmptyState(com.android.internal.app.ResolverListAdapter p0) { return null; }

    public static class DefaultEmptyState implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState {
        public DefaultEmptyState() {}
        public boolean useDefaultEmptyView() { return false; }
    }

    public static class NoAppsAvailableEmptyState implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState {
        public NoAppsAvailableEmptyState(java.lang.String p0, java.lang.String p1, boolean p2) {}
        @android.annotation.Nullable
        public java.lang.String getTitle() { return null; }
        public void onEmptyStateShown() {}
    }
}
