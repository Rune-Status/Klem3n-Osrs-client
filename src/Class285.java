import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jh")
public abstract class Class285
{
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -115006045)
    final int field3620;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 2097572835)
    int field3619;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "[Ljx;")
    Class282[] field3623;
    @ObfuscatedName("k")
    HashMap field3618;
    @ObfuscatedName("i")
    HashMap field3622;
    @ObfuscatedName("x")
    Comparator field3621;
    
    Class285(final int field3620) {
        this.field3619 = 0;
        this.field3621 = null;
        this.field3620 = field3620;
        this.field3623 = this.vmethod5462(field3620);
        this.field3618 = new HashMap(field3620 / 8);
        this.field3622 = new HashMap(field3620 / 8);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Ljx;", garbageValue = "2139940378")
    abstract Class282 vmethod5461();
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)[Ljx;", garbageValue = "828432673")
    abstract Class282[] vmethod5462(final int p0);
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1666752471")
    public void method5326() {
        this.field3619 = 0;
        Arrays.fill(this.field3623, null);
        this.field3618.clear();
        this.field3622.clear();
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "821008449")
    public int method5327() {
        return this.field3619;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-546371351")
    public boolean method5328() {
        return this.field3620 == this.field3619;
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(Lkm;I)Z", garbageValue = "-1323034650")
    public boolean method5329(final Class291 class291) {
        return class291.method5441() && (this.field3618.containsKey(class291) || this.field3622.containsKey(class291));
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(Lkm;I)Ljx;", garbageValue = "-1029474979")
    public Class282 method5330(final Class291 class291) {
        final Class282 method5331 = this.method5331(class291);
        if (method5331 != null) {
            return method5331;
        }
        return this.method5390(class291);
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(Lkm;I)Ljx;", garbageValue = "-520899073")
    Class282 method5331(final Class291 class291) {
        if (!class291.method5441()) {
            return null;
        }
        return (Class282) this.field3618.get(class291);
    }
    
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "(Lkm;I)Ljx;", garbageValue = "-2122724226")
    Class282 method5390(final Class291 class291) {
        if (!class291.method5441()) {
            return null;
        }
        return (Class282) this.field3622.get(class291);
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(Lkm;I)Z", garbageValue = "-630765365")
    public final boolean method5393(final Class291 class291) {
        final Class282 method5331 = this.method5331(class291);
        if (method5331 == null) {
            return false;
        }
        this.method5334(method5331);
        return true;
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(Ljx;I)V", garbageValue = "-570676385")
    final void method5334(final Class282 class282) {
        final int method5339 = this.method5339(class282);
        if (method5339 == -1) {
            return;
        }
        this.method5343(method5339);
        this.method5395(class282);
    }
    
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "(Lkm;I)Ljx;", garbageValue = "261191446")
    Class282 method5377(final Class291 class291) {
        return this.method5335(class291, null);
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(Lkm;Lkm;I)Ljx;", garbageValue = "2051302762")
    Class282 method5335(final Class291 class291, final Class291 class292) {
        if (this.method5331(class291) != null) {
            throw new IllegalStateException();
        }
        final Class282 vmethod5461 = this.vmethod5461();
        vmethod5461.method5290(class291, class292);
        this.method5341(vmethod5461);
        this.method5342(vmethod5461);
        return vmethod5461;
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(IB)Ljx;", garbageValue = "99")
    public final Class282 method5336(final int n) {
        if (n < 0 || n >= this.field3619) {
            throw new ArrayIndexOutOfBoundsException(n);
        }
        return this.field3623[n];
    }
    
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1076089262")
    public final void method5337() {
        if (this.field3621 == null) {
            Arrays.sort(this.field3623, 0, this.field3619);
        }
        else {
            Arrays.sort(this.field3623, 0, this.field3619, this.field3621);
        }
    }
    
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "(Ljx;Lkm;Lkm;B)V", garbageValue = "15")
    final void method5338(final Class282 class282, final Class291 class283, final Class291 class284) {
        this.method5395(class282);
        class282.method5290(class283, class284);
        this.method5342(class282);
    }
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(Ljx;B)I", garbageValue = "1")
    final int method5339(final Class282 class282) {
        for (int i = 0; i < this.field3619; ++i) {
            if (this.field3623[i] == class282) {
                return i;
            }
        }
        return -1;
    }
    
    @ObfuscatedName("aw")
    @ObfuscatedSignature(signature = "(Ljx;I)V", garbageValue = "-1961233435")
    final void method5395(final Class282 class282) {
        if (this.field3618.remove(class282.field3610) == null) {
            throw new IllegalStateException();
        }
        if (class282.field3611 != null) {
            this.field3622.remove(class282.field3611);
        }
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "(Ljx;I)V", garbageValue = "234221683")
    final void method5341(final Class282 class282) {
        this.field3623[++this.field3619 - 1] = class282;
    }
    
    @ObfuscatedName("as")
    @ObfuscatedSignature(signature = "(Ljx;I)V", garbageValue = "-914048201")
    final void method5342(final Class282 class282) {
        this.field3618.put(class282.field3610, class282);
        if (class282.field3611 != null) {
            final Class282 class283 = (Class282) this.field3622.put(class282.field3611, class282);
            if (class283 != null && class283 != class282) {
                class283.field3611 = null;
            }
        }
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1797268727")
    final void method5343(final int n) {
        --this.field3619;
        if (n < this.field3619) {
            System.arraycopy(this.field3623, n + 1, this.field3623, n, this.field3619 - n);
        }
    }
    
    @ObfuscatedName("ao")
    @ObfuscatedSignature(signature = "(S)V", garbageValue = "20160")
    public final void method5346() {
        this.field3621 = null;
    }
    
    @ObfuscatedName("at")
    @ObfuscatedSignature(signature = "(Ljava/util/Comparator;B)V", garbageValue = "-105")
    public final void method5347(final Comparator field3621) {
        if (this.field3621 == null) {
            this.field3621 = field3621;
        }
        else if (this.field3621 instanceof Class283) {
            ((Class283)this.field3621).method5307(field3621);
        }
    }
}
