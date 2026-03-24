package android.widget;

public class Editor {
    static final int BLINK = 500;
    final android.widget.Editor.UndoInputFilter mUndoInputFilter = null;
    boolean mAllowUndo;
    android.widget.Editor.InsertionPointCursorController mInsertionPointCursorController;
    android.widget.Editor.SelectionModifierCursorController mSelectionModifierCursorController;
    android.widget.Editor.InputContentType mInputContentType;
    android.widget.Editor.InputMethodState mInputMethodState;
    boolean mFrozenWithFocus;
    boolean mSelectionMoved;
    boolean mTouchFocusSelected;
    android.text.method.KeyListener mKeyListener;
    int mInputType;
    boolean mDiscardNextActionUp;
    boolean mIgnoreActionUpEvent;
    boolean mCursorVisible;
    boolean mSelectAllOnFocus;
    boolean mTextIsSelectable;
    java.lang.CharSequence mError;
    boolean mErrorWasChanged;
    boolean mInBatchEditControllers;
    boolean mShowSoftInputOnFocus;
    boolean mIsBeingLongClicked;
    boolean mIsBeingLongClickedByAccessibility;
    android.text.style.SuggestionRangeSpan mSuggestionRangeSpan;
    android.graphics.drawable.Drawable mDrawableForCursor;
    android.graphics.drawable.Drawable mSelectHandleLeft;
    android.graphics.drawable.Drawable mSelectHandleRight;
    android.graphics.drawable.Drawable mSelectHandleCenter;
    android.view.ActionMode.Callback mCustomSelectionActionModeCallback;
    android.view.ActionMode.Callback mCustomInsertionActionModeCallback;
    boolean mCreatedWithASelection;
    android.widget.SpellChecker mSpellChecker;
    final android.widget.Editor.ProcessTextIntentActionsHandler mProcessTextIntentActionsHandler = null;
    boolean mIsInsertionActionModeStartPending;
    static final int EXTRACT_NOTHING = -2;
    static final int EXTRACT_UNKNOWN = -1;
    public static final int HANDLE_TYPE_SELECTION_START = 0;
    public static final int HANDLE_TYPE_SELECTION_END = 1;
    Editor(android.widget.TextView p0) {}
    public boolean getFlagCursorDragFromAnywhereEnabled() { return false; }
    public void setFlagCursorDragFromAnywhereEnabled(boolean p0) {}
    public void setCursorDragMinAngleFromVertical(int p0) {}
    public boolean getFlagInsertionHandleGesturesEnabled() { return false; }
    public void setFlagInsertionHandleGesturesEnabled(boolean p0) {}
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
    public void setError(java.lang.CharSequence p0, android.graphics.drawable.Drawable p1) {}
    void createInputContentTypeIfNeeded() {}
    void createInputMethodStateIfNeeded() {}
    boolean shouldRenderCursor() { return false; }
    void prepareCursorControllers() {}
    void hideInsertionPointCursorController() {}
    void hideCursorAndSpanControllers() {}
    void onScreenStateChanged(int p0) {}
    void adjustInputType(boolean p0, boolean p1, boolean p2, boolean p3) {}
    void setFrame() {}
    boolean selectCurrentWord() { return false; }
    void onLocaleChanged() {}
    public android.text.method.WordIterator getWordIterator() { return null; }
    public boolean performLongClick(boolean p0) { return false; }
    float getLastUpPositionX() { return 0.0f; }
    float getLastUpPositionY() { return 0.0f; }
    void onFocusChanged(boolean p0, int p1) {}
    void sendOnTextChanged(int p0, int p1, int p2) {}
    void onWindowFocusChanged(boolean p0) {}
    public void onTouchEvent(android.view.MotionEvent p0) {}
    void hideFloatingToolbar(int p0) {}
    public void beginBatchEdit() {}
    public void endBatchEdit() {}
    void ensureEndedBatchEdit() {}
    void finishBatchEdit(android.widget.Editor.InputMethodState p0) {}
    void scheduleRestartInputForSetText() {}
    void maybeFireScheduledRestartInputForSetText() {}
    boolean extractText(android.view.inputmethod.ExtractedTextRequest p0, android.view.inputmethod.ExtractedText p1) { return false; }
    boolean reportExtractedText() { return false; }
    void onDraw(android.graphics.Canvas p0, android.text.Layout p1, java.util.List<android.graphics.Path> p2, java.util.List<android.graphics.Paint> p3, android.graphics.Path p4, android.graphics.Paint p5, int p6) {}
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
    boolean checkField() { return false; }
    boolean startActionModeInternal(int p0) { return false; }
    boolean shouldOfferToShowSuggestions() { return false; }
    void onTouchUpEvent(android.view.MotionEvent p0) {}
    final void onTextOperationUserChanged() {}
    protected void stopTextActionMode() {}
    void stopTextActionModeWithPreservingSelection() {}
    boolean hasInsertionController() { return false; }
    boolean hasSelectionController() { return false; }
    public android.widget.Editor.InsertionPointCursorController getInsertionController() { return null; }
    public android.widget.Editor.SelectionModifierCursorController getSelectionController() { return null; }
    public android.graphics.drawable.Drawable getCursorDrawable() { return null; }
    public void onCommitCorrection(android.view.inputmethod.CorrectionInfo p0) {}
    void onScrollChanged() {}
    void makeBlink() {}
    public boolean isBlinking() { return false; }
    void onDrop(android.view.DragEvent p0) {}
    public void addSpanWatchers(android.text.Spannable p0) {}
    void setContextMenuAnchor(float p0, float p1) {}
    public void onCreateContextMenu(android.view.ContextMenu p0) {}
    public void adjustIconSpacing(android.view.ContextMenu p0) {}
    public void setLineChangeSlopMinMaxForTesting(int p0, int p1) {}
    public int getCurrentLineAdjustedForSlop(android.text.Layout p0, int p1, float p2) { return 0; }
    void loadCursorDrawable() {}
    void loadHandleDrawables(boolean p0) {}
    boolean enterInsertMode(int p0) { return false; }
    void exitInsertMode() {}
    void setTransformationMethod(android.text.method.TransformationMethod p0) {}
    void onInitializeSmartActionsAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    boolean performSmartActionsAccessibilityAction(int p0) { return false; }
    static void logCursor(java.lang.String p0, java.lang.String p1, java.lang.Object... p2) {}

