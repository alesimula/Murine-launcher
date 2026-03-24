package android.bluetooth;

public interface BluetoothDevicePicker {
    public static final java.lang.String ACTION_DEVICE_SELECTED = "android.bluetooth.devicepicker.action.DEVICE_SELECTED";
    public static final java.lang.String ACTION_LAUNCH = "android.bluetooth.devicepicker.action.LAUNCH";
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.opp_device_picker_extra_intent_apis")
    public static final java.lang.String EXTRA_DEVICE_PICKER_ORIGINAL_SEND_INTENT = "android.bluetooth.extra.DEVICE_PICKER_ORIGINAL_SEND_INTENT";
    public static final java.lang.String EXTRA_FILTER_TYPE = "android.bluetooth.devicepicker.extra.FILTER_TYPE";
    public static final java.lang.String EXTRA_LAUNCH_CLASS = "android.bluetooth.devicepicker.extra.DEVICE_PICKER_LAUNCH_CLASS";
    public static final java.lang.String EXTRA_LAUNCH_PACKAGE = "android.bluetooth.devicepicker.extra.LAUNCH_PACKAGE";
    public static final java.lang.String EXTRA_NEED_AUTH = "android.bluetooth.devicepicker.extra.NEED_AUTH";
    public static final int FILTER_TYPE_ALL = 0;
    public static final int FILTER_TYPE_AUDIO = 1;
    public static final int FILTER_TYPE_NAP = 4;
    public static final int FILTER_TYPE_PANU = 3;
    public static final int FILTER_TYPE_TRANSFER = 2;
}
