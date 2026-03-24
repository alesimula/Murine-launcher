package android.hardware.biometrics;

public class BiometricManager {
    private static final java.lang.String TAG = "BiometricManager";
    public static final int BIOMETRIC_SUCCESS = 0;
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    private final android.content.Context mContext = null;
    private final android.hardware.biometrics.IAuthService mService = null;
    public BiometricManager(android.content.Context p0, android.hardware.biometrics.IAuthService p1) {}
    @java.lang.Deprecated
    @android.hardware.biometrics.BiometricManager.BiometricError
    public int canAuthenticate() { return 0; }
    @android.hardware.biometrics.BiometricManager.BiometricError
    public int canAuthenticate(int p0) { return 0; }
    @android.hardware.biometrics.BiometricManager.BiometricError
    public int canAuthenticate(int p0, int p1) { return 0; }
    public boolean hasEnrolledBiometrics(int p0) { return false; }
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) {}
    public void setActiveUser(int p0) {}
    public void resetLockout(byte[] p0) {}
    public long[] getAuthenticatorIds() { return null; }

    public static interface Authenticators {
        @android.annotation.SystemApi
        public static final int EMPTY_SET = 0;
        public static final int BIOMETRIC_MAX_STRENGTH = 1;
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        @android.annotation.SystemApi
        public static final int BIOMETRIC_CONVENIENCE = 4095;
        public static final int BIOMETRIC_MIN_STRENGTH = 32767;
        public static final int DEVICE_CREDENTIAL = 32768;

        public static @interface Types {
        }
    }

    static @interface BiometricError {
    }
}
