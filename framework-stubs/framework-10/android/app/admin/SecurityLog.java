package android.app.admin;

public class SecurityLog {
    private static final java.lang.String PROPERTY_LOGGING_ENABLED = "persist.logd.security";
    public static final int TAG_ADB_SHELL_INTERACTIVE = 210001;
    public static final int TAG_ADB_SHELL_CMD = 210002;
    public static final int TAG_SYNC_RECV_FILE = 210003;
    public static final int TAG_SYNC_SEND_FILE = 210004;
    public static final int TAG_APP_PROCESS_START = 210005;
    public static final int TAG_KEYGUARD_DISMISSED = 210006;
    public static final int TAG_KEYGUARD_DISMISS_AUTH_ATTEMPT = 210007;
    public static final int TAG_KEYGUARD_SECURED = 210008;
    public static final int TAG_OS_STARTUP = 210009;
    public static final int TAG_OS_SHUTDOWN = 210010;
    public static final int TAG_LOGGING_STARTED = 210011;
    public static final int TAG_LOGGING_STOPPED = 210012;
    public static final int TAG_MEDIA_MOUNT = 210013;
    public static final int TAG_MEDIA_UNMOUNT = 210014;
    public static final int TAG_LOG_BUFFER_SIZE_CRITICAL = 210015;
    public static final int TAG_PASSWORD_EXPIRATION_SET = 210016;
    public static final int TAG_PASSWORD_COMPLEXITY_SET = 210017;
    public static final int TAG_PASSWORD_HISTORY_LENGTH_SET = 210018;
    public static final int TAG_MAX_SCREEN_LOCK_TIMEOUT_SET = 210019;
    public static final int TAG_MAX_PASSWORD_ATTEMPTS_SET = 210020;
    public static final int TAG_KEYGUARD_DISABLED_FEATURES_SET = 210021;
    public static final int TAG_REMOTE_LOCK = 210022;
    public static final int TAG_WIPE_FAILURE = 210023;
    public static final int TAG_KEY_GENERATED = 210024;
    public static final int TAG_KEY_IMPORT = 210025;
    public static final int TAG_KEY_DESTRUCTION = 210026;
    public static final int TAG_CERT_AUTHORITY_INSTALLED = 210029;
    public static final int TAG_CERT_AUTHORITY_REMOVED = 210030;
    public static final int TAG_USER_RESTRICTION_ADDED = 210027;
    public static final int TAG_USER_RESTRICTION_REMOVED = 210028;
    public static final int TAG_CRYPTO_SELF_TEST_COMPLETED = 210031;
    public static final int TAG_KEY_INTEGRITY_VIOLATION = 210032;
    public static final int TAG_CERT_VALIDATION_FAILURE = 210033;
    public static final int LEVEL_INFO = 1;
    public static final int LEVEL_WARNING = 2;
    public static final int LEVEL_ERROR = 3;
    public SecurityLog() {}
    public static native boolean isLoggingEnabled();
    public static void setLoggingEnabledProperty(boolean p0) {}
    public static boolean getLoggingEnabledProperty() { return false; }
    public static native void readEvents(java.util.Collection<android.app.admin.SecurityLog.SecurityEvent> p0) throws java.io.IOException;
    public static native void readEventsSince(long p0, java.util.Collection<android.app.admin.SecurityLog.SecurityEvent> p1) throws java.io.IOException;
    public static native void readPreviousEvents(java.util.Collection<android.app.admin.SecurityLog.SecurityEvent> p0) throws java.io.IOException;
    public static native void readEventsOnWrapping(long p0, java.util.Collection<android.app.admin.SecurityLog.SecurityEvent> p1) throws java.io.IOException;
    public static native int writeEvent(int p0, java.lang.String p1);
    public static native int writeEvent(int p0, java.lang.Object... p1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityLogTag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityLogLevel {
    }

    public static final class SecurityEvent implements android.os.Parcelable {
        private android.util.EventLog.Event mEvent;
        private long mId;
        public static final android.os.Parcelable.Creator<android.app.admin.SecurityLog.SecurityEvent> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        SecurityEvent(byte[] p0) {}
        SecurityEvent(android.os.Parcel p0) {}
        public SecurityEvent(long p0, byte[] p1) {}
        public long getTimeNanos() { return 0L; }
        public int getTag() { return 0; }
        public java.lang.Object getData() { return null; }
        public void setId(long p0) {}
        public long getId() { return 0L; }
        public int getLogLevel() { return 0; }
        private boolean getSuccess() { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public boolean eventEquals(android.app.admin.SecurityLog.SecurityEvent p0) { return false; }
    }
}
