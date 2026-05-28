import javax.swing.JOptionPane;

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
// OBS: Todos os códigos foram convertidos para JOptionPane.
// ============================================================

public class JogoJOptionPane {

    public static void main(String[] args) {

        // --------------------------------------------------------
        // INTRODUÇÃO GERAL DO JOGO
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null,
            "============================================================\n" +
            "              BEM-VINDO À MANSÃO ASSOMBRADA\n" +
            "============================================================\n\n" +
            "Você é um cientista que acorda em um quarto numa mansão\n" +
            "assombrada. Você não sabe como e nem quando você foi parar lá.\n\n" +
            "Ao levantar, você olha pela janela e percebe que está em um\n" +
            "dos andares mais altos da mansão e que vai ser muito difícil\n" +
            "sair. Você entra em desespero, pois a mansão é enorme.\n\n" +
            "E agora... o que você faz para tentar escapar?");

        // --------------------------------------------------------
        // ESCOLHA INICIAL — define qual história será jogada
        // --------------------------------------------------------
        int escolhaInicial = 0;

        while (escolhaInicial < 1 || escolhaInicial > 6) {
            String entrada = JOptionPane.showInputDialog(null,
                "Escolha sua história:\n\n" +
                "1 - Você decide explorar o andar em busca de uma saída\n" +
                "2 - Você se levanta devagar e tenta entender onde está\n" +
                "3 - Você tenta gritar chamando alguém para pedir ajuda\n" +
                "4 - Você decide tentar escapar pela janela usando uma corda\n" +
                "5 - Você fica parado, olhando ao redor, tentando se lembrar de algo\n" +
                "6 - Você acorda, olha pela janela e decide o que fazer\n\n" +
                "Digite o número da sua escolha (1 a 6):");

            if (entrada == null) return; // usuário fechou a janela

            try {
                escolhaInicial = Integer.parseInt(entrada.trim());
                if (escolhaInicial < 1 || escolhaInicial > 6) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Digite um número entre 1 e 6.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite um número entre 1 e 6.");
            }
        }

        // --------------------------------------------------------
        // REDIRECIONAMENTO PARA CADA HISTÓRIA
        // --------------------------------------------------------
        if (escolhaInicial == 1) {
            historiaGabriel();

        } else if (escolhaInicial == 2) {
            historiaGuilherme();

        } else if (escolhaInicial == 3) {
            historiaGustavoSales();

        } else if (escolhaInicial == 4) {
            historiaPellizari();

        } else if (escolhaInicial == 5) {
            historiaPietro();

        } else if (escolhaInicial == 6) {
            historiaPedro();
        }
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##             HISTÓRIA 1 — GABRIEL                      ##
    // ##                 (JOPTIONPANE)                          ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaGabriel() {

        // --------------------------------------------------------
        // TEXTOS DA HISTÓRIA — Gabriel
        // --------------------------------------------------------
        String texto1 =
            "Você decide explorar o andar.\n\n" +
            "O chão de madeira faz uns barulhinhos enquanto você anda, tipo aqueles rangidos que dão um leve arrepio.\n" +
            "O corredor é comprido, meio apertado, e a luz é fraca, uma lâmpada lá no fundo fica piscando, deixando tudo ainda mais estranho.\n\n" +
            "À esquerda, tem uma porta meio aberta, de lá vem um som baixo, difícil de entender, parece alguém respirando ou sussurrando.\n" +
            "À direita, o corredor continua até uma escada em espiral que desce pra um breu total. Sério, não dá pra ver nada lá embaixo.\n\n" +
            "Do nada, BAM!\na porta do quarto que você tava se fecha sozinha atrás de você.\n\n" +
            "Agora não tem muito pra onde correr...\n\n";

        String texto2 =
            "Sem aviso, tudo ao seu redor fica instável.\n\n" +
            "As paredes, o chão… parece que a mansão inteira tá se mexendo.\n\n" +
            "Você perde o equilíbrio e cai.\n\n" +
            "Por alguns segundos, só escuridão.\n\n" +
            "Quando você abre os olhos de novo…\n\n" +
            "Você não tá mais no mesmo lugar.\n\n" +
            "Agora você tá em um corredor diferente.\n\n" +
            "Mais largo. Mais antigo. E muito mais estranho.\n\n" +
            "No fim dele, tem duas coisas:\n\n";

        String texto3 =
            "De repente, um barulho alto ecoa pela mansão inteira.\n\n" +
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

        String texto4 =
            "Sem aviso, a luz apaga.\n" +
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

        String textoFinal =
            "Você toma sua decisão. Seja indo direto até a porta no fim ou tentando outra antes, no final não faz diferença. Todas levam ao mesmo lugar.\n\n" +
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
        JOptionPane.showMessageDialog(null, texto1);

        String escolhaTexto1 = "";
        while (!escolhaTexto1.equalsIgnoreCase("a") && !escolhaTexto1.equalsIgnoreCase("b")) {
            escolhaTexto1 = JOptionPane.showInputDialog(null,
                "O que você faria?\n\n" +
                "A = Entrar na sala de onde vem o som estranho\n" +
                "B = Descer a escada em espiral e ver o que tem lá embaixo\n\n" +
                "Sua escolha (A ou B):");

            if (escolhaTexto1 == null) return;
            escolhaTexto1 = escolhaTexto1.trim();

            if (escolhaTexto1.equalsIgnoreCase("a")) {
                JOptionPane.showMessageDialog(null,
                    "Você decide empurrar a porta devagar.\n\n" +
                    "Ela abre com um rangido chato… lá dentro tá escuro, mas dá pra ver umas coisas jogadas pelo chão. Parece um quarto abandonado há anos.\n\n" +
                    "O som que você ouviu fica mais claro agora… é tipo uma respiração pesada.\n\n" +
                    "Você dá mais um passo.\n\n" +
                    "De repente, para.\n\n" +
                    "Silêncio total.\n\n" +
                    "Aí… bem no seu ouvido:\n\n" +
                    "\"Você não devia estar aqui…\"\n\n" +
                    "Você vira rápido... Não tem ninguém.\n\n" +
                    "Mas a porta atrás de você bate com tudo.\n\n" +
                    "E o chão começa a tremer levemente.");

            } else if (escolhaTexto1.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null,
                    "Você resolve descer a escada.\n\n" +
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
                    "E tudo começa a tremer.\n\n");

            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 2 — Corredor diferente
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null, texto2);

