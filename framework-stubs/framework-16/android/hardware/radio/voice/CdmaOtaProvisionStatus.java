package android.hardware.radio.voice;

public @interface CdmaOtaProvisionStatus {
    @java.lang.Deprecated
    public static final int SPL_UNLOCKED = 0;
    @java.lang.Deprecated
    public static final int SPC_RETRIES_EXCEEDED = 1;
    @java.lang.Deprecated
    public static final int A_KEY_EXCHANGED = 2;
    @java.lang.Deprecated
    public static final int SSD_UPDATED = 3;
    @java.lang.Deprecated
    public static final int NAM_DOWNLOADED = 4;
    @java.lang.Deprecated
    public static final int MDN_DOWNLOADED = 5;
    @java.lang.Deprecated
    public static final int IMSI_DOWNLOADED = 6;
    @java.lang.Deprecated
    public static final int PRL_DOWNLOADED = 7;
    @java.lang.Deprecated
    public static final int COMMITTED = 8;
    @java.lang.Deprecated
    public static final int OTAPA_STARTED = 9;
    @java.lang.Deprecated
    public static final int OTAPA_STOPPED = 10;
    @java.lang.Deprecated
    public static final int OTAPA_ABORTED = 11;

    public static interface $ {
        public static java.lang.String toString(int p0) { return null; }
        public static java.lang.String arrayToString(java.lang.Object p0) { return null; }
    }
}
