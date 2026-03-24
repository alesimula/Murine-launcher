package android.hardware.radio.network;

public @interface IndicationFilter {
    public static final int NONE = 0;
    public static final int ALL = -1;
    public static final int SIGNAL_STRENGTH = 1;
    public static final int FULL_NETWORK_STATE = 2;
    public static final int DATA_CALL_DORMANCY_CHANGED = 4;
    public static final int LINK_CAPACITY_ESTIMATE = 8;
    public static final int PHYSICAL_CHANNEL_CONFIG = 16;
    public static final int REGISTRATION_FAILURE = 32;
    public static final int BARRING_INFO = 64;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
