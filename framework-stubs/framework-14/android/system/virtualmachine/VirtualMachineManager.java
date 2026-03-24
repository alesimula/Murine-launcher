package android.system.virtualmachine;

public class VirtualMachineManager {
    public static final int CAPABILITY_NON_PROTECTED_VM = 2;
    public static final int CAPABILITY_PROTECTED_VM = 1;
    VirtualMachineManager() {}
    public int getCapabilities() { return 0; }
    @android.annotation.NonNull
    public android.system.virtualmachine.VirtualMachine create(java.lang.String p0, android.system.virtualmachine.VirtualMachineConfig p1) throws android.system.virtualmachine.VirtualMachineException { return null; }
    @android.annotation.Nullable
    public android.system.virtualmachine.VirtualMachine get(java.lang.String p0) throws android.system.virtualmachine.VirtualMachineException { return null; }
    @android.annotation.NonNull
    public android.system.virtualmachine.VirtualMachine importFromDescriptor(java.lang.String p0, android.system.virtualmachine.VirtualMachineDescriptor p1) throws android.system.virtualmachine.VirtualMachineException { return null; }
    @android.annotation.NonNull
    public android.system.virtualmachine.VirtualMachine getOrCreate(java.lang.String p0, android.system.virtualmachine.VirtualMachineConfig p1) throws android.system.virtualmachine.VirtualMachineException { return null; }
    public void delete(java.lang.String p0) throws android.system.virtualmachine.VirtualMachineException {}
}
