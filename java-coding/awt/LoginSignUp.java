import java.awt.*;
import java.awt.event.*;

public class LoginSignUp extends Frame implements ActionListener {
    Label emailLabel, usernameLabel, phoneNoLabel, passwordLabel, successLogin, thankYou;
    TextField email, username, phoneNo, password;
    Button login, signup, submitLogin, submitSignup, backToLogin, backToSignup;

    LoginSignUp() {

        successLogin = new Label("You Loged in! Successful... ");
        successLogin.setBounds(80, 200, 350, 30);
        successLogin.setFont(new Font("Arial", Font.PLAIN, 22));
        
        thankYou = new Label("Thank You for Signup..");
        thankYou.setBounds(80, 200, 350, 30);
        thankYou.setFont(new Font("Arial", Font.PLAIN, 22));

        usernameLabel = new Label("Username : ");
        usernameLabel.setBounds(120, 150, 80, 30);
        username = new TextField();
        username.setBounds(220, 150, 120, 30);

        passwordLabel = new Label("Password : ");
        passwordLabel.setBounds(120, 200, 80, 30);
        password = new TextField();
        password.setBounds(220, 200, 120, 30);
        password.setEchoChar('*');

        emailLabel = new Label("Email : ");
        emailLabel.setBounds(120, 250, 80, 30);
        email = new TextField();
        email.setBounds(220, 250, 120, 30);

        phoneNoLabel = new Label("Phone No : ");
        phoneNoLabel.setBounds(120, 300, 80, 30);
        phoneNo = new TextField();
        phoneNo.setBounds(220, 300, 120, 30);

        login = new Button("Login");
        login.setBounds(140, 100, 80, 30);
        add(login);
        login.setBackground(new Color(0, 0, 0));
        login.setForeground(new Color(255, 255, 255));
        login.setFont(new Font("Arial", Font.PLAIN, 16));

        signup = new Button("Signup");
        signup.setBounds(240, 100, 80, 30);
        add(signup);
        signup.setBackground(new Color(0, 0, 0));
        signup.setForeground(new Color(255, 255, 255));
        signup.setFont(new Font("Arial", Font.PLAIN, 16));

        submitLogin = new Button("Submit");
        submitLogin.setBounds(220, 250, 80, 30);

        submitSignup = new Button("Submit");
        submitSignup.setBounds(220, 350, 80, 30);

        backToLogin = new Button("Go to Login");
        backToLogin.setBounds(350, 400, 100, 30);

        backToSignup = new Button("Go to Signup");
        backToSignup.setBounds(350, 400, 100, 30);

        login.addActionListener(this);
        signup.addActionListener(this);
        backToLogin.addActionListener(this);
        backToSignup.addActionListener(this);
        submitLogin.addActionListener(this);
        submitSignup.addActionListener(this);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Login") {
            add(usernameLabel);
            add(passwordLabel);
            add(username);
            add(password);
            add(submitLogin);
            add(backToSignup);
            remove(signup);
            remove(submitSignup);
            remove(backToLogin);
        }
        if (e.getActionCommand() == "Signup") {
            add(usernameLabel);
            add(passwordLabel);
            add(emailLabel);
            add(phoneNoLabel);
            add(username);
            add(password);
            add(email);
            add(phoneNo);
            add(submitSignup);
            add(backToLogin);
            remove(login);
            remove(submitLogin);
            remove(backToSignup);
        }
        if (e.getActionCommand() == "Go to Login") {
            remove(emailLabel);
            remove(phoneNoLabel);
            remove(email);
            remove(phoneNo);
            remove(submitSignup);
            remove(signup);
            remove(backToLogin);
            add(submitLogin);
            add(backToSignup);
            add(login);
            username.setText("");
            password.setText("");
        }
        if (e.getActionCommand() == "Go to Signup") {
            add(emailLabel);
            add(phoneNoLabel);
            add(email);
            add(phoneNo);
            add(submitSignup);
            add(backToLogin);
            add(signup);
            remove(submitLogin);
            remove(backToSignup);
            remove(login);
            remove(successLogin);
            username.setText("");
            password.setText("");
            email.setText("");
            phoneNo.setText("");
        }
        if(e.getSource() == submitLogin){
            add(successLogin);
            remove(usernameLabel);
            remove(username);
            remove(passwordLabel);
            remove(password);
            remove(login);
            remove(submitLogin);
            remove(backToSignup);
            System.out.println(username.getText());
            System.out.println(password.getText());
        }
        if(e.getSource() == submitSignup){
            add(thankYou);
            remove(usernameLabel);
            remove(username);
            remove(passwordLabel);
            remove(password);
            remove(emailLabel);
            remove(email);
            remove(phoneNoLabel);
            remove(phoneNo);
            remove(signup);
            remove(submitSignup);
            remove(backToLogin);
            System.out.println(username.getText());
            System.out.println(password.getText());
            System.out.println(email.getText());
            System.out.println(phoneNo.getText());
            
        }
    }

    public static void main(String[] args) {
        LoginSignUp ref = new LoginSignUp();
    }
}
