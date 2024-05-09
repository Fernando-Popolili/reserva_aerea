
package Model;

import View.InicioConsulta_GUI;
import View.voo2565_GUI;
import javax.swing.JOptionPane;

public class Funcoes2_DAO {

    public static String x="";
    public static int resp = 0;
    public static String reservarAssento= "X";
    
    
    public static void consulta(){
        
       try{
           
            x = View.InicioConsulta_GUI.resp_consulta.getText();
            resp = Integer.parseInt(x);

            if (resp == 2565){
                
                new voo2565_GUI().setVisible(true);
                    
            }else if(resp == 3676){
                JOptionPane.showMessageDialog(null, "RESERVAS2");

            }else{
                JOptionPane.showMessageDialog(null, "CODIGO NÃO ENCONTRADO");
            }
            
            
       }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
        } 
        
    }
    
     public static void reservar_1(){
        
       try{
           
            x = View.voo2565_GUI.resp_voo1.getText();
            resp = Integer.parseInt(x);

            if (resp == 1){
               if (View.voo2565_GUI.recebe_1.getText().isEmpty()){
                   View.voo2565_GUI.recebe_1.setText(reservarAssento);
               }else {
                   JOptionPane.showMessageDialog(null, "Este assento está ocupado, tente novamente");
                           
               }

            }
            
            
       }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
        } 
        
    }
}
