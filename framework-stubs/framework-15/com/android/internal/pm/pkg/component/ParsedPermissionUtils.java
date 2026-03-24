package com.android.internal.pm.pkg.component;

public class ParsedPermissionUtils {
    public ParsedPermissionUtils() {}
    @android.annotation.NonNull
    public static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.component.ParsedPermission> parsePermission(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, boolean p3, android.content.pm.parsing.result.ParseInput p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    @android.annotation.NonNull
    public static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.component.ParsedPermission> parsePermissionTree(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, boolean p3, android.content.pm.parsing.result.ParseInput p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    @android.annotation.NonNull
    public static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.component.ParsedPermissionGroup> parsePermissionGroup(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, boolean p3, android.content.pm.parsing.result.ParseInput p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public static boolean isRuntime(com.android.internal.pm.pkg.component.ParsedPermission p0) { return false; }
    public static boolean isAppOp(com.android.internal.pm.pkg.component.ParsedPermission p0) { return false; }
    public static int getProtection(com.android.internal.pm.pkg.component.ParsedPermission p0) { return 0; }
    public static int getProtectionFlags(com.android.internal.pm.pkg.component.ParsedPermission p0) { return 0; }
    public static int calculateFootprint(com.android.internal.pm.pkg.component.ParsedPermission p0) { return 0; }
    public static boolean declareDuplicatePermission(com.android.internal.pm.pkg.parsing.ParsingPackage p0) { return false; }
}
