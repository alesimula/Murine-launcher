package android.view;

public class InsetsState implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.InsetsState> CREATOR = null;
    public InsetsState() {}
    public InsetsState(android.view.InsetsState p0) {}
    public InsetsState(android.view.InsetsState p0, boolean p1) {}
    public android.view.WindowInsets calculateInsets(android.graphics.Rect p0, android.graphics.Rect p1, android.view.InsetsState p2, boolean p3, int p4, int p5, int p6, int p7, int p8, android.util.SparseIntArray p9) { return null; }
    public android.graphics.Insets calculateInsets(android.graphics.Rect p0, android.graphics.Rect p1, int p2, boolean p3) { return null; }
    public android.graphics.Insets calculateInsets(android.graphics.Rect p0, android.graphics.Rect p1, int p2, int p3) { return null; }
    public android.graphics.Insets calculateVisibleInsets(android.graphics.Rect p0, android.graphics.Rect p1, int p2, int p3, int p4, int p5) { return null; }
    public int calculateUncontrollableInsetsFromFrame(android.graphics.Rect p0, android.graphics.Rect p1) { return 0; }
    public android.view.InsetsSource getOrCreateSource(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.view.InsetsSource peekSource(int p0) { return null; }
    public int sourceIdAt(int p0) { return 0; }
    public android.view.InsetsSource sourceAt(int p0) { return null; }
    public int sourceSize() { return 0; }
    public boolean isSourceOrDefaultVisible(int p0, int p1) { return false; }
    public void setDisplayFrame(android.graphics.Rect p0) {}
    public android.graphics.Rect getDisplayFrame() { return null; }
    public void setDisplayCutout(android.view.DisplayCutout p0) {}
    public android.view.DisplayCutout getDisplayCutout() { return null; }
    public void getDisplayCutoutSafe(android.graphics.Rect p0) {}
    public void setRoundedCorners(android.view.RoundedCorners p0) {}
    public android.view.RoundedCorners getRoundedCorners() { return null; }
    public void setRoundedCornerFrame(android.graphics.Rect p0) {}
    public void setPrivacyIndicatorBounds(android.view.PrivacyIndicatorBounds p0) {}
    public android.view.PrivacyIndicatorBounds getPrivacyIndicatorBounds() { return null; }
    public void setDisplayShape(android.view.DisplayShape p0) {}
    public android.view.DisplayShape getDisplayShape() { return null; }
    public void removeSource(int p0) {}
    public void removeSourceAt(int p0) {}
    public void setSourceVisible(int p0, boolean p1) {}
    public void scale(float p0) {}
    public int getSeq() { return 0; }
    public void setSeq(int p0) {}
    public void set(android.view.InsetsState p0) {}
    public void set(android.view.InsetsState p0, boolean p1) {}
    public void set(android.view.InsetsState p0, int p1) {}
    public void addSource(android.view.InsetsSource p0) {}
    public static boolean clearsCompatInsets(int p0, int p1, int p2, int p3) { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(java.lang.Object p0, boolean p1, boolean p2, boolean p3) { return false; }
    public int hashCode() { return 0; }
    public InsetsState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.util.SparseArray<android.view.InsetsSource> readFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String toString() { return null; }
    public static void traverse(android.view.InsetsState p0, android.view.InsetsState p1, android.view.InsetsState.OnTraverseCallbacks p2) {}

    public static interface OnTraverseCallbacks {
        default public void onStart(android.view.InsetsState p0, android.view.InsetsState p1) {}
        default public void onIdMatch(android.view.InsetsSource p0, android.view.InsetsSource p1) {}
        default public void onIdNotFoundInState1(int p0, android.view.InsetsSource p1) {}
        default public void onIdNotFoundInState2(int p0, android.view.InsetsSource p1) {}
        default public void onFinish(android.view.InsetsState p0, android.view.InsetsState p1) {}
    }
}
