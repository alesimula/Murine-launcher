package android.view;

public final class InputEventConsistencyVerifier {
    private static final boolean IS_ENG_BUILD = Boolean.valueOf(false);
    private static final java.lang.String EVENT_TYPE_KEY = "KeyEvent";
    private static final java.lang.String EVENT_TYPE_TRACKBALL = "TrackballEvent";
    private static final java.lang.String EVENT_TYPE_TOUCH = "TouchEvent";
    private static final java.lang.String EVENT_TYPE_GENERIC_MOTION = "GenericMotionEvent";
    private static final int RECENT_EVENTS_TO_LOG = 5;
    private final java.lang.Object mCaller = null;
    private final int mFlags = 0;
    private final java.lang.String mLogTag = null;
    private int mLastEventSeq;
    private java.lang.String mLastEventType;
    private int mLastNestingLevel;
    private android.view.InputEvent[] mRecentEvents;
    private boolean[] mRecentEventsUnhandled;
    private int mMostRecentEventIndex;
    private android.view.InputEvent mCurrentEvent;
    private java.lang.String mCurrentEventType;
    private android.view.InputEventConsistencyVerifier.KeyState mKeyStateList;
    private boolean mTrackballDown;
    private boolean mTrackballUnhandled;
    private int mTouchEventStreamPointers;
    private int mTouchEventStreamDeviceId;
    private int mTouchEventStreamSource;
    private boolean mTouchEventStreamIsTainted;
    private boolean mTouchEventStreamUnhandled;
    private boolean mHoverEntered;
    private int mButtonsPressed;
    private java.lang.StringBuilder mViolationMessage;
    public static final int FLAG_RAW_DEVICE_INPUT = 1;
    @android.annotation.UnsupportedAppUsage
    public InputEventConsistencyVerifier(java.lang.Object p0, int p1) {}
    public InputEventConsistencyVerifier(java.lang.Object p0, int p1, java.lang.String p2) {}
    @android.annotation.UnsupportedAppUsage
    public static boolean isInstrumentationEnabled() { return false; }
    public void reset() {}
    public void onInputEvent(android.view.InputEvent p0, int p1) {}
    public void onKeyEvent(android.view.KeyEvent p0, int p1) {}
    public void onTrackballEvent(android.view.MotionEvent p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void onTouchEvent(android.view.MotionEvent p0, int p1) {}
    public void onGenericMotionEvent(android.view.MotionEvent p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void onUnhandledEvent(android.view.InputEvent p0, int p1) {}
    private void ensureMetaStateIsNormalized(int p0) {}
    private void ensurePointerCountIsOneForThisAction(android.view.MotionEvent p0) {}
    private void ensureActionButtonIsNonZeroForThisAction(android.view.MotionEvent p0) {}
    private void ensureHistorySizeIsZeroForThisAction(android.view.MotionEvent p0) {}
    private boolean startEvent(android.view.InputEvent p0, int p1, java.lang.String p2) { return false; }
    private void finishEvent() {}
    private static void appendEvent(java.lang.StringBuilder p0, int p1, android.view.InputEvent p2, boolean p3) {}
    private void problem(java.lang.String p0) {}
    private android.view.InputEventConsistencyVerifier.KeyState findKeyState(int p0, int p1, int p2, boolean p3) { return null; }
    private void addKeyState(int p0, int p1, int p2) {}

    private static final class KeyState {
        private static java.lang.Object mRecycledListLock;
        private static android.view.InputEventConsistencyVerifier.KeyState mRecycledList;
        public android.view.InputEventConsistencyVerifier.KeyState next;
        public int deviceId;
        public int source;
        public int keyCode;
        public boolean unhandled;
        private KeyState() {}
        public static android.view.InputEventConsistencyVerifier.KeyState obtain(int p0, int p1, int p2) { return null; }
        public void recycle() {}
    }
}
