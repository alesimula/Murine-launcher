package android.app.usage;

public interface IUsageStatsManager extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ParceledListSlice queryUsageStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.content.pm.ParceledListSlice queryConfigurationStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryEventStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.usage.UsageEvents queryEvents(long p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public android.app.usage.UsageEvents queryEventsForPackage(long p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public android.app.usage.UsageEvents queryEventsForUser(long p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.usage.UsageEvents queryEventsForPackageForUser(long p0, long p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void setAppInactive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public boolean isAppInactive(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void whitelistAppTemporarily(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    public void onCarrierPrivilegedAppsChanged() throws android.os.RemoteException;
    public void reportChooserSelection(java.lang.String p0, int p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException;
    public int getAppStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setAppStandbyBucket(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAppStandbyBuckets(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setAppStandbyBuckets(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException;
    public void registerAppUsageObserver(int p0, java.lang.String[] p1, long p2, android.app.PendingIntent p3, java.lang.String p4) throws android.os.RemoteException;
    public void unregisterAppUsageObserver(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerUsageSessionObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, android.app.PendingIntent p5, java.lang.String p6) throws android.os.RemoteException;
    public void unregisterUsageSessionObserver(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerAppUsageLimitObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, java.lang.String p5) throws android.os.RemoteException;
    public void unregisterAppUsageLimitObserver(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void reportUsageStart(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void reportPastUsageStart(android.os.IBinder p0, java.lang.String p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public void reportUsageStop(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public int getUsageSource() throws android.os.RemoteException;
    public void forceUsageSourceSettingRead() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.usage.IUsageStatsManager {
        private static final java.lang.String DESCRIPTOR = "android.app.usage.IUsageStatsManager";
        static final int TRANSACTION_queryUsageStats = 1;
        static final int TRANSACTION_queryConfigurationStats = 2;
        static final int TRANSACTION_queryEventStats = 3;
        static final int TRANSACTION_queryEvents = 4;
        static final int TRANSACTION_queryEventsForPackage = 5;
        static final int TRANSACTION_queryEventsForUser = 6;
        static final int TRANSACTION_queryEventsForPackageForUser = 7;
        static final int TRANSACTION_setAppInactive = 8;
        static final int TRANSACTION_isAppInactive = 9;
        static final int TRANSACTION_whitelistAppTemporarily = 10;
        static final int TRANSACTION_onCarrierPrivilegedAppsChanged = 11;
        static final int TRANSACTION_reportChooserSelection = 12;
        static final int TRANSACTION_getAppStandbyBucket = 13;
        static final int TRANSACTION_setAppStandbyBucket = 14;
        static final int TRANSACTION_getAppStandbyBuckets = 15;
        static final int TRANSACTION_setAppStandbyBuckets = 16;
        static final int TRANSACTION_registerAppUsageObserver = 17;
        static final int TRANSACTION_unregisterAppUsageObserver = 18;
        static final int TRANSACTION_registerUsageSessionObserver = 19;
        static final int TRANSACTION_unregisterUsageSessionObserver = 20;
        static final int TRANSACTION_registerAppUsageLimitObserver = 21;
        static final int TRANSACTION_unregisterAppUsageLimitObserver = 22;
        static final int TRANSACTION_reportUsageStart = 23;
        static final int TRANSACTION_reportPastUsageStart = 24;
        static final int TRANSACTION_reportUsageStop = 25;
        static final int TRANSACTION_getUsageSource = 26;
        static final int TRANSACTION_forceUsageSourceSettingRead = 27;
        public Stub() { super(); }
        public static android.app.usage.IUsageStatsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.usage.IUsageStatsManager p0) { return false; }
        public static android.app.usage.IUsageStatsManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.usage.IUsageStatsManager {
            private android.os.IBinder mRemote;
            public static android.app.usage.IUsageStatsManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.pm.ParceledListSlice queryUsageStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryConfigurationStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryEventStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEvents(long p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEventsForPackage(long p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEventsForUser(long p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEventsForPackageForUser(long p0, long p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
            public void setAppInactive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public boolean isAppInactive(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void whitelistAppTemporarily(java.lang.String p0, long p1, int p2) throws android.os.RemoteException {}
            public void onCarrierPrivilegedAppsChanged() throws android.os.RemoteException {}
            public void reportChooserSelection(java.lang.String p0, int p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException {}
            public int getAppStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void setAppStandbyBucket(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getAppStandbyBuckets(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setAppStandbyBuckets(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException {}
            public void registerAppUsageObserver(int p0, java.lang.String[] p1, long p2, android.app.PendingIntent p3, java.lang.String p4) throws android.os.RemoteException {}
            public void unregisterAppUsageObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void registerUsageSessionObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, android.app.PendingIntent p5, java.lang.String p6) throws android.os.RemoteException {}
            public void unregisterUsageSessionObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void registerAppUsageLimitObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, java.lang.String p5) throws android.os.RemoteException {}
            public void unregisterAppUsageLimitObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void reportUsageStart(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void reportPastUsageStart(android.os.IBinder p0, java.lang.String p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public void reportUsageStop(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public int getUsageSource() throws android.os.RemoteException { return 0; }
            public void forceUsageSourceSettingRead() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.usage.IUsageStatsManager {
        public Default() {}
        public android.content.pm.ParceledListSlice queryUsageStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryConfigurationStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryEventStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEvents(long p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEventsForPackage(long p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEventsForUser(long p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEventsForPackageForUser(long p0, long p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
        public void setAppInactive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public boolean isAppInactive(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void whitelistAppTemporarily(java.lang.String p0, long p1, int p2) throws android.os.RemoteException {}
        public void onCarrierPrivilegedAppsChanged() throws android.os.RemoteException {}
        public void reportChooserSelection(java.lang.String p0, int p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException {}
        public int getAppStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void setAppStandbyBucket(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getAppStandbyBuckets(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setAppStandbyBuckets(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException {}
        public void registerAppUsageObserver(int p0, java.lang.String[] p1, long p2, android.app.PendingIntent p3, java.lang.String p4) throws android.os.RemoteException {}
        public void unregisterAppUsageObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void registerUsageSessionObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, android.app.PendingIntent p5, java.lang.String p6) throws android.os.RemoteException {}
        public void unregisterUsageSessionObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void registerAppUsageLimitObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, java.lang.String p5) throws android.os.RemoteException {}
        public void unregisterAppUsageLimitObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void reportUsageStart(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void reportPastUsageStart(android.os.IBinder p0, java.lang.String p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public void reportUsageStop(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public int getUsageSource() throws android.os.RemoteException { return 0; }
        public void forceUsageSourceSettingRead() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
