package android.app.admin;

public class DeviceAdminService extends android.app.Service {
    private final android.app.admin.DeviceAdminService.IDeviceAdminServiceImpl mImpl = null;
    public DeviceAdminService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    private class IDeviceAdminServiceImpl extends android.app.admin.IDeviceAdminService.Stub {
        private IDeviceAdminServiceImpl(android.app.admin.DeviceAdminService p0) { super(); }
    }
}