    private static final class AccessibilitySmartActions {
        void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
        boolean performAccessibilityAction(int p0) { return false; }
    }

    public class AssistantCallbackHelper {
        public AssistantCallbackHelper(android.widget.Editor p0, android.widget.SelectionActionModeHelper p1) {}
        public void clearCallbackHandlers() {}
        public android.view.View.OnClickListener getOnClickListener(android.view.MenuItem p0) { return null; }
        public void updateAssistMenuItems(android.view.Menu p0, android.view.MenuItem.OnMenuItemClickListener p1) {}
        public boolean onAssistMenuItemClicked(android.view.MenuItem p0) { return false; }
    }

    private class Blink implements java.lang.Runnable {
        public void run() {}
        void cancel() {}
        void uncancel() {}
    }

    private class CorrectionHighlighter {
        public CorrectionHighlighter(android.widget.Editor p0) {}
        public void highlight(android.view.inputmethod.CorrectionInfo p0) {}
        public void draw(android.graphics.Canvas p0, int p1) {}
    }

    private final class CursorAnchorInfoNotifier implements android.widget.Editor.TextViewPositionListener {
        final android.view.inputmethod.CursorAnchorInfo.Builder mCursorAnchorInfoBuilder = null;
        final android.graphics.Matrix mViewToScreenMatrix = null;
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
        EasyEditPopupWindow() { super(null); }
        protected void createPopupWindow() {}
        protected void initContentView() {}
        public void setEasyEditSpan(android.text.style.EasyEditSpan p0) {}
        public void onClick(android.view.View p0) {}
        public void hide() {}
        protected int getTextOffset() { return 0; }
        protected int getVerticalLocalPosition(int p0) { return 0; }
        protected int clipVertically(int p0) { return 0; }
    }

