package com.android.ims.internal.uce;

public abstract class UceServiceBase {
    private com.android.ims.internal.uce.UceServiceBase.UceServiceBinder mBinder;
    public UceServiceBase() {}
    public com.android.ims.internal.uce.UceServiceBase.UceServiceBinder getBinder() { return null; }
    protected boolean onServiceStart(com.android.ims.internal.uce.uceservice.IUceListener p0) { return false; }
    protected boolean onStopService() { return false; }
    protected boolean onIsServiceStarted() { return false; }
    protected int onCreateOptionsService(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1) { return 0; }
    protected int onCreateOptionsService(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) { return 0; }
    protected void onDestroyOptionsService(int p0) {}
    protected int onCreatePresService(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1) { return 0; }
    protected int onCreatePresService(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) { return 0; }
    protected void onDestroyPresService(int p0) {}
    protected boolean onGetServiceStatus() { return false; }
    protected com.android.ims.internal.uce.presence.IPresenceService onGetPresenceService() { return null; }
    protected com.android.ims.internal.uce.presence.IPresenceService onGetPresenceService(java.lang.String p0) { return null; }
    protected com.android.ims.internal.uce.options.IOptionsService onGetOptionsService() { return null; }
    protected com.android.ims.internal.uce.options.IOptionsService onGetOptionsService(java.lang.String p0) { return null; }

    private final class UceServiceBinder extends com.android.ims.internal.uce.uceservice.IUceService.Stub {
        private UceServiceBinder(com.android.ims.internal.uce.UceServiceBase p0) { super(); }
        public boolean startService(com.android.ims.internal.uce.uceservice.IUceListener p0) { return false; }
        public boolean stopService() { return false; }
        public boolean isServiceStarted() { return false; }
        public int createOptionsService(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1) { return 0; }
        public int createOptionsServiceForSubscription(com.android.ims.internal.uce.options.IOptionsListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) { return 0; }
        public void destroyOptionsService(int p0) {}
        public int createPresenceService(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1) { return 0; }
        public int createPresenceServiceForSubscription(com.android.ims.internal.uce.presence.IPresenceListener p0, com.android.ims.internal.uce.common.UceLong p1, java.lang.String p2) { return 0; }
        public void destroyPresenceService(int p0) {}
        public boolean getServiceStatus() { return false; }
        public com.android.ims.internal.uce.presence.IPresenceService getPresenceService() { return null; }
        public com.android.ims.internal.uce.presence.IPresenceService getPresenceServiceForSubscription(java.lang.String p0) { return null; }
        public com.android.ims.internal.uce.options.IOptionsService getOptionsService() { return null; }
        public com.android.ims.internal.uce.options.IOptionsService getOptionsServiceForSubscription(java.lang.String p0) { return null; }
    }
}
