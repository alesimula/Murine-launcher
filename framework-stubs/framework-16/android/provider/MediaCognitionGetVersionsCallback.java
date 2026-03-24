package android.provider;

@android.annotation.FlaggedApi("com.android.providers.media.flags.media_cognition_service")
public interface MediaCognitionGetVersionsCallback {
    public void onFailure(java.lang.String p0);
    public void onSuccess(android.provider.MediaCognitionProcessingVersions p0);
}
