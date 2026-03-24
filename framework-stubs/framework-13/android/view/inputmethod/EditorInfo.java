package android.view.inputmethod;

public class EditorInfo implements android.text.InputType, android.os.Parcelable {
    public int inputType;
    public static final int IME_MASK_ACTION = 255;
    public static final int IME_ACTION_UNSPECIFIED = 0;
    public static final int IME_ACTION_NONE = 1;
    public static final int IME_ACTION_GO = 2;
    public static final int IME_ACTION_SEARCH = 3;
    public static final int IME_ACTION_SEND = 4;
    public static final int IME_ACTION_NEXT = 5;
    public static final int IME_ACTION_DONE = 6;
    public static final int IME_ACTION_PREVIOUS = 7;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    public static final int IME_FLAG_NO_FULLSCREEN = 33554432;
    public static final int IME_FLAG_NAVIGATE_PREVIOUS = 67108864;
    public static final int IME_FLAG_NAVIGATE_NEXT = 134217728;
    public static final int IME_FLAG_NO_EXTRACT_UI = 268435456;
    public static final int IME_FLAG_NO_ACCESSORY_ACTION = 536870912;
    public static final int IME_FLAG_NO_ENTER_ACTION = 1073741824;
    public static final int IME_FLAG_FORCE_ASCII = -2147483648;
    public static final int IME_INTERNAL_FLAG_APP_WINDOW_PORTRAIT = 1;
    public static final int IME_NULL = 0;
    public int imeOptions;
    public java.lang.String privateImeOptions;
    public int internalImeOptions;
    public java.lang.CharSequence actionLabel;
    public int actionId;
    public int initialSelStart;
    public int initialSelEnd;
    public int initialCapsMode;
    public java.lang.CharSequence hintText;
    public java.lang.CharSequence label;
    public java.lang.String packageName;
    public android.view.autofill.AutofillId autofillId;
    public int fieldId;
    public java.lang.String fieldName;
    public android.os.Bundle extras;
    public android.os.LocaleList hintLocales;
    public java.lang.String[] contentMimeTypes;
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public android.os.UserHandle targetInputMethodUser;
    static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;
    static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.EditorInfo> CREATOR = null;
    public EditorInfo() {}
    public void setInitialSurroundingText(java.lang.CharSequence p0) {}
    public final void setInitialSurroundingTextInternal(android.view.inputmethod.SurroundingText p0) {}
    public void setInitialSurroundingSubText(java.lang.CharSequence p0, int p1) {}
    public java.lang.CharSequence getInitialTextBeforeCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getInitialSelectedText(int p0) { return null; }
    public java.lang.CharSequence getInitialTextAfterCursor(int p0, int p1) { return null; }
    public android.view.inputmethod.SurroundingText getInitialSurroundingText(int p0, int p1, int p2) { return null; }
    public final void makeCompatible(int p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public final android.view.inputmethod.EditorInfo createCopyInternal() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface TrimPolicy {
        public static final int HEAD = 0;
        public static final int TAIL = 1;
    }
}
