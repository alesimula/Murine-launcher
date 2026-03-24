package android.view;

public class InsetsSource implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InsetsSource> CREATOR = null;
    public InsetsSource(int p0) {}
    public InsetsSource(android.view.InsetsSource p0) {}
    public void set(android.view.InsetsSource p0) {}
    public void setFrame(int p0, int p1, int p2, int p3) {}
    public void setFrame(android.graphics.Rect p0) {}
    public void setVisibleFrame(android.graphics.Rect p0) {}
    public void setVisible(boolean p0) {}
    public int getType() { return 0; }
    public android.graphics.Rect getFrame() { return null; }
    public android.graphics.Rect getVisibleFrame() { return null; }
    public boolean isVisible() { return false; }
    boolean isUserControllable() { return false; }
    public boolean getInsetsRoundedCornerFrame() { return false; }
    public void setInsetsRoundedCornerFrame(boolean p0) {}
    public android.graphics.Insets calculateInsets(android.graphics.Rect p0, boolean p1) { return null; }
    public android.graphics.Insets calculateVisibleInsets(android.graphics.Rect p0) { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(java.lang.Object p0, boolean p1) { return false; }
    public int hashCode() { return 0; }
    public InsetsSource(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
