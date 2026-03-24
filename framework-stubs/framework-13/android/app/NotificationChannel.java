package android.app;

public final class NotificationChannel implements android.os.Parcelable {
    public static final java.lang.String DEFAULT_CHANNEL_ID = "miscellaneous";
    public static final java.lang.String CONVERSATION_CHANNEL_ID_FORMAT = "%1$s : %2$s";
    public static final java.lang.String PLACEHOLDER_CONVERSATION_ID = ":placeholder_id";
    public static final java.lang.String EDIT_SOUND = "sound";
    public static final java.lang.String EDIT_VIBRATION = "vibration";
    public static final java.lang.String EDIT_IMPORTANCE = "importance";
    public static final java.lang.String EDIT_LOCKED_DEVICE = "locked";
    public static final java.lang.String EDIT_ZEN = "zen";
    public static final java.lang.String EDIT_CONVERSATION = "conversation";
    public static final java.lang.String EDIT_LAUNCHER = "launcher";
    public static final int MAX_TEXT_LENGTH = 1000;
    public static final int MAX_VIBRATION_LENGTH = 1000;
    public static final int USER_LOCKED_PRIORITY = 1;
    public static final int USER_LOCKED_VISIBILITY = 2;
    public static final int USER_LOCKED_IMPORTANCE = 4;
    public static final int USER_LOCKED_LIGHTS = 8;
    public static final int USER_LOCKED_VIBRATION = 16;
    @android.annotation.SystemApi
    public static final int USER_LOCKED_SOUND = 32;
    public static final int USER_LOCKED_SHOW_BADGE = 128;
    public static final int USER_LOCKED_ALLOW_BUBBLE = 256;
    public static final int[] LOCKABLE_FIELDS = null;
    public static final int DEFAULT_ALLOW_BUBBLE = -1;
    public static final int ALLOW_BUBBLE_ON = 1;
    public static final int ALLOW_BUBBLE_OFF = 0;
    public static final android.os.Parcelable.Creator<android.app.NotificationChannel> CREATOR = null;
    public NotificationChannel(java.lang.String p0, java.lang.CharSequence p1, int p2) {}
    protected NotificationChannel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void lockFields(int p0) {}
    public void unlockFields(int p0) {}
    public void setFgServiceShown(boolean p0) {}
    public void setDeleted(boolean p0) {}
    public void setDeletedTimeMs(long p0) {}
    public void setImportantConversation(boolean p0) {}
    public void setBlockable(boolean p0) {}
    public void setName(java.lang.CharSequence p0) {}
    public void setDescription(java.lang.String p0) {}
    public void setId(java.lang.String p0) {}
    public void setGroup(java.lang.String p0) {}
    public void setShowBadge(boolean p0) {}
    public void setSound(android.net.Uri p0, android.media.AudioAttributes p1) {}
    public void enableLights(boolean p0) {}
    public void setLightColor(int p0) {}
    public void enableVibration(boolean p0) {}
    public void setVibrationPattern(long[] p0) {}
    public void setImportance(int p0) {}
    public void setBypassDnd(boolean p0) {}
    public void setLockscreenVisibility(int p0) {}
    public void setAllowBubbles(boolean p0) {}
    public void setAllowBubbles(int p0) {}
    public void setConversationId(java.lang.String p0, java.lang.String p1) {}
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public java.lang.String getDescription() { return null; }
    public int getImportance() { return 0; }
    public boolean canBypassDnd() { return false; }
    public boolean isConversation() { return false; }
    public boolean isImportantConversation() { return false; }
    public android.net.Uri getSound() { return null; }
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public boolean shouldShowLights() { return false; }
    public int getLightColor() { return 0; }
    public boolean shouldVibrate() { return false; }
    public long[] getVibrationPattern() { return null; }
    public int getLockscreenVisibility() { return 0; }
    public boolean canShowBadge() { return false; }
    public java.lang.String getGroup() { return null; }
    public boolean canBubble() { return false; }
    public int getAllowBubbles() { return 0; }
    public java.lang.String getParentChannelId() { return null; }
    public java.lang.String getConversationId() { return null; }
    @android.annotation.SystemApi
    public boolean isDeleted() { return false; }
    public long getDeletedTimeMs() { return 0L; }
    @android.annotation.SystemApi
    public int getUserLockedFields() { return 0; }
    public boolean isFgServiceShown() { return false; }
    public boolean isBlockable() { return false; }
    public void setImportanceLockedByCriticalDeviceFunction(boolean p0) {}
    public boolean isImportanceLockedByCriticalDeviceFunction() { return false; }
    public int getOriginalImportance() { return 0; }
    public void setOriginalImportance(int p0) {}
    public void setDemoted(boolean p0) {}
    public boolean isDemoted() { return false; }
    public boolean hasUserSetImportance() { return false; }
    public boolean hasUserSetSound() { return false; }
    public void populateFromXmlForRestore(org.xmlpull.v1.XmlPullParser p0, android.content.Context p1) {}
    @android.annotation.SystemApi
    public void populateFromXml(org.xmlpull.v1.XmlPullParser p0) {}
    @android.annotation.SystemApi
    public void writeXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public void writeXmlForBackup(org.xmlpull.v1.XmlSerializer p0, android.content.Context p1) throws java.io.IOException {}
    @android.annotation.SystemApi
    public org.json.JSONObject toJson() throws org.json.JSONException { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1, boolean p2) {}
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
}
