package android.adservices.ondevicepersonalization;

public class OnDevicePersonalizationException extends java.lang.Exception {
    public static final int ERROR_ISOLATED_SERVICE_FAILED = 1;
    public static final int ERROR_PERSONALIZATION_DISABLED = 2;
    OnDevicePersonalizationException() { super(); }
    public int getErrorCode() { return 0; }
}
