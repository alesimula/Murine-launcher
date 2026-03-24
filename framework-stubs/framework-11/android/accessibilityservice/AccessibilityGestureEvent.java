package android.accessibilityservice;

public final class AccessibilityGestureEvent implements android.os.Parcelable {
    private final int mGestureId = 0;
    private final int mDisplayId = 0;
    public static final android.os.Parcelable.Creator<android.accessibilityservice.AccessibilityGestureEvent> CREATOR = null;
    public AccessibilityGestureEvent(int p0, int p1) {}
    private AccessibilityGestureEvent(android.os.Parcel p0) {}
    public int getDisplayId() { return 0; }
    public int getGestureId() { return 0; }
    public java.lang.String toString() { return null; }
    private static java.lang.String eventTypeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GestureId {
    }
}
