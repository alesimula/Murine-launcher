package com.android.internal.telephony.cat;

public class TextMessage implements android.os.Parcelable {
    public java.lang.String title;
    public java.lang.String text;
    public android.graphics.Bitmap icon;
    public boolean iconSelfExplanatory;
    public boolean isHighPriority;
    public boolean responseNeeded;
    public boolean userClear;
    public com.android.internal.telephony.cat.Duration duration;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.cat.TextMessage> CREATOR = null;
    TextMessage() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
