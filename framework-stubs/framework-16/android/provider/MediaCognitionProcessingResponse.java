package android.provider;

@android.annotation.FlaggedApi("com.android.providers.media.flags.media_cognition_service")
public class MediaCognitionProcessingResponse {
    MediaCognitionProcessingResponse() {}
    @android.annotation.Nullable
    public java.util.List<java.lang.String> getImageLabels() { return null; }
    @android.annotation.Nullable
    public java.lang.String getImageOcrLatin() { return null; }
    @android.annotation.NonNull
    public android.provider.MediaCognitionProcessingRequest getRequest() { return null; }

    public static final class Builder {
        public Builder(android.provider.MediaCognitionProcessingRequest p0) {}
        @android.annotation.NonNull
        public android.provider.MediaCognitionProcessingResponse build() { return null; }
        @android.annotation.NonNull
        public android.provider.MediaCognitionProcessingResponse.Builder setImageLabels(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.provider.MediaCognitionProcessingResponse.Builder setImageOcrLatin(java.lang.String p0) { return null; }
    }
}
