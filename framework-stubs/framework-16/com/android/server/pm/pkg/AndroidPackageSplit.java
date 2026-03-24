package com.android.server.pm.pkg;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.SYSTEM_SERVER)
@android.processor.immutability.Immutable
public interface AndroidPackageSplit {
    @android.annotation.Nullable
    public java.lang.String getName();
    @android.annotation.NonNull
    public java.lang.String getPath();
    public int getRevisionCode();
    public boolean isHasCode();
    @android.annotation.Nullable
    public java.lang.String getClassLoaderName();
    @android.annotation.NonNull
    public java.util.List<com.android.server.pm.pkg.AndroidPackageSplit> getDependencies();
}
