package android.media;

@android.annotation.SystemApi
public interface NearbyMediaDevicesProvider {
    public void registerNearbyDevicesCallback(java.util.function.Consumer<java.util.List<android.media.NearbyDevice>> p0);
    public void unregisterNearbyDevicesCallback(java.util.function.Consumer<java.util.List<android.media.NearbyDevice>> p0);
}
