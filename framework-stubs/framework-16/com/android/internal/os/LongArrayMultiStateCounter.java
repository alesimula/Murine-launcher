package com.android.internal.os;

public final class LongArrayMultiStateCounter implements android.os.Parcelable {
    final long mNativeObject = 0L;
    public static final android.os.Parcelable.Creator<com.android.internal.os.LongArrayMultiStateCounter> CREATOR = null;
    public LongArrayMultiStateCounter(int p0, int p1) {}
    public int getStateCount() { return 0; }
    public int getArrayLength() { return 0; }
    public void setEnabled(boolean p0, long p1) {}
    public void setState(int p0, long p1) {}
    public void copyStatesFrom(com.android.internal.os.LongArrayMultiStateCounter p0) {}
    public void setValues(int p0, long[] p1) {}
    public void incrementValues(long[] p0, long p1) {}
    public void updateValues(long[] p0, long p1) {}
    public void addCounts(long[] p0) {}
    public void reset() {}
    public boolean getCounts(long[] p0, int p1) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
