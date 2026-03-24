package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsSsInfo implements android.os.Parcelable {
    public static final int NOT_REGISTERED = -1;
    public static final int DISABLED = 0;
    public static final int ENABLED = 1;
    public static final int SERVICE_PROVISIONING_UNKNOWN = -1;
    public static final int SERVICE_NOT_PROVISIONED = 0;
    public static final int SERVICE_PROVISIONED = 1;
    public static final int CLIR_OUTGOING_DEFAULT = 0;
    public static final int CLIR_OUTGOING_INVOCATION = 1;
    public static final int CLIR_OUTGOING_SUPPRESSION = 2;
    public static final int CLIR_STATUS_NOT_PROVISIONED = 0;
    public static final int CLIR_STATUS_PROVISIONED_PERMANENT = 1;
    public static final int CLIR_STATUS_UNKNOWN = 2;
    public static final int CLIR_STATUS_TEMPORARILY_RESTRICTED = 3;
    public static final int CLIR_STATUS_TEMPORARILY_ALLOWED = 4;
    public int mStatus;
    public java.lang.String mIcbNum;
    public int mProvisionStatus;
    private int mClirInterrogationStatus;
    private int mClirOutgoingState;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsSsInfo> CREATOR = null;
    public ImsSsInfo() {}
    @java.lang.Deprecated
    public ImsSsInfo(int p0, java.lang.String p1) {}
    private ImsSsInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    private static java.lang.String provisionStatusToString(int p0) { return null; }
    private void readFromParcel(android.os.Parcel p0) {}
    public int getStatus() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getIcbNum() { return null; }
    public java.lang.String getIncomingCommunicationBarringNumber() { return null; }
    public int getProvisionStatus() { return 0; }
    public int getClirOutgoingState() { return 0; }
    public int getClirInterrogationStatus() { return 0; }
    public int[] getCompatArray(int p0) { return null; }

    public static final class Builder {
        private final android.telephony.ims.ImsSsInfo mImsSsInfo = null;
        public Builder(int p0) {}
        public android.telephony.ims.ImsSsInfo.Builder setIncomingCommunicationBarringNumber(java.lang.String p0) { return null; }
        public android.telephony.ims.ImsSsInfo.Builder setProvisionStatus(int p0) { return null; }
        public android.telephony.ims.ImsSsInfo.Builder setClirInterrogationStatus(int p0) { return null; }
        public android.telephony.ims.ImsSsInfo.Builder setClirOutgoingState(int p0) { return null; }
        public android.telephony.ims.ImsSsInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ClirInterrogationStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ClirOutgoingState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceProvisionStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceStatus {
    }
}
