package com.android.internal.pm.pkg.component;

public class ParsedMainComponentImpl extends com.android.internal.pm.pkg.component.ParsedComponentImpl implements com.android.internal.pm.pkg.component.ParsedMainComponent, android.os.Parcelable {
    public static final int INTENT_MATCHING_FLAGS_NONE = 1;
    public static final int INTENT_MATCHING_FLAGS_ENFORCE_INTENT_FILTER = 2;
    public static final int INTENT_MATCHING_FLAGS_ALLOW_NULL_ACTION = 4;
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedMainComponentImpl> CREATOR = null;
    public ParsedMainComponentImpl() { super(); }
    public ParsedMainComponentImpl(com.android.internal.pm.pkg.component.ParsedMainComponent p0) { super(); }
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setProcessName(java.lang.String p0) { return null; }
    public java.lang.String getClassName() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getAttributionTags() { return null; }
    public com.android.internal.pm.pkg.component.ParsedMainComponent setIntentMatchingFlags(int p0) { return null; }
    public int getIntentMatchingFlags() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ParsedMainComponentImpl(android.os.Parcel p0) { super(); }
    public static java.lang.String intentMatchingFlagsToString(int p0) { return null; }
    public ParsedMainComponentImpl(java.lang.String p0, boolean p1, boolean p2, boolean p3, int p4, java.lang.String p5, java.lang.String[] p6, int p7) { super(); }
    @android.annotation.Nullable
    public java.lang.String getProcessName() { return null; }
    public boolean isDirectBootAware() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isExported() { return false; }
    public int getOrder() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getSplitName() { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setDirectBootAware(boolean p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setEnabled(boolean p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setExported(boolean p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setOrder(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setSplitName(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedMainComponentImpl setAttributionTags(java.lang.String... p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IntentMatchingFlags {
    }
}
