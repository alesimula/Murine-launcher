package com.android.internal.pm.pkg.component;

public interface ParsedProcess {
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDeniedPermissions();
    public int getGwpAsanMode();
    public int getMemtagMode();
    @android.annotation.NonNull
    public java.lang.String getName();
    @android.annotation.SuppressLint("ConcreteCollection")
    @android.annotation.NonNull
    public android.util.ArrayMap<java.lang.String, java.lang.String> getAppClassNamesByPackage();
    public int getNativeHeapZeroInitialized();
    public boolean isUseEmbeddedDex();
}
