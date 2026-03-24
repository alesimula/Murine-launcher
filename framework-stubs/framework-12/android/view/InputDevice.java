package android.view;

public final class InputDevice implements android.os.Parcelable {
    private final int mId = 0;
    private final int mGeneration = 0;
    private final int mControllerNumber = 0;
    private final java.lang.String mName = null;
    private final int mVendorId = 0;
    private final int mProductId = 0;
    private final java.lang.String mDescriptor = null;
    private final android.hardware.input.InputDeviceIdentifier mIdentifier = null;
    private final boolean mIsExternal = false;
    private final int mSources = 0;
    private final int mKeyboardType = 0;
    private final android.view.KeyCharacterMap mKeyCharacterMap = null;
    private final boolean mHasVibrator = false;
    private final boolean mHasMicrophone = false;
    private final boolean mHasButtonUnderPad = false;
    private final boolean mHasSensor = false;
    private final boolean mHasBattery = false;
    private final java.util.ArrayList<android.view.InputDevice.MotionRange> mMotionRanges = null;
    private android.os.Vibrator mVibrator;
    private android.os.VibratorManager mVibratorManager;
    private android.hardware.SensorManager mSensorManager;
    private android.hardware.BatteryState mBatteryState;
    private android.hardware.lights.LightsManager mLightsManager;
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
    private static final int MAX_RANGES = 1000;
    private static final int VIBRATOR_ID_ALL = -1;
    public static final android.os.Parcelable.Creator<android.view.InputDevice> CREATOR = null;
    public InputDevice(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, java.lang.String p6, boolean p7, int p8, int p9, android.view.KeyCharacterMap p10, boolean p11, boolean p12, boolean p13, boolean p14, boolean p15) {}
    private InputDevice(android.os.Parcel p0) {}
    public static android.view.InputDevice getDevice(int p0) { return null; }
    public static int[] getDeviceIds() { return null; }
    public int getId() { return 0; }
    public int getControllerNumber() { return 0; }
    public android.hardware.input.InputDeviceIdentifier getIdentifier() { return null; }
    public int getGeneration() { return 0; }
    public int getVendorId() { return 0; }
    public int getProductId() { return 0; }
    public java.lang.String getDescriptor() { return null; }
    public boolean isVirtual() { return false; }
    public boolean isExternal() { return false; }
    public boolean isFullKeyboard() { return false; }
    public java.lang.String getName() { return null; }
    public int getSources() { return 0; }
    public boolean supportsSource(int p0) { return false; }
    public int getKeyboardType() { return 0; }
    public android.view.KeyCharacterMap getKeyCharacterMap() { return null; }
    public boolean[] hasKeys(int... p0) { return null; }
    public android.view.InputDevice.MotionRange getMotionRange(int p0) { return null; }
    public android.view.InputDevice.MotionRange getMotionRange(int p0, int p1) { return null; }
    public java.util.List<android.view.InputDevice.MotionRange> getMotionRanges() { return null; }
    private void addMotionRange(int p0, int p1, float p2, float p3, float p4, float p5, float p6) {}
    @java.lang.Deprecated
    public android.os.Vibrator getVibrator() { return null; }
    public android.os.VibratorManager getVibratorManager() { return null; }
    public android.hardware.BatteryState getBatteryState() { return null; }
    public android.hardware.lights.LightsManager getLightsManager() { return null; }
    public android.hardware.SensorManager getSensorManager() { return null; }
    public boolean isEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.DISABLE_INPUT_DEVICE")
    public void enable() {}
    @android.annotation.RequiresPermission("android.permission.DISABLE_INPUT_DEVICE")
    public void disable() {}
    public boolean hasMicrophone() { return false; }
    public boolean hasButtonUnderPad() { return false; }
    public boolean hasSensor() { return false; }
    public void setPointerType(int p0) {}
    public void setCustomPointerIcon(android.view.PointerIcon p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    private void appendSourceDescriptionIfApplicable(java.lang.StringBuilder p0, int p1, java.lang.String p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface InputSourceClass {
    }

    public static final class MotionRange {
        private int mAxis;
        private int mSource;
        private float mMin;
        private float mMax;
        private float mFlat;
        private float mFuzz;
        private float mResolution;
        private MotionRange(int p0, int p1, float p2, float p3, float p4, float p5, float p6) {}
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
}
