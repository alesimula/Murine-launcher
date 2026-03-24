package android.nearby;

public final class PresenceBroadcastRequest extends android.nearby.BroadcastRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nearby.PresenceBroadcastRequest> CREATOR = null;
    @android.annotation.NonNull
    public byte[] getSalt() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getActions() { return null; }
    @android.annotation.NonNull
    public android.nearby.PrivateCredential getCredential() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.nearby.DataElement> getExtendedProperties() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.util.List<java.lang.Integer> p0, byte[] p1, android.nearby.PrivateCredential p2) {}
        @android.annotation.NonNull
        public android.nearby.PresenceBroadcastRequest.Builder setVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceBroadcastRequest.Builder setTxPower(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceBroadcastRequest.Builder addAction(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceBroadcastRequest.Builder addExtendedProperty(android.nearby.DataElement p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceBroadcastRequest build() { return null; }
    }
}
