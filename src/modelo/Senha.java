package modelo;

import java.util.Date;
import util.Tipo;

/**
 *
 * @author Usuário
 */
public class Senha {
    
    private int tipo;
    private String id;
    private Date horaretirada;

    public Senha() {
        id = "";
        horaretirada =  new Date();
        tipo = Tipo.COMUM;
    }

    public Senha(int tipo, String id, Date horaretirada) {
        this.tipo = tipo;
        this.id = id;
        this.horaretirada = horaretirada;
    }
    
    

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getHoraretirada() {
        return horaretirada;
    }

    public void setHoraretirada(Date horaretirada) {
        this.horaretirada = horaretirada;
    }
    
    
    
}
