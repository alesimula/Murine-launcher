package com.android.internal.view;

public interface IInputMethodManager extends android.os.IInterface {
    public void addClient(com.android.internal.inputmethod.IInputMethodClient p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public com.android.internal.inputmethod.InputMethodInfoSafeList getInputMethodList(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public com.android.internal.inputmethod.InputMethodInfoSafeList getEnabledInputMethodList(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListLegacy(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodListLegacy(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(int p0) throws android.os.RemoteException;
    public boolean showSoftInput(com.android.internal.inputmethod.IInputMethodClient p0, android.os.IBinder p1, android.view.inputmethod.ImeTracker.Token p2, int p3, int p4, android.os.ResultReceiver p5, int p6) throws android.os.RemoteException;
    public boolean hideSoftInput(com.android.internal.inputmethod.IInputMethodClient p0, android.os.IBinder p1, android.view.inputmethod.ImeTracker.Token p2, int p3, android.os.ResultReceiver p4, int p5) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    @android.annotation.EnforcePermission("android.permission.TEST_INPUT_METHOD")
    public void hideSoftInputFromServerForTest() throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public com.android.internal.inputmethod.InputBindResult startInputOrWindowGainedFocus(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, int p9, int p10, android.window.ImeOnBackInvokedDispatcher p11) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public void startInputOrWindowGainedFocusAsync(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, int p9, int p10, android.window.ImeOnBackInvokedDispatcher p11, int p12) throws android.os.RemoteException;
    public void showInputMethodPickerFromClient(com.android.internal.inputmethod.IInputMethodClient p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    @android.annotation.EnforcePermission("android.permission.WRITE_SECURE_SETTINGS")
    public void showInputMethodPickerFromSystem(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    @android.annotation.EnforcePermission("android.permission.TEST_INPUT_METHOD")
    public boolean isInputMethodPickerShownForTest() throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1, int p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException;
    public int getInputMethodWindowVisibleHeight(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException;
    public void reportPerceptibleAsync(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.INTERNAL_SYSTEM_WINDOW")
    @android.annotation.EnforcePermission("android.permission.INTERNAL_SYSTEM_WINDOW")
    public void removeImeSurface() throws android.os.RemoteException;
    public void removeImeSurfaceFromWindowAsync(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public void startProtoDump(byte[] p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isImeTraceEnabled() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.CONTROL_UI_TRACING")
    @android.annotation.EnforcePermission("android.permission.CONTROL_UI_TRACING")
    public void startImeTrace() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.CONTROL_UI_TRACING")
    @android.annotation.EnforcePermission("android.permission.CONTROL_UI_TRACING")
    public void stopImeTrace() throws android.os.RemoteException;
    public void startStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException;
    public void startConnectionlessStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0, int p1, android.view.inputmethod.CursorAnchorInfo p2, java.lang.String p3, java.lang.String p4, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p5) throws android.os.RemoteException;
    public void prepareStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean acceptStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void acceptStylusHandwritingDelegationAsync(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4, com.android.internal.inputmethod.IBooleanListener p5) throws android.os.RemoteException;
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public boolean isStylusHandwritingAvailableAsUser(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    @android.annotation.EnforcePermission("android.permission.TEST_INPUT_METHOD")
    public void addVirtualStylusIdForTestSession(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    @android.annotation.EnforcePermission("android.permission.TEST_INPUT_METHOD")
    public void setStylusWindowIdleTimeoutForTest(com.android.internal.inputmethod.IInputMethodClient p0, long p1) throws android.os.RemoteException;
    public com.android.internal.inputmethod.IImeTracker getImeTrackerService() throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IInputMethodManager {
        public Default() {}
        public void addClient(com.android.internal.inputmethod.IInputMethodClient p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException {}
        public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(int p0) throws android.os.RemoteException { return null; }
        public com.android.internal.inputmethod.InputMethodInfoSafeList getInputMethodList(int p0, int p1) throws android.os.RemoteException { return null; }
        public com.android.internal.inputmethod.InputMethodInfoSafeList getEnabledInputMethodList(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListLegacy(int p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodListLegacy(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
        public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(int p0) throws android.os.RemoteException { return null; }
        public boolean showSoftInput(com.android.internal.inputmethod.IInputMethodClient p0, android.os.IBinder p1, android.view.inputmethod.ImeTracker.Token p2, int p3, int p4, android.os.ResultReceiver p5, int p6) throws android.os.RemoteException { return false; }
        public boolean hideSoftInput(com.android.internal.inputmethod.IInputMethodClient p0, android.os.IBinder p1, android.view.inputmethod.ImeTracker.Token p2, int p3, android.os.ResultReceiver p4, int p5) throws android.os.RemoteException { return false; }
        public void hideSoftInputFromServerForTest() throws android.os.RemoteException {}
        public com.android.internal.inputmethod.InputBindResult startInputOrWindowGainedFocus(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, int p9, int p10, android.window.ImeOnBackInvokedDispatcher p11) throws android.os.RemoteException { return null; }
        public void startInputOrWindowGainedFocusAsync(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, int p9, int p10, android.window.ImeOnBackInvokedDispatcher p11, int p12) throws android.os.RemoteException {}
        public void showInputMethodPickerFromClient(com.android.internal.inputmethod.IInputMethodClient p0, int p1) throws android.os.RemoteException {}
        public void showInputMethodPickerFromSystem(int p0, int p1) throws android.os.RemoteException {}
        public boolean isInputMethodPickerShownForTest() throws android.os.RemoteException { return false; }
        public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(int p0) throws android.os.RemoteException { return null; }
        public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1, int p2) throws android.os.RemoteException {}
        public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException {}
        public int getInputMethodWindowVisibleHeight(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException { return 0; }
        public void reportPerceptibleAsync(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void removeImeSurface() throws android.os.RemoteException {}
        public void removeImeSurfaceFromWindowAsync(android.os.IBinder p0) throws android.os.RemoteException {}
        public void startProtoDump(byte[] p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean isImeTraceEnabled() throws android.os.RemoteException { return false; }
        public void startImeTrace() throws android.os.RemoteException {}
        public void stopImeTrace() throws android.os.RemoteException {}
        public void startStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException {}
        public void startConnectionlessStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0, int p1, android.view.inputmethod.CursorAnchorInfo p2, java.lang.String p3, java.lang.String p4, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p5) throws android.os.RemoteException {}
        public void prepareStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public boolean acceptStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return false; }
        public void acceptStylusHandwritingDelegationAsync(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4, com.android.internal.inputmethod.IBooleanListener p5) throws android.os.RemoteException {}
        public boolean isStylusHandwritingAvailableAsUser(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void addVirtualStylusIdForTestSession(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException {}
        public void setStylusWindowIdleTimeoutForTest(com.android.internal.inputmethod.IInputMethodClient p0, long p1) throws android.os.RemoteException {}
        public com.android.internal.inputmethod.IImeTracker getImeTrackerService() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputMethodManager {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputMethodManager";
        static final int TRANSACTION_addClient = 1;
        static final int TRANSACTION_getCurrentInputMethodInfoAsUser = 2;
        static final int TRANSACTION_getInputMethodList = 3;
        static final int TRANSACTION_getEnabledInputMethodList = 4;
        static final int TRANSACTION_getInputMethodListLegacy = 5;
        static final int TRANSACTION_getEnabledInputMethodListLegacy = 6;
        static final int TRANSACTION_getEnabledInputMethodSubtypeList = 7;
        static final int TRANSACTION_getLastInputMethodSubtype = 8;
        static final int TRANSACTION_showSoftInput = 9;
        static final int TRANSACTION_hideSoftInput = 10;
        static final int TRANSACTION_hideSoftInputFromServerForTest = 11;
        static final int TRANSACTION_startInputOrWindowGainedFocus = 12;
        static final int TRANSACTION_startInputOrWindowGainedFocusAsync = 13;
        static final int TRANSACTION_showInputMethodPickerFromClient = 14;
        static final int TRANSACTION_showInputMethodPickerFromSystem = 15;
        static final int TRANSACTION_isInputMethodPickerShownForTest = 16;
        static final int TRANSACTION_getCurrentInputMethodSubtype = 17;
        static final int TRANSACTION_setAdditionalInputMethodSubtypes = 18;
        static final int TRANSACTION_setExplicitlyEnabledInputMethodSubtypes = 19;
        static final int TRANSACTION_getInputMethodWindowVisibleHeight = 20;
        static final int TRANSACTION_reportPerceptibleAsync = 21;
        static final int TRANSACTION_removeImeSurface = 22;
        static final int TRANSACTION_removeImeSurfaceFromWindowAsync = 23;
        static final int TRANSACTION_startProtoDump = 24;
        static final int TRANSACTION_isImeTraceEnabled = 25;
        static final int TRANSACTION_startImeTrace = 26;
        static final int TRANSACTION_stopImeTrace = 27;
        static final int TRANSACTION_startStylusHandwriting = 28;
        static final int TRANSACTION_startConnectionlessStylusHandwriting = 29;
        static final int TRANSACTION_prepareStylusHandwritingDelegation = 30;
        static final int TRANSACTION_acceptStylusHandwritingDelegation = 31;
        static final int TRANSACTION_acceptStylusHandwritingDelegationAsync = 32;
        static final int TRANSACTION_isStylusHandwritingAvailableAsUser = 33;
        static final int TRANSACTION_addVirtualStylusIdForTestSession = 34;
        static final int TRANSACTION_setStylusWindowIdleTimeoutForTest = 35;
        static final int TRANSACTION_getImeTrackerService = 36;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static com.android.internal.view.IInputMethodManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void hideSoftInputFromServerForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void showInputMethodPickerFromSystem_enforcePermission() throws java.lang.SecurityException {}
        protected void isInputMethodPickerShownForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void removeImeSurface_enforcePermission() throws java.lang.SecurityException {}
        protected void startImeTrace_enforcePermission() throws java.lang.SecurityException {}
        protected void stopImeTrace_enforcePermission() throws java.lang.SecurityException {}
        protected void addVirtualStylusIdForTestSession_enforcePermission() throws java.lang.SecurityException {}
        protected void setStylusWindowIdleTimeoutForTest_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.view.IInputMethodManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addClient(com.android.internal.inputmethod.IInputMethodClient p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException {}
            public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(int p0) throws android.os.RemoteException { return null; }
            public com.android.internal.inputmethod.InputMethodInfoSafeList getInputMethodList(int p0, int p1) throws android.os.RemoteException { return null; }
            public com.android.internal.inputmethod.InputMethodInfoSafeList getEnabledInputMethodList(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListLegacy(int p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodListLegacy(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
            public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(int p0) throws android.os.RemoteException { return null; }
            public boolean showSoftInput(com.android.internal.inputmethod.IInputMethodClient p0, android.os.IBinder p1, android.view.inputmethod.ImeTracker.Token p2, int p3, int p4, android.os.ResultReceiver p5, int p6) throws android.os.RemoteException { return false; }
            public boolean hideSoftInput(com.android.internal.inputmethod.IInputMethodClient p0, android.os.IBinder p1, android.view.inputmethod.ImeTracker.Token p2, int p3, android.os.ResultReceiver p4, int p5) throws android.os.RemoteException { return false; }
            public void hideSoftInputFromServerForTest() throws android.os.RemoteException {}
            public com.android.internal.inputmethod.InputBindResult startInputOrWindowGainedFocus(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, int p9, int p10, android.window.ImeOnBackInvokedDispatcher p11) throws android.os.RemoteException { return null; }
            public void startInputOrWindowGainedFocusAsync(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, int p9, int p10, android.window.ImeOnBackInvokedDispatcher p11, int p12) throws android.os.RemoteException {}
            public void showInputMethodPickerFromClient(com.android.internal.inputmethod.IInputMethodClient p0, int p1) throws android.os.RemoteException {}
            public void showInputMethodPickerFromSystem(int p0, int p1) throws android.os.RemoteException {}
            public boolean isInputMethodPickerShownForTest() throws android.os.RemoteException { return false; }
            public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(int p0) throws android.os.RemoteException { return null; }
            public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1, int p2) throws android.os.RemoteException {}
            public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException {}
            public int getInputMethodWindowVisibleHeight(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException { return 0; }
            public void reportPerceptibleAsync(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void removeImeSurface() throws android.os.RemoteException {}
            public void removeImeSurfaceFromWindowAsync(android.os.IBinder p0) throws android.os.RemoteException {}
            public void startProtoDump(byte[] p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public boolean isImeTraceEnabled() throws android.os.RemoteException { return false; }
            public void startImeTrace() throws android.os.RemoteException {}
            public void stopImeTrace() throws android.os.RemoteException {}
            public void startStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException {}
            public void startConnectionlessStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0, int p1, android.view.inputmethod.CursorAnchorInfo p2, java.lang.String p3, java.lang.String p4, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p5) throws android.os.RemoteException {}
            public void prepareStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public boolean acceptStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return false; }
            public void acceptStylusHandwritingDelegationAsync(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4, com.android.internal.inputmethod.IBooleanListener p5) throws android.os.RemoteException {}
            public boolean isStylusHandwritingAvailableAsUser(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void addVirtualStylusIdForTestSession(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException {}
            public void setStylusWindowIdleTimeoutForTest(com.android.internal.inputmethod.IInputMethodClient p0, long p1) throws android.os.RemoteException {}
            public com.android.internal.inputmethod.IImeTracker getImeTrackerService() throws android.os.RemoteException { return null; }
        }
    }
}
