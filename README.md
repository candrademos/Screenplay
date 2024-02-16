							/****************************************************************************
							 *	Archivo Físico:		INSTRUCTIVO PASO A PASO EJECUCIÓN    	    *
							 *	Archivo:	            Readme.txt		                            *
							 *	Producto:			AUTOMATIZACIÓN DE CARRITO DE COMPRA PRUEBA    *
 							 *	Elaborado por:		CINTHYA ANDRADE MOSQUERA			    *
							 *--------------------------------------------------------------------------*
							 *			   DESCRIPCION DEL README			                *
							 *	En este archivo de detallará el paso a paso de la ejecución de la     *
							 *    prueba automatizada así como las herramientas utilizadas para su 	    *
							 * 	respectivo desarrollo.					                      *
							 *--------------------------------------------------------------------------*
# README

Arquetipo de pruebas automatizadas usando la herramienta SerenityBDD con Screenplay

> **Soporta automatización**:
> * Web



## Herramientas y Complementos

|
> **NOTA**:
> * Para ejecutar el proyecto se recomienda minimo las siguientes versiones:
	>   * IntelliJ Community Edition 2023
>   * Java JDK 17
>   * Gradle 7.6
> * Una vez obtenido IntelliJ es necesario instalar los plugins de Gherkin y Cucumber for Java. (
	*[Guia de instalación plugins en intellij](https://www.jetbrains.com/help/idea/managing-plugins.html)*)

## Ejecución local

0. Clonar el proyecto

```bash
  git clone https://github.com/serenity-bdd/screenplay-pattern-todomvc.git
```

Para correr el proyecto de manera local se debe realizar los siguientes pasos:

1. Definir la tag de los tipos de tests que se van a ejecutar, esto lo hacemos en el archivo WebRunnerTest, para el
   ejemplo se va a correr todos los test 

```
tags = @Agregarproductos,  @VisualizarCarrito,  @LlenarFormulario,  @ConfirmarCompra
```

2. Definir el driver a usarse en serenity.properties.

```
#CONFIGURACION DRIVER
webdriver.driver=chrome
```

## Comandos

El arquetipo posee 2 runners activos, uno para pruebas con SErenityBDD 

### Comandos SerenityBDD

Para ejecutar todos los escenarios por linea de comandos

```bash
  ./gradlew clean test --tests "net.serenitybdd.demos.todos.cucumber.runners.AggProductoRunners
```

Para ejecutar escenarios que contengan un tag especifico

```bash
  ./gradlew clean test --tests -Dcucumber.filter.tags="@test" net.serenitybdd.demos.todos.cucumber.runners.AggProductoRunners
```

Para ejecutar los escenarios enviando variables de ambiente

```bash
  ./gradlew clean test --tests "net.serenitybdd.demos.todos.cucumber.runners.AggProductoRunners" -Dvariable1=test
```

Para ejecutar las pruebas con 3 hilos en paralelo enviando variables de ambiente


`




## Construido con

La automatización fue desarrollada con:

* BDD - Estrategia de test
* Screenplay
* Gradle - Manejador de dependencias
* Cucumber - Framework para automatizar pruebas BDD
* Serenity BDD - Biblioteca de código abierto para la generación de reportes
* Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)




