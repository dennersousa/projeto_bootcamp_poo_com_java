package aplicacoes;

public abstract class Conteudo {
    
    protected static final double XpPadrao = 10d;

    private String titulo;
    private String descricao;

    public  abstract double calcularXp();

    public static double getXppadrao() {
        return XpPadrao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