        String escolhaTexto2 = "";
        while (!escolhaTexto2.equalsIgnoreCase("a") && !escolhaTexto2.equalsIgnoreCase("b")) {
            escolhaTexto2 = JOptionPane.showInputDialog(null,
                "A - Chegar mais perto da porta com símbolos\n" +
                "B - Seguir o som metálico\n\n" +
                "Sua escolha (A ou B):");

            if (escolhaTexto2 == null) return;
            escolhaTexto2 = escolhaTexto2.trim();

            if (escolhaTexto2.equalsIgnoreCase("a")) {
                JOptionPane.showMessageDialog(null,
                    "Você chega mais perto da porta.\n" +
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
                    "Logo depois, a porta faz um barulho pesado… como se tivesse destrancado sozinha.\n");

            } else if (escolhaTexto2.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null,
                    "Você decide seguir o som.\n" +
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
                    "Mas dá pra sentir que tem alguma coisa ali.\n");

            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 3 — Cadeira amarrado
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null, texto3);

        String escolhaTexto3 = "";
        while (!escolhaTexto3.equalsIgnoreCase("a") && !escolhaTexto3.equalsIgnoreCase("b")) {
            escolhaTexto3 = JOptionPane.showInputDialog(null,
                "A - Tentar alcançar a faca\n" +
                "B - Ouvir o gravador\n\n" +
                "Sua escolha (A ou B):");

            if (escolhaTexto3 == null) return;
            escolhaTexto3 = escolhaTexto3.trim();

            if (escolhaTexto3.equalsIgnoreCase("a")) {
                JOptionPane.showMessageDialog(null,
                    "Você força o corpo pra frente, tentando alcançar a faca.\n" +
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
                    "Observando.\n");

            } else if (escolhaTexto3.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null,
                    "Você para de se mexer.\n" +
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
                    "Uma respiração fria no seu pescoço.\n");

            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 4 — Corredor com portas
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null, texto4);

