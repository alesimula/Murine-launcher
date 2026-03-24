package com.android.internal.view;

public interface IInputSessionCallback extends android.os.IInterface {
    public void sessionCreated(com.android.internal.view.IInputMethodSession p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputSessionCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputSessionCallback";
        static final int TRANSACTION_sessionCreated = 1;
        public Stub() { super(); }
        public static com.android.internal.view.IInputSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.view.IInputSessionCallback p0) { return false; }
        public static com.android.internal.view.IInputSessionCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.view.IInputSessionCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.view.IInputSessionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sessionCreated(com.android.internal.view.IInputMethodSession p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.view.IInputSessionCallback {
        public Default() {}
        public void sessionCreated(com.android.internal.view.IInputMethodSession p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
