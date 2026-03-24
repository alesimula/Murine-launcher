package android.window;

public interface IRemoteTransition extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IRemoteTransition";
    public void startAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3) throws android.os.RemoteException;
    public void mergeAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.os.IBinder p3, android.window.IRemoteTransitionFinishedCallback p4) throws android.os.RemoteException;

    public static class Default implements android.window.IRemoteTransition {
        public Default() {}
        public void startAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3) throws android.os.RemoteException {}
        public void mergeAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.os.IBinder p3, android.window.IRemoteTransitionFinishedCallback p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IRemoteTransition {
        static final int TRANSACTION_startAnimation = 1;
        static final int TRANSACTION_mergeAnimation = 2;
        public Stub() { super(); }
        public static android.window.IRemoteTransition asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.IRemoteTransition p0) { return false; }
        public static android.window.IRemoteTransition getDefaultImpl() { return null; }

        private static class Proxy implements android.window.IRemoteTransition {
            private android.os.IBinder mRemote;
            public static android.window.IRemoteTransition sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.window.IRemoteTransitionFinishedCallback p3) throws android.os.RemoteException {}
            public void mergeAnimation(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.os.IBinder p3, android.window.IRemoteTransitionFinishedCallback p4) throws android.os.RemoteException {}
        }
    }
}
