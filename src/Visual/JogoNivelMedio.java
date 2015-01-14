/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JogoNivelMedio.java
 *
 * Created on 04/12/2010, 10:36:22
 */
package Visual;

import java.util.ArrayList;
import java.util.Collections;
import visual.CartaNivelMedio;

public class JogoNivelMedio extends javax.swing.JFrame {

    ArrayList<CartaNivelMedio> cartas = new ArrayList<CartaNivelMedio>();

    /** Creates new form JogoNivelMedio */
    public JogoNivelMedio() {
        initComponents();

        /*Criando as cartas*/

        CartaNivelMedio carta1 = new CartaNivelMedio("/Imagens/IMAGEM1_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta2 = new CartaNivelMedio("/Imagens/IMAGEM1_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta3 = new CartaNivelMedio("/Imagens/IMAGEM2_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta4 = new CartaNivelMedio("/Imagens/IMAGEM2_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta6 = new CartaNivelMedio("/Imagens/IMAGEM3_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta7 = new CartaNivelMedio("/Imagens/IMAGEM3_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta8 = new CartaNivelMedio("/Imagens/IMAGEM4_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta9 = new CartaNivelMedio("/Imagens/IMAGEM4_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta10 = new CartaNivelMedio("/Imagens/IMAGEM5_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta11 = new CartaNivelMedio("/Imagens/IMAGEM5_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta12 = new CartaNivelMedio("/Imagens/IMAGEM6_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta13 = new CartaNivelMedio("/Imagens/IMAGEM6_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta14 = new CartaNivelMedio("/Imagens/IMAGEM7_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta5 = new CartaNivelMedio("/Imagens/IMAGEM7_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta15 = new CartaNivelMedio("/Imagens/IMAGEM8_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta16 = new CartaNivelMedio("/Imagens/IMAGEM8_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);

        CartaNivelMedio carta17 = new CartaNivelMedio("/Imagens/IMAGEM9_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta18 = new CartaNivelMedio("/Imagens/IMAGEM9_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta19 = new CartaNivelMedio("/Imagens/IMAGEM10_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta20 = new CartaNivelMedio("/Imagens/IMAGEM10_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta21 = new CartaNivelMedio("/Imagens/IMAGEM11_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta22 = new CartaNivelMedio("/Imagens/IMAGEM11_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta23 = new CartaNivelMedio("/Imagens/IMAGEM12_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta24 = new CartaNivelMedio("/Imagens/IMAGEM12_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta25 = new CartaNivelMedio("/Imagens/IMAGEM13_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta26 = new CartaNivelMedio("/Imagens/IMAGEM13_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta27 = new CartaNivelMedio("/Imagens/IMAGEM14_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta28 = new CartaNivelMedio("/Imagens/IMAGEM14_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta29 = new CartaNivelMedio("/Imagens/IMAGEM15_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta30 = new CartaNivelMedio("/Imagens/IMAGEM15_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta31 = new CartaNivelMedio("/Imagens/IMAGEM16_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta32 = new CartaNivelMedio("/Imagens/IMAGEM16_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta33 = new CartaNivelMedio("/Imagens/IMAGEM17_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta34 = new CartaNivelMedio("/Imagens/IMAGEM17_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta35 = new CartaNivelMedio("/Imagens/IMAGEM18_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);
        CartaNivelMedio carta36 = new CartaNivelMedio("/Imagens/IMAGEM18_MEDIA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo);

        /*Adicionando as cartas no ArrayList*/
        cartas.add(carta1);
        cartas.add(carta2);
        cartas.add(carta3);
        cartas.add(carta4);
        cartas.add(carta5);
        cartas.add(carta6);
        cartas.add(carta7);
        cartas.add(carta8);
        cartas.add(carta9);
        cartas.add(carta10);
        cartas.add(carta11);
        cartas.add(carta12);
        cartas.add(carta13);
        cartas.add(carta14);
        cartas.add(carta15);
        cartas.add(carta16);


        cartas.add(carta17);
        cartas.add(carta18);
        cartas.add(carta19);
        cartas.add(carta20);
        cartas.add(carta21);
        cartas.add(carta22);
        cartas.add(carta23);
        cartas.add(carta24);
        cartas.add(carta25);
        cartas.add(carta26);
        cartas.add(carta27);
        cartas.add(carta28);
        cartas.add(carta29);
        cartas.add(carta30);
        cartas.add(carta31);
        cartas.add(carta32);
        cartas.add(carta33);
        cartas.add(carta34);
        cartas.add(carta35);
        cartas.add(carta36);

        /*Definindo par da primeira carta em relação a segunda*/
        carta1.setPar(carta2);
        carta3.setPar(carta4);
        carta6.setPar(carta7);
        carta8.setPar(carta9);
        carta10.setPar(carta11);
        carta12.setPar(carta13);
        carta14.setPar(carta5);
        carta15.setPar(carta16);
        carta17.setPar(carta18);
        carta19.setPar(carta20);
        carta21.setPar(carta22);
        carta23.setPar(carta24);
        carta25.setPar(carta26);
        carta27.setPar(carta28);
        carta29.setPar(carta30);
        carta31.setPar(carta32);
        carta33.setPar(carta34);
        carta35.setPar(carta36);
        /*Definindo par da segunda carta em relação a primeira*/
        carta2.setPar(carta1);
        carta4.setPar(carta3);
        carta7.setPar(carta6);
        carta9.setPar(carta8);
        carta11.setPar(carta10);
        carta13.setPar(carta12);
        carta5.setPar(carta14);
        carta16.setPar(carta15);
        carta18.setPar(carta17);
        carta20.setPar(carta19);
        carta22.setPar(carta21);
        carta24.setPar(carta23);
        carta26.setPar(carta25);
        carta28.setPar(carta27);
        carta30.setPar(carta29);
        carta32.setPar(carta31);
        carta34.setPar(carta33);
        carta36.setPar(carta35);




        Collections.shuffle(cartas);
        for (CartaNivelMedio c : cartas) {
            c.Esconder_Carta();
            PainelPrincipal.add(c);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelPontos = new javax.swing.JLabel();
        LabelPontuacao = new javax.swing.JLabel();
        LabelCcartasViradas = new javax.swing.JLabel();
        LabelQuantDeCartasViradas2 = new javax.swing.JLabel();
        PainelPrincipal = new javax.swing.JPanel();
        BarraDeMenu = new javax.swing.JMenuBar();
        MenuJogo = new javax.swing.JMenu();
        SubMenuDeJogo_NovoJogo = new javax.swing.JMenuItem();
        SubMenuDeJogo_Opcoes = new javax.swing.JMenuItem();
        SubMenuDeJogo_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória Worms - Nivel Médio");
        setResizable(false);

        LabelPontos.setText("Pontos:");

        LabelPontuacao.setText("0");

        LabelCcartasViradas.setText("Cartas Viradas:");

        LabelQuantDeCartasViradas2.setText("0");

        PainelPrincipal.setLayout(new java.awt.GridLayout(6, 6, 1, 1));

        MenuJogo.setText("Jogo");

        SubMenuDeJogo_NovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        SubMenuDeJogo_NovoJogo.setText("Novo Jogo");
        SubMenuDeJogo_NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuDeJogo_NovoJogoActionPerformed(evt);
            }
        });
        MenuJogo.add(SubMenuDeJogo_NovoJogo);

        SubMenuDeJogo_Opcoes.setText("Opções");
        SubMenuDeJogo_Opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuDeJogo_OpcoesActionPerformed(evt);
            }
        });
        MenuJogo.add(SubMenuDeJogo_Opcoes);

        SubMenuDeJogo_Sair.setText("Sair");
        SubMenuDeJogo_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuDeJogo_SairActionPerformed(evt);
            }
        });
        MenuJogo.add(SubMenuDeJogo_Sair);

        BarraDeMenu.add(MenuJogo);

        setJMenuBar(BarraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelPontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelPontuacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
                        .addComponent(LabelCcartasViradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelQuantDeCartasViradas2)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPontos)
                    .addComponent(LabelPontuacao)
                    .addComponent(LabelCcartasViradas)
                    .addComponent(LabelQuantDeCartasViradas2))
                .addGap(15, 15, 15)
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubMenuDeJogo_OpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuDeJogo_OpcoesActionPerformed
        Opcoes op = new Opcoes();//Cria um objeto do tipo Opcoes
        op.setVisible(true);//Torna a visibilidade de opções true
        JogoNivelMedio.super.setVisible(false);//Torna a visibilidade do Frame JogoNivelMedio como false
}//GEN-LAST:event_SubMenuDeJogo_OpcoesActionPerformed

    private void SubMenuDeJogo_NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuDeJogo_NovoJogoActionPerformed
        JogoNivelMedio newJogo3 = new JogoNivelMedio();//Cria um objeto do tipo JogoNivelMedio
        newJogo3.setVisible(true);//Torna a visibilidade no jogo nivel médio true
        JogoNivelMedio.super.setVisible(false);//Torna o JFrame JogoNivelMedio com visibilidade false
    }//GEN-LAST:event_SubMenuDeJogo_NovoJogoActionPerformed

    private void SubMenuDeJogo_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuDeJogo_SairActionPerformed
        System.exit(0);//Sai do programa
    }//GEN-LAST:event_SubMenuDeJogo_SairActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeMenu;
    private javax.swing.JLabel LabelCcartasViradas;
    private javax.swing.JLabel LabelPontos;
    private javax.swing.JLabel LabelPontuacao;
    private javax.swing.JLabel LabelQuantDeCartasViradas2;
    private javax.swing.JMenu MenuJogo;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JMenuItem SubMenuDeJogo_NovoJogo;
    private javax.swing.JMenuItem SubMenuDeJogo_Opcoes;
    private javax.swing.JMenuItem SubMenuDeJogo_Sair;
    // End of variables declaration//GEN-END:variables
}
