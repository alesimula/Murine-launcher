package com.android.internal.inputmethod;

public interface IInputMethodPrivilegedOperations extends android.os.IInterface {
    public void setImeWindowStatus(int p0, int p1) throws android.os.RemoteException;
    public void reportStartInput(android.os.IBinder p0) throws android.os.RemoteException;
    public com.android.internal.inputmethod.IInputContentUriToken createInputContentUriToken(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException;
    public void reportFullscreenMode(boolean p0) throws android.os.RemoteException;
    public void setInputMethod(java.lang.String p0) throws android.os.RemoteException;
    public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1) throws android.os.RemoteException;
    public void hideMySoftInput(int p0) throws android.os.RemoteException;
    public void showMySoftInput(int p0) throws android.os.RemoteException;
    public void updateStatusIcon(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean switchToPreviousInputMethod() throws android.os.RemoteException;
    public boolean switchToNextInputMethod(boolean p0) throws android.os.RemoteException;
    public boolean shouldOfferSwitchingToNextInputMethod() throws android.os.RemoteException;
    public void notifyUserAction() throws android.os.RemoteException;
    public void reportPreRendered(android.view.inputmethod.EditorInfo p0) throws android.os.RemoteException;
    public void applyImeVisibility(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IInputMethodPrivilegedOperations {
        public Default() {}
        public void setImeWindowStatus(int p0, int p1) throws android.os.RemoteException {}
        public void reportStartInput(android.os.IBinder p0) throws android.os.RemoteException {}
        public com.android.internal.inputmethod.IInputContentUriToken createInputContentUriToken(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void reportFullscreenMode(boolean p0) throws android.os.RemoteException {}
        public void setInputMethod(java.lang.String p0) throws android.os.RemoteException {}
        public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1) throws android.os.RemoteException {}
        public void hideMySoftInput(int p0) throws android.os.RemoteException {}
        public void showMySoftInput(int p0) throws android.os.RemoteException {}
        public void updateStatusIcon(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean switchToPreviousInputMethod() throws android.os.RemoteException { return false; }
        public boolean switchToNextInputMethod(boolean p0) throws android.os.RemoteException { return false; }
        public boolean shouldOfferSwitchingToNextInputMethod() throws android.os.RemoteException { return false; }
        public void notifyUserAction() throws android.os.RemoteException {}
        public void reportPreRendered(android.view.inputmethod.EditorInfo p0) throws android.os.RemoteException {}
        public void applyImeVisibility(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IInputMethodPrivilegedOperations {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IInputMethodPrivilegedOperations";
        static final int TRANSACTION_setImeWindowStatus = 1;
        static final int TRANSACTION_reportStartInput = 2;
        static final int TRANSACTION_createInputContentUriToken = 3;
        static final int TRANSACTION_reportFullscreenMode = 4;
        static final int TRANSACTION_setInputMethod = 5;
        static final int TRANSACTION_setInputMethodAndSubtype = 6;
        static final int TRANSACTION_hideMySoftInput = 7;
        static final int TRANSACTION_showMySoftInput = 8;
        static final int TRANSACTION_updateStatusIcon = 9;
        static final int TRANSACTION_switchToPreviousInputMethod = 10;
        static final int TRANSACTION_switchToNextInputMethod = 11;
        static final int TRANSACTION_shouldOfferSwitchingToNextInputMethod = 12;
        static final int TRANSACTION_notifyUserAction = 13;
        static final int TRANSACTION_reportPreRendered = 14;
        static final int TRANSACTION_applyImeVisibility = 15;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IInputMethodPrivilegedOperations asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.inputmethod.IInputMethodPrivilegedOperations p0) { return false; }
        public static com.android.internal.inputmethod.IInputMethodPrivilegedOperations getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.inputmethod.IInputMethodPrivilegedOperations {
            private android.os.IBinder mRemote;
            public static com.android.internal.inputmethod.IInputMethodPrivilegedOperations sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setImeWindowStatus(int p0, int p1) throws android.os.RemoteException {}
            public void reportStartInput(android.os.IBinder p0) throws android.os.RemoteException {}
            public com.android.internal.inputmethod.IInputContentUriToken createInputContentUriToken(android.net.Uri p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void reportFullscreenMode(boolean p0) throws android.os.RemoteException {}
            public void setInputMethod(java.lang.String p0) throws android.os.RemoteException {}
            public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1) throws android.os.RemoteException {}
            public void hideMySoftInput(int p0) throws android.os.RemoteException {}
            public void showMySoftInput(int p0) throws android.os.RemoteException {}
            public void updateStatusIcon(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean switchToPreviousInputMethod() throws android.os.RemoteException { return false; }
            public boolean switchToNextInputMethod(boolean p0) throws android.os.RemoteException { return false; }
            public boolean shouldOfferSwitchingToNextInputMethod() throws android.os.RemoteException { return false; }
            public void notifyUserAction() throws android.os.RemoteException {}
            public void reportPreRendered(android.view.inputmethod.EditorInfo p0) throws android.os.RemoteException {}
            public void applyImeVisibility(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
