package android.accounts;

public interface IAccountManagerResponse extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void onResult(android.os.Bundle p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.accounts.IAccountManagerResponse {
        private static final java.lang.String DESCRIPTOR = "android.accounts.IAccountManagerResponse";
        static final int TRANSACTION_onResult = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.accounts.IAccountManagerResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.accounts.IAccountManagerResponse p0) { return false; }
        public static android.accounts.IAccountManagerResponse getDefaultImpl() { return null; }

        private static class Proxy implements android.accounts.IAccountManagerResponse {
            private android.os.IBinder mRemote;
            public static android.accounts.IAccountManagerResponse sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.accounts.IAccountManagerResponse {
        public Default() {}
        public void onResult(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
