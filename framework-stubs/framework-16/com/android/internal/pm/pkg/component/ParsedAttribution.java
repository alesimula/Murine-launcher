package com.android.internal.pm.pkg.component;

public interface ParsedAttribution {
    public static final int MAX_ATTRIBUTION_TAG_LEN = 50;
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getInheritFrom();
    public int getLabel();
    @android.annotation.NonNull
    public java.lang.String getTag();
}
