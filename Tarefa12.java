import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }
}

public class Tarefa12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        List<Pessoa> grupoFeminino = new ArrayList<>();
        List<Pessoa> grupoMasculino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para terminar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
                continue;
            }

            pessoas.add(new Pessoa(nome, sexo));
        }

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equalsIgnoreCase("F")) {
                grupoFeminino.add(pessoa);
            } else {
                grupoMasculino.add(pessoa);
            }
        }
        
        System.out.println("\nGrupo Feminino:");
        for (Pessoa p : grupoFeminino) {
            System.out.println(p.getNome());
        }

        System.out.println("\nGrupo Masculino:");
        for (Pessoa p : grupoMasculino) {
            System.out.println(p.getNome());
        }

        scanner.close();
    }
}
