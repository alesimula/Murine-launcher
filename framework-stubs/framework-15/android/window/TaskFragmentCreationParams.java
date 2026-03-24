package android.window;

public final class TaskFragmentCreationParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentCreationParams> CREATOR = null;
    @android.annotation.NonNull
    public android.window.TaskFragmentOrganizerToken getOrganizer() { return null; }
    @android.annotation.NonNull
    public android.os.IBinder getFragmentToken() { return null; }
    @android.annotation.NonNull
    public android.os.IBinder getOwnerToken() { return null; }
    @android.annotation.NonNull
    public android.graphics.Rect getInitialRelativeBounds() { return null; }
    public int getWindowingMode() { return 0; }
    @android.annotation.Nullable
    public android.os.IBinder getPairedPrimaryFragmentToken() { return null; }
    @android.annotation.Nullable
    public android.os.IBinder getPairedActivityToken() { return null; }
    public boolean getAllowTransitionWhenEmpty() { return false; }
    public int getOverrideOrientation() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(android.window.TaskFragmentOrganizerToken p0, android.os.IBinder p1, android.os.IBinder p2) {}
        @android.annotation.NonNull
        public android.window.TaskFragmentCreationParams.Builder setInitialRelativeBounds(android.graphics.Rect p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentCreationParams.Builder setWindowingMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentCreationParams.Builder setPairedPrimaryFragmentToken(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentCreationParams.Builder setPairedActivityToken(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentCreationParams.Builder setAllowTransitionWhenEmpty(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
        @android.annotation.NonNull
        public android.window.TaskFragmentCreationParams.Builder setOverrideOrientation(int p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentCreationParams build() { return null; }
    }
}
