package android.hardware.gnss;

public class GnssPowerStats implements android.os.Parcelable {
    public android.hardware.gnss.ElapsedRealtime elapsedRealtime;
    public double totalEnergyMilliJoule;
    public double singlebandTrackingModeEnergyMilliJoule;
    public double multibandTrackingModeEnergyMilliJoule;
    public double singlebandAcquisitionModeEnergyMilliJoule;
    public double multibandAcquisitionModeEnergyMilliJoule;
    public double[] otherModesEnergyMilliJoule;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssPowerStats> CREATOR = null;
    public GnssPowerStats() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
