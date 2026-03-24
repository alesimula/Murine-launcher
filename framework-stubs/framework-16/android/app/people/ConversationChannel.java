package android.app.people;

public final class ConversationChannel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.ConversationChannel> CREATOR = null;
    public ConversationChannel(android.content.pm.ShortcutInfo p0, int p1, android.app.NotificationChannel p2, android.app.NotificationChannelGroup p3, long p4, boolean p5) {}
    public ConversationChannel(android.content.pm.ShortcutInfo p0, int p1, android.app.NotificationChannel p2, android.app.NotificationChannelGroup p3, long p4, boolean p5, boolean p6, java.util.List<android.app.people.ConversationStatus> p7) {}
    public ConversationChannel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
    public int getUid() { return 0; }
    public android.app.NotificationChannel getNotificationChannel() { return null; }
    public android.app.NotificationChannelGroup getNotificationChannelGroup() { return null; }
    public long getLastEventTimestamp() { return 0L; }
    public boolean hasActiveNotifications() { return false; }
    public boolean hasBirthdayToday() { return false; }
    @android.annotation.Nullable
    public java.util.List<android.app.people.ConversationStatus> getStatuses() { return null; }
    public java.lang.String toString() { return null; }
}
