package android.hardware.input;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_stylus")
public final class VirtualStylusMotionEvent implements android.os.Parcelable {
    public static final int TOOL_TYPE_UNKNOWN = 0;
    public static final int TOOL_TYPE_STYLUS = 2;
    public static final int TOOL_TYPE_ERASER = 4;
    public static final int ACTION_UNKNOWN = -1;
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_UP = 1;
    public static final int ACTION_MOVE = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualStylusMotionEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getToolType() { return 0; }
    public int getAction() { return 0; }
    public int getX() { return 0; }
    public int getY() { return 0; }
    public int getPressure() { return 0; }
    public int getTiltX() { return 0; }
    public int getTiltY() { return 0; }
    public long getEventTimeNanos() { return 0L; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    @android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_stylus")
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent build() { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent.Builder setToolType(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent.Builder setAction(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent.Builder setX(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent.Builder setY(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent.Builder setPressure(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent.Builder setTiltX(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent.Builder setTiltY(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusMotionEvent.Builder setEventTimeNanos(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ToolType {
    }
}
