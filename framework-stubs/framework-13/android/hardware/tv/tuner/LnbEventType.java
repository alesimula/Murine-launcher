package android.hardware.tv.tuner;

public @interface LnbEventType {
    public static final int DISEQC_RX_OVERFLOW = 0;
    public static final int DISEQC_RX_TIMEOUT = 1;
    public static final int DISEQC_RX_PARITY_ERROR = 2;
    public static final int LNB_OVERLOAD = 3;
}
