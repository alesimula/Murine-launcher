package android.view;

public final class InputDevice implements android.os.Parcelable {
    public static final int SOURCE_CLASS_MASK = 255;
    public static final int SOURCE_CLASS_NONE = 0;
    public static final int SOURCE_CLASS_BUTTON = 1;
    public static final int SOURCE_CLASS_POINTER = 2;
    public static final int SOURCE_CLASS_TRACKBALL = 4;
    public static final int SOURCE_CLASS_POSITION = 8;
    public static final int SOURCE_CLASS_JOYSTICK = 16;
    public static final int SOURCE_UNKNOWN = 0;
    public static final int SOURCE_KEYBOARD = 257;
    public static final int SOURCE_DPAD = 513;
    public static final int SOURCE_GAMEPAD = 1025;
    public static final int SOURCE_TOUCHSCREEN = 4098;
    public static final int SOURCE_MOUSE = 8194;
    public static final int SOURCE_STYLUS = 16386;
    public static final int SOURCE_BLUETOOTH_STYLUS = 49154;
    public static final int SOURCE_TRACKBALL = 65540;
    public static final int SOURCE_MOUSE_RELATIVE = 131076;
    public static final int SOURCE_TOUCHPAD = 1048584;
    public static final int SOURCE_TOUCH_NAVIGATION = 2097152;
    public static final int SOURCE_ROTARY_ENCODER = 4194304;
    public static final int SOURCE_JOYSTICK = 16777232;
    public static final int SOURCE_HDMI = 33554433;
    public static final int SOURCE_SENSOR = 67108864;
    public static final int SOURCE_ANY = -256;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_X = 0;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_Y = 1;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_PRESSURE = 2;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_SIZE = 3;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_TOUCH_MAJOR = 4;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_TOUCH_MINOR = 5;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_TOOL_MAJOR = 6;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_TOOL_MINOR = 7;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_ORIENTATION = 8;
    public static final int KEYBOARD_TYPE_NONE = 0;
    public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
    public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.InputDevice> CREATOR = null;
    @android.annotation.Nullable
    public static android.view.InputDevice getDevice(int p0) { return null; }
    public static int[] getDeviceIds() { return null; }
    public int getId() { return 0; }
    public int getControllerNumber() { return 0; }
    @android.annotation.NonNull
    public android.hardware.input.InputDeviceIdentifier getIdentifier() { return null; }
    public int getGeneration() { return 0; }
    public int getVendorId() { return 0; }
    public int getProductId() { return 0; }
    public int getDeviceBus() { return 0; }
    public java.lang.String getDescriptor() { return null; }
    public boolean isVirtual() { return false; }
    public boolean isExternal() { return false; }
    public boolean isFullKeyboard() { return false; }
    public java.lang.String getName() { return null; }
    public int getSources() { return 0; }
    public boolean supportsSource(int p0) { return false; }
    public int getKeyboardType() { return 0; }
    public android.view.KeyCharacterMap getKeyCharacterMap() { return null; }
    @android.annotation.Nullable
    public java.lang.String getKeyboardLanguageTag() { return null; }
    @android.annotation.Nullable
    public java.lang.String getKeyboardLayoutType() { return null; }
    public boolean[] hasKeys(int... p0) { return null; }
    public int getKeyCodeForKeyLocation(int p0) { return 0; }
    public android.view.InputDevice.MotionRange getMotionRange(int p0) { return null; }
    public android.view.InputDevice.MotionRange getMotionRange(int p0, int p1) { return null; }
    public java.util.List<android.view.InputDevice.MotionRange> getMotionRanges() { return null; }
    @android.annotation.NonNull
    public android.view.InputDevice.ViewBehavior getViewBehavior() { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH")
    @android.annotation.Nullable
    public java.lang.String getBluetoothAddress() { return null; }
    @java.lang.Deprecated
    public android.os.Vibrator getVibrator() { return null; }
    @android.annotation.NonNull
    public android.os.VibratorManager getVibratorManager() { return null; }
    @android.annotation.NonNull
    public android.hardware.BatteryState getBatteryState() { return null; }
    @android.annotation.NonNull
    public android.hardware.lights.LightsManager getLightsManager() { return null; }
    @android.annotation.NonNull
    public android.hardware.SensorManager getSensorManager() { return null; }
    public boolean isEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.DISABLE_INPUT_DEVICE")
    public void enable() {}
    @android.annotation.RequiresPermission("android.permission.DISABLE_INPUT_DEVICE")
    public void disable() {}
    public boolean hasMicrophone() { return false; }
    public boolean hasSensor() { return false; }
    public boolean hasBattery() { return false; }
    @android.annotation.Nullable
    public android.hardware.input.HostUsiVersion getHostUsiVersion() { return null; }
    public int getAssociatedDisplayId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder() {}
        public android.view.InputDevice.Builder setId(int p0) { return null; }
        public android.view.InputDevice.Builder setGeneration(int p0) { return null; }
        public android.view.InputDevice.Builder setControllerNumber(int p0) { return null; }
        public android.view.InputDevice.Builder setName(java.lang.String p0) { return null; }
        public android.view.InputDevice.Builder setVendorId(int p0) { return null; }
        public android.view.InputDevice.Builder setProductId(int p0) { return null; }
        public android.view.InputDevice.Builder setDeviceBus(int p0) { return null; }
        public android.view.InputDevice.Builder setDescriptor(java.lang.String p0) { return null; }
        public android.view.InputDevice.Builder setExternal(boolean p0) { return null; }
        public android.view.InputDevice.Builder setSources(int p0) { return null; }
        public android.view.InputDevice.Builder setKeyboardType(int p0) { return null; }
        public android.view.InputDevice.Builder setKeyCharacterMap(android.view.KeyCharacterMap p0) { return null; }
        public android.view.InputDevice.Builder setHasVibrator(boolean p0) { return null; }
        public android.view.InputDevice.Builder setHasMicrophone(boolean p0) { return null; }
        public android.view.InputDevice.Builder setHasSensor(boolean p0) { return null; }
        public android.view.InputDevice.Builder setHasBattery(boolean p0) { return null; }
        public android.view.InputDevice.Builder setKeyboardLanguageTag(java.lang.String p0) { return null; }
        public android.view.InputDevice.Builder setKeyboardLayoutType(java.lang.String p0) { return null; }
        public android.view.InputDevice.Builder setUsiVersion(android.hardware.input.HostUsiVersion p0) { return null; }
        public android.view.InputDevice.Builder setAssociatedDisplayId(int p0) { return null; }
        public android.view.InputDevice.Builder setEnabled(boolean p0) { return null; }
        public android.view.InputDevice.Builder addMotionRange(int p0, int p1, float p2, float p3, float p4, float p5, float p6) { return null; }
        public android.view.InputDevice.Builder setShouldSmoothScroll(boolean p0) { return null; }
        public android.view.InputDevice build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface InputSourceClass {
    }

    public static final class MotionRange {
        public int getAxis() { return 0; }
        public int getSource() { return 0; }
        public boolean isFromSource(int p0) { return false; }
        public float getMin() { return 0.0f; }
        public float getMax() { return 0.0f; }
        public float getRange() { return 0.0f; }
        public float getFlat() { return 0.0f; }
        public float getFuzz() { return 0.0f; }
        public float getResolution() { return 0.0f; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Source {
    }

    @android.annotation.FlaggedApi("com.android.input.flags.input_device_view_behavior_api")
    public static final class ViewBehavior {
        public ViewBehavior(android.view.InputDevice p0) {}
        @android.annotation.FlaggedApi("com.android.input.flags.input_device_view_behavior_api")
        public boolean shouldSmoothScroll(int p0, int p1) { return false; }
    }
}
