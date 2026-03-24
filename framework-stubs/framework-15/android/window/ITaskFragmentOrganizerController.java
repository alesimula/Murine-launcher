package android.window;

public interface ITaskFragmentOrganizerController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ITaskFragmentOrganizerController";
    @android.annotation.RequiresPermission(value="android.permission.MANAGE_ACTIVITY_TASKS", conditional=true)
    public void registerOrganizer(android.window.ITaskFragmentOrganizer p0, boolean p1) throws android.os.RemoteException;
    public void unregisterOrganizer(android.window.ITaskFragmentOrganizer p0) throws android.os.RemoteException;
    public void registerRemoteAnimations(android.window.ITaskFragmentOrganizer p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException;
    public void unregisterRemoteAnimations(android.window.ITaskFragmentOrganizer p0) throws android.os.RemoteException;
    public boolean isActivityEmbedded(android.os.IBinder p0) throws android.os.RemoteException;
    public void onTransactionHandled(android.os.IBinder p0, android.window.WindowContainerTransaction p1, int p2, boolean p3) throws android.os.RemoteException;
    public void applyTransaction(android.window.WindowContainerTransaction p0, int p1, boolean p2, android.window.RemoteTransition p3) throws android.os.RemoteException;

    public static class Default implements android.window.ITaskFragmentOrganizerController {
        public Default() {}
        public void registerOrganizer(android.window.ITaskFragmentOrganizer p0, boolean p1) throws android.os.RemoteException {}
        public void unregisterOrganizer(android.window.ITaskFragmentOrganizer p0) throws android.os.RemoteException {}
        public void registerRemoteAnimations(android.window.ITaskFragmentOrganizer p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
        public void unregisterRemoteAnimations(android.window.ITaskFragmentOrganizer p0) throws android.os.RemoteException {}
        public boolean isActivityEmbedded(android.os.IBinder p0) throws android.os.RemoteException { return false; }
        public void onTransactionHandled(android.os.IBinder p0, android.window.WindowContainerTransaction p1, int p2, boolean p3) throws android.os.RemoteException {}
        public void applyTransaction(android.window.WindowContainerTransaction p0, int p1, boolean p2, android.window.RemoteTransition p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITaskFragmentOrganizerController {
        static final int TRANSACTION_registerOrganizer = 1;
        static final int TRANSACTION_unregisterOrganizer = 2;
        static final int TRANSACTION_registerRemoteAnimations = 3;
        static final int TRANSACTION_unregisterRemoteAnimations = 4;
        static final int TRANSACTION_isActivityEmbedded = 5;
        static final int TRANSACTION_onTransactionHandled = 6;
        static final int TRANSACTION_applyTransaction = 7;
        public Stub() { super(); }
        public static android.window.ITaskFragmentOrganizerController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.ITaskFragmentOrganizerController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerOrganizer(android.window.ITaskFragmentOrganizer p0, boolean p1) throws android.os.RemoteException {}
            public void unregisterOrganizer(android.window.ITaskFragmentOrganizer p0) throws android.os.RemoteException {}
            public void registerRemoteAnimations(android.window.ITaskFragmentOrganizer p0, android.view.RemoteAnimationDefinition p1) throws android.os.RemoteException {}
            public void unregisterRemoteAnimations(android.window.ITaskFragmentOrganizer p0) throws android.os.RemoteException {}
            public boolean isActivityEmbedded(android.os.IBinder p0) throws android.os.RemoteException { return false; }
            public void onTransactionHandled(android.os.IBinder p0, android.window.WindowContainerTransaction p1, int p2, boolean p3) throws android.os.RemoteException {}
            public void applyTransaction(android.window.WindowContainerTransaction p0, int p1, boolean p2, android.window.RemoteTransition p3) throws android.os.RemoteException {}
        }
    }
}
