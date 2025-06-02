import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Locale locale = new Locale("ru", "RU");
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample.fxml"));
        loader.setResources(bundle);

        Parent root = loader.load();

        primaryStage.setTitle(bundle.getString("app.title"));
        primaryStage.setScene(new Scene(root, 550, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
