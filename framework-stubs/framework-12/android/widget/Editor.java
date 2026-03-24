package android.widget;

public class Editor {
    private static final java.lang.String TAG = "Editor";
    private static final boolean DEBUG_UNDO = false;
    private static final boolean FLAG_USE_MAGNIFIER = true;
    private static final int CURSOR_START_FLOAT_DISTANCE_PX = 20;
    private static final int DELAY_BEFORE_HANDLE_FADES_OUT = 4000;
    private static final int RECENT_CUT_COPY_DURATION_MS = 15000;
    static final int BLINK = 500;
    private static final int DRAG_SHADOW_MAX_TEXT_LENGTH = 20;
    private static final int UNSET_X_VALUE = -1;
    private static final int UNSET_LINE = -1;
    private static final java.lang.String UNDO_OWNER_TAG = "Editor";
    private static final int MENU_ITEM_ORDER_ASSIST = 0;
    private static final int MENU_ITEM_ORDER_UNDO = 2;
    private static final int MENU_ITEM_ORDER_REDO = 3;
    private static final int MENU_ITEM_ORDER_CUT = 4;
    private static final int MENU_ITEM_ORDER_COPY = 5;
    private static final int MENU_ITEM_ORDER_PASTE = 6;
    private static final int MENU_ITEM_ORDER_SHARE = 7;
    private static final int MENU_ITEM_ORDER_SELECT_ALL = 8;
    private static final int MENU_ITEM_ORDER_REPLACE = 9;
    private static final int MENU_ITEM_ORDER_AUTOFILL = 10;
    private static final int MENU_ITEM_ORDER_PASTE_AS_PLAIN_TEXT = 11;
    private static final int MENU_ITEM_ORDER_SECONDARY_ASSIST_ACTIONS_START = 50;
    private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
    private static final int FLAG_MISSPELLED_OR_GRAMMAR_ERROR = 10;
    private final android.widget.TextViewOnReceiveContentListener mDefaultOnReceiveContentListener = null;
    private final android.content.UndoManager mUndoManager = null;
    private android.content.UndoOwner mUndoOwner;
    final android.widget.Editor.UndoInputFilter mUndoInputFilter = null;
    boolean mAllowUndo;
    private final com.android.internal.logging.MetricsLogger mMetricsLogger = null;
    android.widget.Editor.InsertionPointCursorController mInsertionPointCursorController;
    android.widget.Editor.SelectionModifierCursorController mSelectionModifierCursorController;
    private android.view.ActionMode mTextActionMode;
    private boolean mInsertionControllerEnabled;
    private boolean mSelectionControllerEnabled;
    private final boolean mHapticTextHandleEnabled = false;
    private android.widget.Editor.MagnifierMotionAnimator mMagnifierAnimator;
    private final java.lang.Runnable mUpdateMagnifierRunnable = null;
    private final android.view.ViewTreeObserver.OnDrawListener mMagnifierOnDrawListener = null;
    private android.widget.Editor.CorrectionHighlighter mCorrectionHighlighter;
    private boolean mHasPendingRestartInputForSetText;
    android.widget.Editor.InputContentType mInputContentType;
    android.widget.Editor.InputMethodState mInputMethodState;
    private android.widget.Editor.TextRenderNode[] mTextRenderNodes;
    boolean mFrozenWithFocus;
    boolean mSelectionMoved;
    boolean mTouchFocusSelected;
    android.text.method.KeyListener mKeyListener;
    int mInputType;
    boolean mDiscardNextActionUp;
    boolean mIgnoreActionUpEvent;
    private long mShowCursor;
    private boolean mRenderCursorRegardlessTiming;
    private android.widget.Editor.Blink mBlink;
    private boolean mDrawCursorOnMagnifier;
    boolean mCursorVisible;
    boolean mSelectAllOnFocus;
    boolean mTextIsSelectable;
    java.lang.CharSequence mError;
    boolean mErrorWasChanged;
    private android.widget.Editor.ErrorPopup mErrorPopup;
    private boolean mShowErrorAfterAttach;
    boolean mInBatchEditControllers;
    boolean mShowSoftInputOnFocus;
    private boolean mPreserveSelection;
    private boolean mRestartActionModeOnNextRefresh;
    private boolean mRequestingLinkActionMode;
    private android.widget.SelectionActionModeHelper mSelectionActionModeHelper;
    boolean mIsBeingLongClicked;
    boolean mIsBeingLongClickedByAccessibility;
    private android.widget.Editor.SuggestionsPopupWindow mSuggestionsPopupWindow;
    android.text.style.SuggestionRangeSpan mSuggestionRangeSpan;
    private java.lang.Runnable mShowSuggestionRunnable;
    android.graphics.drawable.Drawable mDrawableForCursor;
    android.graphics.drawable.Drawable mSelectHandleLeft;
    android.graphics.drawable.Drawable mSelectHandleRight;
    android.graphics.drawable.Drawable mSelectHandleCenter;
    private android.widget.Editor.PositionListener mPositionListener;
    private float mContextMenuAnchorX;
    private float mContextMenuAnchorY;
    android.view.ActionMode.Callback mCustomSelectionActionModeCallback;
    android.view.ActionMode.Callback mCustomInsertionActionModeCallback;
    boolean mCreatedWithASelection;
    private int mLastButtonState;
    private final android.widget.EditorTouchState mTouchState = null;
    private java.lang.Runnable mInsertionActionModeRunnable;
    private android.widget.Editor.SpanController mSpanController;
    private android.text.method.WordIterator mWordIterator;
    android.widget.SpellChecker mSpellChecker;
    private android.text.method.WordIterator mWordIteratorWithText;
    private boolean mUpdateWordIteratorText;
    private android.graphics.Rect mTempRect;
    private final android.widget.TextView mTextView = null;
    final android.widget.Editor.ProcessTextIntentActionsHandler mProcessTextIntentActionsHandler = null;
    private final android.widget.Editor.CursorAnchorInfoNotifier mCursorAnchorInfoNotifier = null;
    private final java.lang.Runnable mShowFloatingToolbar = null;
    boolean mIsInsertionActionModeStartPending;
    private final android.widget.Editor.SuggestionHelper mSuggestionHelper = null;
    private boolean mFlagCursorDragFromAnywhereEnabled;
    private float mCursorDragDirectionMinXYRatio;
    private boolean mFlagInsertionHandleGesturesEnabled;
    private final boolean mNewMagnifierEnabled = false;
    private static final int MIN_LINE_HEIGHT_FOR_MAGNIFIER = 20;
    private static final int MAX_LINE_HEIGHT_FOR_MAGNIFIER = 32;
    private int mMinLineHeightForMagnifier;
    private int mMaxLineHeightForMagnifier;
    private float mInitialZoom;
    private final float mLineSlopRatio = 0.0f;
    private static final int LINE_CHANGE_SLOP_MAX_DP = 45;
    private static final int LINE_CHANGE_SLOP_MIN_DP = 8;
    private int mLineChangeSlopMax;
    private int mLineChangeSlopMin;
    static final int EXTRACT_NOTHING = -2;
    static final int EXTRACT_UNKNOWN = -1;
    private final android.view.MenuItem.OnMenuItemClickListener mOnContextMenuItemClickListener = null;
    public static final int HANDLE_TYPE_SELECTION_START = 0;
    public static final int HANDLE_TYPE_SELECTION_END = 1;
    Editor(android.widget.TextView p0) {}
    public boolean getFlagCursorDragFromAnywhereEnabled() { return false; }
    public void setFlagCursorDragFromAnywhereEnabled(boolean p0) {}
    public void setCursorDragMinAngleFromVertical(int p0) {}
    public boolean getFlagInsertionHandleGesturesEnabled() { return false; }
    public void setFlagInsertionHandleGesturesEnabled(boolean p0) {}
    private android.widget.Editor.MagnifierMotionAnimator getMagnifierAnimator() { return null; }
    private android.widget.Magnifier.Builder createBuilderWithInlineMagnifierDefaults() { return null; }
    android.os.ParcelableParcel saveInstanceState() { return null; }
    void restoreInstanceState(android.os.ParcelableParcel p0) {}
    public android.widget.TextViewOnReceiveContentListener getDefaultOnReceiveContentListener() { return null; }
    void forgetUndoRedo() {}
    boolean canUndo() { return false; }
    boolean canRedo() { return false; }
    void undo() {}
    void redo() {}
    void replace() {}
    void onAttachedToWindow() {}
    void onDetachedFromWindow() {}
    private void discardTextDisplayLists() {}
    private void showError() {}
    public void setError(java.lang.CharSequence p0, android.graphics.drawable.Drawable p1) {}
    private void setErrorIcon(android.graphics.drawable.Drawable p0) {}
    private void hideError() {}
    private int getErrorX() { return 0; }
    private int getErrorY() { return 0; }
    void createInputContentTypeIfNeeded() {}
    void createInputMethodStateIfNeeded() {}
    private boolean isCursorVisible() { return false; }
    boolean shouldRenderCursor() { return false; }
    void prepareCursorControllers() {}
    void hideInsertionPointCursorController() {}
    void hideCursorAndSpanControllers() {}
    private void hideSpanControllers() {}
    private void hideCursorControllers() {}
    private void updateSpellCheckSpans(int p0, int p1, boolean p2) {}
    void onScreenStateChanged(int p0) {}
    private void suspendBlink() {}
    private void resumeBlink() {}
    void adjustInputType(boolean p0, boolean p1, boolean p2, boolean p3) {}
    private void chooseSize(android.widget.PopupWindow p0, java.lang.CharSequence p1, android.widget.TextView p2) {}
    void setFrame() {}
    private int getWordStart(int p0) { return 0; }
    private int getWordEnd(int p0) { return 0; }
    private boolean needsToSelectAllToSelectWordOrParagraph() { return false; }
    boolean selectCurrentWord() { return false; }
    private boolean selectCurrentParagraph() { return false; }
    private long getParagraphsRange(int p0, int p1) { return 0L; }
    void onLocaleChanged() {}
    public android.text.method.WordIterator getWordIterator() { return null; }
    private android.text.method.WordIterator getWordIteratorWithText() { return null; }
    private int getNextCursorOffset(int p0, boolean p1) { return 0; }
    private long getCharClusterRange(int p0) { return 0L; }
    private boolean touchPositionIsInSelection() { return false; }
    private android.widget.Editor.PositionListener getPositionListener() { return null; }
    private boolean isOffsetVisible(int p0) { return false; }
    private boolean isPositionOnText(float p0, float p1) { return false; }
    private void startDragAndDrop() {}
    public boolean performLongClick(boolean p0) { return false; }
    private void toggleInsertionActionMode() {}
    float getLastUpPositionX() { return 0.0f; }
    float getLastUpPositionY() { return 0.0f; }
    private long getLastTouchOffsets() { return 0L; }
    void onFocusChanged(boolean p0, int p1) {}
    private void ensureNoSelectionIfNonSelectable() {}
    private void downgradeEasyCorrectionSpans() {}
    void sendOnTextChanged(int p0, int p1, int p2) {}
    private int getLastTapPosition() { return 0; }
    void onWindowFocusChanged(boolean p0) {}
    private boolean shouldFilterOutTouchEvent(android.view.MotionEvent p0) { return false; }
    public void onTouchEvent(android.view.MotionEvent p0) {}
    private void updateFloatingToolbarVisibility(android.view.MotionEvent p0) {}
    void hideFloatingToolbar(int p0) {}
    private void showFloatingToolbar() {}
    private android.view.inputmethod.InputMethodManager getInputMethodManager() { return null; }
    public void beginBatchEdit() {}
    public void endBatchEdit() {}
    void ensureEndedBatchEdit() {}
    void finishBatchEdit(android.widget.Editor.InputMethodState p0) {}
    void scheduleRestartInputForSetText() {}
    void maybeFireScheduledRestartInputForSetText() {}
    boolean extractText(android.view.inputmethod.ExtractedTextRequest p0, android.view.inputmethod.ExtractedText p1) { return false; }
    private boolean extractTextInternal(android.view.inputmethod.ExtractedTextRequest p0, int p1, int p2, int p3, android.view.inputmethod.ExtractedText p4) { return false; }
    boolean reportExtractedText() { return false; }
    private void sendUpdateSelection() {}
    void onDraw(android.graphics.Canvas p0, android.text.Layout p1, android.graphics.Path p2, android.graphics.Paint p3, int p4) {}
    private void drawHardwareAccelerated(android.graphics.Canvas p0, android.text.Layout p1, android.graphics.Path p2, android.graphics.Paint p3, int p4) {}
    private int drawHardwareAcceleratedInner(android.graphics.Canvas p0, android.text.Layout p1, android.graphics.Path p2, android.graphics.Paint p3, int p4, int[] p5, int[] p6, int p7, int p8, int p9) { return 0; }
    private int getAvailableDisplayListIndex(int[] p0, int p1, int p2) { return 0; }
    private void drawCursor(android.graphics.Canvas p0, int p1) {}
    void invalidateHandlesAndActionMode() {}
    void invalidateTextDisplayList(android.text.Layout p0, int p1, int p2) {}
    void invalidateTextDisplayList() {}
    void updateCursorPosition() {}
    void refreshTextActionMode() {}
    void startInsertionActionMode() {}
    android.widget.TextView getTextView() { return null; }
    android.view.ActionMode getTextActionMode() { return null; }
    void setRestartActionModeOnNextRefresh(boolean p0) {}
    void startSelectionActionModeAsync(boolean p0) {}
    void startLinkActionModeAsync(int p0, int p1) {}
    void invalidateActionModeAsync() {}
    private void invalidateActionMode() {}
    private android.widget.SelectionActionModeHelper getSelectionActionModeHelper() { return null; }
    private boolean selectCurrentWordAndStartDrag() { return false; }
    boolean checkField() { return false; }
    boolean startActionModeInternal(int p0) { return false; }
    private boolean extractedTextModeWillBeStarted() { return false; }
    private boolean shouldOfferToShowSuggestions() { return false; }
    private boolean isCursorInsideEasyCorrectionSpan() { return false; }
    void onTouchUpEvent(android.view.MotionEvent p0) {}
    final void onTextOperationUserChanged() {}
    protected void stopTextActionMode() {}
    private void stopTextActionModeWithPreservingSelection() {}
    boolean hasInsertionController() { return false; }
    boolean hasSelectionController() { return false; }
    public android.widget.Editor.InsertionPointCursorController getInsertionController() { return null; }
    public android.widget.Editor.SelectionModifierCursorController getSelectionController() { return null; }
    public android.graphics.drawable.Drawable getCursorDrawable() { return null; }
    private void updateCursorPosition(int p0, int p1, float p2) {}
    private int clampHorizontalPosition(android.graphics.drawable.Drawable p0, float p1) { return 0; }
    public void onCommitCorrection(android.view.inputmethod.CorrectionInfo p0) {}
    void onScrollChanged() {}
    private boolean shouldBlink() { return false; }
    void makeBlink() {}
    private android.view.View.DragShadowBuilder getTextThumbnailBuilder(int p0, int p1) { return null; }
    void onDrop(android.view.DragEvent p0) {}
    private void deleteSourceAfterLocalDrop(android.widget.Editor.DragLocalState p0, int p1, int p2) {}
    public void addSpanWatchers(android.text.Spannable p0) {}
    void setContextMenuAnchor(float p0, float p1) {}
    void onCreateContextMenu(android.view.ContextMenu p0) {}
    private android.text.style.SuggestionSpan findEquivalentSuggestionSpan(android.widget.Editor.SuggestionSpanInfo p0) { return null; }
    private void replaceWithSuggestion(android.widget.Editor.SuggestionInfo p0) {}
    public void setLineChangeSlopMinMaxForTesting(int p0, int p1) {}
    public int getCurrentLineAdjustedForSlop(android.text.Layout p0, int p1, float p2) { return 0; }
    void loadCursorDrawable() {}
    void loadHandleDrawables(boolean p0) {}
    private static boolean isValidRange(java.lang.CharSequence p0, int p1, int p2) { return false; }
    static void logCursor(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) {}

