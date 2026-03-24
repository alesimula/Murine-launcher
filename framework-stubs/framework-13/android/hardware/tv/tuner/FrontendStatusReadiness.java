package android.hardware.tv.tuner;

public @interface FrontendStatusReadiness {
    public static final int UNDEFINED = 0;
    public static final int UNAVAILABLE = 1;
    public static final int UNSTABLE = 2;
    public static final int STABLE = 3;
    public static final int UNSUPPORTED = 4;
}
