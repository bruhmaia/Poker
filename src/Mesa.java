import java.util.Scanner;

public class Mesa {


    public static void main(String[] args) {
        int novaaposta;
        int montante;


        // necessário colocar um try catch
        // não pode ter números negativos, letras, a quantidade deve ser entre 2 a 8 jogadores segundo o video
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a quantidade de jogadores");
            int jogadores = scanner.nextInt();
            if (jogadores < 2 || jogadores > 8) {
                System.out.println("Essa quantidade de jogadores não é permitida");
            } else {
                System.out.println("Bem vindo ao jogo");
                // dar as cartas comnitárias
                // Antes da distribuição das cartas oa dois primeiros jogadores são obrigados a pagar um valor minimo de apostas (blind)
                System.out.println("é preciso que o primeiro e o segundo jogador comecem as apostas");
                // essa é a primeira parte da primeira rodada - são dadas as duas cartas e mostradas 3 cartas comunitárias
                // O primeiro jogador deve apostar um mini blind (um valor) e o segundo o big blind (o dobro do valor do primeiro)
                System.out.println("Jogador 1 deve escolher uma quantia para apostar");
                float miniblind = scanner.nextFloat();
                System.out.println("Jogador 2 deve apostar o dobro do valor do Jogador 1");
                float bigblind = scanner.nextFloat();
                if (bigblind != 2 * miniblind) {
                    System.out.println("Esse valor não é perimitido");
                } else {
                    System.out.println("boa sorte! o valor será adicionado ao montante");
                    float montante = bigblind + miniblind;

                    // agora deveriam dar as cartas dos jogadores

                    int contador = 2; // numero de vezes que vai repetir deve ser igual ao numero de jogadores
                    // começa em dois pq obrigatóriamente dois jogadores já devem ter jogado

                    // agora deveriam ser dadas as 3 cartas comunitárias

                    if (jogadores >= 3) {
                        do {
                            System.out.println("você deseja apostar ou correr?");
                            String resposta = scanner.next();
                            if (resposta.equalsIgnoreCase("apostar")) {
                                System.out.println("Qual valor você deseja apostar?");
                                float novaaposta = scanner.nextFloat();
                                if (novaaposta >= bigblind && novaaposta >= novaaposta) {
                                    montante = novaaposta + novaaposta;

                                } else {
                                    System.out.println("você não pode apostar esse valor, portanto será retirado do jogo");
                                }
                            } else {
                                System.out.println("atual jogador saiu do jogo");
                            }
                        }
                        while (contador <= jogadores);
                        {
                            contador++;
                        }
                    }

                    // segunda parte da rodada, quando todos já tiverem apostado ou corrido, o jogador 1 deve escolher
                    // se ele aposta ou corre mas deve jogar o valor restante do blind que não havia jogado antes
                    // é dada mais uma carta comunitária;
                }
                System.out.println("Quantos jogadores ainda restam?"); // não é o melhor dos metodos pq podem mentir mas eu não sei como fazer
                int qtdjogadores = scanner.nextInt();
                if (qtdjogadores > jogadores) {
                    System.out.println("essa quantidade é maior que a anterior portanto o jogo será encerrado");
                } else {
                    if (qtdjogadores >= 2 || qtdjogadores <= 8) {
                        System.out.println("O jogador um deve apostar e pagar o restante do blind, você deseja apostar ou correr?");
                        String novresposta = scanner.next();
                        if (novresposta.equalsIgnoreCase("apostar")) {
                            System.out.println("Qual valor você deseja apostar?");
                            float blind = scanner.nextFloat();
                            if (blind >= novaaposta) {
                                System.out.println("esse valor foi adicionado ao montante");
                            } else {
                                System.out.println("você está fora do jogo");
                            }

                            do {
                                System.out.println("agora o proximo jogador");
                                System.out.println("o você deseja? apostar ou correr?");
                                String resposta = scanner.next();
                                if (resposta.equalsIgnoreCase("apostar")) {
                                    System.out.println("Qual valor você deseja apostar?");
                                    float novaposta = scanner.nextFloat();
                                    if (novaposta >= novaposta) {
                                        montante = novaaposta + novaaposta;
                                    } else {
                                        System.out.println("você está fora do jogo");
                                    }
                                }
                                int i = 1;
                                while (i <= jogadores) ;
                                {
                                    i++;
                                }
                            }
                        }
                    }

                    // mais uma rodada, sem regras em relação ao primeiro ou segundo jogador
                    System.out.println("Quantos jogadores ainda restam?"); // não é o melhor dos metodos pq podem mentir mas eu não sei como fazer
                    int quantjogadores = scanner.nextInt();
                    if (quantjogadores > jogadores) {
                        do {
                            System.out.println("agora o proximo jogador");
                            System.out.println("o você deseja? apostar ou correr?");
                            String resposta = scanner.next();
                            if (resposta.equalsIgnoreCase("apostar")) {
                                System.out.println("Qual valor você deseja apostar?");
                                float novaposta = scanner.nextFloat();
                                if (novaposta >= novaposta) {
                                    montante = novaaposta + novaaposta;
                                } else {
                                    System.out.println("você está fora do jogo");
                                }
                            }
                        } while (int i<=jogadores);
                        {
                            i++;
                        }
                        System.out.println("essa quantidade é maior que a anterior portanto o jogo será encerrado");
                    }

                }


            }
        } catch (Exception e) {
            return;
        }
    }
}