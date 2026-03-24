package android.adservices.common;

public class AdServicesCommonManager {
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final java.lang.String ACTION_ADSERVICES_NOTIFICATION_DISPLAYED = "android.adservices.common.action.ADSERVICES_NOTIFICATION_DISPLAYED";
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final java.lang.String ACTION_VIEW_ADSERVICES_CONSENT_PAGE = "android.adservices.common.action.VIEW_ADSERVICES_CONSENT_PAGE";
    @android.annotation.FlaggedApi("com.android.adservices.flags.ui_enable_set_ads_personalization_status")
    public static final int ADS_PERSONALZATION_DISABLED = 1;
    @android.annotation.FlaggedApi("com.android.adservices.flags.ui_enable_set_ads_personalization_status")
    public static final int ADS_PERSONALZATION_ENABLED = 0;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_ADID = 5;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_MEASUREMENT = 0;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_ON_DEVICE_PERSONALIZATION = 4;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_PROTECTED_APP_SIGNALS = 2;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_PROTECTED_AUDIENCE = 1;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_STATE_DISABLED = 2;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_STATE_ENABLED = 1;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_STATE_UNKNOWN = 0;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int MODULE_TOPICS = 3;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int NOTIFICATION_NONE = 0;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int NOTIFICATION_ONGOING = 1;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int NOTIFICATION_REGULAR = 2;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int USER_CHOICE_OPTED_IN = 1;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int USER_CHOICE_OPTED_OUT = 2;
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public static final int USER_CHOICE_UNKNOWN = 0;
    AdServicesCommonManager() {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void enableAdServices(android.adservices.common.AdServicesStates p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    public void enableAdServices(android.adservices.common.AdServicesStates p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    @android.annotation.NonNull
    public static android.adservices.common.AdServicesCommonManager get(android.content.Context p0) { return null; }
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_consent_data_migration_api")
    public void getAdServicesModuleStates(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.adservices.common.AdServicesModuleStatesResponse, java.lang.Exception> p1) {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_consent_data_migration_api")
    public void getAdServicesModuleUserChoices(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.adservices.common.AdServicesUserChoicesResponse, java.lang.Exception> p1) {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.get_adservices_common_states_api_enabled")
    public void getAdservicesCommonStates(java.util.concurrent.Executor p0, android.adservices.common.AdServicesOutcomeReceiver<android.adservices.common.AdServicesCommonStatesResponse, java.lang.Exception> p1) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void isAdServicesEnabled(java.util.concurrent.Executor p0, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Boolean, java.lang.Exception> p1) {}
    public void isAdServicesEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p1) {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public void requestAdServicesModuleOverrides(android.adservices.common.UpdateAdServicesModuleStatesParams p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Void, java.lang.Exception> p2) {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_enable_per_module_overrides_api")
    public void requestAdServicesModuleUserChoices(android.adservices.common.UpdateAdServicesUserChoicesParams p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Void, java.lang.Exception> p2) {}
    public void setAdServicesEnabled(boolean p0, boolean p1) {}
    @android.annotation.FlaggedApi("com.android.adservices.flags.ui_enable_set_ads_personalization_status")
    public void setAdsPersonalizationStatus(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("com.android.adservices.flags.adservices_outcomereceiver_r_api_deprecated")
    public void updateAdId(android.adservices.common.UpdateAdIdRequest p0, java.util.concurrent.Executor p1, android.adservices.common.AdServicesOutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    public void updateAdId(android.adservices.common.UpdateAdIdRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
}
