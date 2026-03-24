package android.view;

public final class KeyboardShortcutInfo implements android.os.Parcelable {
    private final java.lang.CharSequence mLabel = null;
    private final android.graphics.drawable.Icon mIcon = null;
    private final char mBaseCharacter = 0;
    private final int mKeycode = 0;
    private final int mModifiers = 0;
    public static final android.os.Parcelable.Creator<android.view.KeyboardShortcutInfo> CREATOR = null;
    public KeyboardShortcutInfo(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, int p2, int p3) {}
    public KeyboardShortcutInfo(java.lang.CharSequence p0, int p1, int p2) {}
    public KeyboardShortcutInfo(java.lang.CharSequence p0, char p1, int p2) {}
    private KeyboardShortcutInfo(android.os.Parcel p0) {}
    public java.lang.CharSequence getLabel() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public int getKeycode() { return 0; }
    public char getBaseCharacter() { return 0; }
    public int getModifiers() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
