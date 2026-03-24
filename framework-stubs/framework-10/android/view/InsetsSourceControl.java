package android.view;

public class InsetsSourceControl implements android.os.Parcelable {
    private final int mType = 0;
    private final android.view.SurfaceControl mLeash = null;
    private final android.graphics.Point mSurfacePosition = null;
    public static final android.os.Parcelable.Creator<android.view.InsetsSourceControl> CREATOR = null;
    public InsetsSourceControl(int p0, android.view.SurfaceControl p1, android.graphics.Point p2) {}
    public int getType() { return 0; }
    public android.view.SurfaceControl getLeash() { return null; }
    public InsetsSourceControl(android.os.Parcel p0) {}
    public boolean setSurfacePosition(int p0, int p1) { return false; }
    public android.graphics.Point getSurfacePosition() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
