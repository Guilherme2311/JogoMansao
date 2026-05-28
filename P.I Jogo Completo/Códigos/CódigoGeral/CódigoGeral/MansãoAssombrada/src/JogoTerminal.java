import java.util.Scanner;

// ============================================================
// MANSÃO ASSOMBRADA — JOGO COMPLETO
// Projeto de Jogo — Histórias dos Integrantes
//
// Ordem das histórias:
//   1. Gabriel       -> Explorar o andar
//   2. Guilherme     -> Tentar entender onde está
//   3. Gustavo Sales -> Gritar chamando alguém
//   4. Pellizari     -> Escapar pela janela com corda
//   5. Pietro        -> Ficar parado tentando se lembrar
//   6. Pedro         -> Acordar e tentar entender a situação
//
// OBS: Todos os códigos que usavam JOptionPane foram
//      convertidos para funcionar no terminal (Scanner).
// ============================================================

public class JogoTerminal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // --------------------------------------------------------
        // INTRODUÇÃO GERAL DO JOGO
        // --------------------------------------------------------
        System.out.println("============================================================");
        System.out.println("              BEM-VINDO À MANSÃO ASSOMBRADA");
        System.out.println("============================================================");
        System.out.println();
        System.out.println("Você é um cientista que acorda em um quarto numa mansão");
        System.out.println("assombrada. Você não sabe como e nem quando você foi parar lá.");
        System.out.println();
        System.out.println("Ao levantar, você olha pela janela e percebe que está em um");
        System.out.println("dos andares mais altos da mansão e que vai ser muito difícil");
        System.out.println("sair. Você entra em desespero, pois a mansão é enorme.");
        System.out.println();
        System.out.println("E agora... o que você faz para tentar escapar?");
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("  1 - Você decide explorar o andar em busca de uma saída");
        System.out.println("  2 - Você se levanta devagar e tenta entender onde está");
        System.out.println("  3 - Você tenta gritar chamando alguém para pedir ajuda");
        System.out.println("  4 - Você decide tentar escapar pela janela usando uma corda");
        System.out.println("  5 - Você fica parado, olhando ao redor, tentando se lembrar de algo");
        System.out.println("  6 - Você acorda, olha pela janela e decide o que fazer");
        System.out.println("------------------------------------------------------------");
        System.out.println();

        // --------------------------------------------------------
        // ESCOLHA INICIAL — define qual história será jogada
        // --------------------------------------------------------
        int escolhaInicial = 0;

        // Laço de repetição para garantir que o usuário escolha uma opção válida
        while (escolhaInicial < 1 || escolhaInicial > 6) {
            System.out.print("Digite o número da sua escolha (1 a 6): ");

            if (leitor.hasNextInt()) {
                escolhaInicial = leitor.nextInt();
                leitor.nextLine(); // limpa o buffer

                if (escolhaInicial < 1 || escolhaInicial > 6) {
                    System.out.println("Escolha inválida! Digite um número entre 1 e 6.");
                    System.out.println();
                }
            } else {
                leitor.nextLine(); // descarta entrada inválida
                System.out.println("Escolha inválida! Digite um número entre 1 e 6.");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("============================================================");
        System.out.println();

        // --------------------------------------------------------
        // REDIRECIONAMENTO PARA CADA HISTÓRIA
        // --------------------------------------------------------
        if (escolhaInicial == 1) {
            historiaGabriel(leitor);

        } else if (escolhaInicial == 2) {
            historiaGuilherme(leitor);

        } else if (escolhaInicial == 3) {
            historiaGustavoSales(leitor);

        } else if (escolhaInicial == 4) {
            historiaPellizari(leitor);

        } else if (escolhaInicial == 5) {
            historiaPietro(leitor);

        } else if (escolhaInicial == 6) {
            historiaPedro(leitor);
        }

        leitor.close();
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##             HISTÓRIA 1 — GABRIEL                      ##
    // ##                  (TERMINAL)                            ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaGabriel(Scanner leitor) {

        // --------------------------------------------------------
        // TEXTOS DA HISTÓRIA — Gabriel
        // --------------------------------------------------------
        String texto1 = "Você decide explorar o andar.\n\n" +
            "O chão de madeira faz uns barulhinhos enquanto você anda, tipo aqueles rangidos que dão um leve arrepio.\n" +
            "O corredor é comprido, meio apertado, e a luz é fraca, uma lâmpada lá no fundo fica piscando, deixando tudo ainda mais estranho.\n\n" +
            "À esquerda, tem uma porta meio aberta, de lá vem um som baixo, difícil de entender, parece alguém respirando ou sussurrando.\n" +
            "À direita, o corredor continua até uma escada em espiral que desce pra um breu total. Sério, não dá pra ver nada lá embaixo.\n\n" +
            "Do nada, BAM!\na porta do quarto que você tava se fecha sozinha atrás de você.\n\n" +
            "Agora não tem muito pra onde correr...\n\n";

        String texto2 = "Sem aviso, tudo ao seu redor fica instável.\n\n" +
            "As paredes, o chão… parece que a mansão inteira tá se mexendo.\n\n" +
            "Você perde o equilíbrio e cai.\n\n" +
            "Por alguns segundos, só escuridão.\n\n" +
            "Quando você abre os olhos de novo…\n\n" +
            "Você não tá mais no mesmo lugar.\n\n" +
            "Agora você tá em um corredor diferente.\n\n" +
            "Mais largo. Mais antigo. E muito mais estranho.\n\n" +
            "No fim dele, tem duas coisas:\n\n";

        String texto3 = "De repente, um barulho alto ecoa pela mansão inteira.\n\n" +
            "BOOM\n\n" +
            "As luzes apagam por completo.\n\n" +
            "Você tenta se orientar, mas não dá pra ver nada.\n\n" +
            "Aí, algo segura seu braço.\n\n" +
            "Forte.\n\n" +
            "Gelado.\n\n" +
            "Você tenta puxar… mas não consegue.\n\n" +
            "E então—\n\n" +
            "Tudo some.\n\n" +
            "Silêncio.\n\n" +
            "Quando você abre os olhos de novo…\n\n" +
            "Você tá sentado em uma cadeira.\n\n" +
            "Amarrado.\n\n" +
            "Em uma sala pequena, iluminada por uma luz fraca no teto.\n" +
            "Na sua frente…\n\n" +
            "Tem uma mesa.\n\n" +
            "E em cima dela:\n\n" +
            "- Um gravador antigo\n\n" +
            "- E uma faca\n\n" +
            "E o gravador… começa a tocar sozinho.\n\n";

        String texto4 = "Sem aviso, a luz apaga.\n" +
            "A cadeira cai com tudo no chão.\n" +
            "Você tenta reagir, mas algo te puxa com força.\n" +
            "Escuridão total.\n" +
            "Silêncio.\n" +
            "…\n" +
            "Quando você abre os olhos de novo…\n" +
            "Você tá de pé.\n" +
            "Não tá mais amarrado.\n" +
            "A sala sumiu.\n" +
            "Agora você tá em um corredor longo, com várias portas dos dois lados.\n" +
            "Todas iguais.\n" +
            "Todas fechadas.\n" +
            "Menos uma.\n" +
            "No final do corredor.\n" +
            "Ela tá aberta.\n" +
            "E dessa vez…\n" +
            "não parece uma escolha.\n" +
            "Parece que você tem que ir até lá.\n";

        String textoFinal = "Você toma sua decisão. Seja indo direto até a porta no fim ou tentando outra antes, no final não faz diferença. Todas levam ao mesmo lugar.\n\n" +
            "Assim que você encosta na maçaneta, ela abre sozinha. Lá dentro não tem nada, só escuridão. Não é um quarto… é vazio. Mesmo assim, algo te puxa pra dentro. Você tenta parar, mas não consegue.\n\n" +
            "Quando percebe, já está lá dentro. A porta atrás de você se fecha com um click. Você tenta andar, mas não sente o chão. Tenta falar… nenhum som sai.\n\n" +
            "Então uma luz fraca aparece à frente, crescendo devagar. Ela revela uma sala. A mesma sala. A cadeira, a mesa, o gravador, a faca.\n\n" +
            "E alguém ali.\n\n" +
            "Amarrado. Se debatendo.\n\n" +
            "É você.\n\n" +
            "O gravador liga sozinho: \"O próximo já chegou.\"\n\n" +
            "Você tenta reagir, mas seu corpo não responde. Só consegue assistir enquanto a luz apaga.\n\n" +
            "A última coisa que você vê… é você mesmo olhando pra você.\n\n" +
            "E aí você entende.\n\n" +
            "Você não está preso na casa.\n\n" +
            "Você faz parte dela agora.\n\n";

        // --------------------------------------------------------
        // TEXTO 1 — Explorar o andar
        // --------------------------------------------------------
        System.out.println(texto1);

        String escolhaTexto1 = "";
        while (!escolhaTexto1.equalsIgnoreCase("a") && !escolhaTexto1.equalsIgnoreCase("b")) {
            System.out.println("O que você faria?");
            System.out.println("A = Entrar na sala de onde vem o som estranho");
            System.out.println("B = Descer a escada em espiral e ver o que tem lá embaixo");
            System.out.print("Sua escolha: ");
            escolhaTexto1 = leitor.nextLine();

            if (escolhaTexto1.equalsIgnoreCase("a")) {
                String a1 = "Você decide empurrar a porta devagar.\n\n" +
                    "Ela abre com um rangido chato… lá dentro tá escuro, mas dá pra ver umas coisas jogadas pelo chão. Parece um quarto abandonado há anos.\n\n" +
                    "O som que você ouviu fica mais claro agora… é tipo uma respiração pesada.\n\n" +
                    "Você dá mais um passo.\n\n" +
                    "De repente, para.\n\n" +
                    "Silêncio total.\n\n" +
                    "Aí… bem no seu ouvido:\n\n" +
                    "\"Você não devia estar aqui…\"\n\n" +
                    "Você vira rápido... Não tem ninguém.\n\n" +
                    "Mas a porta atrás de você bate com tudo.\n\n" +
                    "E o chão começa a tremer levemente.";
                System.out.println(a1);

            } else if (escolhaTexto1.equalsIgnoreCase("b")) {
                String b1 = "Você resolve descer a escada.\n\n" +
                    "Cada passo faz um eco estranho, como se o lugar fosse muito maior do que parece.\n\n" +
                    "Quanto mais você desce, mais escuro fica… até que a luz de cima praticamente some.\n\n" +
                    "No meio da descida…\n\n" +
                    "Você escuta algo.\n\n" +
                    "Passos.\n\n" +
                    "Mas não são os seus.\n\n" +
                    "Eles vêm de baixo… subindo na sua direção.\n\n" +
                    "Você para.\n\n" +
                    "Os passos param também.\n\n" +
                    "Aí, bem perto de você, uma voz baixa:\n\n" +
                    "\"Você não devia estar aqui…\"\n\n" +
                    "Do nada, a escada dá um estalo alto.\n\n" +
                    "E tudo começa a tremer.\n\n";
                System.out.println(b1);

            } else {
                System.out.println("Escolha inválida! Digite A ou B.");
                System.out.println();
            }
        }

        // --------------------------------------------------------
        // TEXTO 2 — Corredor diferente
        // --------------------------------------------------------
        System.out.println(texto2);

        String escolhaTexto2 = "";
        while (!escolhaTexto2.equalsIgnoreCase("a") && !escolhaTexto2.equalsIgnoreCase("b")) {
            System.out.println("A - Chegar mais perto da porta com símbolos");
            System.out.println("B - Seguir o som metálico");
            System.out.print("Sua escolha: ");
            escolhaTexto2 = leitor.nextLine();

            if (escolhaTexto2.equalsIgnoreCase("a")) {
                String a2 = "Você chega mais perto da porta.\n" +
                    "Os símbolos são estranhos… parecem riscados com pressa, como se alguém estivesse tentando avisar alguma coisa.\n" +
                    "Você encosta a mão.\n" +
                    "Na hora… sente um frio absurdo subindo pelo braço.\n" +
                    "A porta não abre.\n" +
                    "Mas os símbolos começam a tremer levemente… como se estivessem vivos.\n" +
                    "Do nada, você escuta um clique atrás de você.\n" +
                    "Quando vira…\n" +
                    "Tem alguém no fim do corredor.\n\n" +
                    "Parado.\n\n" +
                    "Sem se mexer.\n\n" +
                    "Só olhando.\n\n" +
                    "A luz pisca.\n\n" +
                    "E… ele some.\n\n" +
                    "Logo depois, a porta faz um barulho pesado… como se tivesse destrancado sozinha.\n";
                System.out.println(a2);

            } else if (escolhaTexto2.equalsIgnoreCase("b")) {
                String b2 = "Você decide seguir o som.\n" +
                    "Cada passo parece mais arriscado que o outro.\n" +
                    "O barulho vai ficando mais alto… CLANG… CLANG… CLANG…\n" +
                    "Parece algo batendo em metal.\n" +
                    "Você chega mais perto e vê uma porta meio aberta.\n" +
                    "Dentro, algo se mexe.\n" +
                    "Você tenta olhar melhor…\n" +
                    "E o barulho para.\n" +
                    "Silêncio.\n" +
                    "Aí… atrás de você:\n" +
                    "CLANG\n" +
                    "Você vira rápido.\n" +
                    "Nada.\n" +
                    "Quando olha pra frente de novo…\n" +
                    "A porta tá totalmente aberta agora.\n" +
                    "E lá dentro… tá escuro demais pra ver.\n" +
                    "Mas dá pra sentir que tem alguma coisa ali.\n";
                System.out.println(b2);

            } else {
                System.out.println("Escolha inválida! Digite A ou B.");
                System.out.println();
            }
        }

        // --------------------------------------------------------
        // TEXTO 3 — Cadeira amarrado
        // --------------------------------------------------------
        System.out.println(texto3);

        String escolhaTexto3 = "";
        while (!escolhaTexto3.equalsIgnoreCase("a") && !escolhaTexto3.equalsIgnoreCase("b")) {
            System.out.println("A - Tentar alcançar a faca");
            System.out.println("B - Ouvir o gravador");
            System.out.print("Sua escolha: ");
            escolhaTexto3 = leitor.nextLine();

            if (escolhaTexto3.equalsIgnoreCase("a")) {
                String a3 = "Você força o corpo pra frente, tentando alcançar a faca.\n" +
                    "A cadeira arrasta no chão, fazendo um barulho seco.\n" +
                    "Mais um pouco…\n" +
                    "Você estica os dedos ao máximo e consegue empurrar a faca da mesa.\n" +
                    "Ela cai no chão.\n" +
                    "Droga.\n" +
                    "Você se inclina ainda mais, quase perdendo o equilíbrio, e consegue pegar a faca com dificuldade.\n" +
                    "Começa a serrar a corda devagar… tentando não fazer barulho.\n" +
                    "O gravador continua rodando.\n" +
                    "Mas agora…\n" +
                    "Sem som nenhum.\n" +
                    "Silêncio total.\n" +
                    "Você para por um segundo.\n" +
                    "Algo tá errado.\n" +
                    "A corda começa a ceder…\n" +
                    "E então—\n" +
                    "Você sente uma presença atrás de você.\n" +
                    "Bem perto.\n" +
                    "Parada.\n" +
                    "Observando.\n";
                System.out.println(a3);

            } else if (escolhaTexto3.equalsIgnoreCase("b")) {
                String b3 = "Você para de se mexer.\n" +
                    "O gravador chia… e continua:\n" +
                    "\"Rápido… você precisa sair dessa sala.\"\n" +
                    "Sua respiração fica pesada.\n" +
                    "\"Ela não pode te ver solto.\"\n" +
                    "A luz pisca forte.\n" +
                    "\"Se você fizer barulho… já era.\"\n" +
                    "O gravador falha.\n" +
                    "Por um segundo… silêncio.\n" +
                    "E então, bem baixo:\n" +
                    "\"Ela tá atrás de você.\"\n" +
                    "O gravador desliga.\n" +
                    "Na mesma hora…\n" +
                    "Você sente.\n" +
                    "Uma respiração fria no seu pescoço.\n";
                System.out.println(b3);

            } else {
                System.out.println("Escolha inválida! Digite A ou B.");
                System.out.println();
            }
        }

        // --------------------------------------------------------
        // TEXTO 4 — Corredor com portas
        // --------------------------------------------------------
        System.out.println(texto4);

        String escolhaTexto4 = "";
        while (!escolhaTexto4.equalsIgnoreCase("a") && !escolhaTexto4.equalsIgnoreCase("b")) {
            System.out.println("A - Ir direto até a porta aberta no fim do corredor");
            System.out.println("B - Tentar abrir uma das outras portas fechadas antes de chegar lá");
            System.out.print("Sua escolha: ");
            escolhaTexto4 = leitor.nextLine();

            if (escolhaTexto4.equalsIgnoreCase("a") || escolhaTexto4.equalsIgnoreCase("b")) {
                System.out.println(textoFinal);
            } else {
                System.out.println("Escolha inválida! Digite A ou B.");
                System.out.println();
            }
        }
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##             HISTÓRIA 2 — GUILHERME                    ##
    // ##                  (TERMINAL)                            ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaGuilherme(Scanner leitor) {

        System.out.println("====================================");
        System.out.println("      RPG - A MANSÃO ESQUECIDA");
        System.out.println("====================================\n");

        System.out.println("Você se levanta devagar.");
        System.out.println("O chão de madeira range sob seus pés.");
        System.out.println("O quarto está coberto de poeira.");
        System.out.println("Na parede há um retrato antigo com os rostos riscados.\n");

        // --------------------------------------------------------
        // ESCOLHA 1 — Investigar corredor ou examinar quarto
        // --------------------------------------------------------
        int escolha1 = 0;
        while (escolha1 != 1 && escolha1 != 2) {
            System.out.println("O QUE VOCÊ FAZ?");
            System.out.println("1 - Abrir a porta e investigar o corredor.");
            System.out.println("2 - Examinar melhor o quarto.");
            System.out.print("Escolha: ");

            if (leitor.hasNextInt()) {
                escolha1 = leitor.nextInt();
                leitor.nextLine();
                if (escolha1 != 1 && escolha1 != 2) {
                    System.out.println("Escolha inválida!\n");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida!\n");
            }
        }

        if (escolha1 == 1) {
            System.out.println("\nVocê abre a porta lentamente.");
            System.out.println("O corredor parece interminável.");
            System.out.println("Você ouve algo se movendo atrás de você.");
            System.out.println("Assustado, volta rapidamente para o quarto.");
        } else if (escolha1 == 2) {
            System.out.println("\nVocê procura pistas pelo quarto.");
            System.out.println("Debaixo da cama encontra uma chave enferrujada.");
            System.out.println("Passos lentos ecoam do lado de fora.");
            System.out.println("Você corre até a porta.");
        }

        System.out.println("\n====================================\n");
        System.out.println("No corredor há uma vela acesa e um bilhete:");
        System.out.println("\"Se quer sair vivo, desça até o salão principal antes da meia-noite.\"");
        System.out.println("O relógio toca...");
        System.out.println("DONG... DONG... DONG...\n");

        // --------------------------------------------------------
        // ESCOLHA 2 — Pegar vela ou procurar outro caminho
        // --------------------------------------------------------
        int escolha2 = 0;
        while (escolha2 != 1 && escolha2 != 2) {
            System.out.println("O QUE VOCÊ FAZ?");
            System.out.println("1 - Pegar a vela e seguir pelo corredor.");
            System.out.println("2 - Procurar outro caminho pela mansão.");
            System.out.print("Escolha: ");

            if (leitor.hasNextInt()) {
                escolha2 = leitor.nextInt();
                leitor.nextLine();
                if (escolha2 != 1 && escolha2 != 2) {
                    System.out.println("Escolha inválida!\n");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida!\n");
            }
        }

        if (escolha2 == 1) {
            System.out.println("\nVocê pega a vela.");
            System.out.println("A chama ilumina retratos rasgados.");
            System.out.println("Você encontra uma grande escadaria.");
            System.out.println("Ao lado dela há uma porta entreaberta.");
        } else if (escolha2 == 2) {
            System.out.println("\nVocê ignora a vela.");
            System.out.println("Depois de caminhar no escuro, encontra a mesma escadaria.");
            System.out.println("Ao lado dela há uma porta misteriosa.");
        }

        System.out.println("\n====================================\n");
        System.out.println("O relógio toca novamente.");
        System.out.println("Agora faltam sete badaladas.\n");

        // --------------------------------------------------------
        // ESCOLHA 3 — Entrar na sala ou descer as escadas
        // --------------------------------------------------------
        int escolha3 = 0;
        while (escolha3 != 1 && escolha3 != 2) {
            System.out.println("O QUE VOCÊ FAZ?");
            System.out.println("1 - Entrar na sala ao lado da escadaria.");
            System.out.println("2 - Descer imediatamente as escadas.");
            System.out.print("Escolha: ");

            if (leitor.hasNextInt()) {
                escolha3 = leitor.nextInt();
                leitor.nextLine();
                if (escolha3 != 1 && escolha3 != 2) {
                    System.out.println("Escolha inválida!\n");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida!\n");
            }
        }

        if (escolha3 == 1) {
            System.out.println("\nVocê entra na sala.");
            System.out.println("É uma biblioteca antiga.");
            System.out.println("Uma cadeira de balanço se move sozinha.");
            System.out.println("Em um diário está escrito:");
            System.out.println("\"Só quem lembrar seu nome pode sair.\"");
            System.out.println("No espelho, uma sombra aparece atrás de você.");
            System.out.println("Você corre para a escadaria.");
        } else if (escolha3 == 2) {
            System.out.println("\nVocê desce correndo as escadas.");
            System.out.println("Os degraus parecem infinitos.");
            System.out.println("Ao passar por um espelho rachado,");
            System.out.println("seu reflexo sussurra:");
            System.out.println("\"Lembre-se do seu nome...\"");
        }

        System.out.println("\n====================================\n");
        System.out.println("Você chega ao salão principal.");
        System.out.println("Há uma enorme porta de ferro.");
        System.out.println("Na frente dela está uma mulher vestida de preto.");
        System.out.println("Ela diz:");
        System.out.println("\"Diga seu nome... ou fique aqui para sempre.\"");
        System.out.println("Faltam apenas quatro badaladas.\n");

        // --------------------------------------------------------
        // ESCOLHA 4 — Lembrar o nome ou correr para a porta
        // --------------------------------------------------------
        int escolha4 = 0;
        while (escolha4 != 1 && escolha4 != 2) {
            System.out.println("O QUE VOCÊ FAZ?");
            System.out.println("1 - Tentar lembrar seu nome.");
            System.out.println("2 - Correr para a porta.");
            System.out.print("Escolha: ");

            if (leitor.hasNextInt()) {
                escolha4 = leitor.nextInt();
                leitor.nextLine();
                if (escolha4 != 1 && escolha4 != 2) {
                    System.out.println("Escolha inválida!\n");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida!\n");
            }
        }

        if (escolha4 == 1) {
            System.out.println("\nVocê fecha os olhos.");
            System.out.println("Memórias começam a surgir.");
            System.out.println("Então você se lembra:");
            System.out.println("\"Lucas...\"");
            System.out.println("A mulher recua lentamente.");
            System.out.println("A porta de ferro se abre.");
        } else if (escolha4 == 2) {
            System.out.println("\nVocê corre em direção à porta.");
            System.out.println("Tudo fica mais pesado.");
            System.out.println("No último instante, uma memória explode em sua mente:");
            System.out.println("\"Lucas!\"");
            System.out.println("A mulher desaparece.");
            System.out.println("A porta se abre imediatamente.");
        }

        // --------------------------------------------------------
        // FINAL — Guilherme
        // --------------------------------------------------------
        System.out.println("\n====================================");
        System.out.println("               FINAL");
        System.out.println("====================================\n");
        System.out.println("Você sai da mansão e respira o ar frio da madrugada.");
        System.out.println("A construção começa a desmoronar.");
        System.out.println("No bolso do casaco há uma fotografia antiga.");
        System.out.println("Nela, você está ao lado da mulher de preto.");
        System.out.println("\"Lucas e Helena, para sempre.\"");
        System.out.println("\nAs memórias retornam.");
        System.out.println("Helena era sua noiva.");
        System.out.println("A maldição finalmente foi quebrada.");
        System.out.println("\nEnquanto o sol nasce, você sussurra:");
        System.out.println("\"Adeus, Helena.\"");
        System.out.println("\nFIM DO JOGO.");
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##          HISTÓRIA 3 — GUSTAVO SALES                   ##
    // ##    (CONVERTIDO DE JOPTIONPANE PARA TERMINAL)           ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaGustavoSales(Scanner leitor) {

        // --------------------------------------------------------
        // TEXTOS DA HISTÓRIA — Gustavo Sales
        // --------------------------------------------------------
        String texto1 = "A pessoa acordou no quarto de uma mansão assombrada.\n\n" +
            "O teto era alto demais.\n" +
            "As paredes tinham marcas escuras, como se algo tivesse sido arrastado por elas durante anos.\n\n" +
            "A única luz vinha de um abajur velho piscando no canto do quarto.\n\n" +
            "Do lado de fora da porta, dava pra ouvir passos lentos andando pelo corredor.\n\n" +
            "E então...\n\n" +
            "TOC.\nTOC.\nTOC.\n\n" +
            "Alguém bateu na porta.\n\n";

        String texto2 = "Seja abrindo a porta ou se escondendo, o resultado é o mesmo.\n\n" +
            "A maçaneta gira sozinha.\n\n" +
            "A porta abre lentamente.\n\n" +
            "Mas não tem ninguém lá fora.\n\n" +
            "Só um corredor comprido e escuro.\n\n" +
            "No chão, existe uma trilha de pegadas molhadas levando até o final do corredor.\n\n" +
            "E no teto... algo parece se mover rápido demais pra enxergar direito.\n\n" +
            "O ar fica gelado.\n\n" +
            "Uma voz baixa sussurra:\n\n" +
            "\"Você demorou...\"\n\n";

        String texto3 = "Não importa o caminho escolhido.\n\n" +
            "As luzes começam a piscar violentamente.\n\n" +
            "O corredor parece ficar maior a cada passo.\n\n" +
            "As paredes rangem.\n\n" +
            "As portas ao redor começam a abrir e fechar sozinhas.\n\n" +
            "BAM.\n\nBAM.\n\nBAM.\n\n" +
            "Então uma delas para aberta.\n\n" +
            "Lá dentro existe uma sala cheia de relógios antigos.\n\n" +
            "Todos estão parados exatamente no mesmo horário.\n\n" +
            "03:17.\n\n" +
            "No centro da sala existe uma cadeira virada de costas.\n\n" +
            "E alguém está sentado nela.\n\n" +
            "Imóvel.\n\n";

        String texto4 = "A cadeira começa a girar devagar.\n\n" +
            "Bem devagar.\n\n" +
            "Até revelar o rosto da figura.\n\n" +
            "É a própria pessoa.\n\n" +
            "Mas com os olhos completamente pretos.\n\n" +
            "O sorriso dela é estranho... grande demais.\n\n" +
            "Então a versão sentada começa a falar junto com você.\n\n" +
            "Mesmas palavras.\n\n" +
            "Mesma voz.\n\n" +
            "Mesmo tempo.\n\n" +
            "As luzes apagam.\n\n" +
            "Quando voltam...\n\n" +
            "Você não está mais na sala.\n\n" +
            "Agora está em um porão úmido, cheio de canos enferrujados.\n\n" +
            "No fundo existe uma porta vermelha entreaberta.\n\n" +
            "E atrás dela dá pra ouvir alguém chorando.\n\n";

        String textoFinal = "Os dois caminhos levam até a mesma porta.\n\n" +
            "Ela bate atrás de você sozinha.\n\n" +
            "O choro para imediatamente.\n\n" +
            "Silêncio absoluto.\n\n" +
            "Na parede existe uma frase escrita com tinta preta:\n\n" +
            "\"Quem entra aqui nunca acorda de verdade.\"\n\n" +
            "Atrás de você, alguém respira perto do seu ouvido.\n\n" +
            "Você vira rapidamente.\n\n" +
            "Não tem ninguém.\n\n" +
            "Mas no chão existe uma foto antiga.\n\n" +
            "Nela, aparece você.\n\n" +
            "Parado na frente da mansão.\n\n" +
            "Datada de muitos anos atrás.\n\n" +
            "Muito antes de você nascer.\n\n" +
            "Então todas as luzes se apagam pela última vez.\n\n" +
            "...\n\n" +
            "Quando abre os olhos, você está novamente no quarto onde tudo começou.\n\n" +
            "Deitado na cama.\n\n" +
            "O abajur piscando.\n\n" +
            "Os passos no corredor.\n\n" +
            "E as três batidas na porta.\n\n" +
            "TOC.\n\nTOC.\n\nTOC.";

        // --------------------------------------------------------
        // TEXTO 1 — Porta bate
        // --------------------------------------------------------
        System.out.println(texto1);

        String escolhaTexto1 = "";
        while (!escolhaTexto1.equalsIgnoreCase("a") && !escolhaTexto1.equalsIgnoreCase("b")) {
            System.out.println("O que ela faz?");
            System.out.println("A = Abrir a porta devagar");
            System.out.println("B = Se esconder atrás da cama");
            System.out.print("Sua escolha: ");
            escolhaTexto1 = leitor.nextLine();

            if (escolhaTexto1.equalsIgnoreCase("a")) {
                System.out.println("\nVocê abre a porta lentamente...");
                System.out.println("O corredor parece infinito.\n");
            } else if (escolhaTexto1.equalsIgnoreCase("b")) {
                System.out.println("\nVocê se esconde atrás da cama...");
                System.out.println("Algo passa pela porta.\n");
            } else {
                System.out.println("Escolha inválida! Digite A ou B.\n");
            }
        }

        // --------------------------------------------------------
        // TEXTO 2 — Corredor com pegadas
        // --------------------------------------------------------
        System.out.println(texto2);

        String escolhaTexto2 = "";
        while (!escolhaTexto2.equalsIgnoreCase("a") && !escolhaTexto2.equalsIgnoreCase("b")) {
            System.out.println("O que ela faz?");
            System.out.println("A = Seguir as pegadas");
            System.out.println("B = Ignorar as pegadas e andar pelo corredor");
            System.out.print("Sua escolha: ");
            escolhaTexto2 = leitor.nextLine();

            if (escolhaTexto2.equalsIgnoreCase("a")) {
                System.out.println("\nVocê segue as pegadas...");
                System.out.println("O corredor fica cada vez mais escuro.\n");
            } else if (escolhaTexto2.equalsIgnoreCase("b")) {
                System.out.println("\nVocê ignora as pegadas...");
                System.out.println("As luzes piscam atrás de você.\n");
            } else {
                System.out.println("Escolha inválida! Digite A ou B.\n");
            }
        }

        // --------------------------------------------------------
        // TEXTO 3 — Sala dos relógios
        // --------------------------------------------------------
        System.out.println(texto3);

        String escolhaTexto3 = "";
        while (!escolhaTexto3.equalsIgnoreCase("a") && !escolhaTexto3.equalsIgnoreCase("b")) {
            System.out.println("O que ela faz?");
            System.out.println("A = Chegar perto da cadeira");
            System.out.println("B = Tentar falar com a pessoa sentada");
            System.out.print("Sua escolha: ");
            escolhaTexto3 = leitor.nextLine();

            if (escolhaTexto3.equalsIgnoreCase("a")) {
                System.out.println("\nVocê chega perto da cadeira...");
                System.out.println("A figura começa a se mover.\n");
            } else if (escolhaTexto3.equalsIgnoreCase("b")) {
                System.out.println("\nVocê tenta falar...");
                System.out.println("A voz responde igual à sua.\n");
            } else {
                System.out.println("Escolha inválida! Digite A ou B.\n");
            }
        }

        // --------------------------------------------------------
        // TEXTO 4 — Porão com porta vermelha
        // --------------------------------------------------------
        System.out.println(texto4);

        String escolhaTexto4 = "";
        while (!escolhaTexto4.equalsIgnoreCase("a") && !escolhaTexto4.equalsIgnoreCase("b")) {
            System.out.println("O que ela faz?");
            System.out.println("A = Entrar pela porta vermelha");
            System.out.println("B = Tentar fugir pelo porão");
            System.out.print("Sua escolha: ");
            escolhaTexto4 = leitor.nextLine();

            if (escolhaTexto4.equalsIgnoreCase("a") || escolhaTexto4.equalsIgnoreCase("b")) {
                System.out.println(textoFinal);
            } else {
                System.out.println("Escolha inválida! Digite A ou B.\n");
            }
        }
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##             HISTÓRIA 4 — PELLIZARI                    ##
    // ##                  (TERMINAL)                            ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

 static void historiaPellizari(Scanner leitor) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║         VOCÊ DECIDE GRITAR CHAMANDO ALGUÉM               ║");
        System.out.println("║              Um jogo de terror interativo                 ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("  Você acorda em uma cama sem se lembrar de nada.");
        System.out.println("  Está tudo escuro. A única parte iluminada é a janela.");
        System.out.println("  Ao olhar para fora, você percebe que está no último");
        System.out.println("  andar de uma mansão gigantesca.");
        System.out.println();
        System.out.println("  Você abre a boca.");
        System.out.println("  E grita.");
        System.out.println();

        // --------------------------------------------------------
        // TEXTO 1 — O grito e a resposta
        // --------------------------------------------------------
        System.out.println("══════════════════════════════════════");
        System.out.println("  TEXTO 1");
        System.out.println("══════════════════════════════════════\n");
        System.out.println("  A voz sai mais fraca do que você esperava —");
        System.out.println("  rouca, como se sua garganta estivesse seca há horas.");
        System.out.println("  O silêncio que vem depois parece ainda mais pesado.");
        System.out.println("  Mas então...");
        System.out.println("  Uma resposta. Baixa. Abafada.");
        System.out.println("  A voz é estranha... familiar demais pra ser de um estranho.");
        System.out.println("  Ela fala de novo:");
        System.out.println("  \"Me ajuda... por favor.\"\n");

        String escolha1 = "";
        while (!escolha1.equals("A") && !escolha1.equals("B")) {
            System.out.println("  A - Ir até o quarto em silêncio");
            System.out.println("  B - Tentar conversar de onde você está");
            System.out.print("  Digite A ou B: ");
            escolha1 = leitor.nextLine().trim().toUpperCase();

            if (escolha1.equals("A")) {
                System.out.println("\n  Você decide ir devagar. Sem fazer barulho.");
                System.out.println("  Cada passo no corredor é uma tensão nova.");
                System.out.println("  A voz parou.");
                System.out.println("  Você chega mais perto da porta...");
                System.out.println("  Uma fresta de luz saindo de dentro.");
                System.out.println("  Você espia pelo vão.");
                System.out.println("  Lá dentro tem uma figura sentada de costas. Imóvel.");
                System.out.println("  Você dá um passo pra dentro...");
                System.out.println("  CRACK. O chão trai você.");
                System.out.println("  A figura se levanta devagar. E vira.");
                System.out.println("  Você congela.");
                System.out.println("  O rosto dela... é igual ao seu.\n");

            } else if (escolha1.equals("B")) {
                System.out.println("\n  Você fica parado e grita de novo:");
                System.out.println("  \"Ei! Quem tá aí? Você tá bem?\"");
                System.out.println("  Silêncio por alguns segundos.");
                System.out.println("  Depois, a voz responde:");
                System.out.println("  \"Não entra aqui. Fica onde você tá.\"");
                System.out.println("  \"Por quê? O que aconteceu?\"");
                System.out.println("  \"Porque... ela ainda tá aqui.\"");
                System.out.println("  Você sente um frio percorrer sua espinha.");
                System.out.println("  \"Quem?\"");
                System.out.println("  A voz não responde.");
                System.out.println("  Mas você ouve um barulho... de trás de você.\n");

            } else {
                System.out.println("  Escolha inválida. Digite apenas A ou B.\n");
            }
        }

        // --------------------------------------------------------
        // TEXTO 2 — Sala sem janelas
        // --------------------------------------------------------
        System.out.println("══════════════════════════════════════");
        System.out.println("  TEXTO 2");
        System.out.println("══════════════════════════════════════\n");
        System.out.println("  As luzes do corredor piscam três vezes. E apagam.");
        System.out.println("  Escuridão total.");
        System.out.println("  O chão treme. Você tenta achar a parede com as mãos...");
        System.out.println("  E toca em algo. Não é a parede. É uma mão.");
        System.out.println("  Ela aperta a sua com força. E puxa.");
        System.out.println("  Quando a luz volta — você tá em uma sala pequena. Sem janelas.");
        System.out.println("  No centro: uma mesa velha.");
        System.out.println("    - Uma lanterna apagada");
        System.out.println("    - E um espelho coberto por um pano preto\n");

        String escolha2 = "";
        while (!escolha2.equals("A") && !escolha2.equals("B")) {
            System.out.println("  A - Pegar a lanterna e iluminar o ambiente");
            System.out.println("  B - Retirar o pano do espelho");
            System.out.print("  Digite A ou B: ");
            escolha2 = leitor.nextLine().trim().toUpperCase();

            if (escolha2.equals("A")) {
                System.out.println("\n  Você pega a lanterna. Ela liga de primeira.");
                System.out.println("  A luz revela as paredes. Cobertas de marcações.");
                System.out.println("  Riscos. Números. Nomes.");
                System.out.println("  Você aponta a lanterna mais perto e lê um dos nomes.");
                System.out.println("  O seu.");
                System.out.println("  Escrito ali. Com o que parece ser carvão.");
                System.out.println("  Abaixo do seu nome: \"O que entra não sai.\"");
                System.out.println("  Você recua um passo. E a lanterna apaga.\n");

            } else if (escolha2.equals("B")) {
                System.out.println("\n  Você agarra o pano e puxa de uma vez.");
                System.out.println("  O espelho aparece — grande, antigo, moldura rachada.");
                System.out.println("  Você olha pro reflexo. Tá tudo certo no começo.");
                System.out.println("  Mas então... o reflexo pisca. Você não piscou.");
                System.out.println("  O reflexo levanta a mão devagar. Você não moveu a mão.");
                System.out.println("  E então o reflexo coloca o dedo nos lábios.");
                System.out.println("  \"Shh.\"\n");

            } else {
                System.out.println("  Escolha inválida. Digite apenas A ou B.\n");
            }
        }

        // --------------------------------------------------------
        // TEXTO 3 — A porta e o que está do outro lado
        // --------------------------------------------------------
        System.out.println("══════════════════════════════════════");
        System.out.println("  TEXTO 3");
        System.out.println("══════════════════════════════════════\n");
        System.out.println("  Algo bate na porta da sala.");
        System.out.println("  Uma vez. Duas. Três. E para.");
        System.out.println("  Silêncio pesado. Você mal respira.");
        System.out.println("  A maçaneta começa a girar — devagar — de fora pra dentro.");
        System.out.println("  A porta abre um centímetro... dois... para.");
        System.out.println("  Nada aparece. Mas você sente que tem algo do outro lado.");
        System.out.println("  No chão perto dos seus pés:");
        System.out.println("    - Uma chave enferrujada");
        System.out.println("    - E um bilhete dobrado\n");

        String escolha3 = "";
        while (!escolha3.equals("A") && !escolha3.equals("B")) {
            System.out.println("  A - Pegar a chave e tentar trancar a porta");
            System.out.println("  B - Abrir o bilhete");
            System.out.print("  Digite A ou B: ");
            escolha3 = leitor.nextLine().trim().toUpperCase();

            if (escolha3.equals("A")) {
                System.out.println("\n  Você pega a chave e vai até a porta em passos rápidos.");
                System.out.println("  Você encaixa a chave na fechadura. Ela gira. CLACK.");
                System.out.println("  A porta tá trancada. Você recua, aliviado por um segundo.");
                System.out.println("  Mas aí a porta começa a tremer.");
                System.out.println("  Algo está empurrando do outro lado. Com força.");
                System.out.println("  A chave cai da fechadura sozinha.");
                System.out.println("  E a porta abre de vez.\n");

            } else if (escolha3.equals("B")) {
                System.out.println("\n  Você pega o bilhete com dedos trêmulos e desdobra.");
                System.out.println("  A letra é irregular, apressada:");
                System.out.println("  \"Não olha pra ela. Não fala com ela. Não deixa ela te tocar.\"");
                System.out.println("  Você lê de novo. E de novo.");
                System.out.println("  A porta abre mais um pouco.");
                System.out.println("  Você não olha. Você ouve passos lentos entrando na sala.");
                System.out.println("  Você fixa o olhar no bilhete.");
                System.out.println("  Não olha. Não olha.");
                System.out.println("  Uma voz suave, quase gentil:");
                System.out.println("  \"Por que você não olha pra mim?\"\n");

            } else {
                System.out.println("  Escolha inválida. Digite apenas A ou B.\n");
            }
        }

        // --------------------------------------------------------
        // TEXTO 4 — Corredor da decisão final
        // --------------------------------------------------------
        System.out.println("══════════════════════════════════════");
        System.out.println("  TEXTO 4");
        System.out.println("══════════════════════════════════════\n");
        System.out.println("  Tudo acontece de uma vez.");
        System.out.println("  Um barulho ensurdecedor. Escuridão. E então — nada.");
        System.out.println("  Quando você abre os olhos, está de pé.");
        System.out.println("  Num corredor diferente. As paredes são mais altas.");
        System.out.println("  E no fim do corredor — tem luz. Uma luz quente, quase convidativa.");
        System.out.println("  Mas no meio do caminho há uma escada à sua direita, descendo pro andar de baixo.\n");

        String escolha4 = "";
        while (!escolha4.equals("A") && !escolha4.equals("B")) {
            System.out.println("  A - Seguir em frente até a luz");
            System.out.println("  B - Descer a escada primeiro");
            System.out.print("  Digite A ou B: ");
            escolha4 = leitor.nextLine().trim().toUpperCase();

            if (escolha4.equals("A")) {
                System.out.println("\n  Você vai em direção à luz. Ela parece próxima.");
                System.out.println("  Mas não chega. Você anda. E anda. E anda.");
                System.out.println("  A luz nunca parece mais perto.");
                System.out.println("  E de repente... ela apaga.");
                System.out.println("  Você percebe onde está.");
                System.out.println("  De volta. No quarto. Na cama. A janela iluminada. Igual ao começo.\n");

            } else if (escolha4.equals("B")) {
                System.out.println("\n  Você começa a descer.");
                System.out.println("  Cada degrau ecoa num lugar enorme demais.");
                System.out.println("  Você desce. E desce. E desce.");
                System.out.println("  Até que o chão some sob seus pés.");
                System.out.println("  Escuridão.");
                System.out.println("  E quando você abre os olhos de novo...");
                System.out.println("  Você está de volta. No quarto. Na cama. A janela iluminada.\n");

            } else {
                System.out.println("  Escolha inválida. Digite apenas A ou B.\n");
            }
        }

        // --------------------------------------------------------
        // FINAL — Pellizari
        // --------------------------------------------------------
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                        F I N A L                         ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");
        System.out.println("  Não importa o que você escolheu.");
        System.out.println("  Todas as escolhas levam ao mesmo lugar.");
        System.out.println("  A mansão não te prendeu quando você entrou.");
        System.out.println("  Ela te prendeu quando você gritou.");
        System.out.println("  Porque foi aí que ela escolheu você.");
        System.out.println();
        System.out.println("  Do quarto do lado, você ouve uma voz.");
        System.out.println("  Nova. Assustada. Gritando por ajuda.");
        System.out.println();
        System.out.println("  E você percebe que agora...");
        System.out.println("  É você quem vai responder.");
        System.out.println();

    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##               HISTÓRIA 5 — PIETRO                     ##
    // ##                  (TERMINAL)                            ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaPietro(Scanner leitor) {

        System.out.println("=========================");
        System.out.println("MANSÃO ASSOMBRADA — HISTÓRIA DE PIETRO");
        System.out.println("=========================\n");
        System.out.println("Nesse jogo você é um rapaz comum que acorda em um quarto");
        System.out.println("de uma mansão assombrada sem lembrar porque e nem como");
        System.out.println("você chegou ali.\n");
        System.out.println("Pressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 1 — Amarrar a corda
        // --------------------------------------------------------
        System.out.println("\nVocê acorda em uma cama sem se lembrar de nada. Está tudo escuro");
        System.out.println("e a única parte iluminada é a janela. Ao olhar para fora você percebe");
        System.out.println("que está no último andar de uma mansão gigantesca.");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - AMARRA A CORDA EM UM ARMÁRIO VELHO");
        System.out.println("2 - AMARRA A CORDA NA CAMA");

        int escolha1 = 0;
        while (escolha1 != 1 && escolha1 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha1 = leitor.nextInt();
                leitor.nextLine();
                if (escolha1 != 1 && escolha1 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha1 == 1) {
            System.out.println("\nNo momento que está descendo, a corda faz o armário cair em cima");
            System.out.println("da cama, quebrando tudo. Seu plano de escapar falha, mas algo chama");
            System.out.println("sua atenção… debaixo da cama há um livro brilhante com uma aura estranha.");
        } else if (escolha1 == 2) {
            System.out.println("\nEnquanto desce, a corda fica instável — dois pés da cama quebram.");
            System.out.println("Você sobe de volta frustrado, percebendo que o plano falhou. Ao se virar…");
            System.out.println("vê um livro brilhante diferente de tudo que já viu.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 2 — Seguir a luz ou a escuridão
        // --------------------------------------------------------
        System.out.println("\nCheio de curiosidade e confusão, você abre o livro. Ele possui apenas uma página.");
        System.out.println("Na frente está escrito:");
        System.out.println("\"Desça as escadas e siga a luz, pois ela te guiará para fora.\"");
        System.out.println("No verso está escrito:");
        System.out.println("\"Evite a luz e caminhe pela escuridão, pois ela revela a verdade.\"");
        System.out.println("Uma observação está escrita no rodapé:");
        System.out.println("\"Confie em apenas uma frase. A outra levará à perdição.\"");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - SEGUE A LUZ PELAS ESCADAS");
        System.out.println("2 - EVITA A LUZ E CAMINHA PELA ESCURIDÃO");

        int escolha2 = 0;
        while (escolha2 != 1 && escolha2 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha2 = leitor.nextInt();
                leitor.nextLine();
                if (escolha2 != 1 && escolha2 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha2 == 1) {
            System.out.println("\nVocê abre a porta e encontra um corredor iluminado por velas.");
            System.out.println("A luz no fim das escadas parece te chamar.");
        } else if (escolha2 == 2) {
            System.out.println("\nVocê decide ignorar a luz e caminha pela escuridão, guiando-se pelas paredes frias.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 3 — Chave ou espelho
        // --------------------------------------------------------
        System.out.println("\nIndependentemente da escolha, você chega até uma escadaria longa demais…");
        System.out.println("como se não tivesse fim.");
        System.out.println("Ao descer, encontra um grande saguão. No centro, há uma mesa com dois objetos:");
        System.out.println("- Uma chave enferrujada.");
        System.out.println("- Um espelho limpo demais… refletindo algo estranho.");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - PEGA A CHAVE ENFERRUJADA");
        System.out.println("2 - PEGA O ESPELHO LIMPO");

        int escolha3 = 0;
        boolean pegouEspelho = false;
        while (escolha3 != 1 && escolha3 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha3 = leitor.nextInt();
                leitor.nextLine();
                if (escolha3 != 1 && escolha3 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha3 == 1) {
            System.out.println("\nAo tocá-la, um frio percorre seu corpo. Parece que algo te tocou de volta.");
            pegouEspelho = false;
        } else if (escolha3 == 2) {
            System.out.println("\nSeu reflexo atrasa por um instante… e algo nele sorri sem você sorrir.");
            pegouEspelho = true;
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 4 — Esconder ou observar
        // --------------------------------------------------------
        System.out.println("\nUm som ecoa.");
        System.out.println("TOC… TOC… TOC…");
        System.out.println("Uma porta no fundo se abre lentamente.");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - SE ESCONDE ATRÁS DA MESA");
        System.out.println("2 - FICA PARADO OBSERVANDO");

        int escolha4 = 0;
        while (escolha4 != 1 && escolha4 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha4 = leitor.nextInt();
                leitor.nextLine();
                if (escolha4 != 1 && escolha4 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha4 == 1) {
            System.out.println("\nVocê se esconde. Vê pés pálidos passando lentamente… algo está ali.");
        } else if (escolha4 == 2) {
            System.out.println("\nUma criatura alta e sem olhos entra… e começa a andar em sua direção.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 5 — Porta branca ou preta
        // --------------------------------------------------------
        System.out.println("\nSua mente ecoa uma frase:");
        System.out.println("\"Você já esteve aqui antes.\"");
        System.out.println("Tudo treme. A criatura desaparece.");
        System.out.println("Você está agora em um corredor diferente.");
        System.out.println("No fim, duas portas:");
        System.out.println("- Uma branca, limpa.");
        System.out.println("- Uma preta, velha e rachada.");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - ENTRA NA PORTA BRANCA");
        System.out.println("2 - ENTRA NA PORTA PRETA");

        int escolha5 = 0;
        while (escolha5 != 1 && escolha5 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha5 = leitor.nextInt();
                leitor.nextLine();
                if (escolha5 != 1 && escolha5 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha5 == 1) {
            System.out.println("\nUm quarto simples… mas há alguém na cama.");
        } else if (escolha5 == 2) {
            System.out.println("\nUm quarto deteriorado… com marcas nas paredes… e alguém na cama.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 6 — Tocar ou se afastar
        // --------------------------------------------------------
        System.out.println("\nAo se aproximar, você percebe:");
        System.out.println("É você.");
        System.out.println("Seu próprio corpo está ali, imóvel.");
        System.out.println("Na parede:");
        System.out.println("\"Você nunca saiu daqui.\"");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - TOCA NO SEU PRÓPRIO CORPO");
        System.out.println("2 - SE AFASTA ASSUSTADO");

        int escolha6 = 0;
        while (escolha6 != 1 && escolha6 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha6 = leitor.nextInt();
                leitor.nextLine();
                if (escolha6 != 1 && escolha6 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha6 == 1) {
            System.out.println("\nMemórias invadem sua mente violentamente.");
        } else if (escolha6 == 2) {
            System.out.println("\nVocê tenta fugir… mas memórias começam a surgir mesmo assim.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 7 — Aceitar ou quebrar o ciclo
        // --------------------------------------------------------
        System.out.println("\nVocê se lembra.");
        System.out.println("Você foi trazido para a mansão.");
        System.out.println("Ela se alimenta das pessoas.");
        System.out.println("Você já tentou escapar inúmeras vezes.");
        System.out.println("Tudo… é um ciclo.");
        System.out.println("Uma voz surge novamente:");
        System.out.println("\"Qual versão de você ficará?\"");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - ACEITA FICAR NA MANSÃO");
        System.out.println("2 - TENTA QUEBRAR O CICLO");

        int escolha7 = 0;
        while (escolha7 != 1 && escolha7 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha7 = leitor.nextInt();
                leitor.nextLine();
                if (escolha7 != 1 && escolha7 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha7 == 1) {
            System.out.println("\nVocê aceita.");
            System.out.println("Agora você não sente mais nada.");
            System.out.println("Alguém novo entra na mansão…");
            System.out.println("E você começa a andar em direção a ele.");
            System.out.println("\n=========================");
            System.out.println("FIM — FINAL: O GUARDIÃO DA MANSÃO");
            System.out.println("=========================");
            return;
        } else if (escolha7 == 2) {
            System.out.println("\nVocê se recusa.");
            System.out.println("A mansão começa a tremer violentamente. As paredes racham,");
            System.out.println("o chão se parte… e a criatura surge diante de você, mais distorcida do que nunca.");
            System.out.println("Mas dessa vez… você não foge.");
            System.out.println("Você corre em direção a ela.");
            System.out.println("No impacto—");
            System.out.println("Tudo se quebra.");
            System.out.println("Silêncio.");
            System.out.println("Você abre os olhos.");
            System.out.println("Está do lado de fora da mansão.");
            System.out.println("O sol bate no seu rosto.");
            System.out.println("Você respira… profundamente.");
            System.out.println("Mas algo está errado.");
            System.out.println("No seu bolso… o espelho ainda está.");
            System.out.println("E no reflexo… a criatura continua lá.");
            System.out.println("Ela não ficou na mansão. Ela veio com você.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 8 — Quebrar ou observar o espelho
        // --------------------------------------------------------
        System.out.println("\nO ar fica pesado novamente. O céu escurece. O espelho vibra em sua mão.");
        System.out.println("Uma voz ecoa:");
        System.out.println("\"Você não quebrou o ciclo… você o trouxe com você.\"");
        System.out.println("O chão começa a desaparecer.");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - QUEBRA O ESPELHO NO CHÃO");
        System.out.println("2 - OBSERVA O ESPELHO COM ATENÇÃO");

        int escolha8 = 0;
        while (escolha8 != 1 && escolha8 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha8 = leitor.nextInt();
                leitor.nextLine();
                if (escolha8 != 1 && escolha8 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha8 == 1) {
            System.out.println("\nEle se estilhaça… mas cada fragmento reflete a criatura.");
            System.out.println("Agora… existem várias.");
        } else if (escolha8 == 2) {
            System.out.println("\nA criatura não olha para você…");
            System.out.println("Ela olha para algo atrás de você.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 9 — Enfrentar ou conversar
        // --------------------------------------------------------
        System.out.println("\nVocê se vira. E vê…");
        System.out.println("Outra versão de você. Mais fria. Mais sombria. Sorrindo.");
        System.out.println("\"Eu sou a parte que ficou.\"");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - ENFRENTA SUA OUTRA VERSÃO");
        System.out.println("2 - TENTA CONVERSAR");

        int escolha9 = 0;
        while (escolha9 != 1 && escolha9 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha9 = leitor.nextInt();
                leitor.nextLine();
                if (escolha9 != 1 && escolha9 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha9 == 1) {
            System.out.println("\nVocê tenta atacar… mas algo te impede.");
        } else if (escolha9 == 2) {
            System.out.println("\nEla ri.");
            System.out.println("\"Você ainda não entendeu…\"");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 10 — Entrar na porta vermelha ou fugir
        // --------------------------------------------------------
        System.out.println("\nTudo muda novamente.");
        System.out.println("Você está de volta na mansão. Mas agora ela está viva.");
        System.out.println("No centro… uma porta vermelha pulsante.");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - ENTRA NA PORTA VERMELHA");
        System.out.println("2 - TENTA FUGIR");

        int escolha10 = 0;
        while (escolha10 != 1 && escolha10 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha10 = leitor.nextInt();
                leitor.nextLine();
                if (escolha10 != 1 && escolha10 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha10 == 1) {
            System.out.println("\nVocê entra… e encara suas memórias, medos e culpa.");
        } else if (escolha10 == 2) {
            System.out.println("\nNão há saída.");
            System.out.println("Tudo leva à porta vermelha.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA 11 — Aceitar ou negar
        // --------------------------------------------------------
        System.out.println("\nDentro, há uma cadeira e um gravador.");
        System.out.println("Sua própria voz diz:");
        System.out.println("\"Existe uma última escolha… não é sobre fugir.\"");
        System.out.println("No chão:");
        System.out.println("\"ACEITAR TUDO QUE VOCÊ É\"");
        System.out.println("\"NEGAR E LUTAR MAIS UMA VEZ\"");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - ACEITA");
        System.out.println("2 - NEGA");

        int escolha11 = 0;
        while (escolha11 != 1 && escolha11 != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolha11 = leitor.nextInt();
                leitor.nextLine();
                if (escolha11 != 1 && escolha11 != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        if (escolha11 == 1) {
            System.out.println("\nVocê aceita tudo.");
            System.out.println("A criatura desaparece.");
            System.out.println("A mansão começa a sumir.");
        } else if (escolha11 == 2) {
            System.out.println("\nVocê luta… mas a mansão te envolve.");
        }

        System.out.println("\nPressione ENTER para continuar...");
        leitor.nextLine();

        // --------------------------------------------------------
        // ESCOLHA FINAL — Atravessar ou ficar
        // --------------------------------------------------------
        System.out.println("\nTudo fica branco.");
        System.out.println("Você abre os olhos em um vazio infinito.");
        System.out.println("Uma voz: \"Agora você é livre… ou faz parte.\"");
        System.out.println("Uma última porta surge.");
        System.out.println("\nO QUE VOCÊ FAZ?");
        System.out.println("1 - ATRAVESSA");
        System.out.println("2 - FICA");

        int escolhaFinal = 0;
        while (escolhaFinal != 1 && escolhaFinal != 2) {
            System.out.print("\nDigite sua escolha (1 ou 2): ");
            if (leitor.hasNextInt()) {
                escolhaFinal = leitor.nextInt();
                leitor.nextLine();
                if (escolhaFinal != 1 && escolhaFinal != 2) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        System.out.println("\n" + "=".repeat(50));

        if (escolhaFinal == 1) {
            System.out.println("\nVocê acorda em um quarto normal.");
            System.out.println("Dessa vez… real.");
            System.out.println("No espelho, só você.");
            System.out.println("\nFIM — FINAL: LIBERTO");
        } else if (escolhaFinal == 2) {
            System.out.println("\nVocê permanece.");
            System.out.println("E começa a esquecer quem é.");
            System.out.println("A mansão… nunca precisou existir fisicamente.");
            System.out.println("\nFIM — FINAL: O ETERNO");
        }

        System.out.println("=========================");
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##               HISTÓRIA 6 — PEDRO                      ##
    // ##    (CONVERTIDO DE JOPTIONPANE PARA TERMINAL)           ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaPedro(Scanner leitor) {

        System.out.println("====================================");
        System.out.println("      RPG - A MANSÃO ASSOMBRADA");
        System.out.println("====================================\n");
        System.out.println("Você acorda em uma cama sem se lembrar de nada.");
        System.out.println("Está tudo escuro e a única parte iluminada é a janela.");
        System.out.println("Ao olhar para fora, percebe que está no último andar");
        System.out.println("de uma mansão gigantesca.\n");

        // --------------------------------------------------------
        // ESCOLHA 1 — Gritar ou fugir pela janela
        // --------------------------------------------------------
        int escolha1 = 0;
        while (escolha1 != 1 && escolha1 != 2) {
            System.out.println("O QUE VOCÊ FAZ?");
            System.out.println("1 - Tentar gritar chamando alguém");
            System.out.println("2 - Tentar fugir pela janela");
            System.out.print("Escolha: ");

            if (leitor.hasNextInt()) {
                escolha1 = leitor.nextInt();
                leitor.nextLine();
                if (escolha1 != 1 && escolha1 != 2) {
                    System.out.println("Escolha inválida!\n");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida!\n");
            }
        }

        if (escolha1 == 1) {
            System.out.println("\nVocê grita procurando alguém.");
            System.out.println("Depois de alguns segundos, escuta uma voz");
            System.out.println("vindo de um dos quartos daquele andar.");
            System.out.println("A voz parece familiar... muito familiar.\n");
        } else if (escolha1 == 2) {
            System.out.println("\nVocê vai até a janela.");
            System.out.println("Percebe que está a mais de 30 metros do chão.");
            System.out.println("Por sorte, encontra uma corda velha no quarto.\n");
        }

        // --------------------------------------------------------
        // ESCOLHA 2 — Depende da escolha anterior
        // --------------------------------------------------------
        int escolha2 = 0;
        while (escolha2 != 1 && escolha2 != 2) {
            System.out.println("O QUE VOCÊ FAZ?");
            if (escolha1 == 1) {
                System.out.println("1 - Ir até o quarto de onde vem a voz");
                System.out.println("2 - Tentar conversar com a pessoa");
            } else {
                System.out.println("1 - Amarrar a corda no armário");
                System.out.println("2 - Amarrar a corda na cama");
            }
            System.out.print("Escolha: ");

            if (leitor.hasNextInt()) {
                escolha2 = leitor.nextInt();
                leitor.nextLine();
                if (escolha2 != 1 && escolha2 != 2) {
                    System.out.println("Escolha inválida!\n");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida!\n");
            }
        }

        if (escolha1 == 1 && escolha2 == 1) {
            System.out.println("\nVocê caminha até o quarto.");
            System.out.println("Tropeça em um pedaço de madeira.");
            System.out.println("A porta se abre lentamente.\n");
        } else if (escolha1 == 1 && escolha2 == 2) {
            System.out.println("\nVocê conversa com a pessoa.");
            System.out.println("Ela abre a porta.");
            System.out.println("Ao se encontrarem, ambos ficam espantados.");
            System.out.println("Vocês têm a mesma voz e quase a mesma aparência.\n");
        } else if (escolha1 == 2 && escolha2 == 1) {
            System.out.println("\nO armário cai e quebra tudo.");
            System.out.println("Debaixo da cama, um livro brilhante aparece.\n");
        } else if (escolha1 == 2 && escolha2 == 2) {
            System.out.println("\nA cama quebra e você volta ao quarto.");
            System.out.println("Debaixo da cama há um livro estranho brilhando.\n");
        }

        // --------------------------------------------------------
        // TEXTO — O livro
        // --------------------------------------------------------
        System.out.println("Você abre o livro.");
        System.out.println("Ele possui apenas uma página.");
        System.out.println("Nela está escrito:");
        System.out.println("\"Só se deve confiar em uma frase,");
        System.out.println("pois a outra levará à perdição.\"\n");

        // --------------------------------------------------------
        // ESCOLHA 3 — Primeira ou segunda frase
        // --------------------------------------------------------
        int escolha3 = 0;
        while (escolha3 != 1 && escolha3 != 2) {
            System.out.println("O QUE VOCÊ FAZ?");
            System.out.println("1 - Ler a primeira frase");
            System.out.println("2 - Ler a segunda frase");
            System.out.print("Escolha: ");

            if (leitor.hasNextInt()) {
                escolha3 = leitor.nextInt();
                leitor.nextLine();
                if (escolha3 != 1 && escolha3 != 2) {
                    System.out.println("Escolha inválida!\n");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida!\n");
            }
        }

        if (escolha3 == 1) {
            System.out.println("\nA frase diz:");
            System.out.println("\"A saída está no porão, mas não vá sozinho.\"\n");
        } else if (escolha3 == 2) {
            System.out.println("\nA frase diz:");
            System.out.println("\"Confie apenas em si mesmo e salte.\"\n");
        }

        // --------------------------------------------------------
        // ESCOLHA 4 — Porta no fim do corredor
        // --------------------------------------------------------
        int escolha4 = 0;
        while (escolha4 != 1 && escolha4 != 2) {
            System.out.println("No fim do corredor, uma porta enorme aparece.");
            System.out.println("A pessoa misteriosa diz:");
            System.out.println("\"Só um de nós é real.\"\n");
            System.out.println("O QUE VOCÊ FAZ?");
            System.out.println("1 - Abrir a porta com a pessoa");
            System.out.println("2 - Fugir sozinho");
            System.out.print("Escolha: ");

            if (leitor.hasNextInt()) {
                escolha4 = leitor.nextInt();
                leitor.nextLine();
                if (escolha4 != 1 && escolha4 != 2) {
                    System.out.println("Escolha inválida!\n");
                }
            } else {
                leitor.nextLine();
                System.out.println("Escolha inválida!\n");
            }
        }

        // --------------------------------------------------------
        // FINAIS — Pedro
        // --------------------------------------------------------
        if (escolha4 == 1) {
            System.out.println("\nVocês atravessam a porta.");
            System.out.println("Lá fora, a pessoa desaparece.");
            System.out.println("Você percebe que era seu reflexo.\n");
            System.out.println("FINAL 1: O OUTRO VOCÊ");
        } else if (escolha4 == 2) {
            System.out.println("\nVocê foge sozinho.");
            System.out.println("Ao abrir o livro novamente, lê:");
            System.out.println("\"Você escolheu a frase errada.\"");
            System.out.println("Tudo escurece.\n");
            System.out.println("FINAL 2: LOOP ETERNO");
        }
    }
}