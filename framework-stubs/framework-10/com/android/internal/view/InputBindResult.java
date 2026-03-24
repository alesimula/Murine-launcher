package com.android.internal.view;

public final class InputBindResult implements android.os.Parcelable {
    public final int result = 0;
    @android.annotation.UnsupportedAppUsage
    public final com.android.internal.view.IInputMethodSession method = null;
    public final android.view.InputChannel channel = null;
    public final java.lang.String id = null;
    public final int sequence = 0;
    private final float[] mActivityViewToScreenMatrixValues = null;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<com.android.internal.view.InputBindResult> CREATOR = null;
    public static final com.android.internal.view.InputBindResult NULL = null;
    public static final com.android.internal.view.InputBindResult NO_IME = null;
    public static final com.android.internal.view.InputBindResult NO_EDITOR = null;
    public static final com.android.internal.view.InputBindResult INVALID_PACKAGE_NAME = null;
    public static final com.android.internal.view.InputBindResult NULL_EDITOR_INFO = null;
    public static final com.android.internal.view.InputBindResult NOT_IME_TARGET_WINDOW = null;
    public static final com.android.internal.view.InputBindResult IME_NOT_CONNECTED = null;
    public static final com.android.internal.view.InputBindResult INVALID_USER = null;
    public static final com.android.internal.view.InputBindResult DISPLAY_ID_MISMATCH = null;
    public static final com.android.internal.view.InputBindResult INVALID_DISPLAY_ID = null;
    public static final com.android.internal.view.InputBindResult INVALID_CLIENT = null;
    public android.graphics.Matrix getActivityViewToScreenMatrix() { return null; }
    public InputBindResult(int p0, com.android.internal.view.IInputMethodSession p1, android.view.InputChannel p2, java.lang.String p3, int p4, android.graphics.Matrix p5) {}
    InputBindResult(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String getResultString() { return null; }
    private static com.android.internal.view.InputBindResult error(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
        public static final int SUCCESS_WITH_IME_SESSION = 0;
        public static final int SUCCESS_WAITING_IME_SESSION = 1;
        public static final int SUCCESS_WAITING_IME_BINDING = 2;
        public static final int SUCCESS_REPORT_WINDOW_FOCUS_ONLY = 3;
        public static final int ERROR_NULL = 4;
        public static final int ERROR_NO_IME = 5;
        public static final int ERROR_INVALID_PACKAGE_NAME = 6;
        public static final int ERROR_SYSTEM_NOT_READY = 7;
        public static final int ERROR_IME_NOT_CONNECTED = 8;
        public static final int ERROR_INVALID_USER = 9;
        public static final int ERROR_NULL_EDITOR_INFO = 10;
        public static final int ERROR_NOT_IME_TARGET_WINDOW = 11;
        public static final int ERROR_NO_EDITOR = 12;
        public static final int ERROR_DISPLAY_ID_MISMATCH = 13;
        public static final int ERROR_INVALID_DISPLAY_ID = 14;
        public static final int ERROR_INVALID_CLIENT = 15;
    }
}
