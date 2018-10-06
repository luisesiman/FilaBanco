package controle;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;
import modelo.Senha;
import util.SenhaComparator;
import util.Tipo;
import visao.ChamarClienteGUI;
import visao.DistribuirSenhasGUI;
import visao.SenhaAtualGUI;

/**
 *
 * @author Usuário
 */
public class Controle {

    private ChamarClienteGUI chamarClienteGUI;
    private DistribuirSenhasGUI distribuirSenhasGUI;
    private SenhaAtualGUI senhaAtualGUI;

    private PriorityQueue<Senha> proximasSenhas;
    private List<Senha> senhasPassadas;
    private int n = 0;
    private int numeroChamados = 0;
    private boolean chamarProximo = true;

    public Controle() {

        SenhaComparator senhaComparator = new SenhaComparator();
        proximasSenhas = new PriorityQueue<>(senhaComparator);
        senhasPassadas = new ArrayList<>();
        abrirTelaDistribuirSenha();
    }

    public static void main(String[] args) {
        new Controle();

    }

    public void adicionarSenhaListaProximas(Senha senha) {
        proximasSenhas.offer(senha);
        n++;
    }

    public Senha verSenhaAChamar() {
        return proximasSenhas.peek();
    }

    public Senha chamarSenha() {
        
        Senha senha;
        senha = proximasSenhas.poll();
        if (senha != null) {
            senhasPassadas.add(senha);
        }
        numeroChamados = 1;
        return senha;
    }

    public Senha verSenhaAtual() {
        return senhasPassadas.get(senhasPassadas.size() - 1);
    }

    public int getNumeroChamadosSenha() {
        return numeroChamados;
    }

    public void incrementarNumeroChamados() {
        numeroChamados++;
    }

    public boolean isChamarProximo() {
        return chamarProximo;
    }

    public void setChamarProximo(boolean chamarProximo) {
        this.chamarProximo = chamarProximo;
    }

    public Senha emitirSenha(int tipo, Date horario) {
        String id;
        switch (tipo) {
            case Tipo.COMUM:
                id = "C" + n;
                break;
            case Tipo.VIP:
                id = "V" + n;
                break;
            case Tipo.PREFERENCIAL:
                id = "P" + n;
                break;
            default:
                id = "C" + n;
                break;
        }
        Senha senha = new Senha(tipo, id, horario);
        adicionarSenhaListaProximas(senha);
        return senha;
    }

    public void abrirTelaDistribuirSenha() {
        distribuirSenhasGUI = new DistribuirSenhasGUI(this);
        distribuirSenhasGUI.setVisible(true);
    }

    public void fecharTelaDistribuirSenha() {
        distribuirSenhasGUI.dispose();
    }

    public void abrirTelaChamarCliente() {
        chamarClienteGUI = new ChamarClienteGUI(this);
        chamarClienteGUI.setVisible(true);
    }

    public void fecharTelaChamarCliente() {
        chamarClienteGUI.dispose();
    }

    public void abrirTelaSenhaAtual() {
        senhaAtualGUI = new SenhaAtualGUI(this);
        senhaAtualGUI.setVisible(true);
    }

    public void fecharTelaSenhaAtual() {
        senhaAtualGUI.dispose();
    }

    public PriorityQueue<Senha> getSenhas() {
        return proximasSenhas;
    }

    public void setSenhas(PriorityQueue<Senha> senhas) {
        this.proximasSenhas = senhas;
    }

    public List<Senha> getSenhasPassadas() {
        return senhasPassadas;
    }

    public void setSenhasPassadas(List<Senha> senhasPassadas) {
        this.senhasPassadas = senhasPassadas;
    }

}
