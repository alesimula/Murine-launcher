package com.android.internal.app;

public interface LocaleCollectorBase {
    public java.util.Set<java.lang.String> getIgnoredLocaleList(boolean p0);
    public java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getSupportedLocaleList(com.android.internal.app.LocaleStore.LocaleInfo p0, boolean p1, boolean p2);
    public boolean hasSpecificPackageName();
}
