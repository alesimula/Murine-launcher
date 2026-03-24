package android.accessibilityservice;

public final class AccessibilityGestureEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.accessibilityservice.AccessibilityGestureEvent> CREATOR = null;
    public AccessibilityGestureEvent(int p0, int p1, java.util.List<android.view.MotionEvent> p2) {}
    public AccessibilityGestureEvent(int p0, int p1) {}
    public int getDisplayId() { return 0; }
    public int getGestureId() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.view.MotionEvent> getMotionEvents() { return null; }
    @android.annotation.NonNull
    public android.accessibilityservice.AccessibilityGestureEvent copyForAsync() { return null; }
    public void recycle() {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String gestureIdToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GestureId {
    }
}
