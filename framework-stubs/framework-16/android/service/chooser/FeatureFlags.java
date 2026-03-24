package android.service.chooser;

public interface FeatureFlags {
    public boolean chooserAlbumText();
    public boolean chooserPayloadToggling();
    public boolean doNotDelayChooserAdapterNotifyDataChange();
    public boolean enableChooserResult();
    public boolean enableSharesheetMetadataExtra();
    public boolean fixResolverMemoryLeak();
    public boolean interactiveChooser();
    public boolean notifySingleItemChangeOnIconLoad();
}
