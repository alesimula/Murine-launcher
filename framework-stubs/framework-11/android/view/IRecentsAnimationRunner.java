package android.view;

public interface IRecentsAnimationRunner extends android.os.IInterface {
    public void onAnimationCanceled(android.app.ActivityManager.TaskSnapshot p0) throws android.os.RemoteException;
    public void onAnimationStart(android.view.IRecentsAnimationController p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException;
    public void onTaskAppeared(android.view.RemoteAnimationTarget p0) throws android.os.RemoteException;

    public static class Default implements android.view.IRecentsAnimationRunner {
        public Default() {}
        public void onAnimationCanceled(android.app.ActivityManager.TaskSnapshot p0) throws android.os.RemoteException {}
        public void onAnimationStart(android.view.IRecentsAnimationController p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException {}
        public void onTaskAppeared(android.view.RemoteAnimationTarget p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IRecentsAnimationRunner {
        private static final java.lang.String DESCRIPTOR = "android.view.IRecentsAnimationRunner";
        static final int TRANSACTION_onAnimationCanceled = 2;
        static final int TRANSACTION_onAnimationStart = 3;
        static final int TRANSACTION_onTaskAppeared = 4;
        public Stub() { super(); }
        public static android.view.IRecentsAnimationRunner asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IRecentsAnimationRunner p0) { return false; }
        public static android.view.IRecentsAnimationRunner getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IRecentsAnimationRunner {
            private android.os.IBinder mRemote;
            public static android.view.IRecentsAnimationRunner sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAnimationCanceled(android.app.ActivityManager.TaskSnapshot p0) throws android.os.RemoteException {}
            public void onAnimationStart(android.view.IRecentsAnimationController p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.graphics.Rect p3, android.graphics.Rect p4) throws android.os.RemoteException {}
            public void onTaskAppeared(android.view.RemoteAnimationTarget p0) throws android.os.RemoteException {}
        }
    }
}
