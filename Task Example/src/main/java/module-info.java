module com.example.taskexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.manav.taskexample to javafx.fxml;
    exports com.manav.taskexample;
}