    private class Blink implements java.lang.Runnable {
        private boolean mCancelled;
        private Blink(android.widget.Editor p0) {}
        public void run() {}
        void cancel() {}
        void uncancel() {}
    }

    private class CorrectionHighlighter {
        private final android.graphics.Path mPath = null;
        private final android.graphics.Paint mPaint = null;
        private int mStart;
        private int mEnd;
        private long mFadingStartTime;
        private android.graphics.RectF mTempRectF;
        private static final int FADE_OUT_DURATION = 400;
        public CorrectionHighlighter(android.widget.Editor p0) {}
        public void highlight(android.view.inputmethod.CorrectionInfo p0) {}
        public void draw(android.graphics.Canvas p0, int p1) {}
        private boolean updatePaint() { return false; }
        private boolean updatePath() { return false; }
        private void invalidate(boolean p0) {}
        private void stopAnimation() {}
    }

    private final class CursorAnchorInfoNotifier implements android.widget.Editor.TextViewPositionListener {
        final android.view.inputmethod.CursorAnchorInfo.Builder mSelectionInfoBuilder = null;
        final int[] mTmpIntOffset = null;
        final android.graphics.Matrix mViewToScreenMatrix = null;
        private CursorAnchorInfoNotifier(android.widget.Editor p0) {}
        public void updatePosition(int p0, int p1, boolean p2, boolean p3) {}
    }

