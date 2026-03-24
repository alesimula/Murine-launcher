package android.hardware.radio.ims;

public @interface SuggestedAction {
    public static final int NONE = 0;
    public static final int TRIGGER_PLMN_BLOCK = 1;
    public static final int TRIGGER_PLMN_BLOCK_WITH_TIMEOUT = 2;
    public static final int TRIGGER_RAT_BLOCK = 3;
    public static final int TRIGGER_CLEAR_RAT_BLOCKS = 4;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
