package com.android.internal.pm.parsing;

public class PackageParser2 implements java.lang.AutoCloseable {
    @android.annotation.Nullable
    protected com.android.internal.pm.parsing.IPackageCacher mCacher;
    public PackageParser2(java.lang.String[] p0, android.util.DisplayMetrics p1, com.android.internal.pm.parsing.IPackageCacher p2, com.android.internal.pm.parsing.PackageParser2.Callback p3) {}
    public com.android.internal.pm.parsing.pkg.ParsedPackage parsePackage(java.io.File p0, int p1, boolean p2) throws com.android.internal.pm.parsing.PackageParserException { return null; }
    public com.android.internal.pm.parsing.pkg.ParsedPackage parsePackageFromPackageLite(android.content.pm.parsing.PackageLite p0, int p1) throws com.android.internal.pm.parsing.PackageParserException { return null; }
    public void close() {}

    public static abstract class Callback implements com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback {
        public Callback() {}
        public final com.android.internal.pm.pkg.parsing.ParsingPackage startParsingPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.content.res.TypedArray p3, boolean p4) { return null; }
        public abstract boolean isChangeEnabled(long p0, android.content.pm.ApplicationInfo p1);
    }
}
