import javax.swing.*;

public class Moeda extends Item {

    public Moeda(double valor) {
        super(String.format("Moeda: R$ %.2f", valor), valor);
    }

    @Override
    public void exibir() {
        JOptionPane.showMessageDialog(null, getDescricao());
    }
}
