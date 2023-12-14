package aplicacoes;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return calcularXp() + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + "]";
    }
 
}
