package android.hardware.radio.data;

public @interface ApnTypes {
    public static final int NONE = 0;
    public static final int DEFAULT = 1;
    public static final int MMS = 2;
    public static final int SUPL = 4;
    public static final int DUN = 8;
    public static final int HIPRI = 16;
    public static final int FOTA = 32;
    public static final int IMS = 64;
    public static final int CBS = 128;
    public static final int IA = 256;
    public static final int EMERGENCY = 512;
    public static final int MCX = 1024;
    public static final int XCAP = 2048;
    public static final int VSIM = 4096;
    public static final int BIP = 8192;
    public static final int ENTERPRISE = 16384;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
