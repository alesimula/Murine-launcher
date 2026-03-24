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
    public static final java.lang.String EXTRA_CYCLE_COUNT = "android.os.extra.CYCLE_COUNT";
    public static final java.lang.String EXTRA_CHARGING_STATUS = "android.os.extra.CHARGING_STATUS";
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_CAPACITY_LEVEL_UNSUPPORTED = -1;
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_CAPACITY_LEVEL_UNKNOWN = 0;
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_CAPACITY_LEVEL_CRITICAL = 1;
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_CAPACITY_LEVEL_LOW = 2;
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_CAPACITY_LEVEL_NORMAL = 3;
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_CAPACITY_LEVEL_HIGH = 4;
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_CAPACITY_LEVEL_FULL = 5;
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final java.lang.String EXTRA_CAPACITY_LEVEL = "android.os.extra.CAPACITY_LEVEL";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_EVENTS = "android.os.extra.EVENTS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_EVENT_TIMESTAMP = "android.os.extra.EVENT_TIMESTAMP";
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
    @android.annotation.SystemApi
    public static final int CHARGING_POLICY_DEFAULT = 1;
    @android.annotation.SystemApi
    public static final int CHARGING_POLICY_ADAPTIVE_AON = 2;
    @android.annotation.SystemApi
    public static final int CHARGING_POLICY_ADAPTIVE_AC = 3;
    @android.annotation.SystemApi
    public static final int CHARGING_POLICY_ADAPTIVE_LONGLIFE = 4;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int PART_STATUS_UNSUPPORTED = 0;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int PART_STATUS_ORIGINAL = 1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int PART_STATUS_REPLACED = 2;
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final int BATTERY_PLUGGED_ANY = 15;
    public static final java.lang.String ACTION_CHARGING = "android.os.action.CHARGING";
    public static final java.lang.String ACTION_DISCHARGING = "android.os.action.DISCHARGING";
    public static final int BATTERY_PROPERTY_CHARGE_COUNTER = 1;
    public static final int BATTERY_PROPERTY_CURRENT_NOW = 2;
    public static final int BATTERY_PROPERTY_CURRENT_AVERAGE = 3;
    public static final int BATTERY_PROPERTY_CAPACITY = 4;
    public static final int BATTERY_PROPERTY_ENERGY_COUNTER = 5;
    public static final int BATTERY_PROPERTY_STATUS = 6;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BATTERY_STATS")
    public static final int BATTERY_PROPERTY_MANUFACTURING_DATE = 7;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BATTERY_STATS")
    public static final int BATTERY_PROPERTY_FIRST_USAGE_DATE = 8;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BATTERY_STATS")
    public static final int BATTERY_PROPERTY_CHARGING_POLICY = 9;
    @android.annotation.FlaggedApi("android.os.state_of_health_public")
    public static final int BATTERY_PROPERTY_STATE_OF_HEALTH = 10;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BATTERY_STATS")
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_PROPERTY_SERIAL_NUMBER = 11;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BATTERY_STATS")
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public static final int BATTERY_PROPERTY_PART_STATUS = 12;
    public static boolean isAdaptiveChargingPolicy(int p0) { return false; }
    public BatteryManager() {}
    public BatteryManager(android.content.Context p0, com.android.internal.app.IBatteryStats p1, android.os.IBatteryPropertiesRegistrar p2) {}
    public boolean isCharging() { return false; }
    public int getIntProperty(int p0) { return 0; }
    public long getLongProperty(int p0) { return 0L; }
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("android.os.battery_part_status_api")
    public java.lang.String getStringProperty(int p0) { return null; }
    public static boolean isPlugWired(int p0) { return false; }
    public long computeChargeTimeRemaining() { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.POWER_SAVER")
    public boolean setChargingStateUpdateDelayMillis(int p0) { return false; }
}
