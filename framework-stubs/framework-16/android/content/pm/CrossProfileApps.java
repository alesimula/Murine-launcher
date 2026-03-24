package android.content.pm;

public class CrossProfileApps {
    public static final java.lang.String ACTION_CAN_INTERACT_ACROSS_PROFILES_CHANGED = "android.content.pm.action.CAN_INTERACT_ACROSS_PROFILES_CHANGED";
    public CrossProfileApps(android.content.Context p0, android.content.pm.ICrossProfileApps p1) {}
    public void startMainActivity(android.content.ComponentName p0, android.os.UserHandle p1) {}
    public void startMainActivity(android.content.ComponentName p0, android.os.UserHandle p1, android.app.Activity p2, android.os.Bundle p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_PROFILES", "android.permission.INTERACT_ACROSS_USERS"})
    public void startActivity(android.content.Intent p0, android.os.UserHandle p1, android.app.Activity p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_PROFILES", "android.permission.INTERACT_ACROSS_USERS"})
    public void startActivity(android.content.Intent p0, android.os.UserHandle p1, android.app.Activity p2, android.os.Bundle p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_PROFILES", "android.permission.START_CROSS_PROFILE_ACTIVITIES"})
    public void startActivity(android.content.ComponentName p0, android.os.UserHandle p1, android.app.Activity p2, android.os.Bundle p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.INTERACT_ACROSS_PROFILES", "android.permission.START_CROSS_PROFILE_ACTIVITIES"})
    public void startActivity(android.content.ComponentName p0, android.os.UserHandle p1) {}
    @android.annotation.NonNull
    public java.util.List<android.os.UserHandle> getTargetUserProfiles() { return null; }
    @android.annotation.FlaggedApi("android.app.admin.flags.allow_querying_profile_type")
    public boolean isProfile(android.os.UserHandle p0) { return false; }
    @android.annotation.FlaggedApi("android.app.admin.flags.allow_querying_profile_type")
    public boolean isManagedProfile(android.os.UserHandle p0) { return false; }
    @android.annotation.NonNull
    public java.lang.CharSequence getProfileSwitchingLabel(android.os.UserHandle p0) { return null; }
    @android.annotation.NonNull
    public android.graphics.drawable.Drawable getProfileSwitchingIconDrawable(android.os.UserHandle p0) { return null; }
    public boolean canRequestInteractAcrossProfiles() { return false; }
    public boolean canInteractAcrossProfiles() { return false; }
    @android.annotation.NonNull
    public android.content.Intent createRequestInteractAcrossProfilesIntent() { return null; }
    @android.annotation.RequiresPermission(allOf={"android.permission.CONFIGURE_INTERACT_ACROSS_PROFILES", "android.permission.INTERACT_ACROSS_USERS"})
    public void setInteractAcrossProfilesAppOp(java.lang.String p0, int p1) {}
    public boolean canConfigureInteractAcrossProfiles(java.lang.String p0) { return false; }
    public boolean canUserAttemptToConfigureInteractAcrossProfiles(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.CONFIGURE_INTERACT_ACROSS_PROFILES", "android.permission.INTERACT_ACROSS_USERS"})
    public void resetInteractAcrossProfilesAppOps(java.util.Collection<java.lang.String> p0, java.util.Set<java.lang.String> p1) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.CONFIGURE_INTERACT_ACROSS_PROFILES", "android.permission.INTERACT_ACROSS_USERS"})
    public void clearInteractAcrossProfilesAppOps() {}
}
