package android.view.displayhash;

public final class DisplayHash implements android.os.Parcelable {
    private final long mTimeMillis = 0L;
    private final android.graphics.Rect mBoundsInWindow = null;
    private final java.lang.String mHashAlgorithm = null;
    private final byte[] mImageHash = null;
    private final byte[] mHmac = null;
    public static final android.os.Parcelable.Creator<android.view.displayhash.DisplayHash> CREATOR = null;
    @android.annotation.SystemApi
    public DisplayHash(long p0, android.graphics.Rect p1, java.lang.String p2, byte[] p3, byte[] p4) {}
    @android.annotation.SystemApi
    public long getTimeMillis() { return 0L; }
    @android.annotation.SystemApi
    public android.graphics.Rect getBoundsInWindow() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getHashAlgorithm() { return null; }
    @android.annotation.SystemApi
    public byte[] getImageHash() { return null; }
    @android.annotation.SystemApi
    public byte[] getHmac() { return null; }
    public java.lang.String toString() { return null; }
    private java.lang.String byteArrayToString(byte[] p0) { return null; }
    @android.annotation.SystemApi
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.SystemApi
    public int describeContents() { return 0; }
    private DisplayHash(android.os.Parcel p0) {}
}
