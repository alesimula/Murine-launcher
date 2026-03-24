package com.android.internal.inputmethod;

public interface IInputMethodPrivilegedOperations extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IInputMethodPrivilegedOperations";
    public void setImeWindowStatusAsync(int p0, int p1) throws android.os.RemoteException;
    public void reportStartInputAsync(android.os.IBinder p0) throws android.os.RemoteException;
    public void createInputContentUriToken(android.net.Uri p0, java.lang.String p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException;
    public void reportFullscreenModeAsync(boolean p0) throws android.os.RemoteException;
    public void setInputMethod(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException;
    public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException;
    public void hideMySoftInput(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException;
    public void showMySoftInput(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException;
    public void updateStatusIconAsync(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void switchToPreviousInputMethod(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException;
    public void switchToNextInputMethod(boolean p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException;
    public void shouldOfferSwitchingToNextInputMethod(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException;
    public void notifyUserActionAsync() throws android.os.RemoteException;
    public void applyImeVisibilityAsync(android.os.IBinder p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException;
    public void onStylusHandwritingReady(int p0, int p1) throws android.os.RemoteException;
    public void resetStylusHandwriting(int p0) throws android.os.RemoteException;
    public void switchKeyboardLayoutAsync(int p0) throws android.os.RemoteException;
    public void setHandwritingSurfaceNotTouchable(boolean p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IInputMethodPrivilegedOperations {
        public Default() {}
        public void setImeWindowStatusAsync(int p0, int p1) throws android.os.RemoteException {}
        public void reportStartInputAsync(android.os.IBinder p0) throws android.os.RemoteException {}
        public void createInputContentUriToken(android.net.Uri p0, java.lang.String p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
        public void reportFullscreenModeAsync(boolean p0) throws android.os.RemoteException {}
        public void setInputMethod(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
        public void hideMySoftInput(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        public void showMySoftInput(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        public void updateStatusIconAsync(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void switchToPreviousInputMethod(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException {}
        public void switchToNextInputMethod(boolean p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
        public void shouldOfferSwitchingToNextInputMethod(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException {}
        public void notifyUserActionAsync() throws android.os.RemoteException {}
        public void applyImeVisibilityAsync(android.os.IBinder p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
        public void onStylusHandwritingReady(int p0, int p1) throws android.os.RemoteException {}
        public void resetStylusHandwriting(int p0) throws android.os.RemoteException {}
        public void switchKeyboardLayoutAsync(int p0) throws android.os.RemoteException {}
        public void setHandwritingSurfaceNotTouchable(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IInputMethodPrivilegedOperations {
        static final int TRANSACTION_setImeWindowStatusAsync = 1;
        static final int TRANSACTION_reportStartInputAsync = 2;
        static final int TRANSACTION_createInputContentUriToken = 3;
        static final int TRANSACTION_reportFullscreenModeAsync = 4;
        static final int TRANSACTION_setInputMethod = 5;
        static final int TRANSACTION_setInputMethodAndSubtype = 6;
        static final int TRANSACTION_hideMySoftInput = 7;
        static final int TRANSACTION_showMySoftInput = 8;
        static final int TRANSACTION_updateStatusIconAsync = 9;
        static final int TRANSACTION_switchToPreviousInputMethod = 10;
        static final int TRANSACTION_switchToNextInputMethod = 11;
        static final int TRANSACTION_shouldOfferSwitchingToNextInputMethod = 12;
        static final int TRANSACTION_notifyUserActionAsync = 13;
        static final int TRANSACTION_applyImeVisibilityAsync = 14;
        static final int TRANSACTION_onStylusHandwritingReady = 15;
        static final int TRANSACTION_resetStylusHandwriting = 16;
        static final int TRANSACTION_switchKeyboardLayoutAsync = 17;
        static final int TRANSACTION_setHandwritingSurfaceNotTouchable = 18;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IInputMethodPrivilegedOperations asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.inputmethod.IInputMethodPrivilegedOperations {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setImeWindowStatusAsync(int p0, int p1) throws android.os.RemoteException {}
            public void reportStartInputAsync(android.os.IBinder p0) throws android.os.RemoteException {}
            public void createInputContentUriToken(android.net.Uri p0, java.lang.String p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
            public void reportFullscreenModeAsync(boolean p0) throws android.os.RemoteException {}
            public void setInputMethod(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
            public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
            public void hideMySoftInput(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
            public void showMySoftInput(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
            public void updateStatusIconAsync(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void switchToPreviousInputMethod(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException {}
            public void switchToNextInputMethod(boolean p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
            public void shouldOfferSwitchingToNextInputMethod(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException {}
            public void notifyUserActionAsync() throws android.os.RemoteException {}
            public void applyImeVisibilityAsync(android.os.IBinder p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) throws android.os.RemoteException {}
            public void onStylusHandwritingReady(int p0, int p1) throws android.os.RemoteException {}
            public void resetStylusHandwriting(int p0) throws android.os.RemoteException {}
            public void switchKeyboardLayoutAsync(int p0) throws android.os.RemoteException {}
            public void setHandwritingSurfaceNotTouchable(boolean p0) throws android.os.RemoteException {}
        }
    }
}
