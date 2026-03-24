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
    private android.util.ArraySet<java.lang.String> mRegisteredTags;
    private final android.util.ArraySet<android.telephony.ims.FeatureTagState> mDeregisteringTags = null;
    private final android.util.ArraySet<android.telephony.ims.FeatureTagState> mDeregisteredTags = null;
    public static final android.os.Parcelable.Creator<android.telephony.ims.DelegateRegistrationState> CREATOR = null;
    private DelegateRegistrationState() {}
    private DelegateRegistrationState(android.os.Parcel p0) {}
    public java.util.Set<java.lang.String> getRegisteredFeatureTags() { return null; }
    public java.util.Set<android.telephony.ims.FeatureTagState> getDeregisteringFeatureTags() { return null; }
    public java.util.Set<android.telephony.ims.FeatureTagState> getDeregisteredFeatureTags() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void writeStateToParcel(android.os.Parcel p0, java.util.Set<android.telephony.ims.FeatureTagState> p1) {}
    private void readStateFromParcel(android.os.Parcel p0, java.util.Set<android.telephony.ims.FeatureTagState> p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private final android.telephony.ims.DelegateRegistrationState mState = null;
        public Builder() {}
        public android.telephony.ims.DelegateRegistrationState.Builder addRegisteredFeatureTag(java.lang.String p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.telephony.ims.DelegateRegistrationState.Builder addRegisteredFeatureTags(java.util.Set<java.lang.String> p0) { return null; }
        public android.telephony.ims.DelegateRegistrationState.Builder addDeregisteringFeatureTag(java.lang.String p0, int p1) { return null; }
        public android.telephony.ims.DelegateRegistrationState.Builder addDeregisteredFeatureTag(java.lang.String p0, int p1) { return null; }
        public android.telephony.ims.DelegateRegistrationState build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeregisteredReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeregisteringReason {
    }
}
