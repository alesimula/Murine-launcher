package android.window;

public interface IDisplayAreaOrganizerController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IDisplayAreaOrganizerController";
    public android.content.pm.ParceledListSlice<android.window.DisplayAreaAppearedInfo> registerOrganizer(android.window.IDisplayAreaOrganizer p0, int p1) throws android.os.RemoteException;
    public void unregisterOrganizer(android.window.IDisplayAreaOrganizer p0) throws android.os.RemoteException;
    public android.window.DisplayAreaAppearedInfo createTaskDisplayArea(android.window.IDisplayAreaOrganizer p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void deleteTaskDisplayArea(android.window.WindowContainerToken p0) throws android.os.RemoteException;

    public static class Default implements android.window.IDisplayAreaOrganizerController {
        public Default() {}
        public android.content.pm.ParceledListSlice<android.window.DisplayAreaAppearedInfo> registerOrganizer(android.window.IDisplayAreaOrganizer p0, int p1) throws android.os.RemoteException { return null; }
        public void unregisterOrganizer(android.window.IDisplayAreaOrganizer p0) throws android.os.RemoteException {}
        public android.window.DisplayAreaAppearedInfo createTaskDisplayArea(android.window.IDisplayAreaOrganizer p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public void deleteTaskDisplayArea(android.window.WindowContainerToken p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IDisplayAreaOrganizerController {
        static final int TRANSACTION_registerOrganizer = 1;
        static final int TRANSACTION_unregisterOrganizer = 2;
        static final int TRANSACTION_createTaskDisplayArea = 3;
        static final int TRANSACTION_deleteTaskDisplayArea = 4;
        public Stub() { super(); }
        public static android.window.IDisplayAreaOrganizerController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.IDisplayAreaOrganizerController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.pm.ParceledListSlice<android.window.DisplayAreaAppearedInfo> registerOrganizer(android.window.IDisplayAreaOrganizer p0, int p1) throws android.os.RemoteException { return null; }
            public void unregisterOrganizer(android.window.IDisplayAreaOrganizer p0) throws android.os.RemoteException {}
            public android.window.DisplayAreaAppearedInfo createTaskDisplayArea(android.window.IDisplayAreaOrganizer p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public void deleteTaskDisplayArea(android.window.WindowContainerToken p0) throws android.os.RemoteException {}
        }
    }
}
