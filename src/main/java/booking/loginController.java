package booking;

import javafx.event.ActionEvent;

import java.io.IOException;

public class loginController {
    public void switchSceneIfLoginSuccesful(ActionEvent event) throws IOException {
        Database db = new Database();

      /*  String loginEmail = emailLoginTextField.getText(); todo lav loginfunktion i database
        String loginPassword = passwordLoginTextField.getText();

        db.login(event, loginEmail, loginPassword);

       */
    }
    public void switchToNewUserView(ActionEvent event) {
    }
}
