package com.android.internal.inputmethod;

public interface IMultiClientInputMethodPrivilegedOperations extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations";
    public android.os.IBinder createInputMethodWindowToken(int p0) throws android.os.RemoteException;
    public void deleteInputMethodWindowToken(android.os.IBinder p0) throws android.os.RemoteException;
    public void acceptClient(int p0, com.android.internal.view.IInputMethodSession p1, com.android.internal.inputmethod.IMultiClientInputMethodSession p2, android.view.InputChannel p3) throws android.os.RemoteException;
    public void reportImeWindowTarget(int p0, int p1, android.os.IBinder p2) throws android.os.RemoteException;
    public boolean isUidAllowedOnDisplay(int p0, int p1) throws android.os.RemoteException;
    public void setActive(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations {
        public Default() {}
        public android.os.IBinder createInputMethodWindowToken(int p0) throws android.os.RemoteException { return null; }
        public void deleteInputMethodWindowToken(android.os.IBinder p0) throws android.os.RemoteException {}
        public void acceptClient(int p0, com.android.internal.view.IInputMethodSession p1, com.android.internal.inputmethod.IMultiClientInputMethodSession p2, android.view.InputChannel p3) throws android.os.RemoteException {}
        public void reportImeWindowTarget(int p0, int p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public boolean isUidAllowedOnDisplay(int p0, int p1) throws android.os.RemoteException { return false; }
        public void setActive(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations {
        static final int TRANSACTION_createInputMethodWindowToken = 1;
        static final int TRANSACTION_deleteInputMethodWindowToken = 2;
        static final int TRANSACTION_acceptClient = 3;
        static final int TRANSACTION_reportImeWindowTarget = 4;
        static final int TRANSACTION_isUidAllowedOnDisplay = 5;
        static final int TRANSACTION_setActive = 6;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations p0) { return false; }
        public static com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations {
            private android.os.IBinder mRemote;
            public static com.android.internal.inputmethod.IMultiClientInputMethodPrivilegedOperations sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IBinder createInputMethodWindowToken(int p0) throws android.os.RemoteException { return null; }
            public void deleteInputMethodWindowToken(android.os.IBinder p0) throws android.os.RemoteException {}
            public void acceptClient(int p0, com.android.internal.view.IInputMethodSession p1, com.android.internal.inputmethod.IMultiClientInputMethodSession p2, android.view.InputChannel p3) throws android.os.RemoteException {}
            public void reportImeWindowTarget(int p0, int p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public boolean isUidAllowedOnDisplay(int p0, int p1) throws android.os.RemoteException { return false; }
            public void setActive(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
