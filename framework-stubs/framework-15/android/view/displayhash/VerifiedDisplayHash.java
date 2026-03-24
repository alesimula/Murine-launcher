package android.view.displayhash;

public final class VerifiedDisplayHash implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.displayhash.VerifiedDisplayHash> CREATOR = null;
    public VerifiedDisplayHash(long p0, android.graphics.Rect p1, java.lang.String p2, byte[] p3) {}
    public long getTimeMillis() { return 0L; }
    @android.annotation.NonNull
    public android.graphics.Rect getBoundsInWindow() { return null; }
    @android.annotation.NonNull
    public java.lang.String getHashAlgorithm() { return null; }
    @android.annotation.NonNull
    public byte[] getImageHash() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    VerifiedDisplayHash(android.os.Parcel p0) {}
}
