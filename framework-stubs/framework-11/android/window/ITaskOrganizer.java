package android.window;

public interface ITaskOrganizer extends android.os.IInterface {
    public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException;
    public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;

    public static class Default implements android.window.ITaskOrganizer {
        public Default() {}
        public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException {}
        public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITaskOrganizer {
        private static final java.lang.String DESCRIPTOR = "android.window.ITaskOrganizer";
        static final int TRANSACTION_onTaskAppeared = 1;
        static final int TRANSACTION_onTaskVanished = 2;
        static final int TRANSACTION_onTaskInfoChanged = 3;
        static final int TRANSACTION_onBackPressedOnTaskRoot = 4;
        public Stub() { super(); }
        public static android.window.ITaskOrganizer asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.ITaskOrganizer p0) { return false; }
        public static android.window.ITaskOrganizer getDefaultImpl() { return null; }

        private static class Proxy implements android.window.ITaskOrganizer {
            private android.os.IBinder mRemote;
            public static android.window.ITaskOrganizer sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) throws android.os.RemoteException {}
            public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        }
    }
}
