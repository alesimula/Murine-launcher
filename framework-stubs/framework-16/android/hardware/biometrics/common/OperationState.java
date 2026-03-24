package android.hardware.biometrics.common;

public final class OperationState implements android.os.Parcelable {
    public static final int fingerprintOperationState = 0;
    public static final int faceOperationState = 1;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.OperationState> CREATOR = null;
    public OperationState() {}
    public int getTag() { return 0; }
    public static android.hardware.biometrics.common.OperationState fingerprintOperationState(android.hardware.biometrics.common.OperationState.FingerprintOperationState p0) { return null; }
    public android.hardware.biometrics.common.OperationState.FingerprintOperationState getFingerprintOperationState() { return null; }
    public void setFingerprintOperationState(android.hardware.biometrics.common.OperationState.FingerprintOperationState p0) {}
    public static android.hardware.biometrics.common.OperationState faceOperationState(android.hardware.biometrics.common.OperationState.FaceOperationState p0) { return null; }
    public android.hardware.biometrics.common.OperationState.FaceOperationState getFaceOperationState() { return null; }
    public void setFaceOperationState(android.hardware.biometrics.common.OperationState.FaceOperationState p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class FaceOperationState implements android.os.Parcelable {
        public final android.os.ParcelableHolder extension = null;
        public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.OperationState.FaceOperationState> CREATOR = null;
        public FaceOperationState() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class FingerprintOperationState implements android.os.Parcelable {
        public final android.os.ParcelableHolder extension = null;
        public boolean isHardwareIgnoringTouches;
        public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.OperationState.FingerprintOperationState> CREATOR = null;
        public FingerprintOperationState() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface Tag {
        public static final int fingerprintOperationState = 0;
        public static final int faceOperationState = 1;
    }
}
