package com.android.internal.inputmethod;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface StartInputFlags {
    public static final int VIEW_HAS_FOCUS = 1;
    public static final int IS_TEXT_EDITOR = 2;
    public static final int INITIAL_CONNECTION = 4;
    public static final int WINDOW_GAINED_FOCUS = 8;
}
