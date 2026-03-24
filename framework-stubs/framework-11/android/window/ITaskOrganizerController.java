package android.window;

public interface ITaskOrganizerController extends android.os.IInterface {
    public void registerTaskOrganizer(android.window.ITaskOrganizer p0, int p1) throws android.os.RemoteException;
    public void unregisterTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException;
    public android.app.ActivityManager.RunningTaskInfo createRootTask(int p0, int p1) throws android.os.RemoteException;
    public boolean deleteRootTask(android.window.WindowContainerToken p0) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) throws android.os.RemoteException;
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) throws android.os.RemoteException;
    public android.window.WindowContainerToken getImeTarget(int p0) throws android.os.RemoteException;
    public void setLaunchRoot(int p0, android.window.WindowContainerToken p1) throws android.os.RemoteException;
    public void setInterceptBackPressedOnTaskRoot(android.window.ITaskOrganizer p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.window.ITaskOrganizerController {
        public Default() {}
        public void registerTaskOrganizer(android.window.ITaskOrganizer p0, int p1) throws android.os.RemoteException {}
        public void unregisterTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException {}
        public android.app.ActivityManager.RunningTaskInfo createRootTask(int p0, int p1) throws android.os.RemoteException { return null; }
        public boolean deleteRootTask(android.window.WindowContainerToken p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) throws android.os.RemoteException { return null; }
        public android.window.WindowContainerToken getImeTarget(int p0) throws android.os.RemoteException { return null; }
        public void setLaunchRoot(int p0, android.window.WindowContainerToken p1) throws android.os.RemoteException {}
        public void setInterceptBackPressedOnTaskRoot(android.window.ITaskOrganizer p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITaskOrganizerController {
        private static final java.lang.String DESCRIPTOR = "android.window.ITaskOrganizerController";
        static final int TRANSACTION_registerTaskOrganizer = 1;
        static final int TRANSACTION_unregisterTaskOrganizer = 2;
        static final int TRANSACTION_createRootTask = 3;
        static final int TRANSACTION_deleteRootTask = 4;
        static final int TRANSACTION_getChildTasks = 5;
        static final int TRANSACTION_getRootTasks = 6;
        static final int TRANSACTION_getImeTarget = 7;
        static final int TRANSACTION_setLaunchRoot = 8;
        static final int TRANSACTION_setInterceptBackPressedOnTaskRoot = 9;
        public Stub() { super(); }
        public static android.window.ITaskOrganizerController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.ITaskOrganizerController p0) { return false; }
        public static android.window.ITaskOrganizerController getDefaultImpl() { return null; }

        private static class Proxy implements android.window.ITaskOrganizerController {
            private android.os.IBinder mRemote;
            public static android.window.ITaskOrganizerController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerTaskOrganizer(android.window.ITaskOrganizer p0, int p1) throws android.os.RemoteException {}
            public void unregisterTaskOrganizer(android.window.ITaskOrganizer p0) throws android.os.RemoteException {}
            public android.app.ActivityManager.RunningTaskInfo createRootTask(int p0, int p1) throws android.os.RemoteException { return null; }
            public boolean deleteRootTask(android.window.WindowContainerToken p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) throws android.os.RemoteException { return null; }
            public android.window.WindowContainerToken getImeTarget(int p0) throws android.os.RemoteException { return null; }
            public void setLaunchRoot(int p0, android.window.WindowContainerToken p1) throws android.os.RemoteException {}
            public void setInterceptBackPressedOnTaskRoot(android.window.ITaskOrganizer p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
