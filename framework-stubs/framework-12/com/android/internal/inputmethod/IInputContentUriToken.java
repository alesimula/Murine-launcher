package com.android.internal.inputmethod;

public interface IInputContentUriToken extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IInputContentUriToken";
    public void take() throws android.os.RemoteException;
    public void release() throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IInputContentUriToken {
        public Default() {}
        public void take() throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IInputContentUriToken {
        static final int TRANSACTION_take = 1;
        static final int TRANSACTION_release = 2;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IInputContentUriToken asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.inputmethod.IInputContentUriToken p0) { return false; }
        public static com.android.internal.inputmethod.IInputContentUriToken getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.inputmethod.IInputContentUriToken {
            private android.os.IBinder mRemote;
            public static com.android.internal.inputmethod.IInputContentUriToken sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void take() throws android.os.RemoteException {}
            public void release() throws android.os.RemoteException {}
        }
    }
}
