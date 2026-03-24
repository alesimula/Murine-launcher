package android.view;

public class KeyCharacterMap implements android.os.Parcelable {
    @java.lang.Deprecated
    public static final int BUILT_IN_KEYBOARD = 0;
    public static final int VIRTUAL_KEYBOARD = -1;
    public static final int NUMERIC = 1;
    public static final int PREDICTIVE = 2;
    public static final int ALPHA = 3;
    public static final int FULL = 4;
    public static final int SPECIAL_FUNCTION = 5;
    public static final char HEX_INPUT = (char)0xef00;
    public static final char PICKER_DIALOG_INPUT = (char)0xef01;
    public static final int MODIFIER_BEHAVIOR_CHORDED = 0;
    public static final int MODIFIER_BEHAVIOR_CHORDED_OR_TOGGLED = 1;
    public static final int COMBINING_ACCENT = -2147483648;
    public static final int COMBINING_ACCENT_MASK = 2147483647;
    private static final int ACCENT_ACUTE = 180;
    private static final int ACCENT_BREVE = 728;
    private static final int ACCENT_CARON = 711;
    private static final int ACCENT_CEDILLA = 184;
    private static final int ACCENT_CIRCUMFLEX = 710;
    private static final int ACCENT_COMMA_ABOVE = 8125;
    private static final int ACCENT_COMMA_ABOVE_RIGHT = 700;
    private static final int ACCENT_DOT_ABOVE = 729;
    private static final int ACCENT_DOT_BELOW = 46;
    private static final int ACCENT_DOUBLE_ACUTE = 733;
    private static final int ACCENT_GRAVE = 715;
    private static final int ACCENT_HOOK_ABOVE = 704;
    private static final int ACCENT_HORN = 39;
    private static final int ACCENT_MACRON = 175;
    private static final int ACCENT_MACRON_BELOW = 717;
    private static final int ACCENT_OGONEK = 731;
    private static final int ACCENT_REVERSED_COMMA_ABOVE = 701;
    private static final int ACCENT_RING_ABOVE = 730;
    private static final int ACCENT_STROKE = 45;
    private static final int ACCENT_TILDE = 732;
    private static final int ACCENT_TURNED_COMMA_ABOVE = 699;
    private static final int ACCENT_UMLAUT = 168;
    private static final int ACCENT_VERTICAL_LINE_ABOVE = 712;
    private static final int ACCENT_VERTICAL_LINE_BELOW = 716;
    private static final int ACCENT_GRAVE_LEGACY = 96;
    private static final int ACCENT_CIRCUMFLEX_LEGACY = 94;
    private static final int ACCENT_TILDE_LEGACY = 126;
    private static final int CHAR_SPACE = 32;
    private static final android.util.SparseIntArray sCombiningToAccent = null;
    private static final android.util.SparseIntArray sAccentToCombining = null;
    private static final android.util.SparseIntArray sDeadKeyCache = null;
    private static final java.lang.StringBuilder sDeadKeyBuilder = null;
    public static final android.os.Parcelable.Creator<android.view.KeyCharacterMap> CREATOR = null;
    private long mPtr;
    private static void addCombining(int p0, int p1) {}
    private static void addDeadKey(int p0, int p1, int p2) {}
    private static native long nativeReadFromParcel(android.os.Parcel p0);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    private static native void nativeDispose(long p0);
    private static native char nativeGetCharacter(long p0, int p1, int p2);
    private static native boolean nativeGetFallbackAction(long p0, int p1, int p2, android.view.KeyCharacterMap.FallbackAction p3);
    private static native char nativeGetNumber(long p0, int p1);
    private static native char nativeGetMatch(long p0, int p1, char[] p2, int p3);
    private static native char nativeGetDisplayLabel(long p0, int p1);
    private static native int nativeGetKeyboardType(long p0);
    private static native android.view.KeyEvent[] nativeGetEvents(long p0, char[] p1);
    private KeyCharacterMap(android.os.Parcel p0) {}
    @android.annotation.UnsupportedAppUsage
    private KeyCharacterMap(long p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public static android.view.KeyCharacterMap load(int p0) { return null; }
    public int get(int p0, int p1) { return 0; }
    public android.view.KeyCharacterMap.FallbackAction getFallbackAction(int p0, int p1) { return null; }
    public char getNumber(int p0) { return 0; }
    public char getMatch(int p0, char[] p1) { return 0; }
    public char getMatch(int p0, char[] p1, int p2) { return 0; }
    public char getDisplayLabel(int p0) { return 0; }
    public static int getDeadChar(int p0, int p1) { return 0; }
    @java.lang.Deprecated
    public boolean getKeyData(int p0, android.view.KeyCharacterMap.KeyData p1) { return false; }
    public android.view.KeyEvent[] getEvents(char[] p0) { return null; }
    public boolean isPrintingKey(int p0) { return false; }
    public int getKeyboardType() { return 0; }
    public int getModifierBehavior() { return 0; }
    public static boolean deviceHasKey(int p0) { return false; }
    public static boolean[] deviceHasKeys(int[] p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static class UnavailableException extends android.util.AndroidRuntimeException {
        public UnavailableException(java.lang.String p0) { super(); }
    }

    @java.lang.Deprecated
    public static class KeyData {
        public static final int META_LENGTH = 4;
        public char displayLabel;
        public char number;
        public char[] meta;
        public KeyData() {}
    }

    public static final class FallbackAction {
        private static final int MAX_RECYCLED = 10;
        private static final java.lang.Object sRecycleLock = null;
        private static android.view.KeyCharacterMap.FallbackAction sRecycleBin;
        private static int sRecycledCount;
        private android.view.KeyCharacterMap.FallbackAction next;
        @android.annotation.UnsupportedAppUsage
        public int keyCode;
        @android.annotation.UnsupportedAppUsage
        public int metaState;
        private FallbackAction() {}
        public static android.view.KeyCharacterMap.FallbackAction obtain() { return null; }
        public void recycle() {}
    }
}
