package android.telephony.satellite.stub;

public @interface SatelliteError {
    public static final int ERROR_NONE = 0;
    public static final int SATELLITE_ERROR = 1;
    public static final int SERVER_ERROR = 2;
    public static final int SERVICE_ERROR = 3;
    public static final int MODEM_ERROR = 4;
    public static final int NETWORK_ERROR = 5;
    public static final int INVALID_TELEPHONY_STATE = 6;
    public static final int INVALID_MODEM_STATE = 7;
    public static final int INVALID_ARGUMENTS = 8;
    public static final int REQUEST_FAILED = 9;
    public static final int RADIO_NOT_AVAILABLE = 10;
    public static final int REQUEST_NOT_SUPPORTED = 11;
    public static final int NO_RESOURCES = 12;
    public static final int SERVICE_NOT_PROVISIONED = 13;
    public static final int SERVICE_PROVISION_IN_PROGRESS = 14;
    public static final int REQUEST_ABORTED = 15;
    public static final int SATELLITE_ACCESS_BARRED = 16;
    public static final int NETWORK_TIMEOUT = 17;
    public static final int SATELLITE_NOT_REACHABLE = 18;
    public static final int NOT_AUTHORIZED = 19;
}
