package android.window;

public interface IBackAnimationRunner extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IBackAnimationRunner";
    public void onAnimationCancelled() throws android.os.RemoteException;
    public void onAnimationStart(android.window.IBackNaviAnimationController p0, int p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.RemoteAnimationTarget[] p4) throws android.os.RemoteException;

    public static class Default implements android.window.IBackAnimationRunner {
        public Default() {}
        public void onAnimationCancelled() throws android.os.RemoteException {}
        public void onAnimationStart(android.window.IBackNaviAnimationController p0, int p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.RemoteAnimationTarget[] p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IBackAnimationRunner {
        static final int TRANSACTION_onAnimationCancelled = 2;
        static final int TRANSACTION_onAnimationStart = 3;
        public Stub() { super(); }
        public static android.window.IBackAnimationRunner asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.IBackAnimationRunner {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAnimationCancelled() throws android.os.RemoteException {}
            public void onAnimationStart(android.window.IBackNaviAnimationController p0, int p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.RemoteAnimationTarget[] p4) throws android.os.RemoteException {}
        }
    }
}
