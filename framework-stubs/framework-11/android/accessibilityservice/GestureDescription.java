package android.accessibilityservice;

public final class GestureDescription {
    private static final int MAX_STROKE_COUNT = 20;
    private static final long MAX_GESTURE_DURATION_MS = 60000L;
    private final java.util.List<android.accessibilityservice.GestureDescription.StrokeDescription> mStrokes = null;
    private final float[] mTempPos = null;
    private final int mDisplayId = 0;
    public static int getMaxStrokeCount() { return 0; }
    public static long getMaxGestureDuration() { return 0L; }
    private GestureDescription() {}
    private GestureDescription(java.util.List<android.accessibilityservice.GestureDescription.StrokeDescription> p0) {}
    private GestureDescription(java.util.List<android.accessibilityservice.GestureDescription.StrokeDescription> p0, int p1) {}
    public int getStrokeCount() { return 0; }
    public android.accessibilityservice.GestureDescription.StrokeDescription getStroke(int p0) { return null; }
    public int getDisplayId() { return 0; }
    private long getNextKeyPointAtLeast(long p0) { return 0L; }
    private int getPointsForTime(long p0, android.accessibilityservice.GestureDescription.TouchPoint[] p1) { return 0; }
    private static long getTotalDuration(java.util.List<android.accessibilityservice.GestureDescription.StrokeDescription> p0) { return 0L; }

    public static class Builder {
        private final java.util.List<android.accessibilityservice.GestureDescription.StrokeDescription> mStrokes = null;
        private int mDisplayId;
        public Builder() {}
        public android.accessibilityservice.GestureDescription.Builder addStroke(android.accessibilityservice.GestureDescription.StrokeDescription p0) { return null; }
        public android.accessibilityservice.GestureDescription.Builder setDisplayId(int p0) { return null; }
        public android.accessibilityservice.GestureDescription build() { return null; }
    }

    public static class GestureStep implements android.os.Parcelable {
        public long timeSinceGestureStart;
        public int numTouchPoints;
        public android.accessibilityservice.GestureDescription.TouchPoint[] touchPoints;
        public static final android.os.Parcelable.Creator<android.accessibilityservice.GestureDescription.GestureStep> CREATOR = null;
        public GestureStep(long p0, int p1, android.accessibilityservice.GestureDescription.TouchPoint[] p2) {}
        public GestureStep(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class MotionEventGenerator {
        private static android.accessibilityservice.GestureDescription.TouchPoint[] sCurrentTouchPoints;
        public MotionEventGenerator() {}
        public static java.util.List<android.accessibilityservice.GestureDescription.GestureStep> getGestureStepsFromGestureDescription(android.accessibilityservice.GestureDescription p0, int p1) { return null; }
        private static android.accessibilityservice.GestureDescription.TouchPoint[] getCurrentTouchPoints(int p0) { return null; }
    }

    public static class StrokeDescription {
        private static final int INVALID_STROKE_ID = -1;
        static int sIdCounter;
        android.graphics.Path mPath;
        long mStartTime;
        long mEndTime;
        private float mTimeToLengthConversion;
        private android.graphics.PathMeasure mPathMeasure;
        float[] mTapLocation;
        int mId;
        boolean mContinued;
        int mContinuedStrokeId;
        public StrokeDescription(android.graphics.Path p0, long p1, long p2) {}
        public StrokeDescription(android.graphics.Path p0, long p1, long p2, boolean p3) {}
        public android.graphics.Path getPath() { return null; }
        public long getStartTime() { return 0L; }
        public long getDuration() { return 0L; }
        public int getId() { return 0; }
        public android.accessibilityservice.GestureDescription.StrokeDescription continueStroke(android.graphics.Path p0, long p1, long p2, boolean p3) { return null; }
        public boolean willContinue() { return false; }
        public int getContinuedStrokeId() { return 0; }
        float getLength() { return 0.0f; }
        boolean getPosForTime(long p0, float[] p1) { return false; }
        boolean hasPointForTime(long p0) { return false; }
    }

    public static class TouchPoint implements android.os.Parcelable {
        private static final int FLAG_IS_START_OF_PATH = 1;
        private static final int FLAG_IS_END_OF_PATH = 2;
        public int mStrokeId;
        public int mContinuedStrokeId;
        public boolean mIsStartOfPath;
        public boolean mIsEndOfPath;
        public float mX;
        public float mY;
        public static final android.os.Parcelable.Creator<android.accessibilityservice.GestureDescription.TouchPoint> CREATOR = null;
        public TouchPoint() {}
        public TouchPoint(android.accessibilityservice.GestureDescription.TouchPoint p0) {}
        public TouchPoint(android.os.Parcel p0) {}
        public void copyFrom(android.accessibilityservice.GestureDescription.TouchPoint p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
