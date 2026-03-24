package android.view.inputmethod;

public final class InputMethodManager {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "InputMethodManager";
    static final java.lang.String PENDING_EVENT_COUNTER = "aq:imm";
    private static final int NOT_A_SUBTYPE_ID = -1;
    private static final java.lang.String SUBTYPE_MODE_VOICE = "voice";
    private static final java.lang.Object sLock = null;
    @java.lang.Deprecated
    static android.view.inputmethod.InputMethodManager sInstance;
    private static final android.util.SparseArray<android.view.inputmethod.InputMethodManager> sInstanceMap = null;
    static final long INPUT_METHOD_NOT_RESPONDING_TIMEOUT = 2500L;
    public static final int DISPATCH_IN_PROGRESS = -1;
    public static final int DISPATCH_NOT_HANDLED = 0;
    public static final int DISPATCH_HANDLED = 1;
    public static final int SHOW_IM_PICKER_MODE_AUTO = 0;
    public static final int SHOW_IM_PICKER_MODE_INCLUDE_AUXILIARY_SUBTYPES = 1;
    public static final int SHOW_IM_PICKER_MODE_EXCLUDE_AUXILIARY_SUBTYPES = 2;
    final com.android.internal.view.IInputMethodManager mService = null;
    final android.os.Looper mMainLooper = null;
    final android.view.inputmethod.InputMethodManager.H mH = null;
    final com.android.internal.view.IInputContext mIInputContext = null;
    private final int mDisplayId = 0;
    boolean mActive;
    private boolean mRestartOnNextWindowFocus;
    boolean mFullscreenMode;
    android.view.ViewRootImpl mCurRootView;
    boolean mServedConnecting;
    android.view.inputmethod.EditorInfo mCurrentTextBoxAttribute;
    com.android.internal.view.IInputConnectionWrapper mServedInputConnectionWrapper;
    android.view.inputmethod.CompletionInfo[] mCompletions;
    android.graphics.Rect mTmpCursorRect;
    android.graphics.Rect mCursorRect;
    int mCursorSelStart;
    int mCursorSelEnd;
    int mCursorCandStart;
    int mCursorCandEnd;
    private android.view.inputmethod.CursorAnchorInfo mCursorAnchorInfo;
    private boolean mIsInputMethodSuppressingSpellChecker;
    int mBindSequence;
    java.lang.String mCurId;
    @java.lang.Deprecated
    com.android.internal.view.IInputMethodSession mCurMethod;
    private android.view.inputmethod.InputMethodSessionWrapper mCurrentInputMethodSession;
    android.view.InputChannel mCurChannel;
    android.view.inputmethod.InputMethodManager.ImeInputEventSender mCurSender;
    private static final int REQUEST_UPDATE_CURSOR_ANCHOR_INFO_NONE = 0;
    private int mRequestUpdateCursorAnchorInfoMonitorMode;
    private android.view.ImeInsetsSourceConsumer mImeInsetsConsumer;
    final android.util.Pools.Pool<android.view.inputmethod.InputMethodManager.PendingEvent> mPendingEventPool = null;
    final android.util.SparseArray<android.view.inputmethod.InputMethodManager.PendingEvent> mPendingEvents = null;
    final android.view.inputmethod.InputMethodManager.DelegateImpl mDelegate = null;
    static final int MSG_DUMP = 1;
    static final int MSG_BIND = 2;
    static final int MSG_UNBIND = 3;
    static final int MSG_SET_ACTIVE = 4;
    static final int MSG_SEND_INPUT_EVENT = 5;
    static final int MSG_TIMEOUT_INPUT_EVENT = 6;
    static final int MSG_FLUSH_INPUT_EVENT = 7;
    static final int MSG_REPORT_FULLSCREEN_MODE = 10;
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
    public void reportPerceptible(android.os.IBinder p0, boolean p1) {}
    public android.view.inputmethod.InputMethodManager.DelegateImpl getDelegate() { return null; }
    public boolean hasActiveInputConnection(android.view.View p0) { return false; }
    private android.view.View getServedViewLocked() { return null; }
    private android.view.View getNextServedViewLocked() { return null; }
    private void setServedViewLocked(android.view.View p0) {}
    private void setNextServedViewLocked(android.view.View p0) {}
    private android.view.ImeFocusController getFocusController() { return null; }
    private boolean hasServedByInputMethodLocked(android.view.View p0) { return false; }
    static void tearDownEditMode() {}
    private static boolean isInEditMode() { return false; }
    private static android.view.inputmethod.InputMethodManager createInstance(int p0, android.os.Looper p1) { return null; }
    private static android.view.inputmethod.InputMethodManager createRealInstance(int p0, android.os.Looper p1) { return null; }
    private static android.view.inputmethod.InputMethodManager createStubInstance(int p0, android.os.Looper p1) { return null; }
    private InputMethodManager(com.android.internal.view.IInputMethodManager p0, int p1, android.os.Looper p2) {}
    public static android.view.inputmethod.InputMethodManager forContext(android.content.Context p0) { return null; }
    private static android.view.inputmethod.InputMethodManager forContextInternal(int p0, android.os.Looper p1) { return null; }
    @java.lang.Deprecated
    public static android.view.inputmethod.InputMethodManager getInstance() { return null; }
    @java.lang.Deprecated
    public static android.view.inputmethod.InputMethodManager peekInstance() { return null; }
    public com.android.internal.view.IInputMethodClient getClient() { return null; }
    public com.android.internal.view.IInputContext getInputContext() { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList() { return null; }
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListAsUser(int p0) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList() { return null; }
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodListAsUser(int p0) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(android.view.inputmethod.InputMethodInfo p0, boolean p1) { return null; }
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
    public boolean isAcceptingText() { return false; }
    public boolean isInputMethodSuppressingSpellChecker() { return false; }
    void clearBindingLocked() {}
    void setInputChannelLocked(android.view.InputChannel p0) {}
    void clearConnectionLocked() {}
    void finishInputLocked() {}
    public void displayCompletions(android.view.View p0, android.view.inputmethod.CompletionInfo[] p1) {}
    public void updateExtractedText(android.view.View p0, int p1, android.view.inputmethod.ExtractedText p2) {}
    public boolean showSoftInput(android.view.View p0, int p1) { return false; }
    public boolean showSoftInput(android.view.View p0, int p1, android.os.ResultReceiver p2) { return false; }
    private boolean showSoftInput(android.view.View p0, int p1, android.os.ResultReceiver p2, int p3) { return false; }
    @java.lang.Deprecated
    public void showSoftInputUnchecked(int p0, android.os.ResultReceiver p1) {}
    public boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1) { return false; }
    public boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) { return false; }
    private boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1, android.os.ResultReceiver p2, int p3) { return false; }
    @java.lang.Deprecated
    public void toggleSoftInputFromWindow(android.os.IBinder p0, int p1, int p2) {}
    @java.lang.Deprecated
    public void toggleSoftInput(int p0, int p1) {}
    public void restartInput(android.view.View p0) {}
    boolean startInputInner(int p0, android.os.IBinder p1, int p2, int p3, int p4) { return false; }
    @java.lang.Deprecated
    public void windowDismissed(android.os.IBinder p0) {}
    private int getStartInputFlags(android.view.View p0, int p1) { return 0; }
    public void checkFocus() {}
    void closeCurrentInput() {}
    public void registerImeConsumer(android.view.ImeInsetsSourceConsumer p0) {}
    public void unregisterImeConsumer(android.view.ImeInsetsSourceConsumer p0) {}
    public boolean requestImeShow(android.os.IBinder p0) { return false; }
    public void notifyImeHidden(android.os.IBinder p0) {}
    public void removeImeSurface(android.os.IBinder p0) {}
    public void updateSelection(android.view.View p0, int p1, int p2, int p3, int p4) {}
    @java.lang.Deprecated
    public void viewClicked(android.view.View p0) {}
    @java.lang.Deprecated
    public boolean isWatchingCursor(android.view.View p0) { return false; }
    public boolean isCursorAnchorInfoEnabled() { return false; }
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
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void showInputMethodPickerFromSystem(boolean p0, int p1) {}
    private void showInputMethodPickerLocked() {}
    public boolean isInputMethodPickerShown() { return false; }
    public void showInputMethodAndSubtypeEnabler(java.lang.String p0) {}
    public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public boolean setCurrentInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) { return false; }
    @java.lang.Deprecated
    public void notifyUserAction() {}
    public java.util.Map<android.view.inputmethod.InputMethodInfo, java.util.List<android.view.inputmethod.InputMethodSubtype>> getShortcutInputMethodsAndSubtypes() { return null; }
    public int getInputMethodWindowVisibleHeight() { return 0; }
    @java.lang.Deprecated
    public boolean switchToLastInputMethod(android.os.IBinder p0) { return false; }
    @java.lang.Deprecated
    public boolean switchToNextInputMethod(android.os.IBinder p0, boolean p1) { return false; }
    @java.lang.Deprecated
    public boolean shouldOfferSwitchingToNextInputMethod(android.os.IBinder p0) { return false; }
    @java.lang.Deprecated
    public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1) {}
    public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() { return null; }
    public int getDisplayId() { return 0; }
    void doDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    private static java.lang.String dumpViewInfo(android.view.View p0) { return null; }
    private boolean processDump(java.io.FileDescriptor p0, java.lang.String[] p1) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, android.util.proto.ProtoOutputStream p1) {}

    private final class DelegateImpl implements android.view.ImeFocusController.InputMethodManagerDelegate {
        private DelegateImpl(android.view.inputmethod.InputMethodManager p0) {}
        public boolean startInput(int p0, android.view.View p1, int p2, int p3, int p4) { return false; }
        public void finishInput() {}
        public void finishInputAndReportToIme() {}
        public void closeCurrentIme() {}
        public void startInputAsyncOnWindowFocusGain(android.view.View p0, int p1, int p2, boolean p3) {}
        public void finishComposingText() {}
        public void setCurrentRootView(android.view.ViewRootImpl p0) {}
        public boolean isCurrentRootView(android.view.ViewRootImpl p0) { return false; }
        public boolean isRestartOnNextWindowFocus(boolean p0) { return false; }
        public boolean hasActiveConnection(android.view.View p0) { return false; }
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
        private PendingEvent(android.view.inputmethod.InputMethodManager p0) {}
        public void recycle() {}
        public void run() {}
    }
}
