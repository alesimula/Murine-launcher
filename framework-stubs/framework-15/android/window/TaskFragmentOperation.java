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
    public static final int OP_TYPE_REORDER_TO_FRONT = 10;
    public static final int OP_TYPE_SET_ISOLATED_NAVIGATION = 11;
    public static final int OP_TYPE_REORDER_TO_BOTTOM_OF_TASK = 12;
    public static final int OP_TYPE_REORDER_TO_TOP_OF_TASK = 13;
    public static final int OP_TYPE_CREATE_OR_MOVE_TASK_FRAGMENT_DECOR_SURFACE = 14;
    public static final int OP_TYPE_REMOVE_TASK_FRAGMENT_DECOR_SURFACE = 15;
    public static final int OP_TYPE_SET_DIM_ON_TASK = 16;
    public static final int OP_TYPE_SET_MOVE_TO_BOTTOM_IF_CLEAR_WHEN_LAUNCH = 17;
    public static final int OP_TYPE_SET_DECOR_SURFACE_BOOSTED = 18;
    public static final int OP_TYPE_SET_PINNED = 19;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentOperation> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getOpType() { return 0; }
    @android.annotation.Nullable
    public android.window.TaskFragmentCreationParams getTaskFragmentCreationParams() { return null; }
    @android.annotation.Nullable
    public android.os.IBinder getActivityToken() { return null; }
    @android.annotation.Nullable
    public android.content.Intent getActivityIntent() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle getBundle() { return null; }
    @android.annotation.Nullable
    public android.os.IBinder getSecondaryFragmentToken() { return null; }
    @android.annotation.Nullable
    public android.window.TaskFragmentAnimationParams getAnimationParams() { return null; }
    public boolean getBooleanValue() { return false; }
    @android.annotation.Nullable
    public android.view.SurfaceControl.Transaction getSurfaceTransaction() { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation.Builder setTaskFragmentCreationParams(android.window.TaskFragmentCreationParams p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation.Builder setActivityToken(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation.Builder setActivityIntent(android.content.Intent p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation.Builder setBundle(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation.Builder setSecondaryFragmentToken(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation.Builder setAnimationParams(android.window.TaskFragmentAnimationParams p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation.Builder setBooleanValue(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation.Builder setSurfaceTransaction(android.view.SurfaceControl.Transaction p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentOperation build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OperationType {
    }
}
