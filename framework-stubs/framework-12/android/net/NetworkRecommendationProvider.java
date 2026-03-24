package android.net;

@android.annotation.SystemApi
public abstract class NetworkRecommendationProvider {
    private static final java.lang.String TAG = "NetworkRecProvider";
    private static final boolean VERBOSE = Boolean.valueOf(false);
    private final android.os.IBinder mService = null;
    public NetworkRecommendationProvider(android.content.Context p0, java.util.concurrent.Executor p1) {}
    public abstract void onRequestScores(android.net.NetworkKey[] p0);
    public final android.os.IBinder getBinder() { return null; }

    private final class ServiceWrapper extends android.net.INetworkRecommendationProvider.Stub {
        private final android.content.Context mContext = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.Handler mHandler = null;
        ServiceWrapper(android.net.NetworkRecommendationProvider p0, android.content.Context p1, java.util.concurrent.Executor p2) { super(); }
        public void requestScores(android.net.NetworkKey[] p0) throws android.os.RemoteException {}
        private void execute(java.lang.Runnable p0) {}
        private void enforceCallingPermission() {}
    }
}
