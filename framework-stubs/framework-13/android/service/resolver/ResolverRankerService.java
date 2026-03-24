package android.service.resolver;

@android.annotation.SystemApi
public abstract class ResolverRankerService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.resolver.ResolverRankerService";
    public static final java.lang.String HOLD_PERMISSION = "android.permission.PROVIDE_RESOLVER_RANKER_SERVICE";
    public static final java.lang.String BIND_PERMISSION = "android.permission.BIND_RESOLVER_RANKER_SERVICE";
    public ResolverRankerService() { super(); }
    public void onPredictSharingProbabilities(java.util.List<android.service.resolver.ResolverTarget> p0) {}
    public void onTrainRankingModel(java.util.List<android.service.resolver.ResolverTarget> p0, int p1) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void onDestroy() {}

    private class ResolverRankerServiceWrapper extends android.service.resolver.IResolverRankerService.Stub {
        public void predict(java.util.List<android.service.resolver.ResolverTarget> p0, android.service.resolver.IResolverRankerResult p1) throws android.os.RemoteException {}
        public void train(java.util.List<android.service.resolver.ResolverTarget> p0, int p1) throws android.os.RemoteException {}
    }
}
