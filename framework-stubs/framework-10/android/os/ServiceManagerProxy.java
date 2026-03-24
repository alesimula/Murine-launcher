package android.os;

class ServiceManagerProxy implements android.os.IServiceManager {
    @android.annotation.UnsupportedAppUsage
    private android.os.IBinder mRemote;
    public ServiceManagerProxy(android.os.IBinder p0) {}
    public android.os.IBinder asBinder() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException { return null; }
    public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException {}
    public java.lang.String[] listServices(int p0) throws android.os.RemoteException { return null; }
    public void setPermissionController(android.os.IPermissionController p0) throws android.os.RemoteException {}
}
