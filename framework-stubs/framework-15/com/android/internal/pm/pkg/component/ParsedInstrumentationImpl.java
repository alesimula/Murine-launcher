package com.android.internal.pm.pkg.component;

public class ParsedInstrumentationImpl extends com.android.internal.pm.pkg.component.ParsedComponentImpl implements com.android.internal.pm.pkg.component.ParsedInstrumentation, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedInstrumentationImpl> CREATOR = null;
    public ParsedInstrumentationImpl() { super(); }
    public com.android.internal.pm.pkg.component.ParsedInstrumentationImpl setTargetPackage(java.lang.String p0) { return null; }
    public com.android.internal.pm.pkg.component.ParsedInstrumentationImpl setTargetProcesses(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ParsedInstrumentationImpl(android.os.Parcel p0) { super(); }
    public ParsedInstrumentationImpl(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3) { super(); }
    @android.annotation.Nullable
    public java.lang.String getTargetPackage() { return null; }
    @android.annotation.Nullable
    public java.lang.String getTargetProcesses() { return null; }
    public boolean isHandleProfiling() { return false; }
    public boolean isFunctionalTest() { return false; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedInstrumentationImpl setHandleProfiling(boolean p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedInstrumentationImpl setFunctionalTest(boolean p0) { return null; }
}
