package com.android.internal.view;

public interface IInputMethod extends android.os.IInterface {
    public void initializeInternal(android.os.IBinder p0, int p1, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p2) throws android.os.RemoteException;
    public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException;
    public void unbindInput() throws android.os.RemoteException;
    public void startInput(android.os.IBinder p0, com.android.internal.view.IInputContext p1, int p2, android.view.inputmethod.EditorInfo p3, boolean p4, boolean p5) throws android.os.RemoteException;
    public void createSession(android.view.InputChannel p0, com.android.internal.view.IInputSessionCallback p1) throws android.os.RemoteException;
    public void setSessionEnabled(com.android.internal.view.IInputMethodSession p0, boolean p1) throws android.os.RemoteException;
    public void revokeSession(com.android.internal.view.IInputMethodSession p0) throws android.os.RemoteException;
    public void showSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void hideSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputMethod {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputMethod";
        static final int TRANSACTION_initializeInternal = 1;
        static final int TRANSACTION_bindInput = 2;
        static final int TRANSACTION_unbindInput = 3;
        static final int TRANSACTION_startInput = 4;
        static final int TRANSACTION_createSession = 5;
        static final int TRANSACTION_setSessionEnabled = 6;
        static final int TRANSACTION_revokeSession = 7;
        static final int TRANSACTION_showSoftInput = 8;
        static final int TRANSACTION_hideSoftInput = 9;
        static final int TRANSACTION_changeInputMethodSubtype = 10;
        public Stub() { super(); }
        public static com.android.internal.view.IInputMethod asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.view.IInputMethod p0) { return false; }
        public static com.android.internal.view.IInputMethod getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.view.IInputMethod {
            private android.os.IBinder mRemote;
            public static com.android.internal.view.IInputMethod sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void initializeInternal(android.os.IBinder p0, int p1, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p2) throws android.os.RemoteException {}
            public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException {}
            public void unbindInput() throws android.os.RemoteException {}
            public void startInput(android.os.IBinder p0, com.android.internal.view.IInputContext p1, int p2, android.view.inputmethod.EditorInfo p3, boolean p4, boolean p5) throws android.os.RemoteException {}
            public void createSession(android.view.InputChannel p0, com.android.internal.view.IInputSessionCallback p1) throws android.os.RemoteException {}
            public void setSessionEnabled(com.android.internal.view.IInputMethodSession p0, boolean p1) throws android.os.RemoteException {}
            public void revokeSession(com.android.internal.view.IInputMethodSession p0) throws android.os.RemoteException {}
            public void showSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void hideSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.view.IInputMethod {
        public Default() {}
        public void initializeInternal(android.os.IBinder p0, int p1, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p2) throws android.os.RemoteException {}
        public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException {}
        public void unbindInput() throws android.os.RemoteException {}
        public void startInput(android.os.IBinder p0, com.android.internal.view.IInputContext p1, int p2, android.view.inputmethod.EditorInfo p3, boolean p4, boolean p5) throws android.os.RemoteException {}
        public void createSession(android.view.InputChannel p0, com.android.internal.view.IInputSessionCallback p1) throws android.os.RemoteException {}
        public void setSessionEnabled(com.android.internal.view.IInputMethodSession p0, boolean p1) throws android.os.RemoteException {}
        public void revokeSession(com.android.internal.view.IInputMethodSession p0) throws android.os.RemoteException {}
        public void showSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void hideSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
