package android.ddm;

public class DdmHandleViewDebug extends android.ddm.DdmHandle {
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    public static void deserializeMethodParameters(java.lang.Object[] p0, java.lang.Class<?>[] p1, java.nio.ByteBuffer p2) throws android.ddm.DdmHandleViewDebug.ViewMethodInvocationSerializationException {}
    public static byte[] serializeReturnValue(java.lang.Class<?> p0, java.lang.Object p1) throws android.ddm.DdmHandleViewDebug.ViewMethodInvocationSerializationException, java.io.IOException { return null; }

    public static class ViewMethodInvocationSerializationException extends java.lang.Exception {
        ViewMethodInvocationSerializationException(java.lang.String p0) { super(); }
    }
}
