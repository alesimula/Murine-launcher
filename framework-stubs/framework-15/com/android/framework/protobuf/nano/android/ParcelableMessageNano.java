package com.android.framework.protobuf.nano.android;

public abstract class ParcelableMessageNano extends com.android.framework.protobuf.nano.MessageNano implements android.os.Parcelable {
    public ParcelableMessageNano() { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
