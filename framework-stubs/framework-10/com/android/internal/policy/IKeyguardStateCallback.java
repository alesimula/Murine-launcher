package com.android.internal.policy;

public interface IKeyguardStateCallback extends android.os.IInterface {
    public void onShowingStateChanged(boolean p0) throws android.os.RemoteException;
    public void onSimSecureStateChanged(boolean p0) throws android.os.RemoteException;
    public void onInputRestrictedStateChanged(boolean p0) throws android.os.RemoteException;
    public void onTrustedChanged(boolean p0) throws android.os.RemoteException;
    public void onHasLockscreenWallpaperChanged(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.policy.IKeyguardStateCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.policy.IKeyguardStateCallback";
        static final int TRANSACTION_onShowingStateChanged = 1;
        static final int TRANSACTION_onSimSecureStateChanged = 2;
        static final int TRANSACTION_onInputRestrictedStateChanged = 3;
        static final int TRANSACTION_onTrustedChanged = 4;
        static final int TRANSACTION_onHasLockscreenWallpaperChanged = 5;
        public Stub() { super(); }
        public static com.android.internal.policy.IKeyguardStateCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.policy.IKeyguardStateCallback p0) { return false; }
        public static com.android.internal.policy.IKeyguardStateCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.policy.IKeyguardStateCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.policy.IKeyguardStateCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onShowingStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onSimSecureStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onInputRestrictedStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onTrustedChanged(boolean p0) throws android.os.RemoteException {}
            public void onHasLockscreenWallpaperChanged(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.policy.IKeyguardStateCallback {
        public Default() {}
        public void onShowingStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onSimSecureStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onInputRestrictedStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onTrustedChanged(boolean p0) throws android.os.RemoteException {}
        public void onHasLockscreenWallpaperChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
