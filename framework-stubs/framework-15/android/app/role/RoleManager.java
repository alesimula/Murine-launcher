package android.app.role;

public final class RoleManager {
    public static final int MANAGE_HOLDERS_FLAG_DONT_KILL_APP = 1;
    public static final java.lang.String ROLE_ASSISTANT = "android.app.role.ASSISTANT";
    public static final java.lang.String ROLE_BROWSER = "android.app.role.BROWSER";
    public static final java.lang.String ROLE_CALL_REDIRECTION = "android.app.role.CALL_REDIRECTION";
    public static final java.lang.String ROLE_CALL_SCREENING = "android.app.role.CALL_SCREENING";
    public static final java.lang.String ROLE_DEVICE_POLICY_MANAGEMENT = "android.app.role.DEVICE_POLICY_MANAGEMENT";
    public static final java.lang.String ROLE_DIALER = "android.app.role.DIALER";
    public static final java.lang.String ROLE_EMERGENCY = "android.app.role.EMERGENCY";
    public static final java.lang.String ROLE_FINANCED_DEVICE_KIOSK = "android.app.role.FINANCED_DEVICE_KIOSK";
    public static final java.lang.String ROLE_HOME = "android.app.role.HOME";
    public static final java.lang.String ROLE_NOTES = "android.app.role.NOTES";
    public static final java.lang.String ROLE_SMS = "android.app.role.SMS";
    public static final java.lang.String ROLE_SYSTEM_ACTIVITY_RECOGNIZER = "android.app.role.SYSTEM_ACTIVITY_RECOGNIZER";
    public static final java.lang.String ROLE_SYSTEM_CALL_STREAMING = "android.app.role.SYSTEM_CALL_STREAMING";
    public static final java.lang.String ROLE_SYSTEM_SUPERVISION = "android.app.role.SYSTEM_SUPERVISION";
    public static final java.lang.String ROLE_SYSTEM_WELLBEING = "android.app.role.SYSTEM_WELLBEING";
    public static final java.lang.String ROLE_WALLET = "android.app.role.WALLET";
    RoleManager() {}
    @android.annotation.NonNull
    public android.content.Intent createRequestRoleIntent(java.lang.String p0) { return null; }
    public boolean isRoleAvailable(java.lang.String p0) { return false; }
    public boolean isRoleHeld(java.lang.String p0) { return false; }
    public void addOnRoleHoldersChangedListenerAsUser(java.util.concurrent.Executor p0, android.app.role.OnRoleHoldersChangedListener p1, android.os.UserHandle p2) {}
    public void addRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, android.os.UserHandle p3, java.util.concurrent.Executor p4, java.util.function.Consumer<java.lang.Boolean> p5) {}
    @java.lang.Deprecated
    public boolean addRoleHolderFromController(java.lang.String p0, java.lang.String p1) { return false; }
    public void clearRoleHoldersAsUser(java.lang.String p0, int p1, android.os.UserHandle p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Boolean> p4) {}
    @android.annotation.Nullable
    public java.lang.String getDefaultApplication(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getHeldRolesFromController(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getRoleHolders(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getRoleHoldersAsUser(java.lang.String p0, android.os.UserHandle p1) { return null; }
    public void isApplicationVisibleForRole(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public boolean isBypassingRoleQualification() { return false; }
    public boolean isRoleFallbackEnabled(java.lang.String p0) { return false; }
    public void isRoleVisible(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.Boolean> p2) {}
    public void removeOnRoleHoldersChangedListenerAsUser(android.app.role.OnRoleHoldersChangedListener p0, android.os.UserHandle p1) {}
    public void removeRoleHolderAsUser(java.lang.String p0, java.lang.String p1, int p2, android.os.UserHandle p3, java.util.concurrent.Executor p4, java.util.function.Consumer<java.lang.Boolean> p5) {}
    @java.lang.Deprecated
    public boolean removeRoleHolderFromController(java.lang.String p0, java.lang.String p1) { return false; }
    public void setBypassingRoleQualification(boolean p0) {}
    public void setDefaultApplication(java.lang.String p0, java.lang.String p1, int p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Boolean> p4) {}
    public void setRoleFallbackEnabled(java.lang.String p0, boolean p1) {}
    @java.lang.Deprecated
    public void setRoleNamesFromController(java.util.List<java.lang.String> p0) {}
    @android.annotation.Nullable
    public java.lang.String getBrowserRoleHolder(int p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getEmergencyRoleHolder(int p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getSmsRoleHolder(int p0) { return null; }
    @android.annotation.Nullable
    public boolean setBrowserRoleHolder(java.lang.String p0, int p1) { return false; }
}
