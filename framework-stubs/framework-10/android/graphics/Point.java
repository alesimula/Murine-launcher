package android.graphics;

public class Point implements android.os.Parcelable {
    public int x;
    public int y;
    public static final android.os.Parcelable.Creator<android.graphics.Point> CREATOR = null;
    public Point() {}
    public Point(int p0, int p1) {}
    public Point(android.graphics.Point p0) {}
    public void set(int p0, int p1) {}
    public final void negate() {}
    public final void offset(int p0, int p1) {}
    public final boolean equals(int p0, int p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void printShortString(java.io.PrintWriter p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public static android.graphics.Point convert(android.util.Size p0) { return null; }
    public static android.util.Size convert(android.graphics.Point p0) { return null; }
}
