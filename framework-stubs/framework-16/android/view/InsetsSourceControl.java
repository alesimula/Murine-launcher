package android.view;

public class InsetsSourceControl implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.InsetsSourceControl> CREATOR = null;
    public InsetsSourceControl(int p0, int p1, android.view.SurfaceControl p2, boolean p3, android.graphics.Point p4, android.graphics.Insets p5) {}
    public InsetsSourceControl(android.view.InsetsSourceControl p0) {}
    public InsetsSourceControl(android.os.Parcel p0) {}
    public int getId() { return 0; }
    public int getType() { return 0; }
    @android.annotation.Nullable
    public android.view.SurfaceControl getLeash() { return null; }
    public boolean isInitiallyVisible() { return false; }
    public boolean setSurfacePosition(int p0, int p1) { return false; }
    public android.graphics.Point getSurfacePosition() { return null; }
    public void setInsetsHint(android.graphics.Insets p0) {}
    public void setInsetsHint(int p0, int p1, int p2, int p3) {}
    public android.graphics.Insets getInsetsHint() { return null; }
    public boolean isFake() { return false; }
    public void setSkipAnimationOnce(boolean p0) {}
    public boolean getAndClearSkipAnimationOnce() { return false; }
    @android.annotation.Nullable
    public android.view.inputmethod.ImeTracker.Token getImeStatsToken() { return null; }
    public void setImeStatsToken(android.view.inputmethod.ImeTracker.Token p0) {}
    public void setParcelableFlags(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void release(java.util.function.Consumer<android.view.SurfaceControl> p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}

    public static class Array implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.InsetsSourceControl.Array> CREATOR = null;
        public Array() {}
        public Array(android.view.InsetsSourceControl.Array p0, boolean p1) {}
        public Array(android.os.Parcel p0) {}
        public int getSeq() { return 0; }
        public void setSeq(int p0) {}
        public void setTo(android.view.InsetsSourceControl.Array p0, boolean p1) {}
        public void set(android.view.InsetsSourceControl[] p0, boolean p1) {}
        @android.annotation.Nullable
        public android.view.InsetsSourceControl[] get() { return null; }
        public void release() {}
        public void setParcelableFlags(int p0) {}
        public int describeContents() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
