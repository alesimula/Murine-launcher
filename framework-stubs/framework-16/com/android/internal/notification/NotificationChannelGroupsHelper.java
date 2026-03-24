package com.android.internal.notification;

public class NotificationChannelGroupsHelper {
    public NotificationChannelGroupsHelper() {}
    @android.annotation.Nullable
    public static android.app.NotificationChannelGroup getGroupWithChannels(java.lang.String p0, java.util.Collection<android.app.NotificationChannel> p1, java.util.Map<java.lang.String, android.app.NotificationChannelGroup> p2, boolean p3) { return null; }
    @android.annotation.NonNull
    public static java.util.List<android.app.NotificationChannelGroup> getGroupsWithChannels(java.util.Collection<android.app.NotificationChannel> p0, java.util.Map<java.lang.String, android.app.NotificationChannelGroup> p1, com.android.internal.notification.NotificationChannelGroupsHelper.Params p2) { return null; }

    public static final record Params(boolean includeDeleted, boolean includeNonGrouped, boolean includeEmpty, boolean includeAllBlockedWithFilter, java.util.Set<java.lang.String> channelFilter) {
        public Params(boolean includeDeleted, boolean includeNonGrouped, boolean includeEmpty, boolean includeAllBlockedWithFilter, java.util.Set<java.lang.String> channelFilter) { this.includeDeleted = includeDeleted; this.includeNonGrouped = includeNonGrouped; this.includeEmpty = includeEmpty; this.includeAllBlockedWithFilter = includeAllBlockedWithFilter; this.channelFilter = channelFilter; }
        public static com.android.internal.notification.NotificationChannelGroupsHelper.Params forAllGroups() { return null; }
        public static com.android.internal.notification.NotificationChannelGroupsHelper.Params forAllChannels(boolean p0) { return null; }
        public static com.android.internal.notification.NotificationChannelGroupsHelper.Params onlySpecifiedOrBlockedChannels(java.util.Set<java.lang.String> p0) { return null; }
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public boolean includeDeleted() { return false; }
        public boolean includeNonGrouped() { return false; }
        public boolean includeEmpty() { return false; }
        public boolean includeAllBlockedWithFilter() { return false; }
        public java.util.Set<java.lang.String> channelFilter() { return null; }
    }
}
