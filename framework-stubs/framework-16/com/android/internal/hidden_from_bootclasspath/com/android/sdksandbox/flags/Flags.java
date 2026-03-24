package com.android.internal.hidden_from_bootclasspath.com.android.sdksandbox.flags;

public final class Flags {
    public static final java.lang.String FLAG_SANDBOX_ACTIVITY_SDK_BASED_CONTEXT = "com.android.sdksandbox.flags.sandbox_activity_sdk_based_context";
    public static final java.lang.String FLAG_SANDBOX_CLIENT_IMPORTANCE_LISTENER = "com.android.sdksandbox.flags.sandbox_client_importance_listener";
    public static final java.lang.String FLAG_SDK_SANDBOX_INSTRUMENTATION_INFO = "com.android.sdksandbox.flags.sdk_sandbox_instrumentation_info";
    public static final java.lang.String FLAG_SDK_SANDBOX_UID_TO_APP_UID_API = "com.android.sdksandbox.flags.sdk_sandbox_uid_to_app_uid_api";
    public static final java.lang.String FLAG_SELINUX_INPUT_SELECTOR = "com.android.sdksandbox.flags.selinux_input_selector";
    public static final java.lang.String FLAG_SELINUX_SDK_SANDBOX_AUDIT = "com.android.sdksandbox.flags.selinux_sdk_sandbox_audit";
    public Flags() {}
    public static boolean sandboxActivitySdkBasedContext() { return false; }
    public static boolean sandboxClientImportanceListener() { return false; }
    public static boolean sdkSandboxInstrumentationInfo() { return false; }
    public static boolean sdkSandboxUidToAppUidApi() { return false; }
    public static boolean selinuxInputSelector() { return false; }
    public static boolean selinuxSdkSandboxAudit() { return false; }
}
