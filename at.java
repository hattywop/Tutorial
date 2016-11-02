/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Component;

public class at
extends cO {
    static bW a;
    int b;

    @Override
    void a() {
        a.a(this.b, -1077017058);
    }

    @Override
    void a(Component component) {
        a.a(component, i * -46901051, g, -90);
    }

    @Override
    void a(int n2) {
        if (n2 > 32768) {
            throw new IllegalArgumentException();
        }
        a.a(this.b, n2, 79);
    }

    at(dl dl2, int n2) {
        a = dl2.a(-1051150961);
        this.b = n2;
    }

    @Override
    int b() {
        return a.b(this.b, 1489756403);
    }

    @Override
    void c() {
        a.a(this.b, this.t, 9);
    }

    @Override
    void d() {
        a.a(this.b, 0);
    }
}

