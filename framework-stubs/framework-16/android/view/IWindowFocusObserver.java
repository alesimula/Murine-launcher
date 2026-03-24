package android.view;

public interface IWindowFocusObserver extends android.os.IInterface {
    public void focusGained(android.os.IBinder p0) throws android.os.RemoteException;
    public void focusLost(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.view.IWindowFocusObserver {
        public Default() {}
        public void focusGained(android.os.IBinder p0) throws android.os.RemoteException {}
        public void focusLost(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowFocusObserver {
        public static final java.lang.String DESCRIPTOR = "android.view.IWindowFocusObserver";
        static final int TRANSACTION_focusGained = 1;
        static final int TRANSACTION_focusLost = 2;
        public Stub() { super(); }
        public static android.view.IWindowFocusObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.IWindowFocusObserver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void focusGained(android.os.IBinder p0) throws android.os.RemoteException {}
            public void focusLost(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
