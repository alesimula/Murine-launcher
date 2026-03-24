package android.hardware.radio.data;

public @interface DataNetworkState {
    public static final int UNKNOWN = -1;
    public static final int DISCONNECTED = 0;
    public static final int CONNECTING = 1;
    public static final int CONNECTED = 2;
    public static final int DISCONNECTING = 4;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
