package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
public final class SatelliteSubscriberProvisionStatus implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteSubscriberProvisionStatus> CREATOR = null;
    public SatelliteSubscriberProvisionStatus(android.telephony.satellite.SatelliteSubscriberProvisionStatus.Builder p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.telephony.satellite.SatelliteSubscriberInfo getSatelliteSubscriberInfo() { return null; }
    public boolean isProvisioned() { return false; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberProvisionStatus.Builder setSatelliteSubscriberInfo(android.telephony.satellite.SatelliteSubscriberInfo p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberProvisionStatus.Builder setProvisioned(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberProvisionStatus build() { return null; }
    }
}
