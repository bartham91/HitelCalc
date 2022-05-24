module com.example.hitelcalc {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires org.jdbi.v3.sqlobject;
    requires org.jdbi.v3.core;
    requires jakarta.xml.bind;

    opens com.example.hitelcalc to javafx.fxml;

    exports com.example.hitelcalc;
}