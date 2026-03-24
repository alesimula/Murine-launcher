package android.window;

public final class TaskFragmentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentInfo> CREATOR = null;
    public TaskFragmentInfo(android.os.IBinder p0, android.window.WindowContainerToken p1, android.content.res.Configuration p2, int p3, boolean p4, java.util.List<android.os.IBinder> p5, android.graphics.Point p6, boolean p7, boolean p8, boolean p9, android.graphics.Point p10) {}
    public android.os.IBinder getFragmentToken() { return null; }
    public android.window.WindowContainerToken getToken() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public boolean isEmpty() { return false; }
    public boolean hasRunningActivity() { return false; }
    public int getRunningActivityCount() { return 0; }
    public boolean isVisible() { return false; }
    public java.util.List<android.os.IBinder> getActivities() { return null; }
    public android.graphics.Point getPositionInParent() { return null; }
    public boolean isTaskClearedForReuse() { return false; }
    public boolean isTaskFragmentClearedForPip() { return false; }
    public boolean isClearedForReorderActivityToFront() { return false; }
    @android.app.WindowConfiguration.WindowingMode
    public int getWindowingMode() { return 0; }
    public int getMinimumWidth() { return 0; }
    public int getMinimumHeight() { return 0; }
    public boolean equalsForTaskFragmentOrganizer(android.window.TaskFragmentInfo p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
