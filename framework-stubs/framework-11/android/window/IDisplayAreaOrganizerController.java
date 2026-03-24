package android.window;

public interface IDisplayAreaOrganizerController extends android.os.IInterface {
    public void registerOrganizer(android.window.IDisplayAreaOrganizer p0, int p1) throws android.os.RemoteException;
    public void unregisterOrganizer(android.window.IDisplayAreaOrganizer p0) throws android.os.RemoteException;

    public static class Default implements android.window.IDisplayAreaOrganizerController {
        public Default() {}
        public void registerOrganizer(android.window.IDisplayAreaOrganizer p0, int p1) throws android.os.RemoteException {}
        public void unregisterOrganizer(android.window.IDisplayAreaOrganizer p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IDisplayAreaOrganizerController {
        private static final java.lang.String DESCRIPTOR = "android.window.IDisplayAreaOrganizerController";
        static final int TRANSACTION_registerOrganizer = 1;
        static final int TRANSACTION_unregisterOrganizer = 2;
        public Stub() { super(); }
        public static android.window.IDisplayAreaOrganizerController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.IDisplayAreaOrganizerController p0) { return false; }
        public static android.window.IDisplayAreaOrganizerController getDefaultImpl() { return null; }

        private static class Proxy implements android.window.IDisplayAreaOrganizerController {
            private android.os.IBinder mRemote;
            public static android.window.IDisplayAreaOrganizerController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerOrganizer(android.window.IDisplayAreaOrganizer p0, int p1) throws android.os.RemoteException {}
            public void unregisterOrganizer(android.window.IDisplayAreaOrganizer p0) throws android.os.RemoteException {}
        }
    }
}
