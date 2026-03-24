package android.content.pm;

public class PermissionInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
    public static final int PROTECTION_NORMAL = 0;
    public static final int PROTECTION_DANGEROUS = 1;
    public static final int PROTECTION_SIGNATURE = 2;
    @java.lang.Deprecated
    public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
    public static final int PROTECTION_FLAG_PRIVILEGED = 16;
    @java.lang.Deprecated
    public static final int PROTECTION_FLAG_SYSTEM = 16;
    public static final int PROTECTION_FLAG_DEVELOPMENT = 32;
    public static final int PROTECTION_FLAG_APPOP = 64;
    public static final int PROTECTION_FLAG_PRE23 = 128;
    public static final int PROTECTION_FLAG_INSTALLER = 256;
    public static final int PROTECTION_FLAG_VERIFIER = 512;
    public static final int PROTECTION_FLAG_PREINSTALLED = 1024;
    public static final int PROTECTION_FLAG_SETUP = 2048;
    public static final int PROTECTION_FLAG_INSTANT = 4096;
    public static final int PROTECTION_FLAG_RUNTIME_ONLY = 8192;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_OEM = 16384;
    public static final int PROTECTION_FLAG_VENDOR_PRIVILEGED = 32768;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_SYSTEM_TEXT_CLASSIFIER = 65536;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_WELLBEING = 131072;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_DOCUMENTER = 262144;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_CONFIGURATOR = 524288;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_INCIDENT_REPORT_APPROVER = 1048576;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_APP_PREDICTOR = 2097152;
    @java.lang.Deprecated
    public static final int PROTECTION_MASK_BASE = 15;
    @java.lang.Deprecated
    public static final int PROTECTION_MASK_FLAGS = 65520;
    @java.lang.Deprecated
    public int protectionLevel;
    public java.lang.String group;
    public static final int FLAG_COSTS_MONEY = 1;
    @android.annotation.SystemApi
    public static final int FLAG_REMOVED = 2;
    public static final int FLAG_HARD_RESTRICTED = 4;
    public static final int FLAG_SOFT_RESTRICTED = 8;
    public static final int FLAG_IMMUTABLY_RESTRICTED = 16;
    public static final int FLAG_INSTALLED = 1073741824;
    public int flags;
    public int descriptionRes;
    @android.annotation.SystemApi
    public int requestRes;
    @android.annotation.SystemApi
    public final java.lang.String backgroundPermission = null;
    public java.lang.CharSequence nonLocalizedDescription;
    public static final android.os.Parcelable.Creator<android.content.pm.PermissionInfo> CREATOR = null;
    public static int fixProtectionLevel(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String protectionToString(int p0) { return null; }
    public PermissionInfo(java.lang.String p0) { super(); }
    @java.lang.Deprecated
    public PermissionInfo() { super(); }
    @java.lang.Deprecated
    public PermissionInfo(android.content.pm.PermissionInfo p0) { super(); }
    public java.lang.CharSequence loadDescription(android.content.pm.PackageManager p0) { return null; }
    public int getProtection() { return 0; }
    public int getProtectionFlags() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int calculateFootprint() { return 0; }
    public boolean isHardRestricted() { return false; }
    public boolean isSoftRestricted() { return false; }
    public boolean isRestricted() { return false; }
    public boolean isAppOp() { return false; }
    public boolean isRuntime() { return false; }
    private PermissionInfo(android.os.Parcel p0) { super(); }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProtectionFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Protection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
