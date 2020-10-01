package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;

import com.crowdar.examples.pages.B2OmniDemoHome;
import com.crowdar.examples.services.B2OmniService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B2ApkApiDemoSteps extends PageSteps {


    @Given("La app se cargo correctamente")
    public void laAppSeCargoCorrectamente() {
        B2OmniService.screenInicial();
    }

    @When("Hago click en el botón Ingresar")
    public void hagoClickEnElBotónIngresar() {
        B2OmniService.clickButtonInicial();
    }

    @Then("Se visualiza la Pantalla Inicial de Bienvenida")
    public void seVisualizaLaPantallaInicialDeBienvenida() {
        B2OmniService.screenBienvenido();
    }
}
