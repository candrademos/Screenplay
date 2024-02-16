package net.serenitybdd.demos.todos.screenplay.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.annotations.Step;

import static net.serenitybdd.demos.todos.screenplay.UI.demo.LlenarFormulario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
class RegisterCustomer implements Task {

    private final Customer customer;

    public RegisterCustomer(Customer customer) {
        this.customer = customer;
    }

    public static RegisterCustomer withInformation(Customer customer) {
        return instrumented(RegisterCustomer.class, customer);
    }

    @Step("{0} completa datos de compra")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(checkout),
                Enter.theValue(customer.toString()).into(opciones_de_pago),
                Enter.theValue(customer.toString()).into(pago_invitado),
                Enter.theValue(customer.toString()).into(pago_facturacion),
                Enter.theValue(customer.toString()).into(bt_continuar),
                Enter.theValue(customer.toString()).into(nombre),
                Enter.theValue(customer.toString()).into(apellido),
                Enter.theValue(customer.toString()).into(correo),
                Enter.theValue(customer.toString()).into(telefono),
                Enter.theValue(customer.toString()).into(contraseña),
                Enter.theValue(customer.toString()).into(confirma_contraseña),
                Enter.theValue(customer.toString()).into(compañia),
                Enter.theValue(customer.toString()).into(direccion),
                Enter.theValue(customer.toString()).into(ciudad),
                Enter.theValue(customer.toString()).into(codigo_postal),
                Enter.theValue(customer.toString()).into(pais),
                Enter.theValue(customer.toString()).into(region),
                Enter.theValue(customer.toString()).into(detalle_de_la_entrega),
                Enter.theValue(customer.toString()).into(metodo_de_entrega),
                Enter.theValue(customer.toString()).into(continuar_entrega),
                Enter.theValue(customer.toString()).into(metodo_de_pago),
                Enter.theValue(customer.toString()).into(terminos_metodo_de_pago),
                Enter.theValue(customer.toString()).into(continuar_metodo_de_pago),
                Enter.theValue(customer.toString()).into(confirmar_pedido__pedido_),
                Enter.theValue(customer.toString()).into(bt_confirmar_pedido),
                Enter.theValue(customer.toString()).into(suOrdenEsCorrecta),
                Enter.theValue(customer.toString()).into(pedidoProcesado),
                Enter.theValue(customer.toString()).into(graciasPorComprar),
                Enter.theValue(customer.toString()).into(continuar_para_salir)

        );
    }

    private class Customer {
    }
}