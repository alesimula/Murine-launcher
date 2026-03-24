package android.hardware.radio.network;

public @interface RegState {
    public static final int NOT_REG_MT_NOT_SEARCHING_OP = 0;
    public static final int REG_HOME = 1;
    public static final int NOT_REG_MT_SEARCHING_OP = 2;
    public static final int REG_DENIED = 3;
    public static final int UNKNOWN = 4;
    public static final int REG_ROAMING = 5;
    public static final int NOT_REG_MT_NOT_SEARCHING_OP_EM = 10;
    public static final int NOT_REG_MT_SEARCHING_OP_EM = 12;
    public static final int REG_DENIED_EM = 13;
    public static final int UNKNOWN_EM = 14;
    public static final int REG_EM = 20;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
