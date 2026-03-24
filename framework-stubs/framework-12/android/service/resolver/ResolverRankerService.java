package android.service.resolver;

@android.annotation.SystemApi
public abstract class ResolverRankerService extends android.app.Service {
    private static final java.lang.String TAG = "ResolverRankerService";
    private static final boolean DEBUG = false;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.resolver.ResolverRankerService";
    public static final java.lang.String HOLD_PERMISSION = "android.permission.PROVIDE_RESOLVER_RANKER_SERVICE";
    public static final java.lang.String BIND_PERMISSION = "android.permission.BIND_RESOLVER_RANKER_SERVICE";
    private android.service.resolver.ResolverRankerService.ResolverRankerServiceWrapper mWrapper;
    private static final java.lang.String HANDLER_THREAD_NAME = "RESOLVER_RANKER_SERVICE";
    private volatile android.os.Handler mHandler;
    private android.os.HandlerThread mHandlerThread;
    public ResolverRankerService() { super(); }
    public void onPredictSharingProbabilities(java.util.List<android.service.resolver.ResolverTarget> p0) {}
    public void onTrainRankingModel(java.util.List<android.service.resolver.ResolverTarget> p0, int p1) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onDestroy() {}
    private static void sendResult(java.util.List<android.service.resolver.ResolverTarget> p0, android.service.resolver.IResolverRankerResult p1) {}

    private class ResolverRankerServiceWrapper extends android.service.resolver.IResolverRankerService.Stub {
        private ResolverRankerServiceWrapper(android.service.resolver.ResolverRankerService p0) { super(); }
        public void predict(java.util.List<android.service.resolver.ResolverTarget> p0, android.service.resolver.IResolverRankerResult p1) throws android.os.RemoteException {}
        public void train(java.util.List<android.service.resolver.ResolverTarget> p0, int p1) throws android.os.RemoteException {}
    }
}