    private static interface CursorController extends android.view.ViewTreeObserver.OnTouchModeChangeListener {
        public void show();
        public void hide();
        public void onDetached();
        public boolean isCursorBeingModified();
        public boolean isActive();
    }

    private static class DragLocalState {
        public android.widget.TextView sourceTextView;
        public int start;
        public int end;
        public DragLocalState(android.widget.TextView p0, int p1, int p2) {}
    }

    private static interface EasyEditDeleteListener {
        public void onDeleteClick(android.text.style.EasyEditSpan p0);
    }

    private class EasyEditPopupWindow extends android.widget.Editor.PinnedPopupWindow implements android.view.View.OnClickListener {
        private static final int POPUP_TEXT_LAYOUT = 17367333;
        private android.widget.TextView mDeleteTextView;
        private android.text.style.EasyEditSpan mEasyEditSpan;
        private android.widget.Editor.EasyEditDeleteListener mOnDeleteListener;
        private EasyEditPopupWindow(android.widget.Editor p0) { super(null); }
        protected void createPopupWindow() {}
        protected void initContentView() {}
        public void setEasyEditSpan(android.text.style.EasyEditSpan p0) {}
        private void setOnDeleteListener(android.widget.Editor.EasyEditDeleteListener p0) {}
        public void onClick(android.view.View p0) {}
        public void hide() {}
        protected int getTextOffset() { return 0; }
        protected int getVerticalLocalPosition(int p0) { return 0; }
        protected int clipVertically(int p0) { return 0; }
    }

