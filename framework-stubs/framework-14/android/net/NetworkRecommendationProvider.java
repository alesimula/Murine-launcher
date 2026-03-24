package android.net;

@android.annotation.SystemApi
public abstract class NetworkRecommendationProvider {
    public NetworkRecommendationProvider(android.content.Context p0, java.util.concurrent.Executor p1) {}
    public abstract void onRequestScores(android.net.NetworkKey[] p0);
    public final android.os.IBinder getBinder() { return null; }

    private final class ServiceWrapper extends android.net.INetworkRecommendationProvider.Stub {
        ServiceWrapper(android.net.NetworkRecommendationProvider p0, android.content.Context p1, java.util.concurrent.Executor p2) { super(); }
        public void requestScores(android.net.NetworkKey[] p0) throws android.os.RemoteException {}
    }
}
