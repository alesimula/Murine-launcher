package android.nfc.cardemulation;

public final class CardEmulation {
    @java.lang.Deprecated
    public static final java.lang.String ACTION_CHANGE_DEFAULT = "android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT";
    public static final java.lang.String CATEGORY_OTHER = "other";
    public static final java.lang.String CATEGORY_PAYMENT = "payment";
    public static final java.lang.String EXTRA_CATEGORY = "category";
    public static final java.lang.String EXTRA_SERVICE_COMPONENT = "component";
    @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
    public static final int NFC_INTERNAL_ERROR_COMMAND_TIMEOUT = 3;
    @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
    public static final int NFC_INTERNAL_ERROR_NFC_CRASH_RESTART = 1;
    @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
    public static final int NFC_INTERNAL_ERROR_NFC_HARDWARE_ERROR = 2;
    @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
    public static final int NFC_INTERNAL_ERROR_UNKNOWN = 0;
    @android.annotation.FlaggedApi("android.nfc.nfc_associated_role_services")
    public static final java.lang.String PROPERTY_ALLOW_SHARED_ROLE_PRIORITY = "android.nfc.cardemulation.PROPERTY_ALLOW_SHARED_ROLE_PRIORITY";
    @android.annotation.FlaggedApi("android.nfc.nfc_override_recover_routing_table")
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_DEFAULT = 3;
    @android.annotation.FlaggedApi("android.nfc.nfc_override_recover_routing_table")
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_DH = 0;
    @android.annotation.FlaggedApi("android.nfc.nfc_override_recover_routing_table")
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_ESE = 1;
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.oem_extension_25q4")
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_NDEF_NFCEE = 4;
    @android.annotation.FlaggedApi("android.nfc.nfc_override_recover_routing_table")
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_UICC = 2;
    @android.annotation.FlaggedApi("android.nfc.nfc_override_recover_routing_table")
    public static final int PROTOCOL_AND_TECHNOLOGY_ROUTE_UNSET = -1;
    public static final int SELECTION_MODE_ALWAYS_ASK = 1;
    public static final int SELECTION_MODE_ASK_IF_CONFLICT = 2;
    public static final int SELECTION_MODE_PREFER_DEFAULT = 0;
    @android.annotation.FlaggedApi("android.nfc.nfc_set_service_enabled_for_category_other")
    public static final int SET_SERVICE_ENABLED_STATUS_FAILURE_ALREADY_SET = 3;
    @android.annotation.FlaggedApi("android.nfc.nfc_set_service_enabled_for_category_other")
    public static final int SET_SERVICE_ENABLED_STATUS_FAILURE_FEATURE_UNSUPPORTED = 1;
    @android.annotation.FlaggedApi("android.nfc.nfc_set_service_enabled_for_category_other")
    public static final int SET_SERVICE_ENABLED_STATUS_FAILURE_INVALID_SERVICE = 2;
    @android.annotation.FlaggedApi("android.nfc.nfc_set_service_enabled_for_category_other")
    public static final int SET_SERVICE_ENABLED_STATUS_FAILURE_UNKNOWN_ERROR = 4;
    @android.annotation.FlaggedApi("android.nfc.nfc_set_service_enabled_for_category_other")
    public static final int SET_SERVICE_ENABLED_STATUS_OK = 0;
    @android.annotation.FlaggedApi("android.nfc.enable_card_emulation_euicc")
    public static final int SET_SUBSCRIPTION_ID_STATUS_FAILED_INTERNAL_ERROR = 2;
    @android.annotation.FlaggedApi("android.nfc.enable_card_emulation_euicc")
    public static final int SET_SUBSCRIPTION_ID_STATUS_FAILED_INVALID_SUBSCRIPTION_ID = 1;
    @android.annotation.FlaggedApi("android.nfc.enable_card_emulation_euicc")
    public static final int SET_SUBSCRIPTION_ID_STATUS_FAILED_NOT_SUPPORTED = 3;
    @android.annotation.FlaggedApi("android.nfc.enable_card_emulation_euicc")
    public static final int SET_SUBSCRIPTION_ID_STATUS_SUCCESS = 0;
    @android.annotation.FlaggedApi("android.nfc.enable_card_emulation_euicc")
    public static final int SET_SUBSCRIPTION_ID_STATUS_UNKNOWN = -1;
    CardEmulation() {}
    public boolean categoryAllowsForegroundPreference(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public java.util.List<java.lang.String> getAidsForPreferredPaymentService() { return null; }
    public java.util.List<java.lang.String> getAidsForService(android.content.ComponentName p0, java.lang.String p1) { return null; }
    @android.annotation.FlaggedApi("android.nfc.enable_card_emulation_euicc")
    public int getDefaultNfcSubscriptionId() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getDescriptionForPreferredPaymentService() { return null; }
    public static android.nfc.cardemulation.CardEmulation getInstance(android.nfc.NfcAdapter p0) { return null; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.get_polling_loop_filters")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPollingLoopFiltersForService(android.content.ComponentName p0) { return null; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.get_polling_loop_filters")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPollingLoopPatternFiltersForService(android.content.ComponentName p0) { return null; }
    @android.annotation.FlaggedApi("android.permission.flags.wallet_role_enabled")
    @android.annotation.Nullable
    public static android.content.ComponentName getPreferredPaymentService(android.content.Context p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getRouteDestinationForPreferredPaymentService() { return null; }
    public int getSelectionModeForCategory(java.lang.String p0) { return 0; }
    @android.annotation.FlaggedApi("android.nfc.enable_nfc_mainline")
    @android.annotation.NonNull
    public java.util.List<android.nfc.cardemulation.ApduServiceInfo> getServices(java.lang.String p0, int p1) { return null; }
    public boolean isDefaultServiceForAid(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean isDefaultServiceForCategory(android.content.ComponentName p0, java.lang.String p1) { return false; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.screen_state_attribute_toggle")
    public boolean isDeviceScreenOnRequiredForService(android.content.ComponentName p0) { return false; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.screen_state_attribute_toggle")
    public boolean isDeviceUnlockRequiredForService(android.content.ComponentName p0) { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_card_emulation_euicc")
    public boolean isEuiccSupported() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_override_recover_routing_table")
    public void overrideRoutingTable(android.app.Activity p0, int p1, int p2) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_override_recover_routing_table")
    public void recoverRoutingTable(android.app.Activity p0) {}
    public boolean registerAidsForService(android.content.ComponentName p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
    public void registerNfcEventCallback(java.util.concurrent.Executor p0, android.nfc.cardemulation.CardEmulation.NfcEventCallback p1) {}
    public boolean registerPollingLoopFilterForService(android.content.ComponentName p0, java.lang.String p1, boolean p2) { return false; }
    public boolean registerPollingLoopPatternFilterForService(android.content.ComponentName p0, java.lang.String p1, boolean p2) { return false; }
    public boolean removeAidsForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean removePollingLoopFilterForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean removePollingLoopPatternFilterForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    @android.annotation.FlaggedApi("android.nfc.enable_card_emulation_euicc")
    public int setDefaultNfcSubscriptionId(int p0) { return 0; }
    @android.annotation.NonNull
    public boolean setOffHostForService(android.content.ComponentName p0, java.lang.String p1) { return false; }
    public boolean setPreferredService(android.app.Activity p0, android.content.ComponentName p1) { return false; }
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.screen_state_attribute_toggle")
    public void setRequireDeviceScreenOnForService(android.content.ComponentName p0, boolean p1) {}
    @android.annotation.FlaggedApi("com.android.nfc.module.flags.screen_state_attribute_toggle")
    public void setRequireDeviceUnlockForService(android.content.ComponentName p0, boolean p1) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_set_service_enabled_for_category_other")
    public int setServiceEnabledForCategoryOther(android.content.ComponentName p0, boolean p1) { return 0; }
    public boolean setShouldDefaultToObserveModeForService(android.content.ComponentName p0, boolean p1) { return false; }
    public boolean supportsAidPrefixRegistration() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
    public void unregisterNfcEventCallback(android.nfc.cardemulation.CardEmulation.NfcEventCallback p0) {}
    @android.annotation.NonNull
    public boolean unsetOffHostForService(android.content.ComponentName p0) { return false; }
    public boolean unsetPreferredService(android.app.Activity p0) { return false; }

    @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
    public static interface NfcEventCallback {
        @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
        default public void onAidConflictOccurred(java.lang.String p0) {}
        @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
        default public void onAidNotRouted(java.lang.String p0) {}
        @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
        default public void onInternalErrorReported(int p0) {}
        @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
        default public void onNfcStateChanged(int p0) {}
        @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
        default public void onObserveModeStateChanged(boolean p0) {}
        @android.annotation.FlaggedApi("com.android.nfc.module.flags.event_listener_offhost_aid_selected")
        default public void onOffHostAidSelected(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
        default public void onPreferredServiceChanged(boolean p0) {}
        @android.annotation.FlaggedApi("android.nfc.nfc_event_listener")
        default public void onRemoteFieldChanged(boolean p0) {}
    }
}
