package android.widget.photopicker;

@android.annotation.FlaggedApi("com.android.providers.media.flags.enable_embedded_photopicker")
public interface EmbeddedPhotoPickerProvider {
    public void openSession(android.os.IBinder p0, int p1, int p2, int p3, android.widget.photopicker.EmbeddedPhotoPickerFeatureInfo p4, java.util.concurrent.Executor p5, android.widget.photopicker.EmbeddedPhotoPickerClient p6);
}
