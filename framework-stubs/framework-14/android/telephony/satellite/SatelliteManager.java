package android.telephony.satellite;

public class SatelliteManager {
    public static final java.lang.String KEY_SATELLITE_ENABLED = "satellite_enabled";
    public static final java.lang.String KEY_DEMO_MODE_ENABLED = "demo_mode_enabled";
    public static final java.lang.String KEY_SATELLITE_SUPPORTED = "satellite_supported";
    public static final java.lang.String KEY_SATELLITE_CAPABILITIES = "satellite_capabilities";
    public static final java.lang.String KEY_SATELLITE_PROVISIONED = "satellite_provisioned";
    public static final java.lang.String KEY_SATELLITE_COMMUNICATION_ALLOWED = "satellite_communication_allowed";
    public static final java.lang.String KEY_SATELLITE_NEXT_VISIBILITY = "satellite_next_visibility";
    public static final int SATELLITE_ERROR_NONE = 0;
    public static final int SATELLITE_ERROR = 1;
    public static final int SATELLITE_SERVER_ERROR = 2;
    public static final int SATELLITE_SERVICE_ERROR = 3;
    public static final int SATELLITE_MODEM_ERROR = 4;
    public static final int SATELLITE_NETWORK_ERROR = 5;
    public static final int SATELLITE_INVALID_TELEPHONY_STATE = 6;
    public static final int SATELLITE_INVALID_MODEM_STATE = 7;
    public static final int SATELLITE_INVALID_ARGUMENTS = 8;
    public static final int SATELLITE_REQUEST_FAILED = 9;
    public static final int SATELLITE_RADIO_NOT_AVAILABLE = 10;
    public static final int SATELLITE_REQUEST_NOT_SUPPORTED = 11;
    public static final int SATELLITE_NO_RESOURCES = 12;
    public static final int SATELLITE_SERVICE_NOT_PROVISIONED = 13;
    public static final int SATELLITE_SERVICE_PROVISION_IN_PROGRESS = 14;
    public static final int SATELLITE_REQUEST_ABORTED = 15;
    public static final int SATELLITE_ACCESS_BARRED = 16;
    public static final int SATELLITE_NETWORK_TIMEOUT = 17;
    public static final int SATELLITE_NOT_REACHABLE = 18;
    public static final int SATELLITE_NOT_AUTHORIZED = 19;
    public static final int SATELLITE_NOT_SUPPORTED = 20;
    public static final int SATELLITE_REQUEST_IN_PROGRESS = 21;
    public static final int SATELLITE_MODEM_BUSY = 22;
    public static final int NT_RADIO_TECHNOLOGY_UNKNOWN = 0;
    public static final int NT_RADIO_TECHNOLOGY_NB_IOT_NTN = 1;
    public static final int NT_RADIO_TECHNOLOGY_NR_NTN = 2;
    public static final int NT_RADIO_TECHNOLOGY_EMTC_NTN = 3;
    public static final int NT_RADIO_TECHNOLOGY_PROPRIETARY = 4;
    public static final int DEVICE_HOLD_POSITION_UNKNOWN = 0;
    public static final int DEVICE_HOLD_POSITION_PORTRAIT = 1;
    public static final int DEVICE_HOLD_POSITION_LANDSCAPE_LEFT = 2;
    public static final int DEVICE_HOLD_POSITION_LANDSCAPE_RIGHT = 3;
    public static final int DISPLAY_MODE_UNKNOWN = 0;
    public static final int DISPLAY_MODE_FIXED = 1;
    public static final int DISPLAY_MODE_OPENED = 2;
    public static final int DISPLAY_MODE_CLOSED = 3;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_IDLE = 0;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SENDING = 1;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SEND_SUCCESS = 2;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_SEND_FAILED = 3;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVING = 4;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_SUCCESS = 5;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_NONE = 6;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_RECEIVE_FAILED = 7;
    public static final int SATELLITE_DATAGRAM_TRANSFER_STATE_UNKNOWN = -1;
    public static final int SATELLITE_MODEM_STATE_IDLE = 0;
    public static final int SATELLITE_MODEM_STATE_LISTENING = 1;
    public static final int SATELLITE_MODEM_STATE_DATAGRAM_TRANSFERRING = 2;
    public static final int SATELLITE_MODEM_STATE_DATAGRAM_RETRYING = 3;
    public static final int SATELLITE_MODEM_STATE_OFF = 4;
    public static final int SATELLITE_MODEM_STATE_UNAVAILABLE = 5;
    public static final int SATELLITE_MODEM_STATE_UNKNOWN = -1;
    public static final int DATAGRAM_TYPE_UNKNOWN = 0;
    public static final int DATAGRAM_TYPE_SOS_MESSAGE = 1;
    public static final int DATAGRAM_TYPE_LOCATION_SHARING = 2;
    public SatelliteManager(android.content.Context p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestSatelliteEnabled(boolean p0, boolean p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Integer> p3) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsSatelliteEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsDemoModeEnabled(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    public void requestIsSatelliteSupported(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestSatelliteCapabilities(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.telephony.satellite.SatelliteCapabilities, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void startSatelliteTransmissionUpdates(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1, android.telephony.satellite.SatelliteTransmissionUpdateCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void stopSatelliteTransmissionUpdates(android.telephony.satellite.SatelliteTransmissionUpdateCallback p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void provisionSatelliteService(java.lang.String p0, byte[] p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void deprovisionSatelliteService(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Integer> p2) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSatelliteProvisionStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteProvisionStateCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForSatelliteProvisionStateChanged(android.telephony.satellite.SatelliteProvisionStateCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsSatelliteProvisioned(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSatelliteModemStateChanged(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteStateCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForSatelliteModemStateChanged(android.telephony.satellite.SatelliteStateCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public int registerForSatelliteDatagram(java.util.concurrent.Executor p0, android.telephony.satellite.SatelliteDatagramCallback p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void unregisterForSatelliteDatagram(android.telephony.satellite.SatelliteDatagramCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void pollPendingSatelliteDatagrams(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void sendSatelliteDatagram(int p0, android.telephony.satellite.SatelliteDatagram p1, boolean p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestIsSatelliteCommunicationAllowedForCurrentLocation(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Boolean, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void requestTimeForNextSatelliteVisibility(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.time.Duration, android.telephony.satellite.SatelliteManager.SatelliteException> p1) {}
    @android.annotation.RequiresPermission("android.permission.SATELLITE_COMMUNICATION")
    public void onDeviceAlignedWithSatellite(boolean p0) {}

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
    public static @interface SatelliteDatagramTransferState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteError {
    }

    public static class SatelliteException extends java.lang.Exception {
        public SatelliteException(int p0) { super(); }
        public int getErrorCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SatelliteModemState {
    }
}
