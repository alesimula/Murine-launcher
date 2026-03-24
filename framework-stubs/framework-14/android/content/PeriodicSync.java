package android.content;

public class PeriodicSync implements android.os.Parcelable {
    public final android.accounts.Account account = null;
    public final java.lang.String authority = null;
    public final android.os.Bundle extras = null;
    public final long period = 0L;
    public final long flexTime = 0L;
    public static final android.os.Parcelable.Creator<android.content.PeriodicSync> CREATOR = null;
    public PeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, long p3) {}
    public PeriodicSync(android.content.PeriodicSync p0) {}
    public PeriodicSync(android.accounts.Account p0, java.lang.String p1, android.os.Bundle p2, long p3, long p4) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public static boolean syncExtrasEquals(android.os.Bundle p0, android.os.Bundle p1) { return false; }
    public java.lang.String toString() { return null; }
}
