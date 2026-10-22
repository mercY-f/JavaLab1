# Лабораторная работа №1: Таблица Умножения (JavaFX)

Десктопное приложение для тренировки таблицы умножения, написанное на Java и JavaFX.

## Стек технологий
- **Язык**: Java 21+ (проверено на JDK 25)
- **Фреймворк**: JavaFX 21 (`javafx-controls`, `javafx-fxml`)
- **Сборщик**: Maven (с встроенным `mvnw`)

## Структура проекта
```
d:\OOP Java\JavaLab1\
├── pom.xml
├── mvnw / mvnw.cmd
├── src/
│   └── main/
│       ├── java/
│       │   ├── module-info.java
│       │   └── io/jfxdevelop/multiplicationtable/
│       │       ├── HelloApplication.java
│       │       └── HelloController.java
│       └── resources/
│           └── io/jfxdevelop/multiplicationtable/
│               └── hello-view.fxml
└── .mvn/wrapper/
```

## Как запустить

### Способ 1: Через IntelliJ IDEA
1. Откройте IntelliJ IDEA.
2. Выберите **File -> Open...** и укажите папку `d:\OOP Java\JavaLab1`.
3. Дождитесь импорта Maven-зависимостей.
4. Откройте `src/main/java/io/jfxdevelop/multiplicationtable/HelloApplication.java` и нажмите зелёную стрелку **Run**.

### Способ 2: Через командную строку (Maven Wrapper)
В терминале в папке проекта:
```powershell
.\mvnw.cmd javafx:run
```
