package android.telephony.ims.feature;

@android.annotation.SystemApi
public final class CapabilityChangeRequest implements android.os.Parcelable {
    private final java.util.Set<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> mCapabilitiesToEnable = null;
    private final java.util.Set<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> mCapabilitiesToDisable = null;
    public static final android.os.Parcelable.Creator<android.telephony.ims.feature.CapabilityChangeRequest> CREATOR = null;
    public CapabilityChangeRequest() {}
    public void addCapabilitiesToEnableForTech(int p0, int p1) {}
    public void addCapabilitiesToDisableForTech(int p0, int p1) {}
    public java.util.List<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> getCapabilitiesToEnable() { return null; }
    public java.util.List<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> getCapabilitiesToDisable() { return null; }
    private void addAllCapabilities(java.util.Set<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> p0, int p1, int p2) {}
    protected CapabilityChangeRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class CapabilityPair {
        private final int mCapability = 0;
        private final int radioTech = 0;
        public CapabilityPair(int p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int getCapability() { return 0; }
        public int getRadioTech() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
