package com.android.internal.pm.pkg.component;

public abstract class ParsedComponentImpl implements com.android.internal.pm.pkg.component.ParsedComponent, android.os.Parcelable {
    public ParsedComponentImpl() {}
    protected ParsedComponentImpl(com.android.internal.pm.pkg.component.ParsedComponent p0) {}
    public void addIntent(com.android.internal.pm.pkg.component.ParsedIntentInfoImpl p0) {}
    public void addProperty(android.content.pm.PackageManager.Property p0) {}
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setName(java.lang.String p0) { return null; }
    public void setPackageName(java.lang.String p0) {}
    @android.annotation.NonNull
    public android.content.ComponentName getComponentName() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getMetaData() { return null; }
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedIntentInfo> getIntents() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ParsedComponentImpl(android.os.Parcel p0) {}
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    public int getIcon() { return 0; }
    public int getLabelRes() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    public int getLogo() { return 0; }
    public int getBanner() { return 0; }
    public int getDescriptionRes() { return 0; }
    public int getFlags() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.content.pm.PackageManager.Property> getProperties() { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setIcon(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setLabelRes(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setNonLocalizedLabel(java.lang.CharSequence p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setLogo(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setBanner(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setDescriptionRes(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setFlags(int p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.pm.pkg.component.ParsedComponentImpl setMetaData(android.os.Bundle p0) { return null; }
}
