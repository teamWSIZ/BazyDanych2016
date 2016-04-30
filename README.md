# BazyDanych2016

Projekt do kursu "Bazy Danych" WSIZ w semestrze letnim 2016


Główne pliki konfiguracyjne:

Konfiguracja połączenia z bazą danych:
/src/main/resources/META-INF/persistence.xml

Konfiguracja środowiska spring (Java EE, Bean-y):
/src/main/resources/offline-config.xml

Konfiguracja projektu (w tym używanych bibliotek):
pom.xml


Uwaga, projekt korzysta z rozwiązania "Lombok" (annotacja @Data dodaje settery, gettery,
konstruktor, metodę toString, equals i hashCode). Aby była właściwie pokazywana
w IntelliJ należy doinstalować plugin do Lomboka (Settings>Plugins>BrowseRepositories>Lombok).


### Uwaga:
- Projekt zawiera również REST-owy kontroler; całość można zbudować będąc w główym folderze i wydając polecenie
  `mvn clean package`; pojawia się wtedy `target/BD.war` (`mvn` to polecenie mavena; jeśli nie jest dostępne, należy mavena
   zainstalować.)
- `BD.war` można uruchomić na serwerze aplikacyjnym (tomcat/wildfly) lub bezpośrednio przy pomocy jetty,
   w tym celu można wykorzystać zawarty tu jetty-runner.jar, i wydać polecenie `java -jar jetty-runner.jar --port 8081 target/BD.war`

