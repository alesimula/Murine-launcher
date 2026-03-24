package android.telephony;

public class CarrierConfigManager {
    public static final java.lang.String EXTRA_SLOT_INDEX = "android.telephony.extra.SLOT_INDEX";
    public static final java.lang.String EXTRA_REBROADCAST_ON_UNLOCK = "android.telephony.extra.REBROADCAST_ON_UNLOCK";
    public static final java.lang.String EXTRA_SUBSCRIPTION_INDEX = "android.telephony.extra.SUBSCRIPTION_INDEX";
    public static final int SERVICE_CLASS_NONE = 0;
    public static final int SERVICE_CLASS_VOICE = 1;
    public static final int USSD_OVER_CS_PREFERRED = 0;
    public static final int USSD_OVER_IMS_PREFERRED = 1;
    public static final int USSD_OVER_CS_ONLY = 2;
    public static final int USSD_OVER_IMS_ONLY = 3;
    public static final int CARRIER_NR_AVAILABILITY_NSA = 1;
    public static final int CARRIER_NR_AVAILABILITY_SA = 2;
    public static final java.lang.String ACTION_CARRIER_CONFIG_CHANGED = "android.telephony.action.CARRIER_CONFIG_CHANGED";
    public static final java.lang.String KEY_CARRIER_CONFIG_VERSION_STRING = "carrier_config_version_string";
    @java.lang.Deprecated
    public static final java.lang.String KEY_CARRIER_VOLTE_PROVISIONED_BOOL = "carrier_volte_provisioned_bool";
    public static final java.lang.String KEY_DISABLE_SUPPLEMENTARY_SERVICES_IN_AIRPLANE_MODE_BOOL = "disable_supplementary_services_in_airplane_mode_bool";
    public static final java.lang.String KEY_CALL_FORWARDING_VISIBILITY_BOOL = "call_forwarding_visibility_bool";
    public static final java.lang.String KEY_CALL_FORWARDING_WHEN_UNREACHABLE_SUPPORTED_BOOL = "call_forwarding_when_unreachable_supported_bool";
    public static final java.lang.String KEY_CALL_FORWARDING_WHEN_UNANSWERED_SUPPORTED_BOOL = "call_forwarding_when_unanswered_supported_bool";
    public static final java.lang.String KEY_CALL_FORWARDING_WHEN_BUSY_SUPPORTED_BOOL = "call_forwarding_when_busy_supported_bool";
    public static final java.lang.String KEY_ADDITIONAL_SETTINGS_CALLER_ID_VISIBILITY_BOOL = "additional_settings_caller_id_visibility_bool";
    public static final java.lang.String KEY_ADDITIONAL_SETTINGS_CALL_WAITING_VISIBILITY_BOOL = "additional_settings_call_waiting_visibility_bool";
    public static final java.lang.String KEY_CALL_BARRING_VISIBILITY_BOOL = "call_barring_visibility_bool";
    public static final java.lang.String KEY_CALL_BARRING_SUPPORTS_PASSWORD_CHANGE_BOOL = "call_barring_supports_password_change_bool";
    public static final java.lang.String KEY_CALL_BARRING_SUPPORTS_DEACTIVATE_ALL_BOOL = "call_barring_supports_deactivate_all_bool";
    public static final java.lang.String KEY_CALL_BARRING_DEFAULT_SERVICE_CLASS_INT = "call_barring_default_service_class_int";
    public static final java.lang.String KEY_SUPPORT_SS_OVER_CDMA_BOOL = "support_ss_over_cdma_bool";
    public static final java.lang.String KEY_IGNORE_SIM_NETWORK_LOCKED_EVENTS_BOOL = "ignore_sim_network_locked_events_bool";
    public static final java.lang.String KEY_MDN_IS_ADDITIONAL_VOICEMAIL_NUMBER_BOOL = "mdn_is_additional_voicemail_number_bool";
    public static final java.lang.String KEY_SIM_NETWORK_UNLOCK_ALLOW_DISMISS_BOOL = "sim_network_unlock_allow_dismiss_bool";
    public static final java.lang.String KEY_SUPPORT_EMERGENCY_SMS_OVER_IMS_BOOL = "support_emergency_sms_over_ims_bool";
    public static final java.lang.String KEY_WORLD_PHONE_BOOL = "world_phone_bool";
    public static final java.lang.String KEY_REQUIRE_ENTITLEMENT_CHECKS_BOOL = "require_entitlement_checks_bool";
    public static final java.lang.String KEY_CARRIER_SUPPORTS_TETHERING_BOOL = "carrier_supports_tethering_bool";
    @java.lang.Deprecated
    public static final java.lang.String KEY_RESTART_RADIO_ON_PDP_FAIL_REGULAR_DEACTIVATION_BOOL = "restart_radio_on_pdp_fail_regular_deactivation_bool";
    public static final java.lang.String KEY_RADIO_RESTART_FAILURE_CAUSES_INT_ARRAY = "radio_restart_failure_causes_int_array";
    public static final java.lang.String KEY_ENABLE_DIALER_KEY_VIBRATION_BOOL = "enable_dialer_key_vibration_bool";
    public static final java.lang.String KEY_DTMF_TYPE_ENABLED_BOOL = "dtmf_type_enabled_bool";
    public static final java.lang.String KEY_AUTO_RETRY_ENABLED_BOOL = "auto_retry_enabled_bool";
    public static final java.lang.String KEY_ALLOW_LOCAL_DTMF_TONES_BOOL = "allow_local_dtmf_tones_bool";
    public static final java.lang.String KEY_PLAY_CALL_RECORDING_TONE_BOOL = "play_call_recording_tone_bool";
    public static final java.lang.String KEY_SMS_REQUIRES_DESTINATION_NUMBER_CONVERSION_BOOL = "sms_requires_destination_number_conversion_bool";
    public static final java.lang.String KEY_SHOW_ONSCREEN_DIAL_BUTTON_BOOL = "show_onscreen_dial_button_bool";
    public static final java.lang.String KEY_HAS_IN_CALL_NOISE_SUPPRESSION_BOOL = "has_in_call_noise_suppression_bool";
    public static final java.lang.String KEY_ALLOW_EMERGENCY_NUMBERS_IN_CALL_LOG_BOOL = "allow_emergency_numbers_in_call_log_bool";
    public static final java.lang.String KEY_UNLOGGABLE_NUMBERS_STRING_ARRAY = "unloggable_numbers_string_array";
    public static final java.lang.String KEY_VOICE_PRIVACY_DISABLE_UI_BOOL = "voice_privacy_disable_ui_bool";
    public static final java.lang.String KEY_HIDE_CARRIER_NETWORK_SETTINGS_BOOL = "hide_carrier_network_settings_bool";
    public static final java.lang.String KEY_ONLY_AUTO_SELECT_IN_HOME_NETWORK_BOOL = "only_auto_select_in_home_network";
    public static final java.lang.String KEY_SHOW_SINGLE_OPERATOR_ROW_IN_CHOOSE_NETWORK_SETTING_BOOL = "show_single_operator_row_in_choose_network_setting_bool";
    public static final java.lang.String KEY_SHOW_SPN_FOR_HOME_IN_CHOOSE_NETWORK_SETTING_BOOL = "show_spn_for_home_in_choose_network_setting_bool";
    public static final java.lang.String KEY_SIMPLIFIED_NETWORK_SETTINGS_BOOL = "simplified_network_settings_bool";
    public static final java.lang.String KEY_HIDE_SIM_LOCK_SETTINGS_BOOL = "hide_sim_lock_settings_bool";
    public static final java.lang.String KEY_APN_EXPAND_BOOL = "apn_expand_bool";
    public static final java.lang.String KEY_OPERATOR_SELECTION_EXPAND_BOOL = "operator_selection_expand_bool";
    public static final java.lang.String KEY_PREFER_2G_BOOL = "prefer_2g_bool";
    public static final java.lang.String KEY_4G_ONLY_BOOL = "4g_only_bool";
    public static final java.lang.String KEY_SHOW_CDMA_CHOICES_BOOL = "show_cdma_choices_bool";
    public static final java.lang.String KEY_USE_HFA_FOR_PROVISIONING_BOOL = "use_hfa_for_provisioning_bool";
    public static final java.lang.String KEY_USE_OTASP_FOR_PROVISIONING_BOOL = "use_otasp_for_provisioning_bool";
    public static final java.lang.String KEY_CARRIER_SETTINGS_ENABLE_BOOL = "carrier_settings_enable_bool";
    public static final java.lang.String KEY_ADDITIONAL_CALL_SETTING_BOOL = "additional_call_setting_bool";
    public static final java.lang.String KEY_SHOW_APN_SETTING_CDMA_BOOL = "show_apn_setting_cdma_bool";
    public static final java.lang.String KEY_SUPPORT_SWAP_AFTER_MERGE_BOOL = "support_swap_after_merge_bool";
    public static final java.lang.String KEY_EDITABLE_VOICEMAIL_NUMBER_SETTING_BOOL = "editable_voicemail_number_setting_bool";
    public static final java.lang.String KEY_EDITABLE_VOICEMAIL_NUMBER_BOOL = "editable_voicemail_number_bool";
    public static final java.lang.String KEY_VOICEMAIL_NOTIFICATION_PERSISTENT_BOOL = "voicemail_notification_persistent_bool";
    public static final java.lang.String KEY_SUPPORT_PAUSE_IMS_VIDEO_CALLS_BOOL = "support_pause_ims_video_calls_bool";
    public static final java.lang.String KEY_DISABLE_CDMA_ACTIVATION_CODE_BOOL = "disable_cdma_activation_code_bool";
    public static final java.lang.String KEY_ONLY_SINGLE_DC_ALLOWED_INT_ARRAY = "only_single_dc_allowed_int_array";
    public static final java.lang.String KEY_CAPABILITIES_EXEMPT_FROM_SINGLE_DC_CHECK_INT_ARRAY = "capabilities_exempt_from_single_dc_check_int_array";
    public static final java.lang.String KEY_GSM_ROAMING_NETWORKS_STRING_ARRAY = "gsm_roaming_networks_string_array";
    public static final java.lang.String KEY_GSM_NONROAMING_NETWORKS_STRING_ARRAY = "gsm_nonroaming_networks_string_array";
    public static final java.lang.String KEY_CONFIG_IMS_PACKAGE_OVERRIDE_STRING = "config_ims_package_override_string";
    public static final java.lang.String KEY_CONFIG_IMS_MMTEL_PACKAGE_OVERRIDE_STRING = "config_ims_mmtel_package_override_string";
    public static final java.lang.String KEY_CONFIG_IMS_RCS_PACKAGE_OVERRIDE_STRING = "config_ims_rcs_package_override_string";
    public static final java.lang.String KEY_CONFIG_PLANS_PACKAGE_OVERRIDE_STRING = "config_plans_package_override_string";
    public static final java.lang.String KEY_CDMA_ROAMING_NETWORKS_STRING_ARRAY = "cdma_roaming_networks_string_array";
    public static final java.lang.String KEY_CDMA_NONROAMING_NETWORKS_STRING_ARRAY = "cdma_nonroaming_networks_string_array";
    public static final java.lang.String KEY_FORCE_HOME_NETWORK_BOOL = "force_home_network_bool";
    public static final java.lang.String KEY_CARRIER_VOLTE_AVAILABLE_BOOL = "carrier_volte_available_bool";
    public static final java.lang.String KEY_CARRIER_VT_AVAILABLE_BOOL = "carrier_vt_available_bool";
    public static final java.lang.String KEY_CARRIER_USSD_METHOD_INT = "carrier_ussd_method_int";
    public static final java.lang.String KEY_VOLTE_5G_LIMITED_ALERT_DIALOG_BOOL = "volte_5g_limited_alert_dialog_bool";
    public static final java.lang.String KEY_NOTIFY_HANDOVER_VIDEO_FROM_WIFI_TO_LTE_BOOL = "notify_handover_video_from_wifi_to_lte_bool";
    public static final java.lang.String KEY_ALLOW_MERGING_RTT_CALLS_BOOL = "allow_merging_rtt_calls_bool";
    public static final java.lang.String KEY_NOTIFY_HANDOVER_VIDEO_FROM_LTE_TO_WIFI_BOOL = "notify_handover_video_from_lte_to_wifi_bool";
    public static final java.lang.String KEY_SUPPORT_DOWNGRADE_VT_TO_AUDIO_BOOL = "support_downgrade_vt_to_audio_bool";
    public static final java.lang.String KEY_DEFAULT_VM_NUMBER_STRING = "default_vm_number_string";
    public static final java.lang.String KEY_DEFAULT_VM_NUMBER_ROAMING_STRING = "default_vm_number_roaming_string";
    public static final java.lang.String KEY_DEFAULT_VM_NUMBER_ROAMING_AND_IMS_UNREGISTERED_STRING = "default_vm_number_roaming_and_ims_unregistered_string";
    public static final java.lang.String KEY_CONFIG_TELEPHONY_USE_OWN_NUMBER_FOR_VOICEMAIL_BOOL = "config_telephony_use_own_number_for_voicemail_bool";
    public static final java.lang.String KEY_IGNORE_DATA_ENABLED_CHANGED_FOR_VIDEO_CALLS = "ignore_data_enabled_changed_for_video_calls";
    public static final java.lang.String KEY_VILTE_DATA_IS_METERED_BOOL = "vilte_data_is_metered_bool";
    public static final java.lang.String KEY_CARRIER_WFC_IMS_AVAILABLE_BOOL = "carrier_wfc_ims_available_bool";
    public static final java.lang.String KEY_CARRIER_CROSS_SIM_IMS_AVAILABLE_BOOL = "carrier_cross_sim_ims_available_bool";
    public static final java.lang.String KEY_ENABLE_CROSS_SIM_CALLING_ON_OPPORTUNISTIC_DATA_BOOL = "enable_cross_sim_calling_on_opportunistic_data_bool";
    public static final java.lang.String KEY_DIAL_STRING_REPLACE_STRING_ARRAY = "dial_string_replace_string_array";
    public static final java.lang.String KEY_INTERNATIONAL_ROAMING_DIAL_STRING_REPLACE_STRING_ARRAY = "international_roaming_dial_string_replace_string_array";
    public static final java.lang.String KEY_CARRIER_WFC_SUPPORTS_WIFI_ONLY_BOOL = "carrier_wfc_supports_wifi_only_bool";
    public static final java.lang.String KEY_CARRIER_DEFAULT_WFC_IMS_MODE_INT = "carrier_default_wfc_ims_mode_int";
    public static final java.lang.String KEY_CARRIER_DEFAULT_WFC_IMS_ROAMING_MODE_INT = "carrier_default_wfc_ims_roaming_mode_int";
    public static final java.lang.String KEY_CARRIER_DEFAULT_WFC_IMS_ENABLED_BOOL = "carrier_default_wfc_ims_enabled_bool";
    public static final java.lang.String KEY_CARRIER_DEFAULT_WFC_IMS_ROAMING_ENABLED_BOOL = "carrier_default_wfc_ims_roaming_enabled_bool";
    public static final java.lang.String KEY_CARRIER_PROMOTE_WFC_ON_CALL_FAIL_BOOL = "carrier_promote_wfc_on_call_fail_bool";
    public static final java.lang.String KEY_CARRIER_RCS_PROVISIONING_REQUIRED_BOOL = "carrier_rcs_provisioning_required_bool";
    @java.lang.Deprecated
    public static final java.lang.String KEY_CARRIER_VOLTE_PROVISIONING_REQUIRED_BOOL = "carrier_volte_provisioning_required_bool";
    @java.lang.Deprecated
    public static final java.lang.String KEY_CARRIER_UT_PROVISIONING_REQUIRED_BOOL = "carrier_ut_provisioning_required_bool";
    public static final java.lang.String KEY_CARRIER_SUPPORTS_SS_OVER_UT_BOOL = "carrier_supports_ss_over_ut_bool";
    public static final java.lang.String KEY_CARRIER_VOLTE_OVERRIDE_WFC_PROVISIONING_BOOL = "carrier_volte_override_wfc_provisioning_bool";
    public static final java.lang.String KEY_CARRIER_DATA_SERVICE_WWAN_PACKAGE_OVERRIDE_STRING = "carrier_data_service_wwan_package_override_string";
    public static final java.lang.String KEY_CARRIER_DATA_SERVICE_WLAN_PACKAGE_OVERRIDE_STRING = "carrier_data_service_wlan_package_override_string";
    public static final java.lang.String KEY_CARRIER_DATA_SERVICE_WWAN_CLASS_OVERRIDE_STRING = "carrier_data_service_wwan_class_override_string";
    public static final java.lang.String KEY_CARRIER_DATA_SERVICE_WLAN_CLASS_OVERRIDE_STRING = "carrier_data_service_wlan_class_override_string";
    public static final java.lang.String KEY_CARRIER_VOLTE_TTY_SUPPORTED_BOOL = "carrier_volte_tty_supported_bool";
    public static final java.lang.String KEY_CARRIER_VOWIFI_TTY_SUPPORTED_BOOL = "carrier_vowifi_tty_supported_bool";
    public static final java.lang.String KEY_CARRIER_ALLOW_TURNOFF_IMS_BOOL = "carrier_allow_turnoff_ims_bool";
    public static final java.lang.String KEY_CARRIER_IMS_GBA_REQUIRED_BOOL = "carrier_ims_gba_required_bool";
    public static final java.lang.String KEY_CARRIER_INSTANT_LETTERING_AVAILABLE_BOOL = "carrier_instant_lettering_available_bool";
    public static final java.lang.String KEY_CARRIER_USE_IMS_FIRST_FOR_EMERGENCY_BOOL = "carrier_use_ims_first_for_emergency_bool";
    public static final java.lang.String KEY_USE_ONLY_DIALED_SIM_ECC_LIST_BOOL = "use_only_dialed_sim_ecc_list_bool";
    public static final java.lang.String KEY_CARRIER_INSTANT_LETTERING_INVALID_CHARS_STRING = "carrier_instant_lettering_invalid_chars_string";
    public static final java.lang.String KEY_CARRIER_INSTANT_LETTERING_ESCAPED_CHARS_STRING = "carrier_instant_lettering_escaped_chars_string";
    public static final java.lang.String KEY_CARRIER_INSTANT_LETTERING_ENCODING_STRING = "carrier_instant_lettering_encoding_string";
    public static final java.lang.String KEY_CARRIER_INSTANT_LETTERING_LENGTH_LIMIT_INT = "carrier_instant_lettering_length_limit_int";
    public static final java.lang.String KEY_VOLTE_REPLACEMENT_RAT_INT = "volte_replacement_rat_int";
    public static final java.lang.String KEY_DEFAULT_SIM_CALL_MANAGER_STRING = "default_sim_call_manager_string";
    @java.lang.Deprecated
    public static final java.lang.String KEY_CARRIER_FORCE_DISABLE_ETWS_CMAS_TEST_BOOL = "carrier_force_disable_etws_cmas_test_bool";
    @java.lang.Deprecated
    public static final java.lang.String KEY_ALWAYS_SHOW_EMERGENCY_ALERT_ONOFF_BOOL = "always_show_emergency_alert_onoff_bool";
    public static final java.lang.String KEY_DEFAULT_MTU_INT = "default_mtu_int";
    public static final java.lang.String KEY_CARRIER_DATA_CALL_RETRY_CONFIG_STRINGS = "carrier_data_call_retry_config_strings";
    public static final java.lang.String KEY_CARRIER_DATA_CALL_APN_DELAY_DEFAULT_LONG = "carrier_data_call_apn_delay_default_long";
    public static final java.lang.String KEY_CARRIER_DATA_CALL_APN_DELAY_FASTER_LONG = "carrier_data_call_apn_delay_faster_long";
    public static final java.lang.String KEY_CARRIER_DATA_CALL_APN_RETRY_AFTER_DISCONNECT_LONG = "carrier_data_call_apn_retry_after_disconnect_long";
    public static final java.lang.String KEY_CARRIER_DATA_CALL_RETRY_NETWORK_REQUESTED_MAX_COUNT_INT = "carrier_data_call_retry_network_requested_max_count_int";
    public static final java.lang.String KEY_CARRIER_DATA_CALL_PERMANENT_FAILURE_STRINGS = "carrier_data_call_permanent_failure_strings";
    public static final java.lang.String KEY_CARRIER_METERED_APN_TYPES_STRINGS = "carrier_metered_apn_types_strings";
    public static final java.lang.String KEY_CARRIER_METERED_ROAMING_APN_TYPES_STRINGS = "carrier_metered_roaming_apn_types_strings";
    public static final java.lang.String KEY_CARRIER_WWAN_DISALLOWED_APN_TYPES_STRING_ARRAY = "carrier_wwan_disallowed_apn_types_string_array";
    public static final java.lang.String KEY_CARRIER_WLAN_DISALLOWED_APN_TYPES_STRING_ARRAY = "carrier_wlan_disallowed_apn_types_string_array";
    public static final java.lang.String KEY_CARRIER_ERI_FILE_NAME_STRING = "carrier_eri_file_name_string";
    public static final java.lang.String KEY_VVM_DESTINATION_NUMBER_STRING = "vvm_destination_number_string";
    public static final java.lang.String KEY_VVM_PORT_NUMBER_INT = "vvm_port_number_int";
    public static final java.lang.String KEY_VVM_TYPE_STRING = "vvm_type_string";
    public static final java.lang.String KEY_VVM_CELLULAR_DATA_REQUIRED_BOOL = "vvm_cellular_data_required_bool";
    public static final java.lang.String KEY_VVM_CLIENT_PREFIX_STRING = "vvm_client_prefix_string";
    public static final java.lang.String KEY_VVM_SSL_ENABLED_BOOL = "vvm_ssl_enabled_bool";
    public static final java.lang.String KEY_VVM_DISABLED_CAPABILITIES_STRING_ARRAY = "vvm_disabled_capabilities_string_array";
    public static final java.lang.String KEY_VVM_LEGACY_MODE_ENABLED_BOOL = "vvm_legacy_mode_enabled_bool";
    public static final java.lang.String KEY_VVM_PREFETCH_BOOL = "vvm_prefetch_bool";
    @java.lang.Deprecated
    public static final java.lang.String KEY_CARRIER_VVM_PACKAGE_NAME_STRING = "carrier_vvm_package_name_string";
    public static final java.lang.String KEY_CARRIER_VVM_PACKAGE_NAME_STRING_ARRAY = "carrier_vvm_package_name_string_array";
    public static final java.lang.String KEY_SHOW_ICCID_IN_SIM_STATUS_BOOL = "show_iccid_in_sim_status_bool";
    public static final java.lang.String KEY_SHOW_SIGNAL_STRENGTH_IN_SIM_STATUS_BOOL = "show_signal_strength_in_sim_status_bool";
    public static final java.lang.String KEY_INFLATE_SIGNAL_STRENGTH_BOOL = "inflate_signal_strength_bool";
    public static final java.lang.String KEY_CI_ACTION_ON_SYS_UPDATE_BOOL = "ci_action_on_sys_update_bool";
    public static final java.lang.String KEY_CI_ACTION_ON_SYS_UPDATE_INTENT_STRING = "ci_action_on_sys_update_intent_string";
    public static final java.lang.String KEY_CI_ACTION_ON_SYS_UPDATE_EXTRA_STRING = "ci_action_on_sys_update_extra_string";
    public static final java.lang.String KEY_CI_ACTION_ON_SYS_UPDATE_EXTRA_VAL_STRING = "ci_action_on_sys_update_extra_val_string";
    public static final java.lang.String KEY_GSM_DTMF_TONE_DELAY_INT = "gsm_dtmf_tone_delay_int";
    public static final java.lang.String KEY_IMS_DTMF_TONE_DELAY_INT = "ims_dtmf_tone_delay_int";
    public static final java.lang.String KEY_CDMA_DTMF_TONE_DELAY_INT = "cdma_dtmf_tone_delay_int";
    public static final java.lang.String KEY_CALL_FORWARDING_MAP_NON_NUMBER_TO_VOICEMAIL_BOOL = "call_forwarding_map_non_number_to_voicemail_bool";
    public static final java.lang.String KEY_IGNORE_RTT_MODE_SETTING_BOOL = "ignore_rtt_mode_setting_bool";
    public static final java.lang.String KEY_SUPPORT_ADHOC_CONFERENCE_CALLS_BOOL = "support_adhoc_conference_calls_bool";
    public static final java.lang.String KEY_SUPPORT_ADD_CONFERENCE_PARTICIPANTS_BOOL = "support_add_conference_participants_bool";
    public static final java.lang.String KEY_SUPPORT_CONFERENCE_CALL_BOOL = "support_conference_call_bool";
    public static final java.lang.String KEY_IS_IMS_CONFERENCE_SIZE_ENFORCED_BOOL = "is_ims_conference_size_enforced_bool";
    public static final java.lang.String KEY_IMS_CONFERENCE_SIZE_LIMIT_INT = "ims_conference_size_limit_int";
    public static final java.lang.String KEY_SUPPORT_MANAGE_IMS_CONFERENCE_CALL_BOOL = "support_manage_ims_conference_call_bool";
    public static final java.lang.String KEY_SUPPORT_IMS_CONFERENCE_EVENT_PACKAGE_BOOL = "support_ims_conference_event_package_bool";
    public static final java.lang.String KEY_SUPPORT_IMS_CONFERENCE_EVENT_PACKAGE_ON_PEER_BOOL = "support_ims_conference_event_package_on_peer_bool";
    public static final java.lang.String KEY_SUPPORTS_DEVICE_TO_DEVICE_COMMUNICATION_USING_RTP_BOOL = "supports_device_to_device_communication_using_rtp_bool";
    public static final java.lang.String KEY_SUPPORTS_SDP_NEGOTIATION_OF_D2D_RTP_HEADER_EXTENSIONS_BOOL = "supports_sdp_negotiation_of_d2d_rtp_header_extensions_bool";
    public static final java.lang.String KEY_SUPPORTS_DEVICE_TO_DEVICE_COMMUNICATION_USING_DTMF_BOOL = "supports_device_to_device_communication_using_dtmf_bool";
    public static final java.lang.String KEY_DISPLAY_HD_AUDIO_PROPERTY_BOOL = "display_hd_audio_property_bool";
    public static final java.lang.String KEY_SUPPORT_IMS_CONFERENCE_CALL_BOOL = "support_ims_conference_call_bool";
    public static final java.lang.String KEY_LOCAL_DISCONNECT_EMPTY_IMS_CONFERENCE_BOOL = "local_disconnect_empty_ims_conference_bool";
    public static final java.lang.String KEY_SUPPORT_VIDEO_CONFERENCE_CALL_BOOL = "support_video_conference_call_bool";
    public static final java.lang.String KEY_EDITABLE_ENHANCED_4G_LTE_BOOL = "editable_enhanced_4g_lte_bool";
    public static final java.lang.String KEY_HIDE_ENHANCED_4G_LTE_BOOL = "hide_enhanced_4g_lte_bool";
    public static final java.lang.String KEY_ENHANCED_4G_LTE_ON_BY_DEFAULT_BOOL = "enhanced_4g_lte_on_by_default_bool";
    public static final java.lang.String KEY_HIDE_IMS_APN_BOOL = "hide_ims_apn_bool";
    public static final java.lang.String KEY_HIDE_PREFERRED_NETWORK_TYPE_BOOL = "hide_preferred_network_type_bool";
    public static final java.lang.String KEY_ENABLE_APPS_STRING_ARRAY = "enable_apps_string_array";
    public static final java.lang.String KEY_EDITABLE_WFC_MODE_BOOL = "editable_wfc_mode_bool";
    public static final java.lang.String KEY_CONFIG_WIFI_DISABLE_IN_ECBM = "config_wifi_disable_in_ecbm";
    public static final java.lang.String KEY_WFC_OPERATOR_ERROR_CODES_STRING_ARRAY = "wfc_operator_error_codes_string_array";
    public static final java.lang.String KEY_WFC_SPN_FORMAT_IDX_INT = "wfc_spn_format_idx_int";
    public static final java.lang.String KEY_WFC_DATA_SPN_FORMAT_IDX_INT = "wfc_data_spn_format_idx_int";
    public static final java.lang.String KEY_WFC_FLIGHT_MODE_SPN_FORMAT_IDX_INT = "wfc_flight_mode_spn_format_idx_int";
    public static final java.lang.String KEY_WFC_SPN_USE_ROOT_LOCALE = "wfc_spn_use_root_locale";
    public static final java.lang.String KEY_WFC_EMERGENCY_ADDRESS_CARRIER_APP_STRING = "wfc_emergency_address_carrier_app_string";
    public static final java.lang.String KEY_CARRIER_NAME_OVERRIDE_BOOL = "carrier_name_override_bool";
    public static final java.lang.String KEY_CARRIER_NAME_STRING = "carrier_name_string";
    public static final java.lang.String KEY_WFC_CARRIER_NAME_OVERRIDE_BY_PNN_BOOL = "wfc_carrier_name_override_by_pnn_bool";
    public static final int CROSS_SIM_SPN_FORMAT_CARRIER_NAME_ONLY = 0;
    public static final int CROSS_SIM_SPN_FORMAT_CARRIER_NAME_WITH_BRANDING = 1;
    public static final java.lang.String KEY_CROSS_SIM_SPN_FORMAT_INT = "cross_sim_spn_format_int";
    public static final java.lang.String KEY_SPN_DISPLAY_CONDITION_OVERRIDE_INT = "spn_display_condition_override_int";
    public static final java.lang.String KEY_SPDI_OVERRIDE_STRING_ARRAY = "spdi_override_string_array";
    public static final java.lang.String KEY_EHPLMN_OVERRIDE_STRING_ARRAY = "ehplmn_override_string_array";
    public static final java.lang.String KEY_PNN_OVERRIDE_STRING_ARRAY = "pnn_override_string_array";
    public static final java.lang.String KEY_OPL_OVERRIDE_STRING_ARRAY = "opl_override_opl_string_array";
    public static final java.lang.String KEY_ALLOW_ERI_BOOL = "allow_cdma_eri_bool";
    public static final java.lang.String KEY_ENABLE_CARRIER_DISPLAY_NAME_RESOLVER_BOOL = "enable_carrier_display_name_resolver_bool";
    public static final java.lang.String KEY_SIM_COUNTRY_ISO_OVERRIDE_STRING = "sim_country_iso_override_string";
    public static final java.lang.String KEY_CARRIER_CALL_SCREENING_APP_STRING = "call_screening_app";
    public static final java.lang.String KEY_CDMA_HOME_REGISTERED_PLMN_NAME_OVERRIDE_BOOL = "cdma_home_registered_plmn_name_override_bool";
    public static final java.lang.String KEY_CDMA_HOME_REGISTERED_PLMN_NAME_STRING = "cdma_home_registered_plmn_name_string";
    public static final java.lang.String KEY_CSP_ENABLED_BOOL = "csp_enabled_bool";
    public static final java.lang.String KEY_ALLOW_ADDING_APNS_BOOL = "allow_adding_apns_bool";
    public static final java.lang.String KEY_READ_ONLY_APN_TYPES_STRING_ARRAY = "read_only_apn_types_string_array";
    public static final java.lang.String KEY_READ_ONLY_APN_FIELDS_STRING_ARRAY = "read_only_apn_fields_string_array";
    public static final java.lang.String KEY_APN_SETTINGS_DEFAULT_APN_TYPES_STRING_ARRAY = "apn_settings_default_apn_types_string_array";
    public static final java.lang.String KEY_BROADCAST_EMERGENCY_CALL_STATE_CHANGES_BOOL = "broadcast_emergency_call_state_changes_bool";
    public static final java.lang.String KEY_STK_DISABLE_LAUNCH_BROWSER_BOOL = "stk_disable_launch_browser_bool";
    public static final java.lang.String KEY_HIDE_DIGITS_HELPER_TEXT_ON_STK_INPUT_SCREEN_BOOL = "hide_digits_helper_text_on_stk_input_screen_bool";
    public static final java.lang.String KEY_ALWAYS_SHOW_DATA_RAT_ICON_BOOL = "always_show_data_rat_icon_bool";
    public static final java.lang.String KEY_SHOW_4G_FOR_LTE_DATA_ICON_BOOL = "show_4g_for_lte_data_icon_bool";
    public static final java.lang.String KEY_SHOW_4GLTE_FOR_LTE_DATA_ICON_BOOL = "show_4glte_for_lte_data_icon_bool";
    public static final java.lang.String KEY_SHOW_4G_FOR_3G_DATA_ICON_BOOL = "show_4g_for_3g_data_icon_bool";
    public static final java.lang.String KEY_HIDE_LTE_PLUS_DATA_ICON_BOOL = "hide_lte_plus_data_icon_bool";
    public static final java.lang.String KEY_LTE_PLUS_THRESHOLD_BANDWIDTH_KHZ_INT = "lte_plus_threshold_bandwidth_khz_int";
    public static final java.lang.String KEY_NR_ADVANCED_THRESHOLD_BANDWIDTH_KHZ_INT = "nr_advanced_threshold_bandwidth_khz_int";
    public static final java.lang.String KEY_INCLUDE_LTE_FOR_NR_ADVANCED_THRESHOLD_BANDWIDTH_BOOL = "include_lte_for_nr_advanced_threshold_bandwidth_bool";
    public static final java.lang.String KEY_SHOW_OPERATOR_NAME_IN_STATUSBAR_BOOL = "show_operator_name_in_statusbar_bool";
    public static final java.lang.String KEY_OPERATOR_NAME_FILTER_PATTERN_STRING = "operator_name_filter_pattern_string";
    public static final java.lang.String KEY_SHOW_CARRIER_DATA_ICON_PATTERN_STRING = "show_carrier_data_icon_pattern_string";
    public static final java.lang.String KEY_SHOW_PRECISE_FAILED_CAUSE_BOOL = "show_precise_failed_cause_bool";
    public static final java.lang.String KEY_CARRIER_NR_AVAILABILITIES_INT_ARRAY = "carrier_nr_availabilities_int_array";
    public static final java.lang.String KEY_LTE_ENABLED_BOOL = "lte_enabled_bool";
    public static final java.lang.String KEY_SUPPORT_TDSCDMA_BOOL = "support_tdscdma_bool";
    public static final java.lang.String KEY_SUPPORT_TDSCDMA_ROAMING_NETWORKS_STRING_ARRAY = "support_tdscdma_roaming_networks_string_array";
    public static final java.lang.String KEY_WORLD_MODE_ENABLED_BOOL = "world_mode_enabled_bool";
    public static final java.lang.String KEY_CARRIER_SETTINGS_ACTIVITY_COMPONENT_NAME_STRING = "carrier_settings_activity_component_name_string";
    public static final java.lang.String KEY_MMS_ALIAS_ENABLED_BOOL = "aliasEnabled";
    public static final java.lang.String KEY_MMS_ALLOW_ATTACH_AUDIO_BOOL = "allowAttachAudio";
    public static final java.lang.String KEY_MMS_APPEND_TRANSACTION_ID_BOOL = "enabledTransID";
    public static final java.lang.String KEY_MMS_GROUP_MMS_ENABLED_BOOL = "enableGroupMms";
    public static final java.lang.String KEY_MMS_MMS_DELIVERY_REPORT_ENABLED_BOOL = "enableMMSDeliveryReports";
    public static final java.lang.String KEY_MMS_MMS_ENABLED_BOOL = "enabledMMS";
    public static final java.lang.String KEY_MMS_MMS_READ_REPORT_ENABLED_BOOL = "enableMMSReadReports";
    public static final java.lang.String KEY_MMS_MULTIPART_SMS_ENABLED_BOOL = "enableMultipartSMS";
    public static final java.lang.String KEY_MMS_NOTIFY_WAP_MMSC_ENABLED_BOOL = "enabledNotifyWapMMSC";
    public static final java.lang.String KEY_MMS_SEND_MULTIPART_SMS_AS_SEPARATE_MESSAGES_BOOL = "sendMultipartSmsAsSeparateMessages";
    public static final java.lang.String KEY_MMS_SHOW_CELL_BROADCAST_APP_LINKS_BOOL = "config_cellBroadcastAppLinks";
    public static final java.lang.String KEY_MMS_SMS_DELIVERY_REPORT_ENABLED_BOOL = "enableSMSDeliveryReports";
    public static final java.lang.String KEY_MMS_SUPPORT_HTTP_CHARSET_HEADER_BOOL = "supportHttpCharsetHeader";
    public static final java.lang.String KEY_MMS_SUPPORT_MMS_CONTENT_DISPOSITION_BOOL = "supportMmsContentDisposition";
    public static final java.lang.String KEY_MMS_ALIAS_MAX_CHARS_INT = "aliasMaxChars";
    public static final java.lang.String KEY_MMS_ALIAS_MIN_CHARS_INT = "aliasMinChars";
    public static final java.lang.String KEY_MMS_HTTP_SOCKET_TIMEOUT_INT = "httpSocketTimeout";
    public static final java.lang.String KEY_MMS_MAX_IMAGE_HEIGHT_INT = "maxImageHeight";
    public static final java.lang.String KEY_MMS_MAX_IMAGE_WIDTH_INT = "maxImageWidth";
    public static final java.lang.String KEY_MMS_MAX_MESSAGE_SIZE_INT = "maxMessageSize";
    public static final java.lang.String KEY_MMS_MESSAGE_TEXT_MAX_SIZE_INT = "maxMessageTextSize";
    public static final java.lang.String KEY_MMS_RECIPIENT_LIMIT_INT = "recipientLimit";
    public static final java.lang.String KEY_MMS_SMS_TO_MMS_TEXT_LENGTH_THRESHOLD_INT = "smsToMmsTextLengthThreshold";
    public static final java.lang.String KEY_MMS_SMS_TO_MMS_TEXT_THRESHOLD_INT = "smsToMmsTextThreshold";
    public static final java.lang.String KEY_MMS_SUBJECT_MAX_LENGTH_INT = "maxSubjectLength";
    public static final java.lang.String KEY_MMS_EMAIL_GATEWAY_NUMBER_STRING = "emailGatewayNumber";
    public static final java.lang.String KEY_MMS_HTTP_PARAMS_STRING = "httpParams";
    public static final java.lang.String KEY_MMS_NAI_SUFFIX_STRING = "naiSuffix";
    public static final java.lang.String KEY_MMS_UA_PROF_TAG_NAME_STRING = "uaProfTagName";
    public static final java.lang.String KEY_MMS_UA_PROF_URL_STRING = "uaProfUrl";
    public static final java.lang.String KEY_MMS_USER_AGENT_STRING = "userAgent";
    public static final java.lang.String KEY_MMS_CLOSE_CONNECTION_BOOL = "mmsCloseConnection";
    @android.annotation.SystemApi
    public static final java.lang.String KEY_CARRIER_SETUP_APP_STRING = "carrier_setup_app_string";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String KEY_CARRIER_DEFAULT_ACTIONS_ON_REDIRECTION_STRING_ARRAY = "carrier_default_actions_on_redirection_string_array";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String KEY_CARRIER_DEFAULT_ACTIONS_ON_DCFAILURE_STRING_ARRAY = "carrier_default_actions_on_dcfailure_string_array";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String KEY_CARRIER_DEFAULT_ACTIONS_ON_RESET = "carrier_default_actions_on_reset_string_array";
    @android.annotation.SuppressLint("IntentName")
    public static final java.lang.String KEY_CARRIER_DEFAULT_ACTIONS_ON_DEFAULT_NETWORK_AVAILABLE = "carrier_default_actions_on_default_network_available_string_array";
    public static final java.lang.String KEY_CARRIER_DEFAULT_REDIRECTION_URL_STRING_ARRAY = "carrier_default_redirection_url_string_array";
    public static final java.lang.String KEY_CARRIER_APP_WAKE_SIGNAL_CONFIG_STRING_ARRAY = "carrier_app_wake_signal_config";
    public static final java.lang.String KEY_CARRIER_APP_NO_WAKE_SIGNAL_CONFIG_STRING_ARRAY = "carrier_app_no_wake_signal_config";
    public static final java.lang.String KEY_CARRIER_APP_REQUIRED_DURING_SIM_SETUP_BOOL = "carrier_app_required_during_setup_bool";
    public static final java.lang.String KEY_CARRIER_DEFAULT_DATA_ROAMING_ENABLED_BOOL = "carrier_default_data_roaming_enabled_bool";
    public static final java.lang.String KEY_ALLOW_NON_EMERGENCY_CALLS_IN_ECM_BOOL = "allow_non_emergency_calls_in_ecm_bool";
    public static final java.lang.String KEY_EMERGENCY_SMS_MODE_TIMER_MS_INT = "emergency_sms_mode_timer_ms_int";
    public static final java.lang.String KEY_ALLOW_EMERGENCY_VIDEO_CALLS_BOOL = "allow_emergency_video_calls_bool";
    public static final java.lang.String KEY_ALLOW_HOLD_CALL_DURING_EMERGENCY_BOOL = "allow_hold_call_during_emergency_bool";
    @java.lang.Deprecated
    public static final java.lang.String KEY_USE_RCS_PRESENCE_BOOL = "use_rcs_presence_bool";
    public static final java.lang.String KEY_USE_RCS_SIP_OPTIONS_BOOL = "use_rcs_sip_options_bool";
    public static final java.lang.String KEY_DURATION_BLOCKING_DISABLED_AFTER_EMERGENCY_INT = "duration_blocking_disabled_after_emergency_int";
    public static final java.lang.String KEY_SUPPORT_ENHANCED_CALL_BLOCKING_BOOL = "support_enhanced_call_blocking_bool";
    public static final java.lang.String KEY_CDMA_3WAYCALL_FLASH_DELAY_INT = "cdma_3waycall_flash_delay_int";
    public static final java.lang.String KEY_CDMA_ROAMING_MODE_INT = "cdma_roaming_mode_int";
    @android.annotation.SystemApi
    public static final java.lang.String KEY_SUPPORT_CDMA_1X_VOICE_CALLS_BOOL = "support_cdma_1x_voice_calls_bool";
    public static final java.lang.String KEY_SUPPORT_DIRECT_FDN_DIALING_BOOL = "support_direct_fdn_dialing_bool";
    public static final java.lang.String KEY_FDN_NUMBER_LENGTH_LIMIT_INT = "fdn_number_length_limit_int";
    public static final java.lang.String KEY_FORCE_IMEI_BOOL = "force_imei_bool";
    public static final java.lang.String KEY_RATCHET_RAT_FAMILIES = "ratchet_rat_families";
    public static final java.lang.String KEY_TREAT_DOWNGRADED_VIDEO_CALLS_AS_VIDEO_CALLS_BOOL = "treat_downgraded_video_calls_as_video_calls_bool";
    public static final java.lang.String KEY_DROP_VIDEO_CALL_WHEN_ANSWERING_AUDIO_CALL_BOOL = "drop_video_call_when_answering_audio_call_bool";
    public static final java.lang.String KEY_ALLOW_MERGE_WIFI_CALLS_WHEN_VOWIFI_OFF_BOOL = "allow_merge_wifi_calls_when_vowifi_off_bool";
    public static final java.lang.String KEY_ALLOW_HOLD_IN_IMS_CALL_BOOL = "allow_hold_in_ims_call";
    public static final java.lang.String KEY_CARRIER_ALLOW_DEFLECT_IMS_CALL_BOOL = "carrier_allow_deflect_ims_call_bool";
    public static final java.lang.String KEY_CARRIER_ALLOW_TRANSFER_IMS_CALL_BOOL = "carrier_allow_transfer_ims_call_bool";
    public static final java.lang.String KEY_ALWAYS_PLAY_REMOTE_HOLD_TONE_BOOL = "always_play_remote_hold_tone_bool";
    public static final java.lang.String KEY_AUTO_RETRY_FAILED_WIFI_EMERGENCY_CALL = "auto_retry_failed_wifi_emergency_call";
    public static final java.lang.String KEY_ALLOW_ADD_CALL_DURING_VIDEO_CALL_BOOL = "allow_add_call_during_video_call";
    public static final java.lang.String KEY_ALLOW_HOLD_VIDEO_CALL_BOOL = "allow_hold_video_call_bool";
    public static final java.lang.String KEY_WIFI_CALLS_CAN_BE_HD_AUDIO = "wifi_calls_can_be_hd_audio";
    public static final java.lang.String KEY_VIDEO_CALLS_CAN_BE_HD_AUDIO = "video_calls_can_be_hd_audio";
    public static final java.lang.String KEY_GSM_CDMA_CALLS_CAN_BE_HD_AUDIO = "gsm_cdma_calls_can_be_hd_audio";
    public static final java.lang.String KEY_ALLOW_VIDEO_CALLING_FALLBACK_BOOL = "allow_video_calling_fallback_bool";
    public static final java.lang.String KEY_IMS_REASONINFO_MAPPING_STRING_ARRAY = "ims_reasoninfo_mapping_string_array";
    @java.lang.Deprecated
    public static final java.lang.String KEY_ENHANCED_4G_LTE_TITLE_VARIANT_BOOL = "enhanced_4g_lte_title_variant_bool";
    public static final java.lang.String KEY_ENHANCED_4G_LTE_TITLE_VARIANT_INT = "enhanced_4g_lte_title_variant_int";
    public static final java.lang.String KEY_NOTIFY_VT_HANDOVER_TO_WIFI_FAILURE_BOOL = "notify_vt_handover_to_wifi_failure_bool";
    public static final java.lang.String KEY_FILTERED_CNAP_NAMES_STRING_ARRAY = "filtered_cnap_names_string_array";
    public static final java.lang.String KEY_RCS_CONFIG_SERVER_URL_STRING = "rcs_config_server_url_string";
    public static final java.lang.String KEY_EDITABLE_WFC_ROAMING_MODE_BOOL = "editable_wfc_roaming_mode_bool";
    public static final java.lang.String KEY_SHOW_BLOCKING_PAY_PHONE_OPTION_BOOL = "show_blocking_pay_phone_option_bool";
    public static final java.lang.String KEY_USE_WFC_HOME_NETWORK_MODE_IN_ROAMING_NETWORK_BOOL = "use_wfc_home_network_mode_in_roaming_network_bool";
    public static final java.lang.String KEY_ALLOW_METERED_NETWORK_FOR_CERT_DOWNLOAD_BOOL = "allow_metered_network_for_cert_download_bool";
    public static final java.lang.String KEY_PREF_NETWORK_NOTIFICATION_DELAY_INT = "network_notification_delay_int";
    public static final java.lang.String KEY_EMERGENCY_NOTIFICATION_DELAY_INT = "emergency_notification_delay_int";
    public static final java.lang.String KEY_ALLOW_USSD_REQUESTS_VIA_TELEPHONY_MANAGER_BOOL = "allow_ussd_requests_via_telephony_manager_bool";
    public static final java.lang.String KEY_SUPPORT_3GPP_CALL_FORWARDING_WHILE_ROAMING_BOOL = "support_3gpp_call_forwarding_while_roaming_bool";
    public static final java.lang.String KEY_DISPLAY_VOICEMAIL_NUMBER_AS_DEFAULT_CALL_FORWARDING_NUMBER_BOOL = "display_voicemail_number_as_default_call_forwarding_number";
    public static final java.lang.String KEY_NOTIFY_INTERNATIONAL_CALL_ON_WFC_BOOL = "notify_international_call_on_wfc_bool";
    public static final java.lang.String KEY_HIDE_PRESET_APN_DETAILS_BOOL = "hide_preset_apn_details_bool";
    public static final java.lang.String KEY_SHOW_VIDEO_CALL_CHARGES_ALERT_DIALOG_BOOL = "show_video_call_charges_alert_dialog_bool";
    public static final java.lang.String KEY_CALL_FORWARDING_BLOCKS_WHILE_ROAMING_STRING_ARRAY = "call_forwarding_blocks_while_roaming_string_array";
    public static final java.lang.String KEY_SUPPORT_IMS_CALL_FORWARDING_WHILE_ROAMING_BOOL = "support_ims_call_forwarding_while_roaming_bool";
    public static final java.lang.String KEY_MONTHLY_DATA_CYCLE_DAY_INT = "monthly_data_cycle_day_int";
    public static final int DATA_CYCLE_USE_PLATFORM_DEFAULT = -1;
    public static final int DATA_CYCLE_THRESHOLD_DISABLED = -2;
    public static final java.lang.String KEY_DATA_WARNING_THRESHOLD_BYTES_LONG = "data_warning_threshold_bytes_long";
    public static final java.lang.String KEY_DATA_WARNING_NOTIFICATION_BOOL = "data_warning_notification_bool";
    public static final java.lang.String KEY_LIMITED_SIM_FUNCTION_NOTIFICATION_FOR_DSDS_BOOL = "limited_sim_function_notification_for_dsds_bool";
    public static final java.lang.String KEY_DATA_LIMIT_THRESHOLD_BYTES_LONG = "data_limit_threshold_bytes_long";
    public static final java.lang.String KEY_DATA_LIMIT_NOTIFICATION_BOOL = "data_limit_notification_bool";
    public static final java.lang.String KEY_DATA_RAPID_NOTIFICATION_BOOL = "data_rapid_notification_bool";
    public static final java.lang.String KEY_LTE_EARFCNS_RSRP_BOOST_INT = "lte_earfcns_rsrp_boost_int";
    public static final java.lang.String KEY_BOOSTED_LTE_EARFCNS_STRING_ARRAY = "boosted_lte_earfcns_string_array";
    public static final java.lang.String KEY_NRARFCNS_RSRP_BOOST_INT_ARRAY = "nrarfcns_rsrp_boost_int_array";
    public static final java.lang.String KEY_BOOSTED_NRARFCNS_STRING_ARRAY = "boosted_nrarfcns_string_array";
    @java.lang.Deprecated
    public static final java.lang.String KEY_USE_ONLY_RSRP_FOR_LTE_SIGNAL_BAR_BOOL = "use_only_rsrp_for_lte_signal_bar_bool";
    public static final java.lang.String KEY_PARAMETERS_USED_FOR_LTE_SIGNAL_BAR_INT = "parameters_used_for_lte_signal_bar_int";
    public static final java.lang.String KEY_5G_NR_SSRSRP_THRESHOLDS_INT_ARRAY = "5g_nr_ssrsrp_thresholds_int_array";
    public static final java.lang.String KEY_5G_NR_SSRSRQ_THRESHOLDS_INT_ARRAY = "5g_nr_ssrsrq_thresholds_int_array";
    public static final java.lang.String KEY_5G_NR_SSSINR_THRESHOLDS_INT_ARRAY = "5g_nr_sssinr_thresholds_int_array";
    public static final java.lang.String KEY_PARAMETERS_USE_FOR_5G_NR_SIGNAL_BAR_INT = "parameters_use_for_5g_nr_signal_bar_int";
    public static final java.lang.String KEY_SIGNAL_STRENGTH_NR_NSA_USE_LTE_AS_PRIMARY_BOOL = "signal_strength_nr_nsa_use_lte_as_primary_bool";
    public static final java.lang.String KEY_BANDWIDTH_STRING_ARRAY = "bandwidth_string_array";
    public static final java.lang.String KEY_BANDWIDTH_NR_NSA_USE_LTE_VALUE_FOR_UPLINK_BOOL = "bandwidth_nr_nsa_use_lte_value_for_uplink_bool";
    public static final java.lang.String KEY_DISABLE_VOICE_BARRING_NOTIFICATION_BOOL = "disable_voice_barring_notification_bool";
    public static final java.lang.String KEY_NON_ROAMING_OPERATOR_STRING_ARRAY = "non_roaming_operator_string_array";
    public static final java.lang.String KEY_ROAMING_OPERATOR_STRING_ARRAY = "roaming_operator_string_array";
    public static final java.lang.String IMSI_KEY_DOWNLOAD_URL_STRING = "imsi_key_download_url_string";
    public static final java.lang.String IMSI_CARRIER_PUBLIC_KEY_EPDG_STRING = "imsi_carrier_public_key_epdg_string";
    public static final java.lang.String IMSI_CARRIER_PUBLIC_KEY_WLAN_STRING = "imsi_carrier_public_key_wlan_string";
    public static final java.lang.String IMSI_KEY_AVAILABILITY_INT = "imsi_key_availability_int";
    public static final java.lang.String KEY_CONVERT_CDMA_CALLER_ID_MMI_CODES_WHILE_ROAMING_ON_3GPP_BOOL = "convert_cdma_caller_id_mmi_codes_while_roaming_on_3gpp_bool";
    public static final java.lang.String KEY_SHOW_IMS_REGISTRATION_STATUS_BOOL = "show_ims_registration_status_bool";
    public static final java.lang.String KEY_RTT_SUPPORTED_BOOL = "rtt_supported_bool";
    public static final java.lang.String KEY_TTY_SUPPORTED_BOOL = "tty_supported_bool";
    public static final java.lang.String KEY_RTT_AUTO_UPGRADE_BOOL = "rtt_auto_upgrade_bool";
    public static final java.lang.String KEY_RTT_SUPPORTED_FOR_VT_BOOL = "rtt_supported_for_vt_bool";
    public static final java.lang.String KEY_VT_UPGRADE_SUPPORTED_FOR_DOWNGRADED_RTT_CALL_BOOL = "vt_upgrade_supported_for_downgraded_rtt_call";
    public static final java.lang.String KEY_RTT_UPGRADE_SUPPORTED_FOR_DOWNGRADED_VT_CALL_BOOL = "rtt_upgrade_supported_for_downgraded_vt_call";
    public static final java.lang.String KEY_RTT_UPGRADE_SUPPORTED_BOOL = "rtt_upgrade_supported_bool";
    public static final java.lang.String KEY_RTT_DOWNGRADE_SUPPORTED_BOOL = "rtt_downgrade_supported_bool";
    public static final java.lang.String KEY_HIDE_TTY_HCO_VCO_WITH_RTT_BOOL = "hide_tty_hco_vco_with_rtt";
    public static final java.lang.String KEY_DISABLE_CHARGE_INDICATION_BOOL = "disable_charge_indication_bool";
    public static final java.lang.String KEY_SKIP_CF_FAIL_TO_DISABLE_DIALOG_BOOL = "skip_cf_fail_to_disable_dialog_bool";
    public static final java.lang.String KEY_SUPPORT_NO_REPLY_TIMER_FOR_CFNRY_BOOL = "support_no_reply_timer_for_cfnry_bool";
    public static final java.lang.String KEY_FEATURE_ACCESS_CODES_STRING_ARRAY = "feature_access_codes_string_array";
    public static final java.lang.String KEY_IDENTIFY_HIGH_DEFINITION_CALLS_IN_CALL_LOG_BOOL = "identify_high_definition_calls_in_call_log_bool";
    public static final java.lang.String KEY_SPN_DISPLAY_RULE_USE_ROAMING_FROM_SERVICE_STATE_BOOL = "spn_display_rule_use_roaming_from_service_state_bool";
    public static final java.lang.String KEY_CARRIER_CONFIG_APPLIED_BOOL = "carrier_config_applied_bool";
    public static final java.lang.String KEY_CHECK_PRICING_WITH_CARRIER_FOR_DATA_ROAMING_BOOL = "check_pricing_with_carrier_data_roaming_bool";
    public static final java.lang.String KEY_SHOW_DATA_CONNECTED_ROAMING_NOTIFICATION_BOOL = "show_data_connected_roaming_notification";
    public static final java.lang.String KEY_LTE_RSRP_THRESHOLDS_INT_ARRAY = "lte_rsrp_thresholds_int_array";
    public static final java.lang.String KEY_LTE_RSRQ_THRESHOLDS_INT_ARRAY = "lte_rsrq_thresholds_int_array";
    public static final java.lang.String KEY_LTE_RSSNR_THRESHOLDS_INT_ARRAY = "lte_rssnr_thresholds_int_array";
    public static final java.lang.String KEY_CARRIER_NETWORK_SERVICE_WLAN_PACKAGE_OVERRIDE_STRING = "carrier_network_service_wlan_package_override_string";
    public static final java.lang.String KEY_CARRIER_NETWORK_SERVICE_WLAN_CLASS_OVERRIDE_STRING = "carrier_network_service_wlan_class_override_string";
    public static final java.lang.String KEY_CARRIER_NETWORK_SERVICE_WWAN_PACKAGE_OVERRIDE_STRING = "carrier_network_service_wwan_package_override_string";
    public static final java.lang.String KEY_CARRIER_NETWORK_SERVICE_WWAN_CLASS_OVERRIDE_STRING = "carrier_network_service_wwan_class_override_string";
    public static final java.lang.String KEY_CARRIER_QUALIFIED_NETWORKS_SERVICE_PACKAGE_OVERRIDE_STRING = "carrier_qualified_networks_service_package_override_string";
    public static final java.lang.String KEY_CARRIER_QUALIFIED_NETWORKS_SERVICE_CLASS_OVERRIDE_STRING = "carrier_qualified_networks_service_class_override_string";
    public static final java.lang.String KEY_WCDMA_RSCP_THRESHOLDS_INT_ARRAY = "wcdma_rscp_thresholds_int_array";
    public static final java.lang.String KEY_WCDMA_DEFAULT_SIGNAL_STRENGTH_MEASUREMENT_STRING = "wcdma_default_signal_strength_measurement_string";
    public static final java.lang.String KEY_UNDELIVERED_SMS_MESSAGE_EXPIRATION_TIME = "undelivered_sms_message_expiration_time";
    public static final java.lang.String KEY_CALL_REDIRECTION_SERVICE_COMPONENT_NAME_STRING = "call_redirection_service_component_name_string";
    public static final java.lang.String KEY_CONFIG_SHOW_ORIG_DIAL_STRING_FOR_CDMA_BOOL = "config_show_orig_dial_string_for_cdma";
    public static final java.lang.String KEY_SHOW_CALL_BLOCKING_DISABLED_NOTIFICATION_ALWAYS_BOOL = "show_call_blocking_disabled_notification_always_bool";
    public static final java.lang.String KEY_CALL_FORWARDING_OVER_UT_WARNING_BOOL = "call_forwarding_over_ut_warning_bool";
    public static final java.lang.String KEY_CALL_BARRING_OVER_UT_WARNING_BOOL = "call_barring_over_ut_warning_bool";
    public static final java.lang.String KEY_CALLER_ID_OVER_UT_WARNING_BOOL = "caller_id_over_ut_warning_bool";
    public static final java.lang.String KEY_CALL_WAITING_OVER_UT_WARNING_BOOL = "call_waiting_over_ut_warning_bool";
    public static final java.lang.String KEY_SUPPORT_CLIR_NETWORK_DEFAULT_BOOL = "support_clir_network_default_bool";
    public static final java.lang.String KEY_SUPPORT_EMERGENCY_DIALER_SHORTCUT_BOOL = "support_emergency_dialer_shortcut_bool";
    public static final java.lang.String KEY_USE_CALL_FORWARDING_USSD_BOOL = "use_call_forwarding_ussd_bool";
    public static final java.lang.String KEY_USE_CALLER_ID_USSD_BOOL = "use_caller_id_ussd_bool";
    public static final java.lang.String KEY_USE_CALL_WAITING_USSD_BOOL = "use_call_waiting_ussd_bool";
    public static final java.lang.String KEY_CALL_WAITING_SERVICE_CLASS_INT = "call_waiting_service_class_int";
    public static final java.lang.String KEY_5G_ICON_CONFIGURATION_STRING = "5g_icon_configuration_string";
    public static final java.lang.String KEY_5G_ICON_DISPLAY_GRACE_PERIOD_STRING = "5g_icon_display_grace_period_string";
    public static final java.lang.String KEY_5G_ICON_DISPLAY_SECONDARY_GRACE_PERIOD_STRING = "5g_icon_display_secondary_grace_period_string";
    public static final java.lang.String KEY_NR_TIMERS_RESET_IF_NON_ENDC_AND_RRC_IDLE_BOOL = "nr_timers_reset_if_non_endc_and_rrc_idle_bool";
    public static final java.lang.String KEY_ADDITIONAL_NR_ADVANCED_BANDS_INT_ARRAY = "additional_nr_advanced_bands_int_array";
    public static final java.lang.String KEY_NR_ADVANCED_CAPABLE_PCO_ID_INT = "nr_advanced_capable_pco_id_int";
    public static final java.lang.String KEY_ENABLE_NR_ADVANCED_WHILE_ROAMING_BOOL = "enable_nr_advanced_for_roaming_bool";
    public static final java.lang.String KEY_LTE_ENDC_USING_USER_DATA_FOR_RRC_DETECTION_BOOL = "lte_endc_using_user_data_for_rrc_detection_bool";
    public static final java.lang.String KEY_5G_WATCHDOG_TIME_MS_LONG = "5g_watchdog_time_ms_long";
    public static final java.lang.String KEY_UNMETERED_NETWORK_TYPES_STRING_ARRAY = "unmetered_network_types_string_array";
    public static final java.lang.String KEY_ROAMING_UNMETERED_NETWORK_TYPES_STRING_ARRAY = "roaming_unmetered_network_types_string_array";
    public static final java.lang.String KEY_UNMETERED_NR_NSA_BOOL = "unmetered_nr_nsa_bool";
    public static final java.lang.String KEY_UNMETERED_NR_NSA_MMWAVE_BOOL = "unmetered_nr_nsa_mmwave_bool";
    public static final java.lang.String KEY_UNMETERED_NR_NSA_SUB6_BOOL = "unmetered_nr_nsa_sub6_bool";
    public static final java.lang.String KEY_UNMETERED_NR_NSA_WHEN_ROAMING_BOOL = "unmetered_nr_nsa_when_roaming_bool";
    public static final java.lang.String KEY_UNMETERED_NR_SA_BOOL = "unmetered_nr_sa_bool";
    public static final java.lang.String KEY_UNMETERED_NR_SA_MMWAVE_BOOL = "unmetered_nr_sa_mmwave_bool";
    public static final java.lang.String KEY_UNMETERED_NR_SA_SUB6_BOOL = "unmetered_nr_sa_sub6_bool";
    public static final java.lang.String KEY_ASCII_7_BIT_SUPPORT_FOR_LONG_MESSAGE_BOOL = "ascii_7_bit_support_for_long_message_bool";
    public static final java.lang.String KEY_SHOW_WIFI_CALLING_ICON_IN_STATUS_BAR_BOOL = "show_wifi_calling_icon_in_status_bar_bool";
    public static final java.lang.String KEY_CARRIER_SUPPORTS_OPP_DATA_AUTO_PROVISIONING_BOOL = "carrier_supports_opp_data_auto_provisioning_bool";
    public static final java.lang.String KEY_SMDP_SERVER_ADDRESS_STRING = "smdp_server_address_string";
    public static final java.lang.String KEY_ESIM_DOWNLOAD_RETRY_BACKOFF_TIMER_SEC_INT = "esim_download_retry_backoff_timer_sec_int";
    public static final java.lang.String KEY_ESIM_MAX_DOWNLOAD_RETRY_ATTEMPTS_INT = "esim_max_download_retry_attempts_int";
    public static final java.lang.String KEY_OPPORTUNISTIC_CARRIER_IDS_INT_ARRAY = "opportunistic_carrier_ids_int_array";
    public static final java.lang.String KEY_OPPORTUNISTIC_ESIM_DOWNLOAD_VIA_WIFI_ONLY_BOOL = "opportunistic_esim_download_via_wifi_only_bool";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_ENTRY_THRESHOLD_RSRP_INT = "opportunistic_network_entry_threshold_rsrp_int";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_ENTRY_THRESHOLD_RSSNR_INT = "opportunistic_network_entry_threshold_rssnr_int";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_EXIT_THRESHOLD_RSRP_INT = "opportunistic_network_exit_threshold_rsrp_int";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_EXIT_THRESHOLD_RSSNR_INT = "opportunistic_network_exit_threshold_rssnr_int";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_ENTRY_THRESHOLD_BANDWIDTH_INT = "opportunistic_network_entry_threshold_bandwidth_int";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_ENTRY_OR_EXIT_HYSTERESIS_TIME_LONG = "opportunistic_network_entry_or_exit_hysteresis_time_long";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_DATA_SWITCH_HYSTERESIS_TIME_LONG = "opportunistic_network_data_switch_hysteresis_time_long";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_DATA_SWITCH_EXIT_HYSTERESIS_TIME_LONG = "opportunistic_network_data_switch_exit_hysteresis_time_long";
    public static final java.lang.String KEY_PING_TEST_BEFORE_DATA_SWITCH_BOOL = "ping_test_before_data_switch_bool";
    public static final java.lang.String KEY_SWITCH_DATA_TO_PRIMARY_IF_PRIMARY_IS_OOS_BOOL = "switch_data_to_primary_if_primary_is_oos_bool";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_PING_PONG_TIME_LONG = "opportunistic_network_ping_pong_time_long";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_BACKOFF_TIME_LONG = "opportunistic_network_backoff_time_long";
    public static final java.lang.String KEY_OPPORTUNISTIC_NETWORK_MAX_BACKOFF_TIME_LONG = "opportunistic_network_max_backoff_time_long";
    public static final java.lang.String KEY_ENABLE_4G_OPPORTUNISTIC_NETWORK_SCAN_BOOL = "enabled_4g_opportunistic_network_scan_bool";
    public static final java.lang.String KEY_TIME_TO_SWITCH_BACK_TO_PRIMARY_IF_OPPORTUNISTIC_OOS_LONG = "time_to_switch_back_to_primary_if_opportunistic_oos_long";
    public static final java.lang.String KEY_OPPORTUNISTIC_TIME_TO_SCAN_AFTER_CAPABILITY_SWITCH_TO_PRIMARY_LONG = "opportunistic_time_to_scan_after_capability_switch_to_primary_long";
    public static final java.lang.String KEY_EMERGENCY_NUMBER_PREFIX_STRING_ARRAY = "emergency_number_prefix_string_array";
    public static final java.lang.String KEY_CARRIER_SUPPORTS_CALLER_ID_VERTICAL_SERVICE_CODES_BOOL = "carrier_supports_caller_id_vertical_service_codes_bool";
    public static final java.lang.String KEY_SMART_FORWARDING_CONFIG_COMPONENT_NAME_STRING = "smart_forwarding_config_component_name_string";
    public static final java.lang.String KEY_ALWAYS_SHOW_PRIMARY_SIGNAL_BAR_IN_OPPORTUNISTIC_NETWORK_BOOLEAN = "always_show_primary_signal_bar_in_opportunistic_network_boolean";
    public static final java.lang.String KEY_DATA_SWITCH_VALIDATION_TIMEOUT_LONG = "data_switch_validation_timeout_long";
    public static final java.lang.String ENABLE_EAP_METHOD_PREFIX_BOOL = "enable_eap_method_prefix_bool";
    @android.annotation.SystemApi
    public static final int GBA_ME = 1;
    @android.annotation.SystemApi
    public static final int GBA_U = 2;
    @android.annotation.SystemApi
    public static final int GBA_DIGEST = 3;
    @android.annotation.SystemApi
    public static final java.lang.String KEY_GBA_MODE_INT = "gba_mode_int";
    @android.annotation.SystemApi
    public static final java.lang.String KEY_GBA_UA_SECURITY_ORGANIZATION_INT = "gba_ua_security_organization_int";
    @android.annotation.SystemApi
    public static final java.lang.String KEY_GBA_UA_SECURITY_PROTOCOL_INT = "gba_ua_security_protocol_int";
    @android.annotation.SystemApi
    public static final java.lang.String KEY_GBA_UA_TLS_CIPHER_SUITE_INT = "gba_ua_tls_cipher_suite_int";
    public static final java.lang.String KEY_DATA_STALL_RECOVERY_TIMERS_LONG_ARRAY = "data_stall_recovery_timers_long_array";
    public static final java.lang.String KEY_DATA_STALL_RECOVERY_SHOULD_SKIP_BOOL_ARRAY = "data_stall_recovery_should_skip_bool_array";
    public static final java.lang.String KEY_CDMA_ENHANCED_ROAMING_INDICATOR_FOR_HOME_NETWORK_INT_ARRAY = "cdma_enhanced_roaming_indicator_for_home_network_int_array";
    public static final java.lang.String KEY_SHOW_WFC_LOCATION_PRIVACY_POLICY_BOOL = "show_wfc_location_privacy_policy_bool";
    public static final java.lang.String KEY_USE_USIM_BOOL = "use_usim_bool";
    public static final java.lang.String KEY_AUTO_CANCEL_CS_REJECT_NOTIFICATION = "carrier_auto_cancel_cs_notification";
    public static final java.lang.String REMOVE_GROUP_UUID_STRING = "00000000-0000-0000-0000-000000000000";
    public static final java.lang.String KEY_SUBSCRIPTION_GROUP_UUID_STRING = "subscription_group_uuid_string";
    public static final java.lang.String KEY_CELLULAR_USAGE_SETTING_INT = "cellular_usage_setting_int";
    public static final java.lang.String KEY_DATA_SWITCH_VALIDATION_MIN_GAP_LONG = "data_switch_validation_min_gap_long";
    public static final java.lang.String KEY_IS_OPPORTUNISTIC_SUBSCRIPTION_BOOL = "is_opportunistic_subscription_bool";
    public static final java.lang.String KEY_CARRIER_PROVISIONING_APP_STRING = "carrier_provisioning_app_string";
    public static final java.lang.String KEY_GSM_RSSI_THRESHOLDS_INT_ARRAY = "gsm_rssi_thresholds_int_array";
    public static final java.lang.String KEY_SUPPORT_WPS_OVER_IMS_BOOL = "support_wps_over_ims_bool";
    public static final java.lang.String KEY_MMI_TWO_DIGIT_NUMBER_PATTERN_STRING_ARRAY = "mmi_two_digit_number_pattern_string_array";
    public static final java.lang.String KEY_CARRIER_CERTIFICATE_STRING_ARRAY = "carrier_certificate_string_array";
    public static final java.lang.String KEY_FORMAT_INCOMING_NUMBER_TO_NATIONAL_FOR_JP_BOOL = "format_incoming_number_to_national_for_jp_bool";
    public static final java.lang.String KEY_DISCONNECT_CAUSE_PLAY_BUSYTONE_INT_ARRAY = "disconnect_cause_play_busytone_int_array";
    public static final java.lang.String KEY_PREVENT_CLIR_ACTIVATION_AND_DEACTIVATION_CODE_BOOL = "prevent_clir_activation_and_deactivation_code_bool";
    public static final java.lang.String KEY_SHOW_FORWARDED_NUMBER_BOOL = "show_forwarded_number_bool";
    public static final java.lang.String KEY_MISSED_INCOMING_CALL_SMS_ORIGINATOR_STRING_ARRAY = "missed_incoming_call_sms_originator_string_array";
    public static final java.lang.String KEY_APN_PRIORITY_STRING_ARRAY = "apn_priority_string_array";
    public static final java.lang.String KEY_TELEPHONY_NETWORK_CAPABILITY_PRIORITIES_STRING_ARRAY = "telephony_network_capability_priorities_string_array";
    public static final java.lang.String KEY_TELEPHONY_DATA_SETUP_RETRY_RULES_STRING_ARRAY = "telephony_data_setup_retry_rules_string_array";
    public static final java.lang.String KEY_TELEPHONY_DATA_HANDOVER_RETRY_RULES_STRING_ARRAY = "telephony_data_handover_retry_rules_string_array";
    public static final java.lang.String KEY_DELAY_IMS_TEAR_DOWN_UNTIL_CALL_END_BOOL = "delay_ims_tear_down_until_call_end_bool";
    public static final java.lang.String KEY_MISSED_INCOMING_CALL_SMS_PATTERN_STRING_ARRAY = "missed_incoming_call_sms_pattern_string_array";
    public static final java.lang.String KEY_DISABLE_DUN_APN_WHILE_ROAMING_WITH_PRESET_APN_BOOL = "disable_dun_apn_while_roaming_with_preset_apn_bool";
    public static final java.lang.String KEY_DEFAULT_PREFERRED_APN_NAME_STRING = "default_preferred_apn_name_string";
    public static final java.lang.String KEY_SUPPORTS_CALL_COMPOSER_BOOL = "supports_call_composer_bool";
    public static final java.lang.String KEY_CALL_COMPOSER_PICTURE_SERVER_URL_STRING = "call_composer_picture_server_url_string";
    public static final java.lang.String KEY_DEFAULT_RTT_MODE_INT = "default_rtt_mode_int";
    public static final java.lang.String KEY_RTT_SUPPORTED_WHILE_ROAMING_BOOL = "rtt_supported_while_roaming_bool";
    public static final java.lang.String KEY_USE_ACS_FOR_RCS_BOOL = "use_acs_for_rcs_bool";
    public static final java.lang.String KEY_NETWORK_TEMP_NOT_METERED_SUPPORTED_BOOL = "network_temp_not_metered_supported_bool";
    public static final java.lang.String KEY_STORE_SIM_PIN_FOR_UNATTENDED_REBOOT_BOOL = "store_sim_pin_for_unattended_reboot_bool";
    public static final java.lang.String KEY_HIDE_ENABLE_2G = "hide_enable_2g_bool";
    public static final java.lang.String KEY_ALLOWED_INITIAL_ATTACH_APN_TYPES_STRING_ARRAY = "allowed_initial_attach_apn_types_string_array";
    public static final java.lang.String KEY_CARRIER_PROVISIONS_WIFI_MERGED_NETWORKS_BOOL = "carrier_provisions_wifi_merged_networks_bool";
    public static final java.lang.String KEY_USE_IP_FOR_CALLING_INDICATOR_BOOL = "use_ip_for_calling_indicator_bool";
    public static final java.lang.String KEY_DISPLAY_CALL_STRENGTH_INDICATOR_BOOL = "display_call_strength_indicator_bool";
    public static final java.lang.String KEY_DISPLAY_NO_DATA_NOTIFICATION_ON_PERMANENT_FAILURE_BOOL = "display_no_data_notification_on_permanent_failure_bool";
    public static final java.lang.String KEY_VONR_SETTING_VISIBILITY_BOOL = "vonr_setting_visibility_bool";
    public static final java.lang.String KEY_VONR_ENABLED_BOOL = "vonr_enabled_bool";
    public static final java.lang.String KEY_VONR_ON_BY_DEFAULT_BOOL = "vonr_on_by_default_bool";
    public static final java.lang.String KEY_UNTHROTTLE_DATA_RETRY_WHEN_TAC_CHANGES_BOOL = "unthrottle_data_retry_when_tac_changes_bool";
    public static final java.lang.String KEY_IWLAN_HANDOVER_POLICY_STRING_ARRAY = "iwlan_handover_policy_string_array";
    public CarrierConfigManager(android.content.Context p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public android.os.PersistableBundle getConfigForSubId(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void overrideConfig(int p0, android.os.PersistableBundle p1) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void overrideConfig(int p0, android.os.PersistableBundle p1, boolean p2) {}
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public android.os.PersistableBundle getConfig() { return null; }
    public static boolean isConfigForIdentifiedCarrier(android.os.PersistableBundle p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void notifyConfigChangedForSubId(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_PHONE_STATE")
    public void updateConfigForPhoneId(int p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PRIVILEGED_PHONE_STATE")
    public java.lang.String getDefaultCarrierServicePackageName() { return null; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("RequiresPermission")
    public static android.os.PersistableBundle getDefaultConfig() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    public android.os.PersistableBundle getConfigByComponentForSubId(java.lang.String p0, int p1) { return null; }

    public static final class Apn {
        @java.lang.Deprecated
        public static final java.lang.String KEY_PREFIX = "apn.";
        public static final java.lang.String PROTOCOL_IPV4 = "IP";
        public static final java.lang.String PROTOCOL_IPV6 = "IPV6";
        public static final java.lang.String PROTOCOL_IPV4V6 = "IPV4V6";
        public static final java.lang.String KEY_SETTINGS_DEFAULT_PROTOCOL_STRING = "apn.settings_default_protocol_string";
        public static final java.lang.String KEY_SETTINGS_DEFAULT_ROAMING_PROTOCOL_STRING = "apn.settings_default_roaming_protocol_string";
    }

    public static final class Bsf {
        public static final java.lang.String KEY_PREFIX = "bsf.";
        public static final java.lang.String KEY_BSF_SERVER_FQDN_STRING = "bsf.bsf_server_fqdn_string";
        public static final java.lang.String KEY_BSF_SERVER_PORT_INT = "bsf.bsf_server_port_int";
        public static final java.lang.String KEY_BSF_TRANSPORT_TYPE_INT = "bsf.bsf_transport_type_int";
    }

    public static final class Gps {
        public static final java.lang.String KEY_PREFIX = "gps.";
        public static final int SUPL_EMERGENCY_MODE_TYPE_CP_ONLY = 0;
        public static final int SUPL_EMERGENCY_MODE_TYPE_CP_FALLBACK = 1;
        public static final int SUPL_EMERGENCY_MODE_TYPE_DP_ONLY = 2;
        public static final java.lang.String KEY_PERSIST_LPP_MODE_BOOL = "gps.persist_lpp_mode_bool";
        public static final java.lang.String KEY_SUPL_HOST_STRING = "gps.supl_host";
        public static final java.lang.String KEY_SUPL_PORT_STRING = "gps.supl_port";
        public static final java.lang.String KEY_SUPL_VER_STRING = "gps.supl_ver";
        public static final java.lang.String KEY_SUPL_MODE_STRING = "gps.supl_mode";
        public static final java.lang.String KEY_SUPL_ES_STRING = "gps.supl_es";
        public static final java.lang.String KEY_LPP_PROFILE_STRING = "gps.lpp_profile";
        public static final java.lang.String KEY_USE_EMERGENCY_PDN_FOR_EMERGENCY_SUPL_STRING = "gps.use_emergency_pdn_for_emergency_supl";
        public static final java.lang.String KEY_A_GLONASS_POS_PROTOCOL_SELECT_STRING = "gps.a_glonass_pos_protocol_select";
        public static final java.lang.String KEY_GPS_LOCK_STRING = "gps.gps_lock";
        public static final java.lang.String KEY_ES_EXTENSION_SEC_STRING = "gps.es_extension_sec";
        public static final java.lang.String KEY_NFW_PROXY_APPS_STRING = "gps.nfw_proxy_apps";
        public static final java.lang.String KEY_ES_SUPL_CONTROL_PLANE_SUPPORT_INT = "gps.es_supl_control_plane_support_int";
        public static final java.lang.String KEY_ES_SUPL_DATA_PLANE_ONLY_ROAMING_PLMN_STRING_ARRAY = "gps.es_supl_data_plane_only_roaming_plmn_string_array";
    }

    public static final class Ims {
        public static final java.lang.String KEY_PREFIX = "ims.";
        public static final java.lang.String KEY_WIFI_OFF_DEFERRING_TIME_MILLIS_INT = "ims.wifi_off_deferring_time_millis_int";
        public static final java.lang.String KEY_IMS_SINGLE_REGISTRATION_REQUIRED_BOOL = "ims.ims_single_registration_required_bool";
        public static final java.lang.String KEY_ENABLE_PRESENCE_PUBLISH_BOOL = "ims.enable_presence_publish_bool";
        public static final java.lang.String KEY_PUBLISH_SERVICE_DESC_FEATURE_TAG_MAP_OVERRIDE_STRING_ARRAY = "ims.publish_service_desc_feature_tag_map_override_string_array";
        public static final java.lang.String KEY_ENABLE_PRESENCE_CAPABILITY_EXCHANGE_BOOL = "ims.enable_presence_capability_exchange_bool";
        public static final java.lang.String KEY_RCS_BULK_CAPABILITY_EXCHANGE_BOOL = "ims.rcs_bulk_capability_exchange_bool";
        public static final java.lang.String KEY_ENABLE_PRESENCE_GROUP_SUBSCRIBE_BOOL = "ims.enable_presence_group_subscribe_bool";
        public static final java.lang.String KEY_USE_SIP_URI_FOR_PRESENCE_SUBSCRIBE_BOOL = "ims.use_sip_uri_for_presence_subscribe_bool";
        public static final java.lang.String KEY_USE_TEL_URI_FOR_PIDF_XML_BOOL = "ims.use_tel_uri_for_pidf_xml";
        public static final java.lang.String KEY_NON_RCS_CAPABILITIES_CACHE_EXPIRATION_SEC_INT = "ims.non_rcs_capabilities_cache_expiration_sec_int";
        public static final java.lang.String KEY_RCS_FEATURE_TAG_ALLOWED_STRING_ARRAY = "ims.rcs_feature_tag_allowed_string_array";
        public static final java.lang.String KEY_RCS_REQUEST_FORBIDDEN_BY_SIP_489_BOOL = "ims.rcs_request_forbidden_by_sip_489_bool";
        public static final java.lang.String KEY_RCS_REQUEST_RETRY_INTERVAL_MILLIS_LONG = "ims.rcs_request_retry_interval_millis_long";
        public static final java.lang.String KEY_SIP_TIMER_T1_MILLIS_INT = "ims.sip_timer_t1_millis_int";
        public static final java.lang.String KEY_SIP_TIMER_T2_MILLIS_INT = "ims.sip_timer_t2_millis_int";
        public static final java.lang.String KEY_SIP_TIMER_T4_MILLIS_INT = "ims.sip_timer_t4_millis_int";
        public static final java.lang.String KEY_SIP_TIMER_B_MILLIS_INT = "ims.sip_timer_b_millis_int";
        public static final java.lang.String KEY_SIP_TIMER_C_MILLIS_INT = "ims.sip_timer_c_millis_int";
        public static final java.lang.String KEY_SIP_TIMER_D_MILLIS_INT = "ims.sip_timer_d_millis_int";
        public static final java.lang.String KEY_SIP_TIMER_F_MILLIS_INT = "ims.sip_timer_f_millis_int";
        public static final java.lang.String KEY_SIP_TIMER_H_MILLIS_INT = "ims.sip_timer_h_millis_int";
        public static final java.lang.String KEY_SIP_TIMER_J_MILLIS_INT = "ims.sip_timer_j_millis_int";
        public static final java.lang.String KEY_SIP_SERVER_PORT_NUMBER_INT = "ims.sip_server_port_number_int";
        public static final java.lang.String KEY_PHONE_CONTEXT_DOMAIN_NAME_STRING = "ims.phone_context_domain_name_string";
        public static final int REQUEST_URI_FORMAT_TEL = 0;
        public static final int REQUEST_URI_FORMAT_SIP = 1;
        public static final java.lang.String KEY_REQUEST_URI_TYPE_INT = "ims.request_uri_type_int";
        public static final java.lang.String KEY_GRUU_ENABLED_BOOL = "ims.gruu_enabled_bool";
        public static final java.lang.String KEY_KEEP_PDN_UP_IN_NO_VOPS_BOOL = "ims.keep_pdn_up_in_no_vops_bool";
        public static final int PREFERRED_TRANSPORT_UDP = 0;
        public static final int PREFERRED_TRANSPORT_TCP = 1;
        public static final int PREFERRED_TRANSPORT_DYNAMIC_UDP_TCP = 2;
        public static final int PREFERRED_TRANSPORT_TLS = 3;
        public static final java.lang.String KEY_SIP_PREFERRED_TRANSPORT_INT = "ims.sip_preferred_transport_int";
        public static final java.lang.String KEY_IPV4_SIP_MTU_SIZE_CELLULAR_INT = "ims.ipv4_sip_mtu_size_cellular_int";
        public static final java.lang.String KEY_IPV6_SIP_MTU_SIZE_CELLULAR_INT = "ims.ipv6_sip_mtu_size_cellular_int";
        public static final java.lang.String KEY_IMS_PDN_ENABLED_IN_NO_VOPS_SUPPORT_INT_ARRAY = "ims.ims_pdn_enabled_in_no_vops_support_int_array";
        public static final java.lang.String KEY_SIP_OVER_IPSEC_ENABLED_BOOL = "ims.sip_over_ipsec_enabled_bool";
        public static final int IPSEC_AUTHENTICATION_ALGORITHM_HMAC_MD5 = 0;
        public static final int IPSEC_AUTHENTICATION_ALGORITHM_HMAC_SHA1 = 1;
        public static final java.lang.String KEY_IPSEC_AUTHENTICATION_ALGORITHMS_INT_ARRAY = "ims.ipsec_authentication_algorithms_int_array";
        public static final int IPSEC_ENCRYPTION_ALGORITHM_NULL = 0;
        public static final int IPSEC_ENCRYPTION_ALGORITHM_DES_EDE3_CBC = 1;
        public static final int IPSEC_ENCRYPTION_ALGORITHM_AES_CBC = 2;
        public static final java.lang.String KEY_IPSEC_ENCRYPTION_ALGORITHMS_INT_ARRAY = "ims.ipsec_encryption_algorithms_int_array";
        public static final java.lang.String KEY_REGISTRATION_EXPIRY_TIMER_SEC_INT = "ims.registration_expiry_timer_sec_int";
        public static final java.lang.String KEY_REGISTRATION_RETRY_BASE_TIMER_MILLIS_INT = "ims.registration_retry_base_timer_millis_int";
        public static final java.lang.String KEY_REGISTRATION_RETRY_MAX_TIMER_MILLIS_INT = "ims.registration_retry_max_timer_millis_int";
        public static final java.lang.String KEY_REGISTRATION_EVENT_PACKAGE_SUPPORTED_BOOL = "ims.registration_event_package_supported_bool";
        public static final java.lang.String KEY_REGISTRATION_SUBSCRIBE_EXPIRY_TIMER_SEC_INT = "ims.registration_subscribe_expiry_timer_sec_int";
        public static final int GEOLOCATION_PIDF_FOR_NON_EMERGENCY_ON_WIFI = 1;
        public static final int GEOLOCATION_PIDF_FOR_EMERGENCY_ON_WIFI = 2;
        public static final int GEOLOCATION_PIDF_FOR_NON_EMERGENCY_ON_CELLULAR = 3;
        public static final int GEOLOCATION_PIDF_FOR_EMERGENCY_ON_CELLULAR = 4;
        public static final java.lang.String KEY_GEOLOCATION_PIDF_IN_SIP_REGISTER_SUPPORT_INT_ARRAY = "ims.geolocation_pidf_in_sip_register_support_int_array";
        public static final java.lang.String KEY_GEOLOCATION_PIDF_IN_SIP_INVITE_SUPPORT_INT_ARRAY = "ims.geolocation_pidf_in_sip_invite_support_int_array";
        public static final java.lang.String KEY_IMS_USER_AGENT_STRING = "ims.ims_user_agent_string";
        public static final int NETWORK_TYPE_HOME = 0;
        public static final int NETWORK_TYPE_ROAMING = 1;
        public static final int RTCP_INACTIVITY_ON_HOLD = 0;
        public static final int RTCP_INACTIVITY_ON_CONNECTED = 1;
        public static final int RTP_INACTIVITY_ON_CONNECTED = 2;
        public static final int E911_RTCP_INACTIVITY_ON_CONNECTED = 3;
        public static final int E911_RTP_INACTIVITY_ON_CONNECTED = 4;
        public static final java.lang.String KEY_SUPPORTED_RATS_INT_ARRAY = "ims.supported_rats_int_array";
        public static final java.lang.String KEY_MMTEL_REQUIRES_PROVISIONING_BUNDLE = "ims.mmtel_requires_provisioning_bundle";
        public static final java.lang.String KEY_CAPABILITY_TYPE_VOICE_INT_ARRAY = "ims.capability_type_voice_int_array";
        public static final java.lang.String KEY_CAPABILITY_TYPE_VIDEO_INT_ARRAY = "ims.capability_type_video_int_array";
        public static final java.lang.String KEY_CAPABILITY_TYPE_UT_INT_ARRAY = "ims.capability_type_ut_int_array";
        public static final java.lang.String KEY_CAPABILITY_TYPE_SMS_INT_ARRAY = "ims.capability_type_sms_int_array";
        public static final java.lang.String KEY_CAPABILITY_TYPE_CALL_COMPOSER_INT_ARRAY = "ims.capability_type_call_composer_int_array";
        public static final java.lang.String KEY_RCS_REQUIRES_PROVISIONING_BUNDLE = "ims.rcs_requires_provisioning_bundle";
        public static final java.lang.String KEY_CAPABILITY_TYPE_OPTIONS_UCE_INT_ARRAY = "ims.capability_type_options_uce_int_array";
        public static final java.lang.String KEY_CAPABILITY_TYPE_PRESENCE_UCE_INT_ARRAY = "ims.capability_type_presence_uce_int_array";

        public static @interface GeolocationPidfAllowedType {
        }

        public static @interface IpsecAuthenticationAlgorithmType {
        }

        public static @interface IpsecEncryptionAlgorithmType {
        }

        public static @interface MediaInactivityReason {
        }

        public static @interface NetworkType {
        }

        public static @interface PreferredTransportType {
        }

        public static @interface RequestUriFormatType {
        }
    }

    public static final class ImsEmergency {
        public static final java.lang.String KEY_PREFIX = "imsemergency.";
        public static final java.lang.String KEY_RETRY_EMERGENCY_ON_IMS_PDN_BOOL = "imsemergency.retry_emergency_on_ims_pdn_bool";
        public static final java.lang.String KEY_EMERGENCY_CALLBACK_MODE_SUPPORTED_BOOL = "imsemergency.emergency_callback_mode_supported_bool";
        public static final java.lang.String KEY_EMERGENCY_QOS_PRECONDITION_SUPPORTED_BOOL = "imsemergency.emergency_qos_precondition_supported_bool";
        public static final java.lang.String KEY_EMERGENCY_OVER_IMS_SUPPORTED_RATS_INT_ARRAY = "imsemergency.emergency_over_ims_supported_rats_int_array";
        public static final java.lang.String KEY_EMERGENCY_REGISTRATION_TIMER_MILLIS_INT = "imsemergency.emergency_registration_timer_millis_int";
        public static final java.lang.String KEY_REFRESH_GEOLOCATION_TIMEOUT_MILLIS_INT = "imsemergency.refresh_geolocation_timeout_millis_int";
    }

    public static final class ImsRtt {
        public static final java.lang.String KEY_PREFIX = "imsrtt.";
        public static final java.lang.String KEY_TEXT_ON_DEFAULT_BEARER_SUPPORTED_BOOL = "imsrtt.text_on_default_bearer_supported_bool";
        public static final java.lang.String KEY_TEXT_QOS_PRECONDITION_SUPPORTED_BOOL = "imsrtt.text_qos_precondition_supported_bool";
        public static final java.lang.String KEY_TEXT_AS_BANDWIDTH_KBPS_INT = "imsrtt.text_as_bandwidth_kbps_int";
        public static final java.lang.String KEY_TEXT_RS_BANDWIDTH_BPS_INT = "imsrtt.text_rs_bandwidth_bps_int";
        public static final java.lang.String KEY_TEXT_RR_BANDWIDTH_BPS_INT = "imsrtt.text_rr_bandwidth_bps_int";
        public static final java.lang.String KEY_TEXT_CODEC_CAPABILITY_PAYLOAD_TYPES_BUNDLE = "imsrtt.text_codec_capability_payload_types_bundle";
        public static final java.lang.String KEY_T140_PAYLOAD_TYPE_INT = "imsrtt.t140_payload_type_int";
        public static final java.lang.String KEY_RED_PAYLOAD_TYPE_INT = "imsrtt.red_payload_type_int";
    }

    public static final class ImsServiceEntitlement {
        public static final java.lang.String KEY_PREFIX = "imsserviceentitlement.";
        public static final java.lang.String KEY_ENTITLEMENT_SERVER_URL_STRING = "imsserviceentitlement.entitlement_server_url_string";
        public static final java.lang.String KEY_SHOW_VOWIFI_WEBVIEW_BOOL = "imsserviceentitlement.show_vowifi_webview_bool";
        public static final java.lang.String KEY_IMS_PROVISIONING_BOOL = "imsserviceentitlement.ims_provisioning_bool";
        public static final java.lang.String KEY_FCM_SENDER_ID_STRING = "imsserviceentitlement.fcm_sender_id_string";
    }

    public static final class ImsSms {
        public static final java.lang.String KEY_PREFIX = "imssms.";
        public static final java.lang.String KEY_SMS_OVER_IMS_SUPPORTED_BOOL = "imssms.sms_over_ims_supported_bool";
        public static final java.lang.String KEY_SMS_CSFB_RETRY_ON_FAILURE_BOOL = "imssms.sms_csfb_retry_on_failure_bool";
        public static final int SMS_FORMAT_3GPP = 0;
        public static final int SMS_FORMAT_3GPP2 = 1;
        public static final java.lang.String KEY_SMS_OVER_IMS_FORMAT_INT = "imssms.sms_over_ims_format_int";
        public static final java.lang.String KEY_SMS_OVER_IMS_SUPPORTED_RATS_INT_ARRAY = "imssms.sms_over_ims_supported_rats_int_array";

        public static @interface SmsFormat {
        }
    }

    public static final class ImsSs {
        public static final java.lang.String KEY_PREFIX = "imsss.";
        public static final java.lang.String KEY_UT_REQUIRES_IMS_REGISTRATION_BOOL = "imsss.ut_requires_ims_registration_bool";
        public static final java.lang.String KEY_UT_SUPPORTED_WHEN_ROAMING_BOOL = "imsss.ut_supported_when_roaming_bool";
        public static final java.lang.String KEY_USE_CSFB_ON_XCAP_OVER_UT_FAILURE_BOOL = "imsss.use_csfb_on_xcap_over_ut_failure_bool";
        public static final java.lang.String KEY_UT_SUPPORTED_WHEN_PS_DATA_OFF_BOOL = "imsss.ut_supported_when_ps_data_off_bool";
        public static final java.lang.String KEY_NETWORK_INITIATED_USSD_OVER_IMS_SUPPORTED_BOOL = "imsss.network_initiated_ussd_over_ims_supported_bool";
        public static final java.lang.String KEY_UT_IPTYPE_HOME_INT = "imsss.ut_iptype_home_int";
        public static final java.lang.String KEY_UT_IPTYPE_ROAMING_INT = "imsss.ut_iptype_roaming_int";
        public static final java.lang.String KEY_UT_AS_SERVER_FQDN_STRING = "imsss.ut_as_server_fqdn_string";
        public static final java.lang.String KEY_UT_AS_SERVER_PORT_INT = "imsss.ut_as_server_port_int";
        public static final java.lang.String KEY_UT_TRANSPORT_TYPE_INT = "imsss.ut_transport_type_int";
        public static final int SUPPLEMENTARY_SERVICE_CW = 0;
        public static final int SUPPLEMENTARY_SERVICE_CF_ALL = 1;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFU = 2;
        public static final int SUPPLEMENTARY_SERVICE_CF_ALL_CONDITONAL_FORWARDING = 3;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFB = 4;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFNRY = 5;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFNRC = 6;
        public static final int SUPPLEMENTARY_SERVICE_CF_CFNL = 7;
        public static final int SUPPLEMENTARY_SERVICE_IDENTIFICATION_OIP = 8;
        public static final int SUPPLEMENTARY_SERVICE_IDENTIFICATION_TIP = 9;
        public static final int SUPPLEMENTARY_SERVICE_IDENTIFICATION_OIR = 10;
        public static final int SUPPLEMENTARY_SERVICE_IDENTIFICATION_TIR = 11;
        public static final int SUPPLEMENTARY_SERVICE_CB_ALL = 12;
        public static final int SUPPLEMENTARY_SERVICE_CB_OBS = 13;
        public static final int SUPPLEMENTARY_SERVICE_CB_BAOC = 14;
        public static final int SUPPLEMENTARY_SERVICE_CB_BOIC = 15;
        public static final int SUPPLEMENTARY_SERVICE_CB_BOIC_EXHC = 16;
        public static final int SUPPLEMENTARY_SERVICE_CB_IBS = 17;
        public static final int SUPPLEMENTARY_SERVICE_CB_BAIC = 18;
        public static final int SUPPLEMENTARY_SERVICE_CB_BIC_ROAM = 19;
        public static final int SUPPLEMENTARY_SERVICE_CB_ACR = 20;
        public static final int SUPPLEMENTARY_SERVICE_CB_BIL = 21;
        public static final java.lang.String KEY_UT_SERVER_BASED_SERVICES_INT_ARRAY = "imsss.ut_server_based_services_int_array";
        public static final java.lang.String KEY_UT_TERMINAL_BASED_SERVICES_INT_ARRAY = "imsss.ut_terminal_based_services_int_array";
        public static final java.lang.String KEY_XCAP_OVER_UT_SUPPORTED_RATS_INT_ARRAY = "imsss.xcap_over_ut_supported_rats_int_array";

        public static @interface SsType {
        }
    }

    public static final class ImsVoice {
        public static final java.lang.String KEY_PREFIX = "imsvoice.";
        public static final java.lang.String KEY_CARRIER_VOLTE_ROAMING_AVAILABLE_BOOL = "imsvoice.carrier_volte_roaming_available_bool";
        public static final java.lang.String KEY_INCLUDE_CALLER_ID_SERVICE_CODES_IN_SIP_INVITE_BOOL = "imsvoice.include_caller_id_service_codes_in_sip_invite_bool";
        public static final java.lang.String KEY_MULTIENDPOINT_SUPPORTED_BOOL = "imsvoice.multiendpoint_supported_bool";
        public static final java.lang.String KEY_SESSION_TIMER_SUPPORTED_BOOL = "imsvoice.session_timer_supported_bool";
        public static final java.lang.String KEY_SESSION_EXPIRES_TIMER_SEC_INT = "imsvoice.session_expires_timer_sec_int";
        public static final java.lang.String KEY_MINIMUM_SESSION_EXPIRES_TIMER_SEC_INT = "imsvoice.minimum_session_expires_timer_sec_int";
        public static final int SESSION_REFRESHER_TYPE_UNKNOWN = 0;
        public static final int SESSION_REFRESHER_TYPE_UAC = 1;
        public static final int SESSION_REFRESHER_TYPE_UAS = 2;
        public static final java.lang.String KEY_SESSION_REFRESHER_TYPE_INT = "imsvoice.session_refresher_type_int";
        public static final int SESSION_PRIVACY_TYPE_HEADER = 0;
        public static final int SESSION_PRIVACY_TYPE_NONE = 1;
        public static final int SESSION_PRIVACY_TYPE_ID = 2;
        public static final java.lang.String KEY_SESSION_PRIVACY_TYPE_INT = "imsvoice.session_privacy_type_int";
        public static final java.lang.String KEY_PRACK_SUPPORTED_FOR_18X_BOOL = "imsvoice.prack_supported_for_18x_bool";
        public static final int CONFERENCE_SUBSCRIBE_TYPE_IN_DIALOG = 0;
        public static final int CONFERENCE_SUBSCRIBE_TYPE_OUT_OF_DIALOG = 1;
        public static final java.lang.String KEY_CONFERENCE_SUBSCRIBE_TYPE_INT = "imsvoice.conference_subscribe_type_int";
        public static final java.lang.String KEY_VOICE_QOS_PRECONDITION_SUPPORTED_BOOL = "imsvoice.voice_qos_precondition_supported_bool";
        public static final java.lang.String KEY_VOICE_ON_DEFAULT_BEARER_SUPPORTED_BOOL = "imsvoice.voice_on_default_bearer_supported_bool";
        public static final java.lang.String KEY_DEDICATED_BEARER_WAIT_TIMER_MILLIS_INT = "imsvoice.dedicated_bearer_wait_timer_millis_int";
        public static final int BASIC_SRVCC_SUPPORT = 0;
        public static final int ALERTING_SRVCC_SUPPORT = 1;
        public static final int PREALERTING_SRVCC_SUPPORT = 2;
        public static final int MIDCALL_SRVCC_SUPPORT = 3;
        public static final java.lang.String KEY_SRVCC_TYPE_INT_ARRAY = "imsvoice.srvcc_type_int_array";
        public static final java.lang.String KEY_RINGING_TIMER_MILLIS_INT = "imsvoice.ringing_timer_millis_int";
        public static final java.lang.String KEY_RINGBACK_TIMER_MILLIS_INT = "imsvoice.ringback_timer_millis_int";
        public static final java.lang.String KEY_AUDIO_RTP_INACTIVITY_TIMER_MILLIS_INT = "imsvoice.audio_rtp_inactivity_timer_millis_int";
        public static final java.lang.String KEY_AUDIO_RTCP_INACTIVITY_TIMER_MILLIS_INT = "imsvoice.audio_rtcp_inactivity_timer_millis_int";
        public static final java.lang.String KEY_CONFERENCE_FACTORY_URI_STRING = "imsvoice.conference_factory_uri_string";
        public static final int SESSION_REFRESH_METHOD_INVITE = 0;
        public static final int SESSION_REFRESH_METHOD_UPDATE_PREFERRED = 1;
        public static final java.lang.String KEY_SESSION_REFRESH_METHOD_INT = "imsvoice.session_refresh_method_int";
        public static final java.lang.String KEY_OIP_SOURCE_FROM_HEADER_BOOL = "imsvoice.oip_source_from_header_bool";
        public static final java.lang.String KEY_MO_CALL_REQUEST_TIMEOUT_MILLIS_INT = "imsvoice.mo_call_request_timeout_millis_int";
        public static final java.lang.String KEY_AUDIO_INACTIVITY_CALL_END_REASONS_INT_ARRAY = "imsvoice.audio_inactivity_call_end_reasons_int_array";
        public static final java.lang.String KEY_AUDIO_AS_BANDWIDTH_KBPS_INT = "imsvoice.audio_as_bandwidth_kbps_int";
        public static final java.lang.String KEY_AUDIO_RS_BANDWIDTH_BPS_INT = "imsvoice.audio_rs_bandwidth_bps_int";
        public static final java.lang.String KEY_AUDIO_RR_BANDWIDTH_BPS_INT = "imsvoice.audio_rr_bandwidth_bps_int";
        public static final java.lang.String KEY_AUDIO_CODEC_CAPABILITY_PAYLOAD_TYPES_BUNDLE = "imsvoice.audio_codec_capability_payload_types_bundle";
        public static final java.lang.String KEY_EVS_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.evs_payload_type_int_array";
        public static final java.lang.String KEY_AMRWB_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.amrwb_payload_type_int_array";
        public static final java.lang.String KEY_AMRNB_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.amrnb_payload_type_int_array";
        public static final java.lang.String KEY_DTMFWB_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.dtmfwb_payload_type_int_array";
        public static final java.lang.String KEY_DTMFNB_PAYLOAD_TYPE_INT_ARRAY = "imsvoice.dtmfnb_payload_type_int_array";
        public static final int BANDWIDTH_EFFICIENT = 0;
        public static final int OCTET_ALIGNED = 1;
        public static final java.lang.String KEY_AMR_CODEC_ATTRIBUTE_PAYLOAD_FORMAT_INT = "imsvoice.amr_codec_attribute_payload_format_int";
        public static final java.lang.String KEY_AMR_CODEC_ATTRIBUTE_MODESET_INT_ARRAY = "imsvoice.amr_codec_attribute_modeset_int_array";
        public static final java.lang.String KEY_AMRNB_PAYLOAD_DESCRIPTION_BUNDLE = "imsvoice.amrnb_payload_description_bundle";
        public static final java.lang.String KEY_AMRWB_PAYLOAD_DESCRIPTION_BUNDLE = "imsvoice.amrwb_payload_description_bundle";
        public static final int EVS_OPERATIONAL_MODE_PRIMARY = 0;
        public static final int EVS_OPERATIONAL_MODE_AMRWB_IO = 1;
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_MODE_SWITCH_INT = "imsvoice.evs_codec_attribute_mode_switch_int";
        public static final int EVS_ENCODED_BW_TYPE_NB = 0;
        public static final int EVS_ENCODED_BW_TYPE_WB = 1;
        public static final int EVS_ENCODED_BW_TYPE_SWB = 2;
        public static final int EVS_ENCODED_BW_TYPE_FB = 3;
        public static final int EVS_ENCODED_BW_TYPE_NB_WB = 4;
        public static final int EVS_ENCODED_BW_TYPE_NB_WB_SWB = 5;
        public static final int EVS_ENCODED_BW_TYPE_NB_WB_SWB_FB = 6;
        public static final int EVS_ENCODED_BW_TYPE_WB_SWB = 7;
        public static final int EVS_ENCODED_BW_TYPE_WB_SWB_FB = 8;
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_BANDWIDTH_INT = "imsvoice.evs_codec_attribute_bandwidth_int";
        public static final int EVS_PRIMARY_MODE_BITRATE_5_9_KBPS = 0;
        public static final int EVS_PRIMARY_MODE_BITRATE_7_2_KBPS = 1;
        public static final int EVS_PRIMARY_MODE_BITRATE_8_0_KBPS = 2;
        public static final int EVS_PRIMARY_MODE_BITRATE_9_6_KBPS = 3;
        public static final int EVS_PRIMARY_MODE_BITRATE_13_2_KBPS = 4;
        public static final int EVS_PRIMARY_MODE_BITRATE_16_4_KBPS = 5;
        public static final int EVS_PRIMARY_MODE_BITRATE_24_4_KBPS = 6;
        public static final int EVS_PRIMARY_MODE_BITRATE_32_0_KBPS = 7;
        public static final int EVS_PRIMARY_MODE_BITRATE_48_0_KBPS = 8;
        public static final int EVS_PRIMARY_MODE_BITRATE_64_0_KBPS = 9;
        public static final int EVS_PRIMARY_MODE_BITRATE_96_0_KBPS = 10;
        public static final int EVS_PRIMARY_MODE_BITRATE_128_0_KBPS = 11;
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_BITRATE_INT_ARRAY = "imsvoice.evs_codec_attribute_bitrate_int_array";
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_CH_AW_RECV_INT = "imsvoice.evs_codec_attribute_ch_aw_recv_int";
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_HF_ONLY_INT = "imsvoice.evs_codec_attribute_hf_only_int";
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_DTX_BOOL = "imsvoice.evs_codec_attribute_dtx_bool";
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_DTX_RECV_BOOL = "imsvoice.evs_codec_attribute_dtx_recv_bool";
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_CHANNELS_INT = "imsvoice.evs_codec_attribute_channels_int";
        public static final java.lang.String KEY_EVS_CODEC_ATTRIBUTE_CMR_INT = "imsvoice.codec_attribute_cmr_int";
        public static final java.lang.String KEY_CODEC_ATTRIBUTE_MODE_CHANGE_PERIOD_INT = "imsvoice.codec_attribute_mode_change_period_int";
        public static final java.lang.String KEY_CODEC_ATTRIBUTE_MODE_CHANGE_CAPABILITY_INT = "imsvoice.codec_attribute_mode_change_capability_int";
        public static final java.lang.String KEY_CODEC_ATTRIBUTE_MODE_CHANGE_NEIGHBOR_INT = "imsvoice.codec_attribute_mode_change_neighbor_int";
        public static final java.lang.String KEY_EVS_PAYLOAD_DESCRIPTION_BUNDLE = "imsvoice.evs_payload_description_bundle";

        public static @interface AmrPayloadFormat {
        }

        public static @interface ConferenceSubscribeType {
        }

        public static @interface EvsEncodedBwType {
        }

        public static @interface EvsOperationalMode {
        }

        public static @interface EvsPrimaryModeBitRate {
        }

        public static @interface SessionPrivacyType {
        }

        public static @interface SessionRefreshMethod {
        }

        public static @interface SessionRefresherType {
        }

        public static @interface SrvccType {
        }
    }

    public static final class ImsVt {
        public static final java.lang.String KEY_PREFIX = "imsvt.";
        public static final java.lang.String KEY_VIDEO_ON_DEFAULT_BEARER_SUPPORTED_BOOL = "imsvt.video_on_default_bearer_supported_bool";
        public static final java.lang.String KEY_VIDEO_RTP_INACTIVITY_TIMER_MILLIS_INT = "imsvt.video_rtp_inactivity_timer_millis_int";
        public static final java.lang.String KEY_VIDEO_RTCP_INACTIVITY_TIMER_MILLIS_INT = "imsvt.video_rtcp_inactivity_timer_millis_int";
        public static final java.lang.String KEY_VIDEO_AS_BANDWIDTH_KBPS_INT = "imsvt.video_as_bandwidth_kbps_int";
        public static final java.lang.String KEY_VIDEO_RS_BANDWIDTH_BPS_INT = "imsvt.video_rs_bandwidth_bps_int";
        public static final java.lang.String KEY_VIDEO_RR_BANDWIDTH_BPS_INT = "imsvt.video_rr_bandwidth_bps_int";
        public static final java.lang.String KEY_VIDEO_RTP_DSCP_INT = "imsvt.video_rtp_dscp_int";
        public static final java.lang.String KEY_VIDEO_QOS_PRECONDITION_SUPPORTED_BOOL = "imsvt.video_qos_precondition_supported_bool";
        public static final java.lang.String KEY_VIDEO_CODEC_CAPABILITY_PAYLOAD_TYPES_BUNDLE = "imsvt.video_codec_capability_payload_types_bundle";
        public static final java.lang.String KEY_H264_PAYLOAD_TYPE_INT_ARRAY = "imsvt.h264_payload_type_int_array";
        public static final java.lang.String KEY_H264_PAYLOAD_DESCRIPTION_BUNDLE = "imsvt.h264_payload_description_bundle";
        public static final java.lang.String KEY_VIDEO_CODEC_ATTRIBUTE_PACKETIZATION_MODE_INT = "imsvt.video_codec_attribute_packetization_mode_int";
        public static final java.lang.String KEY_VIDEO_CODEC_ATTRIBUTE_FRAME_RATE_INT = "imsvt.video_codec_attribute_frame_rate_int";
        public static final java.lang.String KEY_VIDEO_CODEC_ATTRIBUTE_RESOLUTION_INT_ARRAY = "imsvt.video_codec_attribute_resolution_int_array";
        public static final java.lang.String KEY_H264_VIDEO_CODEC_ATTRIBUTE_PROFILE_LEVEL_ID_STRING = "imsvt.h264_video_codec_attribute_profile_level_id_string";
    }

    public static final class ImsWfc {
        public static final java.lang.String KEY_PREFIX = "imswfc.";
        public static final java.lang.String KEY_PIDF_SHORT_CODE_STRING_ARRAY = "imswfc.pidf_short_code_string_array";
        public static final java.lang.String KEY_EMERGENCY_CALL_OVER_EMERGENCY_PDN_BOOL = "imswfc.emergency_call_over_emergency_pdn_bool";
    }

    public static final class Iwlan {
        public static final java.lang.String KEY_PREFIX = "iwlan.";
        public static final java.lang.String KEY_CHILD_SA_REKEY_HARD_TIMER_SEC_INT = "iwlan.child_sa_rekey_hard_timer_sec_int";
        public static final java.lang.String KEY_CHILD_SA_REKEY_SOFT_TIMER_SEC_INT = "iwlan.child_sa_rekey_soft_timer_sec_int";
        public static final java.lang.String KEY_DIFFIE_HELLMAN_GROUPS_INT_ARRAY = "iwlan.diffie_hellman_groups_int_array";
        public static final java.lang.String KEY_DPD_TIMER_SEC_INT = "iwlan.dpd_timer_sec_int";
        public static final java.lang.String KEY_EPDG_AUTHENTICATION_METHOD_INT = "iwlan.epdg_authentication_method_int";
        public static final java.lang.String KEY_EPDG_ADDRESS_PRIORITY_INT_ARRAY = "iwlan.epdg_address_priority_int_array";
        public static final java.lang.String KEY_EPDG_STATIC_ADDRESS_STRING = "iwlan.epdg_static_address_string";
        public static final java.lang.String KEY_EPDG_STATIC_ADDRESS_ROAMING_STRING = "iwlan.epdg_static_address_roaming_string";
        public static final java.lang.String KEY_CHILD_SESSION_AES_CBC_KEY_SIZE_INT_ARRAY = "iwlan.child_session_aes_cbc_key_size_int_array";
        public static final java.lang.String KEY_CHILD_SESSION_AES_CTR_KEY_SIZE_INT_ARRAY = "iwlan.child_session_aes_ctr_key_size_int_array";
        public static final java.lang.String KEY_SUPPORTED_CHILD_SESSION_ENCRYPTION_ALGORITHMS_INT_ARRAY = "iwlan.supported_child_session_encryption_algorithms_int_array";
        public static final java.lang.String KEY_IKE_REKEY_HARD_TIMER_SEC_INT = "iwlan.ike_rekey_hard_timer_in_sec";
        public static final java.lang.String KEY_IKE_REKEY_SOFT_TIMER_SEC_INT = "iwlan.ike_rekey_soft_timer_sec_int";
        public static final java.lang.String KEY_IKE_SESSION_AES_CBC_KEY_SIZE_INT_ARRAY = "iwlan.ike_session_encryption_aes_cbc_key_size_int_array";
        public static final java.lang.String KEY_IKE_SESSION_AES_CTR_KEY_SIZE_INT_ARRAY = "iwlan.ike_session_encryption_aes_ctr_key_size_int_array";
        public static final java.lang.String KEY_SUPPORTED_IKE_SESSION_ENCRYPTION_ALGORITHMS_INT_ARRAY = "iwlan.supported_ike_session_encryption_algorithms_int_array";
        public static final java.lang.String KEY_SUPPORTED_INTEGRITY_ALGORITHMS_INT_ARRAY = "iwlan.supported_integrity_algorithms_int_array";
        public static final java.lang.String KEY_MAX_RETRIES_INT = "iwlan.max_retries_int";
        public static final java.lang.String KEY_NATT_KEEP_ALIVE_TIMER_SEC_INT = "iwlan.natt_keep_alive_timer_sec_int";
        public static final java.lang.String KEY_MCC_MNCS_STRING_ARRAY = "iwlan.mcc_mncs_string_array";
        public static final java.lang.String KEY_SUPPORTED_PRF_ALGORITHMS_INT_ARRAY = "iwlan.supported_prf_algorithms_int_array";
        public static final java.lang.String KEY_RETRANSMIT_TIMER_MSEC_INT_ARRAY = "iwlan.retransmit_timer_sec_int_array";
        public static final java.lang.String KEY_IKE_LOCAL_ID_TYPE_INT = "iwlan.ike_local_id_type_int";
        public static final java.lang.String KEY_IKE_REMOTE_ID_TYPE_INT = "iwlan.ike_remote_id_type_int";
        public static final java.lang.String KEY_ADD_KE_TO_CHILD_SESSION_REKEY_BOOL = "iwlan.add_ke_to_child_session_rekey_bool";
        public static final java.lang.String KEY_EPDG_PCO_ID_IPV6_INT = "iwlan.epdg_pco_id_ipv6_int";
        public static final java.lang.String KEY_EPDG_PCO_ID_IPV4_INT = "iwlan.epdg_pco_id_ipv4_int";
        public static final java.lang.String KEY_SUPPORTS_EAP_AKA_FAST_REAUTH_BOOL = "iwlan.supports_eap_aka_fast_reauth_bool";
        public static final int AUTHENTICATION_METHOD_EAP_ONLY = 0;
        public static final int AUTHENTICATION_METHOD_CERT = 1;
        public static final int EPDG_ADDRESS_STATIC = 0;
        public static final int EPDG_ADDRESS_PLMN = 1;
        public static final int EPDG_ADDRESS_PCO = 2;
        public static final int EPDG_ADDRESS_CELLULAR_LOC = 3;
        public static final int EPDG_ADDRESS_VISITED_COUNTRY = 4;
        public static final int ID_TYPE_FQDN = 2;
        public static final int ID_TYPE_RFC822_ADDR = 3;
        public static final int ID_TYPE_KEY_ID = 11;

        public static @interface AuthenticationMethodType {
        }

        public static @interface EpdgAddressType {
        }

        public static @interface IkeIdType {
        }
    }

    public static class OpportunisticNetwork {
        public static final java.lang.String PREFIX = "opportunistic.";
        public static final java.lang.String KEY_ENTRY_THRESHOLD_SS_RSRP_INT = "opportunistic.entry_threshold_ss_rsrp_int";
        public static final java.lang.String KEY_ENTRY_THRESHOLD_SS_RSRP_INT_BUNDLE = "opportunistic.entry_threshold_ss_rsrp_int_bundle";
        public static final java.lang.String KEY_ENTRY_THRESHOLD_SS_RSRQ_DOUBLE = "opportunistic.entry_threshold_ss_rsrq_double";
        public static final java.lang.String KEY_ENTRY_THRESHOLD_SS_RSRQ_DOUBLE_BUNDLE = "opportunistic.entry_threshold_ss_rsrq_double_bundle";
        public static final java.lang.String KEY_EXIT_THRESHOLD_SS_RSRP_INT = "opportunistic.exit_threshold_ss_rsrp_int";
        public static final java.lang.String KEY_EXIT_THRESHOLD_SS_RSRP_INT_BUNDLE = "opportunistic.exit_threshold_ss_rsrp_int_bundle";
        public static final java.lang.String KEY_EXIT_THRESHOLD_SS_RSRQ_DOUBLE = "opportunistic.exit_threshold_ss_rsrq_double";
        public static final java.lang.String KEY_EXIT_THRESHOLD_SS_RSRQ_DOUBLE_BUNDLE = "opportunistic.exit_threshold_ss_rsrq_double_bundle";
        public static final java.lang.String KEY_5G_DATA_SWITCH_HYSTERESIS_TIME_LONG = "opportunistic.5g_data_switch_hysteresis_time_long";
        public static final java.lang.String KEY_5G_DATA_SWITCH_HYSTERESIS_TIME_LONG_BUNDLE = "opportunistic.5g_data_switch_hysteresis_time_long_bundle";
        public static final java.lang.String KEY_5G_DATA_SWITCH_EXIT_HYSTERESIS_TIME_LONG = "opportunistic.5g_data_switch_exit_hysteresis_time_long";
        public static final java.lang.String KEY_5G_DATA_SWITCH_EXIT_HYSTERESIS_TIME_LONG_BUNDLE = "opportunistic.5g_data_switch_exit_hysteresis_time_long_bundle";
        public static final java.lang.String KEY_5G_BACKOFF_TIME_LONG = "opportunistic.5g_backoff_time_long";
        public static final java.lang.String KEY_5G_MAX_BACKOFF_TIME_LONG = "opportunistic.5g_max_backoff_time_long";
        public static final java.lang.String KEY_5G_PING_PONG_TIME_LONG = "opportunistic.5g_ping_pong_time_long";
        public OpportunisticNetwork() {}
    }

    @android.annotation.SystemApi
    public static final class Wifi {
        public static final java.lang.String KEY_PREFIX = "wifi.";
        public static final java.lang.String KEY_HOTSPOT_MAX_CLIENT_COUNT = "wifi.hotspot_maximum_client_count";
        public static final java.lang.String KEY_SUGGESTION_SSID_LIST_WITH_MAC_RANDOMIZATION_DISABLED = "wifi.suggestion_ssid_list_with_mac_randomization_disabled";
        public static final java.lang.String KEY_AVOID_5GHZ_SOFTAP_FOR_LAA_BOOL = "wifi.avoid_5ghz_softap_for_laa_bool";
        public static final java.lang.String KEY_AVOID_5GHZ_WIFI_DIRECT_FOR_LAA_BOOL = "wifi.avoid_5ghz_wifi_direct_for_laa_bool";
    }
}
