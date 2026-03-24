package com.android.internal.pm.pkg.component;

public class ParsedIntentInfoImpl implements com.android.internal.pm.pkg.component.ParsedIntentInfo, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.android.internal.pm.pkg.component.ParsedIntentInfoImpl> CREATOR = null;
    public ParsedIntentInfoImpl() {}
    public boolean isHasDefault() { return false; }
    public int getLabelRes() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    public int getIcon() { return 0; }
    @android.annotation.NonNull
    public android.content.IntentFilter getIntentFilter() { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedIntentInfoImpl setHasDefault(boolean p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedIntentInfoImpl setLabelRes(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedIntentInfoImpl setNonLocalizedLabel(java.lang.CharSequence p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedIntentInfoImpl setIcon(int p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ParsedIntentInfoImpl(android.os.Parcel p0) {}
}
