package android.app;

public class CameraCompatTaskInfo implements android.os.Parcelable {
    public static final int CAMERA_COMPAT_FREEFORM_UNSPECIFIED = 0;
    public static final int CAMERA_COMPAT_FREEFORM_NONE = 1;
    public static final int CAMERA_COMPAT_FREEFORM_PORTRAIT_DEVICE_IN_LANDSCAPE = 2;
    public static final int CAMERA_COMPAT_FREEFORM_LANDSCAPE_DEVICE_IN_LANDSCAPE = 3;
    public static final int CAMERA_COMPAT_FREEFORM_PORTRAIT_DEVICE_IN_PORTRAIT = 4;
    public static final int CAMERA_COMPAT_FREEFORM_LANDSCAPE_DEVICE_IN_PORTRAIT = 5;
    public int freeformCameraCompatMode;
    public int displayRotation;
    public static final android.os.Parcelable.Creator<android.app.CameraCompatTaskInfo> CREATOR = null;
    @android.annotation.NonNull
    static android.app.CameraCompatTaskInfo create() { return null; }
    public int describeContents() { return 0; }
    void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equalsForTaskOrganizer(android.app.CameraCompatTaskInfo p0) { return false; }
    public boolean equalsForCompatUi(android.app.CameraCompatTaskInfo p0) { return false; }
    public java.lang.String toString() { return null; }
    public static int getDisplayRotationFromCameraCompatMode(int p0) { return 0; }
    @android.annotation.NonNull
    public static java.lang.String freeformCameraCompatModeToString(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String displayRotationToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FreeformCameraCompatMode {
    }
}
