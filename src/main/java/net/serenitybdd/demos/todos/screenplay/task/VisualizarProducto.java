package net.serenitybdd.demos.todos.screenplay.task;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.demos.todos.screenplay.UI.demo.VisualizarProducto.ver_items;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VisualizarProducto implements Task {

    private final String description;

    public VisualizarProducto(String description) {
        this.description = description;
    }

    public static VisualizarProducto toCart(String description) {
        return instrumented(VisualizarProducto.class, description);
    }

    @Step("{0} añade el producto al carrito")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ver_items)

        );

        acceptProduct(actor);
    }

    public void acceptProduct(Actor actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
    }
}
