package android.hardware.radio;

public @interface RadioAccessFamily {
    public static final int UNKNOWN = 1;
    public static final int GPRS = 2;
    public static final int EDGE = 4;
    public static final int UMTS = 8;
    @java.lang.Deprecated
    public static final int IS95A = 16;
    @java.lang.Deprecated
    public static final int IS95B = 32;
    @java.lang.Deprecated
    public static final int ONE_X_RTT = 64;
    @java.lang.Deprecated
    public static final int EVDO_0 = 128;
    @java.lang.Deprecated
    public static final int EVDO_A = 256;
    public static final int HSDPA = 512;
    public static final int HSUPA = 1024;
    public static final int HSPA = 2048;
    @java.lang.Deprecated
    public static final int EVDO_B = 4096;
    @java.lang.Deprecated
    public static final int EHRPD = 8192;
    public static final int LTE = 16384;
    public static final int HSPAP = 32768;
    public static final int GSM = 65536;
    public static final int TD_SCDMA = 131072;
    public static final int IWLAN = 262144;
    @java.lang.Deprecated
    public static final int LTE_CA = 524288;
    public static final int NR = 1048576;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
