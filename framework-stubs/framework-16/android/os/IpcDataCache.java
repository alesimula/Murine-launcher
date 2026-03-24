package android.os;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class IpcDataCache<Query extends java.lang.Object, Result extends java.lang.Object> extends android.app.PropertyInvalidatedCache<Query, Result> {
    public static final java.lang.String MODULE_TEST = "test";
    public static final java.lang.String MODULE_SYSTEM = "system_server";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final java.lang.String MODULE_BLUETOOTH = "bluetooth";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.os.ipc_data_cache_module_adservices")
    public static final java.lang.String MODULE_ADSERVICES = "adservices";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public IpcDataCache(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.os.IpcDataCache.QueryHandler<Query, Result> p4) { super(0, (java.lang.String)null); }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void disableForCurrentProcess() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void disableForCurrentProcess(java.lang.String p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.Nullable
    public Result query(Query p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void invalidateCache() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void invalidateCache(java.lang.String p0, java.lang.String p1) {}
    public IpcDataCache(android.os.IpcDataCache.Config p0, android.os.IpcDataCache.QueryHandler<Query, Result> p1) { super(0, (java.lang.String)null); }
    public IpcDataCache(android.os.IpcDataCache.Config p0, android.os.IpcDataCache.RemoteCall<Query, Result> p1) { super(0, (java.lang.String)null); }
    public IpcDataCache(android.os.IpcDataCache.Config p0, android.os.IpcDataCache.RemoteCall<Query, Result> p1, android.os.IpcDataCache.BypassCall<Query> p2) { super(0, (java.lang.String)null); }
    public final void forgetDisableLocal() {}
    public final boolean isDisabled() { return false; }
    public boolean getDisabledState() { return false; }
    public final void disableInstance() {}
    public final void disableSystemWide() {}
    public static void setTestMode(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.os.ipc_data_cache_testmode_apis")
    public static void setCacheTestMode(boolean p0) {}

    public static interface BypassCall<Query extends java.lang.Object> {
        public java.lang.Boolean apply(Query p0);
    }

    public static class Config {
        final android.app.PropertyInvalidatedCache.Args mArgs = null;
        final java.lang.String mName = null;
        public Config(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        public Config(int p0, java.lang.String p1, java.lang.String p2) {}
        public Config(android.os.IpcDataCache.Config p0, java.lang.String p1, java.lang.String p2) {}
        public Config(android.os.IpcDataCache.Config p0, java.lang.String p1) {}
        public android.os.IpcDataCache.Config child(java.lang.String p0) { return null; }
        public android.os.IpcDataCache.Config cacheNulls(boolean p0) { return null; }
        public android.os.IpcDataCache.Config isolateUids(boolean p0) { return null; }
        public void invalidateCache() {}
        public void disableForCurrentProcess() {}
        public void disableAllForCurrentProcess() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IpcDataCacheModule {
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static abstract class QueryHandler<Q extends java.lang.Object, R extends java.lang.Object> extends android.app.PropertyInvalidatedCache.QueryHandler<Q, R> {
        public QueryHandler() { super(); }
        @android.annotation.Nullable
        public abstract R apply(Q p0);
        public boolean shouldBypassCache(Q p0) { return false; }
    }

    public static interface RemoteCall<Query extends java.lang.Object, Result extends java.lang.Object> {
        public Result apply(Query p0) throws android.os.RemoteException;
    }

    private static class SystemServerCallHandler<Query extends java.lang.Object, Result extends java.lang.Object> extends android.os.IpcDataCache.QueryHandler<Query, Result> {
        public SystemServerCallHandler(android.os.IpcDataCache.RemoteCall p0) { super(); }
        public Result apply(Query p0) { return null; }
    }
}
