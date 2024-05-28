import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();
        List<String> listaDeSaudacoes = Stream.generate(() -> "Ola, Bem vindo").limit(3).toList();

        listaSaudacoes.forEach(System.out::println);
        listaDeSaudacoes.forEach(System.out::println);
    }
}
