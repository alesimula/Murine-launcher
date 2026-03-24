package com.android.internal.view;

public interface IInputMethod extends android.os.IInterface {
    public void initializeInternal(android.os.IBinder p0, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p1, int p2, boolean p3, int p4) throws android.os.RemoteException;
    public void onCreateInlineSuggestionsRequest(com.android.internal.view.InlineSuggestionsRequestInfo p0, com.android.internal.view.IInlineSuggestionsRequestCallback p1) throws android.os.RemoteException;
    public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException;
    public void unbindInput() throws android.os.RemoteException;
    public void startInput(android.os.IBinder p0, com.android.internal.view.IInputContext p1, android.view.inputmethod.EditorInfo p2, boolean p3, int p4, android.window.ImeOnBackInvokedDispatcher p5) throws android.os.RemoteException;
    public void onNavButtonFlagsChanged(int p0) throws android.os.RemoteException;
    public void createSession(android.view.InputChannel p0, com.android.internal.view.IInputSessionCallback p1) throws android.os.RemoteException;
    public void setSessionEnabled(com.android.internal.view.IInputMethodSession p0, boolean p1) throws android.os.RemoteException;
    public void showSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void hideSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException;
    public void canStartStylusHandwriting(int p0) throws android.os.RemoteException;
    public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) throws android.os.RemoteException;
    public void initInkWindow() throws android.os.RemoteException;
    public void finishStylusHandwriting() throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IInputMethod {
        public Default() {}
        public void initializeInternal(android.os.IBinder p0, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
        public void onCreateInlineSuggestionsRequest(com.android.internal.view.InlineSuggestionsRequestInfo p0, com.android.internal.view.IInlineSuggestionsRequestCallback p1) throws android.os.RemoteException {}
        public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException {}
        public void unbindInput() throws android.os.RemoteException {}
        public void startInput(android.os.IBinder p0, com.android.internal.view.IInputContext p1, android.view.inputmethod.EditorInfo p2, boolean p3, int p4, android.window.ImeOnBackInvokedDispatcher p5) throws android.os.RemoteException {}
        public void onNavButtonFlagsChanged(int p0) throws android.os.RemoteException {}
        public void createSession(android.view.InputChannel p0, com.android.internal.view.IInputSessionCallback p1) throws android.os.RemoteException {}
        public void setSessionEnabled(com.android.internal.view.IInputMethodSession p0, boolean p1) throws android.os.RemoteException {}
        public void showSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void hideSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException {}
        public void canStartStylusHandwriting(int p0) throws android.os.RemoteException {}
        public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) throws android.os.RemoteException {}
        public void initInkWindow() throws android.os.RemoteException {}
        public void finishStylusHandwriting() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputMethod {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputMethod";
        static final int TRANSACTION_initializeInternal = 1;
        static final int TRANSACTION_onCreateInlineSuggestionsRequest = 2;
        static final int TRANSACTION_bindInput = 3;
        static final int TRANSACTION_unbindInput = 4;
        static final int TRANSACTION_startInput = 5;
        static final int TRANSACTION_onNavButtonFlagsChanged = 6;
        static final int TRANSACTION_createSession = 7;
        static final int TRANSACTION_setSessionEnabled = 8;
        static final int TRANSACTION_showSoftInput = 9;
        static final int TRANSACTION_hideSoftInput = 10;
        static final int TRANSACTION_changeInputMethodSubtype = 11;
        static final int TRANSACTION_canStartStylusHandwriting = 12;
        static final int TRANSACTION_startStylusHandwriting = 13;
        static final int TRANSACTION_initInkWindow = 14;
        static final int TRANSACTION_finishStylusHandwriting = 15;
        public Stub() { super(); }
        public static com.android.internal.view.IInputMethod asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.view.IInputMethod {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void initializeInternal(android.os.IBinder p0, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p1, int p2, boolean p3, int p4) throws android.os.RemoteException {}
            public void onCreateInlineSuggestionsRequest(com.android.internal.view.InlineSuggestionsRequestInfo p0, com.android.internal.view.IInlineSuggestionsRequestCallback p1) throws android.os.RemoteException {}
            public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException {}
            public void unbindInput() throws android.os.RemoteException {}
            public void startInput(android.os.IBinder p0, com.android.internal.view.IInputContext p1, android.view.inputmethod.EditorInfo p2, boolean p3, int p4, android.window.ImeOnBackInvokedDispatcher p5) throws android.os.RemoteException {}
            public void onNavButtonFlagsChanged(int p0) throws android.os.RemoteException {}
            public void createSession(android.view.InputChannel p0, com.android.internal.view.IInputSessionCallback p1) throws android.os.RemoteException {}
            public void setSessionEnabled(com.android.internal.view.IInputMethodSession p0, boolean p1) throws android.os.RemoteException {}
            public void showSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void hideSoftInput(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException {}
            public void canStartStylusHandwriting(int p0) throws android.os.RemoteException {}
            public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) throws android.os.RemoteException {}
            public void initInkWindow() throws android.os.RemoteException {}
            public void finishStylusHandwriting() throws android.os.RemoteException {}
        }
    }
}
