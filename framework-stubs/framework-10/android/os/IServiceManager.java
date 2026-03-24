package android.os;

public interface IServiceManager extends android.os.IInterface {
    public static final java.lang.String descriptor = "android.os.IServiceManager";
    public static final int GET_SERVICE_TRANSACTION = 1;
    public static final int CHECK_SERVICE_TRANSACTION = 2;
    public static final int ADD_SERVICE_TRANSACTION = 3;
    public static final int LIST_SERVICES_TRANSACTION = 4;
    public static final int CHECK_SERVICES_TRANSACTION = 5;
    public static final int SET_PERMISSION_CONTROLLER_TRANSACTION = 6;
    public static final int DUMP_FLAG_PRIORITY_CRITICAL = 1;
    public static final int DUMP_FLAG_PRIORITY_HIGH = 2;
    public static final int DUMP_FLAG_PRIORITY_NORMAL = 4;
    public static final int DUMP_FLAG_PRIORITY_DEFAULT = 8;
    public static final int DUMP_FLAG_PRIORITY_ALL = 15;
    public static final int DUMP_FLAG_PROTO = 16;
    @android.annotation.UnsupportedAppUsage
    public android.os.IBinder getService(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.os.IBinder checkService(java.lang.String p0) throws android.os.RemoteException;
    public void addService(java.lang.String p0, android.os.IBinder p1, boolean p2, int p3) throws android.os.RemoteException;
    public java.lang.String[] listServices(int p0) throws android.os.RemoteException;
    public void setPermissionController(android.os.IPermissionController p0) throws android.os.RemoteException;
}
