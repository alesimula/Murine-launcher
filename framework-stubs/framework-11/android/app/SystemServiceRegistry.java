package android.app;

@android.annotation.SystemApi
public final class SystemServiceRegistry {
    private static final java.lang.String TAG = "SystemServiceRegistry";
    public static boolean sEnableServiceNotFoundWtf;
    private static final java.util.Map<java.lang.Class<?>, java.lang.String> SYSTEM_SERVICE_NAMES = null;
    private static final java.util.Map<java.lang.String, android.app.SystemServiceRegistry.ServiceFetcher<?>> SYSTEM_SERVICE_FETCHERS = null;
    private static final java.util.Map<java.lang.String, java.lang.String> SYSTEM_SERVICE_CLASS_NAMES = null;
    private static int sServiceCacheSize;
    private static volatile boolean sInitializing;
    private SystemServiceRegistry() {}
    private static void ensureInitializing(java.lang.String p0) {}
    public static java.lang.Object[] createServiceCache() { return null; }
    public static java.lang.Object getSystemService(android.app.ContextImpl p0, java.lang.String p1) { return null; }
    public static java.lang.String getSystemServiceName(java.lang.Class<?> p0) { return null; }
    private static <T extends java.lang.Object> void registerService(java.lang.String p0, java.lang.Class<T> p1, android.app.SystemServiceRegistry.ServiceFetcher<T> p2) {}
    public static java.lang.String getSystemServiceClassName(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public static <TServiceClass extends java.lang.Object> void registerStaticService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.StaticServiceProducerWithBinder<TServiceClass> p2) {}
    @android.annotation.SystemApi
    public static <TServiceClass extends java.lang.Object> void registerStaticService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.StaticServiceProducerWithoutBinder<TServiceClass> p2) {}
    @android.annotation.SystemApi
    public static <TServiceClass extends java.lang.Object> void registerContextAwareService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.ContextAwareServiceProducerWithBinder<TServiceClass> p2) {}
    @android.annotation.SystemApi
    public static <TServiceClass extends java.lang.Object> void registerContextAwareService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.ContextAwareServiceProducerWithoutBinder<TServiceClass> p2) {}
    public static void onServiceNotFound(android.os.ServiceManager.ServiceNotFoundException p0) {}

    static abstract class CachedServiceFetcher<T extends java.lang.Object> implements android.app.SystemServiceRegistry.ServiceFetcher<T> {
        private final int mCacheIndex = 0;
        CachedServiceFetcher() {}
        public final T getService(android.app.ContextImpl p0) { return null; }
        public abstract T createService(android.app.ContextImpl p0) throws android.os.ServiceManager.ServiceNotFoundException;
    }

    @android.annotation.SystemApi
    public static interface ContextAwareServiceProducerWithBinder<TServiceClass extends java.lang.Object> {
        public TServiceClass createService(android.content.Context p0, android.os.IBinder p1);
    }

    @android.annotation.SystemApi
    public static interface ContextAwareServiceProducerWithoutBinder<TServiceClass extends java.lang.Object> {
        public TServiceClass createService(android.content.Context p0);
    }

    static interface ServiceFetcher<T extends java.lang.Object> {
        public T getService(android.app.ContextImpl p0);
    }

    static abstract class StaticApplicationContextServiceFetcher<T extends java.lang.Object> implements android.app.SystemServiceRegistry.ServiceFetcher<T> {
        private T mCachedInstance;
        StaticApplicationContextServiceFetcher() {}
        public final T getService(android.app.ContextImpl p0) { return null; }
        public abstract T createService(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException;
    }

    static abstract class StaticServiceFetcher<T extends java.lang.Object> implements android.app.SystemServiceRegistry.ServiceFetcher<T> {
        private T mCachedInstance;
        StaticServiceFetcher() {}
        public final T getService(android.app.ContextImpl p0) { return null; }
        public abstract T createService() throws android.os.ServiceManager.ServiceNotFoundException;
    }

    @android.annotation.SystemApi
    public static interface StaticServiceProducerWithBinder<TServiceClass extends java.lang.Object> {
        public TServiceClass createService(android.os.IBinder p0);
    }

    @android.annotation.SystemApi
    public static interface StaticServiceProducerWithoutBinder<TServiceClass extends java.lang.Object> {
        public TServiceClass createService();
    }
}
