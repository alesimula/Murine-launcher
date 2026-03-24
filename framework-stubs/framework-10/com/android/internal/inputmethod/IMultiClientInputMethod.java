package com.android.internal.inputmethod;

public interface IMultiClientInputMethod extends android.os.IInterface {
    public void initialize(com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations p0) throws android.os.RemoteException;
    public void addClient(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void removeClient(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IMultiClientInputMethod {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IMultiClientInputMethod";
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_addClient = 2;
        static final int TRANSACTION_removeClient = 3;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IMultiClientInputMethod asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.inputmethod.IMultiClientInputMethod p0) { return false; }
        public static com.android.internal.inputmethod.IMultiClientInputMethod getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.inputmethod.IMultiClientInputMethod {
            private android.os.IBinder mRemote;
            public static com.android.internal.inputmethod.IMultiClientInputMethod sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void initialize(com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations p0) throws android.os.RemoteException {}
            public void addClient(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void removeClient(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.inputmethod.IMultiClientInputMethod {
        public Default() {}
        public void initialize(com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations p0) throws android.os.RemoteException {}
        public void addClient(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void removeClient(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
