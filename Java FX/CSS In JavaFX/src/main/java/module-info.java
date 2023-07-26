module com.manav.cssinjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.manav.cssinjavafx to javafx.fxml;
    exports com.manav.cssinjavafx;
}