    public static class EditOperation extends android.content.UndoOperation<android.widget.Editor> {
        private static final int TYPE_INSERT = 0;
        private static final int TYPE_DELETE = 1;
        private static final int TYPE_REPLACE = 2;
        private int mType;
        private java.lang.String mOldText;
        private java.lang.String mNewText;
        private int mStart;
        private int mOldCursorPos;
        private int mNewCursorPos;
        private boolean mFrozen;
        private boolean mIsComposition;
        public static final android.os.Parcelable.ClassLoaderCreator<android.widget.Editor.EditOperation> CREATOR = null;
        public EditOperation(android.widget.Editor p0, java.lang.String p1, int p2, java.lang.String p3, boolean p4) { super((android.content.UndoOwner)null); }
        public EditOperation(android.os.Parcel p0, java.lang.ClassLoader p1) { super((android.content.UndoOwner)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private int getNewTextEnd() { return 0; }
        private int getOldTextEnd() { return 0; }
        public void commit() {}
        public void undo() {}
        public void redo() {}
        private boolean mergeWith(android.widget.Editor.EditOperation p0) { return false; }
        private boolean mergeInsertWith(android.widget.Editor.EditOperation p0) { return false; }
        private boolean mergeDeleteWith(android.widget.Editor.EditOperation p0) { return false; }
        private boolean mergeReplaceWith(android.widget.Editor.EditOperation p0) { return false; }
        public void forceMergeWith(android.widget.Editor.EditOperation p0) {}
        private static void modifyText(android.text.Editable p0, int p1, int p2, java.lang.CharSequence p3, int p4, int p5) {}
        private java.lang.String getTypeString() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class ErrorPopup extends android.widget.PopupWindow {
        private boolean mAbove;
        private final android.widget.TextView mView = null;
        private int mPopupInlineErrorBackgroundId;
        private int mPopupInlineErrorAboveBackgroundId;
        ErrorPopup(android.widget.TextView p0, int p1, int p2) { super(); }
        void fixDirection(boolean p0) {}
        private int getResourceId(int p0, int p1) { return 0; }
        public void update(int p0, int p1, int p2, int p3, boolean p4) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HandleType {
    }

    public abstract class HandleView extends android.view.View implements android.widget.Editor.TextViewPositionListener {
        protected android.graphics.drawable.Drawable mDrawable;
        protected android.graphics.drawable.Drawable mDrawableLtr;
        protected android.graphics.drawable.Drawable mDrawableRtl;
        private final android.widget.PopupWindow mContainer = null;
        private int mPositionX;
        private int mPositionY;
        private boolean mIsDragging;
        private float mTouchToWindowOffsetX;
        private float mTouchToWindowOffsetY;
        protected int mHotspotX;
        protected int mHorizontalGravity;
        private float mTouchOffsetY;
        private final float mIdealVerticalOffset = 0.0f;
        private int mLastParentX;
        private int mLastParentY;
        private int mLastParentXOnScreen;
        private int mLastParentYOnScreen;
        protected int mPreviousOffset;
        private boolean mPositionHasChanged;
        private int mMinSize;
        protected int mPrevLine;
        protected int mPreviousLineTouched;
        private float mCurrentDragInitialTouchRawX;
        private float mTextViewScaleX;
        private float mTextViewScaleY;
        private final int mIdealFingerToCursorOffset = 0;
        private static final int HISTORY_SIZE = 5;
        private static final int TOUCH_UP_FILTER_DELAY_AFTER = 150;
        private static final int TOUCH_UP_FILTER_DELAY_BEFORE = 350;
        private final long[] mPreviousOffsetsTimes = null;
        private final int[] mPreviousOffsets = null;
        private int mPreviousOffsetIndex;
        private int mNumberPreviousOffsets;
        private HandleView(android.widget.Editor p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, int p3) { super((android.content.Context)null); }
        public float getIdealVerticalOffset() { return 0.0f; }
        final int getIdealFingerToCursorOffset() { return 0; }
        void setDrawables(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) {}
        protected void updateDrawable(boolean p0) {}
        protected abstract int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1);
        protected abstract int getHorizontalGravity(boolean p0);
        private void startTouchUpFilter(int p0) {}
        private void addPositionToTouchUpFilter(int p0) {}
        private void filterOnTouchUp(boolean p0) {}
        public boolean offsetHasBeenChanged() { return false; }
        protected void onMeasure(int p0, int p1) {}
        public void invalidate() {}
        protected final int getPreferredWidth() { return 0; }
        protected final int getPreferredHeight() { return 0; }
        public void show() {}
        protected void dismiss() {}
        public void hide() {}
        public boolean isShowing() { return false; }
        private boolean shouldShow() { return false; }
        private void setVisible(boolean p0) {}
        public abstract int getCurrentCursorOffset();
        protected abstract void updateSelection(int p0);
        protected abstract void updatePosition(float p0, float p1, boolean p2);
        protected abstract int getMagnifierHandleTrigger();
        protected boolean isAtRtlRun(android.text.Layout p0, int p1) { return false; }
        public float getHorizontal(android.text.Layout p0, int p1) { return 0.0f; }
        protected int getOffsetAtCoordinate(android.text.Layout p0, int p1, float p2) { return 0; }
        protected void positionAtCursorOffset(int p0, boolean p1, boolean p2) {}
        int getCursorHorizontalPosition(android.text.Layout p0, int p1) { return 0; }
        public void updatePosition(int p0, int p1, boolean p2, boolean p3) {}
        protected void onDraw(android.graphics.Canvas p0) {}
        private int getHorizontalOffset() { return 0; }
        protected int getCursorOffset() { return 0; }
        private boolean tooLargeTextForMagnifier() { return false; }
        private boolean checkForTransforms() { return false; }
        private boolean obtainMagnifierShowCoordinates(android.view.MotionEvent p0, android.graphics.PointF p1) { return false; }
        private boolean handleOverlapsMagnifier(android.widget.Editor.HandleView p0, android.graphics.Rect p1) { return false; }
        private android.widget.Editor.HandleView getOtherSelectionHandle() { return null; }
        private void updateHandlesVisibility() {}
        protected final void updateMagnifier(android.view.MotionEvent p0) {}
        protected final void dismissMagnifier() {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public boolean isDragging() { return false; }
        void onHandleMoved() {}
        public void onDetached() {}
        protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    }

    static class InputContentType {
        int imeOptions;
        java.lang.String privateImeOptions;
        java.lang.CharSequence imeActionLabel;
        int imeActionId;
        android.os.Bundle extras;
        android.widget.TextView.OnEditorActionListener onEditorActionListener;
        boolean enterDown;
        android.os.LocaleList imeHintLocales;
        InputContentType() {}
    }

    static class InputMethodState {
        android.view.inputmethod.ExtractedTextRequest mExtractedTextRequest;
        final android.view.inputmethod.ExtractedText mExtractedText = null;
        int mBatchEditNesting;
        boolean mCursorChanged;
        boolean mSelectionModeChanged;
        boolean mContentChanged;
        int mChangedStart;
        int mChangedEnd;
        int mChangedDelta;
        InputMethodState() {}
    }

    private class InsertionHandleView extends android.widget.Editor.HandleView {
        private float mLastDownRawX;
        private float mLastDownRawY;
        private java.lang.Runnable mHider;
        private boolean mIsTouchDown;
        private boolean mPendingDismissOnUp;
        private final int mDrawableOpacity = 0;
        private float mTouchDownX;
        private float mTouchDownY;
        private int mOffsetDown;
        private boolean mOffsetChanged;
        private boolean mIsInActionMode;
        private long mLastUpTime;
        private final int mDeltaHeight = 0;
        InsertionHandleView(android.widget.Editor p0, android.graphics.drawable.Drawable p1) { super(null, null, null, 0); }
        private void hideAfterDelay() {}
        private void removeHiderCallback() {}
        protected int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1) { return 0; }
        protected int getHorizontalGravity(boolean p0) { return 0; }
        protected int getCursorOffset() { return 0; }
        int getCursorHorizontalPosition(android.text.Layout p0, int p1) { return 0; }
        protected void onMeasure(int p0, int p1) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        private boolean touchThrough(android.view.MotionEvent p0) { return false; }
        private android.view.MotionEvent transformEventForTouchThrough(android.view.MotionEvent p0) { return null; }
        public boolean isShowing() { return false; }
        public void show() {}
        public void dismiss() {}
        protected void updateDrawable(boolean p0) {}
        public int getCurrentCursorOffset() { return 0; }
        public void updateSelection(int p0) {}
        protected void updatePosition(float p0, float p1, boolean p2) {}
        void onHandleMoved() {}
        public void onDetached() {}
        protected int getMagnifierHandleTrigger() { return 0; }
    }

    public class InsertionPointCursorController implements android.widget.Editor.CursorController {
        private android.widget.Editor.InsertionHandleView mHandle;
        private boolean mIsDraggingCursor;
        private boolean mIsTouchSnappedToHandleDuringDrag;
        private int mPrevLineDuringDrag;
        public InsertionPointCursorController(android.widget.Editor p0) {}
        public void onTouchEvent(android.view.MotionEvent p0) {}
        private void positionCursorDuringDrag(android.view.MotionEvent p0) {}
        private int getLineDuringDrag(android.view.MotionEvent p0) { return 0; }
        private void startCursorDrag(android.view.MotionEvent p0) {}
        private void performCursorDrag(android.view.MotionEvent p0) {}
        private void endCursorDrag(android.view.MotionEvent p0) {}
        public void show() {}
        public void hide() {}
        public void onTouchModeChanged(boolean p0) {}
        public android.widget.Editor.InsertionHandleView getHandle() { return null; }
        private void reloadHandleDrawable() {}
        public void onDetached() {}
        public boolean isCursorBeingModified() { return false; }
        public boolean isActive() { return false; }
        public void invalidateHandle() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface MagnifierHandleTrigger {
        public static final int INSERTION = 0;
        public static final int SELECTION_START = 1;
        public static final int SELECTION_END = 2;
    }

    private static class MagnifierMotionAnimator {
        private static final long DURATION = 100L;
        private final android.widget.Magnifier mMagnifier = null;
        private final android.animation.ValueAnimator mAnimator = null;
        private boolean mMagnifierIsShowing;
        private float mAnimationStartX;
        private float mAnimationStartY;
        private float mAnimationCurrentX;
        private float mAnimationCurrentY;
        private float mLastX;
        private float mLastY;
        private MagnifierMotionAnimator(android.widget.Magnifier p0) {}
        private void show(float p0, float p1) {}
        private void update() {}
        private void dismiss() {}
    }

    private abstract class PinnedPopupWindow implements android.widget.Editor.TextViewPositionListener {
        protected android.widget.PopupWindow mPopupWindow;
        protected android.view.ViewGroup mContentView;
        int mPositionX;
        int mPositionY;
        int mClippingLimitLeft;
        int mClippingLimitRight;
        protected abstract void createPopupWindow();
        protected abstract void initContentView();
        protected abstract int getTextOffset();
        protected abstract int getVerticalLocalPosition(int p0);
        protected abstract int clipVertically(int p0);
        protected void setUp() {}
        public PinnedPopupWindow(android.widget.Editor p0) {}
        public void show() {}
        protected void measureContent() {}
        private void computeLocalPosition() {}
        private void updatePosition(int p0, int p1) {}
        public void hide() {}
        public void updatePosition(int p0, int p1, boolean p2, boolean p3) {}
        public boolean isShowing() { return false; }
    }

    private class PositionListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        private static final int MAXIMUM_NUMBER_OF_LISTENERS = 7;
        private android.widget.Editor.TextViewPositionListener[] mPositionListeners;
        private boolean[] mCanMove;
        private boolean mPositionHasChanged;
        private int mPositionX;
        private int mPositionY;
        private int mPositionXOnScreen;
        private int mPositionYOnScreen;
        private int mNumberOfListeners;
        private boolean mScrollHasChanged;
        final int[] mTempCoords = null;
        private PositionListener(android.widget.Editor p0) {}
        public void addSubscriber(android.widget.Editor.TextViewPositionListener p0, boolean p1) {}
        public void removeSubscriber(android.widget.Editor.TextViewPositionListener p0) {}
        public int getPositionX() { return 0; }
        public int getPositionY() { return 0; }
        public int getPositionXOnScreen() { return 0; }
        public int getPositionYOnScreen() { return 0; }
        public boolean onPreDraw() { return false; }
        private void updatePosition() {}
        public void onScrollChanged() {}
    }

    static final class ProcessTextIntentActionsHandler {
        private final android.widget.Editor mEditor = null;
        private final android.widget.TextView mTextView = null;
        private final android.content.Context mContext = null;
        private final android.content.pm.PackageManager mPackageManager = null;
        private final java.lang.String mPackageName = null;
        private final android.util.SparseArray<android.content.Intent> mAccessibilityIntents = null;
        private final android.util.SparseArray<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> mAccessibilityActions = null;
        private final java.util.List<android.content.pm.ResolveInfo> mSupportedActivities = null;
        private ProcessTextIntentActionsHandler(android.widget.Editor p0) {}
        public void onInitializeMenu(android.view.Menu p0) {}
        public boolean performMenuItemAction(android.view.MenuItem p0) { return false; }
        public void initializeAccessibilityActions() {}
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
        public boolean performAccessibilityAction(int p0) { return false; }
        private boolean fireIntent(android.content.Intent p0) { return false; }
        private void loadSupportedActivities() {}
        private boolean isSupportedActivity(android.content.pm.ResolveInfo p0) { return false; }
        private android.content.Intent createProcessTextIntentForResolveInfo(android.content.pm.ResolveInfo p0) { return null; }
        private android.content.Intent createProcessTextIntent() { return null; }
        private java.lang.CharSequence getLabel(android.content.pm.ResolveInfo p0) { return null; }
    }

    public final class SelectionHandleView extends android.widget.Editor.HandleView {
        private final int mHandleType = 0;
        private boolean mInWord;
        private float mTouchWordDelta;
        private float mPrevX;
        private boolean mLanguageDirectionChanged;
        private final float mTextViewEdgeSlop = 0.0f;
        private final int[] mTextViewLocation = null;
        public SelectionHandleView(android.widget.Editor p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, int p3, int p4) { super(null, null, null, 0); }
        private boolean isStartHandle() { return false; }
        protected int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1) { return 0; }
        protected int getHorizontalGravity(boolean p0) { return 0; }
        public int getCurrentCursorOffset() { return 0; }
        protected void updateSelection(int p0) {}
        protected void updatePosition(float p0, float p1, boolean p2) {}
        protected void positionAtCursorOffset(int p0, boolean p1, boolean p2) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        private void positionAndAdjustForCrossingHandles(int p0, boolean p1) {}
        private boolean positionNearEdgeOfScrollingView(float p0, boolean p1) { return false; }
        protected boolean isAtRtlRun(android.text.Layout p0, int p1) { return false; }
        public float getHorizontal(android.text.Layout p0, int p1) { return 0.0f; }
        private float getHorizontal(android.text.Layout p0, int p1, boolean p2) { return 0.0f; }
        protected int getOffsetAtCoordinate(android.text.Layout p0, int p1, float p2) { return 0; }
        protected int getMagnifierHandleTrigger() { return 0; }
    }

    public class SelectionModifierCursorController implements android.widget.Editor.CursorController {
        private android.widget.Editor.SelectionHandleView mStartHandle;
        private android.widget.Editor.SelectionHandleView mEndHandle;
        private int mMinTouchOffset;
        private int mMaxTouchOffset;
        private boolean mGestureStayedInTapRegion;
        private int mStartOffset;
        private boolean mHaventMovedEnoughToStartDrag;
        private int mLineSelectionIsOn;
        private boolean mSwitchedLines;
        private int mDragAcceleratorMode;
        private static final int DRAG_ACCELERATOR_MODE_INACTIVE = 0;
        private static final int DRAG_ACCELERATOR_MODE_CHARACTER = 1;
        private static final int DRAG_ACCELERATOR_MODE_WORD = 2;
        private static final int DRAG_ACCELERATOR_MODE_PARAGRAPH = 3;
        SelectionModifierCursorController(android.widget.Editor p0) {}
        public void show() {}
        private void initHandles() {}
        private void reloadHandleDrawables() {}
        public void hide() {}
        public void enterDrag(int p0) {}
        public void onTouchEvent(android.view.MotionEvent p0) {}
        private void updateSelection(android.view.MotionEvent p0) {}
        private boolean selectCurrentParagraphAndStartDrag() { return false; }
        private void updateCharacterBasedSelection(android.view.MotionEvent p0) {}
        private void updateWordBasedSelection(android.view.MotionEvent p0) {}
        private void updateParagraphBasedSelection(android.view.MotionEvent p0) {}
        private void updateSelectionInternal(int p0, int p1, boolean p2) {}
        private void updateMinAndMaxOffsets(android.view.MotionEvent p0) {}
        public int getMinTouchOffset() { return 0; }
        public int getMaxTouchOffset() { return 0; }
        public void resetTouchOffsets() {}
        private void resetDragAcceleratorState() {}
        public boolean isSelectionStartDragged() { return false; }
        public boolean isCursorBeingModified() { return false; }
        public boolean isDragAcceleratorActive() { return false; }
        public void onTouchModeChanged(boolean p0) {}
        public void onDetached() {}
        public boolean isActive() { return false; }
        public void invalidateHandles() {}
    }

    private class SpanController implements android.text.SpanWatcher {
        private static final int DISPLAY_TIMEOUT_MS = 3000;
        private android.widget.Editor.EasyEditPopupWindow mPopupWindow;
        private java.lang.Runnable mHidePopup;
        private SpanController(android.widget.Editor p0) {}
        private boolean isNonIntermediateSelectionSpan(android.text.Spannable p0, java.lang.Object p1) { return false; }
        public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
        public void hide() {}
        private void sendEasySpanNotification(int p0, android.text.style.EasyEditSpan p1) {}
    }

    private class SuggestionHelper {
        private final java.util.Comparator<android.text.style.SuggestionSpan> mSuggestionSpanComparator = null;
        private final java.util.HashMap<android.text.style.SuggestionSpan, java.lang.Integer> mSpansLengths = null;
        private SuggestionHelper(android.widget.Editor p0) {}
        private android.text.style.SuggestionSpan[] getSortedSuggestionSpans() { return null; }
        public int getSuggestionInfo(android.widget.Editor.SuggestionInfo[] p0, android.widget.Editor.SuggestionSpanInfo p1) { return 0; }

        private class SuggestionSpanComparator implements java.util.Comparator<android.text.style.SuggestionSpan> {
            private SuggestionSpanComparator(android.widget.Editor.SuggestionHelper p0) {}
            public int compare(android.text.style.SuggestionSpan p0, android.text.style.SuggestionSpan p1) { return 0; }
            private int compareFlag(int p0, int p1, int p2) { return 0; }
        }
    }

    private static final class SuggestionInfo {
        int mSuggestionStart;
        int mSuggestionEnd;
        final android.widget.Editor.SuggestionSpanInfo mSuggestionSpanInfo = null;
        int mSuggestionIndex;
        final android.text.SpannableStringBuilder mText = null;
        private SuggestionInfo() {}
        void clear() {}
        void setSpanInfo(android.text.style.SuggestionSpan p0, int p1, int p2) {}
    }

    private static final class SuggestionSpanInfo {
        android.text.style.SuggestionSpan mSuggestionSpan;
        int mSpanStart;
        int mSpanEnd;
        private SuggestionSpanInfo() {}
        void clear() {}
    }

    private final class SuggestionsPopupWindow extends android.widget.Editor.PinnedPopupWindow implements android.widget.AdapterView.OnItemClickListener {
        private static final int MAX_NUMBER_SUGGESTIONS = 5;
        private static final java.lang.String USER_DICTIONARY_EXTRA_WORD = "word";
        private static final java.lang.String USER_DICTIONARY_EXTRA_LOCALE = "locale";
        private android.widget.Editor.SuggestionInfo[] mSuggestionInfos;
        private int mNumberOfSuggestions;
        private boolean mCursorWasVisibleBeforeSuggestions;
        private boolean mIsShowingUp;
        private android.widget.Editor.SuggestionsPopupWindow.SuggestionAdapter mSuggestionsAdapter;
        private android.text.style.TextAppearanceSpan mHighlightSpan;
        private android.widget.TextView mAddToDictionaryButton;
        private android.widget.TextView mDeleteButton;
        private android.widget.ListView mSuggestionListView;
        private final android.widget.Editor.SuggestionSpanInfo mMisspelledSpanInfo = null;
        private int mContainerMarginWidth;
        private int mContainerMarginTop;
        private android.widget.LinearLayout mContainerView;
        private android.content.Context mContext;
        public SuggestionsPopupWindow(android.widget.Editor p0) { super(null); }
        protected void setUp() {}
        private android.content.Context applyDefaultTheme(android.content.Context p0) { return null; }
        protected void createPopupWindow() {}
        protected void initContentView() {}
        public boolean isShowingUp() { return false; }
        public void onParentLostFocus() {}
        public void show() {}
        protected void measureContent() {}
        protected int getTextOffset() { return 0; }
        protected int getVerticalLocalPosition(int p0) { return 0; }
        protected int clipVertically(int p0) { return 0; }
        private void hideWithCleanUp() {}
        private boolean updateSuggestions() { return false; }
        private void highlightTextDifferences(android.widget.Editor.SuggestionInfo p0, int p1, int p2) {}
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}

        private class CustomPopupWindow extends android.widget.PopupWindow {
            private CustomPopupWindow(android.widget.Editor.SuggestionsPopupWindow p0) { super(); }
            public void dismiss() {}
        }

        private class SuggestionAdapter extends android.widget.BaseAdapter {
            private android.view.LayoutInflater mInflater;
            private SuggestionAdapter(android.widget.Editor.SuggestionsPopupWindow p0) { super(); }
            public int getCount() { return 0; }
            public java.lang.Object getItem(int p0) { return null; }
            public long getItemId(int p0) { return 0L; }
            public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        }
    }

