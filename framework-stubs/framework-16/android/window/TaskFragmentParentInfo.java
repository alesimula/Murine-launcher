package android.window;

@android.annotation.SuppressLint("UnflaggedApi")
public final class TaskFragmentParentInfo implements android.os.Parcelable {
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentParentInfo> CREATOR = null;
    public TaskFragmentParentInfo(android.content.res.Configuration p0, int p1, int p2, boolean p3, boolean p4, android.view.SurfaceControl p5) {}
    public TaskFragmentParentInfo(android.window.TaskFragmentParentInfo p0) {}
    @android.annotation.NonNull
    public android.content.res.Configuration getConfiguration() { return null; }
    public int getDisplayId() { return 0; }
    public int getTaskId() { return 0; }
    public boolean isVisible() { return false; }
    public boolean hasDirectActivity() { return false; }
    public boolean equalsForTaskFragmentOrganizer(android.window.TaskFragmentParentInfo p0) { return false; }
    @android.annotation.Nullable
    public android.view.SurfaceControl getDecorSurface() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.SuppressLint("UnflaggedApi")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public int describeContents() { return 0; }
}
