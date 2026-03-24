package android.widget.photopicker;

@android.annotation.FlaggedApi("com.android.providers.media.flags.enable_embedded_photopicker")
public interface EmbeddedPhotoPickerSession {
    public void close();
    @android.annotation.NonNull
    public android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage();
    public void notifyConfigurationChanged(android.content.res.Configuration p0);
    public void notifyPhotoPickerExpanded(boolean p0);
    public void notifyResized(int p0, int p1);
    public void notifyVisibilityChanged(boolean p0);
    public void requestRevokeUriPermission(java.util.List<android.net.Uri> p0);
}
