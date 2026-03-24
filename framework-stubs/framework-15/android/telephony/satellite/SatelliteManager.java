package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
public final class SatelliteManager {
    public static final java.lang.String KEY_SATELLITE_ENABLED = "satellite_enabled";
    public static final java.lang.String KEY_DEMO_MODE_ENABLED = "demo_mode_enabled";
    public static final java.lang.String KEY_EMERGENCY_MODE_ENABLED = "emergency_mode_enabled";
    public static final java.lang.String KEY_SATELLITE_SUPPORTED = "satellite_supported";
    public static final java.lang.String KEY_SATELLITE_CAPABILITIES = "satellite_capabilities";
    public static final java.lang.String KEY_SESSION_STATS = "session_stats";
    public static final java.lang.String KEY_SATELLITE_PROVISIONED = "satellite_provisioned";
    public static final java.lang.String KEY_SATELLITE_COMMUNICATION_ALLOWED = "satellite_communication_allowed";
    public static final java.lang.String KEY_SATELLITE_NEXT_VISIBILITY = "satellite_next_visibility";
    public static final java.lang.String KEY_NTN_SIGNAL_STRENGTH = "ntn_signal_strength";
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_SUCCESS = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_ERROR = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_SERVER_ERROR = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_SERVICE_ERROR = 3;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_MODEM_ERROR = 4;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_NETWORK_ERROR = 5;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_INVALID_TELEPHONY_STATE = 6;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_INVALID_MODEM_STATE = 7;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_INVALID_ARGUMENTS = 8;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_REQUEST_FAILED = 9;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_RADIO_NOT_AVAILABLE = 10;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_REQUEST_NOT_SUPPORTED = 11;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_NO_RESOURCES = 12;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_SERVICE_NOT_PROVISIONED = 13;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_SERVICE_PROVISION_IN_PROGRESS = 14;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_REQUEST_ABORTED = 15;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_ACCESS_BARRED = 16;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_NETWORK_TIMEOUT = 17;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_NOT_REACHABLE = 18;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_NOT_AUTHORIZED = 19;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_NOT_SUPPORTED = 20;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_REQUEST_IN_PROGRESS = 21;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_MODEM_BUSY = 22;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_ILLEGAL_STATE = 23;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_MODEM_TIMEOUT = 24;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_LOCATION_DISABLED = 25;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_RESULT_LOCATION_NOT_AVAILABLE = 26;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NT_RADIO_TECHNOLOGY_UNKNOWN = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NT_RADIO_TECHNOLOGY_NB_IOT_NTN = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NT_RADIO_TECHNOLOGY_NR_NTN = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NT_RADIO_TECHNOLOGY_EMTC_NTN = 3;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int NT_RADIO_TECHNOLOGY_PROPRIETARY = 4;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DEVICE_HOLD_POSITION_UNKNOWN = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DEVICE_HOLD_POSITION_PORTRAIT = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DEVICE_HOLD_POSITION_LANDSCAPE_LEFT = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DEVICE_HOLD_POSITION_LANDSCAPE_RIGHT = 3;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DISPLAY_MODE_UNKNOWN = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DISPLAY_MODE_FIXED = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DISPLAY_MODE_OPENED = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DISPLAY_MODE_CLOSED = 3;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int EMERGENCY_CALL_TO_SATELLITE_HANDOVER_TYPE_SOS = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    public static final int EMERGENCY_CALL_TO_SATELLITE_HANDOVER_TYPE_T911 = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_IDLE = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SENDING = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SEND_SUCCESS = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SEND_FAILED = 3;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVING = 4;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_SUCCESS = 5;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_NONE = 6;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_FAILED = 7;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_WAITING_TO_CONNECT = 8;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_UNKNOWN = -1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_IDLE = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_LISTENING = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_DATAGRAM_TRANSFERRING = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_DATAGRAM_RETRYING = 3;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_OFF = 4;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_UNAVAILABLE = 5;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_NOT_CONNECTED = 6;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_CONNECTED = 7;
    public static final int SATELLITE_MODEM_STATE_ENABLING_SATELLITE = 8;
    public static final int SATELLITE_MODEM_STATE_DISABLING_SATELLITE = 9;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int SATELLITE_MODEM_STATE_UNKNOWN = -1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DATAGRAM_TYPE_UNKNOWN = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DATAGRAM_TYPE_SOS_MESSAGE = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static final int DATAGRAM_TYPE_LOCATION_SHARING = 2;
    public static final int DATAGRAM_TYPE_KEEP_ALIVE = 3;
    public static final int DATAGRAM_TYPE_LAST_SOS_MESSAGE_STILL_NEED_HELP = 4;
    public static final int DATAGRAM_TYPE_LAST_SOS_MESSAGE_NO_HELP_NEEDED = 5;
    public static final int SATELLITE_COMMUNICATION_RESTRICTION_REASON_USER = 0;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    public static final int SATELLITE_COMMUNICATION_RESTRICTION_REASON_GEOLOCATION = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    public static final int SATELLITE_COMMUNICATION_RESTRICTION_REASON_ENTITLEMENT = 2;
    public SatelliteManager(android.content.Context p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestEnabled(android.telephony.satellite.EnableRequestAttributes p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestIsEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestIsDemoModeEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestIsEmergencyModeEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestIsSupported(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestCapabilities(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.satellite.SatelliteCapabilities, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void startTransmissionUpdates(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1, android.telephony.satellite.SatelliteTransmissionUpdateCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void stopTransmissionUpdates(android.telephony.satellite.SatelliteTransmissionUpdateCallback p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void provisionService(java.lang.String p0, byte[] p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void deprovisionService(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int registerForProvisionStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteProvisionStateCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void unregisterForProvisionStateChanged(android.telephony.satellite.SatelliteProvisionStateCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestIsProvisioned(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int registerForModemStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteModemStateCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void unregisterForModemStateChanged(android.telephony.satellite.SatelliteModemStateCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int registerForIncomingDatagram(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteDatagramCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void unregisterForIncomingDatagram(android.telephony.satellite.SatelliteDatagramCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void pollPendingDatagrams(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void sendDatagram(int p0, android.telephony.satellite.SatelliteDatagram p1, boolean p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestIsCommunicationAllowedForCurrentLocation(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestTimeForNextSatelliteVisibility(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.time.Duration, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void setDeviceAlignedWithSatellite(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    public void requestAttachEnabledForCarrier(int p0, boolean p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    public void requestIsAttachEnabledForCarrier(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p2) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    public void addAttachRestrictionForCarrier(int p0, int p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    public void removeAttachRestrictionForCarrier(int p0, int p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getAttachRestrictionReasonsForCarrier(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestNtnSignalStrength(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.satellite.NtnSignalStrength, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void registerForNtnSignalStrengthChanged(java.util.concurrent.Executor p0, android.telephony.satellite.NtnSignalStrengthCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void unregisterForNtnSignalStrengthChanged(android.telephony.satellite.NtnSignalStrengthCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public int registerForCapabilitiesChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteCapabilitiesCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void unregisterForCapabilitiesChanged(android.telephony.satellite.SatelliteCapabilitiesCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.carrier_enabled_satellite_flag")
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSatellitePlmnsForCarrier(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSupportedStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteSupportedStateCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void unregisterForSupportedStateChanged(android.telephony.satellite.SatelliteSupportedStateCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForCommunicationAllowedStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteCommunicationAllowedStateCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void unregisterForCommunicationAllowedStateChanged(android.telephony.satellite.SatelliteCommunicationAllowedStateCallback p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.PACKAGE_USAGE_STATS", "android.permission.MODIFY_PHONE_STATE"})
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public void requestSessionStats(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.satellite.SatelliteSessionStats, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}

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
    public static @interface SatelliteDatagramTransferState {
    }

    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public static class SatelliteException extends java.lang.Exception {
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
        public SatelliteException(int p0) { super(); }
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
        public int getErrorCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteModemState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteResult {
    }
}
