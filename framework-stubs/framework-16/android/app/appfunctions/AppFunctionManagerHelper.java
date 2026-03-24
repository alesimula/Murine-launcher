package android.app.appfunctions;

@android.annotation.FlaggedApi("android.app.appfunctions.flags.enable_app_function_manager")
public class AppFunctionManagerHelper {
    public AppFunctionManagerHelper() {}
    public static void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.app.appsearch.AppSearchManager p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p4) {}

    public static class AppFunctionNotFoundException extends java.lang.RuntimeException {
    }
}
