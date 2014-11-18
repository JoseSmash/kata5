/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
class MoneyDialog extends JPanel {

    public MoneyDialog() {
        super();
        add(createTextField());
        add(new CurrencyDialog());
    }

    private JTextField createTextField() {
        return new JTextField(10);
    }
    
}
