public class Nomeando { // criando método

public static void main (String [ ] args) {
    String primeiroNome = "Hello";
    String segundoNome = "Kitty";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}
}
