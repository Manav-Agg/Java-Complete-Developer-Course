module com.manav.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.manav.scenebuilder to javafx.fxml;
    exports com.manav.scenebuilder;
}