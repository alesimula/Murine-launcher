package android.view;

public interface IRemoteAnimationRunner extends android.os.IInterface {
    public void onAnimationStart(int p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.IRemoteAnimationFinishedCallback p4) throws android.os.RemoteException;
    public void onAnimationCancelled(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.view.IRemoteAnimationRunner {
        public Default() {}
        public void onAnimationStart(int p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.IRemoteAnimationFinishedCallback p4) throws android.os.RemoteException {}
        public void onAnimationCancelled(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IRemoteAnimationRunner {
        public static final java.lang.String DESCRIPTOR = "android.view.IRemoteAnimationRunner";
        static final int TRANSACTION_onAnimationStart = 1;
        static final int TRANSACTION_onAnimationCancelled = 2;
        public Stub() { super(); }
        public static android.view.IRemoteAnimationRunner asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.IRemoteAnimationRunner {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAnimationStart(int p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.IRemoteAnimationFinishedCallback p4) throws android.os.RemoteException {}
            public void onAnimationCancelled(boolean p0) throws android.os.RemoteException {}
        }
    }
}
