package android.system;

public class Os {
    public Os() {}
    public android.system.StructStat fstat(java.io.FileDescriptor p0) { return null; }
    public android.system.StructStat stat(java.lang.String p0) { return null; }
    public void mkdir(java.lang.String p0, int p1) {}
    public void chmod(java.lang.String p0, int p1) {}
    public void chown(java.lang.String p0, int p1, int p2) {}
    public void setxattr(java.lang.String p0, java.lang.String p1, byte[] p2, int p3) {}
    public android.system.StructStat lstat(java.lang.String p0) { return null; }
    public void fsync(java.io.FileDescriptor p0) {}
    public long lseek(java.io.FileDescriptor p0, long p1, int p2) { return 0L; }
    public java.io.FileDescriptor dup(java.io.FileDescriptor p0) { return null; }
    public void close(java.io.FileDescriptor p0) {}
    public void socketpair(int p0, int p1, int p2, java.io.FileDescriptor p3, java.io.FileDescriptor p4) {}
    public boolean access(java.lang.String p0, int p1) { return false; }
    public int ioctlInt(java.io.FileDescriptor p0, int p1) { return 0; }
    public java.io.FileDescriptor socket(int p0, int p1, int p2) { return null; }
    public void listen(java.io.FileDescriptor p0, int p1) {}
    public java.io.FileDescriptor accept(java.io.FileDescriptor p0, java.net.InetSocketAddress p1) { return null; }
    public void shutdown(java.io.FileDescriptor p0, int p1) {}
    public android.system.StructTimeval getsockoptTimeval(java.io.FileDescriptor p0, int p1, int p2) { return null; }
    public int getsockoptInt(java.io.FileDescriptor p0, int p1, int p2) { return 0; }
    public android.system.StructLinger getsockoptLinger(java.io.FileDescriptor p0, int p1, int p2) { return null; }
    public void setsockoptLinger(java.io.FileDescriptor p0, int p1, int p2, android.system.StructLinger p3) {}
    public void setsockoptTimeval(java.io.FileDescriptor p0, int p1, int p2, android.system.StructTimeval p3) {}
    public void setsockoptInt(java.io.FileDescriptor p0, int p1, int p2, int p3) {}
    public void setsockoptIfreq(java.io.FileDescriptor p0, int p1, int p2, java.lang.String p3) {}
    public java.io.FileDescriptor[] pipe() { return null; }
    public int read(java.io.FileDescriptor p0, byte[] p1, int p2, int p3) { return 0; }
    public int write(java.io.FileDescriptor p0, byte[] p1, int p2, int p3) { return 0; }
    public void fchmod(java.io.FileDescriptor p0, int p1) {}
    public void fchown(java.io.FileDescriptor p0, int p1, int p2) {}
    public long splice(java.io.FileDescriptor p0, android.system.Int64Ref p1, java.io.FileDescriptor p2, android.system.Int64Ref p3, long p4, int p5) { return 0L; }
    public long sendfile(java.io.FileDescriptor p0, java.io.FileDescriptor p1, android.system.Int64Ref p2, long p3) { return 0L; }
    public long mmap(long p0, long p1, int p2, int p3, java.io.FileDescriptor p4, long p5) { return 0L; }
    public void munmap(long p0, long p1) {}
    public int fcntlInt(java.io.FileDescriptor p0, int p1, int p2) { return 0; }
    public java.io.FileDescriptor open(java.lang.String p0, int p1, int p2) { return null; }
    public java.io.FileDescriptor[] pipe2(int p0) { return null; }
    public java.lang.String readlink(java.lang.String p0) { return null; }
    public int getpid() { return 0; }
    public int getppid() { return 0; }
    public int gettid() { return 0; }
    public int getuid() { return 0; }
    public int poll(android.system.StructPollfd[] p0, int p1) { return 0; }
    public void kill(int p0, int p1) {}
    public int pread(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, long p4) { return 0; }
    public int pwrite(java.io.FileDescriptor p0, byte[] p1, int p2, int p3, long p4) { return 0; }
    public android.system.StructStatVfs statvfs(java.lang.String p0) { return null; }
    public void posix_fallocate(java.io.FileDescriptor p0, long p1, long p2) {}
    public void ftruncate(java.io.FileDescriptor p0, long p1) {}
    public void removexattr(java.lang.String p0, java.lang.String p1) {}
    public byte[] getxattr(java.lang.String p0, java.lang.String p1) { return null; }
    public long sysconf(int p0) { return 0L; }
    public java.io.FileDescriptor memfd_create(java.lang.String p0, int p1) { return null; }
    public java.net.InetAddress inet_pton(int p0, java.lang.String p1) { return null; }
    public int prctl(int p0, long p1, long p2, long p3, long p4) { return 0; }
    public android.system.StructCapUserData[] capget(android.system.StructCapUserHeader p0) { return null; }
    public void capset(android.system.StructCapUserHeader p0, android.system.StructCapUserData[] p1) {}
    public void execv(java.lang.String p0, java.lang.String[] p1) {}
    public int getpgid(int p0) { return 0; }
    public void setpgid(int p0, int p1) {}
    public int getgid() { return 0; }
    public void setregid(int p0, int p1) {}
    public void setreuid(int p0, int p1) {}
    public int umask(int p0) { return 0; }
    public java.lang.String getenv(java.lang.String p0) { return null; }
    public java.lang.String strerror(int p0) { return null; }
}
