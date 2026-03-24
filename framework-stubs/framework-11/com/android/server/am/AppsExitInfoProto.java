package com.android.server.am;

public final class AppsExitInfoProto {
    public static final long LAST_UPDATE_TIMESTAMP = 1112396529665L;
    public static final long PACKAGES = 2246267895810L;
    public AppsExitInfoProto() {}

    public final class Package {
        public static final long PACKAGE_NAME = 1138166333441L;
        public static final long USERS = 2246267895810L;
        public Package(com.android.server.am.AppsExitInfoProto p0) {}

        public final class User {
            public static final long UID = 1120986464257L;
            public static final long APP_EXIT_INFO = 2246267895810L;
            public User(com.android.server.am.AppsExitInfoProto.Package p0) {}
        }
    }
}
