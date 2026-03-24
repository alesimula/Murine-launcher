package android.hardware.radio.data;

public @interface ApnAuthType {
    public static final int NO_PAP_NO_CHAP = 0;
    public static final int PAP_NO_CHAP = 1;
    public static final int NO_PAP_CHAP = 2;
    public static final int PAP_CHAP = 3;
}
