/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equivalenciaprogramas;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio
 */

public class Tela extends javax.swing.JFrame {

    /*VARIAVEIS GLOBAIS*/
    String matrizProgramaUM[][];
    String matrizProgramaDOIS[][];
    String matrizPasso1ProgramaUM[][];
    String matrizPasso1ProgramaDOIS[][];
    int numLinhasUM, numLinhasDOIS;
    int maiorNumColunasUM, maiorNumColunasDOIS;
    boolean precisaSimplificar;
    String matrizPassoDOISProgramaUM[][];
    String matrizPassoDOISProgramaDOIS[][];    
    
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAPrograma2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAPrograma1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtnFazTudo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAPasso1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAPasso2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTAPrograma2.setColumns(20);
        jTAPrograma2.setRows(5);
        jTAPrograma2.setText("SE T1 ENTAO VAPARA 2 SENAO VAPARA 1\nFACA N VAPARA 3\nFACA P VAPARA 4\nSE T2 ENTAO VAPARA 5 SENAO VAPARA 6\nFACA N VAPARA 1");
        jScrollPane1.setViewportView(jTAPrograma2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 330, 160));

        jTAPrograma1.setColumns(20);
        jTAPrograma1.setRows(5);
        jTAPrograma1.setText("SE T1 ENTAO VAPARA 2 SENAO VAPARA 1\nFACA F VAPARA 3\nFACA G VAPARA 4\nSE T2 ENTAO VAPARA 5 SENAO VAPARA 6\nFACA F VAPARA 1");
        jScrollPane2.setViewportView(jTAPrograma1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 29, 337, 160));

        jLabel1.setText("PASSO 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel2.setText("Programa 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jBtnFazTudo.setText("Testar");
        jBtnFazTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFazTudoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnFazTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jtAPasso1.setColumns(20);
        jtAPasso1.setRows(5);
        jScrollPane3.setViewportView(jtAPasso1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 330, 220));

        jLabel3.setText("Programa 1:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 11, -1, -1));

        jTAPasso2.setColumns(20);
        jTAPasso2.setRows(5);
        jScrollPane4.setViewportView(jTAPasso2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 330, 220));

        jLabel4.setText("PASSO 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnFazTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFazTudoActionPerformed
        inicializaMatrizesProgramas();        
        
        /*
        System.out.println("");
        System.out.println("PROGRAMA 1 ----------------------------------");
        
        for (int i = 0; i < numLinhasUM; i++) {
            for (int j = 0; j < maiorNumColunasUM; j++) {
                if (matrizProgramaUM[i][j] != null){                    
                    System.out.println("matriz["+i+"]["+j+"] = "+matrizProgramaUM[i][j]);                
                    System.out.println("");
                }
            }            
        }  
        
        System.out.println("");
        System.out.println("PROGRAMA 2 ----------------------------------");
        
        for (int i = 0; i < numLinhasDOIS; i++) {
            for (int j = 0; j < maiorNumColunasDOIS; j++) {
                if (matrizProgramaDOIS[i][j] != null){                    
                    System.out.println("matriz["+i+"]["+j+"] = "+matrizProgramaDOIS[i][j]);                
                    System.out.println("");
                }
            }            
        }        
        */
                
    }//GEN-LAST:event_jBtnFazTudoActionPerformed

    public void inicializaMatrizesProgramas(){
        /*INICIALIZANDO MATRIZ PARA PROGRAMA 1*/
        /*-------------------------------------------------------------------*/
        numLinhasUM = jTAPrograma1.getLineCount();
        String linhas[] = jTAPrograma1.getText().split("\\n");
        String colunas[];
        
        maiorNumColunasUM = -1;
        for (int i = 0; i < linhas.length; i++) {            
            colunas = linhas[i].split(" ");            
            
            if (colunas.length > maiorNumColunasUM){
                maiorNumColunasUM = colunas.length;                        
            }
        }
        
        matrizProgramaUM = new String[numLinhasUM][maiorNumColunasUM];  
                     
        for (int i = 0; i < linhas.length; i++) {            
            colunas = linhas[i].split(" ");
   
            for (int c = 0; c < colunas.length; c++) {                
                matrizProgramaUM[i][c] = colunas[c];                
            }
        }
        /*-------------------------------------------------------------------*/        
        
        /*INICIALIZANDO MATRIZ PARA PROGRAMA 2*/
        /*-------------------------------------------------------------------*/
        numLinhasDOIS = jTAPrograma2.getLineCount();
        linhas = jTAPrograma2.getText().split("\\n");
        
        maiorNumColunasDOIS = -1;
        for (int i = 0; i < linhas.length; i++) {            
            colunas = linhas[i].split(" ");            
            
            if (colunas.length > maiorNumColunasDOIS){
                maiorNumColunasDOIS = colunas.length;                        
            }
        }
        
        matrizProgramaDOIS = new String[numLinhasDOIS][maiorNumColunasDOIS];  
                     
        for (int i = 0; i < linhas.length; i++) {            
            colunas = linhas[i].split(" ");
   
            for (int c = 0; c < colunas.length; c++) {                
                matrizProgramaDOIS[i][c] = colunas[c];                
            }
        }
        /*-------------------------------------------------------------------*/        
        
        /*PASSO 1*/
        realizaPasso1();        
        
        /*PASSO 2*/
        realizaPasso2();
        
        /*PASSO 3*/
        if (precisaSimplificar)
          realizaPasso3();

        /*PASSO 4*/
        realizaPasso4();        
        
    }
    
    public void realizaPasso1(){
        /*Cristian fazer aqui o código do PASSO 1*/
        matrizPasso1ProgramaUM = new String[matrizProgramaUM.length][4];
        matrizPasso1ProgramaDOIS = new String[matrizProgramaDOIS.length][4];
                
        for (int i = 0; i < matrizProgramaUM.length; i++) {
            // caminho v
            preencheLinhaPasso1Caminho(i,"v",matrizProgramaUM,matrizPasso1ProgramaUM);
    //      preencheLinhaPasso1Caminho(i,"f",matrizProgramaUM,matrizPasso1ProgramaUM);  
        }
    /*    for (int i = 0; i < matrizProgramaDOIS.length; i++) {
            // caminho v
            preencheLinhaPasso1Caminho(i,"v",matrizProgramaDOIS,matrizPasso1ProgramaDOIS);
            preencheLinhaPasso1Caminho(i,"f",matrizProgramaDOIS,matrizPasso1ProgramaDOIS);  
        }
    */    
    }
    
    public void preencheLinhaPasso1Caminho(int linha, String tipo, String matriz[][], String matrizB[][]){
        int lAux = linha;
        int col = tipo.equals("v")?4:7;

        //Avança um
        if(!matriz[lAux][0].toLowerCase().equals("se")){
            lAux = Integer.parseInt(matriz[lAux][3])-1;
        }
        
        //enquanto continuar em testes, vai avançando
        while (lAux <= matriz.length && matriz[lAux][0].toLowerCase().equals("se")) {   
            lAux = Integer.parseInt(matriz[lAux][col])-1;
            //loop em testes
            if (lAux == linha){
                matrizB[linha][0] = "Ciclo";
                matrizB[linha][1] = "w";
            }
        }
        
        if(lAux >= matriz.length){
            matrizB[linha][0] = "Parada";
            matrizB[linha][1] = "&";
        }else{
            matrizB[linha][0] = matriz[lAux][1];
            if(matriz[linha][0].toLowerCase().equals("se")){
                matrizB[linha][1] = matriz[linha][col];
            }else{
                matrizB[linha][1] = matriz[linha][3];
            }
        }
    }

    
    public void realizaPasso2(){                
        /* SIMULAÇÃO
        Entrada vinda do passo 1:
        /*    0      1     2      3
        0 | F     | 2 | ciclo  | w | 
        1 | G     | 3 | G      | 3 |
        2 | F     | 4 | parada | & | <--- linhaParadaProgramaUM
        3 | F     | 2 | ciclo  | w |
        4 | ciclo | w | ciclo  | w |

        Passo 2 resolvido:
        A0 = {&}
        A1 = {&,3}
        A2 = {&,3,2}
        A3 = {&,3,2,1,4}
        A4 = A3        
        */         
        
        String matrizPassoUMProgramaUM[][] = new String[5][4];
        matrizPassoUMProgramaUM[0][0] = "F";
        matrizPassoUMProgramaUM[0][1] = "2";
        matrizPassoUMProgramaUM[0][2] = "ciclo";
        matrizPassoUMProgramaUM[0][3] = "w";
 
        matrizPassoUMProgramaUM[1][0] = "G";
        matrizPassoUMProgramaUM[1][1] = "3";
        matrizPassoUMProgramaUM[1][2] = "G";
        matrizPassoUMProgramaUM[1][3] = "3";

        matrizPassoUMProgramaUM[2][0] = "F";
        matrizPassoUMProgramaUM[2][1] = "4";
        matrizPassoUMProgramaUM[2][2] = "parada";
        matrizPassoUMProgramaUM[2][3] = "&";

        matrizPassoUMProgramaUM[3][0] = "F";
        matrizPassoUMProgramaUM[3][1] = "2";
        matrizPassoUMProgramaUM[3][2] = "ciclo";
        matrizPassoUMProgramaUM[3][3] = "w";

        matrizPassoUMProgramaUM[4][0] = "ciclo";
        matrizPassoUMProgramaUM[4][1] = "w";
        matrizPassoUMProgramaUM[4][2] = "ciclo";
        matrizPassoUMProgramaUM[4][3] = "w";
        
        precisaSimplificar = false;
        //int linhaParadaProgramaUM = retornaUltimaLinhaParada(matrizPassoUMProgramaUM); //não implementado ainda
        int linhaParadaProgramaUM = 2;
        
        if (linhaParadaProgramaUM == -1){
            JOptionPane.showMessageDialog(rootPane, "O programa 1 não possui Rótulo de parada");
        }
        else{
            //matrizPassoDOISProgramaUM =  new String[numLinhasUM+2][2]; //+2 para as linhas extras: A0 e An=An-1        
            matrizPassoDOISProgramaUM =  new String[5+2][2]; //+2 para as linhas extras: A0 e An=An-1        
            String linhasUsadas=""; //vai concatenar as linhas que farão parte da resposta do passo 2, já em ordem
            String linhasIguais; //vai armazenar as linhas que são iguais entre si            
            
            //**OBS** onde tiver j+1 ou i+i é por conta de a linha do java começar em 0 e os rótulos dos programas em 1
            
            //percorre da última linha de parada até a linha do primeiro rotulo
            for (int i = linhaParadaProgramaUM; i >= 0; i--) {  
                
                //linhasUsadas = "";
                linhasIguais = "";
                //para cada linha do for acima, percorre desde a linhaParadaProgramaUM-1 até linha 0 (rotulo 0)
                for (int j = linhaParadaProgramaUM-1; j >= 0; j--) {                
                    
                    if(! linhasUsadas.contains(String.valueOf(j+1))){ //somente caso não tenha sido usada ainda
                        //comparar se existe alguma linha com conteúdo igual
                        if (matrizPassoUMProgramaUM[i][0].equals(matrizPassoUMProgramaUM[j][0]) &&
                            matrizPassoUMProgramaUM[i][1].equals(matrizPassoUMProgramaUM[j][1]) &&
                            matrizPassoUMProgramaUM[i][2].equals(matrizPassoUMProgramaUM[j][2]) &&
                            matrizPassoUMProgramaUM[i][3].equals(matrizPassoUMProgramaUM[j][3])){

                            //salva esta linha
                            if (linhasIguais.equals("")){ //primeira linha igual / só uma linha igual
                                linhasIguais = String.valueOf(j+1); 
                            }
                            else{ //caso tenha mais linhas iguais
                                linhasIguais = linhasIguais + "," + String.valueOf(j+1); //concatenando separado por virgula
                            }                    
                        }
                    }                
                }

                //para cada linha do for acima, percorre desde a última linha da matriz até antes da linhaParadaProgramaUM
                //cobrindo assim o restante das linhas que ficaram de fora
                for (int j = matrizPassoUMProgramaUM.length-1; j > linhaParadaProgramaUM; j--) {                
                    //comparar se existe alguma linha com conteúdo igual
                    if(! linhasUsadas.contains(String.valueOf(j+1))){ //somente caso não tenha sido usada ainda
                        if (matrizPassoUMProgramaUM[i][0].equals(matrizPassoUMProgramaUM[j][0]) &&
                            matrizPassoUMProgramaUM[i][1].equals(matrizPassoUMProgramaUM[j][1]) &&
                            matrizPassoUMProgramaUM[i][2].equals(matrizPassoUMProgramaUM[j][2]) &&
                            matrizPassoUMProgramaUM[i][3].equals(matrizPassoUMProgramaUM[j][3])){

                            //salva esta linha
                            if (linhasIguais.equals("")){ //primeira linha igual / só uma linha igual
                                linhasIguais = String.valueOf(j+1); 
                            }
                            else{ //caso tenha mais linhas iguais
                                linhasIguais = linhasIguais + "," + String.valueOf(j+1); //concatenando separado por virgula
                            }                    
                        }  
                    }
                }    

                //atualizando variavel que guarda as linhas que montarão a saída do passo 2
                if (linhasIguais.equals("")){ //caso não haja linhas iguais, utiliza a própria linha                                                
                    if (linhasUsadas.equals("")){
                        linhasUsadas = String.valueOf(i+1); 
                    }
                    else{
                        linhasUsadas = linhasUsadas + "," + String.valueOf(i+1); //concatenando separado por virgula
                    }                 
                }
                else{ //senão, usa as linhasIguais encontradas
                    if (linhasUsadas.equals("")){
                        linhasUsadas = linhasIguais; 
                    }
                    else{
                        linhasUsadas = linhasUsadas + "," + linhasIguais; //concatenando separado por virgula
                    }                  
                }
                
                System.out.println("Rótulos Usados = "+linhasUsadas);                
                matrizPassoDOISProgramaUM[i][1] = linhasUsadas;
            }            
        }
        
        /*MOSTRANDO RESULTADO*/
        int contador=0;
        System.out.println("PASSO 2 RESULTADO PROGRAMA 1 -----------------------");
        jTAPasso2.append("Programa 1\n");
        for (int i = 5-1; i >= 0; i--) {            
            if (matrizPassoDOISProgramaUM[i][1] != null){                    
                //System.out.print("A"+contador+" = {&,"+matrizPassoDOISProgramaUM[i][1]+"}");                
                //System.out.println("");
                jTAPasso2.append("A"+contador+" = {&,"+matrizPassoDOISProgramaUM[i][1]+"}\n");                
                contador++;
            }    
        } 
        //System.out.println("A"+contador+" = A"+String.valueOf(contador-1));
        jTAPasso2.append("A"+contador+" = A"+String.valueOf(contador-1));
        
        /*DUPLICAR TUDO PARA O PROGRAMA 2*/
        String matrizPassoUMProgramaDOIS[][] = new String[5][4];
        matrizPassoUMProgramaDOIS[0][0] = "N";
        matrizPassoUMProgramaDOIS[0][1] = "2";
        matrizPassoUMProgramaDOIS[0][2] = "ciclo";
        matrizPassoUMProgramaDOIS[0][3] = "w";
 
        matrizPassoUMProgramaDOIS[1][0] = "P";
        matrizPassoUMProgramaDOIS[1][1] = "3";
        matrizPassoUMProgramaDOIS[1][2] = "P";
        matrizPassoUMProgramaDOIS[1][3] = "3";

        matrizPassoUMProgramaDOIS[2][0] = "N";
        matrizPassoUMProgramaDOIS[2][1] = "4";
        matrizPassoUMProgramaDOIS[2][2] = "parada";
        matrizPassoUMProgramaDOIS[2][3] = "&";

        matrizPassoUMProgramaDOIS[3][0] = "N";
        matrizPassoUMProgramaDOIS[3][1] = "2";
        matrizPassoUMProgramaDOIS[3][2] = "ciclo";
        matrizPassoUMProgramaDOIS[3][3] = "w";

        matrizPassoUMProgramaDOIS[4][0] = "ciclo";
        matrizPassoUMProgramaDOIS[4][1] = "w";
        matrizPassoUMProgramaDOIS[4][2] = "ciclo";
        matrizPassoUMProgramaDOIS[4][3] = "w";
        
        precisaSimplificar = false;
        //int linhaParadaProgramaUM = retornaUltimaLinhaParada(matrizPassoUMProgramaDOIS); //não implementado ainda
        int linhaParadaProgramaDOIS = 2;
        
        if (linhaParadaProgramaDOIS == -1){
            JOptionPane.showMessageDialog(rootPane, "O programa 2 não possui Rótulo de parada");
        }
        else{
            //matrizPassoDOISProgramaDOIS =  new String[numLinhasUM+2][2]; //+2 para as linhas extras: A0 e An=An-1        
            matrizPassoDOISProgramaDOIS =  new String[5+2][2]; //+2 para as linhas extras: A0 e An=An-1        
            String linhasUsadas=""; //vai concatenar as linhas que farão parte da resposta do passo 2, já em ordem
            String linhasIguais; //vai armazenar as linhas que são iguais entre si            
            
            //**OBS** onde tiver j+1 ou i+i é por conta de a linha do java começar em 0 e os rótulos dos programas em 1
            
            //percorre da última linha de parada até a linha do primeiro rotulo
            for (int i = linhaParadaProgramaDOIS; i >= 0; i--) {  
                
                //linhasUsadas = "";
                linhasIguais = "";
                //para cada linha do for acima, percorre desde a linhaParadaProgramaUM-1 até linha 0 (rotulo 0)
                for (int j = linhaParadaProgramaDOIS-1; j >= 0; j--) {                
                    
                    if(! linhasUsadas.contains(String.valueOf(j+1))){ //somente caso não tenha sido usada ainda
                        //comparar se existe alguma linha com conteúdo igual
                        if (matrizPassoUMProgramaDOIS[i][0].equals(matrizPassoUMProgramaDOIS[j][0]) &&
                            matrizPassoUMProgramaDOIS[i][1].equals(matrizPassoUMProgramaDOIS[j][1]) &&
                            matrizPassoUMProgramaDOIS[i][2].equals(matrizPassoUMProgramaDOIS[j][2]) &&
                            matrizPassoUMProgramaDOIS[i][3].equals(matrizPassoUMProgramaDOIS[j][3])){

                            //salva esta linha
                            if (linhasIguais.equals("")){ //primeira linha igual / só uma linha igual
                                linhasIguais = String.valueOf(j+1); 
                            }
                            else{ //caso tenha mais linhas iguais
                                linhasIguais = linhasIguais + "," + String.valueOf(j+1); //concatenando separado por virgula
                            }                    
                        }
                    }                
                }

                //para cada linha do for acima, percorre desde a última linha da matriz até antes da linhaParadaProgramaUM
                //cobrindo assim o restante das linhas que ficaram de fora
                for (int j = matrizPassoUMProgramaDOIS.length-1; j > linhaParadaProgramaDOIS; j--) {                
                    //comparar se existe alguma linha com conteúdo igual
                    if(! linhasUsadas.contains(String.valueOf(j+1))){ //somente caso não tenha sido usada ainda
                        if (matrizPassoUMProgramaDOIS[i][0].equals(matrizPassoUMProgramaDOIS[j][0]) &&
                            matrizPassoUMProgramaDOIS[i][1].equals(matrizPassoUMProgramaDOIS[j][1]) &&
                            matrizPassoUMProgramaDOIS[i][2].equals(matrizPassoUMProgramaDOIS[j][2]) &&
                            matrizPassoUMProgramaDOIS[i][3].equals(matrizPassoUMProgramaDOIS[j][3])){

                            //salva esta linha
                            if (linhasIguais.equals("")){ //primeira linha igual / só uma linha igual
                                linhasIguais = String.valueOf(j+1); 
                            }
                            else{ //caso tenha mais linhas iguais
                                linhasIguais = linhasIguais + "," + String.valueOf(j+1); //concatenando separado por virgula
                            }                    
                        }  
                    }
                }    

                //atualizando variavel que guarda as linhas que montarão a saída do passo 2
                if (linhasIguais.equals("")){ //caso não haja linhas iguais, utiliza a própria linha                                                
                    if (linhasUsadas.equals("")){
                        linhasUsadas = String.valueOf(i+1); 
                    }
                    else{
                        linhasUsadas = linhasUsadas + "," + String.valueOf(i+1); //concatenando separado por virgula
                    }                 
                }
                else{ //senão, usa as linhasIguais encontradas
                    if (linhasUsadas.equals("")){
                        linhasUsadas = linhasIguais; 
                    }
                    else{
                        linhasUsadas = linhasUsadas + "," + linhasIguais; //concatenando separado por virgula
                    }                  
                }
                
                System.out.println("Rótulos Usados = "+linhasUsadas);                
                matrizPassoDOISProgramaDOIS[i][1] = linhasUsadas;
            }            
        }
        
        /*MOSTRANDO RESULTADO*/
        contador=0;
        System.out.println("PASSO 2 RESULTADO PROGRAMA 1 -----------------------");
        jTAPasso2.append("\n\nPrograma 2\n");
        for (int i = 5-1; i >= 0; i--) {            
            if (matrizPassoDOISProgramaDOIS[i][1] != null){                    
                //System.out.print("A"+contador+" = {&,"+matrizPassoDOISProgramaDOIS[i][1]+"}");                
                //System.out.println("");
                jTAPasso2.append("A"+contador+" = {&,"+matrizPassoDOISProgramaDOIS[i][1]+"}\n");                
                contador++;
            }    
        } 
        //System.out.println("A"+contador+" = A"+String.valueOf(contador-1));
        jTAPasso2.append("A"+contador+" = A"+String.valueOf(contador-1));        
        
        /*TESTAR SE PRECISA FAZER PASSO 3 - SIMPLIFICAÇÃO*/
    }
    
    public void realizaPasso3(){
        /*fazer aqui o código do PASSO 3*/
    }    
    
    public void realizaPasso4(){
        /*fazer aqui o código do PASSO 4*/
    }        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnFazTudo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTAPasso2;
    private javax.swing.JTextArea jTAPrograma1;
    private javax.swing.JTextArea jTAPrograma2;
    private javax.swing.JTextArea jtAPasso1;
    // End of variables declaration//GEN-END:variables
}
