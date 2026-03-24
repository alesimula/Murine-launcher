package com.android.os.conscrypt;

public final class Enums {
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_NOT_FOUND = 2;
    public static final int STATUS_PARSING_FAILED = 3;
    public static final int STATUS_EXPIRED = 4;
    public static final int COMPAT_VERSION_UNKNOWN = 0;
    public static final int COMPAT_VERSION_V1 = 1;
    public static final int COMPAT_VERSION_V2 = 2;
    public static final int RESULT_UNKNOWN = 0;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_GENERIC_FAILURE = 2;
    public static final int RESULT_FAILURE_NO_SCTS_FOUND = 3;
    public static final int RESULT_FAILURE_SCTS_NOT_COMPLIANT = 4;
    public static final int RESULT_FAIL_OPEN_NO_LOG_LIST_AVAILABLE = 5;
    public static final int RESULT_FAIL_OPEN_LOG_LIST_NOT_COMPLIANT = 6;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_DEVICE_WIDE_ENABLED = 1;
    public static final int REASON_SDK_TARGET_DEFAULT_ENABLED = 2;
    public static final int REASON_NSCONFIG_APP_OPT_IN = 3;
    public static final int REASON_NSCONFIG_DOMAIN_OPT_IN = 4;
    public static final int REASON_DRY_RUN = 5;
    public Enums() {}
}
