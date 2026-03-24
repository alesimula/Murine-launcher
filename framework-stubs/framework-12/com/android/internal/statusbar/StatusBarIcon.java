package com.android.internal.statusbar;

public class StatusBarIcon implements android.os.Parcelable {
    public android.os.UserHandle user;
    public java.lang.String pkg;
    public android.graphics.drawable.Icon icon;
    public int iconLevel;
    public boolean visible;
    public int number;
    public java.lang.CharSequence contentDescription;
    public static final android.os.Parcelable.Creator<com.android.internal.statusbar.StatusBarIcon> CREATOR = null;
    public StatusBarIcon(android.os.UserHandle p0, java.lang.String p1, android.graphics.drawable.Icon p2, int p3, int p4, java.lang.CharSequence p5) {}
    public StatusBarIcon(java.lang.String p0, android.os.UserHandle p1, int p2, int p3, int p4, java.lang.CharSequence p5) {}
    public java.lang.String toString() { return null; }
    public com.android.internal.statusbar.StatusBarIcon clone() { return null; }
    public StatusBarIcon(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
