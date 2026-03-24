package com.android.internal.widget;

public abstract class LockSettingsInternal {
    public LockSettingsInternal() {}
    public abstract long addEscrowToken(byte[] p0, int p1, com.android.internal.widget.LockPatternUtils.EscrowTokenStateChangeCallback p2);
    public abstract boolean removeEscrowToken(long p0, int p1);
    public abstract boolean isEscrowTokenActive(long p0, int p1);
    public abstract boolean setLockCredentialWithToken(byte[] p0, int p1, long p2, byte[] p3, int p4, int p5);
    public abstract boolean unlockUserWithToken(long p0, byte[] p1, int p2);
}
