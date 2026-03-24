package com.android.internal.pm.parsing.pkg;

public interface AndroidPackageInternal extends com.android.server.pm.pkg.AndroidPackage, com.android.internal.content.om.OverlayConfig.PackageProvider.Package {
    @android.annotation.NonNull
    public java.lang.String[] getUsesLibrariesSorted();
    @android.annotation.NonNull
    public java.lang.String[] getUsesOptionalLibrariesSorted();
    @android.annotation.NonNull
    public java.lang.String[] getUsesSdkLibrariesSorted();
    @android.annotation.NonNull
    public java.lang.String[] getUsesStaticLibrariesSorted();
}
