package android.os;

public abstract class ShellCommand {
    static final java.lang.String TAG = "ShellCommand";
    static final boolean DEBUG = false;
    private android.os.Binder mTarget;
    private java.io.FileDescriptor mIn;
    private java.io.FileDescriptor mOut;
    private java.io.FileDescriptor mErr;
    private java.lang.String[] mArgs;
    private android.os.ShellCallback mShellCallback;
    private android.os.ResultReceiver mResultReceiver;
    private java.lang.String mCmd;
    private int mArgPos;
    private java.lang.String mCurArgData;
    private java.io.FileInputStream mFileIn;
    private java.io.FileOutputStream mFileOut;
    private java.io.FileOutputStream mFileErr;
    private com.android.internal.util.FastPrintWriter mOutPrintWriter;
    private com.android.internal.util.FastPrintWriter mErrPrintWriter;
    private java.io.InputStream mInputStream;
    public ShellCommand() {}
    public void init(android.os.Binder p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, java.lang.String[] p4, android.os.ShellCallback p5, int p6) {}
    public int exec(android.os.Binder p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, java.lang.String[] p4, android.os.ShellCallback p5, android.os.ResultReceiver p6) { return 0; }
    public android.os.ResultReceiver adoptResultReceiver() { return null; }
    public java.io.FileDescriptor getOutFileDescriptor() { return null; }
    public java.io.OutputStream getRawOutputStream() { return null; }
    public java.io.PrintWriter getOutPrintWriter() { return null; }
    public java.io.FileDescriptor getErrFileDescriptor() { return null; }
    public java.io.OutputStream getRawErrorStream() { return null; }
    public java.io.PrintWriter getErrPrintWriter() { return null; }
    public java.io.FileDescriptor getInFileDescriptor() { return null; }
    public java.io.InputStream getRawInputStream() { return null; }
    public java.io.InputStream getBufferedInputStream() { return null; }
    public android.os.ParcelFileDescriptor openFileForSystem(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String getNextOption() { return null; }
    public java.lang.String getNextArg() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String peekNextArg() { return null; }
    public java.lang.String getNextArgRequired() { return null; }
    public android.os.ShellCallback getShellCallback() { return null; }
    public int handleDefaultCommands(java.lang.String p0) { return 0; }
    public abstract int onCommand(java.lang.String p0);
    public abstract void onHelp();
}
