module com.manav.contact_application {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml;

    opens com.manav.contact_application to javafx.fxml;
    exports com.manav.contact_application;
    exports com.manav.data_Model;
    opens com.manav.data_Model to javafx.fxml;
}