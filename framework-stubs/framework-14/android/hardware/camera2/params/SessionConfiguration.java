package android.hardware.camera2.params;

public final class SessionConfiguration implements android.os.Parcelable {
    public static final int SESSION_REGULAR = 0;
    public static final int SESSION_HIGH_SPEED = 1;
    public static final int SESSION_VENDOR_START = 32768;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.params.SessionConfiguration> CREATOR = null;
    public SessionConfiguration(int p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraCaptureSession.StateCallback p3) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int getSessionType() { return 0; }
    public java.util.List<android.hardware.camera2.params.OutputConfiguration> getOutputConfigurations() { return null; }
    public android.hardware.camera2.CameraCaptureSession.StateCallback getStateCallback() { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
    public void setInputConfiguration(android.hardware.camera2.params.InputConfiguration p0) {}
    public android.hardware.camera2.params.InputConfiguration getInputConfiguration() { return null; }
    public void setSessionParameters(android.hardware.camera2.CaptureRequest p0) {}
    public android.hardware.camera2.CaptureRequest getSessionParameters() { return null; }
    public void setColorSpace(android.graphics.ColorSpace.Named p0) {}
    public void clearColorSpace() {}
    @android.annotation.SuppressLint("MethodNameUnits")
    public android.graphics.ColorSpace getColorSpace() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionMode {
    }
}
