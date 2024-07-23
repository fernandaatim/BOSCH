import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        
        String nomeVendedor=JOptionPane.showInputDialog("Informe o nome do vendedor:");
        String mes=JOptionPane.showInputDialog("Informe o mês:");
        int carrosVendidos=Integer.parseInt(JOptionPane.showInputDialog("Informe o número de carros vendidos"));
        double totalVendasLoja=Double.parseDouble(JOptionPane.showInputDialog("Total de vendas da loja:"));
        
        double comissao=carrosVendidos*350;
        double porcentagemVendasLoja=totalVendasLoja*0.0001;
        double valorTotal=comissao+(1500)+porcentagemVendasLoja;
        
        JOptionPane.showMessageDialog(null,"Mês: "+mes+
        "\n"+"Vendas da loja: R$"+totalVendasLoja+
        "\n"+"Vendedor: "+nomeVendedor+
        "\n"+"Participação vendas total: R$"+porcentagemVendasLoja+
        "\n"+"Valor da comissão: R$"+comissao+
        "\n"+"Valor final: R$"+valorTotal
        );
    }   
}
