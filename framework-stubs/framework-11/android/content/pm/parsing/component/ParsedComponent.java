package android.content.pm.parsing.component;

public abstract class ParsedComponent implements android.os.Parcelable {
    private static android.content.pm.parsing.component.ParsedIntentInfo.ListParceler sForIntentInfos;
    private java.lang.String name;
    int icon;
    int labelRes;
    java.lang.CharSequence nonLocalizedLabel;
    int logo;
    int banner;
    int descriptionRes;
    int flags;
    private java.lang.String packageName;
    private java.util.List<android.content.pm.parsing.component.ParsedIntentInfo> intents;
    private android.content.ComponentName componentName;
    protected android.os.Bundle metaData;
    ParsedComponent() {}
    public ParsedComponent(android.content.pm.parsing.component.ParsedComponent p0) {}
    public void addIntent(android.content.pm.parsing.component.ParsedIntentInfo p0) {}
    public java.util.List<android.content.pm.parsing.component.ParsedIntentInfo> getIntents() { return null; }
    public android.content.pm.parsing.component.ParsedComponent setName(java.lang.String p0) { return null; }
    public void setPackageName(java.lang.String p0) {}
    public android.content.ComponentName getComponentName() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected ParsedComponent(android.os.Parcel p0) {}
    public java.lang.String getName() { return null; }
    public int getIcon() { return 0; }
    public int getLabelRes() { return 0; }
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    public int getLogo() { return 0; }
    public int getBanner() { return 0; }
    public int getDescriptionRes() { return 0; }
    public int getFlags() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public android.os.Bundle getMetaData() { return null; }
}
