package android.hardware.radio.ims;

public @interface ImsTrafficType {
    public static final int EMERGENCY = 0;
    public static final int EMERGENCY_SMS = 1;
    public static final int VOICE = 2;
    public static final int VIDEO = 3;
    public static final int SMS = 4;
    public static final int REGISTRATION = 5;
    public static final int UT_XCAP = 6;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
