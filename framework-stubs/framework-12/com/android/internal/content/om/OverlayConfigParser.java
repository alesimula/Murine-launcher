package com.android.internal.content.om;

final class OverlayConfigParser {
    static final boolean DEFAULT_ENABLED_STATE = false;
    static final boolean DEFAULT_MUTABILITY = true;
    private static final int MAXIMUM_MERGE_DEPTH = 5;
    private static final java.lang.String CONFIG_DIRECTORY = "config";
    private static final java.lang.String CONFIG_DEFAULT_FILENAME = "config/config.xml";
    OverlayConfigParser() {}
    static java.util.ArrayList<com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration> getConfigurations(com.android.internal.content.om.OverlayConfigParser.OverlayPartition p0, com.android.internal.content.om.OverlayScanner p1) { return null; }
    private static void readConfigFile(java.io.File p0, com.android.internal.content.om.OverlayScanner p1, com.android.internal.content.om.OverlayConfigParser.ParsingContext p2) {}
    private static void parseMerge(java.io.File p0, org.xmlpull.v1.XmlPullParser p1, com.android.internal.content.om.OverlayScanner p2, com.android.internal.content.om.OverlayConfigParser.ParsingContext p3) {}
    private static void parseOverlay(java.io.File p0, org.xmlpull.v1.XmlPullParser p1, com.android.internal.content.om.OverlayScanner p2, com.android.internal.content.om.OverlayConfigParser.ParsingContext p3) {}

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
        private static java.lang.String policyForPartition(android.content.pm.PackagePartitions.SystemPartition p0) { return null; }
    }

    public static class ParsedConfiguration {
        public final java.lang.String packageName = null;
        public final boolean enabled = false;
        public final boolean mutable = false;
        public final java.lang.String policy = null;
        public final com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo parsedInfo = null;
        ParsedConfiguration(java.lang.String p0, boolean p1, boolean p2, java.lang.String p3, com.android.internal.content.om.OverlayScanner.ParsedOverlayInfo p4) {}
        public java.lang.String toString() { return null; }
    }

    private static class ParsingContext {
        private final com.android.internal.content.om.OverlayConfigParser.OverlayPartition mPartition = null;
        private final java.util.ArrayList<com.android.internal.content.om.OverlayConfigParser.ParsedConfiguration> mOrderedConfigurations = null;
        private final android.util.ArraySet<java.lang.String> mConfiguredOverlays = null;
        private boolean mFoundMutableOverlay;
        private int mMergeDepth;
        private ParsingContext(com.android.internal.content.om.OverlayConfigParser.OverlayPartition p0) {}
    }
}
