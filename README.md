# JSpring1
Проект состоит из трёх модулей:

    Сервер (Maven)
    Клиент (Gradle)
    Common (Maven)

Common реализует общие для сервера и клиента классы и компилируется в локальный репозиторий, откуда и подключается к серверу и клиенту.

Конфигурации клиента и сервера настроены на создание выполняемых JAR-файлов.

Для создания клиента можно использовать два варианта сборки:

    Из терминала IDEA: ./gradlew build
    Из консоли Windows: gradlew.bat build

Для создания сервера используется команда, mvn package.

Для сборки и размещения модуля Common в локальном репозитории можно выполнить mvn install.
