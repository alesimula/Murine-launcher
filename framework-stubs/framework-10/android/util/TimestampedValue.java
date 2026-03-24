package android.util;

public final class TimestampedValue<T extends java.lang.Object> {
    private final long mReferenceTimeMillis = 0L;
    private final T mValue = null;
    public TimestampedValue(long p0, T p1) {}
    public long getReferenceTimeMillis() { return 0L; }
    public T getValue() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static <T extends java.lang.Object> android.util.TimestampedValue<T> readFromParcel(android.os.Parcel p0, java.lang.ClassLoader p1, java.lang.Class<? extends T> p2) { return null; }
    public static void writeToParcel(android.os.Parcel p0, android.util.TimestampedValue<?> p1) {}
    public static long referenceTimeDifference(android.util.TimestampedValue<?> p0, android.util.TimestampedValue<?> p1) { return 0L; }
}
