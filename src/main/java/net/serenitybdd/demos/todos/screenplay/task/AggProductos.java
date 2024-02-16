package net.serenitybdd.demos.todos.screenplay.task;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.demos.todos.screenplay.UI.demo.AggProductos.ITEMS;
import static net.serenitybdd.demos.todos.screenplay.UI.demo.AggProductos.macBook;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AggProductos implements Task {

    private final String description;

    public AggProductos(String description) {
        this.description = description;
    }

    public static AggProductos toCart(String description) {
        return instrumented(AggProductos.class, description);
    }

    @Step("{0} añade el producto al carrito")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(macBook),
                Click.on(ITEMS)
        );

        acceptProduct(actor);
    }

    public void acceptProduct(Actor actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
    }
}