package android.provider;

public interface FeatureFlags {
    public boolean allowConfigMaximumCallLogEntriesPerSim();
    public boolean enableDocumentsTrashApi();
    public boolean launcherDataAccess();
    public boolean newDefaultAccountApiEnabled();
    public boolean reduceBinderTransactionSizeForGetAllProperties();
    public boolean systemRegionalPreferencesApiEnabled();
    public boolean systemSettingsDefault();
    public boolean userKeys();
}
