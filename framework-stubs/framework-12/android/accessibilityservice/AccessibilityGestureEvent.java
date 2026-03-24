package android.accessibilityservice;

public final class AccessibilityGestureEvent implements android.os.Parcelable {
    private final int mGestureId = 0;
    private final int mDisplayId = 0;
    private java.util.List<android.view.MotionEvent> mMotionEvents;
    public static final android.os.Parcelable.Creator<android.accessibilityservice.AccessibilityGestureEvent> CREATOR = null;
    public AccessibilityGestureEvent(int p0, int p1, java.util.List<android.view.MotionEvent> p2) {}
    public AccessibilityGestureEvent(int p0, int p1) {}
    private AccessibilityGestureEvent(android.os.Parcel p0) {}
    public int getDisplayId() { return 0; }
    public int getGestureId() { return 0; }
    public java.util.List<android.view.MotionEvent> getMotionEvents() { return null; }
    public java.lang.String toString() { return null; }
    public static java.lang.String gestureIdToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GestureId {
    }
}
