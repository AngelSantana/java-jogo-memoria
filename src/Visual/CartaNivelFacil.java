/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;


import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class CartaNivelFacil extends Carta {

    private final String imgFundo = "/Imagens/IMGFUNDO.png"; // Recebe imagem de Plano de fundo
    
   

        public CartaNivelFacil(String imgF, JLabel Label_pont, JLabel cartasViradas, JMenuItem novojogo) {//Construtor Carta
        super(imgF, Label_pont, cartasViradas, novojogo);//
        setImgFrente(imgF);//Recebe endereco da imagem
        var_Label_Pontos = Label_pont;// Atribui em var_Label_Pontos o Label: [LabelPontuacao]
        var_Label_Cartas_Viradas = cartasViradas; // Atribui em var_Label_Cartas_Viradas o Label: LabelQuantCartasViradas logo irá mudar a o valor
        NovoJogo = novojogo;//Recebe Item de Menu (JMenuItem)


        this.addMouseListener(new java.awt.event.MouseAdapter() {// Assinatura de Evento Clique do mouse

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                capturarCliqueDoMouse();//Captura o clique do mouse e ao clicar executar tais procedimentos


            }
        });
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {//Assinatura de Evento de Sub Menu do Jogo (ActionPerformed NovoJogo)

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuDeJogo_NovoJogoActionPerformed();//Captura a "ação" de Novo Jogo
            }
        });


    }

    @Override
    public void SubMenuDeJogo_NovoJogoActionPerformed() {//ao executar a "ação" de Novo Jogo
        contCartasViradasUma = 0;// Zera O contador de cada carta virada
        pontos = 0;//Zera o contador de pontos
        contCardViradaPar = 0;//Zera o contador de cartas pares viradas
    }

    @Override
    public void capturarCliqueDoMouse() {// Procedimentos a serem executados a cada clique
        if (!this.isViradaPraFrente()) {// Verifica se a carta não esta virada para frente (atribui false)

            this.Mostrar_Carta();// Mostrar carta
            viradaParaFrente = true;
            cont++;// Conta os cliques (Adiciona +1 ao contador)
            contCartasViradasUma++;//Conta a quantidade de cartas que foram viradas

            var_Label_Cartas_Viradas.setText(contCartasViradasUma + "");//Escreve no Label a quantidade de cartas viradas
            if (cont == 1) {// Verifica se o contador está em 1
                ClicaPrimCarta = this;//Atribui a variável ClicaPrimCarta a ela mesma [this]
                // Espaço ^^
            }

            if (cont == 2) {// Verifica se o contador está em 2
                if (this.getPar().isViradaPraFrente()) {//equivale: (ClicaPrimCarta.getPar().isViradaParaFrente())|
                    //Verifica se o par da carta clicada esta virada para frente.

                    JOptionPane.showMessageDialog(null, "Acertou!");
                    ClicaPrimCarta.setVisible(false);//Torna a Visibilidade da carta (ClicaPrimCarta) oculta.
                    this.setVisible(false);// Torna a Visibilidade da segunda carta clicada Oculta.
                    ClicaPrimCarta.viradaParaFrente = true;// Atribui valor verdadeiro a Primeira Carta virada para frente
                    this.viradaParaFrente = true;// Atribui verdadeiro a segunda carta virada.
                    var_Label_Pontos.setText(Pontuacao(+10));//Faz pontuação receber +10 ao método ponuação, passando assim para o label de pontos
                    contCardViradaPar += 2;//Atribui a cartas pares viradas +2

                } else {

                    JOptionPane.showMessageDialog(null, "Errou!");
                    ClicaPrimCarta.Esconder_Carta();//Esconde a carta exibindo a imagem de plano de fundo
                    this.Esconder_Carta();//Esconde a segunda carta exibindo a imagem de plano de fundo
                    ClicaPrimCarta.viradaParaFrente = false;//Atribui falso a primeira carta virada para frente
                    this.viradaParaFrente = false;//Atribui falso (false) a segunda carta virada para frente
                    var_Label_Pontos.setText(Pontuacao(-5));//Faz pontuação receber +10 ao método ponuação, passando assim para o label de pontos
                }

                if (contCardViradaPar == 16) {//  Verifica se as 16 cartas ja estão viradas
                    JOptionPane.showMessageDialog(null, "Você Venceu!\n" + "- Sua pontuação foi: " + Pontuacao(0) + "\n - O total de "
                            + "peças viradas foram: " + (contCartasViradasUma));
                    contCartasViradasUma = 0;// Zera O contador de cada carta virada
                    pontos = 0;//Zera o contador de pontos
                    contCardViradaPar = 0;//Zera o contador de cartas pares viradas


                }
                ClicaPrimCarta = null; // Faz ClicaPrimCarta receber null,
                cont = 0;// Zera o contador de cliques




            }
        } else {//Caso a carta já esteja virada para frente

            Esconder_Carta();//Esconde a carta virada para frente
            viradaParaFrente = false;//Atribui falso para viradaParaFrente
            ClicaPrimCarta = null;//Faz ClicaPrimCarta receber null
            cont = 0;//Zera o contador

        }

    }


    @Override

    public void Esconder_Carta() {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgFundo)));
    }


    @Override
    public void Mostrar_Carta() {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(getImgFrente())));
    }
}
