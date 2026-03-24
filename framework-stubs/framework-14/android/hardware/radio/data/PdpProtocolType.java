package android.hardware.radio.data;

public @interface PdpProtocolType {
    public static final int UNKNOWN = -1;
    public static final int IP = 0;
    public static final int IPV6 = 1;
    public static final int IPV4V6 = 2;
    public static final int PPP = 3;
    public static final int NON_IP = 4;
    public static final int UNSTRUCTURED = 5;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
