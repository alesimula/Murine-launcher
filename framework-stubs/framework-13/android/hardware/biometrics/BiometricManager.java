package android.hardware.biometrics;

public class BiometricManager {
    public static final int BIOMETRIC_SUCCESS = 0;
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_MULTI_SENSOR_DEFAULT = 0;
    public static final int BIOMETRIC_MULTI_SENSOR_FINGERPRINT_AND_FACE = 1;
    public BiometricManager(android.content.Context p0, android.hardware.biometrics.IAuthService p1) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public java.util.List<android.hardware.biometrics.SensorProperties> getSensorProperties() { return null; }
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public android.hardware.biometrics.BiometricTestSession createTestSession(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public java.lang.String getUiPackage() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
    public int canAuthenticate() { return 0; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
    public int canAuthenticate(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int canAuthenticate(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
    public android.hardware.biometrics.BiometricManager.Strings getStrings(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean hasEnrolledBiometrics(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void invalidateAuthenticatorIds(int p0, int p1, android.hardware.biometrics.IInvalidationCallback p2) {}
    public long[] getAuthenticatorIds() { return null; }
    public long[] getAuthenticatorIds(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void resetLockoutTimeBound(android.os.IBinder p0, java.lang.String p1, int p2, int p3, byte[] p4) {}

    public static interface Authenticators {
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.WRITE_DEVICE_CONFIG")
        public static final int EMPTY_SET = 0;
        public static final int BIOMETRIC_MAX_STRENGTH = 1;
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.WRITE_DEVICE_CONFIG")
        public static final int BIOMETRIC_CONVENIENCE = 4095;
        public static final int BIOMETRIC_MIN_STRENGTH = 32767;
        public static final int DEVICE_CREDENTIAL = 32768;

        public static @interface Types {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BiometricError {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BiometricMultiSensorMode {
    }

    public static class Strings {
        @android.hardware.biometrics.BiometricManager.Authenticators.Types
        int mAuthenticators;
        @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
        public java.lang.CharSequence getButtonLabel() { return null; }
        @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
        public java.lang.CharSequence getPromptMessage() { return null; }
        @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
        public java.lang.CharSequence getSettingName() { return null; }
    }
}
