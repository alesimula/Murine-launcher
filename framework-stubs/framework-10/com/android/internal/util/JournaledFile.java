package com.android.internal.util;

@java.lang.Deprecated
public class JournaledFile {
    java.io.File mReal;
    java.io.File mTemp;
    boolean mWriting;
    @android.annotation.UnsupportedAppUsage
    public JournaledFile(java.io.File p0, java.io.File p1) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public java.io.File chooseForRead() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public java.io.File chooseForWrite() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void commit() {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void rollback() {}
}
