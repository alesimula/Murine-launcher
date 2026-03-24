package android.hardware.radio.network;

public @interface NasProtocolMessage {
    public static final int UNKNOWN = 0;
    public static final int ATTACH_REQUEST = 1;
    public static final int IDENTITY_RESPONSE = 2;
    public static final int DETACH_REQUEST = 3;
    public static final int TRACKING_AREA_UPDATE_REQUEST = 4;
    public static final int LOCATION_UPDATE_REQUEST = 5;
    public static final int AUTHENTICATION_AND_CIPHERING_RESPONSE = 6;
    public static final int REGISTRATION_REQUEST = 7;
    public static final int DEREGISTRATION_REQUEST = 8;
    public static final int CM_REESTABLISHMENT_REQUEST = 9;
    public static final int CM_SERVICE_REQUEST = 10;
    public static final int IMSI_DETACH_INDICATION = 11;
    public static final int THREAT_IDENTIFIER_FALSE = 12;
    public static final int THREAT_IDENTIFIER_TRUE = 13;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
