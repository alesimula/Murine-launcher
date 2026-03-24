package com.android.phone.ecc.nano.android;

public abstract class ParcelableExtendableMessageNano<M extends com.android.phone.ecc.nano.ExtendableMessageNano<M>> extends com.android.phone.ecc.nano.ExtendableMessageNano<M> implements android.os.Parcelable {
    public ParcelableExtendableMessageNano() { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
