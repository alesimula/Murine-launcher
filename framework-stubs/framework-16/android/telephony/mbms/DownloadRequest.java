package android.telephony.mbms;

public final class DownloadRequest implements android.os.Parcelable {
    public static final int MAX_APP_INTENT_SIZE = 50000;
    public static final int MAX_DESTINATION_URI_SIZE = 50000;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.mbms.DownloadRequest> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getFileServiceId() { return null; }
    public android.net.Uri getSourceUri() { return null; }
    public android.net.Uri getDestinationUri() { return null; }
    public int getSubscriptionId() { return 0; }
    public android.content.Intent getIntentForApp() { return null; }
    public byte[] toByteArray() { return null; }
    public int getVersion() { return 0; }
    public static int getMaxAppIntentSize() { return 0; }
    public static int getMaxDestinationUriSize() { return 0; }
    public java.lang.String getHash() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class Builder {
        public static android.telephony.mbms.DownloadRequest.Builder fromDownloadRequest(android.telephony.mbms.DownloadRequest p0) { return null; }
        public static android.telephony.mbms.DownloadRequest.Builder fromSerializedRequest(byte[] p0) { return null; }
        public Builder(android.net.Uri p0, android.net.Uri p1) {}
        public android.telephony.mbms.DownloadRequest.Builder setServiceInfo(android.telephony.mbms.FileServiceInfo p0) { return null; }
        @android.annotation.SystemApi
        public android.telephony.mbms.DownloadRequest.Builder setServiceId(java.lang.String p0) { return null; }
        public android.telephony.mbms.DownloadRequest.Builder setSubscriptionId(int p0) { return null; }
        public android.telephony.mbms.DownloadRequest.Builder setAppIntent(android.content.Intent p0) { return null; }
        public android.telephony.mbms.DownloadRequest build() { return null; }
    }

    private static class SerializationDataContainer implements java.io.Externalizable {
        public SerializationDataContainer() {}
        SerializationDataContainer(android.telephony.mbms.DownloadRequest p0) {}
        public void writeExternal(java.io.ObjectOutput p0) throws java.io.IOException {}
        public void readExternal(java.io.ObjectInput p0) throws java.io.IOException {}
    }
}
