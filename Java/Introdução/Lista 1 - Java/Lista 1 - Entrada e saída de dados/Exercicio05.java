import javax.swing.JOptionPane;

public class Exercicio05{
    public static void main (String[] args){
        
      double horas=Double.parseDouble(JOptionPane.showInputDialog("Insira as horas"));
      double minutos=Double.parseDouble(JOptionPane.showInputDialog("Informe os minutos"));
      double segundos=Double.parseDouble(JOptionPane.showInputDialog("Insira os segundos"));
      
      double conversaoHoras=horas*3600;
      double conversaoMinutos=minutos*60;
      double somaTotal=(conversaoHoras+conversaoMinutos+segundos);

      JOptionPane.showMessageDialog(null,"Horário em segundos: "+somaTotal);
    }
}