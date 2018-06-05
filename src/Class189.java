import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gi")
public final class Class189 extends Class182
{
    @ObfuscatedName("e")
    static final int[] field2374;
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "Lgs;")
    Class190 field2373;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -1018793601)
    int field2375;
    
    static {
        field2374 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
    }
    
    public Class189(final int n) {
        super(n);
    }
    
    @ObfuscatedName("ig")
    @ObfuscatedSignature(signature = "([II)V", garbageValue = "1024436616")
    public void method3836(final int[] array) {
        this.field2373 = new Class190(array);
    }
    
    @ObfuscatedName("ir")
    @ObfuscatedSignature(signature = "(Lgs;B)V", garbageValue = "-62")
    public void method3838(final Class190 field2373) {
        this.field2373 = field2373;
    }
    
    @ObfuscatedName("iv")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "-123")
    public void method3819(final int n) {
        super.payload[++super.field2339 - 1] = (byte)(n + this.field2373.method3850());
    }
    
    @ObfuscatedName("ic")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1803042160")
    public int method3820() {
        return super.payload[++super.field2339 - 1] - this.field2373.method3850() & 0xFF;
    }
    
    @ObfuscatedName("ia")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-1051001340")
    public boolean method3821() {
        return (super.payload[super.field2339] - this.field2373.method3853() & 0xFF) >= 128;
    }
    
    @ObfuscatedName("in")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1043804078")
    public int method3841() {
        final int n = super.payload[++super.field2339 - 1] - this.field2373.method3850() & 0xFF;
        if (n < 128) {
            return n;
        }
        return (n - 128 << 8) + (super.payload[++super.field2339 - 1] - this.field2373.method3850() & 0xFF);
    }
    
    @ObfuscatedName("is")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1583313616")
    public void method3823() {
        this.field2375 = super.field2339 * 8;
    }
    
    @ObfuscatedName("iu")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "597450860")
    public int method3817(int i) {
        int n = this.field2375 >> 3;
        int n2 = 8 - (this.field2375 & 0x7);
        int n3 = 0;
        this.field2375 += i;
        while (i > n2) {
            n3 += (super.payload[n++] & Class189.field2374[n2]) << i - n2;
            i -= n2;
            n2 = 8;
        }
        int n4;
        if (n2 == i) {
            n4 = n3 + (super.payload[n] & Class189.field2374[n2]);
        }
        else {
            n4 = (super.payload[n] >> n2 - i & Class189.field2374[i]) + n3;
        }
        return n4;
    }
    
    @ObfuscatedName("it")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-535357999")
    public void method3816() {
        super.field2339 = (this.field2375 + 7) / 8;
    }
    
    @ObfuscatedName("ie")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "16711935")
    public int method3825(final int n) {
        return n * 8 - this.field2375;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IS)Lkb;", garbageValue = "255")
    public static Class307 method3847(final int n) {
        final Class307[] array = { Class307.field3733, Class307.field3732, Class307.field3734 };
        for (int i = 0; i < array.length; ++i) {
            final Class307 class307 = array[i];
            if (n == class307.field3735) {
                return class307;
            }
        }
        return null;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(S)V", garbageValue = "24564")
    static void method3848() {
        synchronized (Class248.field3184) {
            if (Class248.field3179 == 0) {
                (Class248.field3183 = new Thread(new Class248())).setDaemon(true);
                Class248.field3183.start();
                Class248.field3183.setPriority(5);
            }
            Class248.field3179 = 600;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;Ljava/lang/String;B)I", garbageValue = "100")
    public static int method3840(final Class182 class182, final String s) {
        final int field2339 = class182.field2339;
        final byte[] method4618 = Class244.method4618(s);
        class182.method3573(method4618.length);
        class182.field2339 += Class300.field3712.method3475(method4618, 0, method4618.length, class182.payload, class182.field2339);
        return class182.field2339 - field2339;
    }
}
