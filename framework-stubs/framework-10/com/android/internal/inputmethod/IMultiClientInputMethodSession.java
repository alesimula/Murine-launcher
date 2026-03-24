package com.android.internal.inputmethod;

public interface IMultiClientInputMethodSession extends android.os.IInterface {
    public void startInputOrWindowGainedFocus(com.android.internal.view.IInputContext p0, int p1, android.view.inputmethod.EditorInfo p2, int p3, int p4, int p5) throws android.os.RemoteException;
    public void showSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;
    public void hideSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IMultiClientInputMethodSession {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IMultiClientInputMethodSession";
        static final int TRANSACTION_startInputOrWindowGainedFocus = 1;
        static final int TRANSACTION_showSoftInput = 2;
        static final int TRANSACTION_hideSoftInput = 3;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IMultiClientInputMethodSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.inputmethod.IMultiClientInputMethodSession p0) { return false; }
        public static com.android.internal.inputmethod.IMultiClientInputMethodSession getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.inputmethod.IMultiClientInputMethodSession {
            private android.os.IBinder mRemote;
            public static com.android.internal.inputmethod.IMultiClientInputMethodSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startInputOrWindowGainedFocus(com.android.internal.view.IInputContext p0, int p1, android.view.inputmethod.EditorInfo p2, int p3, int p4, int p5) throws android.os.RemoteException {}
            public void showSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
            public void hideSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.inputmethod.IMultiClientInputMethodSession {
        public Default() {}
        public void startInputOrWindowGainedFocus(com.android.internal.view.IInputContext p0, int p1, android.view.inputmethod.EditorInfo p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        public void showSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public void hideSoftInput(int p0, android.os.ResultReceiver p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
