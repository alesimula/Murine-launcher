package android.provider;

@android.annotation.SystemApi
public final class TimeZoneRulesDataContract {
    public static final java.lang.String AUTHORITY = "com.android.timezone";
    private static final android.net.Uri AUTHORITY_URI = null;
    private TimeZoneRulesDataContract() {}

    public static final class Operation {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String COLUMN_TYPE = "type";
        public static final java.lang.String TYPE_INSTALL = "INSTALL";
        public static final java.lang.String TYPE_UNINSTALL = "UNINSTALL";
        public static final java.lang.String TYPE_NO_OP = "NOOP";
        public static final java.lang.String COLUMN_DISTRO_MAJOR_VERSION = "distro_major_version";
        public static final java.lang.String COLUMN_DISTRO_MINOR_VERSION = "distro_minor_version";
        public static final java.lang.String COLUMN_RULES_VERSION = "rules_version";
        public static final java.lang.String COLUMN_REVISION = "revision";
        private Operation() {}
    }
}
