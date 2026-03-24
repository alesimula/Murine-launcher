package com.android.internal.telephony.data;

public class TelephonyNetworkRequest {
    public static final int REQUEST_STATE_UNSATISFIED = 0;
    public static final int REQUEST_STATE_SATISFIED = 1;
    public static final int CAPABILITY_ATTRIBUTE_NONE = 0;
    public static final int CAPABILITY_ATTRIBUTE_APN_SETTING = 1;
    public static final int CAPABILITY_ATTRIBUTE_TRAFFIC_DESCRIPTOR_DNN = 2;
    public static final int CAPABILITY_ATTRIBUTE_TRAFFIC_DESCRIPTOR_OS_APP_ID = 4;
    public TelephonyNetworkRequest(android.net.NetworkRequest p0, com.android.internal.telephony.Phone p1) {}
    public android.net.NetworkSpecifier getNetworkSpecifier() { return null; }
    public int[] getCapabilities() { return null; }
    public boolean hasCapability(int p0) { return false; }
    public boolean canBeSatisfiedBy(android.net.NetworkCapabilities p0) { return false; }
    public boolean hasAttribute(int p0) { return false; }
    public boolean canBeSatisfiedBy(android.telephony.data.DataProfile p0) { return false; }
    public int getPriority() { return 0; }
    public void updatePriority() {}
    public int getApnTypeNetworkCapability() { return 0; }
    public android.net.NetworkRequest getNativeNetworkRequest() { return null; }
    public void setAttachedNetwork(com.android.internal.telephony.data.DataNetwork p0) {}
    public com.android.internal.telephony.data.DataNetwork getAttachedNetwork() { return null; }
    public void setState(int p0) {}
    public int getState() { return 0; }
    public void setEvaluation(com.android.internal.telephony.data.DataEvaluation p0) {}
    public int getCapabilityDifferentiator() { return 0; }
    public boolean isMeteredRequest() { return false; }
    public android.telephony.data.TrafficDescriptor.OsAppId getOsAppId() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetCapabilityAttribute {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestState {
    }
}
