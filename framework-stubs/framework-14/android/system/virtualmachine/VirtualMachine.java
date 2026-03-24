package android.system.virtualmachine;

public class VirtualMachine implements java.lang.AutoCloseable {
    public static final java.lang.String MANAGE_VIRTUAL_MACHINE_PERMISSION = "android.permission.MANAGE_VIRTUAL_MACHINE";
    public static final long MAX_VSOCK_PORT = 4294967295L;
    public static final long MIN_VSOCK_PORT = 1024L;
    public static final int STATUS_DELETED = 2;
    public static final int STATUS_RUNNING = 1;
    public static final int STATUS_STOPPED = 0;
    public static final java.lang.String USE_CUSTOM_VIRTUAL_MACHINE_PERMISSION = "android.permission.USE_CUSTOM_VIRTUAL_MACHINE";
    VirtualMachine() {}
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public android.system.virtualmachine.VirtualMachineConfig getConfig() { return null; }
    public int getStatus() { return 0; }
    public void setCallback(java.util.concurrent.Executor p0, android.system.virtualmachine.VirtualMachineCallback p1) {}
    public void clearCallback() {}
    public void run() throws android.system.virtualmachine.VirtualMachineException {}
    @android.annotation.NonNull
    public java.io.InputStream getConsoleOutput() throws android.system.virtualmachine.VirtualMachineException { return null; }
    @android.annotation.NonNull
    public java.io.InputStream getLogOutput() throws android.system.virtualmachine.VirtualMachineException { return null; }
    public void stop() throws android.system.virtualmachine.VirtualMachineException {}
    public void close() {}
    @android.annotation.NonNull
    public android.system.virtualmachine.VirtualMachineConfig setConfig(android.system.virtualmachine.VirtualMachineConfig p0) throws android.system.virtualmachine.VirtualMachineException { return null; }
    @android.annotation.NonNull
    public android.os.IBinder connectToVsockServer(long p0) throws android.system.virtualmachine.VirtualMachineException { return null; }
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor connectVsock(long p0) throws android.system.virtualmachine.VirtualMachineException { return null; }
    @android.annotation.NonNull
    public android.system.virtualmachine.VirtualMachineDescriptor toDescriptor() throws android.system.virtualmachine.VirtualMachineException { return null; }
    public java.lang.String toString() { return null; }
}
