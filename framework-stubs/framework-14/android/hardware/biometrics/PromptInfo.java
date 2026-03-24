package android.hardware.biometrics;

public class PromptInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.PromptInfo> CREATOR = null;
    public PromptInfo() {}
    PromptInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean containsTestConfigurations() { return false; }
    public boolean containsPrivateApiConfigurations() { return false; }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setUseDefaultTitle(boolean p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public void setUseDefaultSubtitle(boolean p0) {}
    public void setDescription(java.lang.CharSequence p0) {}
    public void setDeviceCredentialTitle(java.lang.CharSequence p0) {}
    public void setDeviceCredentialSubtitle(java.lang.CharSequence p0) {}
    public void setDeviceCredentialDescription(java.lang.CharSequence p0) {}
    public void setNegativeButtonText(java.lang.CharSequence p0) {}
    public void setConfirmationRequested(boolean p0) {}
    public void setDeviceCredentialAllowed(boolean p0) {}
    public void setAuthenticators(int p0) {}
    public void setDisallowBiometricsIfPolicyExists(boolean p0) {}
    public void setReceiveSystemEvents(boolean p0) {}
    public void setAllowedSensorIds(java.util.List<java.lang.Integer> p0) {}
    public void setAllowBackgroundAuthentication(boolean p0) {}
    public void setIgnoreEnrollmentState(boolean p0) {}
    public void setIsForLegacyFingerprintManager(int p0) {}
    public java.lang.CharSequence getTitle() { return null; }
    public boolean isUseDefaultTitle() { return false; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public boolean isUseDefaultSubtitle() { return false; }
    public java.lang.CharSequence getDescription() { return null; }
    public java.lang.CharSequence getDeviceCredentialTitle() { return null; }
    public java.lang.CharSequence getDeviceCredentialSubtitle() { return null; }
    public java.lang.CharSequence getDeviceCredentialDescription() { return null; }
    public java.lang.CharSequence getNegativeButtonText() { return null; }
    public boolean isConfirmationRequested() { return false; }
    @java.lang.Deprecated
    public boolean isDeviceCredentialAllowed() { return false; }
    public int getAuthenticators() { return 0; }
    public boolean isDisallowBiometricsIfPolicyExists() { return false; }
    public boolean isReceiveSystemEvents() { return false; }
    public java.util.List<java.lang.Integer> getAllowedSensorIds() { return null; }
    public boolean isAllowBackgroundAuthentication() { return false; }
    public boolean isIgnoreEnrollmentState() { return false; }
    public boolean isForLegacyFingerprintManager() { return false; }
}
