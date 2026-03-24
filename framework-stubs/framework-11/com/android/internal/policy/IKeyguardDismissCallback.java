package com.android.internal.policy;

public interface IKeyguardDismissCallback extends android.os.IInterface {
    public void onDismissError() throws android.os.RemoteException;
    public void onDismissSucceeded() throws android.os.RemoteException;
    public void onDismissCancelled() throws android.os.RemoteException;

    public static class Default implements com.android.internal.policy.IKeyguardDismissCallback {
        public Default() {}
        public void onDismissError() throws android.os.RemoteException {}
        public void onDismissSucceeded() throws android.os.RemoteException {}
        public void onDismissCancelled() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IKeyguardDismissCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IKeyguardDismissCallback";
        static final int TRANSACTION_onDismissError = 1;
        static final int TRANSACTION_onDismissSucceeded = 2;
        static final int TRANSACTION_onDismissCancelled = 3;
        public Stub() { super(); }
        public static com.android.internal.policy.IKeyguardDismissCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.policy.IKeyguardDismissCallback p0) { return false; }
        public static com.android.internal.policy.IKeyguardDismissCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.policy.IKeyguardDismissCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.policy.IKeyguardDismissCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDismissError() throws android.os.RemoteException {}
            public void onDismissSucceeded() throws android.os.RemoteException {}
            public void onDismissCancelled() throws android.os.RemoteException {}
        }
    }
}
