package android.credentials;

public final class CredentialProviderInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.CredentialProviderInfo> CREATOR = null;
    public boolean hasCapability(java.lang.String p0) { return false; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public boolean isSystemProvider() { return false; }
    public android.graphics.drawable.Drawable getServiceIcon(android.content.Context p0) { return null; }
    public java.lang.CharSequence getLabel(android.content.Context p0) { return null; }
    public java.util.List<java.lang.String> getCapabilities() { return null; }
    public boolean isEnabled() { return false; }
    public boolean isPrimary() { return false; }
    public java.lang.CharSequence getSettingsSubtitle() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(android.content.pm.ServiceInfo p0) {}
        public android.credentials.CredentialProviderInfo.Builder setSystemProvider(boolean p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setOverrideLabel(java.lang.CharSequence p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setSettingsSubtitle(java.lang.CharSequence p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder addCapabilities(java.util.List<java.lang.String> p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder addCapabilities(java.util.Set<java.lang.String> p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setEnabled(boolean p0) { return null; }
        public android.credentials.CredentialProviderInfo.Builder setPrimary(boolean p0) { return null; }
        public android.credentials.CredentialProviderInfo build() { return null; }
    }
}
