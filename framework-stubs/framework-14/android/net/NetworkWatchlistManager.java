package android.net;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class NetworkWatchlistManager {
    public NetworkWatchlistManager(android.content.Context p0, com.android.internal.net.INetworkWatchlistManager p1) {}
    public NetworkWatchlistManager(android.content.Context p0) {}
    public void reportWatchlistIfNecessary() {}
    public void reloadWatchlist() {}
    public byte[] getWatchlistConfigHash() { return null; }
}
