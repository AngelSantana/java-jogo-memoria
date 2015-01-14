/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;


import javax.swing.JLabel;
import javax.swing.JMenuItem;


public class Carta extends JLabel {

    
    protected   String imgFrente; //Recebe imagem o verso da carta.
    protected   boolean viradaParaFrente = false;
    public  Carta par;//variavel tipo carta
    public static Carta ClicaPrimCarta;//Guarda primeira carta clicada.
    public static int cont = 0;//Contador de Cliques.
    public static int pontos = 0;//Contador de Pontos
    public JLabel var_Label_Pontos;//Variavel do tipo jLabel
    public static int contCardViradaPar = 0;//Contador de Cartas viradas (pares)
    public static int contCartasViradasUma = 0; // Contador de Cartas viradas (uma)
    public JLabel var_Label_Cartas_Viradas;//Irá Receber o Label : LabelQuantCartasViradas
    public JMenuItem NovoJogo;//Irá receber o Item de Menu: SubMenuDeJogo_NovoJogo
 
    public Carta(String imgF, JLabel Label_pont, JLabel cartasViradas, JMenuItem novojogo) {//Construtor Carta
        super();

    }

    public void SubMenuDeJogo_NovoJogoActionPerformed() {//ao executar a "ação" de Novo Jogo
        
    }

    public void capturarCliqueDoMouse() {// Procedimentos a serem executados a cada clique


    }

    public static String Pontuacao(int num) {//Calcula a pontuação

        pontos = (num) + pontos;//Somatório dos pontos
        String nome_num = pontos + "";// Soma os pontos a uma string vazia

        return nome_num;//Retorna os pontos em uma string

    }

    /**
     * @return the imgFrente
     */
    public String getImgFrente() {
        return imgFrente;
    }

    /**
     * @param imgFrente the imgFrente torub set
     */
    public void setImgFrente(String imgFrente) {
        this.imgFrente = imgFrente;
    }

    /**
     * @return the viradaPraFrente
     */
    public boolean isViradaPraFrente() {
        return viradaParaFrente;
    }

    /**
     * @param viradaPraFrente the viradaPraFrente to set
     */
    public void setViradaPraFrente(boolean viradaParaFrente) {
        this.viradaParaFrente = viradaParaFrente;
    }

    /**
     * @return the par
     */
    public Carta getPar() {
        return par;
    }

    /**
     * @param par the par to set
     */
    public void setPar(Carta par) {
        this.par = par;
    }

    public void Esconder_Carta() {
   
    }

    public void Mostrar_Carta() {
     
    }
}
