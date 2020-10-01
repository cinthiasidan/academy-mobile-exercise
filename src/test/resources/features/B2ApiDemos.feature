Feature:Como cliente empresa no activo quiero que se muestre una Pantalla Inicial Bienvenido Para que pueda registrarme en la aplicación con mis contraseñas

  @Omni
  Scenario: Mostrar el carrusel de novedades si hay novedades y seguir el flujo deseo Activarme
    Given La app se cargo correctamente
    When Hago click en el botón Ingresar
    Then Se visualiza la Pantalla Inicial de Bienvenida
