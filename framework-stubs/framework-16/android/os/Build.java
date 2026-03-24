package android.os;

public class Build {
    public static final java.lang.String UNKNOWN = "unknown";
    public static final java.lang.String ID = null;
    public static final java.lang.String DISPLAY = null;
    public static final java.lang.String PRODUCT = null;
    @android.annotation.Nullable
    public static final java.lang.String PRODUCT_FOR_ATTESTATION = null;
    public static final java.lang.String DEVICE = null;
    @android.annotation.Nullable
    public static final java.lang.String DEVICE_FOR_ATTESTATION = null;
    public static final java.lang.String BOARD = null;
    @java.lang.Deprecated
    public static final java.lang.String CPU_ABI = null;
    @java.lang.Deprecated
    public static final java.lang.String CPU_ABI2 = null;
    public static final java.lang.String MANUFACTURER = null;
    @android.annotation.Nullable
    public static final java.lang.String MANUFACTURER_FOR_ATTESTATION = null;
    public static final java.lang.String BRAND = null;
    @android.annotation.Nullable
    public static final java.lang.String BRAND_FOR_ATTESTATION = null;
    public static final java.lang.String MODEL = null;
    @android.annotation.Nullable
    public static final java.lang.String MODEL_FOR_ATTESTATION = null;
    @android.annotation.NonNull
    public static final java.lang.String SOC_MANUFACTURER = null;
    @android.annotation.NonNull
    public static final java.lang.String SOC_MODEL = null;
    public static final java.lang.String BOOTLOADER = null;
    @java.lang.Deprecated
    public static final java.lang.String RADIO = null;
    public static final java.lang.String HARDWARE = null;
    @android.annotation.NonNull
    public static final java.lang.String SKU = null;
    @android.annotation.NonNull
    public static final java.lang.String ODM_SKU = null;
    public static final boolean IS_EMULATOR = Boolean.valueOf(false);
    @java.lang.Deprecated
    public static final java.lang.String SERIAL = null;
    public static final java.lang.String[] SUPPORTED_ABIS = null;
    public static final java.lang.String[] SUPPORTED_32_BIT_ABIS = null;
    public static final java.lang.String[] SUPPORTED_64_BIT_ABIS = null;
    public static final int VENDOR_API_2024_Q2 = 202404;
    public static final java.lang.String TYPE = null;
    public static final java.lang.String TAGS = null;
    public static final java.lang.String FINGERPRINT = null;
    @android.annotation.FlaggedApi("android.os.api_for_backported_fixes")
    public static final int BACKPORTED_FIX_STATUS_UNKNOWN = 0;
    @android.annotation.FlaggedApi("android.os.api_for_backported_fixes")
    public static final int BACKPORTED_FIX_STATUS_FIXED = 1;
    @android.annotation.FlaggedApi("android.os.api_for_backported_fixes")
    public static final int BACKPORTED_FIX_STATUS_NOT_APPLICABLE = 2;
    @android.annotation.FlaggedApi("android.os.api_for_backported_fixes")
    public static final int BACKPORTED_FIX_STATUS_NOT_FIXED = 3;
    public static final int HW_TIMEOUT_MULTIPLIER = Integer.valueOf(0);
    public static final long TIME = Long.valueOf(0L);
    public static final java.lang.String USER = null;
    public static final java.lang.String HOST = null;
    public static final boolean IS_DEBUGGABLE = Boolean.valueOf(false);
    public static final boolean IS_ENG = Boolean.valueOf(false);
    public static final boolean IS_USERDEBUG = Boolean.valueOf(false);
    public static final boolean IS_USER = Boolean.valueOf(false);
    public static final boolean IS_ARC = Boolean.valueOf(false);
    @android.annotation.SystemApi
    public static final boolean PERMISSIONS_REVIEW_REQUIRED = true;
    public Build() {}
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public static java.lang.String getSerial() { return null; }
    public static boolean is64BitAbi(java.lang.String p0) { return false; }
    @android.annotation.FlaggedApi("android.sdk.major_minor_versioning_scheme")
    public static int getMajorSdkVersion(int p0) { return 0; }
    @android.annotation.FlaggedApi("android.sdk.major_minor_versioning_scheme")
    public static int getMinorSdkVersion(int p0) { return 0; }
    @android.annotation.SuppressLint("InlinedApi")
    public static int parseFullVersion(java.lang.String p0) { return 0; }
    public static java.lang.String fullVersionToString(int p0) { return null; }
    @android.annotation.FlaggedApi("android.os.api_for_backported_fixes")
    public static int getBackportedFixStatus(long p0) { return 0; }
    public static void ensureFingerprintProperty() {}
    public static boolean isBuildConsistent() { return false; }
    @android.annotation.NonNull
    public static java.util.List<android.os.Build.Partition> getFingerprintedPartitions() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static boolean isDebuggable() { return false; }
    public static java.lang.String getRadioVersion() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackportedFixStatus {
    }

