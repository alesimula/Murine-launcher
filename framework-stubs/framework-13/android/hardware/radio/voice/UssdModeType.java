package android.hardware.radio.voice;

public @interface UssdModeType {
    public static final int NOTIFY = 0;
    public static final int REQUEST = 1;
    public static final int NW_RELEASE = 2;
    public static final int LOCAL_CLIENT = 3;
    public static final int NOT_SUPPORTED = 4;
    public static final int NW_TIMEOUT = 5;
}
