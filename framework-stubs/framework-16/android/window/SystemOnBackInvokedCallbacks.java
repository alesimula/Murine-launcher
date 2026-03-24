package android.window;

@android.annotation.FlaggedApi("com.android.window.flags.predictive_back_system_override_callback")
public final class SystemOnBackInvokedCallbacks {
    @android.annotation.FlaggedApi("com.android.window.flags.predictive_back_system_override_callback")
    @android.annotation.NonNull
    public static android.window.OnBackInvokedCallback moveTaskToBackCallback(android.app.Activity p0) { return null; }
    @android.annotation.FlaggedApi("com.android.window.flags.predictive_back_system_override_callback")
    @android.annotation.NonNull
    public static android.window.OnBackInvokedCallback finishAndRemoveTaskCallback(android.app.Activity p0) { return null; }

    private static class FinishAndRemoveTaskCallbackFactory extends android.window.SystemOnBackInvokedCallbacks.OverrideCallbackFactory<android.app.Activity> {
        protected android.window.SystemOverrideOnBackInvokedCallback createCallback(android.app.Activity p0) { return null; }
    }

    private static class MoveTaskToBackCallbackFactory extends android.window.SystemOnBackInvokedCallbacks.OverrideCallbackFactory<android.app.Activity> {
        protected android.window.SystemOverrideOnBackInvokedCallback createCallback(android.app.Activity p0) { return null; }
    }

    private static abstract class OverrideCallbackFactory<TYPE extends java.lang.Object> {
        protected abstract android.window.SystemOverrideOnBackInvokedCallback createCallback(TYPE p0);
        @android.annotation.NonNull
        android.window.SystemOverrideOnBackInvokedCallback getOverrideCallback(TYPE p0) { return null; }
    }
}
