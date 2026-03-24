package com.android.internal.pm.pkg.component;

public interface ParsedApexSystemService {
    @android.annotation.NonNull
    public java.lang.String getName();
    @android.annotation.Nullable
    public java.lang.String getJarPath();
    @android.annotation.Nullable
    public java.lang.String getMinSdkVersion();
    @android.annotation.Nullable
    public java.lang.String getMaxSdkVersion();
    public int getInitOrder();
}
