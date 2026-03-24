package com.android.internal.telephony.cat;

public class Input implements android.os.Parcelable {
    public java.lang.String text;
    public java.lang.String defaultText;
    public android.graphics.Bitmap icon;
    public int minLen;
    public int maxLen;
    public boolean ucs2;
    public boolean packed;
    public boolean digitOnly;
    public boolean echo;
    public boolean yesNo;
    public boolean helpAvailable;
    public com.android.internal.telephony.cat.Duration duration;
    public boolean iconSelfExplanatory;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.cat.Input> CREATOR = null;
    Input() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    boolean setIcon(android.graphics.Bitmap p0) { return false; }
}
