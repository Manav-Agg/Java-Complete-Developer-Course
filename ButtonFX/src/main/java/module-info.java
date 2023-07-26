module com.example.buttonfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.manav.buttonfx to javafx.fxml;
    exports com.manav.buttonfx;
}