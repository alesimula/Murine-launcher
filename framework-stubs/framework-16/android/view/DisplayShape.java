package android.view;

public final class DisplayShape implements android.os.Parcelable {
    public static final android.view.DisplayShape NONE = null;
    public final java.lang.String mDisplayShapeSpec = null;
    public static final android.os.Parcelable.Creator<android.view.DisplayShape> CREATOR = null;
    public static android.view.DisplayShape fromResources(android.content.res.Resources p0, java.lang.String p1, int p2, int p3, int p4, int p5) { return null; }
    public static android.view.DisplayShape createDefaultDisplayShape(int p0, int p1, boolean p2) { return null; }
    public static android.view.DisplayShape fromSpecString(java.lang.String p0, float p1, int p2, int p3) { return null; }
    public static java.lang.String getSpecString(android.content.res.Resources p0, java.lang.String p1) { return null; }
    public android.view.DisplayShape setRotation(int p0) { return null; }
    public android.view.DisplayShape setOffset(int p0, int p1) { return null; }
    public android.view.DisplayShape setScale(float p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public android.graphics.Path getPath() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static final class Cache {
        static android.view.DisplayShape getDisplayShape(java.lang.String p0, float p1, int p2, int p3) { return null; }
        static android.graphics.Path getPath(android.view.DisplayShape p0) { return null; }
    }
}
