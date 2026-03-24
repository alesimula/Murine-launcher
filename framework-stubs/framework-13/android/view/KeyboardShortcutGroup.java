package android.view;

public final class KeyboardShortcutGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.KeyboardShortcutGroup> CREATOR = null;
    public KeyboardShortcutGroup(java.lang.CharSequence p0, java.util.List<android.view.KeyboardShortcutInfo> p1) {}
    public KeyboardShortcutGroup(java.lang.CharSequence p0) {}
    public KeyboardShortcutGroup(java.lang.CharSequence p0, java.util.List<android.view.KeyboardShortcutInfo> p1, boolean p2) {}
    public KeyboardShortcutGroup(java.lang.CharSequence p0, boolean p1) {}
    public java.lang.CharSequence getLabel() { return null; }
    public java.util.List<android.view.KeyboardShortcutInfo> getItems() { return null; }
    public boolean isSystemGroup() { return false; }
    public void addItem(android.view.KeyboardShortcutInfo p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
