package android.view.inputmethod;

public final class InputMethodManager {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "InputMethodManager";
    static final java.lang.String PENDING_EVENT_COUNTER = "aq:imm";
    private static final int NOT_A_SUBTYPE_ID = -1;
    private static final java.lang.String SUBTYPE_MODE_VOICE = "voice";
    private static final java.lang.Object sLock = null;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    static android.view.inputmethod.InputMethodManager sInstance;
    private static final android.util.SparseArray<android.view.inputmethod.InputMethodManager> sInstanceMap = null;
    static final long INPUT_METHOD_NOT_RESPONDING_TIMEOUT = 2500L;
    public static final int DISPATCH_IN_PROGRESS = -1;
    public static final int DISPATCH_NOT_HANDLED = 0;
    public static final int DISPATCH_HANDLED = 1;
    public static final int SHOW_IM_PICKER_MODE_AUTO = 0;
    public static final int SHOW_IM_PICKER_MODE_INCLUDE_AUXILIARY_SUBTYPES = 1;
    public static final int SHOW_IM_PICKER_MODE_EXCLUDE_AUXILIARY_SUBTYPES = 2;
    @android.annotation.UnsupportedAppUsage
    final com.android.internal.view.IInputMethodManager mService = null;
    final android.os.Looper mMainLooper = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    final android.view.inputmethod.InputMethodManager.H mH = null;
    final com.android.internal.view.IInputContext mIInputContext = null;
    private final int mDisplayId = 0;
    boolean mActive;
    boolean mRestartOnNextWindowFocus;
    boolean mFullscreenMode;
    @android.annotation.UnsupportedAppUsage
    android.view.View mCurRootView;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    android.view.View mServedView;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    android.view.View mNextServedView;
    boolean mServedConnecting;
    android.view.inputmethod.EditorInfo mCurrentTextBoxAttribute;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    android.view.inputmethod.InputMethodManager.ControlledInputConnectionWrapper mServedInputConnectionWrapper;
    android.view.inputmethod.CompletionInfo[] mCompletions;
    @android.annotation.UnsupportedAppUsage
    android.graphics.Rect mTmpCursorRect;
    @android.annotation.UnsupportedAppUsage
    android.graphics.Rect mCursorRect;
    int mCursorSelStart;
    int mCursorSelEnd;
    int mCursorCandStart;
    int mCursorCandEnd;
    private android.view.inputmethod.CursorAnchorInfo mCursorAnchorInfo;
    private android.graphics.Matrix mActivityViewToScreenMatrix;
    int mBindSequence;
    @android.annotation.UnsupportedAppUsage
    java.lang.String mCurId;
    @android.annotation.UnsupportedAppUsage
    com.android.internal.view.IInputMethodSession mCurMethod;
    android.view.InputChannel mCurChannel;
    android.view.inputmethod.InputMethodManager.ImeInputEventSender mCurSender;
    private static final int REQUEST_UPDATE_CURSOR_ANCHOR_INFO_NONE = 0;
    private int mRequestUpdateCursorAnchorInfoMonitorMode;
    private android.view.ImeInsetsSourceConsumer mImeInsetsConsumer;
    final android.util.Pools.Pool<android.view.inputmethod.InputMethodManager.PendingEvent> mPendingEventPool = null;
    final android.util.SparseArray<android.view.inputmethod.InputMethodManager.PendingEvent> mPendingEvents = null;
    static final int MSG_DUMP = 1;
    static final int MSG_BIND = 2;
    static final int MSG_UNBIND = 3;
    static final int MSG_SET_ACTIVE = 4;
    static final int MSG_SEND_INPUT_EVENT = 5;
    static final int MSG_TIMEOUT_INPUT_EVENT = 6;
    static final int MSG_FLUSH_INPUT_EVENT = 7;
    static final int MSG_REPORT_FULLSCREEN_MODE = 10;
    static final int MSG_REPORT_PRE_RENDERED = 15;
    static final int MSG_APPLY_IME_VISIBILITY = 20;
    static final int MSG_UPDATE_ACTIVITY_VIEW_TO_SCREEN_MATRIX = 30;
    final com.android.internal.view.IInputMethodClient.Stub mClient = null;
    final android.view.inputmethod.InputConnection mDummyInputConnection = null;
    public static final int SHOW_IMPLICIT = 1;
    public static final int SHOW_FORCED = 2;
    public static final int RESULT_UNCHANGED_SHOWN = 0;
    public static final int RESULT_UNCHANGED_HIDDEN = 1;
    public static final int RESULT_SHOWN = 2;
    public static final int RESULT_HIDDEN = 3;
    public static final int HIDE_IMPLICIT_ONLY = 1;
    public static final int HIDE_NOT_ALWAYS = 2;
    public static void ensureDefaultInstanceForDefaultDisplayIfNecessary() {}
    private static boolean isAutofillUIShowing(android.view.View p0) { return false; }
    private android.view.inputmethod.InputMethodManager getFallbackInputMethodManagerIfNecessary(android.view.View p0) { return null; }
    private static boolean canStartInput(android.view.View p0) { return false; }
    static void tearDownEditMode() {}
    private static boolean isInEditMode() { return false; }
    private static android.view.inputmethod.InputMethodManager createInstance(int p0, android.os.Looper p1) { return null; }
    private static android.view.inputmethod.InputMethodManager createRealInstance(int p0, android.os.Looper p1) { return null; }
    private static android.view.inputmethod.InputMethodManager createStubInstance(int p0, android.os.Looper p1) { return null; }
    private InputMethodManager(com.android.internal.view.IInputMethodManager p0, int p1, android.os.Looper p2) {}
    public static android.view.inputmethod.InputMethodManager forContext(android.content.Context p0) { return null; }
    private static android.view.inputmethod.InputMethodManager forContextInternal(int p0, android.os.Looper p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static android.view.inputmethod.InputMethodManager getInstance() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static android.view.inputmethod.InputMethodManager peekInstance() { return null; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.view.IInputMethodClient getClient() { return null; }
    @android.annotation.UnsupportedAppUsage
    public com.android.internal.view.IInputContext getInputContext() { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList() { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListAsUser(int p0) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList() { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodListAsUser(int p0) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(android.view.inputmethod.InputMethodInfo p0, boolean p1) { return null; }
    @java.lang.Deprecated
    public void showStatusIcon(android.os.IBinder p0, java.lang.String p1, int p2) {}
    @java.lang.Deprecated
    public void hideStatusIcon(android.os.IBinder p0) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void registerSuggestionSpansForNotification(android.text.style.SuggestionSpan[] p0) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void notifySuggestionPicked(android.text.style.SuggestionSpan p0, java.lang.String p1, int p2) {}
    public boolean isFullscreenMode() { return false; }
    public boolean isActive(android.view.View p0) { return false; }
    public boolean isActive() { return false; }
    public boolean isAcceptingText() { return false; }
    void clearBindingLocked() {}
    void setInputChannelLocked(android.view.InputChannel p0) {}
    void clearConnectionLocked() {}
    @android.annotation.UnsupportedAppUsage
    void finishInputLocked() {}
    public void displayCompletions(android.view.View p0, android.view.inputmethod.CompletionInfo[] p1) {}
    public void updateExtractedText(android.view.View p0, int p1, android.view.inputmethod.ExtractedText p2) {}
    public boolean showSoftInput(android.view.View p0, int p1) { return false; }
    public boolean showSoftInput(android.view.View p0, int p1, android.os.ResultReceiver p2) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123768499L)
    public void showSoftInputUnchecked(int p0, android.os.ResultReceiver p1) {}
    public boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1) { return false; }
    public boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) { return false; }
    public void toggleSoftInputFromWindow(android.os.IBinder p0, int p1, int p2) {}
    public void toggleSoftInput(int p0, int p1) {}
    public void restartInput(android.view.View p0) {}
    boolean startInputInner(int p0, android.os.IBinder p1, int p2, int p3, int p4) { return false; }
    @android.annotation.UnsupportedAppUsage
    public void windowDismissed(android.os.IBinder p0) {}
    @android.annotation.UnsupportedAppUsage
    public void focusIn(android.view.View p0) {}
    void focusInLocked(android.view.View p0) {}
    @android.annotation.UnsupportedAppUsage
    public void focusOut(android.view.View p0) {}
    public void onViewDetachedFromWindow(android.view.View p0) {}
    static void scheduleCheckFocusLocked(android.view.View p0) {}
    @android.annotation.UnsupportedAppUsage
    public void checkFocus() {}
    private boolean checkFocusNoStartInput(boolean p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    void closeCurrentInput() {}
    public void onPostWindowFocus(android.view.View p0, android.view.View p1, int p2, boolean p3, int p4) {}
    @android.annotation.UnsupportedAppUsage
    public void onPreWindowFocus(android.view.View p0, boolean p1) {}
    public void registerImeConsumer(android.view.ImeInsetsSourceConsumer p0) {}
    public void unregisterImeConsumer(android.view.ImeInsetsSourceConsumer p0) {}
    public boolean requestImeShow(android.os.ResultReceiver p0) { return false; }
    public void notifyImeHidden() {}
    public void updateSelection(android.view.View p0, int p1, int p2, int p3, int p4) {}
    @java.lang.Deprecated
    public void viewClicked(android.view.View p0) {}
    @java.lang.Deprecated
    public boolean isWatchingCursor(android.view.View p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isCursorAnchorInfoEnabled() { return false; }
    @android.annotation.UnsupportedAppUsage
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
    void sendInputEventAndReportResultOnMainLooper(android.view.inputmethod.InputMethodManager.PendingEvent p0) {}
    int sendInputEventOnMainLooperLocked(android.view.inputmethod.InputMethodManager.PendingEvent p0) { return 0; }
    void finishedInputEvent(int p0, boolean p1, boolean p2) {}
    void invokeFinishedInputEventCallback(android.view.inputmethod.InputMethodManager.PendingEvent p0, boolean p1) {}
    private void flushPendingEventsLocked() {}
    private android.view.inputmethod.InputMethodManager.PendingEvent obtainPendingEventLocked(android.view.InputEvent p0, java.lang.Object p1, java.lang.String p2, android.view.inputmethod.InputMethodManager.FinishedInputEventCallback p3, android.os.Handler p4) { return null; }
    private void recyclePendingEventLocked(android.view.inputmethod.InputMethodManager.PendingEvent p0) {}
    public void showInputMethodPicker() {}
    public void showInputMethodPickerFromSystem(boolean p0, int p1) {}
    private void showInputMethodPickerLocked() {}
    public boolean isInputMethodPickerShown() { return false; }
    public void showInputMethodAndSubtypeEnabler(java.lang.String p0) {}
    public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() { return null; }
    @java.lang.Deprecated
    public boolean setCurrentInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(trackingBug=114740982L, maxTargetSdk=28)
    public void notifyUserAction() {}
    public java.util.Map<android.view.inputmethod.InputMethodInfo, java.util.List<android.view.inputmethod.InputMethodSubtype>> getShortcutInputMethodsAndSubtypes() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getInputMethodWindowVisibleHeight() { return 0; }
    public void reportActivityView(int p0, android.graphics.Matrix p1) {}
    @java.lang.Deprecated
    public boolean switchToLastInputMethod(android.os.IBinder p0) { return false; }
    @java.lang.Deprecated
    public boolean switchToNextInputMethod(android.os.IBinder p0, boolean p1) { return false; }
    @java.lang.Deprecated
    public boolean shouldOfferSwitchingToNextInputMethod(android.os.IBinder p0) { return false; }
    @java.lang.Deprecated
    public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1) {}
    public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() { return null; }
    private void maybeCallServedViewChangedLocked(android.view.inputmethod.EditorInfo p0) {}
    public int getDisplayId() { return 0; }
    void doDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    private static java.lang.String dumpViewInfo(android.view.View p0) { return null; }

    private final class PendingEvent implements java.lang.Runnable {
        public android.view.InputEvent mEvent;
        public java.lang.Object mToken;
        public java.lang.String mInputMethodId;
        public android.view.inputmethod.InputMethodManager.FinishedInputEventCallback mCallback;
        public android.os.Handler mHandler;
        public boolean mHandled;
        private PendingEvent(android.view.inputmethod.InputMethodManager p0) {}
        public void recycle() {}
        public void run() {}
    }

    private final class ImeInputEventSender extends android.view.InputEventSender {
        public ImeInputEventSender(android.view.inputmethod.InputMethodManager p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEventFinished(int p0, boolean p1) {}
    }

    class H extends android.os.Handler {
        H(android.view.inputmethod.InputMethodManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface FinishedInputEventCallback {
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
    }

    private static class ControlledInputConnectionWrapper extends com.android.internal.view.IInputConnectionWrapper {
        private final android.view.inputmethod.InputMethodManager mParentInputMethodManager = null;
        public ControlledInputConnectionWrapper(android.os.Looper p0, android.view.inputmethod.InputConnection p1, android.view.inputmethod.InputMethodManager p2) { super(null, null); }
        public boolean isActive() { return false; }
        void deactivate() {}
        public java.lang.String toString() { return null; }
    }
}
