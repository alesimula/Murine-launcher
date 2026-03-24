package android.view;

public interface IOnKeyguardExitResult extends android.os.IInterface {
    public void onKeyguardExitResult(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.view.IOnKeyguardExitResult {
        public Default() {}
        public void onKeyguardExitResult(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IOnKeyguardExitResult {
        private static final java.lang.String DESCRIPTOR = "android.view.IOnKeyguardExitResult";
        static final int TRANSACTION_onKeyguardExitResult = 1;
        public Stub() { super(); }
        public static android.view.IOnKeyguardExitResult asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IOnKeyguardExitResult p0) { return false; }
        public static android.view.IOnKeyguardExitResult getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IOnKeyguardExitResult {
            private android.os.IBinder mRemote;
            public static android.view.IOnKeyguardExitResult sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onKeyguardExitResult(boolean p0) throws android.os.RemoteException {}
        }
    }
}
