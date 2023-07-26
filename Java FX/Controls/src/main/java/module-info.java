module com.example.controls {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.controls to javafx.fxml;
    exports com.example.controls;
}