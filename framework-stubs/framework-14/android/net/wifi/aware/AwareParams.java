package android.net.wifi.aware;

public final class AwareParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.AwareParams> CREATOR = null;
    public static final int UNSET_PARAMETER = -1;
    public AwareParams() {}
    public void setDiscoveryWindowWakeInterval24Ghz(int p0) {}
    public void setDiscoveryWindowWakeInterval5Ghz(int p0) {}
    public void setDiscoveryBeaconIntervalMillis(int p0) {}
    public void setNumSpatialStreamsInDiscovery(int p0) {}
    public void setMacRandomizationIntervalSeconds(int p0) {}
    public void setDwEarlyTerminationEnabled(boolean p0) {}
    public int getDiscoveryWindowWakeInterval24Ghz() { return 0; }
    public int getDiscoveryWindowWakeInterval5Ghz() { return 0; }
    public int getDiscoveryBeaconIntervalMillis() { return 0; }
    public int getNumSpatialStreamsInDiscovery() { return 0; }
    public boolean isDwEarlyTerminationEnabled() { return false; }
    public int getMacRandomizationIntervalSeconds() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
