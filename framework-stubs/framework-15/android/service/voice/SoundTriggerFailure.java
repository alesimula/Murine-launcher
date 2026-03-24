package android.service.voice;

@android.annotation.SystemApi
public final class SoundTriggerFailure implements android.os.Parcelable {
    public static final int ERROR_CODE_UNKNOWN = 0;
    public static final int ERROR_CODE_MODULE_DIED = 1;
    public static final int ERROR_CODE_RECOGNITION_RESUME_FAILED = 2;
    public static final int ERROR_CODE_UNEXPECTED_PREEMPTION = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.voice.SoundTriggerFailure> CREATOR = null;
    public SoundTriggerFailure(int p0, java.lang.String p1) {}
    public SoundTriggerFailure(int p0, java.lang.String p1, int p2) {}
    public int getErrorCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getErrorMessage() { return null; }
    public int getSuggestedAction() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SoundTriggerErrorCode {
    }
}
