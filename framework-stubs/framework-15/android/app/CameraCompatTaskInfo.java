package android.app;

public class CameraCompatTaskInfo implements android.os.Parcelable {
    public static final int CAMERA_COMPAT_CONTROL_HIDDEN = 0;
    public static final int CAMERA_COMPAT_CONTROL_TREATMENT_SUGGESTED = 1;
    public static final int CAMERA_COMPAT_CONTROL_TREATMENT_APPLIED = 2;
    public static final int CAMERA_COMPAT_CONTROL_DISMISSED = 3;
    public int cameraCompatControlState;
    public static final int CAMERA_COMPAT_FREEFORM_NONE = 0;
    public static final int CAMERA_COMPAT_FREEFORM_PORTRAIT = 1;
    public static final int CAMERA_COMPAT_FREEFORM_LANDSCAPE = 2;
    public int freeformCameraCompatMode;
    public static final android.os.Parcelable.Creator<android.app.CameraCompatTaskInfo> CREATOR = null;
    @android.annotation.NonNull
    static android.app.CameraCompatTaskInfo create() { return null; }
    public int describeContents() { return 0; }
    void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean hasCameraCompatControl() { return false; }
    public boolean hasCameraCompatUI() { return false; }
    public boolean equalsForTaskOrganizer(android.app.CameraCompatTaskInfo p0) { return false; }
    public boolean equalsForCompatUi(android.app.CameraCompatTaskInfo p0) { return false; }
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String cameraCompatControlStateToString(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String freeformCameraCompatModeToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CameraCompatControlState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FreeformCameraCompatMode {
    }
}
