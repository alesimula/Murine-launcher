package com.android.internal.flags;

public abstract class CoreFlags {
    public static android.flags.BooleanFlag BOOL_FLAG;
    public static android.flags.FusedOffFlag OFF_FLAG;
    public static android.flags.FusedOnFlag ON_FLAG;
    public static android.flags.DynamicBooleanFlag DYN_FLAG;
    public CoreFlags() {}
    public static boolean isCoreFlag(android.flags.SyncableFlag p0) { return false; }
    public static java.util.List<android.flags.SyncableFlag> getCoreFlags() { return null; }
}
