package com.android.internal.app;

public class WorkProfilePausedEmptyStateProvider implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyStateProvider {
    public WorkProfilePausedEmptyStateProvider(android.content.Context p0, android.os.UserHandle p1, com.android.internal.app.AbstractMultiProfilePagerAdapter.QuietModeManager p2, com.android.internal.app.AbstractMultiProfilePagerAdapter.OnSwitchOnWorkSelectedListener p3, java.lang.String p4) {}
    @android.annotation.Nullable
    public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState getEmptyState(com.android.internal.app.ResolverListAdapter p0) { return null; }

    public static class WorkProfileOffEmptyState implements com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState {
        public WorkProfileOffEmptyState(java.lang.String p0, com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState.ClickListener p1, java.lang.String p2) {}
        @android.annotation.Nullable
        public java.lang.String getTitle() { return null; }
        @android.annotation.Nullable
        public com.android.internal.app.AbstractMultiProfilePagerAdapter.EmptyState.ClickListener getButtonClickListener() { return null; }
        public void onEmptyStateShown() {}
    }
}
