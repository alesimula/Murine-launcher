package android.os;

@android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
public final class PowerMonitor implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public static final int POWER_MONITOR_TYPE_CONSUMER = 0;
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public static final int POWER_MONITOR_TYPE_MEASUREMENT = 1;
    public final int index = 0;
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.PowerMonitor> CREATOR = null;
    public PowerMonitor(int p0, int p1, java.lang.String p2) {}
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public int getType() { return 0; }
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.FlaggedApi("com.android.server.power.optimization.power_monitor_api")
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerMonitorType {
    }
}
