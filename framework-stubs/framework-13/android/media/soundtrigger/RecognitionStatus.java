package android.media.soundtrigger;

public @interface RecognitionStatus {
    public static final int INVALID = -1;
    public static final int SUCCESS = 0;
    public static final int ABORTED = 1;
    public static final int FAILURE = 2;
    public static final int FORCED = 3;
}
