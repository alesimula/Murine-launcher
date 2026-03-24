package android.hardware.biometrics;

public class BiometricManager {
    private static final java.lang.String TAG = "BiometricManager";
    public static final int BIOMETRIC_SUCCESS = 0;
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    private final android.content.Context mContext = null;
    private final android.hardware.biometrics.IBiometricService mService = null;
    private final boolean mHasHardware = false;
    public static boolean hasBiometrics(android.content.Context p0) { return false; }
    public BiometricManager(android.content.Context p0, android.hardware.biometrics.IBiometricService p1) {}
    @android.hardware.biometrics.BiometricManager.BiometricError
    public int canAuthenticate() { return 0; }
    @android.hardware.biometrics.BiometricManager.BiometricError
    public int canAuthenticate(int p0) { return 0; }
    public boolean hasEnrolledBiometrics(int p0) { return false; }
    public void registerEnabledOnKeyguardCallback(android.hardware.biometrics.IBiometricEnabledOnKeyguardCallback p0) {}
    public void setActiveUser(int p0) {}
    public void resetLockout(byte[] p0) {}
    public void onConfirmDeviceCredentialSuccess() {}
    public void onConfirmDeviceCredentialError(int p0, java.lang.String p1) {}
    public void registerCancellationCallback(android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback p0) {}

    static @interface BiometricError {
    }
}
