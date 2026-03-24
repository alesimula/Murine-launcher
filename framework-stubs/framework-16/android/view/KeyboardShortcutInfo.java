package android.view;

public final class KeyboardShortcutInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.KeyboardShortcutInfo> CREATOR = null;
    public KeyboardShortcutInfo(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, int p2, int p3) {}
    public KeyboardShortcutInfo(java.lang.CharSequence p0, int p1, int p2) {}
    public KeyboardShortcutInfo(java.lang.CharSequence p0, char p1, int p2) {}
    public KeyboardShortcutInfo(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, char p2, int p3) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getLabel() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Icon getIcon() { return null; }
    public void clearIcon() {}
    public int getKeycode() { return 0; }
    public char getBaseCharacter() { return 0; }
    public int getModifiers() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
