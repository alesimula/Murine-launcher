package android.app;

class ConfigurationController {
    ConfigurationController(android.app.ActivityThreadInternal p0) {}
    android.content.res.Configuration updatePendingConfiguration(android.content.res.Configuration p0) { return null; }
    android.content.res.Configuration getPendingConfiguration(boolean p0) { return null; }
    void setCompatConfiguration(android.content.res.Configuration p0) {}
    android.content.res.Configuration getCompatConfiguration() { return null; }
    final android.content.res.Configuration applyCompatConfiguration() { return null; }
    void setConfiguration(android.content.res.Configuration p0) {}
    android.content.res.Configuration getConfiguration() { return null; }
    void handleConfigurationChanged(android.content.res.Configuration p0) {}
    void handleConfigurationChanged(android.content.res.CompatibilityInfo p0) {}
    void handleConfigurationChanged(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1) {}
    void performConfigurationChanged(android.content.ComponentCallbacks2 p0, android.content.res.Configuration p1) {}
    void updateDefaultDensity(int p0) {}
    int getCurDefaultDisplayDpi() { return 0; }
    void updateLocaleListFromAppContext(android.content.Context p0) {}
    static android.content.res.Configuration createNewConfigAndUpdateIfNotNull(android.content.res.Configuration p0, android.content.res.Configuration p1) { return null; }
}
