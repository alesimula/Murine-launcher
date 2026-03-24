package com.android.internal.widget;

public abstract class LockSettingsInternal {
    public LockSettingsInternal() {}
    public abstract long addEscrowToken(byte[] p0, int p1, com.android.internal.widget.LockPatternUtils.EscrowTokenStateChangeCallback p2);
    public abstract boolean removeEscrowToken(long p0, int p1);
    public abstract boolean isEscrowTokenActive(long p0, int p1);
    public abstract boolean setLockCredentialWithToken(com.android.internal.widget.LockscreenCredential p0, long p1, byte[] p2, int p3);
    public abstract boolean unlockUserWithToken(long p0, byte[] p1, int p2);
    public abstract android.app.admin.PasswordMetrics getUserPasswordMetrics(int p0);
    public abstract void prepareRebootEscrow();
    public abstract void setRebootEscrowListener(com.android.internal.widget.RebootEscrowListener p0);
    public abstract void clearRebootEscrow();
    public abstract boolean armRebootEscrow();
    public abstract void refreshStrongAuthTimeout(int p0);
}
