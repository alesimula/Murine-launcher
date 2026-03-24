package android.view.inputmethod;

public abstract class HandwritingGesture {
    static final int GRANULARITY_UNDEFINED = 0;
    public static final int GRANULARITY_WORD = 1;
    public static final int GRANULARITY_CHARACTER = 2;
    public static final int GESTURE_TYPE_NONE = 0;
    public static final int GESTURE_TYPE_SELECT = 1;
    public static final int GESTURE_TYPE_INSERT = 2;
    public static final int GESTURE_TYPE_DELETE = 4;
    public static final int GESTURE_TYPE_REMOVE_SPACE = 8;
    public static final int GESTURE_TYPE_JOIN_OR_SPLIT = 16;
    public static final int GESTURE_TYPE_SELECT_RANGE = 32;
    public static final int GESTURE_TYPE_DELETE_RANGE = 64;
    public static final int GESTURE_TYPE_INSERT_MODE = 128;
    int mType;
    @android.annotation.Nullable
    java.lang.String mFallbackText;
    HandwritingGesture() {}
    public final int getGestureType() { return 0; }
    @android.annotation.Nullable
    public final java.lang.String getFallbackText() { return null; }
    @android.annotation.NonNull
    public final byte[] toByteArray() { return null; }
    @android.annotation.NonNull
    public static android.view.inputmethod.HandwritingGesture fromByteArray(byte[] p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface GestureType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GestureTypeFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Granularity {
    }
}
