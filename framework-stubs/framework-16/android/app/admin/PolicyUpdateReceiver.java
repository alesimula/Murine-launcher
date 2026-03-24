package android.app.admin;

public abstract class PolicyUpdateReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String ACTION_DEVICE_POLICY_SET_RESULT = "android.app.admin.action.DEVICE_POLICY_SET_RESULT";
    public static final java.lang.String ACTION_DEVICE_POLICY_CHANGED = "android.app.admin.action.DEVICE_POLICY_CHANGED";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.app.admin.extra.PACKAGE_NAME";
    public static final java.lang.String EXTRA_PERMISSION_NAME = "android.app.admin.extra.PERMISSION_NAME";
    public static final java.lang.String EXTRA_INTENT_FILTER = "android.app.admin.extra.INTENT_FILTER";
    public static final java.lang.String EXTRA_ACCOUNT_TYPE = "android.app.admin.extra.ACCOUNT_TYPE";
    public static final java.lang.String EXTRA_POLICY_KEY = "android.app.admin.extra.POLICY_KEY";
    public static final java.lang.String EXTRA_POLICY_BUNDLE_KEY = "android.app.admin.extra.POLICY_BUNDLE_KEY";
    public static final java.lang.String EXTRA_POLICY_UPDATE_RESULT_KEY = "android.app.admin.extra.POLICY_UPDATE_RESULT_KEY";
    public static final java.lang.String EXTRA_POLICY_TARGET_USER_ID = "android.app.admin.extra.POLICY_TARGET_USER_ID";
    public PolicyUpdateReceiver() { super(); }
    public final void onReceive(android.content.Context p0, android.content.Intent p1) {}
    static java.lang.String getPolicyKey(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    static android.os.Bundle getPolicyExtraBundle(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    static android.app.admin.PolicyUpdateResult getPolicyChangedReason(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    static android.app.admin.TargetUser getTargetUser(android.content.Intent p0) { return null; }
    public void onPolicySetResult(android.content.Context p0, java.lang.String p1, android.os.Bundle p2, android.app.admin.TargetUser p3, android.app.admin.PolicyUpdateResult p4) {}
    public void onPolicyChanged(android.content.Context p0, java.lang.String p1, android.os.Bundle p2, android.app.admin.TargetUser p3, android.app.admin.PolicyUpdateResult p4) {}
}
