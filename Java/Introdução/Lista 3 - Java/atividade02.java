import javax.swing.JOptionPane;

public class atividade02 {
    public static void main(String[] args) {
        
        int idade = 0;
        int peso = 0;
        double altura = 0;
        int contadorIdade = 0;
        int contadorAltura = 0;
        int contadorPeso = 0;
 
        for (int i = 1; i <=10; i++) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade "+i+"ª idade"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a idade "+i+"º altura")); 
            peso = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade "+i+"º peso"));
        if (idade>50){
            contadorIdade = contadorIdade + 1;
        if (altura > 1.60){
            contadorAltura = contadorAltura + 1;
        }
        if (peso > 80){
            contadorPeso = contadorPeso + 1;
        }
    }  
    }
        JOptionPane.showMessageDialog(null, "Há "+ contadorIdade + " pessoas com idade acima de 50; \n"+contadorAltura+ " com altura acima de 1.60m; \n"+contadorPeso+" com peso acima de 80kg.");
    }
}
