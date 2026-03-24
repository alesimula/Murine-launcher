package android.os;

public class BatteryManager {
    public static final java.lang.String EXTRA_STATUS = "status";
    public static final java.lang.String EXTRA_HEALTH = "health";
    public static final java.lang.String EXTRA_PRESENT = "present";
    public static final java.lang.String EXTRA_LEVEL = "level";
    public static final java.lang.String EXTRA_BATTERY_LOW = "battery_low";
    public static final java.lang.String EXTRA_SCALE = "scale";
    public static final java.lang.String EXTRA_ICON_SMALL = "icon-small";
    public static final java.lang.String EXTRA_PLUGGED = "plugged";
    public static final java.lang.String EXTRA_VOLTAGE = "voltage";
    public static final java.lang.String EXTRA_TEMPERATURE = "temperature";
    public static final java.lang.String EXTRA_TECHNOLOGY = "technology";
    public static final java.lang.String EXTRA_INVALID_CHARGER = "invalid_charger";
    public static final java.lang.String EXTRA_MAX_CHARGING_CURRENT = "max_charging_current";
    public static final java.lang.String EXTRA_MAX_CHARGING_VOLTAGE = "max_charging_voltage";
    public static final java.lang.String EXTRA_CHARGE_COUNTER = "charge_counter";
    public static final java.lang.String EXTRA_SEQUENCE = "seq";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_EVENTS = "android.os.extra.EVENTS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_EVENT_TIMESTAMP = "android.os.extra.EVENT_TIMESTAMP";
    public static final java.lang.String EXTRA_MOD_FLAG = "mod_flag";
    public static final java.lang.String EXTRA_MOD_LEVEL = "mod_level";
    public static final java.lang.String EXTRA_MOD_POWER_SOURCE = "mod_psrc";
    public static final java.lang.String EXTRA_MOD_STATUS = "mod_status";
    public static final java.lang.String EXTRA_MOD_TYPE = "mod_type";
    public static final java.lang.String EXTRA_PLUGGED_RAW = "plugged_raw";
    public static final int BATTERY_PROPERTY_MOD_CHARGE_FULL = 100;
    public static final int BATTERY_PROPERTY_CHARGE_FULL = 101;
    public static final int BATTERY_PLUGGED_MOD = 8;
    public static final int BATTERY_STATUS_UNKNOWN = 1;
    public static final int BATTERY_STATUS_CHARGING = 2;
    public static final int BATTERY_STATUS_DISCHARGING = 3;
    public static final int BATTERY_STATUS_NOT_CHARGING = 4;
    public static final int BATTERY_STATUS_FULL = 5;
    public static final int BATTERY_HEALTH_UNKNOWN = 1;
    public static final int BATTERY_HEALTH_GOOD = 2;
    public static final int BATTERY_HEALTH_OVERHEAT = 3;
    public static final int BATTERY_HEALTH_DEAD = 4;
    public static final int BATTERY_HEALTH_OVER_VOLTAGE = 5;
    public static final int BATTERY_HEALTH_UNSPECIFIED_FAILURE = 6;
    public static final int BATTERY_HEALTH_COLD = 7;
    public static final int BATTERY_PLUGGED_AC = 1;
    public static final int BATTERY_PLUGGED_USB = 2;
    public static final int BATTERY_PLUGGED_WIRELESS = 4;
    public static final int BATTERY_PLUGGED_DOCK = 8;
    public static final int BATTERY_PLUGGED_ANY = 15;
    public static final java.lang.String ACTION_CHARGING = "android.os.action.CHARGING";
    public static final java.lang.String ACTION_DISCHARGING = "android.os.action.DISCHARGING";
    public static final int BATTERY_PROPERTY_CHARGE_COUNTER = 1;
    public static final int BATTERY_PROPERTY_CURRENT_NOW = 2;
    public static final int BATTERY_PROPERTY_CURRENT_AVERAGE = 3;
    public static final int BATTERY_PROPERTY_CAPACITY = 4;
    public static final int BATTERY_PROPERTY_ENERGY_COUNTER = 5;
    public static final int BATTERY_PROPERTY_STATUS = 6;
    public BatteryManager() {}
    public BatteryManager(android.content.Context p0, com.android.internal.app.IBatteryStats p1, android.os.IBatteryPropertiesRegistrar p2) {}
    public boolean isCharging() { return false; }
    public int getIntProperty(int p0) { return 0; }
    public long getLongProperty(int p0) { return 0L; }
    public static boolean isPlugWired(int p0) { return false; }
    public long computeChargeTimeRemaining() { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.POWER_SAVER")
    public boolean setChargingStateUpdateDelayMillis(int p0) { return false; }
}
