package android.window;

public final class TransitionRequestInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo> CREATOR = null;
    public TransitionRequestInfo(int p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.RemoteTransition p2) {}
    public TransitionRequestInfo(int p0, android.app.ActivityManager.RunningTaskInfo p1, android.window.RemoteTransition p2, android.window.TransitionRequestInfo.DisplayChange p3) {}
    public int getType() { return 0; }
    public android.app.ActivityManager.RunningTaskInfo getTriggerTask() { return null; }
    public android.window.RemoteTransition getRemoteTransition() { return null; }
    public android.window.TransitionRequestInfo.DisplayChange getDisplayChange() { return null; }
    public android.window.TransitionRequestInfo setTriggerTask(android.app.ActivityManager.RunningTaskInfo p0) { return null; }
    public android.window.TransitionRequestInfo setRemoteTransition(android.window.RemoteTransition p0) { return null; }
    public android.window.TransitionRequestInfo setDisplayChange(android.window.TransitionRequestInfo.DisplayChange p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    TransitionRequestInfo(android.os.Parcel p0) {}

    public static class DisplayChange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.TransitionRequestInfo.DisplayChange> CREATOR = null;
        public DisplayChange(int p0) {}
        public DisplayChange(int p0, int p1, int p2) {}
        public int getDisplayId() { return 0; }
        public android.graphics.Rect getStartAbsBounds() { return null; }
        public android.graphics.Rect getEndAbsBounds() { return null; }
        public int getStartRotation() { return 0; }
        public int getEndRotation() { return 0; }
        public boolean isPhysicalDisplayChanged() { return false; }
        public android.window.TransitionRequestInfo.DisplayChange setStartAbsBounds(android.graphics.Rect p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setEndAbsBounds(android.graphics.Rect p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setStartRotation(int p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setEndRotation(int p0) { return null; }
        public android.window.TransitionRequestInfo.DisplayChange setPhysicalDisplayChanged(boolean p0) { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        protected DisplayChange(android.os.Parcel p0) {}
    }
}
