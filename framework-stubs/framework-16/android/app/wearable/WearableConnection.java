package android.app.wearable;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.wearable.enable_concurrent_wearable_connections")
public interface WearableConnection {
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor getConnection();
    @android.annotation.NonNull
    public android.os.PersistableBundle getMetadata();
    public void onConnectionAccepted();
    public void onError(int p0);
}
