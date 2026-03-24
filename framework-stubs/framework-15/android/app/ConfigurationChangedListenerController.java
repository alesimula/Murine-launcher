package android.app;

class ConfigurationChangedListenerController {
    ConfigurationChangedListenerController() {}
    void addListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.IBinder> p1) {}
    void removeListener(java.util.function.Consumer<android.os.IBinder> p0) {}
    void dispatchOnConfigurationChanged(android.os.IBinder p0) {}

    private static final class ListenerContainer {
        ListenerContainer(java.util.concurrent.Executor p0, java.util.function.Consumer<android.os.IBinder> p1) {}
        public boolean isMatch(java.util.function.Consumer<android.os.IBinder> p0) { return false; }
        public void accept(android.os.IBinder p0) {}
    }
}
