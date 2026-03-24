package android.window;

public final class BackNavigationInfo implements android.os.Parcelable {
    public static final int TYPE_UNDEFINED = -1;
    public static final int TYPE_DIALOG_CLOSE = 0;
    public static final int TYPE_RETURN_TO_HOME = 1;
    public static final int TYPE_CROSS_ACTIVITY = 2;
    public static final int TYPE_CROSS_TASK = 3;
    public static final int TYPE_CALLBACK = 4;
    public static final java.lang.String KEY_TRIGGER_BACK = "TriggerBack";
    public static final android.os.Parcelable.Creator<android.window.BackNavigationInfo> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.window.BackNavigationInfo.BackTargetType
    public int getType() { return 0; }
    public android.view.RemoteAnimationTarget getDepartingAnimationTarget() { return null; }
    public android.view.SurfaceControl getScreenshotSurface() { return null; }
    public android.hardware.HardwareBuffer getScreenshotHardwareBuffer() { return null; }
    public android.app.WindowConfiguration getTaskWindowConfiguration() { return null; }
    public android.window.IOnBackInvokedCallback getOnBackInvokedCallback() { return null; }
    public boolean isPrepareRemoteAnimation() { return false; }
    public void onBackNavigationFinished(boolean p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String typeToString(int p0) { return null; }

    static @interface BackTargetType {
    }

    public static class Builder {
        public Builder() {}
        public android.window.BackNavigationInfo.Builder setType(int p0) { return null; }
        public android.window.BackNavigationInfo.Builder setDepartingAnimationTarget(android.view.RemoteAnimationTarget p0) { return null; }
        public android.window.BackNavigationInfo.Builder setScreenshotSurface(android.view.SurfaceControl p0) { return null; }
        public android.window.BackNavigationInfo.Builder setScreenshotBuffer(android.hardware.HardwareBuffer p0) { return null; }
        public android.window.BackNavigationInfo.Builder setTaskWindowConfiguration(android.app.WindowConfiguration p0) { return null; }
        public android.window.BackNavigationInfo.Builder setOnBackNavigationDone(android.os.RemoteCallback p0) { return null; }
        public android.window.BackNavigationInfo.Builder setOnBackInvokedCallback(android.window.IOnBackInvokedCallback p0) { return null; }
        public android.window.BackNavigationInfo.Builder setPrepareAnimation(boolean p0) { return null; }
        public android.window.BackNavigationInfo build() { return null; }
    }
}
