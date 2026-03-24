package android.companion;

public final class AssociationRequest implements android.os.Parcelable {
    private final boolean mSingleDevice = false;
    private final java.util.List<android.companion.DeviceFilter<?>> mDeviceFilters = null;
    public static final android.os.Parcelable.Creator<android.companion.AssociationRequest> CREATOR = null;
    private AssociationRequest(boolean p0, java.util.List<android.companion.DeviceFilter<?>> p1) {}
    private AssociationRequest(android.os.Parcel p0) {}
    public boolean isSingleDevice() { return false; }
    public java.util.List<android.companion.DeviceFilter<?>> getDeviceFilters() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.AssociationRequest> {
        private boolean mSingleDevice;
        private java.util.ArrayList<android.companion.DeviceFilter<?>> mDeviceFilters;
        public Builder() { super(); }
        public android.companion.AssociationRequest.Builder setSingleDevice(boolean p0) { return null; }
        public android.companion.AssociationRequest.Builder addDeviceFilter(android.companion.DeviceFilter<?> p0) { return null; }
        public android.companion.AssociationRequest build() { return null; }
    }
}
