package android.view;

public final class RoundedCorner implements android.os.Parcelable {
    public static final int POSITION_TOP_LEFT = 0;
    public static final int POSITION_TOP_RIGHT = 1;
    public static final int POSITION_BOTTOM_RIGHT = 2;
    public static final int POSITION_BOTTOM_LEFT = 3;
    private final int mPosition = 0;
    private final int mRadius = 0;
    private final android.graphics.Point mCenter = null;
    public static final android.os.Parcelable.Creator<android.view.RoundedCorner> CREATOR = null;
    public RoundedCorner(int p0) {}
    public RoundedCorner(int p0, int p1, int p2, int p3) {}
    RoundedCorner(android.view.RoundedCorner p0) {}
    public int getPosition() { return 0; }
    public int getRadius() { return 0; }
    public android.graphics.Point getCenter() { return null; }
    public boolean isEmpty() { return false; }
    private java.lang.String getPositionString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Position {
    }
}
