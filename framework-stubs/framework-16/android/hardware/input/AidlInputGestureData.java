package android.hardware.input;

public class AidlInputGestureData implements android.os.Parcelable {
    public android.hardware.input.AidlInputGestureData.Trigger trigger;
    public int gestureType;
    public java.lang.String appLaunchCategory;
    public java.lang.String appLaunchRole;
    public java.lang.String appLaunchPackageName;
    public java.lang.String appLaunchClassName;
    public static final android.os.Parcelable.Creator<android.hardware.input.AidlInputGestureData> CREATOR = null;
    public AidlInputGestureData() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static class KeyTrigger implements android.os.Parcelable {
        public int keycode;
        public int modifierState;
        public static final android.os.Parcelable.Creator<android.hardware.input.AidlInputGestureData.KeyTrigger> CREATOR = null;
        public KeyTrigger() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
    }

    public static class TouchpadGestureTrigger implements android.os.Parcelable {
        public int gestureType;
        public static final android.os.Parcelable.Creator<android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger> CREATOR = null;
        public TouchpadGestureTrigger() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
    }

    public static final class Trigger implements android.os.Parcelable {
        public static final int key = 0;
        public static final int touchpadGesture = 1;
        public static final android.os.Parcelable.Creator<android.hardware.input.AidlInputGestureData.Trigger> CREATOR = null;
        public Trigger() {}
        public int getTag() { return 0; }
        public static android.hardware.input.AidlInputGestureData.Trigger key(android.hardware.input.AidlInputGestureData.KeyTrigger p0) { return null; }
        public android.hardware.input.AidlInputGestureData.KeyTrigger getKey() { return null; }
        public void setKey(android.hardware.input.AidlInputGestureData.KeyTrigger p0) {}
        public static android.hardware.input.AidlInputGestureData.Trigger touchpadGesture(android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger p0) { return null; }
        public android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger getTouchpadGesture() { return null; }
        public void setTouchpadGesture(android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }

        public static @interface Tag {
            public static final int key = 0;
            public static final int touchpadGesture = 1;
        }
    }
}
