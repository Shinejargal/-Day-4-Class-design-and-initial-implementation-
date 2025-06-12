import javax.swing.*;
import java.awt.event.*;

public class CustomerForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Хэрэглэгч бүртгэх");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Нэр:");
        nameLabel.setBounds(10, 20, 100, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 20, 200, 25);
        frame.add(nameField);

        JLabel emailLabel = new JLabel("Имэйл:");
        emailLabel.setBounds(10, 60, 100, 25);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(120, 60, 200, 25);
        frame.add(emailField);

        JLabel phoneLabel = new JLabel("Утас:");
        phoneLabel.setBounds(10, 100, 100, 25);
        frame.add(phoneLabel);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(120, 100, 200, 25);
        frame.add(phoneField);

        JButton submit = new JButton("Бүртгэх");
        submit.setBounds(120, 150, 100, 30);
        frame.add(submit);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();

                Customer c = new Customer(name, email, phone);
                JOptionPane.showMessageDialog(frame, "✅ " + name + " амжилттай бүртгэгдлээ!");
            }
        });

        frame.setVisible(true);
    }
}
