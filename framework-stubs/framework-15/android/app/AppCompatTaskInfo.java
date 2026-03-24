package android.app;

public class AppCompatTaskInfo implements android.os.Parcelable {
    public boolean topActivityEligibleForLetterboxEducation;
    public boolean isLetterboxEducationEnabled;
    public boolean topActivityInSizeCompat;
    public boolean isLetterboxDoubleTapEnabled;
    public boolean topActivityEligibleForUserAspectRatioButton;
    public boolean isUserFullscreenOverrideEnabled;
    public boolean isSystemFullscreenOverrideEnabled;
    public boolean topActivityBoundsLetterboxed;
    public boolean isFromLetterboxDoubleTap;
    public int topActivityLetterboxVerticalPosition;
    public int topActivityLetterboxHorizontalPosition;
    public int topActivityLetterboxWidth;
    public int topActivityLetterboxHeight;
    public android.app.CameraCompatTaskInfo cameraCompatTaskInfo;
    public static final android.os.Parcelable.Creator<android.app.AppCompatTaskInfo> CREATOR = null;
    @android.annotation.NonNull
    static android.app.AppCompatTaskInfo create() { return null; }
    public int describeContents() { return 0; }
    public boolean hasCompatUI() { return false; }
    public boolean isTopActivityPillarboxed() { return false; }
    public boolean equalsForTaskOrganizer(android.app.AppCompatTaskInfo p0) { return false; }
    public boolean equalsForCompatUi(android.app.AppCompatTaskInfo p0) { return false; }
    void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
