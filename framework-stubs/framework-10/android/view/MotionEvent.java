package android.view;

public final class MotionEvent extends android.view.InputEvent implements android.os.Parcelable {
    private static final java.lang.String TAG = "MotionEvent";
    private static final long NS_PER_MS = 1000000L;
    private static final java.lang.String LABEL_PREFIX = "AXIS_";
    private static final boolean DEBUG_CONCISE_TOSTRING = false;
    public static final int INVALID_POINTER_ID = -1;
    public static final int ACTION_MASK = 255;
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_UP = 1;
    public static final int ACTION_MOVE = 2;
    public static final int ACTION_CANCEL = 3;
    public static final int ACTION_OUTSIDE = 4;
    public static final int ACTION_POINTER_DOWN = 5;
    public static final int ACTION_POINTER_UP = 6;
    public static final int ACTION_HOVER_MOVE = 7;
    public static final int ACTION_SCROLL = 8;
    public static final int ACTION_HOVER_ENTER = 9;
    public static final int ACTION_HOVER_EXIT = 10;
    public static final int ACTION_BUTTON_PRESS = 11;
    public static final int ACTION_BUTTON_RELEASE = 12;
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_1_DOWN = 5;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_2_DOWN = 261;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_3_DOWN = 517;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_1_UP = 6;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_2_UP = 262;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_3_UP = 518;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_ID_MASK = 65280;
    @java.lang.Deprecated
    public static final int ACTION_POINTER_ID_SHIFT = 8;
    public static final int FLAG_WINDOW_IS_OBSCURED = 1;
    public static final int FLAG_WINDOW_IS_PARTIALLY_OBSCURED = 2;
    public static final int FLAG_HOVER_EXIT_PENDING = 4;
    public static final int FLAG_IS_GENERATED_GESTURE = 8;
    public static final int FLAG_TAINTED = -2147483648;
    public static final int FLAG_TARGET_ACCESSIBILITY_FOCUS = 1073741824;
    public static final int EDGE_TOP = 1;
    public static final int EDGE_BOTTOM = 2;
    public static final int EDGE_LEFT = 4;
    public static final int EDGE_RIGHT = 8;
    public static final int AXIS_X = 0;
    public static final int AXIS_Y = 1;
    public static final int AXIS_PRESSURE = 2;
    public static final int AXIS_SIZE = 3;
    public static final int AXIS_TOUCH_MAJOR = 4;
    public static final int AXIS_TOUCH_MINOR = 5;
    public static final int AXIS_TOOL_MAJOR = 6;
    public static final int AXIS_TOOL_MINOR = 7;
    public static final int AXIS_ORIENTATION = 8;
    public static final int AXIS_VSCROLL = 9;
    public static final int AXIS_HSCROLL = 10;
    public static final int AXIS_Z = 11;
    public static final int AXIS_RX = 12;
    public static final int AXIS_RY = 13;
    public static final int AXIS_RZ = 14;
    public static final int AXIS_HAT_X = 15;
    public static final int AXIS_HAT_Y = 16;
    public static final int AXIS_LTRIGGER = 17;
    public static final int AXIS_RTRIGGER = 18;
    public static final int AXIS_THROTTLE = 19;
    public static final int AXIS_RUDDER = 20;
    public static final int AXIS_WHEEL = 21;
    public static final int AXIS_GAS = 22;
    public static final int AXIS_BRAKE = 23;
    public static final int AXIS_DISTANCE = 24;
    public static final int AXIS_TILT = 25;
    public static final int AXIS_SCROLL = 26;
    public static final int AXIS_RELATIVE_X = 27;
    public static final int AXIS_RELATIVE_Y = 28;
    public static final int AXIS_GENERIC_1 = 32;
    public static final int AXIS_GENERIC_2 = 33;
    public static final int AXIS_GENERIC_3 = 34;
    public static final int AXIS_GENERIC_4 = 35;
    public static final int AXIS_GENERIC_5 = 36;
    public static final int AXIS_GENERIC_6 = 37;
    public static final int AXIS_GENERIC_7 = 38;
    public static final int AXIS_GENERIC_8 = 39;
    public static final int AXIS_GENERIC_9 = 40;
    public static final int AXIS_GENERIC_10 = 41;
    public static final int AXIS_GENERIC_11 = 42;
    public static final int AXIS_GENERIC_12 = 43;
    public static final int AXIS_GENERIC_13 = 44;
    public static final int AXIS_GENERIC_14 = 45;
    public static final int AXIS_GENERIC_15 = 46;
    public static final int AXIS_GENERIC_16 = 47;
    private static final android.util.SparseArray<java.lang.String> AXIS_SYMBOLIC_NAMES = null;
    public static final int BUTTON_PRIMARY = 1;
    public static final int BUTTON_SECONDARY = 2;
    public static final int BUTTON_TERTIARY = 4;
    public static final int BUTTON_BACK = 8;
    public static final int BUTTON_FORWARD = 16;
    public static final int BUTTON_STYLUS_PRIMARY = 32;
    public static final int BUTTON_STYLUS_SECONDARY = 64;
    private static final java.lang.String[] BUTTON_SYMBOLIC_NAMES = null;
    public static final int CLASSIFICATION_NONE = 0;
    public static final int CLASSIFICATION_AMBIGUOUS_GESTURE = 1;
    public static final int CLASSIFICATION_DEEP_PRESS = 2;
    public static final int TOOL_TYPE_UNKNOWN = 0;
    public static final int TOOL_TYPE_FINGER = 1;
    public static final int TOOL_TYPE_STYLUS = 2;
    public static final int TOOL_TYPE_MOUSE = 3;
    public static final int TOOL_TYPE_ERASER = 4;
    private static final android.util.SparseArray<java.lang.String> TOOL_TYPE_SYMBOLIC_NAMES = null;
    @android.annotation.UnsupportedAppUsage
    private static final int HISTORY_CURRENT = -2147483648;
    private static final int MAX_RECYCLED = 10;
    private static final java.lang.Object gRecyclerLock = null;
    private static int gRecyclerUsed;
    private static android.view.MotionEvent gRecyclerTop;
    private static final java.lang.Object gSharedTempLock = null;
    private static android.view.MotionEvent.PointerCoords[] gSharedTempPointerCoords;
    private static android.view.MotionEvent.PointerProperties[] gSharedTempPointerProperties;
    private static int[] gSharedTempPointerIndexMap;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private long mNativePtr;
    private android.view.MotionEvent mNext;
    public static final android.os.Parcelable.Creator<android.view.MotionEvent> CREATOR = null;
    private static final void ensureSharedTempPointerCapacity(int p0) {}
    private static native long nativeInitialize(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, float p10, float p11, float p12, float p13, long p14, long p15, int p16, android.view.MotionEvent.PointerProperties[] p17, android.view.MotionEvent.PointerCoords[] p18);
    private static native void nativeDispose(long p0);
    private static native void nativeAddBatch(long p0, long p1, android.view.MotionEvent.PointerCoords[] p2, int p3);
    private static native void nativeGetPointerCoords(long p0, int p1, int p2, android.view.MotionEvent.PointerCoords p3);
    private static native void nativeGetPointerProperties(long p0, int p1, android.view.MotionEvent.PointerProperties p2);
    private static native long nativeReadFromParcel(long p0, android.os.Parcel p1);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    private static native java.lang.String nativeAxisToString(int p0);
    private static native int nativeAxisFromString(java.lang.String p0);
    private static native int nativeGetPointerId(long p0, int p1);
    private static native int nativeGetToolType(long p0, int p1);
    private static native long nativeGetEventTimeNanos(long p0, int p1);
    @android.annotation.UnsupportedAppUsage
    private static native float nativeGetRawAxisValue(long p0, int p1, int p2, int p3);
    private static native float nativeGetAxisValue(long p0, int p1, int p2, int p3);
    private static native long nativeCopy(long p0, long p1, boolean p2);
    private static native int nativeGetDeviceId(long p0);
    private static native int nativeGetSource(long p0);
    private static native void nativeSetSource(long p0, int p1);
    private static native int nativeGetDisplayId(long p0);
    private static native void nativeSetDisplayId(long p0, int p1);
    private static native int nativeGetAction(long p0);
    private static native void nativeSetAction(long p0, int p1);
    private static native boolean nativeIsTouchEvent(long p0);
    private static native int nativeGetFlags(long p0);
    private static native void nativeSetFlags(long p0, int p1);
    private static native int nativeGetEdgeFlags(long p0);
    private static native void nativeSetEdgeFlags(long p0, int p1);
    private static native int nativeGetMetaState(long p0);
    private static native int nativeGetButtonState(long p0);
    private static native void nativeSetButtonState(long p0, int p1);
    private static native int nativeGetClassification(long p0);
    private static native int nativeGetActionButton(long p0);
    private static native void nativeSetActionButton(long p0, int p1);
    private static native void nativeOffsetLocation(long p0, float p1, float p2);
    private static native float nativeGetXOffset(long p0);
    private static native float nativeGetYOffset(long p0);
    private static native float nativeGetXPrecision(long p0);
    private static native float nativeGetYPrecision(long p0);
    private static native long nativeGetDownTimeNanos(long p0);
    private static native void nativeSetDownTimeNanos(long p0, long p1);
    private static native int nativeGetPointerCount(long p0);
    private static native int nativeFindPointerIndex(long p0, int p1);
    private static native int nativeGetHistorySize(long p0);
    private static native void nativeScale(long p0, float p1);
    private static native void nativeTransform(long p0, long p1);
    private MotionEvent() { super(); }
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.UnsupportedAppUsage
    private static android.view.MotionEvent obtain() { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, android.view.MotionEvent.PointerProperties[] p4, android.view.MotionEvent.PointerCoords[] p5, int p6, int p7, float p8, float p9, int p10, int p11, int p12, int p13, int p14) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, android.view.MotionEvent.PointerProperties[] p4, android.view.MotionEvent.PointerCoords[] p5, int p6, int p7, float p8, float p9, int p10, int p11, int p12, int p13) { return null; }
    @java.lang.Deprecated
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, int[] p4, android.view.MotionEvent.PointerCoords[] p5, int p6, float p7, float p8, int p9, int p10, int p11, int p12) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, float p3, float p4, float p5, float p6, int p7, float p8, float p9, int p10, int p11) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, float p3, float p4, float p5, float p6, int p7, float p8, float p9, int p10, int p11, int p12, int p13) { return null; }
    @java.lang.Deprecated
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, int p3, float p4, float p5, float p6, float p7, int p8, float p9, float p10, int p11, int p12) { return null; }
    public static android.view.MotionEvent obtain(long p0, long p1, int p2, float p3, float p4, int p5) { return null; }
    public static android.view.MotionEvent obtain(android.view.MotionEvent p0) { return null; }
    public static android.view.MotionEvent obtainNoHistory(android.view.MotionEvent p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.view.MotionEvent copy() { return null; }
    public final void recycle() {}
    @android.annotation.UnsupportedAppUsage
    public final void scale(float p0) {}
    public final int getDeviceId() { return 0; }
    public final int getSource() { return 0; }
    public final void setSource(int p0) {}
    public int getDisplayId() { return 0; }
    public void setDisplayId(int p0) {}
    public final int getAction() { return 0; }
    public final int getActionMasked() { return 0; }
    public final int getActionIndex() { return 0; }
    public final boolean isTouchEvent() { return false; }
    public final int getFlags() { return 0; }
    public final boolean isTainted() { return false; }
    public final void setTainted(boolean p0) {}
    public final boolean isTargetAccessibilityFocus() { return false; }
    public final void setTargetAccessibilityFocus(boolean p0) {}
    public final boolean isHoverExitPending() { return false; }
    public void setHoverExitPending(boolean p0) {}
    public final long getDownTime() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public final void setDownTime(long p0) {}
    public final long getEventTime() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public final long getEventTimeNano() { return 0L; }
    public final float getX() { return 0.0f; }
    public final float getY() { return 0.0f; }
    public final float getPressure() { return 0.0f; }
    public final float getSize() { return 0.0f; }
    public final float getTouchMajor() { return 0.0f; }
    public final float getTouchMinor() { return 0.0f; }
    public final float getToolMajor() { return 0.0f; }
    public final float getToolMinor() { return 0.0f; }
    public final float getOrientation() { return 0.0f; }
    public final float getAxisValue(int p0) { return 0.0f; }
    public final int getPointerCount() { return 0; }
    public final int getPointerId(int p0) { return 0; }
    public final int getToolType(int p0) { return 0; }
    public final int findPointerIndex(int p0) { return 0; }
    public final float getX(int p0) { return 0.0f; }
    public final float getY(int p0) { return 0.0f; }
    public final float getPressure(int p0) { return 0.0f; }
    public final float getSize(int p0) { return 0.0f; }
    public final float getTouchMajor(int p0) { return 0.0f; }
    public final float getTouchMinor(int p0) { return 0.0f; }
    public final float getToolMajor(int p0) { return 0.0f; }
    public final float getToolMinor(int p0) { return 0.0f; }
    public final float getOrientation(int p0) { return 0.0f; }
    public final float getAxisValue(int p0, int p1) { return 0.0f; }
    public final void getPointerCoords(int p0, android.view.MotionEvent.PointerCoords p1) {}
    public final void getPointerProperties(int p0, android.view.MotionEvent.PointerProperties p1) {}
    public final int getMetaState() { return 0; }
    public final int getButtonState() { return 0; }
    public final void setButtonState(int p0) {}
    public int getClassification() { return 0; }
    public final int getActionButton() { return 0; }
    public final void setActionButton(int p0) {}
    public final float getRawX() { return 0.0f; }
    public final float getRawY() { return 0.0f; }
    public float getRawX(int p0) { return 0.0f; }
    public float getRawY(int p0) { return 0.0f; }
    public final float getXPrecision() { return 0.0f; }
    public final float getYPrecision() { return 0.0f; }
    public final int getHistorySize() { return 0; }
    public final long getHistoricalEventTime(int p0) { return 0L; }
    public final long getHistoricalEventTimeNano(int p0) { return 0L; }
    public final float getHistoricalX(int p0) { return 0.0f; }
    public final float getHistoricalY(int p0) { return 0.0f; }
    public final float getHistoricalPressure(int p0) { return 0.0f; }
    public final float getHistoricalSize(int p0) { return 0.0f; }
    public final float getHistoricalTouchMajor(int p0) { return 0.0f; }
    public final float getHistoricalTouchMinor(int p0) { return 0.0f; }
    public final float getHistoricalToolMajor(int p0) { return 0.0f; }
    public final float getHistoricalToolMinor(int p0) { return 0.0f; }
    public final float getHistoricalOrientation(int p0) { return 0.0f; }
    public final float getHistoricalAxisValue(int p0, int p1) { return 0.0f; }
    public final float getHistoricalX(int p0, int p1) { return 0.0f; }
    public final float getHistoricalY(int p0, int p1) { return 0.0f; }
    public final float getHistoricalPressure(int p0, int p1) { return 0.0f; }
    public final float getHistoricalSize(int p0, int p1) { return 0.0f; }
    public final float getHistoricalTouchMajor(int p0, int p1) { return 0.0f; }
    public final float getHistoricalTouchMinor(int p0, int p1) { return 0.0f; }
    public final float getHistoricalToolMajor(int p0, int p1) { return 0.0f; }
    public final float getHistoricalToolMinor(int p0, int p1) { return 0.0f; }
    public final float getHistoricalOrientation(int p0, int p1) { return 0.0f; }
    public final float getHistoricalAxisValue(int p0, int p1, int p2) { return 0.0f; }
    public final void getHistoricalPointerCoords(int p0, int p1, android.view.MotionEvent.PointerCoords p2) {}
    public final int getEdgeFlags() { return 0; }
    public final void setEdgeFlags(int p0) {}
    public final void setAction(int p0) {}
    public final void offsetLocation(float p0, float p1) {}
    public final void setLocation(float p0, float p1) {}
    public final void transform(android.graphics.Matrix p0) {}
    public final void addBatch(long p0, float p1, float p2, float p3, float p4, int p5) {}
    public final void addBatch(long p0, android.view.MotionEvent.PointerCoords[] p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public final boolean addBatch(android.view.MotionEvent p0) { return false; }
    public final boolean isWithinBoundsNoHistory(float p0, float p1, float p2, float p3) { return false; }
    private static final float clamp(float p0, float p1, float p2) { return 0.0f; }
    public final android.view.MotionEvent clampNoHistory(float p0, float p1, float p2, float p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    public final int getPointerIdBits() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public final android.view.MotionEvent split(int p0) { return null; }
    public java.lang.String toString() { return null; }
    private static <T extends java.lang.Object> void appendUnless(T p0, java.lang.StringBuilder p1, java.lang.String p2, T p3) {}
    public static java.lang.String actionToString(int p0) { return null; }
    public static java.lang.String axisToString(int p0) { return null; }
    public static int axisFromString(java.lang.String p0) { return 0; }
    public static java.lang.String buttonStateToString(int p0) { return null; }
    public static java.lang.String classificationToString(int p0) { return null; }
    public static java.lang.String toolTypeToString(int p0) { return null; }
    public final boolean isButtonPressed(int p0) { return false; }
    public static android.view.MotionEvent createFromParcelBody(android.os.Parcel p0) { return null; }
    public final void cancel() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class PointerProperties {
        public int id;
        public int toolType;
        public PointerProperties() {}
        public PointerProperties(android.view.MotionEvent.PointerProperties p0) {}
        @android.annotation.UnsupportedAppUsage
        public static android.view.MotionEvent.PointerProperties[] createArray(int p0) { return null; }
        public void clear() {}
        public void copyFrom(android.view.MotionEvent.PointerProperties p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        private boolean equals(android.view.MotionEvent.PointerProperties p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class PointerCoords {
        private static final int INITIAL_PACKED_AXIS_VALUES = 8;
        @android.annotation.UnsupportedAppUsage
        private long mPackedAxisBits;
        @android.annotation.UnsupportedAppUsage
        private float[] mPackedAxisValues;
        public float x;
        public float y;
        public float pressure;
        public float size;
        public float touchMajor;
        public float touchMinor;
        public float toolMajor;
        public float toolMinor;
        public float orientation;
        public PointerCoords() {}
        public PointerCoords(android.view.MotionEvent.PointerCoords p0) {}
        @android.annotation.UnsupportedAppUsage
        public static android.view.MotionEvent.PointerCoords[] createArray(int p0) { return null; }
        public void clear() {}
        public void copyFrom(android.view.MotionEvent.PointerCoords p0) {}
        public float getAxisValue(int p0) { return 0.0f; }
        public void setAxisValue(int p0, float p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Classification {
    }
}
