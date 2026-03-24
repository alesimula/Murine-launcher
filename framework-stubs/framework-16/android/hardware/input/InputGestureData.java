package android.hardware.input;

public final class InputGestureData {
    public static final int TOUCHPAD_GESTURE_TYPE_UNKNOWN = 0;
    public static final int TOUCHPAD_GESTURE_TYPE_THREE_FINGER_TAP = 1;
    public InputGestureData(android.hardware.input.AidlInputGestureData p0) {}
    public android.hardware.input.InputGestureData.Trigger getTrigger() { return null; }
    public android.hardware.input.InputGestureData.Action getAction() { return null; }
    public android.hardware.input.AidlInputGestureData getAidlData() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static android.hardware.input.InputGestureData.Trigger createKeyTrigger(int p0, int p1) { return null; }
    public static android.hardware.input.InputGestureData.Trigger createTouchpadTrigger(int p0) { return null; }
    public static android.hardware.input.InputGestureData.Trigger createTriggerFromAidlTrigger(android.hardware.input.AidlInputGestureData.Trigger p0) { return null; }

    public static final record Action(int keyGestureType, android.hardware.input.AppLaunchData appLaunchData) {
        public Action(int keyGestureType, android.hardware.input.AppLaunchData appLaunchData) { this.keyGestureType = keyGestureType; this.appLaunchData = appLaunchData; }
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public int keyGestureType() { return 0; }
        @android.annotation.Nullable
        public android.hardware.input.AppLaunchData appLaunchData() { return null; }
    }

    public static class Builder {
        public Builder() {}
        public android.hardware.input.InputGestureData.Builder setTrigger(android.hardware.input.InputGestureData.Trigger p0) { return null; }
        public android.hardware.input.InputGestureData.Builder setKeyGestureType(int p0) { return null; }
        public android.hardware.input.InputGestureData.Builder setAppLaunchData(android.hardware.input.AppLaunchData p0) { return null; }
        public android.hardware.input.InputGestureData build() throws java.lang.IllegalArgumentException { return null; }
    }

    public static enum Filter {
        KEY,
        TOUCHPAD;
        @android.annotation.Nullable
        public static android.hardware.input.InputGestureData.Filter of(int p0) { return null; }
        @android.hardware.input.AidlInputGestureData.Trigger.Tag
        public int getTag() { return 0; }
        public boolean matches(android.hardware.input.InputGestureData p0) { return false; }
    }

    public static class KeyTrigger implements android.hardware.input.InputGestureData.Trigger {
        android.hardware.input.AidlInputGestureData.KeyTrigger mAidlKeyTrigger;
        public int getKeycode() { return 0; }
        public int getModifierState() { return 0; }
        public android.hardware.input.AidlInputGestureData.Trigger getAidlTrigger() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static class TouchpadTrigger implements android.hardware.input.InputGestureData.Trigger {
        android.hardware.input.AidlInputGestureData.TouchpadGestureTrigger mAidlTouchpadTrigger;
        public int getTouchpadGestureType() { return 0; }
        public android.hardware.input.AidlInputGestureData.Trigger getAidlTrigger() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static interface Trigger {
        public android.hardware.input.AidlInputGestureData.Trigger getAidlTrigger();
    }
}
