package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.InicioConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class B2OmniService {


    public static void screenInicial(){
        Assert.assertTrue(MobileActionManager.isVisible(InicioConstants.SLIDER_INICIO_XPATH));
    }
    public static void clickButtonInicial(){
        MobileActionManager.click(InicioConstants.BUTTON_INGRESAR_XPATH);
    }

    public static void screenBienvenido(){
        Assert.assertTrue(MobileActionManager.isVisible(InicioConstants.BUTTON_ACTIVARME_XPATH));
        Assert.assertTrue(MobileActionManager.isVisible(InicioConstants.BUTTON_SOY_USUARIO_XPATH));
    }

}
