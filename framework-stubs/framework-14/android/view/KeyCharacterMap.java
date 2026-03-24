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
    public static final android.os.Parcelable.Creator<android.view.KeyCharacterMap> CREATOR = null;
    protected void finalize() throws java.lang.Throwable {}
    public static android.view.KeyCharacterMap obtainEmptyMap(int p0) { return null; }
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
    public boolean equals(java.lang.Object p0) { return false; }

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
        public int keyCode;
        public int metaState;
        public static android.view.KeyCharacterMap.FallbackAction obtain() { return null; }
        public void recycle() {}
    }
}
