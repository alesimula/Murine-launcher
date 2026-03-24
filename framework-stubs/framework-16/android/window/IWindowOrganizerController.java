package android.window;

public interface IWindowOrganizerController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IWindowOrganizerController";
    public void applyTransaction(android.window.WindowContainerTransaction p0) throws android.os.RemoteException;
    public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.IWindowContainerTransactionCallback p1) throws android.os.RemoteException;
    public android.os.IBinder startNewTransition(int p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException;
    public void startTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException;
    public void finishTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException;
    public android.window.ITaskOrganizerController getTaskOrganizerController() throws android.os.RemoteException;
    public android.window.IDisplayAreaOrganizerController getDisplayAreaOrganizerController() throws android.os.RemoteException;
    public android.window.ITaskFragmentOrganizerController getTaskFragmentOrganizerController() throws android.os.RemoteException;
    public android.window.IMultitaskingController getMultitaskingController() throws android.os.RemoteException;
    public void registerTransitionPlayer(android.window.ITransitionPlayer p0) throws android.os.RemoteException;
    public void unregisterTransitionPlayer(android.window.ITransitionPlayer p0) throws android.os.RemoteException;
    public android.window.ITransitionMetricsReporter getTransitionMetricsReporter() throws android.os.RemoteException;
    public android.os.IBinder getApplyToken() throws android.os.RemoteException;

    public static class Default implements android.window.IWindowOrganizerController {
        public Default() {}
        public void applyTransaction(android.window.WindowContainerTransaction p0) throws android.os.RemoteException {}
        public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.IWindowContainerTransactionCallback p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder startNewTransition(int p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException { return null; }
        public void startTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException {}
        public void finishTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException {}
        public android.window.ITaskOrganizerController getTaskOrganizerController() throws android.os.RemoteException { return null; }
        public android.window.IDisplayAreaOrganizerController getDisplayAreaOrganizerController() throws android.os.RemoteException { return null; }
        public android.window.ITaskFragmentOrganizerController getTaskFragmentOrganizerController() throws android.os.RemoteException { return null; }
        public android.window.IMultitaskingController getMultitaskingController() throws android.os.RemoteException { return null; }
        public void registerTransitionPlayer(android.window.ITransitionPlayer p0) throws android.os.RemoteException {}
        public void unregisterTransitionPlayer(android.window.ITransitionPlayer p0) throws android.os.RemoteException {}
        public android.window.ITransitionMetricsReporter getTransitionMetricsReporter() throws android.os.RemoteException { return null; }
        public android.os.IBinder getApplyToken() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IWindowOrganizerController {
        static final int TRANSACTION_applyTransaction = 1;
        static final int TRANSACTION_applySyncTransaction = 2;
        static final int TRANSACTION_startNewTransition = 3;
        static final int TRANSACTION_startTransition = 4;
        static final int TRANSACTION_finishTransition = 5;
        static final int TRANSACTION_getTaskOrganizerController = 6;
        static final int TRANSACTION_getDisplayAreaOrganizerController = 7;
        static final int TRANSACTION_getTaskFragmentOrganizerController = 8;
        static final int TRANSACTION_getMultitaskingController = 9;
        static final int TRANSACTION_registerTransitionPlayer = 10;
        static final int TRANSACTION_unregisterTransitionPlayer = 11;
        static final int TRANSACTION_getTransitionMetricsReporter = 12;
        static final int TRANSACTION_getApplyToken = 13;
        public Stub() { super(); }
        public static android.window.IWindowOrganizerController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.IWindowOrganizerController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void applyTransaction(android.window.WindowContainerTransaction p0) throws android.os.RemoteException {}
            public int applySyncTransaction(android.window.WindowContainerTransaction p0, android.window.IWindowContainerTransactionCallback p1) throws android.os.RemoteException { return 0; }
            public android.os.IBinder startNewTransition(int p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException { return null; }
            public void startTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException {}
            public void finishTransition(android.os.IBinder p0, android.window.WindowContainerTransaction p1) throws android.os.RemoteException {}
            public android.window.ITaskOrganizerController getTaskOrganizerController() throws android.os.RemoteException { return null; }
            public android.window.IDisplayAreaOrganizerController getDisplayAreaOrganizerController() throws android.os.RemoteException { return null; }
            public android.window.ITaskFragmentOrganizerController getTaskFragmentOrganizerController() throws android.os.RemoteException { return null; }
            public android.window.IMultitaskingController getMultitaskingController() throws android.os.RemoteException { return null; }
            public void registerTransitionPlayer(android.window.ITransitionPlayer p0) throws android.os.RemoteException {}
            public void unregisterTransitionPlayer(android.window.ITransitionPlayer p0) throws android.os.RemoteException {}
            public android.window.ITransitionMetricsReporter getTransitionMetricsReporter() throws android.os.RemoteException { return null; }
            public android.os.IBinder getApplyToken() throws android.os.RemoteException { return null; }
        }
    }
}
