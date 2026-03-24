package com.android.internal.inputmethod;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
public @interface StartInputReason {
    public static final int UNSPECIFIED = 0;
    public static final int WINDOW_FOCUS_GAIN = 1;
    public static final int WINDOW_FOCUS_GAIN_REPORT_WITH_CONNECTION = 2;
    public static final int WINDOW_FOCUS_GAIN_REPORT_WITHOUT_CONNECTION = 3;
    public static final int APP_CALLED_RESTART_INPUT_API = 4;
    public static final int CHECK_FOCUS = 5;
    public static final int BOUND_TO_IMMS = 6;
    public static final int UNBOUND_FROM_IMMS = 7;
    public static final int ACTIVATED_BY_IMMS = 8;
    public static final int DEACTIVATED_BY_IMMS = 9;
    public static final int SESSION_CREATED_BY_IME = 10;
}
