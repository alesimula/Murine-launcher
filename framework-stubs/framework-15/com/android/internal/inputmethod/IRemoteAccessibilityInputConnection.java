package com.android.internal.inputmethod;

public interface IRemoteAccessibilityInputConnection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IRemoteAccessibilityInputConnection";
    public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException;
    public void setSelection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException;
    public void getSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException;
    public void deleteSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException;
    public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException;
    public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException;
    public void performContextMenuAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException;
    public void getCursorCapsMode(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException;
    public void clearMetaKeyStates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IRemoteAccessibilityInputConnection {
        public Default() {}
        public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException {}
        public void setSelection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
        public void getSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException {}
        public void deleteSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
        public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException {}
        public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
        public void performContextMenuAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
        public void getCursorCapsMode(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
        public void clearMetaKeyStates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IRemoteAccessibilityInputConnection {
        static final int TRANSACTION_commitText = 1;
        static final int TRANSACTION_setSelection = 2;
        static final int TRANSACTION_getSurroundingText = 3;
        static final int TRANSACTION_deleteSurroundingText = 4;
        static final int TRANSACTION_sendKeyEvent = 5;
        static final int TRANSACTION_performEditorAction = 6;
        static final int TRANSACTION_performContextMenuAction = 7;
        static final int TRANSACTION_getCursorCapsMode = 8;
        static final int TRANSACTION_clearMetaKeyStates = 9;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IRemoteAccessibilityInputConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.inputmethod.IRemoteAccessibilityInputConnection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException {}
            public void setSelection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
            public void getSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException {}
            public void deleteSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
            public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException {}
            public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
            public void performContextMenuAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
            public void getCursorCapsMode(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
            public void clearMetaKeyStates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
        }
    }
}
