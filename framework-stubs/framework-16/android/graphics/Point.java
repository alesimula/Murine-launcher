package android.graphics;

public class Point implements android.os.Parcelable {
    public int x;
    public int y;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.Point> CREATOR = null;
    public Point() {}
    public Point(int p0, int p1) {}
    public Point(android.graphics.Point p0) {}
    public void set(int p0, int p1) {}
    public void set(android.graphics.Point p0) {}
    public final void negate() {}
    public final void offset(int p0, int p1) {}
    public final boolean equals(int p0, int p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public java.lang.String flattenToString() { return null; }
    @android.annotation.Nullable
    public static android.graphics.Point unflattenFromString(java.lang.String p0) throws java.lang.NumberFormatException { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
