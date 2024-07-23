import javax.swing.JOptionPane;

public class exercicio01{
    public static void main (String [] args_){

    double idade=Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade"));
    String categoria="Categoria ";
    
    if (idade>0 && idade<14){
    categoria+="Criança";
    }

    if (idade>=15 && idade<=17){
    categoria+="Adolescente";
    }
    
    if(idade>=18 && idade <30){
        categoria+="Jovem Adulto";
    }

    if(idade>29){
    categoria+="Adulto";
    }
    JOptionPane.showMessageDialog(null,categoria);
    }
}