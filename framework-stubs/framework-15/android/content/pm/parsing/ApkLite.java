package android.content.pm.parsing;

public class ApkLite {
    public ApkLite(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, java.lang.String p4, java.lang.String p5, boolean p6, int p7, int p8, int p9, int p10, java.util.List<android.content.pm.VerifierInfo> p11, android.content.pm.SigningDetails p12, boolean p13, boolean p14, boolean p15, boolean p16, boolean p17, boolean p18, boolean p19, boolean p20, java.lang.String p21, boolean p22, int p23, java.lang.String p24, java.lang.String p25, int p26, int p27, int p28, java.util.Set<java.lang.String> p29, java.util.Set<java.lang.String> p30, boolean p31, boolean p32, boolean p33, java.lang.String p34) {}
    public ApkLite(java.lang.String p0, android.content.pm.ArchivedPackageParcel p1) {}
    public long getLongVersionCode() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPath() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSplitName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getUsesSplitName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getConfigForSplit() { return null; }
    @android.annotation.Nullable
    public java.util.Set<java.lang.String> getRequiredSplitTypes() { return null; }
    @android.annotation.Nullable
    public java.util.Set<java.lang.String> getSplitTypes() { return null; }
    public int getVersionCodeMajor() { return 0; }
    public int getVersionCode() { return 0; }
    public int getRevisionCode() { return 0; }
    public int getInstallLocation() { return 0; }
    public int getMinSdkVersion() { return 0; }
    public int getTargetSdkVersion() { return 0; }
    @android.annotation.NonNull
    public android.content.pm.VerifierInfo[] getVerifiers() { return null; }
    @android.annotation.NonNull
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
    public boolean isFeatureSplit() { return false; }
    public boolean isIsolatedSplits() { return false; }
    public boolean isSplitRequired() { return false; }
    public boolean isCoreApp() { return false; }
    public boolean isDebuggable() { return false; }
    public boolean isProfileableByShell() { return false; }
    public boolean isMultiArch() { return false; }
    public boolean isUse32bitAbi() { return false; }
    public boolean isExtractNativeLibs() { return false; }
    public boolean isUseEmbeddedDex() { return false; }
    @android.annotation.Nullable
    public java.lang.String getTargetPackageName() { return null; }
    public boolean isOverlayIsStatic() { return false; }
    public int getOverlayPriority() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getRequiredSystemPropertyName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRequiredSystemPropertyValue() { return null; }
    public int getRollbackDataPolicy() { return 0; }
    public boolean isHasDeviceAdminReceiver() { return false; }
    public boolean isIsSdkLibrary() { return false; }
    public boolean isUpdatableSystem() { return false; }
    @android.annotation.Nullable
    public java.lang.String getEmergencyInstaller() { return null; }
    @android.annotation.Nullable
    public android.content.pm.ArchivedPackageParcel getArchivedPackage() { return null; }
}
