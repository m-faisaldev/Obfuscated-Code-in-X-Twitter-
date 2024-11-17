package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.android.R;
import com.twitter.business.api.BusinessListSelectionContentViewResult;
import com.twitter.business.listselection.b;
import com.twitter.ui.widget.TwitterEditText;
import defpackage.fal;
import defpackage.lz3;

/* compiled from: Twttr */
/* loaded from: classes7.dex */
public final class a04 implements cws<c04, Object, lz3> {

    @udm
    public final fal<c04> X;

    @udm
    public final View c;

    @udm
    public final kz3 d;

    @udm
    public final pr q;
    public final Toolbar x;
    public final TwitterEditText y;

    /* compiled from: Twttr */
    public static final class a extends u6i implements z0e<fal.a<c04>, fn00> {
        public a() {
            super(1);
        }

        @Override // defpackage.z0e
        public final fn00 invoke(fal.a<c04> aVar) {
            fal.a<c04> aVar2 = aVar;
            pzg.g(aVar2, "$this$watch");
            dzh<c04, ? extends Object>[] dzhVarArr = {new oxp() { // from class: sz3
                @Override // defpackage.oxp, defpackage.dzh
                @tqm
                public final Object get(@tqm Object obj) {
                    return Integer.valueOf(((c04) obj).b);
                }
            }};
            a04 a04Var = a04.this;
            aVar2.c(dzhVarArr, new tz3(a04Var));
            aVar2.c(new dzh[]{new oxp() { // from class: uz3
                @Override // defpackage.oxp, defpackage.dzh
                @tqm
                public final Object get(@tqm Object obj) {
                    return ((c04) obj).c;
                }
            }}, new vz3(a04Var));
            aVar2.c(new dzh[]{new oxp() { // from class: wz3
                @Override // defpackage.oxp, defpackage.dzh
                @tqm
                public final Object get(@tqm Object obj) {
                    return ((c04) obj).d;
                }
            }}, new xz3(a04Var));
            aVar2.c(new dzh[]{new oxp() { // from class: yz3
                @Override // defpackage.oxp, defpackage.dzh
                @tqm
                public final Object get(@tqm Object obj) {
                    return Boolean.valueOf(((c04) obj).e);
                }
            }}, new zz3(a04Var));
            return fn00.a;
        }
    }

    public a04(@udm View view, @udm b4h<b> b4hVar, @udm kz3 kz3Var, @udm pr prVar) {
        pzg.g(view, "rootView");
        pzg.g(b4hVar, "itemAdapter");
        pzg.g(kz3Var, "itemProvider");
        pzg.g(prVar, "activityFinisher");
        this.c = view;
        this.d = kz3Var;
        this.q = prVar;
        this.x = (Toolbar) view.findViewById(R.id.toolbar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list_selection_recycler_view);
        this.y = (TwitterEditText) view.findViewById(R.id.search_bar);
        recyclerView.setAdapter(b4hVar);
        this.X = gal.a(new a());
    }

    @Override // defpackage.ctb
    public final void a(Object obj) {
        lz3 lz3Var = (lz3) obj;
        pzg.g(lz3Var, "effect");
        if (lz3Var instanceof lz3.a) {
            this.q.b(new BusinessListSelectionContentViewResult(((lz3.a) lz3Var).a));
        }
    }

    @Override // defpackage.cws
    @udm
    public final lvm<Object> h() {
        lvm<Object> empty = lvm.empty();
        pzg.f(empty, "empty(...)");
        return empty;
    }

    @Override // defpackage.po20
    public final void k(pc20 pc20Var) {
        c04 c04Var = (c04) pc20Var;
        pzg.g(c04Var, "state");
        this.X.b(c04Var);
    }
}