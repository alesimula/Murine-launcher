package com.android.internal.statusbar;

public class DisableStates implements android.os.Parcelable {
    public java.util.Map<java.lang.Integer, android.util.Pair<java.lang.Integer, java.lang.Integer>> displaysWithStates;
    public boolean animate;
    public static final android.os.Parcelable.Creator<com.android.internal.statusbar.DisableStates> CREATOR = null;
    public DisableStates(java.util.Map<java.lang.Integer, android.util.Pair<java.lang.Integer, java.lang.Integer>> p0, boolean p1) {}
    public DisableStates(java.util.Map<java.lang.Integer, android.util.Pair<java.lang.Integer, java.lang.Integer>> p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
