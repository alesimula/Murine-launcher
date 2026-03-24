package android.view.displayhash;

public final class DisplayHash implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.displayhash.DisplayHash> CREATOR = null;
    @android.annotation.SystemApi
    public DisplayHash(long p0, android.graphics.Rect p1, java.lang.String p2, byte[] p3, byte[] p4) {}
    @android.annotation.SystemApi
    public long getTimeMillis() { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.graphics.Rect getBoundsInWindow() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.lang.String getHashAlgorithm() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public byte[] getImageHash() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public byte[] getHmac() { return null; }
    public java.lang.String toString() { return null; }
    @android.annotation.SystemApi
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.SystemApi
    public int describeContents() { return 0; }
}
