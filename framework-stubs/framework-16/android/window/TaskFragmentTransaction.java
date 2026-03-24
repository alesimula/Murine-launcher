package android.window;

public final class TaskFragmentTransaction implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentTransaction> CREATOR = null;
    public static final int TYPE_TASK_FRAGMENT_APPEARED = 1;
    public static final int TYPE_TASK_FRAGMENT_INFO_CHANGED = 2;
    public static final int TYPE_TASK_FRAGMENT_VANISHED = 3;
    public static final int TYPE_TASK_FRAGMENT_PARENT_INFO_CHANGED = 4;
    public static final int TYPE_TASK_FRAGMENT_ERROR = 5;
    public static final int TYPE_ACTIVITY_REPARENTED_TO_TASK = 6;
    public TaskFragmentTransaction() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public android.os.IBinder getTransactionToken() { return null; }
    public void addChange(android.window.TaskFragmentTransaction.Change p0) {}
    public boolean isEmpty() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.window.TaskFragmentTransaction.Change> getChanges() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static final class Change implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.window.TaskFragmentTransaction.Change> CREATOR = null;
        public Change(int p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setTaskFragmentToken(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setTaskFragmentInfo(android.window.TaskFragmentInfo p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setTaskId(int p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setErrorCallbackToken(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setErrorBundle(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setActivityIntent(android.content.Intent p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setActivityToken(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setOtherActivityToken(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setTaskFragmentParentInfo(android.window.TaskFragmentParentInfo p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentTransaction.Change setTaskFragmentSurfaceControl(android.view.SurfaceControl p0) { return null; }
        public int getType() { return 0; }
        @android.annotation.Nullable
        public android.os.IBinder getTaskFragmentToken() { return null; }
        @android.annotation.Nullable
        public android.window.TaskFragmentInfo getTaskFragmentInfo() { return null; }
        public int getTaskId() { return 0; }
        @android.annotation.Nullable
        public android.os.IBinder getErrorCallbackToken() { return null; }
        @android.annotation.NonNull
        public android.os.Bundle getErrorBundle() { return null; }
        @android.annotation.SuppressLint("IntentBuilderName")
        @android.annotation.Nullable
        public android.content.Intent getActivityIntent() { return null; }
        @android.annotation.Nullable
        public android.os.IBinder getActivityToken() { return null; }
        @android.annotation.Nullable
        public android.os.IBinder getOtherActivityToken() { return null; }
        @android.annotation.SuppressLint("UnflaggedApi")
        @android.annotation.Nullable
        public android.window.TaskFragmentParentInfo getTaskFragmentParentInfo() { return null; }
        @android.annotation.Nullable
        public android.view.SurfaceControl getTaskFragmentSurfaceControl() { return null; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ChangeType {
    }
}
