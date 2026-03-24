package com.android.internal.widget;

public abstract class LockSettingsInternal {
    public static final int ARM_REBOOT_ERROR_NONE = 0;
    public static final int ARM_REBOOT_ERROR_UNSPECIFIED = 1;
    public static final int ARM_REBOOT_ERROR_ESCROW_NOT_READY = 2;
    public static final int ARM_REBOOT_ERROR_NO_PROVIDER = 3;
    public static final int ARM_REBOOT_ERROR_PROVIDER_MISMATCH = 4;
    public static final int ARM_REBOOT_ERROR_NO_ESCROW_KEY = 5;
    public static final int ARM_REBOOT_ERROR_KEYSTORE_FAILURE = 6;
    public static final int ARM_REBOOT_ERROR_STORE_ESCROW_KEY = 7;
    public LockSettingsInternal() {}
    public abstract long addEscrowToken(byte[] p0, int p1, com.android.internal.widget.LockPatternUtils.EscrowTokenStateChangeCallback p2);
    public abstract boolean removeEscrowToken(long p0, int p1);
    public abstract boolean isEscrowTokenActive(long p0, int p1);
    public abstract boolean setLockCredentialWithToken(com.android.internal.widget.LockscreenCredential p0, long p1, byte[] p2, int p3);
    public abstract boolean unlockUserWithToken(long p0, byte[] p1, int p2);
    public abstract android.app.admin.PasswordMetrics getUserPasswordMetrics(int p0);
    public abstract boolean prepareRebootEscrow();
    public abstract void setRebootEscrowListener(com.android.internal.widget.RebootEscrowListener p0);
    public abstract boolean clearRebootEscrow();
    public abstract int armRebootEscrow();
    public abstract void refreshStrongAuthTimeout(int p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ArmRebootEscrowErrorCode {
    }
}
