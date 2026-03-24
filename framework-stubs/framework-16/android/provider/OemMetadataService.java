package android.provider;

@android.annotation.FlaggedApi("com.android.providers.media.flags.enable_oem_metadata")
public abstract class OemMetadataService extends android.app.Service {
    public static final java.lang.String BIND_OEM_METADATA_SERVICE_PERMISSION = "com.android.providers.media.permission.BIND_OEM_METADATA_SERVICE";
    public static final java.lang.String SERVICE_INTERFACE = "android.provider.OemMetadataService";
    public OemMetadataService() { super(); }
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    public abstract java.util.Map<java.lang.String, java.lang.String> onGetOemCustomData(android.os.ParcelFileDescriptor p0);
    @android.annotation.FlaggedApi("com.android.providers.media.flags.enable_oem_metadata_using_mimetype")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.String> onGetOemCustomDataUsingMimeType(android.os.ParcelFileDescriptor p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public abstract java.util.Set<java.lang.String> onGetSupportedMimeTypes();
}
