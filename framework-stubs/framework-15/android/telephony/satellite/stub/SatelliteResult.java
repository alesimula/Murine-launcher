package android.telephony.satellite.stub;

public @interface SatelliteResult {
    public static final int SATELLITE_RESULT_SUCCESS = 0;
    public static final int SATELLITE_RESULT_ERROR = 1;
    public static final int SATELLITE_RESULT_SERVER_ERROR = 2;
    public static final int SATELLITE_RESULT_SERVICE_ERROR = 3;
    public static final int SATELLITE_RESULT_MODEM_ERROR = 4;
    public static final int SATELLITE_RESULT_NETWORK_ERROR = 5;
    public static final int SATELLITE_RESULT_INVALID_MODEM_STATE = 6;
    public static final int SATELLITE_RESULT_INVALID_ARGUMENTS = 7;
    public static final int SATELLITE_RESULT_REQUEST_FAILED = 8;
    public static final int SATELLITE_RESULT_RADIO_NOT_AVAILABLE = 9;
    public static final int SATELLITE_RESULT_REQUEST_NOT_SUPPORTED = 10;
    public static final int SATELLITE_RESULT_NO_RESOURCES = 11;
    public static final int SATELLITE_RESULT_SERVICE_NOT_PROVISIONED = 12;
    public static final int SATELLITE_RESULT_SERVICE_PROVISION_IN_PROGRESS = 13;
    public static final int SATELLITE_RESULT_REQUEST_ABORTED = 14;
    public static final int SATELLITE_RESULT_ACCESS_BARRED = 15;
    public static final int SATELLITE_RESULT_NETWORK_TIMEOUT = 16;
    public static final int SATELLITE_RESULT_NOT_REACHABLE = 17;
    public static final int SATELLITE_RESULT_NOT_AUTHORIZED = 18;
}
