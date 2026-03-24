package com.android.internal.os;

public class KernelCpuThreadReaderSettingsObserver extends android.database.ContentObserver {
    KernelCpuThreadReaderSettingsObserver() { super((android.os.Handler)null); }
    @android.annotation.Nullable
    public static com.android.internal.os.KernelCpuThreadReaderDiff getSettingsModifiedReader(android.content.Context p0) { return null; }
    public void onChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2, int p3) {}

    public static class UidPredicate implements java.util.function.Predicate<java.lang.Integer> {
        public static com.android.internal.os.KernelCpuThreadReaderSettingsObserver.UidPredicate fromString(java.lang.String p0) throws java.lang.NumberFormatException { return null; }
        public boolean test(java.lang.Integer p0) { return false; }
    }
}
