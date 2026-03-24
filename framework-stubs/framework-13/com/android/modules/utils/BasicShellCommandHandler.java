package com.android.modules.utils;

public abstract class BasicShellCommandHandler {
    protected static final java.lang.String TAG = "ShellCommand";
    protected static final boolean DEBUG = false;
    public BasicShellCommandHandler() {}
    public void init(android.os.Binder p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, java.lang.String[] p4, int p5) {}
    public int exec(android.os.Binder p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, java.lang.String[] p4) { return 0; }
    public java.io.FileDescriptor getOutFileDescriptor() { return null; }
    public java.io.OutputStream getRawOutputStream() { return null; }
    public java.io.PrintWriter getOutPrintWriter() { return null; }
    public java.io.FileDescriptor getErrFileDescriptor() { return null; }
    public java.io.OutputStream getRawErrorStream() { return null; }
    public java.io.PrintWriter getErrPrintWriter() { return null; }
    public java.io.FileDescriptor getInFileDescriptor() { return null; }
    public java.io.InputStream getRawInputStream() { return null; }
    public java.io.InputStream getBufferedInputStream() { return null; }
    public java.lang.String getNextOption() { return null; }
    public java.lang.String getNextArg() { return null; }
    public java.lang.String peekNextArg() { return null; }
    public java.lang.String[] peekRemainingArgs() { return null; }
    public int getRemainingArgsCount() { return 0; }
    public java.lang.String getNextArgRequired() { return null; }
    public int handleDefaultCommands(java.lang.String p0) { return 0; }
    public android.os.Binder getTarget() { return null; }
    public java.lang.String[] getAllArgs() { return null; }
    public abstract int onCommand(java.lang.String p0);
    public abstract void onHelp();
}
