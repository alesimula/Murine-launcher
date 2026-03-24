package android.content.pm.parsing;

public class PackageLite {
    public PackageLite(java.lang.String p0, java.lang.String p1, android.content.pm.parsing.ApkLite p2, java.lang.String[] p3, boolean[] p4, java.lang.String[] p5, java.lang.String[] p6, java.lang.String[] p7, int[] p8, int p9, java.util.Set<java.lang.String>[] p10, java.util.Set<java.lang.String>[] p11) {}
    public java.util.List<java.lang.String> getAllApkPaths() { return null; }
    public long getLongVersionCode() { return 0L; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPath() { return null; }
    @android.annotation.NonNull
    public java.lang.String getBaseApkPath() { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getSplitApkPaths() { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getSplitNames() { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getUsesSplitNames() { return null; }
    @android.annotation.Nullable
    public java.lang.String[] getConfigForSplit() { return null; }
    @android.annotation.Nullable
    public java.util.Set<java.lang.String> getBaseRequiredSplitTypes() { return null; }
    @android.annotation.Nullable
    public java.util.Set<java.lang.String>[] getRequiredSplitTypes() { return null; }
    @android.annotation.Nullable
    public java.util.Set<java.lang.String>[] getSplitTypes() { return null; }
    public int getVersionCodeMajor() { return 0; }
    public int getVersionCode() { return 0; }
    public int getTargetSdk() { return 0; }
    public int getBaseRevisionCode() { return 0; }
    @android.annotation.Nullable
    public int[] getSplitRevisionCodes() { return null; }
    public int getInstallLocation() { return 0; }
    @android.annotation.NonNull
    public android.content.pm.VerifierInfo[] getVerifiers() { return null; }
    @android.annotation.NonNull
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
    @android.annotation.Nullable
    public boolean[] getIsFeatureSplits() { return null; }
    public boolean isIsolatedSplits() { return false; }
    public boolean isSplitRequired() { return false; }
    public boolean isCoreApp() { return false; }
    public boolean isDebuggable() { return false; }
    public boolean isMultiArch() { return false; }
    public boolean isUse32bitAbi() { return false; }
    public boolean isExtractNativeLibs() { return false; }
    public boolean isProfileableByShell() { return false; }
    public boolean isUseEmbeddedDex() { return false; }
    public boolean isIsSdkLibrary() { return false; }
    @android.annotation.Nullable
    public android.content.pm.ArchivedPackageParcel getArchivedPackage() { return null; }
}
