package com.android.internal.inputmethod;

public interface IInputBindResultResultCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IInputBindResultResultCallback";
    public void onResult(com.android.internal.view.InputBindResult p0) throws android.os.RemoteException;
    public void onError(com.android.internal.inputmethod.ThrowableHolder p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IInputBindResultResultCallback {
        public Default() {}
        public void onResult(com.android.internal.view.InputBindResult p0) throws android.os.RemoteException {}
        public void onError(com.android.internal.inputmethod.ThrowableHolder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IInputBindResultResultCallback {
        static final int TRANSACTION_onResult = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IInputBindResultResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.inputmethod.IInputBindResultResultCallback p0) { return false; }
        public static com.android.internal.inputmethod.IInputBindResultResultCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.inputmethod.IInputBindResultResultCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.inputmethod.IInputBindResultResultCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(com.android.internal.view.InputBindResult p0) throws android.os.RemoteException {}
            public void onError(com.android.internal.inputmethod.ThrowableHolder p0) throws android.os.RemoteException {}
        }
    }
}
