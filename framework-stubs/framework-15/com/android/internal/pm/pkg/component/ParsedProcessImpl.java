package com.android.internal.pm.pkg.component;

public class ParsedProcessImpl implements com.android.internal.pm.pkg.component.ParsedProcess, android.os.Parcelable {
    static com.android.internal.util.Parcelling<java.util.Set<java.lang.String>> sParcellingForDeniedPermissions;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedProcessImpl> CREATOR = null;
    public ParsedProcessImpl() {}
    public ParsedProcessImpl(com.android.internal.pm.pkg.component.ParsedProcess p0) {}
    public void addStateFrom(com.android.internal.pm.pkg.component.ParsedProcess p0) {}
    public void putAppClassNameForPackage(java.lang.String p0, java.lang.String p1) {}
    public ParsedProcessImpl(java.lang.String p0, android.util.ArrayMap<java.lang.String, java.lang.String> p1, java.util.Set<java.lang.String> p2, int p3, int p4, int p5, boolean p6) {}
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public android.util.ArrayMap<java.lang.String, java.lang.String> getAppClassNamesByPackage() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDeniedPermissions() { return null; }
    public int getGwpAsanMode() { return 0; }
    public int getMemtagMode() { return 0; }
    public int getNativeHeapZeroInitialized() { return 0; }
    public boolean isUseEmbeddedDex() { return false; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setName(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setAppClassNamesByPackage(android.util.ArrayMap<java.lang.String, java.lang.String> p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setDeniedPermissions(java.util.Set<java.lang.String> p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setGwpAsanMode(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setMemtagMode(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setNativeHeapZeroInitialized(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedProcessImpl setUseEmbeddedDex(boolean p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ParsedProcessImpl(android.os.Parcel p0) {}
}
