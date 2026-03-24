package com.android.modules.utils;

public class ParceledListSlice<T extends android.os.Parcelable> extends com.android.modules.utils.BaseParceledListSlice<T> {
    public static final android.os.Parcelable.ClassLoaderCreator<com.android.modules.utils.ParceledListSlice> CREATOR = null;
    public ParceledListSlice(java.util.List<T> p0) { super((java.util.List)null); }
    private ParceledListSlice(android.os.Parcel p0, java.lang.ClassLoader p1) { super((java.util.List)null); }
    public static <T extends android.os.Parcelable> com.android.modules.utils.ParceledListSlice<T> emptyList() { return null; }
    public int describeContents() { return 0; }
    protected void writeElement(T p0, android.os.Parcel p1, int p2) {}
    protected void writeParcelableCreator(T p0, android.os.Parcel p1) {}
    protected android.os.Parcelable.Creator<?> readParcelableCreator(android.os.Parcel p0, java.lang.ClassLoader p1) { return null; }
}
