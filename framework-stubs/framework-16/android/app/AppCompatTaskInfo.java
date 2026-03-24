package android.app;

public class AppCompatTaskInfo implements android.os.Parcelable {
    public int topActivityLetterboxVerticalPosition;
    public int topActivityLetterboxHorizontalPosition;
    public int topActivityLetterboxWidth;
    public int topActivityLetterboxHeight;
    @android.annotation.NonNull
    public final android.graphics.Rect topActivityAppBounds = null;
    @android.annotation.Nullable
    public android.graphics.Rect topActivityLetterboxBounds;
    public float topNonResizableActivityAspectRatio;
    public android.app.CameraCompatTaskInfo cameraCompatTaskInfo;
    public static final int FLAG_HAS_MIN_ASPECT_RATIO_OVERRIDE = 512;
    public static final int FLAG_OPT_OUT_EDGE_TO_EDGE = 2048;
    public static final int FLAG_SAFE_REGION_LETTERBOXED = 4096;
    public static final android.os.Parcelable.Creator<android.app.AppCompatTaskInfo> CREATOR = null;
    @android.annotation.NonNull
    static android.app.AppCompatTaskInfo create() { return null; }
    public int describeContents() { return 0; }
    public boolean hasCompatUI() { return false; }
    public boolean isTopActivityPillarboxShaped() { return false; }
    public boolean isLetterboxEducationEnabled() { return false; }
    public void setLetterboxEducationEnabled(boolean p0) {}
    public boolean eligibleForLetterboxEducation() { return false; }
    public void setEligibleForLetterboxEducation(boolean p0) {}
    public boolean eligibleForUserAspectRatioButton() { return false; }
    public void setEligibleForUserAspectRatioButton(boolean p0) {}
    public boolean isLetterboxDoubleTapEnabled() { return false; }
    public void setLetterboxDoubleTapEnabled(boolean p0) {}
    public boolean isFromLetterboxDoubleTap() { return false; }
    public void setIsFromLetterboxDoubleTap(boolean p0) {}
    public boolean isUserFullscreenOverrideEnabled() { return false; }
    public void setUserFullscreenOverrideEnabled(boolean p0) {}
    public boolean isSystemFullscreenOverrideEnabled() { return false; }
    public void setSystemFullscreenOverrideEnabled(boolean p0) {}
    public boolean isTopActivityInSizeCompat() { return false; }
    public void setTopActivityInSizeCompat(boolean p0) {}
    public boolean isRestartMenuEnabledForDisplayMove() { return false; }
    public void setRestartMenuEnabledForDisplayMove(boolean p0) {}
    public boolean isTopActivitySafeRegionLetterboxed() { return false; }
    public void setTopActivitySafeRegionLetterboxed(boolean p0) {}
    public boolean isTopActivityLetterboxed() { return false; }
    public void setTopActivityLetterboxed(boolean p0) {}
    public boolean hasMinAspectRatioOverride() { return false; }
    public void setHasMinAspectRatioOverride(boolean p0) {}
    public void setOptOutEdgeToEdge(boolean p0) {}
    public boolean hasOptOutEdgeToEdge() { return false; }
    public void clearTopActivityFlags() {}
    public boolean equalsForTaskOrganizer(android.app.AppCompatTaskInfo p0) { return false; }
    public boolean equalsForCompatUi(android.app.AppCompatTaskInfo p0) { return false; }
    void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TopActivityFlag {
    }
}