    public static class EditOperation extends android.content.UndoOperation<android.widget.Editor> {
        public static final android.os.Parcelable.ClassLoaderCreator<android.widget.Editor.EditOperation> CREATOR = null;
        public EditOperation(android.widget.Editor p0, java.lang.String p1, int p2, java.lang.String p3, boolean p4) { super((android.content.UndoOwner)null); }
        public EditOperation(android.os.Parcel p0, java.lang.ClassLoader p1) { super((android.content.UndoOwner)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void commit() {}
        public void undo() {}
        public void redo() {}
        public void forceMergeWith(android.widget.Editor.EditOperation p0) {}
        public java.lang.String toString() { return null; }
    }

    private static class ErrorPopup extends android.widget.PopupWindow {
        ErrorPopup(android.widget.TextView p0, int p1, int p2) { super(); }
        void fixDirection(boolean p0) {}
        public void update(int p0, int p1, int p2, int p3, boolean p4) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HandleType {
    }

    public abstract class HandleView extends android.view.View implements android.widget.Editor.TextViewPositionListener {
        protected android.graphics.drawable.Drawable mDrawable;
        protected android.graphics.drawable.Drawable mDrawableLtr;
        protected android.graphics.drawable.Drawable mDrawableRtl;
        protected int mHotspotX;
        protected int mHorizontalGravity;
        protected int mPreviousOffset;
        protected int mPrevLine;
        protected int mPreviousLineTouched;
        HandleView() { super((android.content.Context)null); }
        public float getIdealVerticalOffset() { return 0.0f; }
        final int getIdealFingerToCursorOffset() { return 0; }
        void setDrawables(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) {}
        protected void updateDrawable(boolean p0) {}
        protected abstract int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1);
        protected abstract int getHorizontalGravity(boolean p0);
        public boolean offsetHasBeenChanged() { return false; }
        protected void onMeasure(int p0, int p1) {}
        public void invalidate() {}
        protected final int getPreferredWidth() { return 0; }
        protected final int getPreferredHeight() { return 0; }
        public void show() {}
        protected void dismiss() {}
        public void hide() {}
        public boolean isShowing() { return false; }
        public abstract int getCurrentCursorOffset();
        protected abstract void updateSelection(int p0);
        protected abstract void updatePosition(float p0, float p1, boolean p2);
        protected abstract int getMagnifierHandleTrigger();
        protected boolean isAtRtlRun(android.text.Layout p0, int p1) { return false; }
        public float getHorizontal(android.text.Layout p0, int p1) { return 0.0f; }
        public int getLineForOffset(android.text.Layout p0, int p1) { return 0; }
        protected int getOffsetAtCoordinate(android.text.Layout p0, int p1, float p2) { return 0; }
        protected void positionAtCursorOffset(int p0, boolean p1, boolean p2) {}
        int getCursorHorizontalPosition(android.text.Layout p0, int p1) { return 0; }
        public void updatePosition(int p0, int p1, boolean p2, boolean p3) {}
        protected void onDraw(android.graphics.Canvas p0) {}
        protected int getCursorOffset() { return 0; }
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
        int mUpdateCursorAnchorInfoMode;
        int mUpdateCursorAnchorInfoFilter;
        InputMethodState() {}
    }

    private class InsertionHandleView extends android.widget.Editor.HandleView {
        InsertionHandleView(android.widget.Editor p0, android.graphics.drawable.Drawable p1) { super(); }
        protected int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1) { return 0; }
        protected int getHorizontalGravity(boolean p0) { return 0; }
        protected int getCursorOffset() { return 0; }
        int getCursorHorizontalPosition(android.text.Layout p0, int p1) { return 0; }
        protected void onMeasure(int p0, int p1) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
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
        public InsertionPointCursorController(android.widget.Editor p0) {}
        public void onTouchEvent(android.view.MotionEvent p0) {}
        public void show() {}
        public void hide() {}
        public void onTouchModeChanged(boolean p0) {}
        public android.widget.Editor.InsertionHandleView getHandle() { return null; }
        public void onDetached() {}
        public boolean isCursorBeingModified() { return false; }
        public boolean isActive() { return false; }
        public void invalidateHandle() {}
    }

    private static final class InsertModeController {
        InsertModeController(android.widget.TextView p0) {}
        boolean enterInsertMode(int p0) { return false; }
        void exitInsertMode() {}
        void onDraw(android.graphics.Canvas p0) {}
        android.text.method.TransformationMethod updateTransformationMethod(android.text.method.TransformationMethod p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface MagnifierHandleTrigger {
        public static final int INSERTION = 0;
        public static final int SELECTION_START = 1;
        public static final int SELECTION_END = 2;
    }

    private static class MagnifierMotionAnimator {
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
        public void hide() {}
        public void updatePosition(int p0, int p1, boolean p2, boolean p3) {}
        public boolean isShowing() { return false; }
    }

    private class PositionListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        final int[] mTempCoords = null;
        public void addSubscriber(android.widget.Editor.TextViewPositionListener p0, boolean p1) {}
        public void removeSubscriber(android.widget.Editor.TextViewPositionListener p0) {}
        public int getPositionX() { return 0; }
        public int getPositionY() { return 0; }
        public int getPositionXOnScreen() { return 0; }
        public int getPositionYOnScreen() { return 0; }
        public boolean onPreDraw() { return false; }
        public void onScrollChanged() {}
    }

