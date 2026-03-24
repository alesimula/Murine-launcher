package android.provider;

@android.annotation.FlaggedApi("com.android.providers.media.flags.media_cognition_service")
public interface MediaCognitionProcessingCallback {
    public void onFailure(java.lang.String p0);
    public void onSuccess(java.util.List<android.provider.MediaCognitionProcessingResponse> p0);
}
