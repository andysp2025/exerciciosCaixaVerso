import java.text.DecimalFormat;

public class Exercixio {
    public static void main(String[] args) {
        /*
        String testeTexto = "palavra";
        System.out.println(testeTexto);
        System.out.println(testeTexto.charAt(0));
        System.out.println(testeTexto.concat(" - outra palavra"));
        System.out.println(testeTexto.compareTo("palavras"));
        System.out.println(testeTexto.compareTo("palavra"));
        System.out.println(testeTexto.getBytes());
        System.out.println(testeTexto.toUpperCase());
        System.out.println(testeTexto.compareToIgnoreCase("PAlavra"));
        System.out.println(testeTexto.compareToIgnoreCase("OAlaVRA"));
        System.out.println(testeTexto.equals("PALAVRA"));
        System.out.println(testeTexto.equals("palavra"));
        System.out.println(testeTexto.replace("a","x"));
        */

        Double numero = 100.0455443;
        /*System.out.println(numero);
        System.out.println(numero);
        System.out.print(numero);
        System.out.println();
        System.out.println("duas casas %.2f", numero);*/
        DecimalFormat formataNumero = new DecimalFormat("##.##");
        System.out.println(formataNumero.format(numero));


    }
}
