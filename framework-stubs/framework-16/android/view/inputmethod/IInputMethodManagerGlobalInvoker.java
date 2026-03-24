package android.view.inputmethod;

final class IInputMethodManagerGlobalInvoker {
    IInputMethodManagerGlobalInvoker() {}
    static boolean isAvailable() { return false; }
    @android.annotation.Nullable
    static com.android.internal.view.IInputMethodManager getService() { return null; }
    @android.annotation.RequiresNoPermission
    static void startProtoDump(byte[] p0, int p1, java.lang.String p2, java.util.function.Consumer<android.os.RemoteException> p3) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_UI_TRACING")
    static void startImeTrace(java.util.function.Consumer<android.os.RemoteException> p0) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_UI_TRACING")
    static void stopImeTrace(java.util.function.Consumer<android.os.RemoteException> p0) {}
    @android.annotation.RequiresNoPermission
    static boolean isImeTraceEnabled() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.INTERNAL_SYSTEM_WINDOW", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    static void removeImeSurface(int p0, java.util.function.Consumer<android.os.RemoteException> p1) {}
    static void addClient(com.android.internal.inputmethod.IInputMethodClient p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(int p0) { return null; }
    @android.annotation.NonNull
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList(int p0, int p1) { return null; }
    @android.annotation.NonNull
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList(int p0) { return null; }
    @android.annotation.NonNull
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1, int p2) { return null; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    static void hideSoftInputFromServerForTest() {}
    @android.annotation.NonNull
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static com.android.internal.inputmethod.InputBindResult startInputOrWindowGainedFocus(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, int p9, int p10, android.window.ImeOnBackInvokedDispatcher p11, boolean p12) { return null; }
    @android.annotation.NonNull
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static int startInputOrWindowGainedFocusAsync(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, int p9, int p10, android.window.ImeOnBackInvokedDispatcher p11, boolean p12, boolean p13) { return 0; }
    static void showInputMethodPickerFromClient(com.android.internal.inputmethod.IInputMethodClient p0, int p1) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.WRITE_SECURE_SETTINGS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    static void showInputMethodPickerFromSystem(int p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    static boolean isInputMethodPickerShownForTest() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.WRITE_SECURE_SETTINGS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    static void onImeSwitchButtonClickFromSystem(int p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    static boolean shouldShowImeSwitcherButtonForTest() { return false; }
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(int p0) { return null; }
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1, int p2) {}
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1, int p2) {}
    static int getInputMethodWindowVisibleHeight(com.android.internal.inputmethod.IInputMethodClient p0) { return 0; }
    static void reportPerceptibleAsync(android.os.IBinder p0, boolean p1) {}
    static void removeImeSurfaceFromWindowAsync(android.os.IBinder p0) {}
    static void startStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0) {}
    static boolean startConnectionlessStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0, int p1, android.view.inputmethod.CursorAnchorInfo p2, java.lang.String p3, java.lang.String p4, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p5) { return false; }
    static void prepareStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3) {}
    static boolean acceptStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4) { return false; }
    static boolean acceptStylusHandwritingDelegationAsync(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4, com.android.internal.inputmethod.IBooleanListener p5) { return false; }
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    static boolean isStylusHandwritingAvailableAsUser(int p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    static void addVirtualStylusIdForTestSession(com.android.internal.inputmethod.IInputMethodClient p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    static void setStylusWindowIdleTimeoutForTest(com.android.internal.inputmethod.IInputMethodClient p0, long p1) {}
    @android.annotation.NonNull
    static android.view.inputmethod.ImeTracker.Token onStart(java.lang.String p0, int p1, int p2, int p3, int p4, boolean p5) { return null; }
    static void onProgress(android.os.IBinder p0, int p1) {}
    static void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1) {}
    static void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1) {}
    static void onShown(android.view.inputmethod.ImeTracker.Token p0) {}
    static void onHidden(android.view.inputmethod.ImeTracker.Token p0) {}
    static void onDispatched(android.view.inputmethod.ImeTracker.Token p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    static boolean hasPendingImeVisibilityRequests() { return false; }
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    static void finishTrackingPendingImeVisibilityRequests() {}
}