    static @interface TextActionMode {
        public static final int SELECTION = 0;
        public static final int INSERTION = 1;
        public static final int TEXT_LINK = 2;
    }

    private class TextActionModeCallback extends android.view.ActionMode.Callback2 {
        private final android.graphics.Path mSelectionPath = null;
        private final android.graphics.RectF mSelectionBounds = null;
        private final boolean mHasSelection = false;
        private final int mHandleHeight = 0;
        private final java.util.Map<android.view.MenuItem, android.view.View.OnClickListener> mAssistClickHandlers = null;
        private android.view.textclassifier.TextClassification mPrevTextClassification;
        TextActionModeCallback(android.widget.Editor p0, int p1) { super(); }
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        private android.view.ActionMode.Callback getCustomCallback() { return null; }
        private void populateMenuWithItems(android.view.Menu p0) {}
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        private void updateSelectAllItem(android.view.Menu p0) {}
        private void updateReplaceItem(android.view.Menu p0) {}
        private void updateAssistMenuItems(android.view.Menu p0) {}
        private android.view.MenuItem addAssistMenuItem(android.view.Menu p0, android.app.RemoteAction p1, int p2, int p3, int p4) { return null; }
        private void clearAssistMenuItems(android.view.Menu p0) {}
        private boolean hasLegacyAssistItem(android.view.textclassifier.TextClassification p0) { return false; }
        private boolean onAssistMenuItemClicked(android.view.MenuItem p0) { return false; }
        private int createAssistMenuItemPendingIntentRequestCode() { return 0; }
        private boolean shouldEnableAssistMenuItems() { return false; }
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
        public void onDestroyActionMode(android.view.ActionMode p0) {}
        public void onGetContentRect(android.view.ActionMode p0, android.view.View p1, android.graphics.Rect p2) {}
    }

