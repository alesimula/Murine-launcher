package android.accessibilityservice;

public final class MagnificationConfig implements android.os.Parcelable {
    public static final int MAGNIFICATION_MODE_DEFAULT = 0;
    public static final int MAGNIFICATION_MODE_FULLSCREEN = 1;
    public static final int MAGNIFICATION_MODE_WINDOW = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.accessibilityservice.MagnificationConfig> CREATOR = null;
    public int getMode() { return 0; }
    public boolean isActivated() { return false; }
    public float getScale() { return 0.0f; }
    public float getCenterX() { return 0.0f; }
    public float getCenterY() { return 0.0f; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.accessibilityservice.MagnificationConfig.Builder setMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.accessibilityservice.MagnificationConfig.Builder setActivated(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.accessibilityservice.MagnificationConfig.Builder setScale(float p0) { return null; }
        @android.annotation.NonNull
        public android.accessibilityservice.MagnificationConfig.Builder setCenterX(float p0) { return null; }
        @android.annotation.NonNull
        public android.accessibilityservice.MagnificationConfig.Builder setCenterY(float p0) { return null; }
        @android.annotation.NonNull
        public android.accessibilityservice.MagnificationConfig build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface MagnificationMode {
    }
}
