package com.android.internal.inputmethod;

public interface IInputMethod extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IInputMethod";
    public void initializeInternal(com.android.internal.inputmethod.IInputMethod.InitParams p0) throws android.os.RemoteException;
    public void onCreateInlineSuggestionsRequest(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1) throws android.os.RemoteException;
    public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException;
    public void unbindInput() throws android.os.RemoteException;
    public void startInput(com.android.internal.inputmethod.IInputMethod.StartInputParams p0) throws android.os.RemoteException;
    public void onNavButtonFlagsChanged(int p0) throws android.os.RemoteException;
    public void createSession(android.view.InputChannel p0, com.android.internal.inputmethod.IInputMethodSessionCallback p1) throws android.os.RemoteException;
    public void setSessionEnabled(com.android.internal.inputmethod.IInputMethodSession p0, boolean p1) throws android.os.RemoteException;
    public void showSoftInput(android.os.IBinder p0, android.view.inputmethod.ImeTracker.Token p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException;
    public void hideSoftInput(android.os.IBinder p0, android.view.inputmethod.ImeTracker.Token p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException;
    public void updateEditorToolType(int p0) throws android.os.RemoteException;
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException;
    public void canStartStylusHandwriting(int p0) throws android.os.RemoteException;
    public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) throws android.os.RemoteException;
    public void initInkWindow() throws android.os.RemoteException;
    public void finishStylusHandwriting() throws android.os.RemoteException;
    public void removeStylusHandwritingWindow() throws android.os.RemoteException;
    public void setStylusWindowIdleTimeoutForTest(long p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IInputMethod {
        public Default() {}
        public void initializeInternal(com.android.internal.inputmethod.IInputMethod.InitParams p0) throws android.os.RemoteException {}
        public void onCreateInlineSuggestionsRequest(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1) throws android.os.RemoteException {}
        public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException {}
        public void unbindInput() throws android.os.RemoteException {}
        public void startInput(com.android.internal.inputmethod.IInputMethod.StartInputParams p0) throws android.os.RemoteException {}
        public void onNavButtonFlagsChanged(int p0) throws android.os.RemoteException {}
        public void createSession(android.view.InputChannel p0, com.android.internal.inputmethod.IInputMethodSessionCallback p1) throws android.os.RemoteException {}
        public void setSessionEnabled(com.android.internal.inputmethod.IInputMethodSession p0, boolean p1) throws android.os.RemoteException {}
        public void showSoftInput(android.os.IBinder p0, android.view.inputmethod.ImeTracker.Token p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException {}
        public void hideSoftInput(android.os.IBinder p0, android.view.inputmethod.ImeTracker.Token p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException {}
        public void updateEditorToolType(int p0) throws android.os.RemoteException {}
        public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException {}
        public void canStartStylusHandwriting(int p0) throws android.os.RemoteException {}
        public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) throws android.os.RemoteException {}
        public void initInkWindow() throws android.os.RemoteException {}
        public void finishStylusHandwriting() throws android.os.RemoteException {}
        public void removeStylusHandwritingWindow() throws android.os.RemoteException {}
        public void setStylusWindowIdleTimeoutForTest(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static class InitParams implements android.os.Parcelable {
        public android.os.IBinder token;
        public com.android.internal.inputmethod.IInputMethodPrivilegedOperations privilegedOperations;
        public int navigationBarFlags;
        public static final android.os.Parcelable.Creator<com.android.internal.inputmethod.IInputMethod.InitParams> CREATOR = null;
        public InitParams() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class StartInputParams implements android.os.Parcelable {
        public android.os.IBinder startInputToken;
        public com.android.internal.inputmethod.IRemoteInputConnection remoteInputConnection;
        public android.view.inputmethod.EditorInfo editorInfo;
        public boolean restarting;
        public int navigationBarFlags;
        public android.window.ImeOnBackInvokedDispatcher imeDispatcher;
        public static final android.os.Parcelable.Creator<com.android.internal.inputmethod.IInputMethod.StartInputParams> CREATOR = null;
        public StartInputParams() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IInputMethod {
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
        static final int TRANSACTION_updateEditorToolType = 11;
        static final int TRANSACTION_changeInputMethodSubtype = 12;
        static final int TRANSACTION_canStartStylusHandwriting = 13;
        static final int TRANSACTION_startStylusHandwriting = 14;
        static final int TRANSACTION_initInkWindow = 15;
        static final int TRANSACTION_finishStylusHandwriting = 16;
        static final int TRANSACTION_removeStylusHandwritingWindow = 17;
        static final int TRANSACTION_setStylusWindowIdleTimeoutForTest = 18;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IInputMethod asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.inputmethod.IInputMethod {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void initializeInternal(com.android.internal.inputmethod.IInputMethod.InitParams p0) throws android.os.RemoteException {}
            public void onCreateInlineSuggestionsRequest(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1) throws android.os.RemoteException {}
            public void bindInput(android.view.inputmethod.InputBinding p0) throws android.os.RemoteException {}
            public void unbindInput() throws android.os.RemoteException {}
            public void startInput(com.android.internal.inputmethod.IInputMethod.StartInputParams p0) throws android.os.RemoteException {}
            public void onNavButtonFlagsChanged(int p0) throws android.os.RemoteException {}
            public void createSession(android.view.InputChannel p0, com.android.internal.inputmethod.IInputMethodSessionCallback p1) throws android.os.RemoteException {}
            public void setSessionEnabled(com.android.internal.inputmethod.IInputMethodSession p0, boolean p1) throws android.os.RemoteException {}
            public void showSoftInput(android.os.IBinder p0, android.view.inputmethod.ImeTracker.Token p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException {}
            public void hideSoftInput(android.os.IBinder p0, android.view.inputmethod.ImeTracker.Token p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException {}
            public void updateEditorToolType(int p0) throws android.os.RemoteException {}
            public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) throws android.os.RemoteException {}
            public void canStartStylusHandwriting(int p0) throws android.os.RemoteException {}
            public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) throws android.os.RemoteException {}
            public void initInkWindow() throws android.os.RemoteException {}
            public void finishStylusHandwriting() throws android.os.RemoteException {}
            public void removeStylusHandwritingWindow() throws android.os.RemoteException {}
            public void setStylusWindowIdleTimeoutForTest(long p0) throws android.os.RemoteException {}
        }
    }
}
