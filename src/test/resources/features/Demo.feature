Feature:Como cliente empresa no activo quiero que se muestre una Pantalla Inicial Bienvenido Para que pueda registrarme en la aplicación con mis contraseñas

  Scenario Outline: Mostrar el carrusel de novedades si hay novedades y seguir el flujo deseo Activarme
    Given La app se cargo correctamente
    When Hago click en el botón Ingresar
    Then Se visualiza la Pantalla Inicial de Bienvenida

    When The user changes the language
    And The user log out of the app
    Then Login page is displayed

    When The user logs in the application with: <email>, <password>
    Then Home page is displayed

    @Demo
    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |
