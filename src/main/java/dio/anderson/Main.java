package dio.anderson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        iphone meucelular = new iphone();
        meucelular.exibirPagina("google.com");
        meucelular.adicionarMusica("Back to black");
        meucelular.tocar();
        meucelular.atender();
    }
}