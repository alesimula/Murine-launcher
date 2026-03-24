package android.telephony;

public final class VisualVoicemailSmsFilterSettings implements android.os.Parcelable {
    public static final int DESTINATION_PORT_ANY = -1;
    public static final int DESTINATION_PORT_DATA_SMS = -2;
    public static final java.lang.String DEFAULT_CLIENT_PREFIX = "//VVM";
    public static final java.util.List<java.lang.String> DEFAULT_ORIGINATING_NUMBERS = null;
    public static final int DEFAULT_DESTINATION_PORT = -1;
    public final java.lang.String clientPrefix = null;
    public final java.util.List<java.lang.String> originatingNumbers = null;
    public final int destinationPort = 0;
    public final java.lang.String packageName = null;
    public static final android.os.Parcelable.Creator<android.telephony.VisualVoicemailSmsFilterSettings> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder() {}
        public android.telephony.VisualVoicemailSmsFilterSettings build() { return null; }
        public android.telephony.VisualVoicemailSmsFilterSettings.Builder setClientPrefix(java.lang.String p0) { return null; }
        public android.telephony.VisualVoicemailSmsFilterSettings.Builder setOriginatingNumbers(java.util.List<java.lang.String> p0) { return null; }
        public android.telephony.VisualVoicemailSmsFilterSettings.Builder setDestinationPort(int p0) { return null; }
        public android.telephony.VisualVoicemailSmsFilterSettings.Builder setPackageName(java.lang.String p0) { return null; }
    }
}
