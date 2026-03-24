package android.view;

public interface IDisplayWindowRotationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IDisplayWindowRotationCallback";
    public void continueRotateDisplay(int p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException;

    public static class Default implements android.view.IDisplayWindowRotationCallback {
        public Default() {}
        public void continueRotateDisplay(int p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IDisplayWindowRotationCallback {
        static final int TRANSACTION_continueRotateDisplay = 1;
        public Stub() { super(); }
        public static android.view.IDisplayWindowRotationCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IDisplayWindowRotationCallback p0) { return false; }
        public static android.view.IDisplayWindowRotationCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IDisplayWindowRotationCallback {
            private android.os.IBinder mRemote;
            public static android.view.IDisplayWindowRotationCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void continueRotateDisplay(int p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException {}
        }
    }
}
