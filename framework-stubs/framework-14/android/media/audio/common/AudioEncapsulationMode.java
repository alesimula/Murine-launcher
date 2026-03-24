package android.media.audio.common;

public @interface AudioEncapsulationMode {
    public static final byte INVALID = -1;
    public static final byte NONE = 0;
    public static final byte ELEMENTARY_STREAM = 1;
    public static final byte HANDLE = 2;
}
