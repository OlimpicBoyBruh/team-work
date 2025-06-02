import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Application {

    private static final Logger logger = LoggerFactory.getLogger(Server.class);

    @Override
    public void start(Stage primaryStage) throws Exception{
        logger.info("Начало старта GUI-интерфейса сервера Гидрометцентра.");

        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Гидрометцентр");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();

        logger.info("Интерфейс сервера успешно запущен.");
    }


    public static void main(String[] args) {

        logger.info("Запуск сервера Гидрометцентра...");
        launch(args);
    }
}