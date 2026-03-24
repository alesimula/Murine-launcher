package android.telephony.satellite;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.satellite_system_apis")
public final class SatelliteSubscriberInfo implements android.os.Parcelable {
    public static final int SUBSCRIBER_ID_TYPE_ICCID = 0;
    public static final int SUBSCRIBER_ID_TYPE_IMSI_MSISDN = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteSubscriberInfo> CREATOR = null;
    public SatelliteSubscriberInfo(android.telephony.satellite.SatelliteSubscriberInfo.Builder p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getSubscriberId() { return null; }
    public int getCarrierId() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getNiddApn() { return null; }
    public int getSubscriptionId() { return 0; }
    public int getSubscriberIdType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setSubscriberId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setCarrierId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setNiddApn(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setSubscriptionId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setSubscriberIdType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.satellite.SatelliteSubscriberInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubscriberIdType {
    }
}
