package android.telephony.ims.stub;

@android.annotation.SystemApi
public final class ImsFeatureConfiguration implements android.os.Parcelable {
    private final java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> mFeatures = null;
    public static final android.os.Parcelable.Creator<android.telephony.ims.stub.ImsFeatureConfiguration> CREATOR = null;
    public ImsFeatureConfiguration() {}
    public ImsFeatureConfiguration(java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> p0) {}
    public java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> getServiceFeatures() { return null; }
    void addFeature(int p0, int p1) {}
    protected ImsFeatureConfiguration(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class Builder {
        android.telephony.ims.stub.ImsFeatureConfiguration mConfig;
        public Builder() {}
        public android.telephony.ims.stub.ImsFeatureConfiguration.Builder addFeature(int p0, int p1) { return null; }
        public android.telephony.ims.stub.ImsFeatureConfiguration build() { return null; }
    }

    public static final class FeatureSlotPair {
        public final int slotId = 0;
        public final int featureType = 0;
        public FeatureSlotPair(int p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
