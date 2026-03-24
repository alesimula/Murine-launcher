package com.android.modules.utils;

abstract class BaseParceledListSlice<T extends java.lang.Object> implements android.os.Parcelable {
    public BaseParceledListSlice(java.util.List<T> p0) {}
    BaseParceledListSlice(android.os.Parcel p0, java.lang.ClassLoader p1) {}
    public java.util.List<T> getList() { return null; }
    public void setInlineCountLimit(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected abstract void writeElement(T p0, android.os.Parcel p1, int p2);
    protected abstract void writeParcelableCreator(T p0, android.os.Parcel p1);
    protected abstract android.os.Parcelable.Creator<?> readParcelableCreator(android.os.Parcel p0, java.lang.ClassLoader p1);
}
