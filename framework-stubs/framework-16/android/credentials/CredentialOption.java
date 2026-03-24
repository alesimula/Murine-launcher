package android.credentials;

public final class CredentialOption implements android.os.Parcelable {
    public static final java.lang.String SUPPORTED_ELEMENT_KEYS = "android.credentials.GetCredentialOption.SUPPORTED_ELEMENT_KEYS";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.CredentialOption> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getType() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getCredentialRetrievalData() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getCandidateQueryData() { return null; }
    public boolean isSystemProviderRequired() { return false; }
    @android.annotation.NonNull
    public java.util.Set<android.content.ComponentName> getAllowedProviders() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public CredentialOption(java.lang.String p0, android.os.Bundle p1, android.os.Bundle p2, boolean p3) {}

    public static final class Builder {
        public Builder(java.lang.String p0, android.os.Bundle p1, android.os.Bundle p2) {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.credentials.CredentialOption.Builder setIsSystemProviderRequired(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.CredentialOption.Builder addAllowedProvider(android.content.ComponentName p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.CredentialOption.Builder setAllowedProviders(java.util.Set<android.content.ComponentName> p0) { return null; }
        @android.annotation.NonNull
        public android.credentials.CredentialOption build() { return null; }
    }
}
