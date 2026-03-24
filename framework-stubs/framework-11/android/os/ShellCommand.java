package android.os;

public abstract class ShellCommand extends android.os.BasicShellCommandHandler {
    private android.os.ShellCallback mShellCallback;
    private android.os.ResultReceiver mResultReceiver;
    public ShellCommand() { super(); }
    public int exec(android.os.Binder p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, java.lang.String[] p4, android.os.ShellCallback p5, android.os.ResultReceiver p6) { return 0; }
    public android.os.ResultReceiver adoptResultReceiver() { return null; }
    public android.os.ParcelFileDescriptor openFileForSystem(java.lang.String p0, java.lang.String p1) { return null; }
    public int handleDefaultCommands(java.lang.String p0) { return 0; }
    public java.lang.String peekNextArg() { return null; }
    public android.os.ShellCallback getShellCallback() { return null; }
}
