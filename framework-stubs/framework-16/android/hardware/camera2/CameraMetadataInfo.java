package android.hardware.camera2;

public final class CameraMetadataInfo implements android.os.Parcelable {
    public static final int fmqSize = 0;
    public static final int metadata = 1;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.CameraMetadataInfo> CREATOR = null;
    public CameraMetadataInfo() {}
    public int getTag() { return 0; }
    public static android.hardware.camera2.CameraMetadataInfo fmqSize(long p0) { return null; }
    public long getFmqSize() { return 0L; }
    public void setFmqSize(long p0) {}
    public static android.hardware.camera2.CameraMetadataInfo metadata(android.hardware.camera2.impl.CameraMetadataNative p0) { return null; }
    public android.hardware.camera2.impl.CameraMetadataNative getMetadata() { return null; }
    public void setMetadata(android.hardware.camera2.impl.CameraMetadataNative p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int fmqSize = 0;
        public static final int metadata = 1;
    }
}
