package android.window;

public interface IBackAnimationHandoffHandler extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IBackAnimationHandoffHandler";
    public void handOffAnimation(android.view.RemoteAnimationTarget[] p0, android.window.WindowAnimationState[] p1) throws android.os.RemoteException;

    public static class Default implements android.window.IBackAnimationHandoffHandler {
        public Default() {}
        public void handOffAnimation(android.view.RemoteAnimationTarget[] p0, android.window.WindowAnimationState[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IBackAnimationHandoffHandler {
        static final int TRANSACTION_handOffAnimation = 1;
        public Stub() { super(); }
        public static android.window.IBackAnimationHandoffHandler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.IBackAnimationHandoffHandler {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void handOffAnimation(android.view.RemoteAnimationTarget[] p0, android.window.WindowAnimationState[] p1) throws android.os.RemoteException {}
        }
    }
}
