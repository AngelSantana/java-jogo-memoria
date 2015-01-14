package Visual;

import java.util.ArrayList;
import java.util.Collections;
import visual.CartaNivelAvancado;

public class JogoNivelAvancado extends javax.swing.JFrame {

    ArrayList<CartaNivelAvancado> cartas = new ArrayList<CartaNivelAvancado>();

    /** Creates new form JogoNivelAvancado */
    public JogoNivelAvancado() {
        initComponents();

        /*Criando as cartas*/

        CartaNivelAvancado carta1 = new CartaNivelAvancado("/Imagens/IMAGEM1_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta2 = new CartaNivelAvancado("/Imagens/IMAGEM1_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta3 = new CartaNivelAvancado("/Imagens/IMAGEM2_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta4 = new CartaNivelAvancado("/Imagens/IMAGEM2_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta6 = new CartaNivelAvancado("/Imagens/IMAGEM3_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta7 = new CartaNivelAvancado("/Imagens/IMAGEM3_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta8 = new CartaNivelAvancado("/Imagens/IMAGEM4_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta9 = new CartaNivelAvancado("/Imagens/IMAGEM4_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta10 = new CartaNivelAvancado("/Imagens/IMAGEM5_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta11 = new CartaNivelAvancado("/Imagens/IMAGEM5_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta12 = new CartaNivelAvancado("/Imagens/IMAGEM6_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta13 = new CartaNivelAvancado("/Imagens/IMAGEM6_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta14 = new CartaNivelAvancado("/Imagens/IMAGEM7_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta5 = new CartaNivelAvancado("/Imagens/IMAGEM7_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta15 = new CartaNivelAvancado("/Imagens/IMAGEM8_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta16 = new CartaNivelAvancado("/Imagens/IMAGEM8_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);

        CartaNivelAvancado carta17 = new CartaNivelAvancado("/Imagens/IMAGEM9_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta18 = new CartaNivelAvancado("/Imagens/IMAGEM9_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta19 = new CartaNivelAvancado("/Imagens/IMAGEM10_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta20 = new CartaNivelAvancado("/Imagens/IMAGEM10_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta21 = new CartaNivelAvancado("/Imagens/IMAGEM11_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta22 = new CartaNivelAvancado("/Imagens/IMAGEM11_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta23 = new CartaNivelAvancado("/Imagens/IMAGEM12_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta24 = new CartaNivelAvancado("/Imagens/IMAGEM12_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta25 = new CartaNivelAvancado("/Imagens/IMAGEM13_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta26 = new CartaNivelAvancado("/Imagens/IMAGEM13_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta27 = new CartaNivelAvancado("/Imagens/IMAGEM14_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta28 = new CartaNivelAvancado("/Imagens/IMAGEM14_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta29 = new CartaNivelAvancado("/Imagens/IMAGEM15_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta30 = new CartaNivelAvancado("/Imagens/IMAGEM15_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta31 = new CartaNivelAvancado("/Imagens/IMAGEM16_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta32 = new CartaNivelAvancado("/Imagens/IMAGEM16_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta33 = new CartaNivelAvancado("/Imagens/IMAGEM17_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta34 = new CartaNivelAvancado("/Imagens/IMAGEM17_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta35 = new CartaNivelAvancado("/Imagens/IMAGEM18_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta36 = new CartaNivelAvancado("/Imagens/IMAGEM18_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);

        CartaNivelAvancado carta37 = new CartaNivelAvancado("/Imagens/IMAGEM19_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta38 = new CartaNivelAvancado("/Imagens/IMAGEM19_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta39 = new CartaNivelAvancado("/Imagens/IMAGEM20_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta40 = new CartaNivelAvancado("/Imagens/IMAGEM20_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta41 = new CartaNivelAvancado("/Imagens/IMAGEM21_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta42 = new CartaNivelAvancado("/Imagens/IMAGEM21_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta43 = new CartaNivelAvancado("/Imagens/IMAGEM22_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta44 = new CartaNivelAvancado("/Imagens/IMAGEM22_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta45 = new CartaNivelAvancado("/Imagens/IMAGEM23_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta46 = new CartaNivelAvancado("/Imagens/IMAGEM23_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta47 = new CartaNivelAvancado("/Imagens/IMAGEM24_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta48 = new CartaNivelAvancado("/Imagens/IMAGEM24_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta49 = new CartaNivelAvancado("/Imagens/IMAGEM25_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta50 = new CartaNivelAvancado("/Imagens/IMAGEM25_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta51 = new CartaNivelAvancado("/Imagens/IMAGEM26_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta52 = new CartaNivelAvancado("/Imagens/IMAGEM26_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);

        CartaNivelAvancado carta53 = new CartaNivelAvancado("/Imagens/IMAGEM27_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta54 = new CartaNivelAvancado("/Imagens/IMAGEM27_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta55 = new CartaNivelAvancado("/Imagens/IMAGEM28_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta56 = new CartaNivelAvancado("/Imagens/IMAGEM28_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta57 = new CartaNivelAvancado("/Imagens/IMAGEM29_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta58 = new CartaNivelAvancado("/Imagens/IMAGEM29_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta59 = new CartaNivelAvancado("/Imagens/IMAGEM30_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta60 = new CartaNivelAvancado("/Imagens/IMAGEM30_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta61 = new CartaNivelAvancado("/Imagens/IMAGEM31_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta62 = new CartaNivelAvancado("/Imagens/IMAGEM31_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta63 = new CartaNivelAvancado("/Imagens/IMAGEM32_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);
        CartaNivelAvancado carta64 = new CartaNivelAvancado("/Imagens/IMAGEM32_PEQUENA.png", LabelPontuacao, LabelQuantDeCartasViradas2, SubMenuDeJogo_NovoJogo, ImagemSurpresa, PainelPrincipal, LabelPontos, LabelCartasViradas,MaxCartasPermitidas);

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
        cartas.add(carta37);
        cartas.add(carta38);
        cartas.add(carta39);
        cartas.add(carta40);
        cartas.add(carta41);
        cartas.add(carta42);
        cartas.add(carta43);
        cartas.add(carta44);
        cartas.add(carta45);
        cartas.add(carta46);
        cartas.add(carta47);
        cartas.add(carta48);
        cartas.add(carta49);
        cartas.add(carta50);
        cartas.add(carta51);
        cartas.add(carta52);
        cartas.add(carta53);
        cartas.add(carta54);
        cartas.add(carta55);
        cartas.add(carta56);
        cartas.add(carta57);
        cartas.add(carta58);
        cartas.add(carta59);
        cartas.add(carta60);
        cartas.add(carta61);
        cartas.add(carta62);
        cartas.add(carta63);
        cartas.add(carta64);

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
        carta37.setPar(carta38);
        carta39.setPar(carta40);
        carta41.setPar(carta42);
        carta43.setPar(carta44);
        carta45.setPar(carta46);
        carta47.setPar(carta48);

        carta49.setPar(carta50);
        carta51.setPar(carta52);
        carta53.setPar(carta54);
        carta55.setPar(carta56);
        carta57.setPar(carta58);
        carta59.setPar(carta60);
        carta61.setPar(carta62);
        carta63.setPar(carta64);

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
        carta38.setPar(carta37);
        carta40.setPar(carta39);
        carta42.setPar(carta41);
        carta44.setPar(carta43);
        carta46.setPar(carta45);
        carta48.setPar(carta47);

        carta50.setPar(carta49);
        carta52.setPar(carta51);
        carta54.setPar(carta53);
        carta56.setPar(carta55);
        carta58.setPar(carta57);
        carta60.setPar(carta59);
        carta62.setPar(carta61);
        carta64.setPar(carta63);



        Collections.shuffle(cartas);
        for (CartaNivelAvancado c : cartas) {
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
        LabelCartasViradas = new javax.swing.JLabel();
        LabelQuantDeCartasViradas2 = new javax.swing.JLabel();
        MaxPermitidoParaVirarCartas = new javax.swing.JLabel();
        ImagemSurpresa = new javax.swing.JLabel();
        MaxCartasPermitidas = new javax.swing.JLabel();
        PainelPrincipal = new javax.swing.JPanel();
        BarraDeMenu = new javax.swing.JMenuBar();
        MenuJogo = new javax.swing.JMenu();
        SubMenuDeJogo_NovoJogo = new javax.swing.JMenuItem();
        SubMenuDeJogo_Opcoes = new javax.swing.JMenuItem();
        SubMenuDeJogo_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória Worms - Nivel Avançado");
        setResizable(false);

        LabelPontos.setText("Pontos:");

        LabelPontuacao.setText("0");

        LabelCartasViradas.setText("Cartas Viradas:");

        LabelQuantDeCartasViradas2.setText("0");

        MaxPermitidoParaVirarCartas.setText("Máximo permitido para Cartas Viradas:");

        MaxCartasPermitidas.setText("0");

        PainelPrincipal.setLayout(new java.awt.GridLayout(8, 8, 1, 1));

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
                        .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelPontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelPontuacao)
                        .addGap(45, 45, 45)
                        .addComponent(MaxPermitidoParaVirarCartas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaxCartasPermitidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(LabelCartasViradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelQuantDeCartasViradas2)
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(ImagemSurpresa)
                .addContainerGap(637, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPontos)
                    .addComponent(LabelPontuacao)
                    .addComponent(LabelCartasViradas)
                    .addComponent(LabelQuantDeCartasViradas2)
                    .addComponent(MaxPermitidoParaVirarCartas)
                    .addComponent(MaxCartasPermitidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(ImagemSurpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubMenuDeJogo_OpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuDeJogo_OpcoesActionPerformed
        Opcoes op = new Opcoes();//Cria um objeto do tipo Opcoes
        op.setVisible(true);//Torna a visibilidade de opções true
        JogoNivelAvancado.super.setVisible(false);//Torna a visibilidade do Frame JogoNivelAvançado como false
    }//GEN-LAST:event_SubMenuDeJogo_OpcoesActionPerformed

    private void SubMenuDeJogo_NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuDeJogo_NovoJogoActionPerformed
        JogoNivelAvancado newJogo3 = new JogoNivelAvancado();//Cria um objeto do tipo JogoNivelAvancado
        newJogo3.setVisible(true);//Torna a visibilidade no jogo nivel avançado true
        JogoNivelAvancado.super.setVisible(false);//Torna o JFrame JogoNivelAvancado com visibilidade false
    }//GEN-LAST:event_SubMenuDeJogo_NovoJogoActionPerformed

    private void SubMenuDeJogo_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuDeJogo_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SubMenuDeJogo_SairActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeMenu;
    private javax.swing.JLabel ImagemSurpresa;
    private javax.swing.JLabel LabelCartasViradas;
    private javax.swing.JLabel LabelPontos;
    private javax.swing.JLabel LabelPontuacao;
    private javax.swing.JLabel LabelQuantDeCartasViradas2;
    private javax.swing.JLabel MaxCartasPermitidas;
    private javax.swing.JLabel MaxPermitidoParaVirarCartas;
    private javax.swing.JMenu MenuJogo;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JMenuItem SubMenuDeJogo_NovoJogo;
    private javax.swing.JMenuItem SubMenuDeJogo_Opcoes;
    private javax.swing.JMenuItem SubMenuDeJogo_Sair;
    // End of variables declaration//GEN-END:variables
}
