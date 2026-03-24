package com.android.phone.ecc.nano.android;

public abstract class ParcelableMessageNano extends com.android.phone.ecc.nano.MessageNano implements android.os.Parcelable {
    public ParcelableMessageNano() { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
