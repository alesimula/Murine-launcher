package android.hardware.radio.voice;

public @interface CdmaOtaProvisionStatus {
    public static final int SPL_UNLOCKED = 0;
    public static final int SPC_RETRIES_EXCEEDED = 1;
    public static final int A_KEY_EXCHANGED = 2;
    public static final int SSD_UPDATED = 3;
    public static final int NAM_DOWNLOADED = 4;
    public static final int MDN_DOWNLOADED = 5;
    public static final int IMSI_DOWNLOADED = 6;
    public static final int PRL_DOWNLOADED = 7;
    public static final int COMMITTED = 8;
    public static final int OTAPA_STARTED = 9;
    public static final int OTAPA_STOPPED = 10;
    public static final int OTAPA_ABORTED = 11;
}
