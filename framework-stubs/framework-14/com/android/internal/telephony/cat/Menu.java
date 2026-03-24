package com.android.internal.telephony.cat;

public class Menu implements android.os.Parcelable {
    public java.util.List<com.android.internal.telephony.cat.Item> items;
    public java.util.List<com.android.internal.telephony.cat.TextAttribute> titleAttrs;
    public com.android.internal.telephony.cat.PresentationType presentationType;
    public java.lang.String title;
    public android.graphics.Bitmap titleIcon;
    public int defaultItem;
    public boolean softKeyPreferred;
    public boolean helpAvailable;
    public boolean titleIconSelfExplanatory;
    public boolean itemsIconSelfExplanatory;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.cat.Menu> CREATOR = null;
    public Menu() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
