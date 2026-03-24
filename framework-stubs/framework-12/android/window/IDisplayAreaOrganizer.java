package android.window;

public interface IDisplayAreaOrganizer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IDisplayAreaOrganizer";
    public void onDisplayAreaAppeared(android.window.DisplayAreaInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    public void onDisplayAreaVanished(android.window.DisplayAreaInfo p0) throws android.os.RemoteException;
    public void onDisplayAreaInfoChanged(android.window.DisplayAreaInfo p0) throws android.os.RemoteException;

    public static class Default implements android.window.IDisplayAreaOrganizer {
        public Default() {}
        public void onDisplayAreaAppeared(android.window.DisplayAreaInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException {}
        public void onDisplayAreaVanished(android.window.DisplayAreaInfo p0) throws android.os.RemoteException {}
        public void onDisplayAreaInfoChanged(android.window.DisplayAreaInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IDisplayAreaOrganizer {
        static final int TRANSACTION_onDisplayAreaAppeared = 1;
        static final int TRANSACTION_onDisplayAreaVanished = 2;
        static final int TRANSACTION_onDisplayAreaInfoChanged = 3;
        public Stub() { super(); }
        public static android.window.IDisplayAreaOrganizer asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.IDisplayAreaOrganizer p0) { return false; }
        public static android.window.IDisplayAreaOrganizer getDefaultImpl() { return null; }

        private static class Proxy implements android.window.IDisplayAreaOrganizer {
            private android.os.IBinder mRemote;
            public static android.window.IDisplayAreaOrganizer sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDisplayAreaAppeared(android.window.DisplayAreaInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException {}
            public void onDisplayAreaVanished(android.window.DisplayAreaInfo p0) throws android.os.RemoteException {}
            public void onDisplayAreaInfoChanged(android.window.DisplayAreaInfo p0) throws android.os.RemoteException {}
        }
    }
}
