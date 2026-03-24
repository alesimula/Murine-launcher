package com.android.framework.protobuf.nano.android;

public abstract class ParcelableExtendableMessageNano<M extends com.android.framework.protobuf.nano.ExtendableMessageNano<M>> extends com.android.framework.protobuf.nano.ExtendableMessageNano<M> implements android.os.Parcelable {
    public ParcelableExtendableMessageNano() { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
