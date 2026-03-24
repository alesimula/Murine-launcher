package com.android.internal.os;

public final class AtomicDirectory {
    public AtomicDirectory(java.io.File p0) {}
    @android.annotation.NonNull
    public java.io.File getBackupDirectory() { return null; }
    @android.annotation.NonNull
    public java.io.File startRead() throws java.io.IOException { return null; }
    public void finishRead() {}
    @android.annotation.NonNull
    public java.io.File startWrite() throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public java.io.FileOutputStream openWrite(java.io.File p0) throws java.io.IOException { return null; }
    public void closeWrite(java.io.FileOutputStream p0) {}
    public void failWrite(java.io.FileOutputStream p0) {}
    public void finishWrite() {}
    public void failWrite() {}
    public boolean exists() { return false; }
    public void delete() {}
}
