package android.view;

@java.lang.Deprecated
public final class InputMonitor implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.InputMonitor> CREATOR = null;
    @java.lang.Deprecated
    public void pilferPointers() {}
    public void dispose() {}
    public InputMonitor(android.view.InputChannel p0, android.view.IInputMonitorHost p1, android.view.SurfaceControl p2) {}
    @android.annotation.NonNull
    public android.view.InputChannel getInputChannel() { return null; }
    @android.annotation.NonNull
    public android.view.IInputMonitorHost getHost() { return null; }
    @android.annotation.NonNull
    public android.view.SurfaceControl getSurface() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    InputMonitor(android.os.Parcel p0) {}
}
