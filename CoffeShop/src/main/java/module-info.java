module coffeeShopManagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    //requires de.jensd.fx.glyphs.fontawesome;


    opens coffeeShopManagement to javafx.fxml;


    exports coffeeShopManagement;
}
