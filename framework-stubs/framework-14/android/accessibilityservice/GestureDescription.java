package android.accessibilityservice;

public final class GestureDescription {
    public static int getMaxStrokeCount() { return 0; }
    public static long getMaxGestureDuration() { return 0L; }
    public int getStrokeCount() { return 0; }
    public android.accessibilityservice.GestureDescription.StrokeDescription getStroke(int p0) { return null; }
    public int getDisplayId() { return 0; }

    public static class Builder {
        public Builder() {}
        public android.accessibilityservice.GestureDescription.Builder addStroke(android.accessibilityservice.GestureDescription.StrokeDescription p0) { return null; }
        public android.accessibilityservice.GestureDescription.Builder setDisplayId(int p0) { return null; }
        public android.accessibilityservice.GestureDescription build() { return null; }
    }

    public static class StrokeDescription {
        static int sIdCounter;
        android.graphics.Path mPath;
        long mStartTime;
        long mEndTime;
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
        public MotionEventGenerator() {}
        public static java.util.List<android.accessibilityservice.GestureDescription.GestureStep> getGestureStepsFromGestureDescription(android.accessibilityservice.GestureDescription p0, int p1) { return null; }
    }

    public static class TouchPoint implements android.os.Parcelable {
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
