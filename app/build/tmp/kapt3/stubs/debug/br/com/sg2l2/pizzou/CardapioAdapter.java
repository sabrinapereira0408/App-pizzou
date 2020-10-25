package br.com.sg2l2.pizzou;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lbr/com/sg2l2/pizzou/CardapioAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/com/sg2l2/pizzou/CardapioAdapter$CardapioViewHolder;", "cardapios", "", "Lbr/com/sg2l2/pizzou/Cardapio;", "onClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getCardapios", "()Ljava/util/List;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "", "onBindViewHolder", "holder", "posicao", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardapioViewHolder", "app_debug"})
public final class CardapioAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.com.sg2l2.pizzou.CardapioAdapter.CardapioViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<br.com.sg2l2.pizzou.Cardapio> cardapios = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<br.com.sg2l2.pizzou.Cardapio, kotlin.Unit> onClick = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.sg2l2.pizzou.CardapioAdapter.CardapioViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    br.com.sg2l2.pizzou.CardapioAdapter.CardapioViewHolder holder, int posicao) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<br.com.sg2l2.pizzou.Cardapio> getCardapios() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<br.com.sg2l2.pizzou.Cardapio, kotlin.Unit> getOnClick() {
        return null;
    }
    
    public CardapioAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<br.com.sg2l2.pizzou.Cardapio> cardapios, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super br.com.sg2l2.pizzou.Cardapio, kotlin.Unit> onClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lbr/com/sg2l2/pizzou/CardapioAdapter$CardapioViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "cardImg", "Landroid/widget/ImageView;", "getCardImg", "()Landroid/widget/ImageView;", "cardNome", "Landroid/widget/TextView;", "getCardNome", "()Landroid/widget/TextView;", "cardProgress", "Landroid/widget/ProgressBar;", "getCardProgress", "()Landroid/widget/ProgressBar;", "app_debug"})
    public static final class CardapioViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView cardNome = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView cardImg = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ProgressBar cardProgress = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCardNome() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getCardImg() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ProgressBar getCardProgress() {
            return null;
        }
        
        public CardapioViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}