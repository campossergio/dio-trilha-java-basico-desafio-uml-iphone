package smartphone;

import componentesiphone.aparelhotelefonico.AparelhoTelefonico;
import componentesiphone.navegarinternet.NavegarInternet;
import componentesiphone.reprodutormusical.ReprodutorMusical;

public class Smartphone implements AparelhoTelefonico, NavegarInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO TELEFONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ, APÓS O BIP DEIXE SEU RECADO");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA DO WEBSITE: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA.....");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA...");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA PARA TOCAR: " + musica);
    }

    public static void main(String[] args) {
        System.out.println("INICIANDO IPHONE.... ");

        Smartphone smartphone = new Smartphone();

        smartphone.iniciarCorreioVoz();
        smartphone.atender();
        smartphone.ligar("11 99988-7766");

        smartphone.exibirPagina("www.web.dio.me");
        smartphone.adicionarNovaAba();
        smartphone.atualizarPagina();

        smartphone.tocar();
        smartphone.pausar();
        smartphone.selecionarMusica("WE WILL ROCK YOU - QUEEN");
    }
}
