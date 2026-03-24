package android.app.appsearch;

public class AppSearchManager {
    AppSearchManager() {}
    public void createEnterpriseGlobalSearchSession(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.EnterpriseGlobalSearchSession>> p1) {}
    public void createGlobalSearchSession(java.util.concurrent.Executor p0, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.GlobalSearchSession>> p1) {}
    public void createSearchSession(android.app.appsearch.AppSearchManager.SearchContext p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.app.appsearch.AppSearchResult<android.app.appsearch.AppSearchSession>> p2) {}
    @android.annotation.NonNull
    public android.app.appsearch.functions.AppFunctionManager getAppFunctionManager() { return null; }

    public static final class SearchContext {
        SearchContext() {}
        @android.annotation.NonNull
        public java.lang.String getDatabaseName() { return null; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            @android.annotation.NonNull
            public android.app.appsearch.AppSearchManager.SearchContext build() { return null; }
        }
    }
}
