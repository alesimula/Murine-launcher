package android.os;

class ServiceManagerProxy implements android.os.IServiceManager {
    private android.os.IBinder mRemote;
    private android.os.IServiceManager mServiceManager;
    public ServiceManagerProxy(android.os.IBinder p0) {}
    public android.os.IBinder asBinder() { return null; }
    public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException {}
    public java.lang.String[] listServices(int p0) throws android.os.RemoteException { return null; }
    public void registerForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
    public void unregisterForNotifications(java.lang.String p0, android.os.IServiceCallback p1) throws android.os.RemoteException {}
    public boolean isDeclared(java.lang.String p0) throws android.os.RemoteException { return false; }
    public java.lang.String[] getDeclaredInstances(java.lang.String p0) throws android.os.RemoteException { return null; }
    public java.lang.String updatableViaApex(java.lang.String p0) throws android.os.RemoteException { return null; }
    public void registerClientCallback(java.lang.String p0, android.os.IBinder p1, android.os.IClientCallback p2) throws android.os.RemoteException {}
    public void tryUnregisterService(java.lang.String p0, android.os.IBinder p1) throws android.os.RemoteException {}
    public android.os.ServiceDebugInfo[] getServiceDebugInfo() throws android.os.RemoteException { return null; }
}
