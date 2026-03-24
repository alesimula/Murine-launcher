package android.app.usage;

public final class UsageEvents implements android.os.Parcelable {
    public static final java.lang.String INSTANT_APP_PACKAGE_NAME = "android.instant_app";
    public static final java.lang.String INSTANT_APP_CLASS_NAME = "android.instant_class";
    public static final java.lang.String OBFUSCATED_NOTIFICATION_CHANNEL_ID = "unknown_channel_id";
    public static final int SHOW_ALL_EVENT_DATA = 0;
    public static final int OBFUSCATE_INSTANT_APPS = 1;
    public static final int HIDE_SHORTCUT_EVENTS = 2;
    public static final int OBFUSCATE_NOTIFICATION_EVENTS = 4;
    public static final int HIDE_LOCUS_EVENTS = 8;
    public static final android.os.Parcelable.Creator<android.app.usage.UsageEvents> CREATOR = null;
    public UsageEvents(android.os.Parcel p0) {}
    UsageEvents() {}
    public UsageEvents(java.util.List<android.app.usage.UsageEvents.Event> p0, java.lang.String[] p1) {}
    public UsageEvents(java.util.List<android.app.usage.UsageEvents.Event> p0, java.lang.String[] p1, boolean p2) {}
    public boolean hasNextEvent() { return false; }
    public boolean getNextEvent(android.app.usage.UsageEvents.Event p0) { return false; }
    public void resetToStart() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Event {
        public static final int NONE = 0;
        public static final java.lang.String DEVICE_EVENT_PACKAGE_NAME = "android";
        @java.lang.Deprecated
        public static final int MOVE_TO_FOREGROUND = 1;
        public static final int ACTIVITY_RESUMED = 1;
        @java.lang.Deprecated
        public static final int MOVE_TO_BACKGROUND = 2;
        public static final int ACTIVITY_PAUSED = 2;
        public static final int END_OF_DAY = 3;
        public static final int CONTINUE_PREVIOUS_DAY = 4;
        public static final int CONFIGURATION_CHANGE = 5;
        @android.annotation.SystemApi
        public static final int SYSTEM_INTERACTION = 6;
        public static final int USER_INTERACTION = 7;
        public static final int SHORTCUT_INVOCATION = 8;
        public static final int CHOOSER_ACTION = 9;
        @android.annotation.SystemApi
        public static final int NOTIFICATION_SEEN = 10;
        public static final int STANDBY_BUCKET_CHANGED = 11;
        @android.annotation.SystemApi
        public static final int NOTIFICATION_INTERRUPTION = 12;
        @android.annotation.SystemApi
        public static final int SLICE_PINNED_PRIV = 13;
        @android.annotation.SystemApi
        public static final int SLICE_PINNED = 14;
        public static final int SCREEN_INTERACTIVE = 15;
        public static final int SCREEN_NON_INTERACTIVE = 16;
        public static final int KEYGUARD_SHOWN = 17;
        public static final int KEYGUARD_HIDDEN = 18;
        public static final int FOREGROUND_SERVICE_START = 19;
        public static final int FOREGROUND_SERVICE_STOP = 20;
        public static final int CONTINUING_FOREGROUND_SERVICE = 21;
        public static final int ROLLOVER_FOREGROUND_SERVICE = 22;
        public static final int ACTIVITY_STOPPED = 23;
        public static final int ACTIVITY_DESTROYED = 24;
        public static final int FLUSH_TO_DISK = 25;
        public static final int DEVICE_SHUTDOWN = 26;
        public static final int DEVICE_STARTUP = 27;
        public static final int USER_UNLOCKED = 28;
        public static final int USER_STOPPED = 29;
        public static final int LOCUS_ID_SET = 30;
        public static final int APP_COMPONENT_USED = 31;
        public static final int MAX_EVENT_TYPE = 31;
        public static final int FLAG_IS_PACKAGE_INSTANT_APP = 1;
        public static final int VALID_FLAG_BITS = 1;
        public java.lang.String mPackage;
        public int mPackageToken;
        public java.lang.String mClass;
        public int mClassToken;
        public int mInstanceId;
        public java.lang.String mTaskRootPackage;
        public int mTaskRootPackageToken;
        public java.lang.String mTaskRootClass;
        public int mTaskRootClassToken;
        public long mTimeStamp;
        public int mEventType;
        public android.content.res.Configuration mConfiguration;
        public java.lang.String mShortcutId;
        public int mShortcutIdToken;
        public java.lang.String mAction;
        public java.lang.String mContentType;
        public java.lang.String[] mContentAnnotations;
        public int mBucketAndReason;
        public java.lang.String mNotificationChannelId;
        public int mNotificationChannelIdToken;
        public java.lang.String mLocusId;
        public int mLocusIdToken;
        public int mFlags;
        public Event() {}
        public Event(int p0, long p1) {}
        public Event(android.app.usage.UsageEvents.Event p0) {}
        public java.lang.String getPackageName() { return null; }
        @android.annotation.SystemApi
        public boolean isInstantApp() { return false; }
        public java.lang.String getClassName() { return null; }
        @android.annotation.SystemApi
        public int getInstanceId() { return 0; }
        @android.annotation.SystemApi
        public java.lang.String getTaskRootPackageName() { return null; }
        @android.annotation.SystemApi
        public java.lang.String getTaskRootClassName() { return null; }
        public long getTimeStamp() { return 0L; }
        public int getEventType() { return 0; }
        public android.content.res.Configuration getConfiguration() { return null; }
        public java.lang.String getShortcutId() { return null; }
        public int getAppStandbyBucket() { return 0; }
        public int getStandbyReason() { return 0; }
        @android.annotation.SystemApi
        public java.lang.String getNotificationChannelId() { return null; }
        public android.app.usage.UsageEvents.Event getObfuscatedIfInstantApp() { return null; }
        public android.app.usage.UsageEvents.Event getObfuscatedNotificationEvent() { return null; }
        public java.lang.String getLocusId() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface EventFlags {
        }
    }
}
