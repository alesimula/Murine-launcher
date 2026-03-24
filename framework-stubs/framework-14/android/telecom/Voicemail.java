package android.telecom;

public class Voicemail implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telecom.Voicemail> CREATOR = null;
    public static android.telecom.Voicemail.Builder createForInsertion(long p0, java.lang.String p1) { return null; }
    public static android.telecom.Voicemail.Builder createForUpdate(long p0, java.lang.String p1) { return null; }
    public long getId() { return 0L; }
    public java.lang.String getNumber() { return null; }
    public android.telecom.PhoneAccountHandle getPhoneAccount() { return null; }
    public long getTimestampMillis() { return 0L; }
    public long getDuration() { return 0L; }
    public java.lang.String getSourcePackage() { return null; }
    public java.lang.String getSourceData() { return null; }
    public android.net.Uri getUri() { return null; }
    public boolean isRead() { return false; }
    public boolean hasContent() { return false; }
    public java.lang.String getTranscription() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public android.telecom.Voicemail.Builder setNumber(java.lang.String p0) { return null; }
        public android.telecom.Voicemail.Builder setTimestamp(long p0) { return null; }
        public android.telecom.Voicemail.Builder setPhoneAccount(android.telecom.PhoneAccountHandle p0) { return null; }
        public android.telecom.Voicemail.Builder setId(long p0) { return null; }
        public android.telecom.Voicemail.Builder setDuration(long p0) { return null; }
        public android.telecom.Voicemail.Builder setSourcePackage(java.lang.String p0) { return null; }
        public android.telecom.Voicemail.Builder setSourceData(java.lang.String p0) { return null; }
        public android.telecom.Voicemail.Builder setUri(android.net.Uri p0) { return null; }
        public android.telecom.Voicemail.Builder setIsRead(boolean p0) { return null; }
        public android.telecom.Voicemail.Builder setHasContent(boolean p0) { return null; }
        public android.telecom.Voicemail.Builder setTranscription(java.lang.String p0) { return null; }
        public android.telecom.Voicemail build() { return null; }
    }
}
