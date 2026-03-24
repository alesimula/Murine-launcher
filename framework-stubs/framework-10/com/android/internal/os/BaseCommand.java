package com.android.internal.os;

public abstract class BaseCommand {
    @android.annotation.UnsupportedAppUsage
    protected final android.os.ShellCommand mArgs = null;
    public static final java.lang.String FATAL_ERROR_CODE = "Error type 1";
    public static final java.lang.String NO_SYSTEM_ERROR_CODE = "Error type 2";
    public static final java.lang.String NO_CLASS_ERROR_CODE = "Error type 3";
    private java.lang.String[] mRawArgs;
    public BaseCommand() {}
    public void run(java.lang.String[] p0) {}
    public void showUsage() {}
    public void showError(java.lang.String p0) {}
    public abstract void onRun() throws java.lang.Exception;
    public abstract void onShowUsage(java.io.PrintStream p0);
    public java.lang.String nextOption() { return null; }
    public java.lang.String nextArg() { return null; }
    public java.lang.String peekNextArg() { return null; }
    public java.lang.String nextArgRequired() { return null; }
    public java.lang.String[] getRawArgs() { return null; }
}
