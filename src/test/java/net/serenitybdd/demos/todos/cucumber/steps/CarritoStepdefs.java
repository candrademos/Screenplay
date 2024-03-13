package net.serenitybdd.demos.todos.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class CarritoStepdefs {
    @Given("ingreso a la pagina opencart")
    public void ingresoALaPaginaOpencart() {
    }

    @When("el usuario agrega el primer producto MacBook")
    public void elUsuarioAgregaElPrimerProductoMacBook(Actor actor) {
    }

    @And("el usuario agrega el segundo producto iPhone")
    public void elUsuarioAgregaElSegundoProductoIPhone(Actor actor) {
    }

    @Then("el usuario debe ver que los productos esten agregados al carrito")
    public void elUsuarioDebeVerQueLosProductosEstenAgregadosAlCarrito(Actor actor) {
    }

    @Given("que el usuario ingresa a verificar los productos")
    public void queElUsuarioIngresaAVerificarLosProductos(Actor actor) {
    }

    @When("el usuario visualize que todos los producto esten agregados al carrito")
    public void elUsuarioVisualizeQueTodosLosProductoEstenAgregadosAlCarrito(Actor actor) {
    }

    @Then("se puede observar los dos productos estan ingresados con sus respectivos precios y cantidades")
    public void sePuedeObservarLosDosProductosEstanIngresadosConSusRespectivosPreciosYCantidades(Actor actor) {
    }

    @Given("el usuario da clic en verificar Checkout")
    public void elUsuarioDaClicEnVerificarCheckout(Actor actor) {
    }

    @And("el usuario seleccina  invitado Guest Checkout")
    public void elUsuarioSeleccinaInvitadoGuestCheckout(Actor actor) {
    }

    @When("el usuario ingresa al fomulario")
    public void elUsuarioIngresaAlFomulario(Actor actor) {
    }

    @Then("el usuario debe llenar todos los campos")
    public void elUsuarioDebeLlenarTodosLosCampos(Actor actor) {
    }

    @When("se ingresa los datos {string} ,{string}, {string},{string} ,{string}, {string}, {string} ,{string} ,{string}")
    public void seIngresaLosDatos(String nombre, String apellido, String correo, String compania, String direccion, String ciudad, String codigo, String pais, String region) {
    }

    @Then("veo el nuevo formulario")
    public void veoElNuevoFormulario(Actor actor) {
    }

    @Given("el usuario verifica la compra")
    public void elUsuarioVerificaLaCompra(Actor actor) {
    }

    @And("usuario confirma la compra")
    public void usuarioConfirmaLaCompra(Actor actor) {
    }

    @When("cuando finaliza la compra")
    public void cuandoFinalizaLaCompra(Actor actor) {
    }

    @Then("mensaje compra realizada con exito")
    public void mensajeCompraRealizadaConExito(Actor actor) {
    }
}
