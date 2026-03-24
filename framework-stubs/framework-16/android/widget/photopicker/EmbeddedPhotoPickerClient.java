package android.widget.photopicker;

@android.annotation.FlaggedApi("com.android.providers.media.flags.enable_embedded_photopicker")
public interface EmbeddedPhotoPickerClient {
    public void onSelectionComplete();
    public void onSessionError(java.lang.Throwable p0);
    public void onSessionOpened(android.widget.photopicker.EmbeddedPhotoPickerSession p0);
    public void onUriPermissionGranted(java.util.List<android.net.Uri> p0);
    public void onUriPermissionRevoked(java.util.List<android.net.Uri> p0);
}
