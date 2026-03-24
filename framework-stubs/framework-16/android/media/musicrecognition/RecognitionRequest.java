package android.media.musicrecognition;

@android.annotation.SystemApi
public final class RecognitionRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.musicrecognition.RecognitionRequest> CREATOR = null;
    @android.annotation.NonNull
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    @android.annotation.NonNull
    public android.media.AudioFormat getAudioFormat() { return null; }
    public int getCaptureSession() { return 0; }
    public int getMaxAudioLengthSeconds() { return 0; }
    public int getIgnoreBeginningFrames() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.musicrecognition.RecognitionRequest.Builder setAudioAttributes(android.media.AudioAttributes p0) { return null; }
        @android.annotation.NonNull
        public android.media.musicrecognition.RecognitionRequest.Builder setAudioFormat(android.media.AudioFormat p0) { return null; }
        @android.annotation.NonNull
        public android.media.musicrecognition.RecognitionRequest.Builder setCaptureSession(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.musicrecognition.RecognitionRequest.Builder setMaxAudioLengthSeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.musicrecognition.RecognitionRequest.Builder setIgnoreBeginningFrames(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.musicrecognition.RecognitionRequest build() { return null; }
    }
}
