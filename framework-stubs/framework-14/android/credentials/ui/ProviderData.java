package android.credentials.ui;

@android.annotation.SuppressLint({"ParcelCreator", "ParcelNotFinal"})
public abstract class ProviderData implements android.os.Parcelable {
    public static final java.lang.String EXTRA_ENABLED_PROVIDER_DATA_LIST = "android.credentials.ui.extra.ENABLED_PROVIDER_DATA_LIST";
    public static final java.lang.String EXTRA_DISABLED_PROVIDER_DATA_LIST = "android.credentials.ui.extra.DISABLED_PROVIDER_DATA_LIST";
    public ProviderData(java.lang.String p0) {}
    public java.lang.String getProviderFlattenedComponentName() { return null; }
    protected ProviderData(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
