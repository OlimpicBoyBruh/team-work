import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Client extends Application {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    @Override
    public void start(Stage primaryStage) throws Exception{
        logger.info("Начало инициализации окна приложения.");

        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Гидрометцентр");
        primaryStage.setScene(new Scene(root, 550, 400));
        primaryStage.show();

        logger.info("Окно приложения отображено.");
    }


    public static void main(String[] args) {

        logger.info("Запуск приложения...");
        launch(args);
    }


}

