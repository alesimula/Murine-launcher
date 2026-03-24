package com.android.internal.os;

public final class AtomicDirectory {
    private final android.util.ArrayMap<java.io.File, java.io.FileOutputStream> mOpenFiles = null;
    private final java.io.File mBaseDirectory = null;
    private final java.io.File mBackupDirectory = null;
    private int mBaseDirectoryFd;
    private int mBackupDirectoryFd;
    public AtomicDirectory(java.io.File p0) {}
    public java.io.File getBackupDirectory() { return null; }
    public java.io.File startRead() throws java.io.IOException { return null; }
    public void finishRead() {}
    public java.io.File startWrite() throws java.io.IOException { return null; }
    public java.io.FileOutputStream openWrite(java.io.File p0) throws java.io.IOException { return null; }
    public void closeWrite(java.io.FileOutputStream p0) {}
    public void failWrite(java.io.FileOutputStream p0) {}
    public void finishWrite() {}
    public void failWrite() {}
    public boolean exists() { return false; }
    public void delete() {}
    private java.io.File getOrCreateBaseDirectory() throws java.io.IOException { return null; }
    private void throwIfSomeFilesOpen() {}
    private void backup() throws java.io.IOException {}
    private void restore() throws java.io.IOException {}
    private static void deleteDirectory(java.io.File p0) {}
    private static native int getDirectoryFd(java.lang.String p0);
    private static native void fsyncDirectoryFd(int p0);
}
