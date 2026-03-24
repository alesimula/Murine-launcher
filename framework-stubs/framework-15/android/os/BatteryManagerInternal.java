package android.os;

public abstract class BatteryManagerInternal {
    public BatteryManagerInternal() {}
    public abstract boolean isPowered(int p0);
    public abstract int getPlugType();
    public abstract int getBatteryLevel();
    public abstract int getBatteryHealth();
    public abstract int getBatteryChargeCounter();
    public abstract int getBatteryFullCharge();
    public abstract boolean getBatteryLevelLow();
    public abstract void registerChargingPolicyChangeListener(android.os.BatteryManagerInternal.ChargingPolicyChangeListener p0);
    public abstract int getChargingPolicy();
    public abstract int getInvalidCharger();
    public abstract void setChargerAcOnline(boolean p0, boolean p1);
    public abstract void setBatteryLevel(int p0, boolean p1);
    public abstract void unplugBattery(boolean p0);
    public abstract void resetBattery(boolean p0);
    public abstract void suspendBatteryInput();

    public static interface ChargingPolicyChangeListener {
        public void onChargingPolicyChanged(int p0);
    }
}
