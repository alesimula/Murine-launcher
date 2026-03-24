package android.app.wallpapereffectsgeneration;

@android.annotation.SystemApi
public final class CameraAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.wallpapereffectsgeneration.CameraAttributes> CREATOR = null;
    public float[] getAnchorPointInWorldSpace() { return null; }
    public float[] getAnchorPointInOutputUvSpace() { return null; }
    public float getCameraOrbitYawDegrees() { return 0.0f; }
    public float getCameraOrbitPitchDegrees() { return 0.0f; }
    public float getDollyDistanceInWorldSpace() { return 0.0f; }
    public float getVerticalFovDegrees() { return 0.0f; }
    public float getFrustumNearInWorldSpace() { return 0.0f; }
    public float getFrustumFarInWorldSpace() { return 0.0f; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        @android.annotation.SystemApi
        public Builder(float[] p0, float[] p1) {}
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setCameraOrbitYawDegrees(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setCameraOrbitPitchDegrees(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setDollyDistanceInWorldSpace(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setVerticalFovDegrees(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setFrustumNearInWorldSpace(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes.Builder setFrustumFarInWorldSpace(float p0) { return null; }
        public android.app.wallpapereffectsgeneration.CameraAttributes build() { return null; }
    }
}
