package com.android.os.art;

public final class OdrefreshEnums {
    public static final int ODREFRESH_BCP_COMPILATION_TYPE_UNKNOWN = 0;
    public static final int ODREFRESH_BCP_COMPILATION_TYPE_PRIMARY_AND_MAINLINE = 1;
    public static final int ODREFRESH_BCP_COMPILATION_TYPE_MAINLINE = 2;
    public static final int ODREFRESH_STAGE_UNKNOWN = 0;
    public static final int ODREFRESH_STAGE_CHECK = 10;
    public static final int ODREFRESH_STAGE_PREPARATION = 20;
    public static final int ODREFRESH_STAGE_PRIMARY_BOOT_CLASSPATH = 30;
    public static final int ODREFRESH_STAGE_SECONDARY_BOOT_CLASSPATH = 40;
    public static final int ODREFRESH_STAGE_SYSTEM_SERVER_CLASSPATH = 50;
    public static final int ODREFRESH_STAGE_COMPLETE = 60;
    public static final int ODREFRESH_STATUS_UNKNOWN = 0;
    public static final int ODREFRESH_STATUS_OK = 1;
    public static final int ODREFRESH_STATUS_NO_SPACE = 2;
    public static final int ODREFRESH_STATUS_IO_ERROR = 3;
    public static final int ODREFRESH_STATUS_DEX2OAT_ERROR = 4;
    public static final int ODREFRESH_STATUS_STAGING_FAILED = 6;
    public static final int ODREFRESH_STATUS_INSTALL_FAILED = 7;
    public static final int ODREFRESH_STATUS_DALVIK_CACHE_PERMISSION_DENIED = 8;
    public static final int ODREFRESH_TRIGGER_UNKNOWN = 0;
    public static final int ODREFRESH_TRIGGER_APEX_VERSION_MISMATCH = 1;
    public static final int ODREFRESH_TRIGGER_DEX_FILES_CHANGED = 2;
    public static final int ODREFRESH_TRIGGER_MISSING_ARTIFACTS = 3;
    public OdrefreshEnums() {}
}
