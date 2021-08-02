package testclientews;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWS;

public class TestServicioSumarWS {
    
    public static void main(String[] args) {
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando Servicio sumar WS");
        int x = 12;
        int y = 20;
        int resultado = servicioSumar.sumar(x, y);
        System.out.println("Resultado:" + resultado);
        System.out.println("Fin servicio sumar WS");
    }
}
