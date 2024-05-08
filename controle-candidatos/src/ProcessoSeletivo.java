import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Maria","Pedro","Joao","Tiago","Lucia"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
        
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }

        } while(continuarTentando && tentativasRealizadas < 3); 

        if(atendeu) {
            System.out.println("Contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Nao conseguimos contato com " + candidato + " apos " + tentativasRealizadas + " tentativas.");
        }

    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }


    static void selecaoCandidatos() {
        String [] candidatos = {"Maria","Pedro","Joao","Tiago","Lucia","Julia","Caio","Mariana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
            
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if(salarioBase==salarioPretendido) {
            System.out.println("Ligar para candidato com contra-proposta!");
        } else {
            System.out.println("Aguardando demais candidatos!");
        }

    }
}
