package android.telephony.data;

public final class NetworkSliceInfo implements android.os.Parcelable {
    public static final int SLICE_DIFFERENTIATOR_NO_SLICE = -1;
    public static final int SLICE_SERVICE_TYPE_NONE = 0;
    public static final int SLICE_SERVICE_TYPE_EMBB = 1;
    public static final int SLICE_SERVICE_TYPE_URLLC = 2;
    public static final int SLICE_SERVICE_TYPE_MIOT = 3;
    public static final int MIN_SLICE_DIFFERENTIATOR = -1;
    public static final int MAX_SLICE_DIFFERENTIATOR = 16777214;
    public static final int SLICE_STATUS_UNKNOWN = 0;
    public static final int SLICE_STATUS_CONFIGURED = 1;
    public static final int SLICE_STATUS_ALLOWED = 2;
    public static final int SLICE_STATUS_REJECTED_NOT_AVAILABLE_IN_PLMN = 3;
    public static final int SLICE_STATUS_REJECTED_NOT_AVAILABLE_IN_REGISTERED_AREA = 4;
    public static final int SLICE_STATUS_DEFAULT_CONFIGURED = 5;
    public static final int MIN_SLICE_STATUS = 0;
    public static final int MAX_SLICE_STATUS = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.data.NetworkSliceInfo> CREATOR = null;
    public int getSliceServiceType() { return 0; }
    public int getSliceDifferentiator() { return 0; }
    public int getMappedHplmnSliceServiceType() { return 0; }
    public int getMappedHplmnSliceDifferentiator() { return 0; }
    public int getStatus() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.data.NetworkSliceInfo.Builder setSliceServiceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.NetworkSliceInfo.Builder setSliceDifferentiator(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.NetworkSliceInfo.Builder setMappedHplmnSliceServiceType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.NetworkSliceInfo.Builder setMappedHplmnSliceDifferentiator(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.NetworkSliceInfo.Builder setStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.NetworkSliceInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SliceServiceType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SliceStatus {
    }
}