    static final class ProcessTextIntentActionsHandler {
        public void onInitializeMenu(android.view.Menu p0) {}
        public boolean performMenuItemAction(android.view.MenuItem p0) { return false; }
        public void initializeAccessibilityActions() {}
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
        public boolean performAccessibilityAction(int p0) { return false; }
    }

    public final class SelectionHandleView extends android.widget.Editor.HandleView {
        public SelectionHandleView(android.widget.Editor p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, int p3, int p4) { super(); }
        protected int getHotspotX(android.graphics.drawable.Drawable p0, boolean p1) { return 0; }
        protected int getHorizontalGravity(boolean p0) { return 0; }
        public int getCurrentCursorOffset() { return 0; }
        protected void updateSelection(int p0) {}
        protected void updatePosition(float p0, float p1, boolean p2) {}
        protected void positionAtCursorOffset(int p0, boolean p1, boolean p2) {}
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        protected boolean isAtRtlRun(android.text.Layout p0, int p1) { return false; }
        public float getHorizontal(android.text.Layout p0, int p1) { return 0.0f; }
        protected int getOffsetAtCoordinate(android.text.Layout p0, int p1, float p2) { return 0; }
        protected int getMagnifierHandleTrigger() { return 0; }
    }

    public class SelectionModifierCursorController implements android.widget.Editor.CursorController {
        SelectionModifierCursorController(android.widget.Editor p0) {}
        public void show() {}
        public void hide() {}
        public void enterDrag(int p0) {}
        public void onTouchEvent(android.view.MotionEvent p0) {}
        public int getMinTouchOffset() { return 0; }
        public int getMaxTouchOffset() { return 0; }
        public void resetTouchOffsets() {}
        public boolean isSelectionStartDragged() { return false; }
        public boolean isCursorBeingModified() { return false; }
        public boolean isDragAcceleratorActive() { return false; }
        public void onTouchModeChanged(boolean p0) {}
        public void onDetached() {}
        public boolean isActive() { return false; }
        public void invalidateHandles() {}
    }

    private class SpanController implements android.text.SpanWatcher {
        public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
        public void hide() {}
    }

    private class SuggestionHelper {
        public int getSuggestionInfo(android.widget.Editor.SuggestionInfo[] p0, android.widget.Editor.SuggestionSpanInfo p1) { return 0; }

        private abstract class SuggestionSpanComparator implements java.util.Comparator<android.text.style.SuggestionSpan> {
            public int compare(android.text.style.SuggestionSpan p0, android.text.style.SuggestionSpan p1) { return 0; }
        }
    }

    private static final class SuggestionInfo {
        int mSuggestionStart;
        int mSuggestionEnd;
        final android.widget.Editor.SuggestionSpanInfo mSuggestionSpanInfo = null;
        int mSuggestionIndex;
        final android.text.SpannableStringBuilder mText = null;
        void clear() {}
        void setSpanInfo(android.text.style.SuggestionSpan p0, int p1, int p2) {}
    }

    private static final class SuggestionSpanInfo {
        android.text.style.SuggestionSpan mSuggestionSpan;
        int mSpanStart;
        int mSpanEnd;
        void clear() {}
    }

    private final class SuggestionsPopupWindow extends android.widget.Editor.PinnedPopupWindow implements android.widget.AdapterView.OnItemClickListener {
        public SuggestionsPopupWindow(android.widget.Editor p0) { super(null); }
        protected void setUp() {}
        protected void createPopupWindow() {}
        protected void initContentView() {}
        public boolean isShowingUp() { return false; }
        public void onParentLostFocus() {}
        public void show() {}
        protected void measureContent() {}
        protected int getTextOffset() { return 0; }
        protected int getVerticalLocalPosition(int p0) { return 0; }
        protected int clipVertically(int p0) { return 0; }
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}

        private class CustomPopupWindow extends android.widget.PopupWindow {
            public void dismiss() {}
        }

        private class SuggestionAdapter extends android.widget.BaseAdapter {
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
        TextActionModeCallback(android.widget.Editor p0, int p1) { super(); }
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
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
        public UndoInputFilter(android.widget.Editor p0) {}
        public void saveInstanceState(android.os.Parcel p0) {}
        public void restoreInstanceState(android.os.Parcel p0) {}
        public void beginBatchEdit() {}
        public void endBatchEdit() {}
        public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
        void freezeLastEdit() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface MergeMode {
        }
    }
}
