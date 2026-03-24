package android.view;

public interface IDisplayWindowRotationController extends android.os.IInterface {
    public void onRotateDisplay(int p0, int p1, int p2, android.view.IDisplayWindowRotationCallback p3) throws android.os.RemoteException;

    public static class Default implements android.view.IDisplayWindowRotationController {
        public Default() {}
        public void onRotateDisplay(int p0, int p1, int p2, android.view.IDisplayWindowRotationCallback p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IDisplayWindowRotationController {
        private static final java.lang.String DESCRIPTOR = "android.view.IDisplayWindowRotationController";
        static final int TRANSACTION_onRotateDisplay = 1;
        public Stub() { super(); }
        public static android.view.IDisplayWindowRotationController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IDisplayWindowRotationController p0) { return false; }
        public static android.view.IDisplayWindowRotationController getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IDisplayWindowRotationController {
            private android.os.IBinder mRemote;
            public static android.view.IDisplayWindowRotationController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRotateDisplay(int p0, int p1, int p2, android.view.IDisplayWindowRotationCallback p3) throws android.os.RemoteException {}
        }
    }
}
