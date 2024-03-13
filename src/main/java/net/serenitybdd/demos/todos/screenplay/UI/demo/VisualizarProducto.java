package net.serenitybdd.demos.todos.screenplay.UI.demo;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.util.List;
import java.util.function.Function;

public class VisualizarProducto {
    public final static Target ver_items = Target.the("ver Items").locatedBy((Function<SearchContext, List<WebElementFacade>>) By.id("cart-total"));

}
