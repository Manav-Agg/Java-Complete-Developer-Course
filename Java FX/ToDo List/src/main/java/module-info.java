module com.example.todo_list {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.manav.todo_list to javafx.fxml;
    exports com.manav.todo_list;
}