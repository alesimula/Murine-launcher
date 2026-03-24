package android.telephony.ims;

@android.annotation.SystemApi
public final class DelegateRegistrationState implements android.os.Parcelable {
    public static final int DEREGISTERED_REASON_UNKNOWN = 0;
    public static final int DEREGISTERED_REASON_NOT_PROVISIONED = 1;
    public static final int DEREGISTERED_REASON_NOT_REGISTERED = 2;
    public static final int DEREGISTERING_REASON_PDN_CHANGE = 3;
    public static final int DEREGISTERING_REASON_PROVISIONING_CHANGE = 4;
    public static final int DEREGISTERING_REASON_FEATURE_TAGS_CHANGING = 5;
    public static final int DEREGISTERING_REASON_DESTROY_PENDING = 6;
    public static final int DEREGISTERING_REASON_LOSING_PDN = 7;
    public static final int DEREGISTERING_REASON_UNSPECIFIED = 8;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.DelegateRegistrationState> CREATOR = null;
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getRegisteringFeatureTags() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getRegisteredFeatureTags() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.telephony.ims.FeatureTagState> getDeregisteringFeatureTags() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.telephony.ims.FeatureTagState> getDeregisteredFeatureTags() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.ims.DelegateRegistrationState.Builder addRegisteringFeatureTags(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.DelegateRegistrationState.Builder addRegisteredFeatureTag(java.lang.String p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.telephony.ims.DelegateRegistrationState.Builder addRegisteredFeatureTags(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.DelegateRegistrationState.Builder addDeregisteringFeatureTag(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.DelegateRegistrationState.Builder addDeregisteredFeatureTag(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.telephony.ims.DelegateRegistrationState build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeregisteredReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeregisteringReason {
    }
}
