package com.android.internal.pm.pkg.component;

public interface ParsedComponent {
    public int getBanner();
    @android.annotation.NonNull
    public android.content.ComponentName getComponentName();
    public int getDescriptionRes();
    public int getFlags();
    public int getIcon();
    @android.annotation.NonNull
    public java.util.List<com.android.internal.pm.pkg.component.ParsedIntentInfo> getIntents();
    public int getLabelRes();
    public int getLogo();
    @android.annotation.NonNull
    public android.os.Bundle getMetaData();
    @android.annotation.NonNull
    public java.lang.String getName();
    @android.annotation.Nullable
    public java.lang.CharSequence getNonLocalizedLabel();
    @android.annotation.NonNull
    public java.lang.String getPackageName();
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.content.pm.PackageManager.Property> getProperties();
}
