package android.hardware.fingerprint;

public abstract class FingerprintStateListener extends android.hardware.fingerprint.IFingerprintStateListener.Stub {
    public static final int STATE_IDLE = 0;
    public static final int STATE_ENROLLING = 1;
    public static final int STATE_KEYGUARD_AUTH = 2;
    public static final int STATE_BP_AUTH = 3;
    public static final int STATE_AUTH_OTHER = 4;
    public FingerprintStateListener() { super(); }
    public abstract void onStateChanged(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
