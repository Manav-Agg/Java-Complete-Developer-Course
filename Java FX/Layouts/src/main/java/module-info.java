module com.example.layoutsfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.layoutsfx to javafx.fxml;
    exports com.example.layoutsfx;
}