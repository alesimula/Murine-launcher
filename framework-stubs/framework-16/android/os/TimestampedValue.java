package android.os;

public final class TimestampedValue<T extends java.lang.Object> implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.TimestampedValue<?>> CREATOR = null;
    public TimestampedValue(long p0, T p1) {}
    public long getReferenceTimeMillis() { return 0L; }
    @android.annotation.Nullable
    public T getValue() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static long referenceTimeDifference(android.os.TimestampedValue<?> p0, android.os.TimestampedValue<?> p1) { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
