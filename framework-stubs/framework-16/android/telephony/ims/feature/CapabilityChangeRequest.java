package android.telephony.ims.feature;

@android.annotation.SystemApi
public final class CapabilityChangeRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.feature.CapabilityChangeRequest> CREATOR = null;
    public CapabilityChangeRequest() {}
    public void addCapabilitiesToEnableForTech(int p0, int p1) {}
    public void addCapabilitiesToDisableForTech(int p0, int p1) {}
    public java.util.List<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> getCapabilitiesToEnable() { return null; }
    public java.util.List<android.telephony.ims.feature.CapabilityChangeRequest.CapabilityPair> getCapabilitiesToDisable() { return null; }
    protected CapabilityChangeRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class CapabilityPair {
        public CapabilityPair(int p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int getCapability() { return 0; }
        public int getRadioTech() { return 0; }
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
    }
}
