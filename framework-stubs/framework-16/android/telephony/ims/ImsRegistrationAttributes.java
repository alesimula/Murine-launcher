package android.telephony.ims;

public final class ImsRegistrationAttributes implements android.os.Parcelable {
    public static final int ATTR_EPDG_OVER_CELL_INTERNET = 1;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_registration_state")
    public static final int ATTR_REGISTRATION_TYPE_EMERGENCY = 2;
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_registration_state")
    public static final int ATTR_VIRTUAL_FOR_ANONYMOUS_EMERGENCY_CALL = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsRegistrationAttributes> CREATOR = null;
    public ImsRegistrationAttributes(int p0, int p1, int p2, java.util.Set<java.lang.String> p3) {}
    public ImsRegistrationAttributes(int p0, int p1, int p2, java.util.Set<java.lang.String> p3, android.telephony.ims.SipDetails p4) {}
    public ImsRegistrationAttributes(android.os.Parcel p0) {}
    @android.annotation.SystemApi
    public int getRegistrationTechnology() { return 0; }
    public int getTransportType() { return 0; }
    public int getAttributeFlags() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_registration_state")
    public boolean getFlagRegistrationTypeEmergency() { return false; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_registration_state")
    public boolean getFlagVirtualRegistrationForEmergencyCall() { return false; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getFeatureTags() { return null; }
    @android.annotation.Nullable
    public android.telephony.ims.SipDetails getSipDetails() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.telephony.ims.ImsRegistrationAttributes.Builder setFeatureTags(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.ImsRegistrationAttributes.Builder setSipDetails(android.telephony.ims.SipDetails p0) { return null; }
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_registration_state")
        @android.annotation.NonNull
        public android.telephony.ims.ImsRegistrationAttributes.Builder setFlagRegistrationTypeEmergency() { return null; }
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.emergency_registration_state")
        @android.annotation.NonNull
        public android.telephony.ims.ImsRegistrationAttributes.Builder setFlagVirtualRegistrationForEmergencyCall() { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.ImsRegistrationAttributes build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsAttributeFlag {
    }
}
