package com.android.internal.pm.pkg.component;

public class ParsedAttributionImpl implements com.android.internal.pm.pkg.component.ParsedAttribution, android.os.Parcelable {
    static final int MAX_NUM_ATTRIBUTIONS = 400;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedAttributionImpl> CREATOR = null;
    public ParsedAttributionImpl() {}
    public ParsedAttributionImpl(java.lang.String p0, int p1, java.util.List<java.lang.String> p2) {}
    @android.annotation.NonNull
    public java.lang.String getTag() { return null; }
    public int getLabel() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getInheritFrom() { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedAttributionImpl setTag(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedAttributionImpl setLabel(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedAttributionImpl setInheritFrom(java.util.List<java.lang.String> p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ParsedAttributionImpl(android.os.Parcel p0) {}
}
