package net.serenitybdd.demos.todos.screenplay.UI.demo;
import net.serenitybdd.screenplay.targets.Target;

public class AggProductos {
    public static final Target macBook = Target.the("Agregar primer producto MacBook").locatedBy("//span[@class='hidden-xs hidden-sm hidden-md'][contains(.,'Add to Cart')])[1]");
    public static final Target ITEMS = Target.the("Agregar segundo producto iPhone").locatedBy("(//span[@class='hidden-xs hidden-sm hidden-md'][contains(.,'Add to Cart')])[2]");
    }