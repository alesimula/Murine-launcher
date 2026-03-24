package com.android.server.am;

public final class AppsStartInfoProto {
    public static final long LAST_UPDATE_TIMESTAMP = 1112396529665L;
    public static final long PACKAGES = 2246267895810L;
    public AppsStartInfoProto() {}

    public final class Package {
        public static final long PACKAGE_NAME = 1138166333441L;
        public static final long USERS = 2246267895810L;
        public Package(com.android.server.am.AppsStartInfoProto p0) {}

        public final class User {
            public static final long UID = 1120986464257L;
            public static final long APP_START_INFO = 2246267895810L;
            public static final long MONITORING_ENABLED = 1133871366147L;
            public User(com.android.server.am.AppsStartInfoProto.Package p0) {}
        }
    }
}
