package com.android.internal.content.om;

final class OverlayConfigParser {
    static final boolean DEFAULT_ENABLED_STATE = false;
    static final boolean DEFAULT_MUTABILITY = true;
    OverlayConfigParser() {}
    static java.util.ArrayList<com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration> getConfigurations(com.android.internal.content.om.OverlayConfigParser.OverlayPartition p0, com.android.internal.content.om.OverlayScanner p1, java.util.Map<java.lang.String, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo> p2, java.util.List<java.lang.String> p3) { return null; }

    static class OverlayPartition extends android.content.pm.PackagePartitions.SystemPartition {
        static final java.lang.String POLICY_ODM = "odm";
        static final java.lang.String POLICY_OEM = "oem";
        static final java.lang.String POLICY_PRODUCT = "product";
        static final java.lang.String POLICY_PUBLIC = "public";
        static final java.lang.String POLICY_SYSTEM = "system";
        static final java.lang.String POLICY_VENDOR = "vendor";
        public final java.lang.String policy = null;
        OverlayPartition(android.content.pm.PackagePartitions.SystemPartition p0) { super((android.content.pm.PackagePartitions.SystemPartition)null); }
        OverlayPartition(java.io.File p0, android.content.pm.PackagePartitions.SystemPartition p1) { super((android.content.pm.PackagePartitions.SystemPartition)null); }
    }

    public static class ParsedConfigFile {
        public final java.lang.String path = null;
        public final int line = 0;
        public final java.lang.String xml = null;
        ParsedConfigFile(java.lang.String p0, int p1, java.lang.String p2) {}
        public java.lang.String toString() { return null; }
    }

    public static class ParsedConfiguration {
        public final java.lang.String packageName = null;
        public final boolean enabled = false;
        public final boolean mutable = false;
        public final java.lang.String policy = null;
        public final com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo parsedInfo = null;
        public final com.android.internal.content.om.OverlayConfigParser.ParsedConfigFile parsedConfigFile = null;
        ParsedConfiguration(java.lang.String p0, boolean p1, boolean p2, java.lang.String p3, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo p4, com.android.internal.content.om.OverlayConfigParser.ParsedConfigFile p5) {}
        public java.lang.String toString() { return null; }
    }

    private static class ParsingContext {
    }
}
