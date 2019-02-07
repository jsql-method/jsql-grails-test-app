gradle bootJar
sleep 1
java -jar ./build/libs/jsql-grails-test-app.jar --spring.datasource.url=jdbc:postgresql://localhost:5432/plugins_test?ssl=false --spring.datasource.username=postgres --spring.datasource.password=pgMjk6F#18P,5