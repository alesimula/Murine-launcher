package android.os;

public interface IInputConstants extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IInputConstants";
    public static final int UNMULTIPLIED_DEFAULT_DISPATCHING_TIMEOUT_MILLIS = 5000;
    public static final int INVALID_BATTERY_CAPACITY = -1;
    public static final int INVALID_INPUT_EVENT_ID = 0;
    public static final int INVALID_INPUT_DEVICE_ID = -2;
    public static final int POLICY_FLAG_INJECTED_FROM_ACCESSIBILITY = 131072;
    public static final int MOTION_EVENT_FLAG_WINDOW_IS_OBSCURED = 1;
    public static final int MOTION_EVENT_FLAG_WINDOW_IS_PARTIALLY_OBSCURED = 2;
    public static final int MOTION_EVENT_FLAG_HOVER_EXIT_PENDING = 4;
    public static final int MOTION_EVENT_FLAG_IS_GENERATED_GESTURE = 8;
    public static final int INPUT_EVENT_FLAG_CANCELED = 32;
    public static final int MOTION_EVENT_FLAG_NO_FOCUS_CHANGE = 64;
    public static final int MOTION_EVENT_PRIVATE_FLAG_SUPPORTS_ORIENTATION = 128;
    public static final int MOTION_EVENT_PRIVATE_FLAG_SUPPORTS_DIRECTIONAL_ORIENTATION = 256;
    public static final int INPUT_EVENT_FLAG_IS_ACCESSIBILITY_EVENT = 2048;
    public static final int INPUT_EVENT_FLAG_TAINTED = -2147483648;
    public static final int MOTION_EVENT_FLAG_TARGET_ACCESSIBILITY_FOCUS = 1073741824;
    public static final int DEFAULT_POINTER_ACCELERATION = 3;
    public static final int VELOCITY_TRACKER_STRATEGY_DEFAULT = -1;
    public static final int VELOCITY_TRACKER_STRATEGY_IMPULSE = 0;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ1 = 1;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ2 = 2;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ3 = 3;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_DELTA = 4;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_CENTRAL = 5;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_RECENT = 6;
    public static final int VELOCITY_TRACKER_STRATEGY_INT1 = 7;
    public static final int VELOCITY_TRACKER_STRATEGY_INT2 = 8;
    public static final int VELOCITY_TRACKER_STRATEGY_LEGACY = 9;
    public static final int DEVICE_CLASS_KEYBOARD = 1;
    public static final int DEVICE_CLASS_ALPHAKEY = 2;
    public static final int DEVICE_CLASS_TOUCH = 4;
    public static final int DEVICE_CLASS_CURSOR = 8;
    public static final int DEVICE_CLASS_TOUCH_MT = 16;
    public static final int DEVICE_CLASS_DPAD = 32;
    public static final int DEVICE_CLASS_GAMEPAD = 64;
    public static final int DEVICE_CLASS_SWITCH = 128;
    public static final int DEVICE_CLASS_JOYSTICK = 256;
    public static final int DEVICE_CLASS_VIBRATOR = 512;
    public static final int DEVICE_CLASS_MIC = 1024;
    public static final int DEVICE_CLASS_EXTERNAL_STYLUS = 2048;
    public static final int DEVICE_CLASS_ROTARY_ENCODER = 4096;
    public static final int DEVICE_CLASS_SENSOR = 8192;
    public static final int DEVICE_CLASS_BATTERY = 16384;
    public static final int DEVICE_CLASS_LIGHT = 32768;
    public static final int DEVICE_CLASS_TOUCHPAD = 65536;
    public static final int DEVICE_CLASS_VIRTUAL = 536870912;
    public static final int DEVICE_CLASS_EXTERNAL = 1073741824;

    public static class Default implements android.os.IInputConstants {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IInputConstants {
        public Stub() { super(); }
        public static android.os.IInputConstants asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IInputConstants {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
