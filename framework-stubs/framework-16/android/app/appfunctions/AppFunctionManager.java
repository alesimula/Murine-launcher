package android.app.appfunctions;

@android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
public final class AppFunctionManager {
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_ui_enabled")
    public static final java.lang.String ACTION_MANAGE_APP_FUNCTION_ACCESS = "android.app.appfunctions.action.MANAGE_APP_FUNCTION_ACCESS";
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_ui_enabled")
    public static final java.lang.String ACTION_MANAGE_AGENT_APP_FUNCTION_ACCESS = "android.app.appfunctions.action.MANAGE_AGENT_APP_FUNCTION_ACCESS";
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_ui_enabled")
    public static final java.lang.String ACTION_MANAGE_TARGET_APP_FUNCTION_ACCESS = "android.app.appfunctions.action.MANAGE_TARGET_APP_FUNCTION_ACCESS";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_ui_enabled")
    public static final java.lang.String ACTION_REQUEST_APP_FUNCTION_ACCESS = "android.app.appfunctions.action.REQUEST_APP_FUNCTION_ACCESS";
    public static final int APP_FUNCTION_STATE_DEFAULT = 0;
    public static final int APP_FUNCTION_STATE_ENABLED = 1;
    public static final int APP_FUNCTION_STATE_DISABLED = 2;
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public static final int ACCESS_REQUEST_STATE_GRANTED = 0;
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public static final int ACCESS_REQUEST_STATE_DENIED = 1;
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public static final int ACCESS_REQUEST_STATE_UNREQUESTABLE = 2;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public static final int ACCESS_FLAG_PREGRANTED = 1;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public static final int ACCESS_FLAG_OTHER_GRANTED = 2;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public static final int ACCESS_FLAG_OTHER_DENIED = 4;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public static final int ACCESS_FLAG_USER_GRANTED = 8;
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.app_function_access_api_enabled")
    public static final int ACCESS_FLAG_USER_DENIED = 16;
    public static final int ACCESS_FLAG_MASK_USER = 24;
    public static final int ACCESS_FLAG_MASK_OTHER = 6;
    public static final int ACCESS_FLAG_MASK_ALL = 31;
    public AppFunctionManager(android.app.appfunctions.IAppFunctionManager p0, android.content.Context p1) {}
    @android.annotation.RequiresPermission(value="android.permission.EXECUTE_APP_FUNCTIONS", conditional=true)
    public void executeAppFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.util.concurrent.Executor p1, android.os.CancellationSignal p2, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p3) {}
    @android.annotation.RequiresPermission(value="android.permission.EXECUTE_APP_FUNCTIONS", conditional=true)
    public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p3) {}
    public void isAppFunctionEnabled(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    public void setAppFunctionEnabled(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface AppFunctionAccessFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface AppFunctionAccessState {
    }

    private static class CallbackWrapper extends android.app.appfunctions.IAppFunctionEnabledCallback.Stub {
        CallbackWrapper(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p1) { super(); }
        public void onSuccess() {}
        public void onError(android.os.ParcelableException p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnabledState {
    }
}
