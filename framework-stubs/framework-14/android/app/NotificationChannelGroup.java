package android.app;

public final class NotificationChannelGroup implements android.os.Parcelable {
    public static final int MAX_TEXT_LENGTH = 1000;
    public static final int USER_LOCKED_BLOCKED_STATE = 1;
    public static final android.os.Parcelable.Creator<android.app.NotificationChannelGroup> CREATOR = null;
    public NotificationChannelGroup(java.lang.String p0, java.lang.CharSequence p1) {}
    protected NotificationChannelGroup(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public java.lang.String getDescription() { return null; }
    public java.util.List<android.app.NotificationChannel> getChannels() { return null; }
    public boolean isBlocked() { return false; }
    public void setDescription(java.lang.String p0) {}
    public void setBlocked(boolean p0) {}
    public void addChannel(android.app.NotificationChannel p0) {}
    public void setChannels(java.util.List<android.app.NotificationChannel> p0) {}
    public void lockFields(int p0) {}
    public void unlockFields(int p0) {}
    public int getUserLockedFields() { return 0; }
    public void populateFromXml(com.android.modules.utils.TypedXmlPullParser p0) {}
    public void writeXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    @android.annotation.SystemApi
    public org.json.JSONObject toJson() throws org.json.JSONException { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public android.app.NotificationChannelGroup clone() { return null; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
}
