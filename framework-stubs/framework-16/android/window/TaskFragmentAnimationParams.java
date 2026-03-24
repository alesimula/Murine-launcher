package android.window;

public final class TaskFragmentAnimationParams implements android.os.Parcelable {
    public static final android.window.TaskFragmentAnimationParams DEFAULT = null;
    public static final int DEFAULT_ANIMATION_BACKGROUND_COLOR = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentAnimationParams> CREATOR = null;
    public int getAnimationBackgroundColor() { return 0; }
    public int getOpenAnimationResId() { return 0; }
    public int getChangeAnimationResId() { return 0; }
    public int getCloseAnimationResId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean hasOverrideAnimation() { return false; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.window.TaskFragmentAnimationParams.Builder setAnimationBackgroundColor(int p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentAnimationParams.Builder setOpenAnimationResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentAnimationParams.Builder setChangeAnimationResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentAnimationParams.Builder setCloseAnimationResId(int p0) { return null; }
        @android.annotation.NonNull
        public android.window.TaskFragmentAnimationParams build() { return null; }
    }
}
