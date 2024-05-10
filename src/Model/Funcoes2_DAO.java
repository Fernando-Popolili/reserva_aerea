
package Model;


import static Model.Funcoes2_DAO.resp;
import View.InicioConsulta_GUI;
import View.voo2565_GUI;
import View.voo3676_GUI;

import javax.swing.JOptionPane;

public class Funcoes2_DAO {

    public static String x="";
    public static int resp = 0;
    
    
    
    public static String[] assentosvoo1 = {"1[   ]", "2[   ]", "3[   ]", "4[   ]", "5[   ]", "6[   ]"};
    public static String[] assentosvoo2 = {"1[   ]", "2[   ]", "3[   ]", "4[   ]", "5[   ]", "6[   ]"};
   
    
    public static void consulta(){
        
       try{
           
            x = View.InicioConsulta_GUI.resp_consulta.getText();
            resp = Integer.parseInt(x);

            if (resp == 2565){
                
                new voo2565_GUI().setVisible(true);
                    
            }else if(resp == 3676){
                new voo3676_GUI().setVisible(true);

            }else{
                JOptionPane.showMessageDialog(null, "CODIGO NÃO ENCONTRADO");
            }
            
            
       }catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
            
        } 
        
    }
    
    public static void reserva_1(String x){
        
        

        if(assentosvoo1[0].equals("1[ x ]") && assentosvoo1[1].equals("2[ x ]") && assentosvoo1[2].equals("3[ x ]") && assentosvoo1[3].equals("4[ x ]") && assentosvoo1[4].equals("5[ x ]") && assentosvoo1[5].equals("6[ x ]")){
            
            JOptionPane.showMessageDialog(null, "Voo está lotado");
            new InicioConsulta_GUI().setVisible(true);
            
            
        }else{
        
            resp = Integer.parseInt(x);       
        
         
                //ASSENTO N°1 DO VOO 2565
                if (resp == 1){
                    if (assentosvoo1[0] == "1[   ]"){
                        assentosvoo1[0] = "1[ x ]";
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        new InicioConsulta_GUI().setVisible(true);
                    }else if (assentosvoo1[0] == "1[ x ]" ) {
                        JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                    }

                    }


                //ASSENTO N°2 DO VOO 2565
                else if(resp == 2){

                    if (assentosvoo1[1] == "2[   ]"){
                        assentosvoo1[1] = "2[ x ]";
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        new InicioConsulta_GUI().setVisible(true);
                    }else if (assentosvoo1[1] == "2[ x ]" ) {
                        JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                    }

                   }
                //ASSENTO N°3 DO VOO 2565
                else if(resp == 3){

                    if (assentosvoo1[2] == "3[   ]"){
                        assentosvoo1[2] = "3[ x ]";
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        new InicioConsulta_GUI().setVisible(true);
                    }else if (assentosvoo1[2] == "3[ x ]" ) {
                        JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                    }

                   }
                
                //ASSENTO N°4 DO VOO 2565
                else if(resp == 4){

                    if (assentosvoo1[3] == "4[   ]"){
                        assentosvoo1[3] = "4[ x ]";
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        new InicioConsulta_GUI().setVisible(true);
                    }else if (assentosvoo1[3] == "4[ x ]" ) {
                        JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                    }

                   }

                
                //ASSENTO N°5 DO VOO 2565
                else if(resp == 5){

                    if (assentosvoo1[4] == "5[   ]"){
                        assentosvoo1[4] = "5[ x ]";
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        new InicioConsulta_GUI().setVisible(true);
                    }else if (assentosvoo1[4] == "5[ x ]" ) {
                        JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                    }

                   }
                
                //ASSENTO N°6 DO VOO 2565
                else if(resp == 6){

                    if (assentosvoo1[5] == "6[   ]"){
                        assentosvoo1[5] = "6[ x ]";
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                        new InicioConsulta_GUI().setVisible(true);
                    }else if (assentosvoo1[5] == "6[ x ]" ) {
                        JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                    }

                   }
                
        }
        
    }
    
    public static void reserva_2(String x){
        
        if(assentosvoo1[0].equals("1[ x ]") && assentosvoo1[1].equals("2[ x ]") && assentosvoo1[2].equals("3[ x ]") && assentosvoo1[3].equals("4[ x ]") && assentosvoo1[4].equals("5[ x ]") && assentosvoo1[5].equals("6[ x ]")){
            
            JOptionPane.showMessageDialog(null, "Voo está lotado");
            new InicioConsulta_GUI().setVisible(true);
            
            
        }else{
            resp = Integer.parseInt(x);       
        
        
            //ASSENTO N°1 DO VOO 3676
            if (resp == 1){
                if (assentosvoo2[0] == "1[   ]"){
                    assentosvoo2[0] = "1[ x ]";
                    JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    new InicioConsulta_GUI().setVisible(true);
                }else if (assentosvoo2[0] == "1[ x ]" ) {
                    JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                }

                }


            //ASSENTO N°2 DO VOO 3676
            else if(resp == 2){

                if (assentosvoo2[1] == "2[   ]"){
                    assentosvoo2[1] = "2[ x ]";
                    JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    new InicioConsulta_GUI().setVisible(true);
                }else if (assentosvoo2[1] == "2[ x ]" ) {
                    JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                }

               }
            //ASSENTO N°3 DO VOO 3676
            else if(resp == 3){

                if (assentosvoo2[2] == "3[   ]"){
                    assentosvoo2[2] = "3[ x ]";
                    JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    new InicioConsulta_GUI().setVisible(true);
                }else if (assentosvoo2[2] == "3[ x ]" ) {
                    JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                }

               }
            //ASSENTO N°4 DO VOO 3676

            else if(resp == 4){

                if (assentosvoo2[3] == "4[   ]"){
                    assentosvoo2[3] = "4[ x ]";
                    JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    new InicioConsulta_GUI().setVisible(true);
                }else if (assentosvoo2[3] == "4[ x ]" ) {
                    JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                }

               }

            //ASSENTO N°5 DO VOO 3676
            else if(resp == 5){

                if (assentosvoo2[4] == "5[   ]"){
                    assentosvoo2[4] = "5[ x ]";
                    JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    new InicioConsulta_GUI().setVisible(true);
                }else if (assentosvoo2[4] == "5[ x ]" ) {
                    JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                }

               }
            //ASSENTO N°6 DO VOO 3676
            else if(resp == 6){

                if (assentosvoo2[5] == "6[   ]"){
                    assentosvoo2[5] = "6[ x ]";
                    JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    new InicioConsulta_GUI().setVisible(true);
                }else if (assentosvoo2[5] == "6[ x ]" ) {
                    JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                }

               }

    }
}
        }
            
        
        
        
        
        
        
        
        
        
    
    
     

