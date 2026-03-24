package android.window;

public interface IMultitaskingController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IMultitaskingController";
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public android.window.IMultitaskingControllerCallback setMultitaskingDelegate(android.window.IMultitaskingDelegate p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.REQUEST_SYSTEM_MULTITASKING_CONTROLS")
    public android.window.IMultitaskingDelegate getClientInterface(android.window.IMultitaskingControllerCallback p0) throws android.os.RemoteException;

    public static class Default implements android.window.IMultitaskingController {
        public Default() {}
        public android.window.IMultitaskingControllerCallback setMultitaskingDelegate(android.window.IMultitaskingDelegate p0) throws android.os.RemoteException { return null; }
        public android.window.IMultitaskingDelegate getClientInterface(android.window.IMultitaskingControllerCallback p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IMultitaskingController {
        static final int TRANSACTION_setMultitaskingDelegate = 1;
        static final int TRANSACTION_getClientInterface = 2;
        public Stub() { super(); }
        public static android.window.IMultitaskingController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.IMultitaskingController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.window.IMultitaskingControllerCallback setMultitaskingDelegate(android.window.IMultitaskingDelegate p0) throws android.os.RemoteException { return null; }
            public android.window.IMultitaskingDelegate getClientInterface(android.window.IMultitaskingControllerCallback p0) throws android.os.RemoteException { return null; }
        }
    }
}
