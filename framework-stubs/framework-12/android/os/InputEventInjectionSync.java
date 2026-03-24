package android.os;

public @interface InputEventInjectionSync {
    public static final int NONE = 0;
    public static final int WAIT_FOR_RESULT = 1;
    public static final int WAIT_FOR_FINISHED = 2;
}
