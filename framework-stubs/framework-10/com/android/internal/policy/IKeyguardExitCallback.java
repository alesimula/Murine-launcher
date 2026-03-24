package com.android.internal.policy;

public interface IKeyguardExitCallback extends android.os.IInterface {
    public void onKeyguardExitResult(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IKeyguardExitCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IKeyguardExitCallback";
        static final int TRANSACTION_onKeyguardExitResult = 1;
        public Stub() { super(); }
        public static com.android.internal.policy.IKeyguardExitCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.policy.IKeyguardExitCallback p0) { return false; }
        public static com.android.internal.policy.IKeyguardExitCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.policy.IKeyguardExitCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.policy.IKeyguardExitCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onKeyguardExitResult(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.policy.IKeyguardExitCallback {
        public Default() {}
        public void onKeyguardExitResult(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
