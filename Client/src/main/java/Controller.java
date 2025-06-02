

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.clientserver.common.ClServ;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class); // Логгер класса

    public ImageView im;
    public TextField fsity;
    public Label name;
    public Label temp;
    public String sity;
    public String response;
    public String request;
    public String IP;
    public String ip;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        logger.info("Инициализация интерфейса.");

        im.setImage(new Image("image.png"));
        getIP();

        logger.debug("Полученный IP: {}", ip);

        name.setText(request);
        temp.setText(response);
    }

    public void clOk(ActionEvent actionEvent) {

        sity = fsity.getText().trim();;

        if(sity.isEmpty()) { // Проверка поля ввода города
            logger.warn("Город не указан!");
          showWarning("Введите название города.");

            return;
        }

        init();
        name.setText(request);
        temp.setText(response);
    }

    public void init() {
        try (ClServ module = new ClServ(IP, 2654)) {

            logger.info("Подключение к серверу успешно установлено.");

            System.out.println("Connected to server");
            request = sity;
            module.writeLine(request);
            request = module.readerLine();
            response = module.readerLine();

            logger.info("Запрос обработан. Ответ сервера: {}", response);

            System.out.println("" + response);

        } catch (IOException e) {
            e.printStackTrace();
            logger.error("Ошибка при обмене данными с сервером.", e);
        }
    }

    public String getIP() {
        InetAddress myIP = null;
        try {
            myIP = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println(" ошибка доступа ->" + e);
            logger.error("Ошибка получения локального IP адреса.", e);
        }
        IP =  myIP.getHostAddress();
        return IP;
    }
    
    private void showWarning(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Ошибка ввода");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
