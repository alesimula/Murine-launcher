package android.telephony.ims;

public final class ImsRegistrationAttributes implements android.os.Parcelable {
    public static final int ATTR_EPDG_OVER_CELL_INTERNET = 1;
    private final int mRegistrationTech = 0;
    private final int mTransportType = 0;
    private final int mImsAttributeFlags = 0;
    private final java.util.ArrayList<java.lang.String> mFeatureTags = null;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsRegistrationAttributes> CREATOR = null;
    public ImsRegistrationAttributes(int p0, int p1, int p2, java.util.Set<java.lang.String> p3) {}
    public ImsRegistrationAttributes(android.os.Parcel p0) {}
    @android.annotation.SystemApi
    public int getRegistrationTechnology() { return 0; }
    public int getTransportType() { return 0; }
    public int getAttributeFlags() { return 0; }
    public java.util.Set<java.lang.String> getFeatureTags() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        private final int mRegistrationTech = 0;
        private java.util.Set<java.lang.String> mFeatureTags;
        public Builder(int p0) {}
        public android.telephony.ims.ImsRegistrationAttributes.Builder setFeatureTags(java.util.Set<java.lang.String> p0) { return null; }
        public android.telephony.ims.ImsRegistrationAttributes build() { return null; }
        private static int getAttributeFlags(int p0) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsAttributeFlag {
    }
}