    private static class TextRenderNode {
        android.graphics.RenderNode renderNode;
        boolean isDirty;
        boolean needsToBeShifted;
        public TextRenderNode(java.lang.String p0) {}
        boolean needsRecord() { return false; }
    }

    private static interface TextViewPositionListener {
        public void updatePosition(int p0, int p1, boolean p2, boolean p3);
    }

    public static class UndoInputFilter implements android.text.InputFilter {
        private final android.widget.Editor mEditor = null;
        private boolean mIsUserEdit;
        private boolean mHasComposition;
        private boolean mExpanding;
        private boolean mPreviousOperationWasInSameBatchEdit;
        private static final int MERGE_EDIT_MODE_FORCE_MERGE = 0;
        private static final int MERGE_EDIT_MODE_NEVER_MERGE = 1;
        private static final int MERGE_EDIT_MODE_NORMAL = 2;
        public UndoInputFilter(android.widget.Editor p0) {}
        public void saveInstanceState(android.os.Parcel p0) {}
        public void restoreInstanceState(android.os.Parcel p0) {}
        public void beginBatchEdit() {}
        public void endBatchEdit() {}
        public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
        void freezeLastEdit() {}
        private void handleEdit(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5, boolean p6) {}
        private android.widget.Editor.EditOperation getLastEdit() { return null; }
        private void recordEdit(android.widget.Editor.EditOperation p0, int p1) {}
        private boolean canUndoEdit(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return false; }
        private static boolean isComposition(java.lang.CharSequence p0) { return false; }
        private boolean isInTextWatcher() { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface MergeMode {
        }
    }
}
