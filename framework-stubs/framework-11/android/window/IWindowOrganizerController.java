package android.window;

public interface IWindowOrganizerController extends android.os.IInterface {
    public void applyTransaction(android.window.WindowContainerTransaction p0) throws android.os.RemoteException;
    public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.IWindowContainerTransactionCallback p1) throws android.os.RemoteException;
    public android.window.ITaskOrganizerController getTaskOrganizerController() throws android.os.RemoteException;
    public android.window.IDisplayAreaOrganizerController getDisplayAreaOrganizerController() throws android.os.RemoteException;
    public boolean takeScreenshot(android.window.WindowContainerToken p0, android.view.SurfaceControl p1) throws android.os.RemoteException;

    public static class Default implements android.window.IWindowOrganizerController {
        public Default() {}
        public void applyTransaction(android.window.WindowContainerTransaction p0) throws android.os.RemoteException {}
        public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.IWindowContainerTransactionCallback p1) throws android.os.RemoteException { return 0; }
        public android.window.ITaskOrganizerController getTaskOrganizerController() throws android.os.RemoteException { return null; }
        public android.window.IDisplayAreaOrganizerController getDisplayAreaOrganizerController() throws android.os.RemoteException { return null; }
        public boolean takeScreenshot(android.window.WindowContainerToken p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IWindowOrganizerController {
        private static final java.lang.String DESCRIPTOR = "android.window.IWindowOrganizerController";
        static final int TRANSACTION_applyTransaction = 1;
        static final int TRANSACTION_applySyncTransaction = 2;
        static final int TRANSACTION_getTaskOrganizerController = 3;
        static final int TRANSACTION_getDisplayAreaOrganizerController = 4;
        static final int TRANSACTION_takeScreenshot = 5;
        public Stub() { super(); }
        public static android.window.IWindowOrganizerController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.IWindowOrganizerController p0) { return false; }
        public static android.window.IWindowOrganizerController getDefaultImpl() { return null; }

        private static class Proxy implements android.window.IWindowOrganizerController {
            private android.os.IBinder mRemote;
            public static android.window.IWindowOrganizerController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void applyTransaction(android.window.WindowContainerTransaction p0) throws android.os.RemoteException {}
            public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.IWindowContainerTransactionCallback p1) throws android.os.RemoteException { return 0; }
            public android.window.ITaskOrganizerController getTaskOrganizerController() throws android.os.RemoteException { return null; }
            public android.window.IDisplayAreaOrganizerController getDisplayAreaOrganizerController() throws android.os.RemoteException { return null; }
            public boolean takeScreenshot(android.window.WindowContainerToken p0, android.view.SurfaceControl p1) throws android.os.RemoteException { return false; }
        }
    }
}
