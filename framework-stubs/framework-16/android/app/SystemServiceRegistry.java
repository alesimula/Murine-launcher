package android.app;

@android.annotation.SystemApi
public final class SystemServiceRegistry {
    public static boolean sEnableServiceNotFoundWtf;
    static final long NULL_GAME_MANAGER_IN_WEAR = 340929737L;
    public static java.lang.Object[] createServiceCache() { return null; }
    public static java.lang.Object getSystemService(android.app.ContextImpl p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.webkit.update_service_ipc_wrapper")
    @android.annotation.Nullable
    public static java.lang.Object getSystemServiceWithNoContext(java.lang.String p0) { return null; }
    public static java.lang.String getSystemServiceName(java.lang.Class<?> p0) { return null; }
    @android.annotation.Nullable
    public static java.lang.String getSystemServiceClassName(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public static <TServiceClass extends java.lang.Object> void registerStaticService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.StaticServiceProducerWithBinder<TServiceClass> p2) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.webkit.update_service_ipc_wrapper")
    public static <TServiceClass extends java.lang.Object> void registerForeverStaticService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.StaticServiceProducerWithBinder<TServiceClass> p2) {}
    @android.annotation.SystemApi
    public static <TServiceClass extends java.lang.Object> void registerStaticService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.StaticServiceProducerWithoutBinder<TServiceClass> p2) {}
    @android.annotation.SystemApi
    public static <TServiceClass extends java.lang.Object> void registerContextAwareService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.ContextAwareServiceProducerWithBinder<TServiceClass> p2) {}
    @android.annotation.SystemApi
    public static <TServiceClass extends java.lang.Object> void registerContextAwareService(java.lang.String p0, java.lang.Class<TServiceClass> p1, android.app.SystemServiceRegistry.ContextAwareServiceProducerWithoutBinder<TServiceClass> p2) {}
    public static void onServiceNotFound(android.os.ServiceManager.ServiceNotFoundException p0) {}

    static abstract class CachedServiceFetcher<T extends java.lang.Object> implements android.app.SystemServiceRegistry.ServiceFetcher<T> {
        CachedServiceFetcher() {}
        public final T getService(android.app.ContextImpl p0) { return null; }
        public abstract T createService(android.app.ContextImpl p0) throws android.os.ServiceManager.ServiceNotFoundException;
        public final boolean supportsFetchWithoutContext() { return false; }
    }

    @android.annotation.SystemApi
    public static interface ContextAwareServiceProducerWithBinder<TServiceClass extends java.lang.Object> {
        @android.annotation.NonNull
        public TServiceClass createService(android.content.Context p0, android.os.IBinder p1);
    }

    @android.annotation.SystemApi
    public static interface ContextAwareServiceProducerWithoutBinder<TServiceClass extends java.lang.Object> {
        @android.annotation.NonNull
        public TServiceClass createService(android.content.Context p0);
    }

    static interface ServiceFetcher<T extends java.lang.Object> {
        public T getService(android.app.ContextImpl p0);
        default public boolean supportsFetchWithoutContext() { return false; }
    }

    static abstract class StaticServiceFetcher<T extends java.lang.Object> implements android.app.SystemServiceRegistry.ServiceFetcher<T> {
        StaticServiceFetcher() {}
        public final T getService(android.app.ContextImpl p0) { return null; }
        public abstract T createService() throws android.os.ServiceManager.ServiceNotFoundException;
        public boolean supportsFetchWithoutContext() { return false; }
    }

    @android.annotation.SystemApi
    public static interface StaticServiceProducerWithBinder<TServiceClass extends java.lang.Object> {
        @android.annotation.NonNull
        public TServiceClass createService(android.os.IBinder p0);
    }

    @android.annotation.SystemApi
    public static interface StaticServiceProducerWithoutBinder<TServiceClass extends java.lang.Object> {
        @android.annotation.NonNull
        public TServiceClass createService();
    }
}
