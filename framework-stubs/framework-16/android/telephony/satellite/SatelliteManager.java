package android.telephony.satellite;

@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_state_change_listener")
public final class SatelliteManager {
    public static final java.lang.String KEY_SATELLITE_ENABLED = "satellite_enabled";
    public static final java.lang.String KEY_DEMO_MODE_ENABLED = "demo_mode_enabled";
    public static final java.lang.String KEY_EMERGENCY_MODE_ENABLED = "emergency_mode_enabled";
    public static final java.lang.String KEY_SATELLITE_SUPPORTED = "satellite_supported";
    public static final java.lang.String KEY_SATELLITE_CAPABILITIES = "satellite_capabilities";
    public static final java.lang.String KEY_SESSION_STATS = "session_stats";
    public static final java.lang.String KEY_SESSION_STATS_V2 = "session_stats_v2";
    public static final java.lang.String KEY_SATELLITE_PROVISIONED = "satellite_provisioned";
    public static final java.lang.String KEY_SATELLITE_COMMUNICATION_ALLOWED = "satellite_communication_allowed";
    public static final java.lang.String KEY_SATELLITE_NEXT_VISIBILITY = "satellite_next_visibility";
    public static final java.lang.String KEY_NTN_SIGNAL_STRENGTH = "ntn_signal_strength";
    public static final java.lang.String KEY_REQUEST_PROVISION_SUBSCRIBER_ID_TOKEN = "request_provision_subscriber_id";
    public static final java.lang.String KEY_PROVISION_SATELLITE_TOKENS = "provision_satellite";
    public static final java.lang.String KEY_DEPROVISION_SATELLITE_TOKENS = "deprovision_satellite";
    public static final java.lang.String KEY_SATELLITE_ACCESS_CONFIGURATION = "satellite_access_configuration";
    public static final java.lang.String KEY_SATELLITE_DISPLAY_NAME = "satellite_display_name";
    public static final java.lang.String KEY_SELECTED_NB_IOT_SATELLITE_SUBSCRIPTION_ID = "selected_nb_iot_satellite_subscription_id";
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_SUCCESS = 0;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_ERROR = 1;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_SERVER_ERROR = 2;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_SERVICE_ERROR = 3;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_MODEM_ERROR = 4;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_NETWORK_ERROR = 5;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_INVALID_TELEPHONY_STATE = 6;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_INVALID_MODEM_STATE = 7;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_INVALID_ARGUMENTS = 8;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_REQUEST_FAILED = 9;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_RADIO_NOT_AVAILABLE = 10;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_REQUEST_NOT_SUPPORTED = 11;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_NO_RESOURCES = 12;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_SERVICE_NOT_PROVISIONED = 13;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_SERVICE_PROVISION_IN_PROGRESS = 14;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_REQUEST_ABORTED = 15;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_ACCESS_BARRED = 16;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_NETWORK_TIMEOUT = 17;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_NOT_REACHABLE = 18;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_NOT_AUTHORIZED = 19;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_NOT_SUPPORTED = 20;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_REQUEST_IN_PROGRESS = 21;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_MODEM_BUSY = 22;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_ILLEGAL_STATE = 23;
    @android.annotation.SystemApi
    public static final int SATELLITE_RESULT_MODEM_TIMEOUT = 24;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_RESULT_LOCATION_DISABLED = 25;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_RESULT_LOCATION_NOT_AVAILABLE = 26;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_RESULT_EMERGENCY_CALL_IN_PROGRESS = 27;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_RESULT_DISABLE_IN_PROGRESS = 28;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_RESULT_ENABLE_IN_PROGRESS = 29;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_RESULT_NO_VALID_SATELLITE_SUBSCRIPTION = 30;
    @android.annotation.SystemApi
    public static final int NT_RADIO_TECHNOLOGY_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int NT_RADIO_TECHNOLOGY_NB_IOT_NTN = 1;
    @android.annotation.SystemApi
    public static final int NT_RADIO_TECHNOLOGY_NR_NTN = 2;
    @android.annotation.SystemApi
    public static final int NT_RADIO_TECHNOLOGY_EMTC_NTN = 3;
    @android.annotation.SystemApi
    public static final int NT_RADIO_TECHNOLOGY_PROPRIETARY = 4;
    @android.annotation.SystemApi
    public static final int DEVICE_HOLD_POSITION_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int DEVICE_HOLD_POSITION_PORTRAIT = 1;
    @android.annotation.SystemApi
    public static final int DEVICE_HOLD_POSITION_LANDSCAPE_LEFT = 2;
    @android.annotation.SystemApi
    public static final int DEVICE_HOLD_POSITION_LANDSCAPE_RIGHT = 3;
    @android.annotation.SystemApi
    public static final int DISPLAY_MODE_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int DISPLAY_MODE_FIXED = 1;
    @android.annotation.SystemApi
    public static final int DISPLAY_MODE_OPENED = 2;
    @android.annotation.SystemApi
    public static final int DISPLAY_MODE_CLOSED = 3;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_25q4_apis")
    public static final int SATELLITE_DATA_SUPPORT_UNKNOWN = -1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_25q4_apis")
    public static final int SATELLITE_DATA_SUPPORT_RESTRICTED = 0;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_25q4_apis")
    public static final int SATELLITE_DATA_SUPPORT_CONSTRAINED = 1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_25q4_apis")
    public static final int SATELLITE_DATA_SUPPORT_UNCONSTRAINED = 2;
    @android.annotation.SystemApi
    public static final int EMERGENCY_CALL_TO_SATELLITE_HANDOVER_TYPE_SOS = 1;
    @android.annotation.SystemApi
    public static final int EMERGENCY_CALL_TO_SATELLITE_HANDOVER_TYPE_T911 = 2;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final java.lang.String ACTION_SATELLITE_SUBSCRIBER_ID_LIST_CHANGED = "android.telephony.satellite.action.SATELLITE_SUBSCRIBER_ID_LIST_CHANGED";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final java.lang.String ACTION_SATELLITE_START_NON_EMERGENCY_SESSION = "android.telephony.satellite.action.SATELLITE_START_NON_EMERGENCY_SESSION";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final java.lang.String PROPERTY_SATELLITE_MANUAL_CONNECT_P2P_SUPPORT = "android.telephony.satellite.PROPERTY_SATELLITE_MANUAL_CONNECT_P2P_SUPPORT";
    public static final java.lang.String METADATA_SATELLITE_MANUAL_CONNECT_P2P_SUPPORT = "android.telephony.METADATA_SATELLITE_MANUAL_CONNECT_P2P_SUPPORT";
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_25q4_apis")
    public static final java.lang.String PROPERTY_SATELLITE_DATA_OPTIMIZED = "android.telephony.PROPERTY_SATELLITE_DATA_OPTIMIZED";
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_IDLE = 0;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SENDING = 1;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SEND_SUCCESS = 2;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SEND_FAILED = 3;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVING = 4;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_SUCCESS = 5;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_NONE = 6;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_FAILED = 7;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_WAITING_TO_CONNECT = 8;
    @android.annotation.SystemApi
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_IDLE = 0;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_LISTENING = 1;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_DATAGRAM_TRANSFERRING = 2;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_DATAGRAM_RETRYING = 3;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_OFF = 4;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_UNAVAILABLE = 5;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_NOT_CONNECTED = 6;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_CONNECTED = 7;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_MODEM_STATE_ENABLING_SATELLITE = 8;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_MODEM_STATE_DISABLING_SATELLITE = 9;
    @android.annotation.SystemApi
    public static final int SATELLITE_MODEM_STATE_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int DATAGRAM_TYPE_UNKNOWN = 0;
    @android.annotation.SystemApi
    public static final int DATAGRAM_TYPE_SOS_MESSAGE = 1;
    @android.annotation.SystemApi
    public static final int DATAGRAM_TYPE_LOCATION_SHARING = 2;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int DATAGRAM_TYPE_KEEP_ALIVE = 3;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int DATAGRAM_TYPE_LAST_SOS_MESSAGE_STILL_NEED_HELP = 4;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int DATAGRAM_TYPE_LAST_SOS_MESSAGE_NO_HELP_NEEDED = 5;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int DATAGRAM_TYPE_SMS = 6;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int DATAGRAM_TYPE_CHECK_PENDING_INCOMING_SMS = 7;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public static final int SATELLITE_COMMUNICATION_RESTRICTION_REASON_USER = 0;
    @android.annotation.SystemApi
    public static final int SATELLITE_COMMUNICATION_RESTRICTION_REASON_GEOLOCATION = 1;
    @android.annotation.SystemApi
    public static final int SATELLITE_COMMUNICATION_RESTRICTION_REASON_ENTITLEMENT = 2;
    public static final int SATELLITE_DISALLOWED_REASON_NOT_SUPPORTED = 0;
    public static final int SATELLITE_DISALLOWED_REASON_NOT_PROVISIONED = 1;
    public static final int SATELLITE_DISALLOWED_REASON_NOT_IN_ALLOWED_REGION = 2;
    public static final int SATELLITE_DISALLOWED_REASON_UNSUPPORTED_DEFAULT_MSG_APP = 3;
    public static final int SATELLITE_DISALLOWED_REASON_LOCATION_DISABLED = 4;
    public SatelliteManager(android.content.Context p0) {}
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_state_change_listener")
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_BASIC_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE", "carrier privileges"})
    public void registerStateChangeListener(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteStateChangeListener p1) {}
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_state_change_listener")
    @android.annotation.RequiresPermission(anyOf={"android.permission.READ_BASIC_PHONE_STATE", "android.permission.READ_PRIVILEGED_PHONE_STATE", "android.permission.READ_PHONE_STATE", "carrier privileges"})
    public void unregisterStateChangeListener(android.telephony.satellite.SatelliteStateChangeListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestEnabled(android.telephony.satellite.EnableRequestAttributes p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsDemoModeEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsEmergencyModeEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    public void requestIsSupported(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestCapabilities(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.satellite.SatelliteCapabilities, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void startTransmissionUpdates(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1, android.telephony.satellite.SatelliteTransmissionUpdateCallback p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void stopTransmissionUpdates(android.telephony.satellite.SatelliteTransmissionUpdateCallback p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void provisionService(java.lang.String p0, byte[] p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void deprovisionService(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForProvisionStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteProvisionStateCallback p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForProvisionStateChanged(android.telephony.satellite.SatelliteProvisionStateCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsProvisioned(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForModemStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteModemStateCallback p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForModemStateChanged(android.telephony.satellite.SatelliteModemStateCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForIncomingDatagram(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteDatagramCallback p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForIncomingDatagram(android.telephony.satellite.SatelliteDatagramCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void pollPendingDatagrams(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void sendDatagram(int p0, android.telephony.satellite.SatelliteDatagram p1, boolean p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsCommunicationAllowedForCurrentLocation(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public void requestSatelliteAccessConfigurationForCurrentLocation(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.satellite.SatelliteAccessConfiguration, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestTimeForNextSatelliteVisibility(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.time.Duration, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestSelectedNbIotSatelliteSubscriptionId(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Integer, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSelectedNbIotSatelliteSubscriptionChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SelectedNbIotSatelliteSubscriptionCallback p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForSelectedNbIotSatelliteSubscriptionChanged(android.telephony.satellite.SelectedNbIotSatelliteSubscriptionCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void setDeviceAlignedWithSatellite(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestAttachEnabledForCarrier(int p0, boolean p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsAttachEnabledForCarrier(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void addAttachRestrictionForCarrier(int p0, int p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void removeAttachRestrictionForCarrier(int p0, int p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getAttachRestrictionReasonsForCarrier(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.NonNull
    public int[] getSatelliteDisallowedReasons() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public void registerForSatelliteDisallowedReasonsChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteDisallowedReasonsCallback p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public void unregisterForSatelliteDisallowedReasonsChanged(android.telephony.satellite.SatelliteDisallowedReasonsCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestNtnSignalStrength(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.satellite.NtnSignalStrength, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void registerForNtnSignalStrengthChanged(java.util.concurrent.Executor p0, android.telephony.satellite.NtnSignalStrengthCallback p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForNtnSignalStrengthChanged(android.telephony.satellite.NtnSignalStrengthCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForCapabilitiesChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteCapabilitiesCallback p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForCapabilitiesChanged(android.telephony.satellite.SatelliteCapabilitiesCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSatellitePlmnsForCarrier(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSupportedStateChanged(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public void unregisterForSupportedStateChanged(java.util.function.Consumer<java.lang.Boolean> p0) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForCommunicationAccessStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteCommunicationAccessStateCallback p1) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public void unregisterForCommunicationAccessStateChanged(android.telephony.satellite.SatelliteCommunicationAccessStateCallback p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.PACKAGE_USAGE_STATS", "android.permission.MODIFY_PHONE_STATE"})
    public void requestSessionStats(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.satellite.SatelliteSessionStats, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public void requestSatelliteSubscriberProvisionStatus(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.util.List<android.telephony.satellite.SatelliteSubscriberProvisionStatus>, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestSatelliteDisplayName(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.CharSequence, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public void provisionSatellite(java.util.List<android.telephony.satellite.SatelliteSubscriberInfo> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telephony.satellite.SatelliteManager.SatelliteException> p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
    public void deprovisionSatellite(java.util.List<android.telephony.satellite.SatelliteSubscriberInfo> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.telephony.satellite.SatelliteManager.SatelliteException> p2) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.SATELLITE_COMMUNICATION", "android.permission.SEND_SMS"})
    public void setNtnSmsSupported(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_25q4_apis")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSatelliteDataOptimizedApps() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_25q4_apis")
    public int getSatelliteDataSupportMode(int p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DatagramType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceHoldPosition {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NTRadioTechnology {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteCommunicationRestrictionReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteDataSupportMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteDatagramTransferState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteDisallowedReason {
    }

    @android.annotation.SystemApi
    public static class SatelliteException extends java.lang.Exception {
        public SatelliteException(int p0) { super(); }
        public int getErrorCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteModemState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteResult {
    }
}
