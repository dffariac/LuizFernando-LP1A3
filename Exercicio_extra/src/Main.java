package src;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int escolha;

    	do {
    	
        System.out.println("");
        System.out.println(" Sistema de ficha médica \n");
        System.out.println("1. Criar ficha medica");
        System.out.println("2. Atualizar ficha medica");
        System.out.println("3. Exibir ficha medica");
        System.out.println("0. Sair");
        System.out.print("Digite uma opcao: ");
        escolha = scanner.nextInt();
        scanner.nextLine();

       
        switch (escolha) {
            case 1:
                criaFichaMedica();
                break;
            case 2:
                atualizarFichaMedica();
                break;
            case 3:
                exibirFichaMedica();
                break;
            case 0:
            	System.out.println("Sair.");
            default:
                System.out.println("Digite uma opcao valida!");
        }

    } while(escolha != 0);

   }
  
    public static void criaFichaMedica() {
        try {
        	
            System.out.println("Ficha do paciente:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Genero: ");
            String genero = scanner.next();
            System.out.print("Altura: ");
            float altura = scanner.nextFloat();
            System.out.print("Peso: ");
            float peso = scanner.nextFloat();
            scanner.nextLine(); 

            
            String nomeArquivo = nome + ".txt";
            FileWriter fileWriter = new FileWriter(nomeArquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);
           
    
            writer.write("Nome: " + nome);
            writer.newLine(); 
            writer.write("Idade: " + idade + " anos");
            writer.newLine();
            writer.write("Genero: " + genero);
            writer.newLine();
            writer.write("Altura: " + altura + " m");
            writer.newLine();
            writer.write("Peso: " + peso + " kg");
            writer.close();
    
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


    public static void atualizarFichaMedica() {
        try {
    
            System.out.print("Digite o nome do paciente: ");
            String nome = scanner.nextLine();

        
            String nomeArquivo = nome + ".txt";
            File arquivo = new File(nomeArquivo);

        
            if (!arquivo.exists()) {
                System.out.println("\nNao existe ficha medica salva para esse paciente.");
                return;
            }

            System.out.println("Atualização dos dados:");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Genero: ");
            String genero = scanner.next();
            System.out.print("Altura: ");
            float altura = scanner.nextFloat();
            System.out.print("Peso: ");
            float peso = scanner.nextFloat();
            scanner.nextLine(); 

            FileWriter fileWriter = new FileWriter(nomeArquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("Nome: " + nome);
            writer.newLine();
            writer.write("Idade: " + idade + " anos");
            writer.newLine();
            writer.write("Genero: " + genero);
            writer.newLine();
            writer.write("Altura: " + altura + " m");
            writer.newLine();
            writer.write("Peso: " + peso + " kg");

            writer.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void exibirFichaMedica() {
        try {
        	
            System.out.print("Digite o nome do paciente: \n"); 
            String nome = scanner.nextLine();

            String nomeArquivo = nome + ".txt";
            File arquivo = new File(nomeArquivo);

            if (!arquivo.exists()) {
                System.out.println("\n Ficha médica do paciente não existe \n");
                return;
            }

          
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader reader = new BufferedReader(fileReader);

          
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
