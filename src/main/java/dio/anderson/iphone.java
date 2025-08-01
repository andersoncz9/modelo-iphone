package dio.anderson;

public class iphone implements telefone, WebBrowser, musicPlayer{
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o número: " + numero);
    }
    @Override
    public void atender(){
        System.out.println("Chamada atendida");
    }
    @Override
    public void correioEletronico(){
        System.out.println("Nova mensagem de voz!");
    }
    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina: " + url);
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Pagina Atualizada");
    }
    @Override
    public void adicionarAba(){
        System.out.println("Nova aba adicionada");
    }
    @Override
    public void adicionarMusica(String musica){
        System.out.println(musica +" adicionada ao player");
    }
    @Override
    public void tocar(){
        System.out.println("Tocando musica");
    }
    @Override
    public void pausar(){
        System.out.println("Musica Pausada");
    }
}

