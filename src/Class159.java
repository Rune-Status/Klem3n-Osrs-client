import java.io.IOException;
import net.runelite.mapping.ObfuscatedSignature;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ft")
public class Class159 extends Class157
{
    @ObfuscatedName("z")
    Socket field1982;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lej;")
    Class151 field1980;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lfc;")
    Class163 field1983;
    
    Class159(final Socket field1982, final int n, final int n2) throws IOException {
        (this.field1982 = field1982).setSoTimeout(30000);
        this.field1982.setTcpNoDelay(true);
        this.field1982.setReceiveBufferSize(65536);
        this.field1982.setSendBufferSize(65536);
        this.field1980 = new Class151(this.field1982.getInputStream(), n);
        this.field1983 = new Class163(this.field1982.getOutputStream(), n2);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "1")
    @Override
    public boolean vmethod3350(final int n) throws IOException {
        return this.field1980.method3219(n);
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1213474120")
    @Override
    public int vmethod3349() throws IOException {
        return this.field1980.method3217();
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-2096783031")
    @Override
    public int vmethod3353() throws IOException {
        return this.field1980.method3218();
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "([BIII)I", garbageValue = "-2097961075")
    @Override
    public int vmethod3351(final byte[] array, final int n, final int n2) throws IOException {
        return this.field1980.method3224(array, n, n2);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "([BIIB)V", garbageValue = "-100")
    @Override
    public void vmethod3347(final byte[] array, final int n, final int n2) throws IOException {
        this.field1983.method3383(array, n, n2);
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1775992211")
    @Override
    public void vmethod3346() {
        this.field1983.method3384();
        try {
            this.field1982.close();
        }
        catch (IOException ex) {}
        this.field1980.method3215();
    }
    
    @Override
    protected void finalize() {
        this.vmethod3346();
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "([BZI)Ljava/lang/Object;", garbageValue = "-826976613")
    public static Object method3324(final byte[] array, final boolean b) {
        if (array == null) {
            return null;
        }
        if (array.length > 136 && !Class186.field2365) {
            try {
                final Class180 class180 = new Class180();
                class180.vmethod3792(array);
                return class180;
            }
            catch (Throwable t) {
                Class186.field2365 = true;
            }
        }
        return array;
    }
}
