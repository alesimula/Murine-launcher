package android.media;

public @interface AudioUniqueIdUse {
    public static final int UNSPECIFIED = 0;
    public static final int SESSION = 1;
    public static final int MODULE = 2;
    public static final int EFFECT = 3;
    public static final int PATCH = 4;
    public static final int OUTPUT = 5;
    public static final int INPUT = 6;
    public static final int CLIENT = 7;
}
