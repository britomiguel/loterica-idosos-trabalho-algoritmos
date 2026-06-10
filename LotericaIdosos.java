import java.util.Scanner;
public class LotericaIdosos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        // Variáveis do programa principal.
        int menu;

        //Variáveis do Caso 1.
        int menu1;
       
        // Variáveis do Caso 2.
        int menu2, a1, a2, a3, a4, a5, a6;
        String numSorteio = "", numSorteado = "8 17 23 34 45 59";
        
        do {
         System.out.println("\n----- Bem-vindo (a) ao Localizador de Lotéricas GYN! -----");
         System.out.println("\n[1] Buscar lotérica mais próxima por bairro.");
         System.out.println("[2] Simular aposta ou consulta de resultado.");
         System.out.println("[0] Para finalizar.");
         System.out.print("\n----- Digite o número da página desejada ----- : ");
         menu = leitor.nextInt();


         switch (menu) {
             
            case 1: 
                do {
                    System.out.println("\n----- ENDEREÇO DAS PRINCIPAIS LOTÉRICAS DA SUA REGIÃO! -----");
                    System.out.println("\n[1] --- Região Sul/Sudoeste. ---");
                    System.out.println("Bairros: Bueno, Marista, Oeste, Jd. América, Sudoeste, Pq. Amazônia, Jd. Planalto, Serrinha e Bela vista.");
                    System.out.println("\n[2] --- Região Central. ---");
                    System.out.println("Bairros: Central, Campinas, Aeroporto, Vila Abajá, Norte Ferroviário.");
                    System.out.println("\n[3] --- Região Leste/Sudeste. ---");
                    System.out.println("Bairros: Jardim Goiás, Setor Leste Universitário, Vila Nova, Pedro Ludovico, Alto da Glória, Parque Lourenço.");
                    System.out.println("\n[4] --- Região Norte. ---");
                    System.out.println("Bairros: Jaó, Santa Genoveva, Jd. Guanabara, Goiânia 2, Urias Magalhães.");
                    System.out.println("\n[5] --- Região Noroeste. ---");
                    System.out.println("Bairros: Jd. Curitiba, Novo Mundo...");
                    System.out.println("\n[0] Para sair.");
                    System.out.print("\nDigite a opção: ");
                    
                    menu1 = leitor.nextInt();

                    switch(menu1) {
                        case 1: 
                            System.out.println("\nVOCÊ ESCOLHEU REGIÃO SUL/SUDOESTE!");
                            System.out.println("\n--- Segue os endereços: ---");
                            System.out.println("1.  Av. T-4, 466 - Seg a Sex: 08h às 20h | Sáb: 09h às 19h - (62) 3515-0707");
                            System.out.println("2.  Av. T-5, 972 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3251-4582");
                            System.out.println("3.  Av. Av. T-10, 1300 - Seg a Sex: 08h às 18h30 | Sáb: 08h às 19h - (62) 3237-0514");
                            System.out.println("4.  Av. Portugal, 744 - Seg a Sex: 08h às 19h | Sáb: 08h às 12h - (62) 3093-6464");
                            System.out.println("5.  Av. 85, 2427 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3251-9020");
                            System.out.println("6.  Av. B, 673 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3215-2283");
                            System.out.println("7.  Av. T-9, 2378 - Seg a Sex: 07h15 às 18h | Sáb: 07h15 às 12h - (62) 3285-7392");
                            System.out.println("8.  Av. dos Alpes, 877 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3259-1840");
                            break;

                        case 2:
                            System.out.println("\nVOCÊ ESCOLHEU REGIÃO CENTRAL!");
                            System.out.println("\n--- Segue os endereços: ---");
                            System.out.println("1.  Av. 24 de Outubro, 737 - Seg a Qui: 08h às 18h | Sex: 08h às 19h | Sáb: 08h às 12h - (62) 3233-3383");
                            System.out.println("2.  Av. 24 de Outubro, 1405 - Seg a Sex: 08h às 18h | Sáb: 08h às 13h30 - (62) 3233-1490");
                            System.out.println("3.  R. José Hermano, 828 - Seg a Sex: 08h às 18h | Sáb: 08h às 13h - (62) 3945-0567");
                            System.out.println("4.  Rua 3, 246  Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3224-5412");
                            System.out.println("5.  Rua 5, 254 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3223-8819");
                            System.out.println("7.  Rua 7, sem número - Seg a Sex: 08h às 18h | Sáb: 08h às 12 - (62) 3213-4201");
                            break;

                         case 3:
                            System.out.println("\nVOCÊ ESCOLHEU REGIÃO LESTE/SUDESTE!");
                            System.out.println("\n--- Segue os endereços: ---");
                            System.out.println("1.  Av. Dep. Jamel Cecílio, 3900 - Seg a Sex: 08h às 18h - (62) 3534-1530");
                            System.out.println("2.  Av. Dep. Jamel Cecílio, 3300 - Seg a Sáb: 10h às 22h - (62) 3432-3550");
                            System.out.println("3.  Praça Vereador Boaventura Moreira de Andrade, 130 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3092-4421");
                            System.out.println("5.  Av. Anhanguera, 4072 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3224-9088");
                            System.out.println("6.  Av. Circular, 237 - Seg a Sex: 08h às 17h45 | Sáb: 08h às 12h - (62) 3245-1055");
                            System.out.println("7.  Alameda Emílio Póvoa, 356 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3281-6612");
                            break;
                            

                        case 4:
                            System.out.println("\nVOCÊ ESCOLHEU REGIÃO NORTE!");
                            System.out.println("\n--- Segue os endereços: ---");
                            System.out.println("1.  Av. Quitandinha, 311 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3208-4470");
                            System.out.println("2.  Av. São Francisco, 536 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3207-1182");
                            System.out.println("3.  Av. Vera Cruz, 1115 - Av. Vera Cruz, 1115 — Seg a Sex: 08h às 19h | Sáb: 08h às 13h - (62) 3941-0733");
                            System.out.println("4.  Praça Joaquim Lúcio, 88 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3218-6640");
                            System.out.println("5.  Av. Pedro Paulo de Souza, 100 - Seg a Sex: 08h às 18h | Sáb: 08h às 12 - (62) 3588-1127");
                            System.out.println("6.  Av. Independência, 2240 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3212-5591");
                            break;

                        case 5:
                            System.out.println("\nVOCÊ ESCOLHEU REGIÃO NOROESTE!");
                            System.out.println("\n--- Segue os endereços: ---");
                            System.out.println("1.  Av. Perimetral Norte, 5035 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3205-2704");
                            System.out.println("2.  Rua JC-15, 220 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3298-4410");
                            System.out.println("3.  Av. Mangalô, 1940 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3210-8842");
                            System.out.println("4.  Av. New York, 420 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3626-1180");
                            System.out.println("5.  Av. Madrid, 129 - Seg a Sex: 08h às 18h | Sáb: 08h às 12h - (62) 3626-9011");
                            break; 

                        case 0:
                            System.out.println("\nRetornando ao menu principal...");
                    } 
 
                    if (menu1 != 0) {
                        System.out.println("\nRetornando ao menu de regiões...");
                    }    

                } while (menu1 != 0);
                
                break;

            
            case 2: 
             do { 
                    System.out.println("\n----- OLÁ! FAÇA UMA APOSTA OU CONSULTE O RESULTADO DO SORTEIO. -----");
                    System.out.println("\n----- [1] Para realizar aposta. -----");
                    System.out.println("----- [2] Para ver resultado do sorteio -----");
                    System.out.println("----- [0] Para retornar ao menu principal. -----");
                    System.out.print("\nDigite sua escolha: ");
                    menu2 = leitor.nextInt();

                    switch (menu2) {
                        case 1: 
                        System.out.println("\n----- Esse é o realizador de aposta! Digite 6 números de 1 a 60! -----");
                        System.out.print("Digite o primeiro número: ");
                        a1 = leitor.nextInt();
                        System.out.print("Digite o segundo número: ");
                        a2 = leitor.nextInt();
                        System.out.print("Digite o terceiro número: ");
                        a3 = leitor.nextInt();
                        System.out.print("Digite o quarto número: ");
                        a4 = leitor.nextInt();
                        System.out.print("Digite o quinto número: ");
                        a5 = leitor.nextInt();
                        System.out.print("Digite o sexto número: ");
                        a6 = leitor.nextInt();

                        if ((a1 > 0 && a1 < 61) &&  (a2 > 0 && a2 < 61) &&  (a3 > 0 && a3 < 61) &&  (a4 > 0 && a4 < 61) &&  (a5 > 0 && a5 < 61) &&  (a6 > 0 && a6 < 61)) {
                        System.out.println("\n----- Aposta realizada com sucesso! -----.");
                        System.out.println("Seu número é: " + a1 + " " + a2 + " " + a3 + " " + a4 + " "
                        + a5 + " " + a6 + ".");
                        System.out.println("----- Boa sorte! -----");
                        System.out.println("\nRetornando ao menu de apostas...");

                        numSorteio = a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6;

                        } else {
                            System.out.print("\nERRO! Digite um número de 1 a 60.");
                        }
                        break;

                        case 2: 
                            System.out.println("\n----- CONFIRA O RESULTADO DO SORTEIO! -----");
                            System.out.println("   -- O número sorteado foi: " + numSorteado + ".--   ");
                            System.out.println("  --- O seu número é: " + numSorteio + "---  ");

                            if (numSorteio.equals(numSorteado)) {
                                System.out.println("\n----- PARABÉNS, VOCÊ É O GANHADOR! -----");
                            } else {
                                System.out.println("\n----- MAIS SORTE NA PRÓXIMA! -----");
                            }
                            
                            break;
                    }

             } while (menu2 != 0);

            break;         
                        

            case 0: 
                System.out.println("\nEncerrando...");
                System.out.println("Programa finalizado!");
                break;
             
            }
             
        } while (menu != 0); 
           
    }
}
            
                    