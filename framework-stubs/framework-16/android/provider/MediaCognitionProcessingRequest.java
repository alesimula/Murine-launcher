package android.provider;

@android.annotation.FlaggedApi("com.android.providers.media.flags.media_cognition_service")
public final class MediaCognitionProcessingRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.provider.MediaCognitionProcessingRequest> CREATOR = null;
    MediaCognitionProcessingRequest() {}
    public boolean checkProcessingRequired(int p0) { return false; }
    public int describeContents() { return 0; }
    public int getProcessingCombination() { return 0; }
    @android.annotation.NonNull
    public android.net.Uri getUri() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.net.Uri p0) {}
        @android.annotation.NonNull
        public android.provider.MediaCognitionProcessingRequest.Builder addProcessingRequest(int p0) { return null; }
        @android.annotation.NonNull
        public android.provider.MediaCognitionProcessingRequest build() { return null; }
        @android.annotation.NonNull
        public android.provider.MediaCognitionProcessingRequest.Builder setProcessingCombination(int p0) { return null; }
    }
}
