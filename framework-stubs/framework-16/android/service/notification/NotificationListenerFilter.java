package android.service.notification;

public class NotificationListenerFilter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.notification.NotificationListenerFilter> CREATOR = null;
    public NotificationListenerFilter() {}
    public NotificationListenerFilter(int p0, android.util.ArraySet<android.content.pm.VersionedPackage> p1) {}
    protected NotificationListenerFilter(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isTypeAllowed(int p0) { return false; }
    public boolean areAllTypesAllowed() { return false; }
    public boolean isPackageAllowed(android.content.pm.VersionedPackage p0) { return false; }
    public int getTypes() { return 0; }
    public android.util.ArraySet<android.content.pm.VersionedPackage> getDisallowedPackages() { return null; }
    public void setTypes(int p0) {}
    public void setDisallowedPackages(android.util.ArraySet<android.content.pm.VersionedPackage> p0) {}
    public void removePackage(android.content.pm.VersionedPackage p0) {}
    public void addPackage(android.content.pm.VersionedPackage p0) {}
    public int describeContents() { return 0; }
}
