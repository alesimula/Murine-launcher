package android.view;

public final class WindowRelayoutResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public final android.window.ClientWindowFrames frames = null;
    @android.annotation.NonNull
    public final android.util.MergedConfiguration mergedConfiguration = null;
    @android.annotation.NonNull
    public final android.view.SurfaceControl surfaceControl = null;
    @android.annotation.NonNull
    public final android.view.InsetsState insetsState = null;
    @android.annotation.NonNull
    public final android.view.InsetsSourceControl.Array activeControls = null;
    public int syncSeqId;
    @android.annotation.Nullable
    public android.window.ActivityWindowInfo activityWindowInfo;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.WindowRelayoutResult> CREATOR = null;
    public WindowRelayoutResult() {}
    public WindowRelayoutResult(android.window.ClientWindowFrames p0, android.util.MergedConfiguration p1, android.view.SurfaceControl p2, android.view.InsetsState p3, android.view.InsetsSourceControl.Array p4) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
