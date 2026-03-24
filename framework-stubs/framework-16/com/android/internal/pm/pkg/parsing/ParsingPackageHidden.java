package com.android.internal.pm.pkg.parsing;

public interface ParsingPackageHidden {
    public int getVersionCode();
    public int getVersionCodeMajor();
    public android.content.pm.ApplicationInfo toAppInfoWithoutState();
}
