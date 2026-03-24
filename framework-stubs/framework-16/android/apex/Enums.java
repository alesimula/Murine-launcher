package android.apex;

public final class Enums {
    public static final int UNKNOWN_INSTALL_TYPE = 0;
    public static final int STAGED = 1;
    public static final int REBOOTLESS = 2;
    public static final int UNKNOWN_INSTALL_RESULT = 0;
    public static final int INSTALL_SUCCESSFUL = 1;
    public static final int INSTALL_FAILURE_APEX_READING = 2;
    public static final int INSTALL_FAILURE_APEX_VALIDATION = 3;
    public static final int INSTALL_FAILURE_APEX_PREPARATION = 4;
    public static final int INSTALL_FAILURE_APEX_STAGING = 5;
    public static final int INSTALL_FAILURE_APEX_INSTALLATION = 6;
    public static final int INSTALL_FAILURE_APEX_ACTIVATION = 7;
    public static final int PARTITION_UNKNOWN = 0;
    public static final int PARTITION_OTHER = 1;
    public static final int PARTITION_PRODUCT = 2;
    public static final int PARTITION_SYSTEM = 3;
    public static final int PARTITION_SYSTEM_EXT = 4;
    public static final int PARTITION_VENDOR = 5;
    public static final int PARTITION_ODM = 6;
    public Enums() {}
}
