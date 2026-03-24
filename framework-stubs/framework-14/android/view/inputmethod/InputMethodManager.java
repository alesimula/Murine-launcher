package android.view.inputmethod;

public final class InputMethodManager {
    @java.lang.Deprecated
    static android.view.inputmethod.InputMethodManager sInstance;
    public static final int DISPATCH_IN_PROGRESS = -1;
    public static final int DISPATCH_NOT_HANDLED = 0;
    public static final int DISPATCH_HANDLED = 1;
    public static final int SHOW_IM_PICKER_MODE_AUTO = 0;
    public static final int SHOW_IM_PICKER_MODE_INCLUDE_AUXILIARY_SUBTYPES = 1;
    public static final int SHOW_IM_PICKER_MODE_EXCLUDE_AUXILIARY_SUBTYPES = 2;
    public static final long CLEAR_SHOW_FORCED_FLAG_WHEN_LEAVING = 214016041L;
    @java.lang.Deprecated
    final com.android.internal.view.IInputMethodManager mService = null;
    final android.view.inputmethod.InputMethodManager.H mH = null;
    android.view.ViewRootImpl mCurRootView;
    boolean mCurRootViewWindowFocused;
    android.graphics.Rect mTmpCursorRect;
    android.graphics.Rect mCursorRect;
    @java.lang.Deprecated
    java.lang.String mCurId;
    @java.lang.Deprecated
    com.android.internal.inputmethod.IInputMethodSession mCurMethod;
    public static final int SHOW_IMPLICIT = 1;
    @java.lang.Deprecated
    public static final int SHOW_FORCED = 2;
    public static final int RESULT_UNCHANGED_SHOWN = 0;
    public static final int RESULT_UNCHANGED_HIDDEN = 1;
    public static final int RESULT_SHOWN = 2;
    public static final int RESULT_HIDDEN = 3;
    public static final int HIDE_IMPLICIT_ONLY = 1;
    public static final int HIDE_NOT_ALWAYS = 2;
    final java.util.concurrent.atomic.AtomicBoolean mRequestCursorUpdateDisplayIdCheck = null;
    public static void ensureDefaultInstanceForDefaultDisplayIfNecessary() {}
    android.content.Context getFallbackContextFromServedView() { return null; }
    public void reportPerceptible(android.os.IBinder p0, boolean p1) {}
    public android.view.inputmethod.InputMethodManager.DelegateImpl getDelegate() { return null; }
    public boolean hasActiveInputConnection(android.view.View p0) { return false; }
    static void tearDownEditMode() {}
    static boolean isInEditModeInternal() { return false; }
    public static android.view.inputmethod.InputMethodManager forContext(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public static android.view.inputmethod.InputMethodManager getInstance() { return null; }
    @java.lang.Deprecated
    public static android.view.inputmethod.InputMethodManager peekInstance() { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList() { return null; }
    public boolean isStylusHandwritingAvailable() { return false; }
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public boolean isStylusHandwritingAvailableAsUser(int p0) { return false; }
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListAsUser(int p0) { return null; }
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListAsUser(int p0, int p1) { return null; }
    public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfo() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    @android.annotation.SuppressLint("UserHandle")
    public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(android.os.UserHandle p0) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList() { return null; }
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodListAsUser(int p0) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(android.view.inputmethod.InputMethodInfo p0, boolean p1) { return null; }
    @android.annotation.RequiresPermission(value="android.permission.INTERACT_ACROSS_USERS_FULL", conditional=true)
    public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeListAsUser(java.lang.String p0, boolean p1, int p2) { return null; }
    @java.lang.Deprecated
    public void showStatusIcon(android.os.IBinder p0, java.lang.String p1, int p2) {}
    @java.lang.Deprecated
    public void hideStatusIcon(android.os.IBinder p0) {}
    @java.lang.Deprecated
    public void registerSuggestionSpansForNotification(android.text.style.SuggestionSpan[] p0) {}
    @java.lang.Deprecated
    public void notifySuggestionPicked(android.text.style.SuggestionSpan p0, java.lang.String p1, int p2) {}
    public boolean isFullscreenMode() { return false; }
    public boolean isActive(android.view.View p0) { return false; }
    public boolean isActive() { return false; }
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    public boolean isCurrentRootView(android.view.View p0) { return false; }
    public boolean isAcceptingText() { return false; }
    public boolean isInputMethodSuppressingSpellChecker() { return false; }
    void finishInputLocked() {}
    public void displayCompletions(android.view.View p0, android.view.inputmethod.CompletionInfo[] p1) {}
    public void updateExtractedText(android.view.View p0, int p1, android.view.inputmethod.ExtractedText p2) {}
    public boolean showSoftInput(android.view.View p0, int p1) { return false; }
    public boolean showSoftInput(android.view.View p0, int p1, android.os.ResultReceiver p2) { return false; }
    @java.lang.Deprecated
    public void showSoftInputUnchecked(int p0, android.os.ResultReceiver p1) {}
    public boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1) { return false; }
    public boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) { return false; }
    public void startStylusHandwriting(android.view.View p0) {}
    public void prepareStylusHandwritingDelegation(android.view.View p0) {}
    public void prepareStylusHandwritingDelegation(android.view.View p0, java.lang.String p1) {}
    public boolean acceptStylusHandwritingDelegation(android.view.View p0) { return false; }
    public boolean acceptStylusHandwritingDelegation(android.view.View p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    public void toggleSoftInputFromWindow(android.os.IBinder p0, int p1, int p2) {}
    @java.lang.Deprecated
    public void toggleSoftInput(int p0, int p1) {}
    public void restartInput(android.view.View p0) {}
    public boolean doInvalidateInput(android.view.inputmethod.RemoteInputConnectionImpl p0, android.view.inputmethod.TextSnapshot p1, int p2) { return false; }
    public void invalidateInput(android.view.View p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    public void addVirtualStylusIdForTestSession() {}
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    public void setStylusWindowIdleTimeoutForTest(long p0) {}
    @java.lang.Deprecated
    public void windowDismissed(android.os.IBinder p0) {}
    public void checkFocus() {}
    void closeCurrentInput() {}
    public void registerImeConsumer(android.view.ImeInsetsSourceConsumer p0) {}
    public void unregisterImeConsumer(android.view.ImeInsetsSourceConsumer p0) {}
    public boolean requestImeShow(android.os.IBinder p0, android.view.inputmethod.ImeTracker.Token p1) { return false; }
    public void notifyImeHidden(android.os.IBinder p0, android.view.inputmethod.ImeTracker.Token p1) {}
    public void removeImeSurface(android.os.IBinder p0) {}
    public void updateSelection(android.view.View p0, int p1, int p2, int p3, int p4) {}
    @java.lang.Deprecated
    public void viewClicked(android.view.View p0) {}
    @java.lang.Deprecated
    public boolean isWatchingCursor(android.view.View p0) { return false; }
    @java.lang.Deprecated
    public boolean isCursorAnchorInfoEnabled() { return false; }
    @java.lang.Deprecated
    public void setUpdateCursorAnchorInfoMode(int p0) {}
    @java.lang.Deprecated
    public void updateCursor(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void updateCursorAnchorInfo(android.view.View p0, android.view.inputmethod.CursorAnchorInfo p1) {}
    public void sendAppPrivateCommand(android.view.View p0, java.lang.String p1, android.os.Bundle p2) {}
    @java.lang.Deprecated
    public void setInputMethod(android.os.IBinder p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void setInputMethodAndSubtype(android.os.IBinder p0, java.lang.String p1, android.view.inputmethod.InputMethodSubtype p2) {}
    @java.lang.Deprecated
    public void hideSoftInputFromInputMethod(android.os.IBinder p0, int p1) {}
    @java.lang.Deprecated
    public void showSoftInputFromInputMethod(android.os.IBinder p0, int p1) {}
    public int dispatchInputEvent(android.view.InputEvent p0, java.lang.Object p1, android.view.inputmethod.InputMethodManager.FinishedInputEventCallback p2, android.os.Handler p3) { return 0; }
    public void dispatchKeyEventFromInputMethod(android.view.View p0, android.view.KeyEvent p1) {}
    public void showInputMethodPicker() {}
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void showInputMethodPickerFromSystem(boolean p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    public boolean isInputMethodPickerShown() { return false; }
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    public boolean hasPendingImeVisibilityRequests() { return false; }
    public void showInputMethodAndSubtypeEnabler(java.lang.String p0) {}
    public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public boolean setCurrentInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) { return false; }
    @java.lang.Deprecated
    public void notifyUserAction() {}
    public java.util.Map<android.view.inputmethod.InputMethodInfo, java.util.List<android.view.inputmethod.InputMethodSubtype>> getShortcutInputMethodsAndSubtypes() { return null; }
    public int getInputMethodWindowVisibleHeight() { return 0; }
    public void setRequestCursorUpdateDisplayIdCheck(boolean p0) {}
    public void reportVirtualDisplayGeometry(int p0, android.graphics.Matrix p1) {}
    public boolean hasVirtualDisplayToScreenMatrix() { return false; }
    @java.lang.Deprecated
    public boolean switchToLastInputMethod(android.os.IBinder p0) { return false; }
    @java.lang.Deprecated
    public boolean switchToNextInputMethod(android.os.IBinder p0, boolean p1) { return false; }
    @java.lang.Deprecated
    public boolean shouldOfferSwitchingToNextInputMethod(android.os.IBinder p0) { return false; }
    @java.lang.Deprecated
    public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1) {}
    public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1) {}
    public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() { return null; }
    public int getDisplayId() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, byte[] p1) {}

    private static final class BindState {
        final android.view.inputmethod.IInputMethodSessionInvoker mImeSession = null;
        final boolean mIsInputMethodSuppressingSpellChecker = false;
        final java.lang.String mImeId = null;
        final int mBindSequence = 0;
        BindState(com.android.internal.inputmethod.InputBindResult p0) {}
    }

    private final class DelegateImpl implements android.view.ImeFocusController.InputMethodManagerDelegate {
        public void onPreWindowGainedFocus(android.view.ViewRootImpl p0) {}
        public void onPostWindowGainedFocus(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
        public void onWindowLostFocus(android.view.ViewRootImpl p0) {}
        public void onViewFocusChanged(android.view.View p0, boolean p1) {}
        public void onScheduledCheckFocus(android.view.ViewRootImpl p0) {}
        public void onViewDetachedFromWindow(android.view.View p0, android.view.ViewRootImpl p1) {}
        public void onWindowDismissed(android.view.ViewRootImpl p0) {}
    }

    public static interface FinishedInputEventCallback {
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
    }

    class H extends android.os.Handler {
        H(android.view.inputmethod.InputMethodManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private final class ImeInputEventSender extends android.view.InputEventSender {
        public ImeInputEventSender(android.view.inputmethod.InputMethodManager p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEventFinished(int p0, boolean p1) {}
    }

    private final class PendingEvent implements java.lang.Runnable {
        public android.view.InputEvent mEvent;
        public java.lang.Object mToken;
        public java.lang.String mInputMethodId;
        public android.view.inputmethod.InputMethodManager.FinishedInputEventCallback mCallback;
        public android.os.Handler mHandler;
        public boolean mHandled;
        public void recycle() {}
        public void run() {}
    }
}
