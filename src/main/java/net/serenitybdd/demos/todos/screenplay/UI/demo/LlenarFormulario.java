package net.serenitybdd.demos.todos.screenplay.UI.demo;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.util.List;
import java.util.function.Function;

public class LlenarFormulario {

    public static Target checkout    =  Target.the("Ingresar al Checkout").locatedBy((Function<SearchContext, List<WebElementFacade>>) By.id("checkout-cart"));

    public static final Target opciones_de_pago = Target.the("opciones de pago").locatedBy((Function<SearchContext, List<WebElementFacade>>) By.id("collapse-checkout-option"));

    public static final Target pago_invitado     = Target.the("pago invitado").locatedBy("//a[@href='#collapse-checkout-option'][contains(.,'Step 1: Checkout Options')]");

    public static final Target pago_facturacion   = Target.the("pago facturacion").locatedBy("(//font[contains(.,'Paso 2: Detalles de facturación')])[2]");
    public static final Target bt_continuar   = Target.the("bt continuar").locatedBy((Function<SearchContext, List<WebElementFacade>>) By.id("button-account"));
    public static final Target nombre   = Target.the("pago Nombre").locatedBy("//input[contains(@name,'firstname')]");
    public static final Target apellido   = Target.the("apellido").locatedBy("//input[contains(@name,'lastname')]");
    public static final Target correo   = Target.the("correo").locatedBy("//input[contains(@placeholder,'Correo electrónico')]");
    public static final Target telefono   = Target.the("telefono").locatedBy("//input[contains(@name,'telephone')]");
    public static final Target contraseña   = Target.the("contraseña").locatedBy("//input[@placeholder='Contraseña']");
    public static final Target confirma_contraseña   = Target.the("confirma contraseña").locatedBy("//input[contains(@name,'confirm')]");
    public static final Target compañia   = Target.the("compañia").locatedBy("//input[contains(@name,'company')]");
    public static final Target direccion   = Target.the("direccion").locatedBy("//input[contains(@name,'address_1')]");
    public static final Target ciudad   = Target.the("ciudad").locatedBy("//input[contains(@name,'city')]");
    public static final Target codigo_postal   = Target.the("codigo postal").locatedBy("//input[contains(@name,'postcode')]");
    public static final Target pais   = Target.the("pais").locatedBy("//select[contains(@name,'country_id')]");
    public static final Target region   = Target.the("region").locatedBy((Function<SearchContext, List<WebElementFacade>>) By.id("input-payment-zone"));
    public static final Target detalle_de_la_entrega   = Target.the("detalle de la entrega").locatedBy("(//font[contains(.,'Paso 3: Detalles de entrega')])[2]");
    public static final Target metodo_de_entrega   = Target.the("metodo de entrega").locatedBy("(//font[contains(.,'Paso 4: Método de entrega')])[2]");
    public static final Target continuar_entrega   = Target.the("continuar_entrega").locatedBy((Function<SearchContext, List<WebElementFacade>>) By.id("button-shipping-method"));
    public static final Target metodo_de_pago   = Target.the("metodo de pago").locatedBy("(//font[contains(.,'Paso 5: Método de pago')])[2]");
    public static final Target terminos_metodo_de_pago   = Target.the("Terminos metodo de pago").locatedBy("//input[contains(@name,'agree')]");
    public static final Target continuar_metodo_de_pago   = Target.the("continuar metodo de pago").locatedBy("//input[contains(@id,'button-payment-method')]");
    public static final Target confirmar_pedido__pedido_   = Target.the("confirmar pedido ").locatedBy("(//font[contains(.,'Paso 6: Confirmar pedido')])[2]");
    public static final Target bt_confirmar_pedido   = Target.the("bt confirmar pedido").locatedBy((Function<SearchContext, List<WebElementFacade>>) By.id("button-confirm"));
    public static final Target suOrdenEsCorrecta   = Target.the("su orden es correcta").locatedBy("(//font[contains(.,'¡Su orden ha sido puesta!')])[2]");
    public static final Target pedidoProcesado   = Target.the("pedido procesado").locatedBy("(//font[contains(.,'¡Tu pedido ha sido procesado exitosamente!')])[2]");
    public static final Target graciasPorComprar   = Target.the("gracias por comprar").locatedBy("(//font[contains(.,'¡Gracias por comprar con nosotros en línea!')])[2]");
    public static final Target continuar_para_salir   = Target.the("continuar para salir").locatedBy("(//font[contains(.,'Continuar')])[2]");

}