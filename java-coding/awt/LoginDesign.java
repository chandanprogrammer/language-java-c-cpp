import java.awt.*;

public class LoginDesign extends Frame {
    LoginDesign() {
        Label userIdLabel = new Label("User Id : ", Label.LEFT);
        userIdLabel.setBounds(100, 150, 80, 30);
        add(userIdLabel);

        TextField userId = new TextField();
        userId.setBounds(200, 150, 150, 30);
        add(userId);

        Label passwordLabel = new Label("Password : ", Label.LEFT);
        passwordLabel.setBounds(100, 200, 80, 30);
        add(passwordLabel);

        TextField password = new TextField();
        password.setBounds(200, 200, 150, 30);
        add(password);
        password.setEchoChar('*');

        Button loginBtn = new Button("Login");
        loginBtn.setBounds(210, 240, 80, 30);
        add(loginBtn);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        LoginDesign ref = new LoginDesign();
    }
}
