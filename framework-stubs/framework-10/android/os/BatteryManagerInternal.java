package android.os;

public abstract class BatteryManagerInternal {
    public BatteryManagerInternal() {}
    public abstract boolean isPowered(int p0);
    public abstract int getPlugType();
    public abstract int getBatteryLevel();
    public abstract int getBatteryChargeCounter();
    public abstract int getBatteryFullCharge();
    public abstract boolean getBatteryLevelLow();
    public abstract int getInvalidCharger();
}
