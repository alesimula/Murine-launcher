package android.content.pm;

public abstract class RegisteredServicesCache<V extends java.lang.Object> {
    protected static final java.lang.String REGISTERED_SERVICES_DIR = "registered_services";
    public final android.content.Context mContext = null;
    protected final java.lang.Object mServicesLock = null;
    public RegisteredServicesCache(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.content.pm.XmlSerializerAndParser<V> p4) {}
    public void invalidateCache(int p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2, int p3) {}
    public android.content.pm.RegisteredServicesCacheListener<V> getListener() { return null; }
    public void setListener(android.content.pm.RegisteredServicesCacheListener<V> p0, android.os.Handler p1) {}
    public android.content.pm.RegisteredServicesCache.ServiceInfo<V> getServiceInfo(V p0, int p1) { return null; }
    public java.util.Collection<android.content.pm.RegisteredServicesCache.ServiceInfo<V>> getAllServices(int p0) { return null; }
    public void updateServices(int p0) {}
    public boolean getBindInstantServiceAllowed(int p0) { return false; }
    public void setBindInstantServiceAllowed(int p0, boolean p1) {}
    protected boolean inSystemImage(int p0) { return false; }
    protected java.util.List<android.content.pm.ResolveInfo> queryIntentServices(int p0) { return null; }
    protected void onServicesChangedLocked(int p0) {}
    protected android.content.pm.RegisteredServicesCache.ServiceInfo<V> parseServiceInfo(android.content.pm.ResolveInfo p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    protected void onUserRemoved(int p0) {}
    protected java.util.List<android.content.pm.UserInfo> getUsers() { return null; }
    protected android.content.pm.UserInfo getUser(int p0) { return null; }
    protected java.io.File getUserSystemDirectory(int p0) { return null; }
    protected java.io.File getDataDirectory() { return null; }
    protected java.util.Map<V, java.lang.Integer> getPersistentServices(int p0) { return null; }
    public abstract V parseServiceAttributes(android.content.res.Resources p0, java.lang.String p1, android.util.AttributeSet p2);
    public void unregisterReceivers() {}

    public static class ServiceInfo<V extends java.lang.Object> {
        public final V type = null;
        public final android.content.pm.ComponentInfo componentInfo = null;
        public final android.content.ComponentName componentName = null;
        public final int uid = 0;
        public ServiceInfo(V p0, android.content.pm.ComponentInfo p1, android.content.ComponentName p2) {}
        public java.lang.String toString() { return null; }
    }

    private static class UserServices<V extends java.lang.Object> {
        final java.util.Map<V, java.lang.Integer> persistentServices = null;
        java.util.Map<V, android.content.pm.RegisteredServicesCache.ServiceInfo<V>> services;
        boolean mPersistentServicesFileDidNotExist;
        boolean mBindInstantServiceAllowed;
    }
}
