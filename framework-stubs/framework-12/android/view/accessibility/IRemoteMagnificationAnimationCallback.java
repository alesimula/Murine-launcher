package android.view.accessibility;

public interface IRemoteMagnificationAnimationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IRemoteMagnificationAnimationCallback";
    public void onResult(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IRemoteMagnificationAnimationCallback {
        public Default() {}
        public void onResult(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IRemoteMagnificationAnimationCallback {
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static android.view.accessibility.IRemoteMagnificationAnimationCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.accessibility.IRemoteMagnificationAnimationCallback p0) { return false; }
        public static android.view.accessibility.IRemoteMagnificationAnimationCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.view.accessibility.IRemoteMagnificationAnimationCallback {
            private android.os.IBinder mRemote;
            public static android.view.accessibility.IRemoteMagnificationAnimationCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(boolean p0) throws android.os.RemoteException {}
        }
    }
}
