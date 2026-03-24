package com.android.internal.telephony.cat;

public class ToneSettings implements android.os.Parcelable {
    public com.android.internal.telephony.cat.Duration duration;
    public com.android.internal.telephony.cat.Tone tone;
    public boolean vibrate;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.cat.ToneSettings> CREATOR = null;
    public ToneSettings(com.android.internal.telephony.cat.Duration p0, com.android.internal.telephony.cat.Tone p1, boolean p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
