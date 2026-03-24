package android.hardware.gnss.measurement_corrections;

public class MeasurementCorrections implements android.os.Parcelable {
    public double latitudeDegrees;
    public double longitudeDegrees;
    public double altitudeMeters;
    public double horizontalPositionUncertaintyMeters;
    public double verticalPositionUncertaintyMeters;
    public long toaGpsNanosecondsOfWeek;
    public android.hardware.gnss.measurement_corrections.SingleSatCorrection[] satCorrections;
    public boolean hasEnvironmentBearing;
    public float environmentBearingDegrees;
    public float environmentBearingUncertaintyDegrees;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.measurement_corrections.MeasurementCorrections> CREATOR = null;
    public MeasurementCorrections() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
