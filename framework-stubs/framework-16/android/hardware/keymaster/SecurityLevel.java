package android.hardware.keymaster;

public @interface SecurityLevel {
    public static final int SOFTWARE = 0;
    public static final int TRUSTED_ENVIRONMENT = 1;
    public static final int STRONGBOX = 2;
}
