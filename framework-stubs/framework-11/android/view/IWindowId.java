package android.view;

public interface IWindowId extends android.os.IInterface {
    public void registerFocusObserver(android.view.IWindowFocusObserver p0) throws android.os.RemoteException;
    public void unregisterFocusObserver(android.view.IWindowFocusObserver p0) throws android.os.RemoteException;
    public boolean isFocused() throws android.os.RemoteException;

    public static class Default implements android.view.IWindowId {
        public Default() {}
        public void registerFocusObserver(android.view.IWindowFocusObserver p0) throws android.os.RemoteException {}
        public void unregisterFocusObserver(android.view.IWindowFocusObserver p0) throws android.os.RemoteException {}
        public boolean isFocused() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IWindowId {
        private static final java.lang.String DESCRIPTOR = "android.view.IWindowId";
        static final int TRANSACTION_registerFocusObserver = 1;
        static final int TRANSACTION_unregisterFocusObserver = 2;
        static final int TRANSACTION_isFocused = 3;
        public Stub() { super(); }
        public static android.view.IWindowId asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IWindowId p0) { return false; }
        public static android.view.IWindowId getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IWindowId {
            private android.os.IBinder mRemote;
            public static android.view.IWindowId sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerFocusObserver(android.view.IWindowFocusObserver p0) throws android.os.RemoteException {}
            public void unregisterFocusObserver(android.view.IWindowFocusObserver p0) throws android.os.RemoteException {}
            public boolean isFocused() throws android.os.RemoteException { return false; }
        }
    }
}
