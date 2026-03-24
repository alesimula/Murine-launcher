package android.service.notification;

public class StatusBarNotification implements android.os.Parcelable {
    static final int MAX_LOG_TAG_LENGTH = 36;
    public static final android.os.Parcelable.Creator<android.service.notification.StatusBarNotification> CREATOR = null;
    public StatusBarNotification(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5, android.app.Notification p6, android.os.UserHandle p7, java.lang.String p8, long p9) {}
    @java.lang.Deprecated
    public StatusBarNotification(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5, int p6, android.app.Notification p7, android.os.UserHandle p8, long p9) {}
    public StatusBarNotification(android.os.Parcel p0) {}
    public static int getUidFromKey(java.lang.String p0) { return 0; }
    public static java.lang.String getPkgFromKey(java.lang.String p0) { return null; }
    public boolean isGroup() { return false; }
    public boolean isAppGroup() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public android.service.notification.StatusBarNotification cloneLight() { return null; }
    public android.service.notification.StatusBarNotification clone() { return null; }
    android.service.notification.StatusBarNotification cloneShallow(android.app.Notification p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean isOngoing() { return false; }
    public boolean isClearable() { return false; }
    @java.lang.Deprecated
    public int getUserId() { return 0; }
    public int getNormalizedUserId() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getId() { return 0; }
    public java.lang.String getTag() { return null; }
    public int getUid() { return 0; }
    public java.lang.String getOpPkg() { return null; }
    public int getInitialPid() { return 0; }
    public android.app.Notification getNotification() { return null; }
    public android.os.UserHandle getUser() { return null; }
    public long getPostTime() { return 0L; }
    public java.lang.String getKey() { return null; }
    public java.lang.String getGroupKey() { return null; }
    public java.lang.String getGroup() { return null; }
    public void setOverrideGroupKey(java.lang.String p0) {}
    public java.lang.String getOverrideGroupKey() { return null; }
    public void clearPackageContext() {}
    public com.android.internal.logging.InstanceId getInstanceId() { return null; }
    public void setInstanceId(com.android.internal.logging.InstanceId p0) {}
    public android.content.Context getPackageContext(android.content.Context p0) { return null; }
    public android.metrics.LogMaker getLogMaker() { return null; }
    public java.lang.String getShortcutId() { return null; }
    public java.lang.String getGroupLogTag() { return null; }
    public java.lang.String getChannelIdLogTag() { return null; }
}
