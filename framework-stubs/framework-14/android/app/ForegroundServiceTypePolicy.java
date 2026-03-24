package android.app;

public abstract class ForegroundServiceTypePolicy {
    static final java.lang.String TAG = "ForegroundServiceTypePolicy";
    static final boolean DEBUG_FOREGROUND_SERVICE_TYPE_POLICY = false;
    public static final long FGS_TYPE_NONE_DEPRECATION_CHANGE_ID = 255042465L;
    public static final long FGS_TYPE_NONE_DISABLED_CHANGE_ID = 255038118L;
    public static final long FGS_TYPE_DATA_SYNC_DEPRECATION_CHANGE_ID = 255039210L;
    public static final long FGS_TYPE_DATA_SYNC_DISABLED_CHANGE_ID = 255659651L;
    public static final long FGS_TYPE_PERMISSION_CHANGE_ID = 254662522L;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MANIFEST = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_NONE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_DATA_SYNC = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MEDIA_PLAYBACK = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_PHONE_CALL = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_LOCATION = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_CONNECTED_DEVICE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MEDIA_PROJECTION = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_CAMERA = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_MICROPHONE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_HEALTH = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_REMOTE_MESSAGING = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_SYSTEM_EXEMPTED = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_SHORT_SERVICE = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_FILE_MANAGEMENT = null;
    public static final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo FGS_TYPE_POLICY_SPECIAL_USE = null;
    public static final int FGS_TYPE_POLICY_CHECK_UNKNOWN = 0;
    public static final int FGS_TYPE_POLICY_CHECK_OK = 1;
    public static final int FGS_TYPE_POLICY_CHECK_DEPRECATED = 2;
    public static final int FGS_TYPE_POLICY_CHECK_DISABLED = 3;
    public static final int FGS_TYPE_POLICY_CHECK_PERMISSION_DENIED_PERMISSIVE = 4;
    public static final int FGS_TYPE_POLICY_CHECK_PERMISSION_DENIED_ENFORCED = 5;
    public abstract android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo getForegroundServiceTypePolicyInfo(int p0, int p1);
    public abstract int checkForegroundServiceTypePolicy(android.content.Context p0, java.lang.String p1, int p2, int p3, boolean p4, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo p5);
    public abstract void updatePermissionEnforcementFlagIfNecessary(java.lang.String p0);
    public static android.app.ForegroundServiceTypePolicy getDefaultPolicy() { return null; }
    public ForegroundServiceTypePolicy() {}

    static class AppOpPermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        final int mOpCode = 0;
        AppOpPermission(int p0) { super(null); }
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }

    public static class DefaultForegroundServiceTypePolicy extends android.app.ForegroundServiceTypePolicy {
        public DefaultForegroundServiceTypePolicy() { super(); }
        public android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo getForegroundServiceTypePolicyInfo(int p0, int p1) { return null; }
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        public int checkForegroundServiceTypePolicy(android.content.Context p0, java.lang.String p1, int p2, int p3, boolean p4, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePolicyInfo p5) { return 0; }
        public void updatePermissionEnforcementFlagIfNecessary(java.lang.String p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ForegroundServicePolicyCheckCode {
    }

    public static abstract class ForegroundServiceTypePermission {
        protected final java.lang.String mName = null;
        public ForegroundServiceTypePermission(java.lang.String p0) {}
        public abstract int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4);
        public java.lang.String toString() { return null; }
        void addToList(android.content.Context p0, java.util.ArrayList<java.lang.String> p1) {}
    }

    public static class ForegroundServiceTypePermissions {
        final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission[] mPermissions = null;
        final boolean mAllOf = false;
        public ForegroundServiceTypePermissions(android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission[] p0, boolean p1) {}
        public int checkPermissions(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
        public java.lang.String toString() { return null; }
        java.lang.String[] toStringArray(android.content.Context p0) { return null; }
    }

    public static final class ForegroundServiceTypePolicyInfo {
        final int mType = 0;
        final long mDeprecationChangeId = 0L;
        final long mDisabledChangeId = 0L;
        final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermissions mAllOfPermissions = null;
        final android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermissions mAnyOfPermissions = null;
        final java.lang.String mPermissionEnforcementFlag = null;
        final boolean mPermissionEnforcementFlagDefaultValue = false;
        final boolean mForegroundOnlyPermission = false;
        android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission mCustomPermission;
        volatile boolean mPermissionEnforcementFlagValue;
        public ForegroundServiceTypePolicyInfo(int p0, long p1, long p2, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermissions p3, android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermissions p4, java.lang.String p5, boolean p6, boolean p7) {}
        public int getForegroundServiceType() { return 0; }
        public java.lang.String toString() { return null; }
        public java.lang.String toPermissionString() { return null; }
        public void setCustomPermission(android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission p0) {}
        public java.util.Optional<java.lang.String[]> getRequiredAllOfPermissionsForTest(android.content.Context p0) { return null; }
        public java.util.Optional<java.lang.String[]> getRequiredAnyOfPermissionsForTest(android.content.Context p0) { return null; }
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        public boolean isTypeDisabled(int p0) { return false; }
        public boolean hasForegroundOnlyPermission() { return false; }
        public void setTypeDisabledForTest(boolean p0, java.lang.String p1) throws android.os.RemoteException {}
        public void clearTypeDisabledForTest(java.lang.String p0) throws android.os.RemoteException {}
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        boolean isTypeDeprecated(int p0) { return false; }
        public java.lang.String getPermissionEnforcementFlagForTest() { return null; }
    }

    static class RegularPermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        RegularPermission(java.lang.String p0) { super(null); }
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        int checkPermission(android.content.Context p0, java.lang.String p1, int p2, int p3, java.lang.String p4, boolean p5) { return 0; }
    }

    static class RolePermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        final java.lang.String mRole = null;
        RolePermission(java.lang.String p0) { super(null); }
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }

    static class UsbAccessoryPermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        UsbAccessoryPermission() { super(null); }
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }

    static class UsbDevicePermission extends android.app.ForegroundServiceTypePolicy.ForegroundServiceTypePermission {
        UsbDevicePermission() { super(null); }
        @android.annotation.SuppressLint("AndroidFrameworkRequiresPermission")
        public int checkPermission(android.content.Context p0, int p1, int p2, java.lang.String p3, boolean p4) { return 0; }
    }
}
