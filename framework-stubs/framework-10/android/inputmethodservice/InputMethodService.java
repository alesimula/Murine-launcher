package android.inputmethodservice;

public class InputMethodService extends android.inputmethodservice.AbstractInputMethodService {
    static final java.lang.String TAG = "InputMethodService";
    static final boolean DEBUG = false;
    public static final int BACK_DISPOSITION_DEFAULT = 0;
    @java.lang.Deprecated
    public static final int BACK_DISPOSITION_WILL_NOT_DISMISS = 1;
    @java.lang.Deprecated
    public static final int BACK_DISPOSITION_WILL_DISMISS = 2;
    public static final int BACK_DISPOSITION_ADJUST_NOTHING = 3;
    public static final int IME_ACTIVE = 1;
    public static final int IME_VISIBLE = 2;
    public static final int IME_INVISIBLE = 4;
    private static final int BACK_DISPOSITION_MIN = 0;
    private static final int BACK_DISPOSITION_MAX = 3;
    android.view.inputmethod.InputMethodManager mImm;
    private com.android.internal.inputmethod.InputMethodPrivilegedOperations mPrivOps;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    int mTheme;
    android.view.LayoutInflater mInflater;
    android.content.res.TypedArray mThemeAttrs;
    @android.annotation.UnsupportedAppUsage
    android.view.View mRootView;
    android.inputmethodservice.SoftInputWindow mWindow;
    boolean mInitialized;
    boolean mViewsCreated;
    boolean mDecorViewVisible;
    boolean mDecorViewWasVisible;
    boolean mInShowWindow;
    boolean mCanPreRender;
    boolean mIsPreRendered;
    boolean mWindowVisible;
    android.view.ViewGroup mFullscreenArea;
    android.widget.FrameLayout mExtractFrame;
    android.widget.FrameLayout mCandidatesFrame;
    android.widget.FrameLayout mInputFrame;
    android.os.IBinder mToken;
    android.view.inputmethod.InputBinding mInputBinding;
    android.view.inputmethod.InputConnection mInputConnection;
    boolean mInputStarted;
    boolean mInputViewStarted;
    boolean mCandidatesViewStarted;
    android.view.inputmethod.InputConnection mStartedInputConnection;
    android.view.inputmethod.EditorInfo mInputEditorInfo;
    int mShowInputFlags;
    boolean mShowInputRequested;
    boolean mLastShowInputRequested;
    int mCandidatesVisibility;
    android.view.inputmethod.CompletionInfo[] mCurCompletions;
    boolean mFullscreenApplied;
    boolean mIsFullscreen;
    @android.annotation.UnsupportedAppUsage
    android.view.View mExtractView;
    boolean mExtractViewHidden;
    @android.annotation.UnsupportedAppUsage
    android.inputmethodservice.ExtractEditText mExtractEditText;
    android.view.ViewGroup mExtractAccessories;
    android.view.View mExtractAction;
    android.view.inputmethod.ExtractedText mExtractedText;
    int mExtractedToken;
    android.view.View mInputView;
    boolean mIsInputViewShown;
    int mStatusIcon;
    int mBackDisposition;
    private java.lang.Object mLock;
    private boolean mNotifyUserActionSent;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    final android.inputmethodservice.InputMethodService.Insets mTmpInsets = null;
    final int[] mTmpLocation = null;
    final android.view.ViewTreeObserver.OnComputeInternalInsetsListener mInsetsComputer = null;
    final android.view.View.OnClickListener mActionClickListener = null;
    @android.annotation.UnsupportedAppUsage
    private android.inputmethodservice.InputMethodService.SettingsObserver mSettingsObserver;
    static final int MOVEMENT_DOWN = -1;
    static final int MOVEMENT_UP = -2;
    public InputMethodService() { super(); }
    private void notifyImeHidden() {}
    private void setImeWindowStatus(int p0, int p1) {}
    public void setTheme(int p0) {}
    @java.lang.Deprecated
    public boolean enableHardwareAcceleration() { return false; }
    public void onCreate() {}
    public void onInitializeInterface() {}
    void initialize() {}
    void initViews() {}
    public void onDestroy() {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    private void resetStateForNewConfiguration() {}
    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() { return null; }
    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() { return null; }
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    public android.app.Dialog getWindow() { return null; }
    public void setBackDisposition(int p0) {}
    public int getBackDisposition() { return 0; }
    public int getMaxWidth() { return 0; }
    public android.view.inputmethod.InputBinding getCurrentInputBinding() { return null; }
    public android.view.inputmethod.InputConnection getCurrentInputConnection() { return null; }
    public final boolean switchToPreviousInputMethod() { return false; }
    public final boolean switchToNextInputMethod(boolean p0) { return false; }
    public final boolean shouldOfferSwitchingToNextInputMethod() { return false; }
    public boolean getCurrentInputStarted() { return false; }
    public android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() { return null; }
    private void reportFullscreenMode() {}
    public void updateFullscreenMode() {}
    public void onConfigureWindow(android.view.Window p0, boolean p1, boolean p2) {}
    public boolean isFullscreenMode() { return false; }
    public boolean onEvaluateFullscreenMode() { return false; }
    public void setExtractViewShown(boolean p0) {}
    public boolean isExtractViewShown() { return false; }
    void updateExtractFrameVisibility() {}
    public void onComputeInsets(android.inputmethodservice.InputMethodService.Insets p0) {}
    public void updateInputViewShown() {}
    public boolean isShowInputRequested() { return false; }
    public boolean isInputViewShown() { return false; }
    public boolean onEvaluateInputViewShown() { return false; }
    public void setCandidatesViewShown(boolean p0) {}
    void updateCandidatesVisibility(boolean p0) {}
    public int getCandidatesHiddenVisibility() { return 0; }
    public void showStatusIcon(int p0) {}
    public void hideStatusIcon() {}
    public void switchInputMethod(java.lang.String p0) {}
    public final void switchInputMethod(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1) {}
    public void setExtractView(android.view.View p0) {}
    public void setCandidatesView(android.view.View p0) {}
    public void setInputView(android.view.View p0) {}
    public android.view.View onCreateExtractTextView() { return null; }
    public android.view.View onCreateCandidatesView() { return null; }
    public android.view.View onCreateInputView() { return null; }
    public void onStartInputView(android.view.inputmethod.EditorInfo p0, boolean p1) {}
    public void onFinishInputView(boolean p0) {}
    public void onStartCandidatesView(android.view.inputmethod.EditorInfo p0, boolean p1) {}
    public void onFinishCandidatesView(boolean p0) {}
    public boolean onShowInputRequested(int p0, boolean p1) { return false; }
    private boolean dispatchOnShowInputRequested(int p0, boolean p1) { return false; }
    public void showWindow(boolean p0) {}
    private void maybeNotifyPreRendered() {}
    private boolean prepareWindow(boolean p0) { return false; }
    private void startViews(boolean p0) {}
    private void onPreRenderedWindowVisibilityChanged(boolean p0) {}
    private void applyVisibilityInInsetsConsumer(boolean p0) {}
    private void finishViews(boolean p0) {}
    private void doHideWindow() {}
    public void hideWindow() {}
    public void onWindowShown() {}
    public void onWindowHidden() {}
    public void onBindInput() {}
    public void onUnbindInput() {}
    public void onStartInput(android.view.inputmethod.EditorInfo p0, boolean p1) {}
    void doFinishInput() {}
    void doStartInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2) {}
    public void onFinishInput() {}
    public void onDisplayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
    public void onUpdateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
    public void onUpdateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    @java.lang.Deprecated
    public void onViewClicked(boolean p0) {}
    @java.lang.Deprecated
    public void onUpdateCursor(android.graphics.Rect p0) {}
    public void onUpdateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
    public void requestHideSelf(int p0) {}
    public final void requestShowSelf(int p0) {}
    private boolean handleBack(boolean p0) { return false; }
    private android.inputmethodservice.ExtractEditText getExtractEditTextIfVisible() { return null; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public void onAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    private void onToggleSoftInput(int p0, int p1) {}
    void reportExtractedMovement(int p0, int p1) {}
    boolean doMovementKey(int p0, android.view.KeyEvent p1, int p2) { return false; }
    public void sendDownUpKeyEvents(int p0) {}
    public boolean sendDefaultEditorAction(boolean p0) { return false; }
    public void sendKeyChar(char p0) {}
    public void onExtractedSelectionChanged(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void onExtractedDeleteText(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void onExtractedReplaceText(int p0, int p1, java.lang.CharSequence p2) {}
    @android.annotation.UnsupportedAppUsage
    public void onExtractedSetSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    public void onExtractedTextClicked() {}
    public void onExtractedCursorMovement(int p0, int p1) {}
    public boolean onExtractTextContextMenuItem(int p0) { return false; }
    public java.lang.CharSequence getTextForImeAction(int p0) { return null; }
    private int getIconForImeAction(int p0) { return 0; }
    public void onUpdateExtractingVisibility(android.view.inputmethod.EditorInfo p0) {}
    public void onUpdateExtractingViews(android.view.inputmethod.EditorInfo p0) {}
    public void onExtractingInputChanged(android.view.inputmethod.EditorInfo p0) {}
    void startExtractingText(boolean p0) {}
    private void dispatchOnCurrentInputMethodSubtypeChanged(android.view.inputmethod.InputMethodSubtype p0) {}
    protected void onCurrentInputMethodSubtypeChanged(android.view.inputmethod.InputMethodSubtype p0) {}
    @java.lang.Deprecated
    public int getInputMethodWindowRecommendedHeight() { return 0; }
    public final void exposeContent(android.view.inputmethod.InputContentInfo p0, android.view.inputmethod.InputConnection p1) {}
    public final void notifyUserActionIfNecessary() {}
    private void exposeContentInternal(android.view.inputmethod.InputContentInfo p0, android.view.inputmethod.EditorInfo p1) {}
    private int mapToImeWindowStatus() { return 0; }
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private static final class SettingsObserver extends android.database.ContentObserver {
        private int mShowImeWithHardKeyboard;
        private final android.inputmethodservice.InputMethodService mService = null;
        private SettingsObserver(android.inputmethodservice.InputMethodService p0) { super(null); }
        public static android.inputmethodservice.InputMethodService.SettingsObserver createAndRegister(android.inputmethodservice.InputMethodService p0) { return null; }
        void unregister() {}
        @android.annotation.UnsupportedAppUsage
        private boolean shouldShowImeWithHardKeyboard() { return false; }
        public void onChange(boolean p0, android.net.Uri p1) {}
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface ShowImeWithHardKeyboardType {
            public static final int UNKNOWN = 0;
            public static final int FALSE = 1;
            public static final int TRUE = 2;
        }
    }

    public static final class Insets {
        public int contentTopInsets;
        public int visibleTopInsets;
        public final android.graphics.Region touchableRegion = null;
        public static final int TOUCHABLE_INSETS_FRAME = 0;
        public static final int TOUCHABLE_INSETS_CONTENT = 1;
        public static final int TOUCHABLE_INSETS_VISIBLE = 2;
        public static final int TOUCHABLE_INSETS_REGION = 3;
        public int touchableInsets;
        public Insets() {}
    }

    public class InputMethodSessionImpl extends android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl {
        public InputMethodSessionImpl(android.inputmethodservice.InputMethodService p0) { super(null); }
        public void finishInput() {}
        public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
        public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
        public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public void viewClicked(boolean p0) {}
        public void updateCursor(android.graphics.Rect p0) {}
        public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        public void toggleSoftInput(int p0, int p1) {}
        public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
        public final void notifyImeHidden() {}
    }

    public class InputMethodImpl extends android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl {
        public InputMethodImpl(android.inputmethodservice.InputMethodService p0) { super(null); }
        public final void initializeInternal(android.os.IBinder p0, int p1, com.android.internal.inputmethod.IInputMethodPrivilegedOperations p2) {}
        public void attachToken(android.os.IBinder p0) {}
        public void updateInputMethodDisplay(int p0) {}
        public void bindInput(android.view.inputmethod.InputBinding p0) {}
        public void unbindInput() {}
        public void startInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1) {}
        public void restartInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1) {}
        public final void dispatchStartInputWithToken(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2, android.os.IBinder p3, boolean p4) {}
        public void hideSoftInput(int p0, android.os.ResultReceiver p1) {}
        public void showSoftInput(int p0, android.os.ResultReceiver p1) {}
        public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackDispositionMode {
    }
}
