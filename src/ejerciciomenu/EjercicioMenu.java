package ejerciciomenu;

import javax.swing.JOptionPane;

public class EjercicioMenu {

    public static void main(String[] args) 
    {
        operaciones operar = new operaciones();
        int opcion = 0;
        int men=0;
 
   
            try{ 
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                    + "\n 1. Mostrar Operaciones basicas"
                    + "\n 2. Salir"));
            }catch(Exception ex ){
                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
            }
                           
               switch(opcion){
                case 1:
                    
                    int a=0,b=0;
                    int validar = 0;
                    do {
                        try{ 
                        a= Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer valor"));
                        validar =1;
                       }catch(Exception ex ){
                           validar = 0;
                            JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
                        }
                    }while(validar==0);
              do {
                        try{ 
                    b= Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer valor"));
                       validar =1;  
                       }catch(Exception ex ){
                           validar = 0;
                            JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
                        }
                    }while(validar==0);
                    do {
                        try{                                        
                    JOptionPane.showMessageDialog(null, "Operaciones basicas");
                    men= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                    + "\n 1. Mostrar Suma"
                    + "\n 2. Mostrar Resta"
                    + "\n 3. Mostrar Multiplicacion"
                    + "\n 4. Mostrar Division"        
                    + "\n 5. Volver "));
                     }catch(Exception ex ){
                JOptionPane.showMessageDialog(null,"Ingrese un valor numerico");
            }
                     
                    switch(men){
                        case 1:
                           JOptionPane.showMessageDialog(null,"El resultado de la suma es "+operar.sumar(a,b));
                    break;
                        case 2:
                           JOptionPane.showMessageDialog(null,"El resultado de la resta es "+operar.restar(a,b));
                    break;
                     case 3:
                            JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es "+operar.multiplicar(a,b));
                    break;
                     case 4:
                            JOptionPane.showMessageDialog(null,"El resultado de la division es "+operar.dividir(a,b));
                    break;
                    
                     case 5:
                          JOptionPane.showMessageDialog(null, "Volver");
                    break;
                    }
                    
                    }while(men!=5);
                    break;
          }
    }
