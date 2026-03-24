package android.hardware.biometrics;

public abstract class BiometricStateListener extends android.hardware.biometrics.IBiometricStateListener.Stub {
    public static final int STATE_IDLE = 0;
    public static final int STATE_ENROLLING = 1;
    public static final int STATE_KEYGUARD_AUTH = 2;
    public static final int STATE_BP_AUTH = 3;
    public static final int STATE_AUTH_OTHER = 4;
    public static final int ACTION_SENSOR_TOUCH = 0;
    public BiometricStateListener() { super(); }
    public void onStateChanged(int p0) {}
    public void onBiometricAction(int p0) {}
    public void onEnrollmentsChanged(int p0, int p1, boolean p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
