# Client-Server Application with Maven

This is a client-server application built using JavaFX and Maven. The project is structured as a multi-module Maven project with the following components:

## Project Structure

- **Module**: Common library shared between client and server
- **Server**: Server application with JavaFX UI
- **Client**: Client application with JavaFX UI

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, run the following command in the project root directory:

```
mvn clean package
```

This will compile the source code, run tests, and create JAR files for each module.

## Running the Applications

### Running with Maven

#### Server
```
cd Server
mvn javafx:run
```

#### Client
```
cd Client
mvn javafx:run
```

### Running the JAR Files

#### Server
```
java -jar Server/target/Server-1.0-SNAPSHOT-jar-with-dependencies.jar
```

#### Client
```
java -jar Client/target/Client-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Development

This project follows the standard Maven directory structure:

- `src/main/java`: Java source code
- `src/main/resources`: Resources (FXML, images, etc.)
- `src/test/java`: Test source code
- `src/test/resources`: Test resources

## Packages

- `com.clientserver.common`: Common classes shared between client and server
- `com.clientserver.server`: Server application classes
- `com.clientserver.client`: Client application classes

# ClientServer
Сервер метеонаблюдения предназначен для сбора данных о температуре воздуха в разных населенных пунктах.
  Клиенты передают значения температуры в своем населенном пункте Серверу, могут запросить с Сервера температуру по названию города.
![Image alt](../img/Screenshot_3.png)
### Используемые методы и технологии программирования
  1. Клиент-серверная архитекутра с простым протоколом.
### Паттерны 

### Инструменты
  1. Использование Map для хранения неповторяющихся данных на Сервере.
  
## Приглашение к сотрудничеству
Загрузите исходные тексты или клонируйте их с помощью команды git clone в выбранный каталог: git clone [https://github.com/RinaKoner128/ClientServer.git](https://github.com/RinaKoner128/ClientServer.git) и создайте ветку