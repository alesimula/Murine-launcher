package com.android.internal.os;

public final class AtomicFile {
    private final java.io.File mBaseName = null;
    private final java.io.File mBackupName = null;
    @android.annotation.UnsupportedAppUsage
    public AtomicFile(java.io.File p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public java.io.File getBaseFile() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.io.FileOutputStream startWrite() throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public void finishWrite(java.io.FileOutputStream p0) {}
    @android.annotation.UnsupportedAppUsage
    public void failWrite(java.io.FileOutputStream p0) {}
    @android.annotation.UnsupportedAppUsage
    public java.io.FileOutputStream openAppend() throws java.io.IOException { return null; }
    @android.annotation.UnsupportedAppUsage
    public void truncate() throws java.io.IOException {}
    public boolean exists() { return false; }
    public void delete() {}
    @android.annotation.UnsupportedAppUsage
    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException { return null; }
    @android.annotation.UnsupportedAppUsage
    public byte[] readFully() throws java.io.IOException { return null; }
}
