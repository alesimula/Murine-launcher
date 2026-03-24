package android.view.autofill;

public class AutofillFeatureFlags {
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_SMART_SUGGESTION_SUPPORTED_MODES = "smart_suggestion_supported_modes";
    public static final java.lang.String DEVICE_CONFIG_AUGMENTED_SERVICE_IDLE_UNBIND_TIMEOUT = "augmented_service_idle_unbind_timeout";
    public static final java.lang.String DEVICE_CONFIG_AUGMENTED_SERVICE_REQUEST_TIMEOUT = "augmented_service_request_timeout";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_COMPAT_MODE_ALLOWED_PACKAGES = "compat_mode_allowed_packages";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_DIALOG_ENABLED = "autofill_dialog_enabled";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_DIALOG_HINTS = "autofill_dialog_hints";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_CREDENTIAL_MANAGER_IGNORE_VIEWS = "autofill_credential_manager_ignore_views";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_CREDENTIAL_MANAGER_ENABLED = "autofill_credential_manager_enabled";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_CREDENTIAL_MANAGER_SUPPRESS_FILL_AND_SAVE_DIALOG = "autofill_credential_manager_suppress_fill_and_save_dialog";
    public static final java.lang.String DEVICE_CONFIG_PACKAGE_DENYLIST_FOR_UNIMPORTANT_VIEW = "package_deny_list_for_unimportant_view";
    public static final java.lang.String DEVICE_CONFIG_PACKAGE_AND_ACTIVITY_ALLOWLIST_FOR_TRIGGERING_FILL_REQUEST = "package_and_activity_allowlist_for_triggering_fill_request";
    public static final java.lang.String DEVICE_CONFIG_TRIGGER_FILL_REQUEST_ON_UNIMPORTANT_VIEW = "trigger_fill_request_on_unimportant_view";
    public static final java.lang.String DEVICE_CONFIG_TRIGGER_FILL_REQUEST_ON_FILTERED_IMPORTANT_VIEWS = "trigger_fill_request_on_filtered_important_views";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String DEVICE_CONFIG_NON_AUTOFILLABLE_IME_ACTION_IDS = "non_autofillable_ime_action_ids";
    public static final java.lang.String DEVICE_CONFIG_SHOULD_ENABLE_AUTOFILL_ON_ALL_VIEW_TYPES = "should_enable_autofill_on_all_view_types";
    public static final java.lang.String DEVICE_CONFIG_MULTILINE_FILTER_ENABLED = "multiline_filter_enabled";
    public static final java.lang.String DEVICE_CONFIG_INCLUDE_ALL_AUTOFILL_TYPE_NOT_NONE_VIEWS_IN_ASSIST_STRUCTURE = "include_all_autofill_type_not_none_views_in_assist_structure";
    public static final java.lang.String DEVICE_CONFIG_INCLUDE_ALL_VIEWS_IN_ASSIST_STRUCTURE = "include_all_views_in_assist_structure";
    public static final java.lang.String DEVICE_CONFIG_ALWAYS_INCLUDE_WEBVIEW_IN_ASSIST_STRUCTURE = "always_include_webview_in_assist_structure";
    public static final java.lang.String DEVICE_CONFIG_INCLUDE_INVISIBLE_VIEW_GROUP_IN_ASSIST_STRUCTURE = "include_invisible_view_group_in_assist_structure";
    public static final java.lang.String DEVICE_CONFIG_IGNORE_VIEW_STATE_RESET_TO_EMPTY = "ignore_view_state_reset_to_empty";
    public static final java.lang.String DEVICE_CONFIG_IGNORE_RELAYOUT_WHEN_AUTH_PENDING = "ignore_relayout_auth_pending";
    public static final java.lang.String DEVICE_CONFIG_FILL_FIELDS_FROM_CURRENT_SESSION_ONLY = "fill_fields_from_current_session_only";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_PCC_CLASSIFICATION_ENABLED = "pcc_classification_enabled";
    public static final java.lang.String DEVICE_CONFIG_PREFER_PROVIDER_OVER_PCC = "prefer_provider_over_pcc";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_PCC_FEATURE_PROVIDER_HINTS = "pcc_classification_hints";
    public static final java.lang.String DEVICE_CONFIG_PCC_USE_FALLBACK = "pcc_use_fallback";
    public static final java.lang.String DEVICE_CONFIG_MAX_INPUT_LENGTH_FOR_AUTOFILL = "max_input_length_for_autofill";
    public static final java.lang.String DEVICE_CONFIG_AUTOFILL_TOOLTIP_SHOW_UP_DELAY = "autofill_inline_tooltip_first_show_delay";
    public static final boolean DEFAULT_AUTOFILL_PCC_CLASSIFICATION_ENABLED = false;
    public static final int DEFAULT_MAX_INPUT_LENGTH_FOR_AUTOFILL = 3;
    public static boolean isFillDialogEnabled() { return false; }
    public static java.lang.String[] getFillDialogEnabledHints() { return null; }
    public static boolean isCredentialManagerEnabled() { return false; }
    public static boolean isFillAndSaveDialogDisabledForCredentialManager() { return false; }
    public static boolean isTriggerFillRequestOnUnimportantViewEnabled() { return false; }
    public static boolean isTriggerFillRequestOnFilteredImportantViewsEnabled() { return false; }
    public static boolean shouldEnableAutofillOnAllViewTypes() { return false; }
    public static java.util.Set<java.lang.String> getNonAutofillableImeActionIdSetFromFlag() { return null; }
    public static java.lang.String getDenylistStringFromFlag() { return null; }
    public static java.lang.String getAllowlistStringFromFlag() { return null; }
    public static boolean shouldIncludeAllViewsAutofillTypeNotNoneInAssistStructrue() { return false; }
    public static boolean shouldIncludeAllChildrenViewInAssistStructure() { return false; }
    public static boolean shouldAlwaysIncludeWebviewInAssistStructure() { return false; }
    public static boolean shouldIncludeInvisibleViewInAssistStructure() { return false; }
    public static boolean shouldIgnoreViewStateResetToEmpty() { return false; }
    public static boolean shouldIgnoreRelayoutWhenAuthPending() { return false; }
    public static boolean shouldFillFieldsFromCurrentSessionOnly() { return false; }
    public static boolean shouldEnableMultilineFilter() { return false; }
    public static boolean isAutofillPccClassificationEnabled() { return false; }
}
