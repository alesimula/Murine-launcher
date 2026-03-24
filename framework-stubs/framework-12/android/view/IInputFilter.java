package android.view;

public interface IInputFilter extends android.os.IInterface {
    public void install(android.view.IInputFilterHost p0) throws android.os.RemoteException;
    public void uninstall() throws android.os.RemoteException;
    public void filterInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.view.IInputFilter {
        public Default() {}
        public void install(android.view.IInputFilterHost p0) throws android.os.RemoteException {}
        public void uninstall() throws android.os.RemoteException {}
        public void filterInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IInputFilter {
        public static final java.lang.String DESCRIPTOR = "android.view.IInputFilter";
        static final int TRANSACTION_install = 1;
        static final int TRANSACTION_uninstall = 2;
        static final int TRANSACTION_filterInputEvent = 3;
        public Stub() { super(); }
        public static android.view.IInputFilter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IInputFilter p0) { return false; }
        public static android.view.IInputFilter getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IInputFilter {
            private android.os.IBinder mRemote;
            public static android.view.IInputFilter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void install(android.view.IInputFilterHost p0) throws android.os.RemoteException {}
            public void uninstall() throws android.os.RemoteException {}
            public void filterInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException {}
        }
    }
}
