package com.android.internal.pm.pkg.component;

public interface ParsedMainComponent extends com.android.internal.pm.pkg.component.ParsedComponent {
    @android.annotation.NonNull
    public java.lang.String[] getAttributionTags();
    @android.annotation.NonNull
    public java.lang.String getClassName();
    public boolean isDirectBootAware();
    public boolean isEnabled();
    public boolean isExported();
    public int getOrder();
    @android.annotation.Nullable
    public java.lang.String getProcessName();
    @android.annotation.Nullable
    public java.lang.String getSplitName();
    public int getIntentMatchingFlags();
}
