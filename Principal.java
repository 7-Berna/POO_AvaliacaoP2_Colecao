import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        int op;
        do{
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "0 - Sair do programa\n" +
                        "1 - Adicionar um item a colecao\n" +
                        "2 - Exibir colecao de itens\n" +
                        "3 - Valor total da colecao\n"
            ));
            switch (op) {
                case 1:
                    int subOp = Integer.parseInt(
                        JOptionPane.showInputDialog(
                            "Escolha um tipo de item:\n" +
                            "1 - Moeda\n" +
                            "2 - Selo Regular\n" +
                            "3 - Selo Comemorativo\n"
                    ));
                    double valor;
                    String descricao;
                    Item item;
                    switch (subOp){
                        case 1:
                            valor = Double.parseDouble(
                                JOptionPane.showInputDialog(
                                        "Insira o valor da moeda: "
                                ));
                            item = new Moeda(valor);
                            items.add(item);
                            break;
                        case 2:
                            descricao = JOptionPane.showInputDialog(
                                    "Insira a descricao do selo regular: "
                            );
                            valor = Double.parseDouble(
                                    JOptionPane.showInputDialog(
                                            "Insira o valor do selo regular: "
                                    ));
                            item = new SeloRegular(descricao, valor);
                            items.add(item);
                            break;
                        case 3:
                            descricao = JOptionPane.showInputDialog(
                                    "Insira a descricao do selo comemorativo: "
                            );
                            valor = Double.parseDouble(
                                    JOptionPane.showInputDialog(
                                            "Insira o valor do selo comemorativo: "
                                    ));
                            item = new SeloComemorativo(descricao, valor);
                            items.add(item);
                            break;
                    }
                    break;
                case 2:
                    for (int j = 0; j < items.size(); j++) {
                        Item i = items.get(j);
                        i.exibir();
                    }
                    break;
                case 3:
                    double soma = 0;
                    for (int j = 0; j < items.size(); j++) {
                        soma += items.get(j).getValor();
                    }
                    JOptionPane.showMessageDialog(
                            null,
                            String.format("A soma dos valores da colecao eh: %.2f", soma));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Ate logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    break;
            }
        }while (op != 0);
    }
}
