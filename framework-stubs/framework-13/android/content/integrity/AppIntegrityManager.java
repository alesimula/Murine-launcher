package android.content.integrity;

@android.annotation.SystemApi
public class AppIntegrityManager {
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_FAILURE = 1;
    public static final java.lang.String EXTRA_STATUS = "android.content.integrity.extra.STATUS";
    android.content.integrity.IAppIntegrityManager mManager;
    public AppIntegrityManager(android.content.integrity.IAppIntegrityManager p0) {}
    public void updateRuleSet(android.content.integrity.RuleSet p0, android.content.IntentSender p1) {}
    public java.lang.String getCurrentRuleSetVersion() { return null; }
    public java.lang.String getCurrentRuleSetProvider() { return null; }
    public android.content.integrity.RuleSet getCurrentRuleSet() { return null; }
    public java.util.List<java.lang.String> getWhitelistedRuleProviders() { return null; }
}
