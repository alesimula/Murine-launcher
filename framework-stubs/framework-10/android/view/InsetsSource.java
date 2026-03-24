package android.view;

public class InsetsSource implements android.os.Parcelable {
    private final int mType = 0;
    private final android.graphics.Rect mFrame = null;
    private boolean mVisible;
    private final android.graphics.Rect mTmpFrame = null;
    public static final android.os.Parcelable.Creator<android.view.InsetsSource> CREATOR = null;
    public InsetsSource(int p0) {}
    public InsetsSource(android.view.InsetsSource p0) {}
    public void setFrame(android.graphics.Rect p0) {}
    public void setVisible(boolean p0) {}
    public int getType() { return 0; }
    public android.graphics.Rect getFrame() { return null; }
    public boolean isVisible() { return false; }
    public android.graphics.Insets calculateInsets(android.graphics.Rect p0, boolean p1) { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public InsetsSource(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
