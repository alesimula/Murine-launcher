package android.graphics;

public final class Rect implements android.os.Parcelable {
    public int left;
    public int top;
    public int right;
    public int bottom;
    public static final android.os.Parcelable.Creator<android.graphics.Rect> CREATOR = null;
    public Rect() {}
    public Rect(int p0, int p1, int p2, int p3) {}
    public Rect(android.graphics.Rect p0) {}
    public Rect(android.graphics.Insets p0) {}
    public static android.graphics.Rect copyOrNull(android.graphics.Rect p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.String toShortString() { return null; }
    public java.lang.String toShortString(java.lang.StringBuilder p0) { return null; }
    public java.lang.String flattenToString() { return null; }
    public static android.graphics.Rect unflattenFromString(java.lang.String p0) { return null; }
    public void printShortString(java.io.PrintWriter p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void readFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.io.IOException, android.util.proto.WireTypeMismatchException {}
    public final boolean isEmpty() { return false; }
    public boolean isValid() { return false; }
    public final int width() { return 0; }
    public final int height() { return 0; }
    public final int centerX() { return 0; }
    public final int centerY() { return 0; }
    public final float exactCenterX() { return 0.0f; }
    public final float exactCenterY() { return 0.0f; }
    public void setEmpty() {}
    public void set(int p0, int p1, int p2, int p3) {}
    public void set(android.graphics.Rect p0) {}
    public void offset(int p0, int p1) {}
    public void offsetTo(int p0, int p1) {}
    public void inset(int p0, int p1) {}
    public void inset(android.graphics.Rect p0) {}
    public void inset(android.graphics.Insets p0) {}
    public void inset(int p0, int p1, int p2, int p3) {}
    public boolean contains(int p0, int p1) { return false; }
    public boolean contains(int p0, int p1, int p2, int p3) { return false; }
    public boolean contains(android.graphics.Rect p0) { return false; }
    public boolean intersect(int p0, int p1, int p2, int p3) { return false; }
    public boolean intersect(android.graphics.Rect p0) { return false; }
    public void intersectUnchecked(android.graphics.Rect p0) {}
    public boolean setIntersect(android.graphics.Rect p0, android.graphics.Rect p1) { return false; }
    public boolean intersects(int p0, int p1, int p2, int p3) { return false; }
    public static boolean intersects(android.graphics.Rect p0, android.graphics.Rect p1) { return false; }
    public void union(int p0, int p1, int p2, int p3) {}
    public void union(android.graphics.Rect p0) {}
    public void union(int p0, int p1) {}
    public void sort() {}
    public void splitVertically(android.graphics.Rect... p0) {}
    public void splitHorizontally(android.graphics.Rect... p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public void scale(float p0) {}

    private static final class UnflattenHelper {
        static java.util.regex.Matcher getMatcher(java.lang.String p0) { return null; }
    }
}
