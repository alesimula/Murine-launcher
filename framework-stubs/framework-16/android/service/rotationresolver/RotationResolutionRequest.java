package android.service.rotationresolver;

@android.annotation.SystemApi
public final class RotationResolutionRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.rotationresolver.RotationResolutionRequest> CREATOR = null;
    public RotationResolutionRequest(java.lang.String p0, int p1, int p2, boolean p3, long p4) {}
    @android.annotation.NonNull
    public java.lang.String getForegroundPackageName() { return null; }
    public int getCurrentRotation() { return 0; }
    public int getProposedRotation() { return 0; }
    public boolean shouldUseCamera() { return false; }
    public long getTimeoutMillis() { return 0L; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    RotationResolutionRequest(android.os.Parcel p0) {}
}
