package android.os;

public final class ParcelableException extends java.lang.RuntimeException implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.ParcelableException> CREATOR = null;
    public ParcelableException(java.lang.Throwable p0) { super(); }
    public <T extends java.lang.Throwable> void maybeRethrow(java.lang.Class<T> p0) throws T {}
    public static java.lang.Throwable readFromParcel(android.os.Parcel p0) { return null; }
    public static void writeToParcel(android.os.Parcel p0, java.lang.Throwable p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
