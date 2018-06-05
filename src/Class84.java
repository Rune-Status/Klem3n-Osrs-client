import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ce")
public class Class84 extends Class206
{
    @ObfuscatedName("ps")
    @ObfuscatedGetter(intValue = 1528740431)
    static int field1197;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgj;")
    static Class200 field1190;
    @ObfuscatedName("w")
    int[] field1189;
    @ObfuscatedName("s")
    int[] field1196;
    @ObfuscatedName("l")
    String[] field1191;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1475914653)
    int field1192;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1631134769)
    int field1193;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 508133827)
    int field1188;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 546616217)
    int field1195;
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "[Lgu;")
    Class197[] field1194;
    
    static {
        Class84.field1190 = new Class200(128);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(II)[Lgu;", garbageValue = "-1761127859")
    Class197[] method1944(final int n) {
        return new Class197[n];
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "952694011")
    public static void method1955() {
        while (true) {
            final Class245 class245;
            synchronized (Class248.field3182) {
                class245 = (Class245)Class248.field3180.method4076();
            }
            if (class245 == null) {
                break;
            }
            class245.field3152.method4746(class245.field3151, (int)class245.field2421, class245.field3149, false);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(II)[B", garbageValue = "-886650438")
    static synchronized byte[] method1943(final int n) {
        return Class183.method3773(n, false);
    }
    
    @ObfuscatedName("at")
    @ObfuscatedSignature(signature = "(Ldo;I)V", garbageValue = "2023211616")
    static final void method1956(final Class105 class105) {
        class105.field1385 = false;
        if (class105.field1383 != null) {
            class105.field1383.field1416 = 0;
        }
        for (Class105 class106 = class105.vmethod4382(); class106 != null; class106 = class105.vmethod4389()) {
            method1956(class106);
        }
    }
    
    @ObfuscatedName("ia")
    @ObfuscatedSignature(signature = "(IIIZB)V", garbageValue = "26")
    static final void method1946(final int n, final int n2, final int n3, final boolean b) {
        if (!Class261.method4931(n)) {
            return;
        }
        Class304.method5635(Class42.field366[n], -1, n2, n3, b);
    }
}
