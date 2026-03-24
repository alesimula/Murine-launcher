package android.app.appfunctions;

public interface IAppFunctionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.appfunctions.IAppFunctionManager";
    @android.annotation.RequiresPermission(value="android.permission.EXECUTE_APP_FUNCTIONS", conditional=true)
    public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException;
    public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.IAppFunctionEnabledCallback p4) throws android.os.RemoteException;

    public static class Default implements android.app.appfunctions.IAppFunctionManager {
        public Default() {}
        public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException { return null; }
        public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.IAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.appfunctions.IAppFunctionManager {
        static final int TRANSACTION_executeAppFunction = 1;
        static final int TRANSACTION_setAppFunctionEnabled = 2;
        public Stub() { super(); }
        public static android.app.appfunctions.IAppFunctionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.appfunctions.IAppFunctionManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException { return null; }
            public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.IAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
        }
    }
}
