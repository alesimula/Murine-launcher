package com.android.internal.view;

public interface IInlineSuggestionsRequestCallback extends android.os.IInterface {
    public void onInlineSuggestionsUnsupported() throws android.os.RemoteException;
    public void onInlineSuggestionsRequest(android.view.inputmethod.InlineSuggestionsRequest p0, com.android.internal.view.IInlineSuggestionsResponseCallback p1) throws android.os.RemoteException;
    public void onInputMethodStartInput(android.view.autofill.AutofillId p0) throws android.os.RemoteException;
    public void onInputMethodShowInputRequested(boolean p0) throws android.os.RemoteException;
    public void onInputMethodStartInputView() throws android.os.RemoteException;
    public void onInputMethodFinishInputView() throws android.os.RemoteException;
    public void onInputMethodFinishInput() throws android.os.RemoteException;
    public void onInlineSuggestionsSessionInvalidated() throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IInlineSuggestionsRequestCallback {
        public Default() {}
        public void onInlineSuggestionsUnsupported() throws android.os.RemoteException {}
        public void onInlineSuggestionsRequest(android.view.inputmethod.InlineSuggestionsRequest p0, com.android.internal.view.IInlineSuggestionsResponseCallback p1) throws android.os.RemoteException {}
        public void onInputMethodStartInput(android.view.autofill.AutofillId p0) throws android.os.RemoteException {}
        public void onInputMethodShowInputRequested(boolean p0) throws android.os.RemoteException {}
        public void onInputMethodStartInputView() throws android.os.RemoteException {}
        public void onInputMethodFinishInputView() throws android.os.RemoteException {}
        public void onInputMethodFinishInput() throws android.os.RemoteException {}
        public void onInlineSuggestionsSessionInvalidated() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInlineSuggestionsRequestCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInlineSuggestionsRequestCallback";
        static final int TRANSACTION_onInlineSuggestionsUnsupported = 1;
        static final int TRANSACTION_onInlineSuggestionsRequest = 2;
        static final int TRANSACTION_onInputMethodStartInput = 3;
        static final int TRANSACTION_onInputMethodShowInputRequested = 4;
        static final int TRANSACTION_onInputMethodStartInputView = 5;
        static final int TRANSACTION_onInputMethodFinishInputView = 6;
        static final int TRANSACTION_onInputMethodFinishInput = 7;
        static final int TRANSACTION_onInlineSuggestionsSessionInvalidated = 8;
        public Stub() { super(); }
        public static com.android.internal.view.IInlineSuggestionsRequestCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.view.IInlineSuggestionsRequestCallback p0) { return false; }
        public static com.android.internal.view.IInlineSuggestionsRequestCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.view.IInlineSuggestionsRequestCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.view.IInlineSuggestionsRequestCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInlineSuggestionsUnsupported() throws android.os.RemoteException {}
            public void onInlineSuggestionsRequest(android.view.inputmethod.InlineSuggestionsRequest p0, com.android.internal.view.IInlineSuggestionsResponseCallback p1) throws android.os.RemoteException {}
            public void onInputMethodStartInput(android.view.autofill.AutofillId p0) throws android.os.RemoteException {}
            public void onInputMethodShowInputRequested(boolean p0) throws android.os.RemoteException {}
            public void onInputMethodStartInputView() throws android.os.RemoteException {}
            public void onInputMethodFinishInputView() throws android.os.RemoteException {}
            public void onInputMethodFinishInput() throws android.os.RemoteException {}
            public void onInlineSuggestionsSessionInvalidated() throws android.os.RemoteException {}
        }
    }
}
