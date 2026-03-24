package android.system;

public final class Os {
    private Os() {}
    public static java.io.FileDescriptor accept(java.io.FileDescriptor p0, java.net.InetSocketAddress p1) throws android.system.ErrnoException, java.net.SocketException { return null; }
    public static boolean access(java.lang.String p0, int p1) throws android.system.ErrnoException { return false; }
    public static void bind(java.io.FileDescriptor p0, java.net.InetAddress p1, int p2) throws android.system.ErrnoException, java.net.SocketException {}
    public static void bind(java.io.FileDescriptor p0, java.net.SocketAddress p1) throws android.system.ErrnoException, java.net.SocketException {}
    public static void chmod(java.lang.String p0, int p1) throws android.system.ErrnoException {}
    public static void chown(java.lang.String p0, int p1, int p2) throws android.system.ErrnoException {}
    public static void close(java.io.FileDescriptor p0) throws android.system.ErrnoException {}
    public static void connect(java.io.FileDescriptor p0, java.net.InetAddress p1, int p2) throws android.system.ErrnoException, java.net.SocketException {}
    public static void connect(java.io.FileDescriptor p0, java.net.SocketAddress p1) throws android.system.ErrnoException, java.net.SocketException {}
    public static java.io.FileDescriptor dup(java.io.FileDescriptor p0) throws android.system.ErrnoException { return null; }
    public static java.io.FileDescriptor dup2(java.io.FileDescriptor p0, int p1) throws android.system.ErrnoException { return null; }
    public static java.lang.String[] environ() { return null; }
    public static void execv(java.lang.String p0, java.lang.String[] p1) throws android.system.ErrnoException {}
    public static void execve(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2) throws android.system.ErrnoException {}
    public static void fchmod(java.io.FileDescriptor p0, int p1) throws android.system.ErrnoException {}
    public static void fchown(java.io.FileDescriptor p0, int p1, int p2) throws android.system.ErrnoException {}
    public static int fcntlInt(java.io.FileDescriptor p0, int p1, int p2) throws android.system.ErrnoException { return 0; }
    public static void fdatasync(java.io.FileDescriptor p0) throws android.system.ErrnoException {}
    public static android.system.StructStat fstat(java.io.FileDescriptor p0) throws android.system.ErrnoException { return null; }
    public static android.system.StructStatVfs fstatvfs(java.io.FileDescriptor p0) throws android.system.ErrnoException { return null; }
    public static void fsync(java.io.FileDescriptor p0) throws android.system.ErrnoException {}
    public static void ftruncate(java.io.FileDescriptor p0, long p1) throws android.system.ErrnoException {}
    public static java.lang.String gai_strerror(int p0) { return null; }
    public static int getegid() { return 0; }
    public static int geteuid() { return 0; }
    public static int getgid() { return 0; }
    public static java.lang.String getenv(java.lang.String p0) { return null; }
    public static java.net.SocketAddress getpeername(java.io.FileDescriptor p0) throws android.system.ErrnoException { return null; }
    public static int getpid() { return 0; }
    public static int getppid() { return 0; }
    public static java.net.SocketAddress getsockname(java.io.FileDescriptor p0) throws android.system.ErrnoException { return null; }
    @android.annotation.NonNull
    public static android.system.StructTimeval getsockoptTimeval(java.io.FileDescriptor p0, int p1, int p2) throws android.system.ErrnoException { return null; }
    public static int gettid() { return 0; }
    public static int getuid() { return 0; }
    public static byte[] getxattr(java.lang.String p0, java.lang.String p1) throws android.system.ErrnoException { return null; }
    public static java.lang.String if_indextoname(int p0) { return null; }
    public static int if_nametoindex(java.lang.String p0) { return 0; }
    public static java.net.InetAddress inet_pton(int p0, java.lang.String p1) { return null; }
    public static boolean isatty(java.io.FileDescriptor p0) { return false; }
    public static void kill(int p0, int p1) throws android.system.ErrnoException {}
    public static void lchown(java.lang.String p0, int p1, int p2) throws android.system.ErrnoException {}
    public static void link(java.lang.String p0, java.lang.String p1) throws android.system.ErrnoException {}
    public static void listen(java.io.FileDescriptor p0, int p1) throws android.system.ErrnoException {}
    public static java.lang.String[] listxattr(java.lang.String p0) throws android.system.ErrnoException { return null; }
    public static long lseek(java.io.FileDescriptor p0, long p1, int p2) throws android.system.ErrnoException { return 0L; }
    public static android.system.StructStat lstat(java.lang.String p0) throws android.system.ErrnoException { return null; }
    @android.annotation.NonNull
    public static java.io.FileDescriptor memfd_create(java.lang.String p0, int p1) throws android.system.ErrnoException { return null; }
    public static void mincore(long p0, long p1, byte[] p2) throws android.system.ErrnoException {}
    public static void mkdir(java.lang.String p0, int p1) throws android.system.ErrnoException {}
    public static void mkfifo(java.lang.String p0, int p1) throws android.system.ErrnoException {}
    public static void mlock(long p0, long p1) throws android.system.ErrnoException {}
    public static long mmap(long p0, long p1, int p2, int p3, java.io.FileDescriptor p4, long p5) throws android.system.ErrnoException { return 0L; }
    public static void msync(long p0, long p1, int p2) throws android.system.ErrnoException {}
    public static void munlock(long p0, long p1) throws android.system.ErrnoException {}
    public static void munmap(long p0, long p1) throws android.system.ErrnoException {}
    public static java.io.FileDescriptor open(java.lang.String p0, int p1, int p2) throws android.system.ErrnoException { return null; }
    public static java.io.FileDescriptor[] pipe() throws android.system.ErrnoException { return null; }
    public static int poll(android.system.StructPollfd[] p0, int p1) throws android.system.ErrnoException { return 0; }
    public static void posix_fallocate(java.io.FileDescriptor p0, long p1, long p2) throws android.system.ErrnoException {}
    public static int prctl(int p0, long p1, long p2, long p3, long p4) throws android.system.ErrnoException { return 0; }
    public static int pread(java.io.FileDescriptor p0, java.nio.ByteBuffer p1, long p2) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static int pread(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, long p4) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static int pwrite(java.io.FileDescriptor p0, java.nio.ByteBuffer p1, long p2) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static int pwrite(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, long p4) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static int read(java.io.FileDescriptor p0, java.nio.ByteBuffer p1) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static int read(java.io.FileDescriptor p0, byte[] p1, int p2, int p3) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static java.lang.String readlink(java.lang.String p0) throws android.system.ErrnoException { return null; }
    public static int readv(java.io.FileDescriptor p0, java.lang.Object[] p1, int[] p2, int[] p3) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static int recvfrom(java.io.FileDescriptor p0, java.nio.ByteBuffer p1, int p2, java.net.InetSocketAddress p3) throws android.system.ErrnoException, java.net.SocketException { return 0; }
    public static int recvfrom(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, int p4, java.net.InetSocketAddress p5) throws android.system.ErrnoException, java.net.SocketException { return 0; }
    public static int recvmsg(java.io.FileDescriptor p0, android.system.StructMsghdr p1, int p2) throws android.system.ErrnoException, java.net.SocketException { return 0; }
    public static void remove(java.lang.String p0) throws android.system.ErrnoException {}
    public static void removexattr(java.lang.String p0, java.lang.String p1) throws android.system.ErrnoException {}
    public static void rename(java.lang.String p0, java.lang.String p1) throws android.system.ErrnoException {}
    public static long sendfile(java.io.FileDescriptor p0, java.io.FileDescriptor p1, android.system.Int64Ref p2, long p3) throws android.system.ErrnoException { return 0L; }
    public static int sendmsg(java.io.FileDescriptor p0, android.system.StructMsghdr p1, int p2) throws android.system.ErrnoException, java.net.SocketException { return 0; }
    public static int sendto(java.io.FileDescriptor p0, java.nio.ByteBuffer p1, int p2, java.net.InetAddress p3, int p4) throws android.system.ErrnoException, java.net.SocketException { return 0; }
    public static int sendto(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, int p4, java.net.InetAddress p5, int p6) throws android.system.ErrnoException, java.net.SocketException { return 0; }
    public static int sendto(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, int p4, java.net.SocketAddress p5) throws android.system.ErrnoException, java.net.SocketException { return 0; }
    @java.lang.Deprecated
    public static void setegid(int p0) throws android.system.ErrnoException {}
    public static void setenv(java.lang.String p0, java.lang.String p1, boolean p2) throws android.system.ErrnoException {}
    @java.lang.Deprecated
    public static void seteuid(int p0) throws android.system.ErrnoException {}
    @java.lang.Deprecated
    public static void setgid(int p0) throws android.system.ErrnoException {}
    public static int setsid() throws android.system.ErrnoException { return 0; }
    public static void setsockoptInt(java.io.FileDescriptor p0, int p1, int p2, int p3) throws android.system.ErrnoException {}
    public static void setsockoptTimeval(java.io.FileDescriptor p0, int p1, int p2, android.system.StructTimeval p3) throws android.system.ErrnoException {}
    @java.lang.Deprecated
    public static void setuid(int p0) throws android.system.ErrnoException {}
    public static void setxattr(java.lang.String p0, java.lang.String p1, byte[] p2, int p3) throws android.system.ErrnoException {}
    public static void shutdown(java.io.FileDescriptor p0, int p1) throws android.system.ErrnoException {}
    public static java.io.FileDescriptor socket(int p0, int p1, int p2) throws android.system.ErrnoException { return null; }
    public static void socketpair(int p0, int p1, int p2, java.io.FileDescriptor p3, java.io.FileDescriptor p4) throws android.system.ErrnoException {}
    public static android.system.StructStat stat(java.lang.String p0) throws android.system.ErrnoException { return null; }
    public static android.system.StructStatVfs statvfs(java.lang.String p0) throws android.system.ErrnoException { return null; }
    public static java.lang.String strerror(int p0) { return null; }
    public static java.lang.String strsignal(int p0) { return null; }
    public static void symlink(java.lang.String p0, java.lang.String p1) throws android.system.ErrnoException {}
    public static long sysconf(int p0) { return 0L; }
    public static void tcdrain(java.io.FileDescriptor p0) throws android.system.ErrnoException {}
    public static void tcsendbreak(java.io.FileDescriptor p0, int p1) throws android.system.ErrnoException {}
    public static int umask(int p0) { return 0; }
    public static android.system.StructUtsname uname() { return null; }
    public static void unsetenv(java.lang.String p0) throws android.system.ErrnoException {}
    public static int write(java.io.FileDescriptor p0, java.nio.ByteBuffer p1) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static int write(java.io.FileDescriptor p0, byte[] p1, int p2, int p3) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
    public static int writev(java.io.FileDescriptor p0, java.lang.Object[] p1, int[] p2, int[] p3) throws android.system.ErrnoException, java.io.InterruptedIOException { return 0; }
}
