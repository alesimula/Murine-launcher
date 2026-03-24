package android.nearby;

public final class PresenceScanFilter extends android.nearby.ScanFilter implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nearby.PresenceScanFilter> CREATOR = null;
    @android.annotation.NonNull
    public java.util.List<android.nearby.PublicCredential> getCredentials() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getPresenceActions() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.nearby.DataElement> getExtendedProperties() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.nearby.PresenceScanFilter.Builder setMaxPathLoss(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceScanFilter.Builder addCredential(android.nearby.PublicCredential p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceScanFilter.Builder addPresenceAction(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceScanFilter.Builder addExtendedProperty(android.nearby.DataElement p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PresenceScanFilter build() { return null; }
    }
}