        String escolhaTexto4 = "";
        while (!escolhaTexto4.equalsIgnoreCase("a") && !escolhaTexto4.equalsIgnoreCase("b")) {
            escolhaTexto4 = JOptionPane.showInputDialog(null,
                "A - Ir direto até a porta aberta no fim do corredor\n" +
                "B - Tentar abrir uma das outras portas fechadas antes de chegar lá\n\n" +
                "Sua escolha (A ou B):");

            if (escolhaTexto4 == null) return;
            escolhaTexto4 = escolhaTexto4.trim();

            if (escolhaTexto4.equalsIgnoreCase("a") || escolhaTexto4.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null, textoFinal);
            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite A ou B.");
            }
        }
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##             HISTÓRIA 2 — GUILHERME                    ##
    // ##                 (JOPTIONPANE)                          ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaGuilherme() {

        JOptionPane.showMessageDialog(null,
            "====================================\n" +
            "      RPG - A MANSÃO ESQUECIDA\n" +
            "====================================\n\n" +
            "Você se levanta devagar.\n" +
            "O chão de madeira range sob seus pés.\n" +
            "O quarto está coberto de poeira.\n" +
            "Na parede há um retrato antigo com os rostos riscados.");

        // --------------------------------------------------------
        // ESCOLHA 1 — Investigar corredor ou examinar quarto
        // --------------------------------------------------------
        int escolha1 = 0;
        while (escolha1 != 1 && escolha1 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - Abrir a porta e investigar o corredor.\n" +
                "2 - Examinar melhor o quarto.\n\n" +
                "Escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha1 = Integer.parseInt(entrada.trim());
                if (escolha1 != 1 && escolha1 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }

        if (escolha1 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você abre a porta lentamente.\n" +
                "O corredor parece interminável.\n" +
                "Você ouve algo se movendo atrás de você.\n" +
                "Assustado, volta rapidamente para o quarto.");
        } else if (escolha1 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você procura pistas pelo quarto.\n" +
                "Debaixo da cama encontra uma chave enferrujada.\n" +
                "Passos lentos ecoam do lado de fora.\n" +
                "Você corre até a porta.");
        }

        JOptionPane.showMessageDialog(null,
            "====================================\n\n" +
            "No corredor há uma vela acesa e um bilhete:\n" +
            "\"Se quer sair vivo, desça até o salão principal antes da meia-noite.\"\n" +
            "O relógio toca...\n" +
            "DONG... DONG... DONG...");

        // --------------------------------------------------------
        // ESCOLHA 2 — Pegar vela ou procurar outro caminho
        // --------------------------------------------------------
        int escolha2 = 0;
        while (escolha2 != 1 && escolha2 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - Pegar a vela e seguir pelo corredor.\n" +
                "2 - Procurar outro caminho pela mansão.\n\n" +
                "Escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha2 = Integer.parseInt(entrada.trim());
                if (escolha2 != 1 && escolha2 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }

        if (escolha2 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você pega a vela.\n" +
                "A chama ilumina retratos rasgados.\n" +
                "Você encontra uma grande escadaria.\n" +
                "Ao lado dela há uma porta entreaberta.");
        } else if (escolha2 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você ignora a vela.\n" +
                "Depois de caminhar no escuro, encontra a mesma escadaria.\n" +
                "Ao lado dela há uma porta misteriosa.");
        }

        JOptionPane.showMessageDialog(null,
            "====================================\n\n" +
            "O relógio toca novamente.\n" +
            "Agora faltam sete badaladas.");

        // --------------------------------------------------------
        // ESCOLHA 3 — Entrar na sala ou descer as escadas
        // --------------------------------------------------------
        int escolha3 = 0;
        while (escolha3 != 1 && escolha3 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - Entrar na sala ao lado da escadaria.\n" +
                "2 - Descer imediatamente as escadas.\n\n" +
                "Escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha3 = Integer.parseInt(entrada.trim());
                if (escolha3 != 1 && escolha3 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }

        if (escolha3 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você entra na sala.\n" +
                "É uma biblioteca antiga.\n" +
                "Uma cadeira de balanço se move sozinha.\n" +
                "Em um diário está escrito:\n" +
                "\"Só quem lembrar seu nome pode sair.\"\n" +
                "No espelho, uma sombra aparece atrás de você.\n" +
                "Você corre para a escadaria.");
        } else if (escolha3 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você desce correndo as escadas.\n" +
                "Os degraus parecem infinitos.\n" +
                "Ao passar por um espelho rachado,\n" +
                "seu reflexo sussurra:\n" +
                "\"Lembre-se do seu nome...\"");
        }

        JOptionPane.showMessageDialog(null,
            "====================================\n\n" +
            "Você chega ao salão principal.\n" +
            "Há uma enorme porta de ferro.\n" +
            "Na frente dela está uma mulher vestida de preto.\n" +
            "Ela diz:\n" +
            "\"Diga seu nome... ou fique aqui para sempre.\"\n" +
            "Faltam apenas quatro badaladas.");

        // --------------------------------------------------------
        // ESCOLHA 4 — Lembrar o nome ou correr para a porta
        // --------------------------------------------------------
        int escolha4 = 0;
        while (escolha4 != 1 && escolha4 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - Tentar lembrar seu nome.\n" +
                "2 - Correr para a porta.\n\n" +
                "Escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha4 = Integer.parseInt(entrada.trim());
                if (escolha4 != 1 && escolha4 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }

        if (escolha4 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você fecha os olhos.\n" +
                "Memórias começam a surgir.\n" +
                "Então você se lembra:\n" +
                "\"Lucas...\"\n" +
                "A mulher recua lentamente.\n" +
                "A porta de ferro se abre.");
        } else if (escolha4 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você corre em direção à porta.\n" +
                "Tudo fica mais pesado.\n" +
                "No último instante, uma memória explode em sua mente:\n" +
                "\"Lucas!\"\n" +
                "A mulher desaparece.\n" +
                "A porta se abre imediatamente.");
        }

        // --------------------------------------------------------
        // FINAL — Guilherme
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null,
            "====================================\n" +
            "               FINAL\n" +
            "====================================\n\n" +
            "Você sai da mansão e respira o ar frio da madrugada.\n" +
            "A construção começa a desmoronar.\n" +
            "No bolso do casaco há uma fotografia antiga.\n" +
            "Nela, você está ao lado da mulher de preto.\n" +
            "\"Lucas e Helena, para sempre.\"\n\n" +
            "As memórias retornam.\n" +
            "Helena era sua noiva.\n" +
            "A maldição finalmente foi quebrada.\n\n" +
            "Enquanto o sol nasce, você sussurra:\n" +
            "\"Adeus, Helena.\"\n\n" +
            "FIM DO JOGO.");
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##          HISTÓRIA 3 — GUSTAVO SALES                   ##
    // ##                 (JOPTIONPANE)                          ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaGustavoSales() {

        String texto1 =
            "A pessoa acordou no quarto de uma mansão assombrada.\n\n" +
            "O teto era alto demais.\n" +
            "As paredes tinham marcas escuras, como se algo tivesse sido arrastado por elas durante anos.\n\n" +
            "A única luz vinha de um abajur velho piscando no canto do quarto.\n\n" +
            "Do lado de fora da porta, dava pra ouvir passos lentos andando pelo corredor.\n\n" +
            "E então...\n\n" +
            "TOC.\nTOC.\nTOC.\n\n" +
            "Alguém bateu na porta.\n\n";

        String texto2 =
            "Seja abrindo a porta ou se escondendo, o resultado é o mesmo.\n\n" +
            "A maçaneta gira sozinha.\n\n" +
            "A porta abre lentamente.\n\n" +
            "Mas não tem ninguém lá fora.\n\n" +
            "Só um corredor comprido e escuro.\n\n" +
            "No chão, existe uma trilha de pegadas molhadas levando até o final do corredor.\n\n" +
            "E no teto... algo parece se mover rápido demais pra enxergar direito.\n\n" +
            "O ar fica gelado.\n\n" +
            "Uma voz baixa sussurra:\n\n" +
            "\"Você demorou...\"\n\n";

        String texto3 =
            "Não importa o caminho escolhido.\n\n" +
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

        String texto4 =
            "A cadeira começa a girar devagar.\n\n" +
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

        String textoFinal =
            "Os dois caminhos levam até a mesma porta.\n\n" +
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
        JOptionPane.showMessageDialog(null, texto1);

        String escolhaTexto1 = "";
        while (!escolhaTexto1.equalsIgnoreCase("a") && !escolhaTexto1.equalsIgnoreCase("b")) {
            escolhaTexto1 = JOptionPane.showInputDialog(null,
                "O que ela faz?\n\n" +
                "A = Abrir a porta devagar\n" +
                "B = Se esconder atrás da cama\n\n" +
                "Sua escolha (A ou B):");

            if (escolhaTexto1 == null) return;
            escolhaTexto1 = escolhaTexto1.trim();

            if (escolhaTexto1.equalsIgnoreCase("a")) {
                JOptionPane.showMessageDialog(null,
                    "Você abre a porta lentamente...\n" +
                    "O corredor parece infinito.");
            } else if (escolhaTexto1.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null,
                    "Você se esconde atrás da cama...\n" +
                    "Algo passa pela porta.");
            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 2 — Corredor com pegadas
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null, texto2);

        String escolhaTexto2 = "";
        while (!escolhaTexto2.equalsIgnoreCase("a") && !escolhaTexto2.equalsIgnoreCase("b")) {
            escolhaTexto2 = JOptionPane.showInputDialog(null,
                "O que ela faz?\n\n" +
                "A = Seguir as pegadas\n" +
                "B = Ignorar as pegadas e andar pelo corredor\n\n" +
                "Sua escolha (A ou B):");

            if (escolhaTexto2 == null) return;
            escolhaTexto2 = escolhaTexto2.trim();

            if (escolhaTexto2.equalsIgnoreCase("a")) {
                JOptionPane.showMessageDialog(null,
                    "Você segue as pegadas...\n" +
                    "O corredor fica cada vez mais escuro.");
            } else if (escolhaTexto2.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null,
                    "Você ignora as pegadas...\n" +
                    "As luzes piscam atrás de você.");
            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 3 — Sala dos relógios
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null, texto3);

        String escolhaTexto3 = "";
        while (!escolhaTexto3.equalsIgnoreCase("a") && !escolhaTexto3.equalsIgnoreCase("b")) {
            escolhaTexto3 = JOptionPane.showInputDialog(null,
                "O que ela faz?\n\n" +
                "A = Chegar perto da cadeira\n" +
                "B = Tentar falar com a pessoa sentada\n\n" +
                "Sua escolha (A ou B):");

            if (escolhaTexto3 == null) return;
            escolhaTexto3 = escolhaTexto3.trim();

            if (escolhaTexto3.equalsIgnoreCase("a")) {
                JOptionPane.showMessageDialog(null,
                    "Você chega perto da cadeira...\n" +
                    "A figura começa a se mover.");
            } else if (escolhaTexto3.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null,
                    "Você tenta falar...\n" +
                    "A voz responde igual à sua.");
            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 4 — Porão com porta vermelha
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null, texto4);

        String escolhaTexto4 = "";
        while (!escolhaTexto4.equalsIgnoreCase("a") && !escolhaTexto4.equalsIgnoreCase("b")) {
            escolhaTexto4 = JOptionPane.showInputDialog(null,
                "O que ela faz?\n\n" +
                "A = Entrar pela porta vermelha\n" +
                "B = Tentar fugir pelo porão\n\n" +
                "Sua escolha (A ou B):");

            if (escolhaTexto4 == null) return;
            escolhaTexto4 = escolhaTexto4.trim();

            if (escolhaTexto4.equalsIgnoreCase("a") || escolhaTexto4.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null, textoFinal);
            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Digite A ou B.");
            }
        }
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##             HISTÓRIA 4 — PELLIZARI                    ##
    // ##                 (JOPTIONPANE)                          ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaPellizari() {

        JOptionPane.showMessageDialog(null,
            "╔══════════════════════════════════════════════════════════╗\n" +
            "║         VOCÊ DECIDE GRITAR CHAMANDO ALGUÉM               ║\n" +
            "║              Um jogo de terror interativo                 ║\n" +
            "╚══════════════════════════════════════════════════════════╝\n\n" +
            "  Você acorda em uma cama sem se lembrar de nada.\n" +
            "  Está tudo escuro. A única parte iluminada é a janela.\n" +
            "  Ao olhar para fora, você percebe que está no último\n" +
            "  andar de uma mansão gigantesca.\n\n" +
            "  Você abre a boca.\n" +
            "  E grita.");

        // --------------------------------------------------------
        // TEXTO 1 — O grito e a resposta
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null,
            "══════════════════════════════════════\n" +
            "  TEXTO 1\n" +
            "══════════════════════════════════════\n\n" +
            "  A voz sai mais fraca do que você esperava —\n" +
            "  rouca, como se sua garganta estivesse seca há horas.\n" +
            "  O silêncio que vem depois parece ainda mais pesado.\n" +
            "  Mas então...\n" +
            "  Uma resposta. Baixa. Abafada.\n" +
            "  A voz é estranha... familiar demais pra ser de um estranho.\n" +
            "  Ela fala de novo:\n" +
            "  \"Me ajuda... por favor.\"");

        String escolha1 = "";
        while (!escolha1.equals("A") && !escolha1.equals("B")) {
            String entrada = JOptionPane.showInputDialog(null,
                "  A - Ir até o quarto em silêncio\n" +
                "  B - Tentar conversar de onde você está\n\n" +
                "  Digite A ou B:");

            if (entrada == null) return;
            escolha1 = entrada.trim().toUpperCase();

            if (escolha1.equals("A")) {
                JOptionPane.showMessageDialog(null,
                    "  Você decide ir devagar. Sem fazer barulho.\n" +
                    "  Cada passo no corredor é uma tensão nova.\n" +
                    "  A voz parou.\n" +
                    "  Você chega mais perto da porta...\n" +
                    "  Uma fresta de luz saindo de dentro.\n" +
                    "  Você espia pelo vão.\n" +
                    "  Lá dentro tem uma figura sentada de costas. Imóvel.\n" +
                    "  Você dá um passo pra dentro...\n" +
                    "  CRACK. O chão trai você.\n" +
                    "  A figura se levanta devagar. E vira.\n" +
                    "  Você congela.\n" +
                    "  O rosto dela... é igual ao seu.");

            } else if (escolha1.equals("B")) {
                JOptionPane.showMessageDialog(null,
                    "  Você fica parado e grita de novo:\n" +
                    "  \"Ei! Quem tá aí? Você tá bem?\"\n" +
                    "  Silêncio por alguns segundos.\n" +
                    "  Depois, a voz responde:\n" +
                    "  \"Não entra aqui. Fica onde você tá.\"\n" +
                    "  \"Por quê? O que aconteceu?\"\n" +
                    "  \"Porque... ela ainda tá aqui.\"\n" +
                    "  Você sente um frio percorrer sua espinha.\n" +
                    "  \"Quem?\"\n" +
                    "  A voz não responde.\n" +
                    "  Mas você ouve um barulho... de trás de você.");

            } else {
                JOptionPane.showMessageDialog(null, "  Escolha inválida. Digite apenas A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 2 — Sala sem janelas
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null,
            "══════════════════════════════════════\n" +
            "  TEXTO 2\n" +
            "══════════════════════════════════════\n\n" +
            "  As luzes do corredor piscam três vezes. E apagam.\n" +
            "  Escuridão total.\n" +
            "  O chão treme. Você tenta achar a parede com as mãos...\n" +
            "  E toca em algo. Não é a parede. É uma mão.\n" +
            "  Ela aperta a sua com força. E puxa.\n" +
            "  Quando a luz volta — você tá em uma sala pequena. Sem janelas.\n" +
            "  No centro: uma mesa velha.\n" +
            "    - Uma lanterna apagada\n" +
            "    - E um espelho coberto por um pano preto");

        String escolha2 = "";
        while (!escolha2.equals("A") && !escolha2.equals("B")) {
            String entrada = JOptionPane.showInputDialog(null,
                "  A - Pegar a lanterna e iluminar o ambiente\n" +
                "  B - Retirar o pano do espelho\n\n" +
                "  Digite A ou B:");

            if (entrada == null) return;
            escolha2 = entrada.trim().toUpperCase();

            if (escolha2.equals("A")) {
                JOptionPane.showMessageDialog(null,
                    "  Você pega a lanterna. Ela liga de primeira.\n" +
                    "  A luz revela as paredes. Cobertas de marcações.\n" +
                    "  Riscos. Números. Nomes.\n" +
                    "  Você aponta a lanterna mais perto e lê um dos nomes.\n" +
                    "  O seu.\n" +
                    "  Escrito ali. Com o que parece ser carvão.\n" +
                    "  Abaixo do seu nome: \"O que entra não sai.\"\n" +
                    "  Você recua um passo. E a lanterna apaga.");

            } else if (escolha2.equals("B")) {
                JOptionPane.showMessageDialog(null,
                    "  Você agarra o pano e puxa de uma vez.\n" +
                    "  O espelho aparece — grande, antigo, moldura rachada.\n" +
                    "  Você olha pro reflexo. Tá tudo certo no começo.\n" +
                    "  Mas então... o reflexo pisca. Você não piscou.\n" +
                    "  O reflexo levanta a mão devagar. Você não moveu a mão.\n" +
                    "  E então o reflexo coloca o dedo nos lábios.\n" +
                    "  \"Shh.\"");

            } else {
                JOptionPane.showMessageDialog(null, "  Escolha inválida. Digite apenas A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 3 — A porta e o que está do outro lado
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null,
            "══════════════════════════════════════\n" +
            "  TEXTO 3\n" +
            "══════════════════════════════════════\n\n" +
            "  Algo bate na porta da sala.\n" +
            "  Uma vez. Duas. Três. E para.\n" +
            "  Silêncio pesado. Você mal respira.\n" +
            "  A maçaneta começa a girar — devagar — de fora pra dentro.\n" +
            "  A porta abre um centímetro... dois... para.\n" +
            "  Nada aparece. Mas você sente que tem algo do outro lado.\n" +
            "  No chão perto dos seus pés:\n" +
            "    - Uma chave enferrujada\n" +
            "    - E um bilhete dobrado");

        String escolha3 = "";
        while (!escolha3.equals("A") && !escolha3.equals("B")) {
            String entrada = JOptionPane.showInputDialog(null,
                "  A - Pegar a chave e tentar trancar a porta\n" +
                "  B - Abrir o bilhete\n\n" +
                "  Digite A ou B:");

            if (entrada == null) return;
            escolha3 = entrada.trim().toUpperCase();

            if (escolha3.equals("A")) {
                JOptionPane.showMessageDialog(null,
                    "  Você pega a chave e vai até a porta em passos rápidos.\n" +
                    "  Você encaixa a chave na fechadura. Ela gira. CLACK.\n" +
                    "  A porta tá trancada. Você recua, aliviado por um segundo.\n" +
                    "  Mas aí a porta começa a tremer.\n" +
                    "  Algo está empurrando do outro lado. Com força.\n" +
                    "  A chave cai da fechadura sozinha.\n" +
                    "  E a porta abre de vez.");

            } else if (escolha3.equals("B")) {
                JOptionPane.showMessageDialog(null,
                    "  Você pega o bilhete com dedos trêmulos e desdobra.\n" +
                    "  A letra é irregular, apressada:\n" +
                    "  \"Não olha pra ela. Não fala com ela. Não deixa ela te tocar.\"\n" +
                    "  Você lê de novo. E de novo.\n" +
                    "  A porta abre mais um pouco.\n" +
                    "  Você não olha. Você ouve passos lentos entrando na sala.\n" +
                    "  Você fixa o olhar no bilhete.\n" +
                    "  Não olha. Não olha.\n" +
                    "  Uma voz suave, quase gentil:\n" +
                    "  \"Por que você não olha pra mim?\"");

            } else {
                JOptionPane.showMessageDialog(null, "  Escolha inválida. Digite apenas A ou B.");
            }
        }

        // --------------------------------------------------------
        // TEXTO 4 — Corredor da decisão final
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null,
            "══════════════════════════════════════\n" +
            "  TEXTO 4\n" +
            "══════════════════════════════════════\n\n" +
            "  Tudo acontece de uma vez.\n" +
            "  Um barulho ensurdecedor. Escuridão. E então — nada.\n" +
            "  Quando você abre os olhos, está de pé.\n" +
            "  Num corredor diferente. As paredes são mais altas.\n" +
            "  E no fim do corredor — tem luz. Uma luz quente, quase convidativa.\n" +
            "  Mas no meio do caminho há uma escada à sua direita, descendo pro andar de baixo.");

        String escolha4 = "";
        while (!escolha4.equals("A") && !escolha4.equals("B")) {
            String entrada = JOptionPane.showInputDialog(null,
                "  A - Seguir em frente até a luz\n" +
                "  B - Descer a escada primeiro\n\n" +
                "  Digite A ou B:");

            if (entrada == null) return;
            escolha4 = entrada.trim().toUpperCase();

            if (escolha4.equals("A")) {
                JOptionPane.showMessageDialog(null,
                    "  Você vai em direção à luz. Ela parece próxima.\n" +
                    "  Mas não chega. Você anda. E anda. E anda.\n" +
                    "  A luz nunca parece mais perto.\n" +
                    "  E de repente... ela apaga.\n" +
                    "  Você percebe onde está.\n" +
                    "  De volta. No quarto. Na cama. A janela iluminada. Igual ao começo.");

            } else if (escolha4.equals("B")) {
                JOptionPane.showMessageDialog(null,
                    "  Você começa a descer.\n" +
                    "  Cada degrau ecoa num lugar enorme demais.\n" +
                    "  Você desce. E desce. E desce.\n" +
                    "  Até que o chão some sob seus pés.\n" +
                    "  Escuridão.\n" +
                    "  E quando você abre os olhos de novo...\n" +
                    "  Você está de volta. No quarto. Na cama. A janela iluminada.");

            } else {
                JOptionPane.showMessageDialog(null, "  Escolha inválida. Digite apenas A ou B.");
            }
        }

        // --------------------------------------------------------
        // FINAL — Pellizari
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null,
            "╔══════════════════════════════════════════════════════════╗\n" +
            "║                        F I N A L                         ║\n" +
            "╚══════════════════════════════════════════════════════════╝\n\n" +
            "  Não importa o que você escolheu.\n" +
            "  Todas as escolhas levam ao mesmo lugar.\n" +
            "  A mansão não te prendeu quando você entrou.\n" +
            "  Ela te prendeu quando você gritou.\n" +
            "  Porque foi aí que ela escolheu você.\n\n" +
            "  Do quarto do lado, você ouve uma voz.\n" +
            "  Nova. Assustada. Gritando por ajuda.\n\n" +
            "  E você percebe que agora...\n" +
            "  É você quem vai responder.");
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##               HISTÓRIA 5 — PIETRO                     ##
    // ##                 (JOPTIONPANE)                          ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaPietro() {

        JOptionPane.showMessageDialog(null,
            "=========================\n" +
            "MANSÃO ASSOMBRADA — HISTÓRIA DE PIETRO\n" +
            "=========================\n\n" +
            "Nesse jogo você é um rapaz comum que acorda em um quarto\n" +
            "de uma mansão assombrada sem lembrar porque e nem como\n" +
            "você chegou ali.");

        // --------------------------------------------------------
        // ESCOLHA 1 — Amarrar a corda
        // --------------------------------------------------------
        int escolha1 = 0;
        while (escolha1 != 1 && escolha1 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Você acorda em uma cama sem se lembrar de nada. Está tudo escuro\n" +
                "e a única parte iluminada é a janela. Ao olhar para fora você percebe\n" +
                "que está no último andar de uma mansão gigantesca.\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - AMARRA A CORDA EM UM ARMÁRIO VELHO\n" +
                "2 - AMARRA A CORDA NA CAMA\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha1 = Integer.parseInt(entrada.trim());
                if (escolha1 != 1 && escolha1 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha1 == 1) {
            JOptionPane.showMessageDialog(null,
                "No momento que está descendo, a corda faz o armário cair em cima\n" +
                "da cama, quebrando tudo. Seu plano de escapar falha, mas algo chama\n" +
                "sua atenção… debaixo da cama há um livro brilhante com uma aura estranha.");
        } else if (escolha1 == 2) {
            JOptionPane.showMessageDialog(null,
                "Enquanto desce, a corda fica instável — dois pés da cama quebram.\n" +
                "Você sobe de volta frustrado, percebendo que o plano falhou. Ao se virar…\n" +
                "vê um livro brilhante diferente de tudo que já viu.");
        }

        // --------------------------------------------------------
        // ESCOLHA 2 — Seguir a luz ou a escuridão
        // --------------------------------------------------------
        int escolha2 = 0;
        while (escolha2 != 1 && escolha2 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Cheio de curiosidade e confusão, você abre o livro. Ele possui apenas uma página.\n" +
                "Na frente está escrito:\n" +
                "\"Desça as escadas e siga a luz, pois ela te guiará para fora.\"\n" +
                "No verso está escrito:\n" +
                "\"Evite a luz e caminhe pela escuridão, pois ela revela a verdade.\"\n" +
                "Uma observação está escrita no rodapé:\n" +
                "\"Confie em apenas uma frase. A outra levará à perdição.\"\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - SEGUE A LUZ PELAS ESCADAS\n" +
                "2 - EVITA A LUZ E CAMINHA PELA ESCURIDÃO\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha2 = Integer.parseInt(entrada.trim());
                if (escolha2 != 1 && escolha2 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha2 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você abre a porta e encontra um corredor iluminado por velas.\n" +
                "A luz no fim das escadas parece te chamar.");
        } else if (escolha2 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você decide ignorar a luz e caminha pela escuridão, guiando-se pelas paredes frias.");
        }

        // --------------------------------------------------------
        // ESCOLHA 3 — Chave ou espelho
        // --------------------------------------------------------
        int escolha3 = 0;
        boolean pegouEspelho = false;
        while (escolha3 != 1 && escolha3 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Independentemente da escolha, você chega até uma escadaria longa demais…\n" +
                "como se não tivesse fim.\n" +
                "Ao descer, encontra um grande saguão. No centro, há uma mesa com dois objetos:\n" +
                "- Uma chave enferrujada.\n" +
                "- Um espelho limpo demais… refletindo algo estranho.\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - PEGA A CHAVE ENFERRUJADA\n" +
                "2 - PEGA O ESPELHO LIMPO\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha3 = Integer.parseInt(entrada.trim());
                if (escolha3 != 1 && escolha3 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha3 == 1) {
            JOptionPane.showMessageDialog(null,
                "Ao tocá-la, um frio percorre seu corpo. Parece que algo te tocou de volta.");
            pegouEspelho = false;
        } else if (escolha3 == 2) {
            JOptionPane.showMessageDialog(null,
                "Seu reflexo atrasa por um instante… e algo nele sorri sem você sorrir.");
            pegouEspelho = true;
        }

        // --------------------------------------------------------
        // ESCOLHA 4 — Esconder ou observar
        // --------------------------------------------------------
        int escolha4 = 0;
        while (escolha4 != 1 && escolha4 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Um som ecoa.\n" +
                "TOC… TOC… TOC…\n" +
                "Uma porta no fundo se abre lentamente.\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - SE ESCONDE ATRÁS DA MESA\n" +
                "2 - FICA PARADO OBSERVANDO\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha4 = Integer.parseInt(entrada.trim());
                if (escolha4 != 1 && escolha4 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha4 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você se esconde. Vê pés pálidos passando lentamente… algo está ali.");
        } else if (escolha4 == 2) {
            JOptionPane.showMessageDialog(null,
                "Uma criatura alta e sem olhos entra… e começa a andar em sua direção.");
        }

        // --------------------------------------------------------
        // ESCOLHA 5 — Porta branca ou preta
        // --------------------------------------------------------
        int escolha5 = 0;
        while (escolha5 != 1 && escolha5 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Sua mente ecoa uma frase:\n" +
                "\"Você já esteve aqui antes.\"\n" +
                "Tudo treme. A criatura desaparece.\n" +
                "Você está agora em um corredor diferente.\n" +
                "No fim, duas portas:\n" +
                "- Uma branca, limpa.\n" +
                "- Uma preta, velha e rachada.\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - ENTRA NA PORTA BRANCA\n" +
                "2 - ENTRA NA PORTA PRETA\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha5 = Integer.parseInt(entrada.trim());
                if (escolha5 != 1 && escolha5 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha5 == 1) {
            JOptionPane.showMessageDialog(null,
                "Um quarto simples… mas há alguém na cama.");
        } else if (escolha5 == 2) {
            JOptionPane.showMessageDialog(null,
                "Um quarto deteriorado… com marcas nas paredes… e alguém na cama.");
        }

        // --------------------------------------------------------
        // ESCOLHA 6 — Tocar ou se afastar
        // --------------------------------------------------------
        int escolha6 = 0;
        while (escolha6 != 1 && escolha6 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Ao se aproximar, você percebe:\n" +
                "É você.\n" +
                "Seu próprio corpo está ali, imóvel.\n" +
                "Na parede:\n" +
                "\"Você nunca saiu daqui.\"\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - TOCA NO SEU PRÓPRIO CORPO\n" +
                "2 - SE AFASTA ASSUSTADO\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha6 = Integer.parseInt(entrada.trim());
                if (escolha6 != 1 && escolha6 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha6 == 1) {
            JOptionPane.showMessageDialog(null,
                "Memórias invadem sua mente violentamente.");
        } else if (escolha6 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você tenta fugir… mas memórias começam a surgir mesmo assim.");
        }

        // --------------------------------------------------------
        // ESCOLHA 7 — Aceitar ou quebrar o ciclo
        // --------------------------------------------------------
        int escolha7 = 0;
        while (escolha7 != 1 && escolha7 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Você se lembra.\n" +
                "Você foi trazido para a mansão.\n" +
                "Ela se alimenta das pessoas.\n" +
                "Você já tentou escapar inúmeras vezes.\n" +
                "Tudo… é um ciclo.\n" +
                "Uma voz surge novamente:\n" +
                "\"Qual versão de você ficará?\"\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - ACEITA FICAR NA MANSÃO\n" +
                "2 - TENTA QUEBRAR O CICLO\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha7 = Integer.parseInt(entrada.trim());
                if (escolha7 != 1 && escolha7 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha7 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você aceita.\n" +
                "Agora você não sente mais nada.\n" +
                "Alguém novo entra na mansão…\n" +
                "E você começa a andar em direção a ele.\n\n" +
                "=========================\n" +
                "FIM — FINAL: O GUARDIÃO DA MANSÃO\n" +
                "=========================");
            return;
        } else if (escolha7 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você se recusa.\n" +
                "A mansão começa a tremer violentamente. As paredes racham,\n" +
                "o chão se parte… e a criatura surge diante de você, mais distorcida do que nunca.\n" +
                "Mas dessa vez… você não foge.\n" +
                "Você corre em direção a ela.\n" +
                "No impacto—\n" +
                "Tudo se quebra.\n" +
                "Silêncio.\n" +
                "Você abre os olhos.\n" +
                "Está do lado de fora da mansão.\n" +
                "O sol bate no seu rosto.\n" +
                "Você respira… profundamente.\n" +
                "Mas algo está errado.\n" +
                "No seu bolso… o espelho ainda está.\n" +
                "E no reflexo… a criatura continua lá.\n" +
                "Ela não ficou na mansão. Ela veio com você.");
        }

        // --------------------------------------------------------
        // ESCOLHA 8 — Quebrar ou observar o espelho
        // --------------------------------------------------------
        int escolha8 = 0;
        while (escolha8 != 1 && escolha8 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "O ar fica pesado novamente. O céu escurece. O espelho vibra em sua mão.\n" +
                "Uma voz ecoa:\n" +
                "\"Você não quebrou o ciclo… você o trouxe com você.\"\n" +
                "O chão começa a desaparecer.\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - QUEBRA O ESPELHO NO CHÃO\n" +
                "2 - OBSERVA O ESPELHO COM ATENÇÃO\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha8 = Integer.parseInt(entrada.trim());
                if (escolha8 != 1 && escolha8 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha8 == 1) {
            JOptionPane.showMessageDialog(null,
                "Ele se estilhaça… mas cada fragmento reflete a criatura.\n" +
                "Agora… existem várias.");
        } else if (escolha8 == 2) {
            JOptionPane.showMessageDialog(null,
                "A criatura não olha para você…\n" +
                "Ela olha para algo atrás de você.");
        }

        // --------------------------------------------------------
        // ESCOLHA 9 — Enfrentar ou conversar
        // --------------------------------------------------------
        int escolha9 = 0;
        while (escolha9 != 1 && escolha9 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Você se vira. E vê…\n" +
                "Outra versão de você. Mais fria. Mais sombria. Sorrindo.\n" +
                "\"Eu sou a parte que ficou.\"\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - ENFRENTA SUA OUTRA VERSÃO\n" +
                "2 - TENTA CONVERSAR\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha9 = Integer.parseInt(entrada.trim());
                if (escolha9 != 1 && escolha9 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha9 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você tenta atacar… mas algo te impede.");
        } else if (escolha9 == 2) {
            JOptionPane.showMessageDialog(null,
                "Ela ri.\n" +
                "\"Você ainda não entendeu…\"");
        }

        // --------------------------------------------------------
        // ESCOLHA 10 — Entrar na porta vermelha ou fugir
        // --------------------------------------------------------
        int escolha10 = 0;
        while (escolha10 != 1 && escolha10 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Tudo muda novamente.\n" +
                "Você está de volta na mansão. Mas agora ela está viva.\n" +
                "No centro… uma porta vermelha pulsante.\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - ENTRA NA PORTA VERMELHA\n" +
                "2 - TENTA FUGIR\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha10 = Integer.parseInt(entrada.trim());
                if (escolha10 != 1 && escolha10 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha10 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você entra… e encara suas memórias, medos e culpa.");
        } else if (escolha10 == 2) {
            JOptionPane.showMessageDialog(null,
                "Não há saída.\n" +
                "Tudo leva à porta vermelha.");
        }

        // --------------------------------------------------------
        // ESCOLHA 11 — Aceitar ou negar
        // --------------------------------------------------------
        int escolha11 = 0;
        while (escolha11 != 1 && escolha11 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Dentro, há uma cadeira e um gravador.\n" +
                "Sua própria voz diz:\n" +
                "\"Existe uma última escolha… não é sobre fugir.\"\n" +
                "No chão:\n" +
                "\"ACEITAR TUDO QUE VOCÊ É\"\n" +
                "\"NEGAR E LUTAR MAIS UMA VEZ\"\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - ACEITA\n" +
                "2 - NEGA\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha11 = Integer.parseInt(entrada.trim());
                if (escolha11 != 1 && escolha11 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolha11 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você aceita tudo.\n" +
                "A criatura desaparece.\n" +
                "A mansão começa a sumir.");
        } else if (escolha11 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você luta… mas a mansão te envolve.");
        }

        // --------------------------------------------------------
        // ESCOLHA FINAL — Atravessar ou ficar
        // --------------------------------------------------------
        int escolhaFinal = 0;
        while (escolhaFinal != 1 && escolhaFinal != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "Tudo fica branco.\n" +
                "Você abre os olhos em um vazio infinito.\n" +
                "Uma voz: \"Agora você é livre… ou faz parte.\"\n" +
                "Uma última porta surge.\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - ATRAVESSA\n" +
                "2 - FICA\n\n" +
                "Digite sua escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolhaFinal = Integer.parseInt(entrada.trim());
                if (escolhaFinal != 1 && escolhaFinal != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida! Tente novamente.");
            }
        }

        if (escolhaFinal == 1) {
            JOptionPane.showMessageDialog(null,
                "Você acorda em um quarto normal.\n" +
                "Dessa vez… real.\n" +
                "No espelho, só você.\n\n" +
                "FIM — FINAL: LIBERTO\n" +
                "=========================");
        } else if (escolhaFinal == 2) {
            JOptionPane.showMessageDialog(null,
                "Você permanece.\n" +
                "E começa a esquecer quem é.\n" +
                "A mansão… nunca precisou existir fisicamente.\n\n" +
                "FIM — FINAL: O ETERNO\n" +
                "=========================");
        }
    }


    // ############################################################
    // ############################################################
    // ##                                                        ##
    // ##               HISTÓRIA 6 — PEDRO                      ##
    // ##                 (JOPTIONPANE)                          ##
    // ##                                                        ##
    // ############################################################
    // ############################################################

    static void historiaPedro() {

        JOptionPane.showMessageDialog(null,
            "====================================\n" +
            "      RPG - A MANSÃO ASSOMBRADA\n" +
            "====================================\n\n" +
            "Você acorda em uma cama sem se lembrar de nada.\n" +
            "Está tudo escuro e a única parte iluminada é a janela.\n" +
            "Ao olhar para fora, percebe que está no último andar\n" +
            "de uma mansão gigantesca.");

        // --------------------------------------------------------
        // ESCOLHA 1 — Gritar ou fugir pela janela
        // --------------------------------------------------------
        int escolha1 = 0;
        while (escolha1 != 1 && escolha1 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - Tentar gritar chamando alguém\n" +
                "2 - Tentar fugir pela janela\n\n" +
                "Escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha1 = Integer.parseInt(entrada.trim());
                if (escolha1 != 1 && escolha1 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }

        if (escolha1 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você grita procurando alguém.\n" +
                "Depois de alguns segundos, escuta uma voz\n" +
                "vindo de um dos quartos daquele andar.\n" +
                "A voz parece familiar... muito familiar.");
        } else if (escolha1 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você vai até a janela.\n" +
                "Percebe que está a mais de 30 metros do chão.\n" +
                "Por sorte, encontra uma corda velha no quarto.");
        }

        // --------------------------------------------------------
        // ESCOLHA 2 — Depende da escolha anterior
        // --------------------------------------------------------
        int escolha2 = 0;
        while (escolha2 != 1 && escolha2 != 2) {
            String pergunta;
            if (escolha1 == 1) {
                pergunta =
                    "O QUE VOCÊ FAZ?\n\n" +
                    "1 - Ir até o quarto de onde vem a voz\n" +
                    "2 - Tentar conversar com a pessoa\n\n" +
                    "Escolha (1 ou 2):";
            } else {
                pergunta =
                    "O QUE VOCÊ FAZ?\n\n" +
                    "1 - Amarrar a corda no armário\n" +
                    "2 - Amarrar a corda na cama\n\n" +
                    "Escolha (1 ou 2):";
            }

            String entrada = JOptionPane.showInputDialog(null, pergunta);
            if (entrada == null) return;
            try {
                escolha2 = Integer.parseInt(entrada.trim());
                if (escolha2 != 1 && escolha2 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }

        if (escolha1 == 1 && escolha2 == 1) {
            JOptionPane.showMessageDialog(null,
                "Você caminha até o quarto.\n" +
                "Tropeça em um pedaço de madeira.\n" +
                "A porta se abre lentamente.");
        } else if (escolha1 == 1 && escolha2 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você conversa com a pessoa.\n" +
                "Ela abre a porta.\n" +
                "Ao se encontrarem, ambos ficam espantados.\n" +
                "Vocês têm a mesma voz e quase a mesma aparência.");
        } else if (escolha1 == 2 && escolha2 == 1) {
            JOptionPane.showMessageDialog(null,
                "O armário cai e quebra tudo.\n" +
                "Debaixo da cama, um livro brilhante aparece.");
        } else if (escolha1 == 2 && escolha2 == 2) {
            JOptionPane.showMessageDialog(null,
                "A cama quebra e você volta ao quarto.\n" +
                "Debaixo da cama há um livro estranho brilhando.");
        }

        // --------------------------------------------------------
        // TEXTO — O livro
        // --------------------------------------------------------
        JOptionPane.showMessageDialog(null,
            "Você abre o livro.\n" +
            "Ele possui apenas uma página.\n" +
            "Nela está escrito:\n" +
            "\"Só se deve confiar em uma frase,\n" +
            "pois a outra levará à perdição.\"");

        // --------------------------------------------------------
        // ESCOLHA 3 — Primeira ou segunda frase
        // --------------------------------------------------------
        int escolha3 = 0;
        while (escolha3 != 1 && escolha3 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - Ler a primeira frase\n" +
                "2 - Ler a segunda frase\n\n" +
                "Escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha3 = Integer.parseInt(entrada.trim());
                if (escolha3 != 1 && escolha3 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }

        if (escolha3 == 1) {
            JOptionPane.showMessageDialog(null,
                "A frase diz:\n" +
                "\"A saída está no porão, mas não vá sozinho.\"");
        } else if (escolha3 == 2) {
            JOptionPane.showMessageDialog(null,
                "A frase diz:\n" +
                "\"Confie apenas em si mesmo e salte.\"");
        }

        // --------------------------------------------------------
        // ESCOLHA 4 — Porta no fim do corredor
        // --------------------------------------------------------
        int escolha4 = 0;
        while (escolha4 != 1 && escolha4 != 2) {
            String entrada = JOptionPane.showInputDialog(null,
                "No fim do corredor, uma porta enorme aparece.\n" +
                "A pessoa misteriosa diz:\n" +
                "\"Só um de nós é real.\"\n\n" +
                "O QUE VOCÊ FAZ?\n\n" +
                "1 - Abrir a porta com a pessoa\n" +
                "2 - Fugir sozinho\n\n" +
                "Escolha (1 ou 2):");

            if (entrada == null) return;
            try {
                escolha4 = Integer.parseInt(entrada.trim());
                if (escolha4 != 1 && escolha4 != 2) {
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }

        // --------------------------------------------------------
        // FINAIS — Pedro
        // --------------------------------------------------------
        if (escolha4 == 1) {
            JOptionPane.showMessageDialog(null,
                "Vocês atravessam a porta.\n" +
                "Lá fora, a pessoa desaparece.\n" +
                "Você percebe que era seu reflexo.\n\n" +
                "FINAL 1: O OUTRO VOCÊ");
        } else if (escolha4 == 2) {
            JOptionPane.showMessageDialog(null,
                "Você foge sozinho.\n" +
                "Ao abrir o livro novamente, lê:\n" +
                "\"Você escolheu a frase errada.\"\n" +
                "Tudo escurece.\n\n" +
                "FINAL 2: LOOP ETERNO");
        }
    }
}