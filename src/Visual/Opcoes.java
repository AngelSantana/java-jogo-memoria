/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Opcoes.java
 *
 * Created on 04/12/2010, 11:49:15
 */
package Visual;

import javax.swing.JOptionPane;

public class Opcoes extends javax.swing.JFrame {

    /** Creates new form Opcoes */
    public Opcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Niveis = new javax.swing.ButtonGroup();
        LabelTitulo = new javax.swing.JLabel();
        NivelFacil = new javax.swing.JRadioButton();
        NivelMedio = new javax.swing.JRadioButton();
        NivelAvancado = new javax.swing.JRadioButton();
        BotaoOK = new javax.swing.JButton();

        setTitle("Jogo da Memória Worms - Opções");

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 16));
        LabelTitulo.setText("Selecione a dificuldade do seu jogo:");

        Niveis.add(NivelFacil);
        NivelFacil.setFont(new java.awt.Font("Tahoma", 0, 18));
        NivelFacil.setText("Fácil 4x4");

        Niveis.add(NivelMedio);
        NivelMedio.setFont(new java.awt.Font("Tahoma", 0, 18));
        NivelMedio.setText("Médio 6x6");

        Niveis.add(NivelAvancado);
        NivelAvancado.setFont(new java.awt.Font("Tahoma", 0, 18));
        NivelAvancado.setText("Avançado 8x8");

        BotaoOK.setText("OK");
        Niveis.add(BotaoOK);
        BotaoOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoOKMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LabelTitulo)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NivelAvancado)
                        .addComponent(NivelMedio)
                        .addComponent(NivelFacil)))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NivelFacil)
                .addGap(11, 11, 11)
                .addComponent(NivelMedio)
                .addGap(15, 15, 15)
                .addComponent(NivelAvancado)
                .addGap(26, 26, 26)
                .addComponent(BotaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoOKMouseClicked
        if (NivelFacil.isSelected() == true)//Verifica se ao ter clicado em OK, se o RadioButton - Nivel Facil está selecionado
        {

            JogoNivelFacil newjogo = new JogoNivelFacil();// Cria um objeto do tipo JogoNivelFacil
            newjogo.setVisible(true);//Inicia o Jogo no Nível Fácil (torna a sua visibilidade verdadeira)
            Opcoes.super.setVisible(false);//Torna a visibilidade do JFrame JogoWorms falsa
        } else if (NivelMedio.isSelected() == true)//Verifica se ao ter clicado em OK, se o RadioButton - Nivel Medio está selecionado
        {
            JogoNivelMedio newjogo = new JogoNivelMedio();// Cria um objeto do tipo JogoNivelMedio
            newjogo.setVisible(true);//Inicia o Jogo no Nível Medio (torna a sua visibilidade verdadeira)
            Opcoes.super.setVisible(false);//Torna a visibilidade do JFrame JogoWorms falsa
        } else if (NivelAvancado.isSelected() == true)//Verifica se ao ter clicado em OK, se o RadioButton - Nivel Avançado está selecionado
        {
            JogoNivelAvancado newjogo = new JogoNivelAvancado();// Cria um objeto do tipo JogoNivelAvancado
            newjogo.setVisible(true);//Inicia o Jogo no Nível Avançado (torna a sua visibilidade verdadeira)
            Opcoes.super.setVisible(false);//Torna a visibilidade do JFrame JogoWorms falsa
        } else {//Caso nenhuma das opções estejam marcadas
            JOptionPane.showMessageDialog(null, "Selecione um dos níveis!");
        }



    }//GEN-LAST:event_BotaoOKMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoOK;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.ButtonGroup Niveis;
    private javax.swing.JRadioButton NivelAvancado;
    private javax.swing.JRadioButton NivelFacil;
    private javax.swing.JRadioButton NivelMedio;
    // End of variables declaration//GEN-END:variables
}
