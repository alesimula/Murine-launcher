package android.window;

public final class TaskFragmentCreationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentCreationParams> CREATOR = null;
    public android.window.TaskFragmentOrganizerToken getOrganizer() { return null; }
    public android.os.IBinder getFragmentToken() { return null; }
    public android.os.IBinder getOwnerToken() { return null; }
    public android.graphics.Rect getInitialRelativeBounds() { return null; }
    @android.app.WindowConfiguration.WindowingMode
    public int getWindowingMode() { return 0; }
    public android.os.IBinder getPairedPrimaryFragmentToken() { return null; }
    public android.os.IBinder getPairedActivityToken() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder(android.window.TaskFragmentOrganizerToken p0, android.os.IBinder p1, android.os.IBinder p2) {}
        public android.window.TaskFragmentCreationParams.Builder setInitialRelativeBounds(android.graphics.Rect p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setWindowingMode(int p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setPairedPrimaryFragmentToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentCreationParams.Builder setPairedActivityToken(android.os.IBinder p0) { return null; }
        public android.window.TaskFragmentCreationParams build() { return null; }
    }
}
