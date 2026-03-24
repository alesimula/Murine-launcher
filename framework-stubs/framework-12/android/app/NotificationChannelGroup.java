package android.app;

public final class NotificationChannelGroup implements android.os.Parcelable {
    private static final int MAX_TEXT_LENGTH = 1000;
    private static final java.lang.String TAG_GROUP = "channelGroup";
    private static final java.lang.String ATT_NAME = "name";
    private static final java.lang.String ATT_DESC = "desc";
    private static final java.lang.String ATT_ID = "id";
    private static final java.lang.String ATT_BLOCKED = "blocked";
    private static final java.lang.String ATT_USER_LOCKED = "locked";
    public static final int USER_LOCKED_BLOCKED_STATE = 1;
    private final java.lang.String mId = null;
    private java.lang.CharSequence mName;
    private java.lang.String mDescription;
    private boolean mBlocked;
    private java.util.List<android.app.NotificationChannel> mChannels;
    private int mUserLockedFields;
    public static final android.os.Parcelable.Creator<android.app.NotificationChannelGroup> CREATOR = null;
    public NotificationChannelGroup(java.lang.String p0, java.lang.CharSequence p1) {}
    protected NotificationChannelGroup(android.os.Parcel p0) {}
    private java.lang.String getTrimmedString(java.lang.String p0) { return null; }
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
    public void populateFromXml(android.util.TypedXmlPullParser p0) {}
    public void writeXml(android.util.TypedXmlSerializer p0) throws java.io.IOException {}
    @android.annotation.SystemApi
    public org.json.JSONObject toJson() throws org.json.JSONException { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public android.app.NotificationChannelGroup clone() { return null; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
}
