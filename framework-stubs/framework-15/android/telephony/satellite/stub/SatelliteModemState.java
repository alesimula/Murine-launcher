package android.telephony.satellite.stub;

public @interface SatelliteModemState {
    public static final int SATELLITE_MODEM_STATE_IDLE = 0;
    public static final int SATELLITE_MODEM_STATE_LISTENING = 1;
    public static final int SATELLITE_MODEM_STATE_DATAGRAM_TRANSFERRING = 2;
    public static final int SATELLITE_MODEM_STATE_DATAGRAM_RETRYING = 3;
    public static final int SATELLITE_MODEM_STATE_OFF = 4;
    public static final int SATELLITE_MODEM_STATE_UNAVAILABLE = 5;
    public static final int SATELLITE_MODEM_STATE_NOT_CONNECTED = 6;
    public static final int SATELLITE_MODEM_STATE_CONNECTED = 7;
    public static final int SATELLITE_MODEM_STATE_UNKNOWN = -1;
}
