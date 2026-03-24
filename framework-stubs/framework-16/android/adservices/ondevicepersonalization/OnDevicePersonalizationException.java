package android.adservices.ondevicepersonalization;

public class OnDevicePersonalizationException extends java.lang.Exception {
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public static final int ERROR_INFERENCE_FAILED = 9;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public static final int ERROR_INFERENCE_MODEL_NOT_FOUND = 8;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public static final int ERROR_INVALID_TRAINING_MANIFEST = 7;
    public static final int ERROR_ISOLATED_SERVICE_FAILED = 1;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public static final int ERROR_ISOLATED_SERVICE_LOADING_FAILED = 3;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public static final int ERROR_ISOLATED_SERVICE_MANIFEST_PARSING_FAILED = 4;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public static final int ERROR_ISOLATED_SERVICE_TIMEOUT = 5;
    public static final int ERROR_PERSONALIZATION_DISABLED = 2;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.execute_in_isolated_service_api_enabled")
    public static final int ERROR_SCHEDULE_TRAINING_FAILED = 6;
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.unhidden_on_device_personalization_exception_enabled")
    public OnDevicePersonalizationException(int p0) { super(); }
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.unhidden_on_device_personalization_exception_enabled")
    public OnDevicePersonalizationException(int p0, java.lang.String p1) { super(); }
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.unhidden_on_device_personalization_exception_enabled")
    public OnDevicePersonalizationException(int p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    @android.annotation.FlaggedApi("com.android.adservices.ondevicepersonalization.flags.unhidden_on_device_personalization_exception_enabled")
    public OnDevicePersonalizationException(int p0, java.lang.Throwable p1) { super(); }
    public int getErrorCode() { return 0; }
}
