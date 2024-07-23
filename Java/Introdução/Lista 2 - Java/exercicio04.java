import javax.swing.JOptionPane;

public class exercicio04{
    public static void main (String [] args_){

    int opcaoLocal=Integer.parseInt(JOptionPane.showInputDialog("Qual o local das férias?\n[1]Maceió\n[2]Porto de Galinhas"));
    int opcaoComida=Integer.parseInt(JOptionPane.showInputDialog("Com almoço/janta incluso?\n[1]Sim\n[2]Não"));
    String valorEstadia="O valor final da estadia será R$";
    
    switch (opcaoLocal) {
        case 1:
            switch (opcaoComida){
            case 1:
            valorEstadia+=3000+(3000);
            break;  
            case 2:
            valorEstadia+=3000+(0.85*3000); 
        }
            break;

        case 2:
            switch (opcaoComida){
            case 1:    
            valorEstadia+=3000+(0.60*3000);
            break;
            case 2:
            valorEstadia+=3000+(0.45*3000);
            }
            break;

        }
        JOptionPane.showMessageDialog(null, valorEstadia);
    }
}