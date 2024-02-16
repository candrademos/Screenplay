
#Autor: Cinthya Andrade
# 17/01/2024

@cucumber
Feature: Agregar Productos al carrito
  Como: Usuario
  Quiero: Ingresar al sistema opencart
  Para: Poder agregar productos al carrito


  @Agregarproductos
  Scenario Outline: Agregar productos al carrito
    Given ingreso a la pagina opencart
    When el usuario agrega el primer producto MacBook
    And el usuario agrega el segundo producto iPhone
    Then el usuario debe ver que los productos esten agregados al carrito
    Examples:

  @VisualizarCarrito
  Scenario Outline: Visualizar el carrito
    Given que el usuario ingresa a verificar los productos
    When   el usuario visualize que todos los producto esten agregados al carrito
    Then se puede observar los dos productos estan ingresados con sus respectivos precios y cantidades
    Examples:

  @LlenarFormulario
  Scenario Outline: Completar el “Checkout” como invitado Guest Checkout
    Given el usuario da clic en verificar Checkout
    And el usuario seleccina  invitado Guest Checkout
    When el usuario ingresa al fomulario
    Then el usuario debe llenar todos los campos

    #Completar formulario
    When se ingresa los datos "<nombre>" ,"<apellido>", "<correo>","<compania>" ,"<direccion>", "<ciudad>", "<codigo>" ,"<pais>" ,"<region>"
    Then veo el nuevo formulario
    Examples:
      | nombre | apellido | correo | compania | direccion | ciudad | codigo | pais | region |
      | cinthya | andrade | cinthya.andrademos@hotmail.com | ntt | maldona  | duran| 593 | ecuador | costa |


  @ConfirmarCompra
  Scenario Outline: Finalizar la compra hasta  Your order has been placed
    Given el usuario verifica la compra
    And usuario confirma la compra
    When cuando finaliza la compra
    Then mensaje compra realizada con exito
    Examples:

