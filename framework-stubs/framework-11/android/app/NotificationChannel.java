package android.app;

public final class NotificationChannel implements android.os.Parcelable {
    public static final java.lang.String DEFAULT_CHANNEL_ID = "miscellaneous";
    public static final java.lang.String CONVERSATION_CHANNEL_ID_FORMAT = "%1$s : %2$s";
    public static final java.lang.String PLACEHOLDER_CONVERSATION_ID = ":placeholder_id";
    private static final int MAX_TEXT_LENGTH = 1000;
    private static final java.lang.String TAG_CHANNEL = "channel";
    private static final java.lang.String ATT_NAME = "name";
    private static final java.lang.String ATT_DESC = "desc";
    private static final java.lang.String ATT_ID = "id";
    private static final java.lang.String ATT_DELETED = "deleted";
    private static final java.lang.String ATT_PRIORITY = "priority";
    private static final java.lang.String ATT_VISIBILITY = "visibility";
    private static final java.lang.String ATT_IMPORTANCE = "importance";
    private static final java.lang.String ATT_LIGHTS = "lights";
    private static final java.lang.String ATT_LIGHT_COLOR = "light_color";
    private static final java.lang.String ATT_VIBRATION = "vibration";
    private static final java.lang.String ATT_VIBRATION_ENABLED = "vibration_enabled";
    private static final java.lang.String ATT_SOUND = "sound";
    private static final java.lang.String ATT_USAGE = "usage";
    private static final java.lang.String ATT_FLAGS = "flags";
    private static final java.lang.String ATT_CONTENT_TYPE = "content_type";
    private static final java.lang.String ATT_SHOW_BADGE = "show_badge";
    private static final java.lang.String ATT_USER_LOCKED = "locked";
    private static final java.lang.String ATT_FG_SERVICE_SHOWN = "fgservice";
    private static final java.lang.String ATT_GROUP = "group";
    private static final java.lang.String ATT_BLOCKABLE_SYSTEM = "blockable_system";
    private static final java.lang.String ATT_ALLOW_BUBBLE = "allow_bubbles";
    private static final java.lang.String ATT_ORIG_IMP = "orig_imp";
    private static final java.lang.String ATT_PARENT_CHANNEL = "parent";
    private static final java.lang.String ATT_CONVERSATION_ID = "conv_id";
    private static final java.lang.String ATT_IMP_CONVERSATION = "imp_conv";
    private static final java.lang.String ATT_DEMOTE = "dem";
    private static final java.lang.String DELIMITER = ",";
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
    private static final int DEFAULT_LIGHT_COLOR = 0;
    private static final int DEFAULT_VISIBILITY = -1000;
    private static final int DEFAULT_IMPORTANCE = -1000;
    private static final boolean DEFAULT_DELETED = false;
    private static final boolean DEFAULT_SHOW_BADGE = true;
    private java.lang.String mId;
    private java.lang.String mName;
    private java.lang.String mDesc;
    private int mImportance;
    private int mOriginalImportance;
    private boolean mBypassDnd;
    private int mLockscreenVisibility;
    private android.net.Uri mSound;
    private boolean mLights;
    private int mLightColor;
    private long[] mVibration;
    private int mUserLockedFields;
    private boolean mFgServiceShown;
    private boolean mVibrationEnabled;
    private boolean mShowBadge;
    private boolean mDeleted;
    private java.lang.String mGroup;
    private android.media.AudioAttributes mAudioAttributes;
    private boolean mBlockableSystem;
    private int mAllowBubbles;
    private boolean mImportanceLockedByOEM;
    private boolean mImportanceLockedDefaultApp;
    private java.lang.String mParentId;
    private java.lang.String mConversationId;
    private boolean mDemoted;
    private boolean mImportantConvo;
    public static final android.os.Parcelable.Creator<android.app.NotificationChannel> CREATOR = null;
    public NotificationChannel(java.lang.String p0, java.lang.CharSequence p1, int p2) {}
    protected NotificationChannel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void lockFields(int p0) {}
    public void unlockFields(int p0) {}
    public void setFgServiceShown(boolean p0) {}
    public void setDeleted(boolean p0) {}
    public void setImportantConversation(boolean p0) {}
    @android.annotation.SystemApi
    public void setBlockable(boolean p0) {}
    public void setName(java.lang.CharSequence p0) {}
    public void setDescription(java.lang.String p0) {}
    private java.lang.String getTrimmedString(java.lang.String p0) { return null; }
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
    @android.annotation.SystemApi
    public int getUserLockedFields() { return 0; }
    public boolean isFgServiceShown() { return false; }
    public boolean isBlockable() { return false; }
    public void setImportanceLockedByOEM(boolean p0) {}
    public void setImportanceLockedByCriticalDeviceFunction(boolean p0) {}
    public boolean isImportanceLockedByOEM() { return false; }
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
    private void populateFromXml(org.xmlpull.v1.XmlPullParser p0, boolean p1, android.content.Context p2) {}
    private android.net.Uri restoreSoundUri(android.content.Context p0, android.net.Uri p1) { return null; }
    @android.annotation.SystemApi
    public void writeXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public void writeXmlForBackup(org.xmlpull.v1.XmlSerializer p0, android.content.Context p1) throws java.io.IOException {}
    private android.net.Uri getSoundForBackup(android.content.Context p0) { return null; }
    private void writeXml(org.xmlpull.v1.XmlSerializer p0, boolean p1, android.content.Context p2) throws java.io.IOException {}
    @android.annotation.SystemApi
    public org.json.JSONObject toJson() throws org.json.JSONException { return null; }
    private static android.media.AudioAttributes safeAudioAttributes(org.xmlpull.v1.XmlPullParser p0) { return null; }
    private static android.net.Uri safeUri(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { return null; }
    private static int safeInt(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, int p2) { return 0; }
    private static int tryParseInt(java.lang.String p0, int p1) { return 0; }
    private static boolean safeBool(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, boolean p2) { return false; }
    private static long[] safeLongArray(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, long[] p2) { return null; }
    private static java.lang.String longArrayToString(long[] p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1, boolean p2) {}
    public java.lang.String toString() { return null; }
    private java.lang.String getFieldsString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
}
