package android.telephony.mbms;

public final class DownloadRequest implements android.os.Parcelable {
    private static final int CURRENT_VERSION = 1;
    private static final java.lang.String LOG_TAG = "MbmsDownloadRequest";
    public static final int MAX_APP_INTENT_SIZE = 50000;
    public static final int MAX_DESTINATION_URI_SIZE = 50000;
    private final java.lang.String fileServiceId = null;
    private final android.net.Uri sourceUri = null;
    private final android.net.Uri destinationUri = null;
    private final int subscriptionId = 0;
    private final java.lang.String serializedResultIntentForApp = null;
    private final int version = 0;
    public static final android.os.Parcelable.Creator<android.telephony.mbms.DownloadRequest> CREATOR = null;
    private DownloadRequest(java.lang.String p0, android.net.Uri p1, android.net.Uri p2, int p3, java.lang.String p4, int p5) {}
    private DownloadRequest(android.os.Parcel p0) {}
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
        private java.lang.String fileServiceId;
        private android.net.Uri source;
        private android.net.Uri destination;
        private int subscriptionId;
        private java.lang.String appIntent;
        private int version;
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
        private java.lang.String fileServiceId;
        private android.net.Uri source;
        private android.net.Uri destination;
        private int subscriptionId;
        private java.lang.String appIntent;
        private int version;
        public SerializationDataContainer() {}
        SerializationDataContainer(android.telephony.mbms.DownloadRequest p0) {}
        public void writeExternal(java.io.ObjectOutput p0) throws java.io.IOException {}
        public void readExternal(java.io.ObjectInput p0) throws java.io.IOException {}
    }
}