    public static class Partition {
        public static final java.lang.String PARTITION_NAME_SYSTEM = "system";
        public static final java.lang.String PARTITION_NAME_BOOTIMAGE = "bootimage";
        public static final java.lang.String PARTITION_NAME_ODM = "odm";
        public static final java.lang.String PARTITION_NAME_OEM = "oem";
        public static final java.lang.String PARTITION_NAME_PRODUCT = "product";
        public static final java.lang.String PARTITION_NAME_SYSTEM_EXT = "system_ext";
        public static final java.lang.String PARTITION_NAME_VENDOR = "vendor";
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
        @android.annotation.NonNull
        public java.lang.String getFingerprint() { return null; }
        public long getBuildTimeMillis() { return 0L; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SdkIntFull {
    }

    public static class VERSION {
        public static final java.lang.String INCREMENTAL = null;
        public static final java.lang.String RELEASE = null;
        @android.annotation.NonNull
        public static final java.lang.String RELEASE_OR_CODENAME = null;
        @android.annotation.NonNull
        public static final java.lang.String RELEASE_OR_PREVIEW_DISPLAY = null;
        public static final java.lang.String BASE_OS = null;
        public static final java.lang.String SECURITY_PATCH = null;
        public static final int MEDIA_PERFORMANCE_CLASS = Integer.valueOf(0);
        @java.lang.Deprecated
        public static final java.lang.String SDK = null;
        public static final int SDK_INT = Integer.valueOf(0);
        @android.annotation.FlaggedApi("android.sdk.major_minor_versioning_scheme")
        public static final int SDK_INT_FULL = Integer.valueOf(0);
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        public static final int DEVICE_INITIAL_SDK_INT = Integer.valueOf(0);
        public static final int PREVIEW_SDK_INT = Integer.valueOf(0);
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public static final java.lang.String PREVIEW_SDK_FINGERPRINT = null;
        public static final java.lang.String CODENAME = null;
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public static final java.util.Set<java.lang.String> KNOWN_CODENAMES = null;
        public static final java.lang.String[] ACTIVE_CODENAMES = null;
        public static final int RESOURCES_SDK_INT = Integer.valueOf(0);
        public static final int RESOURCES_SDK_INT_FULL = Integer.valueOf(0);
        public static final int MIN_SUPPORTED_TARGET_SDK_INT = Integer.valueOf(0);
        public VERSION() {}
    }

    public static class VERSION_CODES {
        public static final int CUR_DEVELOPMENT = 10000;
        public static final int BASE = 1;
        public static final int BASE_1_1 = 2;
        public static final int CUPCAKE = 3;
        public static final int DONUT = 4;
        public static final int ECLAIR = 5;
        public static final int ECLAIR_0_1 = 6;
        public static final int ECLAIR_MR1 = 7;
        public static final int FROYO = 8;
        public static final int GINGERBREAD = 9;
        public static final int GINGERBREAD_MR1 = 10;
        public static final int HONEYCOMB = 11;
        public static final int HONEYCOMB_MR1 = 12;
        public static final int HONEYCOMB_MR2 = 13;
        public static final int ICE_CREAM_SANDWICH = 14;
        public static final int ICE_CREAM_SANDWICH_MR1 = 15;
        public static final int JELLY_BEAN = 16;
        public static final int JELLY_BEAN_MR1 = 17;
        public static final int JELLY_BEAN_MR2 = 18;
        public static final int KITKAT = 19;
        public static final int KITKAT_WATCH = 20;
        public static final int L = 21;
        public static final int LOLLIPOP = 21;
        public static final int LOLLIPOP_MR1 = 22;
        public static final int M = 23;
        public static final int N = 24;
        public static final int N_MR1 = 25;
        public static final int O = 26;
        public static final int O_MR1 = 27;
        public static final int P = 28;
        public static final int Q = 29;
        public static final int R = 30;
        public static final int S = 31;
        public static final int S_V2 = 32;
        public static final int TIRAMISU = 33;
        public static final int UPSIDE_DOWN_CAKE = 34;
        public static final int VANILLA_ICE_CREAM = 35;
        @android.annotation.FlaggedApi("android.sdk.major_minor_versioning_scheme")
        public static final int BAKLAVA = 36;
        public VERSION_CODES() {}
    }

    @android.annotation.FlaggedApi("android.sdk.major_minor_versioning_scheme")
    @android.annotation.SuppressLint("AcronymName")
    public static class VERSION_CODES_FULL {
        public static final int BASE = 100000;
        public static final int BASE_1_1 = 200000;
        public static final int CUPCAKE = 300000;
        public static final int DONUT = 400000;
        public static final int ECLAIR = 500000;
        public static final int ECLAIR_0_1 = 600000;
        public static final int ECLAIR_MR1 = 700000;
        public static final int FROYO = 800000;
        public static final int GINGERBREAD = 900000;
        public static final int GINGERBREAD_MR1 = 1000000;
        public static final int HONEYCOMB = 1100000;
        public static final int HONEYCOMB_MR1 = 1200000;
        public static final int HONEYCOMB_MR2 = 1300000;
        public static final int ICE_CREAM_SANDWICH = 1400000;
        public static final int ICE_CREAM_SANDWICH_MR1 = 1500000;
        public static final int JELLY_BEAN = 1600000;
        public static final int JELLY_BEAN_MR1 = 1700000;
        public static final int JELLY_BEAN_MR2 = 1800000;
        public static final int KITKAT = 1900000;
        public static final int KITKAT_WATCH = 2000000;
        public static final int LOLLIPOP = 2100000;
        public static final int LOLLIPOP_MR1 = 2200000;
        public static final int M = 2300000;
        public static final int N = 2400000;
        public static final int N_MR1 = 2500000;
        public static final int O = 2600000;
        public static final int O_MR1 = 2700000;
        public static final int P = 2800000;
        public static final int Q = 2900000;
        public static final int R = 3000000;
        public static final int S = 3100000;
        public static final int S_V2 = 3200000;
        public static final int TIRAMISU = 3300000;
        public static final int UPSIDE_DOWN_CAKE = 3400000;
        public static final int VANILLA_ICE_CREAM = 3500000;
        public static final int BAKLAVA = 3600000;
    }
}
