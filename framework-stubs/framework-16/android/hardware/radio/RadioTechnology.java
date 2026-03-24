package android.hardware.radio;

public @interface RadioTechnology {
    public static final int UNKNOWN = 0;
    public static final int GPRS = 1;
    public static final int EDGE = 2;
    public static final int UMTS = 3;
    @java.lang.Deprecated
    public static final int IS95A = 4;
    @java.lang.Deprecated
    public static final int IS95B = 5;
    @java.lang.Deprecated
    public static final int ONE_X_RTT = 6;
    @java.lang.Deprecated
    public static final int EVDO_0 = 7;
    @java.lang.Deprecated
    public static final int EVDO_A = 8;
    public static final int HSDPA = 9;
    public static final int HSUPA = 10;
    public static final int HSPA = 11;
    @java.lang.Deprecated
    public static final int EVDO_B = 12;
    @java.lang.Deprecated
    public static final int EHRPD = 13;
    public static final int LTE = 14;
    public static final int HSPAP = 15;
    public static final int GSM = 16;
    public static final int TD_SCDMA = 17;
    public static final int IWLAN = 18;
    @java.lang.Deprecated
    public static final int LTE_CA = 19;
    public static final int NR = 20;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
