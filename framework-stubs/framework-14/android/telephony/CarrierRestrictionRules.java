package android.telephony;

@android.annotation.SystemApi
public final class CarrierRestrictionRules implements android.os.Parcelable {
    public static final int CARRIER_RESTRICTION_DEFAULT_NOT_ALLOWED = 0;
    public static final int CARRIER_RESTRICTION_DEFAULT_ALLOWED = 1;
    public static final int MULTISIM_POLICY_NONE = 0;
    public static final int MULTISIM_POLICY_ONE_VALID_SIM_MUST_BE_PRESENT = 1;
    public static final android.os.Parcelable.Creator<android.telephony.CarrierRestrictionRules> CREATOR = null;
    public static android.telephony.CarrierRestrictionRules.Builder newBuilder() { return null; }
    public boolean isAllCarriersAllowed() { return false; }
    public java.util.List<android.service.carrier.CarrierIdentifier> getAllowedCarriers() { return null; }
    public java.util.List<android.service.carrier.CarrierIdentifier> getExcludedCarriers() { return null; }
    public int getDefaultCarrierRestriction() { return 0; }
    public int getMultiSimPolicy() { return 0; }
    public java.util.List<java.lang.Boolean> areCarrierIdentifiersAllowed(java.util.List<android.service.carrier.CarrierIdentifier> p0) { return null; }
    public int getCarrierRestrictionStatus() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.telephony.CarrierRestrictionRules build() { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setAllCarriersAllowed() { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setAllowedCarriers(java.util.List<android.service.carrier.CarrierIdentifier> p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setExcludedCarriers(java.util.List<android.service.carrier.CarrierIdentifier> p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setDefaultCarrierRestriction(int p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setMultiSimPolicy(int p0) { return null; }
        public android.telephony.CarrierRestrictionRules.Builder setCarrierRestrictionStatus(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CarrierRestrictionDefault {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MultiSimPolicy {
    }
}
