package com.android.internal.pm.parsing.pkg;

public interface AndroidPackageHidden {
    @android.annotation.Nullable
    public java.lang.String getPrimaryCpuAbi();
    @android.annotation.Nullable
    public java.lang.String getSecondaryCpuAbi();
    @java.lang.Deprecated
    public int getVersionCode();
    public int getVersionCodeMajor();
    public android.content.pm.ApplicationInfo toAppInfoWithoutState();
    public boolean isSystem();
    public boolean isSystemExt();
    public boolean isPrivileged();
    public boolean isOem();
    public boolean isVendor();
    public boolean isProduct();
    public boolean isOdm();
}
