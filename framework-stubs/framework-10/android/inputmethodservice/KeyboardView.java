package android.inputmethodservice;

@java.lang.Deprecated
public class KeyboardView extends android.view.View implements android.view.View.OnClickListener {
    private static final boolean DEBUG = false;
    private static final int NOT_A_KEY = -1;
    private static final int[] KEY_DELETE = null;
    private static final int[] LONG_PRESSABLE_STATE_SET = null;
    private android.inputmethodservice.Keyboard mKeyboard;
    private int mCurrentKeyIndex;
    @android.annotation.UnsupportedAppUsage
    private int mLabelTextSize;
    private int mKeyTextSize;
    private int mKeyTextColor;
    private float mShadowRadius;
    private int mShadowColor;
    private float mBackgroundDimAmount;
    @android.annotation.UnsupportedAppUsage
    private android.widget.TextView mPreviewText;
    private android.widget.PopupWindow mPreviewPopup;
    private int mPreviewTextSizeLarge;
    private int mPreviewOffset;
    private int mPreviewHeight;
    private final int[] mCoordinates = null;
    private android.widget.PopupWindow mPopupKeyboard;
    private android.view.View mMiniKeyboardContainer;
    private android.inputmethodservice.KeyboardView mMiniKeyboard;
    private boolean mMiniKeyboardOnScreen;
    private android.view.View mPopupParent;
    private int mMiniKeyboardOffsetX;
    private int mMiniKeyboardOffsetY;
    private java.util.Map<android.inputmethodservice.Keyboard.Key, android.view.View> mMiniKeyboardCache;
    private android.inputmethodservice.Keyboard.Key[] mKeys;
    private android.inputmethodservice.KeyboardView.OnKeyboardActionListener mKeyboardActionListener;
    private static final int MSG_SHOW_PREVIEW = 1;
    private static final int MSG_REMOVE_PREVIEW = 2;
    private static final int MSG_REPEAT = 3;
    private static final int MSG_LONGPRESS = 4;
    private static final int DELAY_BEFORE_PREVIEW = 0;
    private static final int DELAY_AFTER_PREVIEW = 70;
    private static final int DEBOUNCE_TIME = 70;
    private int mVerticalCorrection;
    private int mProximityThreshold;
    private boolean mPreviewCentered;
    private boolean mShowPreview;
    private boolean mShowTouchPoints;
    private int mPopupPreviewX;
    private int mPopupPreviewY;
    private int mLastX;
    private int mLastY;
    private int mStartX;
    private int mStartY;
    private boolean mProximityCorrectOn;
    private android.graphics.Paint mPaint;
    private android.graphics.Rect mPadding;
    private long mDownTime;
    private long mLastMoveTime;
    private int mLastKey;
    private int mLastCodeX;
    private int mLastCodeY;
    private int mCurrentKey;
    private int mDownKey;
    private long mLastKeyTime;
    private long mCurrentKeyTime;
    private int[] mKeyIndices;
    private android.view.GestureDetector mGestureDetector;
    private int mPopupX;
    private int mPopupY;
    private int mRepeatKeyIndex;
    private int mPopupLayout;
    private boolean mAbortKey;
    private android.inputmethodservice.Keyboard.Key mInvalidatedKey;
    private android.graphics.Rect mClipRegion;
    private boolean mPossiblePoly;
    private android.inputmethodservice.KeyboardView.SwipeTracker mSwipeTracker;
    private int mSwipeThreshold;
    private boolean mDisambiguateSwipe;
    private int mOldPointerCount;
    private float mOldPointerX;
    private float mOldPointerY;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mKeyBackground;
    private static final int REPEAT_INTERVAL = 50;
    private static final int REPEAT_START_DELAY = 400;
    private static final int LONGPRESS_TIMEOUT = Integer.valueOf(0);
    private static int MAX_NEARBY_KEYS;
    private int[] mDistances;
    private int mLastSentIndex;
    private int mTapCount;
    private long mLastTapTime;
    private boolean mInMultiTap;
    private static final int MULTITAP_INTERVAL = 800;
    private java.lang.StringBuilder mPreviewLabel;
    private boolean mDrawPending;
    private android.graphics.Rect mDirtyRect;
    private android.graphics.Bitmap mBuffer;
    private boolean mKeyboardChanged;
    private android.graphics.Canvas mCanvas;
    private android.view.accessibility.AccessibilityManager mAccessibilityManager;
    private android.media.AudioManager mAudioManager;
    private boolean mHeadsetRequiredToHearPasswordsAnnounced;
    android.os.Handler mHandler;
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public KeyboardView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    private void initGestureDetector() {}
    public void setOnKeyboardActionListener(android.inputmethodservice.KeyboardView.OnKeyboardActionListener p0) {}
    protected android.inputmethodservice.KeyboardView.OnKeyboardActionListener getOnKeyboardActionListener() { return null; }
    public void setKeyboard(android.inputmethodservice.Keyboard p0) {}
    public android.inputmethodservice.Keyboard getKeyboard() { return null; }
    public boolean setShifted(boolean p0) { return false; }
    public boolean isShifted() { return false; }
    public void setPreviewEnabled(boolean p0) {}
    public boolean isPreviewEnabled() { return false; }
    public void setVerticalCorrection(int p0) {}
    public void setPopupParent(android.view.View p0) {}
    public void setPopupOffset(int p0, int p1) {}
    public void setProximityCorrectionEnabled(boolean p0) {}
    public boolean isProximityCorrectionEnabled() { return false; }
    public void onClick(android.view.View p0) {}
    private java.lang.CharSequence adjustCase(java.lang.CharSequence p0) { return null; }
    public void onMeasure(int p0, int p1) {}
    private void computeProximityThreshold(android.inputmethodservice.Keyboard p0) {}
    public void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void onDraw(android.graphics.Canvas p0) {}
    private void onBufferDraw() {}
    private int getKeyIndices(int p0, int p1, int[] p2) { return 0; }
    private void detectAndSendKey(int p0, int p1, int p2, long p3) {}
    private java.lang.CharSequence getPreviewText(android.inputmethodservice.Keyboard.Key p0) { return null; }
    private void showPreview(int p0) {}
    @android.annotation.UnsupportedAppUsage
    private void showKey(int p0) {}
    private void sendAccessibilityEventForUnicodeCharacter(int p0, int p1) {}
    public void invalidateAllKeys() {}
    public void invalidateKey(int p0) {}
    @android.annotation.UnsupportedAppUsage
    private boolean openPopupIfRequired(android.view.MotionEvent p0) { return false; }
    protected boolean onLongPress(android.inputmethodservice.Keyboard.Key p0) { return false; }
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean onModifiedTouchEvent(android.view.MotionEvent p0, boolean p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    private boolean repeatKey() { return false; }
    protected void swipeRight() {}
    protected void swipeLeft() {}
    protected void swipeUp() {}
    protected void swipeDown() {}
    public void closing() {}
    private void removeMessages() {}
    public void onDetachedFromWindow() {}
    private void dismissPopupKeyboard() {}
    public boolean handleBack() { return false; }
    private void resetMultiTap() {}
    private void checkMultiTap(long p0, int p1) {}

    private static class SwipeTracker {
        static final int NUM_PAST = 4;
        static final int LONGEST_PAST_TIME = 200;
        final float[] mPastX = null;
        final float[] mPastY = null;
        final long[] mPastTime = null;
        float mYVelocity;
        float mXVelocity;
        private SwipeTracker() {}
        public void clear() {}
        public void addMovement(android.view.MotionEvent p0) {}
        private void addPoint(float p0, float p1, long p2) {}
        public void computeCurrentVelocity(int p0) {}
        public void computeCurrentVelocity(int p0, float p1) {}
        public float getXVelocity() { return 0.0f; }
        public float getYVelocity() { return 0.0f; }
    }

    public static interface OnKeyboardActionListener {
        public void onPress(int p0);
        public void onRelease(int p0);
        public void onKey(int p0, int[] p1);
        public void onText(java.lang.CharSequence p0);
        public void swipeLeft();
        public void swipeRight();
        public void swipeDown();
        public void swipeUp();
    }
}
