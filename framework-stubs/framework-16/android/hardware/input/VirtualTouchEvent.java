package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualTouchEvent implements android.os.Parcelable {
    public static final int TOOL_TYPE_UNKNOWN = 0;
    public static final int TOOL_TYPE_FINGER = 1;
    public static final int TOOL_TYPE_PALM = 5;
    public static final int ACTION_UNKNOWN = -1;
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_UP = 1;
    public static final int ACTION_MOVE = 2;
    public static final int ACTION_CANCEL = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualTouchEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public int getPointerId() { return 0; }
    public int getToolType() { return 0; }
    public int getAction() { return 0; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getPressure() { return 0.0f; }
    public float getMajorAxisSize() { return 0.0f; }
    public long getEventTimeNanos() { return 0L; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent build() { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent.Builder setPointerId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent.Builder setToolType(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent.Builder setAction(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent.Builder setX(float p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent.Builder setY(float p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent.Builder setPressure(float p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent.Builder setMajorAxisSize(float p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchEvent.Builder setEventTimeNanos(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ToolType {
    }
}
