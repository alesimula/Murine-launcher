package android.location;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.location.flags.gnss_assistance_interface")
public final class IonosphericCorrection implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.IonosphericCorrection> CREATOR = null;
    public IonosphericCorrection(long p0, android.location.GnssCorrectionComponent p1) {}
    public long getCarrierFrequencyHz() { return 0L; }
    @android.annotation.NonNull
    public android.location.GnssCorrectionComponent getIonosphericCorrection() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}
