package android.hardware.contexthub;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public final class HubMessage implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.HubMessage> CREATOR = null;
    public int getMessageType() { return 0; }
    @android.annotation.NonNull
    public byte[] getMessageBody() { return null; }
    public boolean isResponseRequired() { return false; }
    public void setMessageSequenceNumber(int p0) {}
    public int getMessageSequenceNumber() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(int p0, byte[] p1) {}
        @android.annotation.NonNull
        public android.hardware.contexthub.HubMessage.Builder setResponseRequired(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.contexthub.HubMessage build() { return null; }
    }
}
