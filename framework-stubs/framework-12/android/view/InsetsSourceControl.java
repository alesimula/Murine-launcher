package android.view;

public class InsetsSourceControl implements android.os.Parcelable {
    private final int mType = 0;
    private final android.view.SurfaceControl mLeash = null;
    private final android.graphics.Point mSurfacePosition = null;
    private android.graphics.Insets mInsetsHint;
    private boolean mSkipAnimationOnce;
    private int mParcelableFlags;
    public static final android.os.Parcelable.Creator<android.view.InsetsSourceControl> CREATOR = null;
    public InsetsSourceControl(int p0, android.view.SurfaceControl p1, android.graphics.Point p2, android.graphics.Insets p3) {}
    public InsetsSourceControl(android.view.InsetsSourceControl p0) {}
    public InsetsSourceControl(android.os.Parcel p0) {}
    public int getType() { return 0; }
    public android.view.SurfaceControl getLeash() { return null; }
    public boolean setSurfacePosition(int p0, int p1) { return false; }
    public android.graphics.Point getSurfacePosition() { return null; }
    public void setInsetsHint(android.graphics.Insets p0) {}
    public void setInsetsHint(int p0, int p1, int p2, int p3) {}
    public android.graphics.Insets getInsetsHint() { return null; }
    public void setSkipAnimationOnce(boolean p0) {}
    public boolean getAndClearSkipAnimationOnce() { return false; }
    public void setParcelableFlags(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void release(java.util.function.Consumer<android.view.SurfaceControl> p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
}
