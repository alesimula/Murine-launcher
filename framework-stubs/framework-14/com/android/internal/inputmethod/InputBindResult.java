package com.android.internal.inputmethod;

public final class InputBindResult implements android.os.Parcelable {
    public final int result = 0;
    public final com.android.internal.inputmethod.IInputMethodSession method = null;
    public final android.util.SparseArray<com.android.internal.inputmethod.IAccessibilityInputMethodSession> accessibilitySessions = null;
    public final android.view.InputChannel channel = null;
    public final java.lang.String id = null;
    public final int sequence = 0;
    public final boolean isInputMethodSuppressingSpellChecker = false;
    public static final android.os.Parcelable.Creator<com.android.internal.inputmethod.InputBindResult> CREATOR = null;
    public static final com.android.internal.inputmethod.InputBindResult NULL = null;
    public static final com.android.internal.inputmethod.InputBindResult NO_IME = null;
    public static final com.android.internal.inputmethod.InputBindResult NO_EDITOR = null;
    public static final com.android.internal.inputmethod.InputBindResult INVALID_PACKAGE_NAME = null;
    public static final com.android.internal.inputmethod.InputBindResult NULL_EDITOR_INFO = null;
    public static final com.android.internal.inputmethod.InputBindResult NOT_IME_TARGET_WINDOW = null;
    public static final com.android.internal.inputmethod.InputBindResult IME_NOT_CONNECTED = null;
    public static final com.android.internal.inputmethod.InputBindResult INVALID_USER = null;
    public static final com.android.internal.inputmethod.InputBindResult DISPLAY_ID_MISMATCH = null;
    public static final com.android.internal.inputmethod.InputBindResult INVALID_DISPLAY_ID = null;
    public static final com.android.internal.inputmethod.InputBindResult USER_SWITCHING = null;
    public android.graphics.Matrix getVirtualDisplayToScreenMatrix() { return null; }
    public InputBindResult(int p0, com.android.internal.inputmethod.IInputMethodSession p1, android.util.SparseArray<com.android.internal.inputmethod.IAccessibilityInputMethodSession> p2, android.view.InputChannel p3, java.lang.String p4, int p5, android.graphics.Matrix p6, boolean p7) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
        public static final int SUCCESS_WITH_IME_SESSION = 0;
        public static final int SUCCESS_WAITING_IME_SESSION = 1;
        public static final int SUCCESS_WAITING_IME_BINDING = 2;
        public static final int SUCCESS_WAITING_USER_SWITCHING = 3;
        public static final int SUCCESS_REPORT_WINDOW_FOCUS_ONLY = 4;
        public static final int ERROR_NULL = 5;
        public static final int ERROR_NO_IME = 6;
        public static final int ERROR_INVALID_PACKAGE_NAME = 7;
        public static final int ERROR_SYSTEM_NOT_READY = 8;
        public static final int ERROR_IME_NOT_CONNECTED = 9;
        public static final int ERROR_INVALID_USER = 10;
        public static final int ERROR_NULL_EDITOR_INFO = 11;
        public static final int ERROR_NOT_IME_TARGET_WINDOW = 12;
        public static final int ERROR_NO_EDITOR = 13;
        public static final int ERROR_DISPLAY_ID_MISMATCH = 14;
        public static final int ERROR_INVALID_DISPLAY_ID = 15;
        public static final int SUCCESS_WITH_ACCESSIBILITY_SESSION = 16;
    }
}
