package android.graphics;

public class Region implements android.os.Parcelable {
    public long mNativeRegion;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.Region> CREATOR = null;
    public Region() {}
    public Region(android.graphics.Region p0) {}
    public Region(android.graphics.Rect p0) {}
    public Region(int p0, int p1, int p2, int p3) {}
    public void setEmpty() {}
    public boolean set(android.graphics.Region p0) { return false; }
    public boolean set(android.graphics.Rect p0) { return false; }
    public boolean set(int p0, int p1, int p2, int p3) { return false; }
    public boolean setPath(android.graphics.Path p0, android.graphics.Region p1) { return false; }
    public native boolean isEmpty();
    public native boolean isRect();
    public native boolean isComplex();
    @android.annotation.NonNull
    public android.graphics.Rect getBounds() { return null; }
    public boolean getBounds(android.graphics.Rect p0) { return false; }
    @android.annotation.NonNull
    public android.graphics.Path getBoundaryPath() { return null; }
    public boolean getBoundaryPath(android.graphics.Path p0) { return false; }
    public native boolean contains(int p0, int p1);
    public boolean quickContains(android.graphics.Rect p0) { return false; }
    public native boolean quickContains(int p0, int p1, int p2, int p3);
    public boolean quickReject(android.graphics.Rect p0) { return false; }
    public native boolean quickReject(int p0, int p1, int p2, int p3);
    public native boolean quickReject(android.graphics.Region p0);
    public void translate(int p0, int p1) {}
    public native void translate(int p0, int p1, android.graphics.Region p2);
    public void scale(float p0) {}
    public native void scale(float p0, android.graphics.Region p1);
    public final boolean union(android.graphics.Rect p0) { return false; }
    public boolean op(android.graphics.Rect p0, android.graphics.Region.Op p1) { return false; }
    public boolean op(int p0, int p1, int p2, int p3, android.graphics.Region.Op p4) { return false; }
    public boolean op(android.graphics.Region p0, android.graphics.Region.Op p1) { return false; }
    public boolean op(android.graphics.Rect p0, android.graphics.Region p1, android.graphics.Region.Op p2) { return false; }
    public boolean op(android.graphics.Region p0, android.graphics.Region p1, android.graphics.Region.Op p2) { return false; }
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static android.graphics.Region obtain() { return null; }
    @android.annotation.NonNull
    public static android.graphics.Region obtain(android.graphics.Region p0) { return null; }
    public void recycle() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    protected void finalize() throws java.lang.Throwable {}
    Region(long p0) {}
    final long ni() { return 0L; }

    public static enum Op {
        DIFFERENCE,
        INTERSECT,
        UNION,
        XOR,
        REVERSE_DIFFERENCE,
        REPLACE;
        public final int nativeInt = 0;
    }
}
