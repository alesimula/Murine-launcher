package android.view;

public interface IDisplayWindowListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IDisplayWindowListener";
    public void onDisplayAdded(int p0) throws android.os.RemoteException;
    public void onDisplayConfigurationChanged(int p0, android.content.res.Configuration p1) throws android.os.RemoteException;
    public void onDisplayRemoved(int p0) throws android.os.RemoteException;
    public void onFixedRotationStarted(int p0, int p1) throws android.os.RemoteException;
    public void onFixedRotationFinished(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.IDisplayWindowListener {
        public Default() {}
        public void onDisplayAdded(int p0) throws android.os.RemoteException {}
        public void onDisplayConfigurationChanged(int p0, android.content.res.Configuration p1) throws android.os.RemoteException {}
        public void onDisplayRemoved(int p0) throws android.os.RemoteException {}
        public void onFixedRotationStarted(int p0, int p1) throws android.os.RemoteException {}
        public void onFixedRotationFinished(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IDisplayWindowListener {
        static final int TRANSACTION_onDisplayAdded = 1;
        static final int TRANSACTION_onDisplayConfigurationChanged = 2;
        static final int TRANSACTION_onDisplayRemoved = 3;
        static final int TRANSACTION_onFixedRotationStarted = 4;
        static final int TRANSACTION_onFixedRotationFinished = 5;
        public Stub() { super(); }
        public static android.view.IDisplayWindowListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IDisplayWindowListener p0) { return false; }
        public static android.view.IDisplayWindowListener getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IDisplayWindowListener {
            private android.os.IBinder mRemote;
            public static android.view.IDisplayWindowListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDisplayAdded(int p0) throws android.os.RemoteException {}
            public void onDisplayConfigurationChanged(int p0, android.content.res.Configuration p1) throws android.os.RemoteException {}
            public void onDisplayRemoved(int p0) throws android.os.RemoteException {}
            public void onFixedRotationStarted(int p0, int p1) throws android.os.RemoteException {}
            public void onFixedRotationFinished(int p0) throws android.os.RemoteException {}
        }
    }
}
