package android.window;

public final class TaskFragmentOperation implements android.os.Parcelable {
    public static final int OP_TYPE_UNKNOWN = -1;
    public static final int OP_TYPE_CREATE_TASK_FRAGMENT = 0;
    public static final int OP_TYPE_DELETE_TASK_FRAGMENT = 1;
    public static final int OP_TYPE_START_ACTIVITY_IN_TASK_FRAGMENT = 2;
    public static final int OP_TYPE_REPARENT_ACTIVITY_TO_TASK_FRAGMENT = 3;
    public static final int OP_TYPE_SET_ADJACENT_TASK_FRAGMENTS = 4;
    public static final int OP_TYPE_CLEAR_ADJACENT_TASK_FRAGMENTS = 5;
    public static final int OP_TYPE_REQUEST_FOCUS_ON_TASK_FRAGMENT = 6;
    public static final int OP_TYPE_SET_COMPANION_TASK_FRAGMENT = 7;
    public static final int OP_TYPE_SET_ANIMATION_PARAMS = 8;
    public static final int OP_TYPE_SET_RELATIVE_BOUNDS = 9;
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentOperation> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getOpType() { return 0; }
    public android.window.TaskFragmentCreationParams getTaskFragmentCreationParams() { return null; }
    public android.os.IBinder getActivityToken() { return null; }
    public android.content.Intent getActivityIntent() { return null; }
    public android.os.Bundle getBundle() { return null; }
    public android.os.IBinder getSecondaryFragmentToken() { return null; }
    public android.window.TaskFragmentAnimationParams getAnimationParams() { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        public android.window.TaskFragmentOperation.Builder setTaskFragmentCreationParams(android.window.TaskFragmentCreationParams p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setActivityToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setActivityIntent(android.content.Intent p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setBundle(android.os.Bundle p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setSecondaryFragmentToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentOperation.Builder setAnimationParams(android.window.TaskFragmentAnimationParams p0) { return null; }
        public android.window.TaskFragmentOperation build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationType {
    }
}
