package android.net;

public final class UidRange implements android.os.Parcelable {
    public final int start = 0;
    public final int stop = 0;
    public static final android.os.Parcelable.Creator<android.net.UidRange> CREATOR = null;
    public UidRange(int p0, int p1) {}
    public static android.net.UidRange createForUser(int p0) { return null; }
    public int getStartUser() { return 0; }
    public int getEndUser() { return 0; }
    public boolean contains(int p0) { return false; }
    public int count() { return 0; }
    public boolean containsRange(android.net.UidRange p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static boolean containsUid(java.util.Collection<android.net.UidRange> p0, int p1) { return false; }
}
