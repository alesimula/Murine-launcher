package com.android.ims;

public final class ImsFeatureContainer implements android.os.Parcelable {
    public final android.os.IBinder imsFeature = null;
    public final android.telephony.ims.aidl.IImsConfig imsConfig = null;
    public final android.telephony.ims.aidl.IImsRegistration imsRegistration = null;
    public final android.telephony.ims.aidl.ISipTransport sipTransport = null;
    public static final android.os.Parcelable.Creator<com.android.ims.ImsFeatureContainer> CREATOR = null;
    public ImsFeatureContainer(android.os.IBinder p0, android.telephony.ims.aidl.IImsConfig p1, android.telephony.ims.aidl.IImsRegistration p2, android.telephony.ims.aidl.ISipTransport p3, long p4) {}
    public long getCapabilities() { return 0L; }
    public void setCapabilities(long p0) {}
    public int getState() { return 0; }
    public void setState(int p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
