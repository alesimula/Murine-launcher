package android.security.metrics;

public @interface EcCurve {
    public static final int EC_CURVE_UNSPECIFIED = 0;
    public static final int P_224 = 1;
    public static final int P_256 = 2;
    public static final int P_384 = 3;
    public static final int P_521 = 4;
    public static final int CURVE_25519 = 5;
}
