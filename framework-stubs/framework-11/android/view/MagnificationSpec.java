package android.view;

public class MagnificationSpec implements android.os.Parcelable {
    private static final int MAX_POOL_SIZE = 20;
    private static final android.util.Pools.SynchronizedPool<android.view.MagnificationSpec> sPool = null;
    public float scale;
    public float offsetX;
    public float offsetY;
    public static final android.os.Parcelable.Creator<android.view.MagnificationSpec> CREATOR = null;
    private MagnificationSpec() {}
    public void initialize(float p0, float p1, float p2) {}
    public boolean isNop() { return false; }
    public static android.view.MagnificationSpec obtain(android.view.MagnificationSpec p0) { return null; }
    public static android.view.MagnificationSpec obtain() { return null; }
    public void recycle() {}
    public void clear() {}
    public void setTo(android.view.MagnificationSpec p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private void initFromParcel(android.os.Parcel p0) {}
}
