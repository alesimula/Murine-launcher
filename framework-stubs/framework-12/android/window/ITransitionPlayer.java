package android.window;

public interface ITransitionPlayer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ITransitionPlayer";
    public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException;
    public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException;

    public static class Default implements android.window.ITransitionPlayer {
        public Default() {}
        public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException {}
        public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITransitionPlayer {
        static final int TRANSACTION_onTransitionReady = 1;
        static final int TRANSACTION_requestStartTransition = 2;
        public Stub() { super(); }
        public static android.window.ITransitionPlayer asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.ITransitionPlayer p0) { return false; }
        public static android.window.ITransitionPlayer getDefaultImpl() { return null; }

        private static class Proxy implements android.window.ITransitionPlayer {
            private android.os.IBinder mRemote;
            public static android.window.ITransitionPlayer sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) throws android.os.RemoteException {}
            public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) throws android.os.RemoteException {}
        }
    }
}
