/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.reservaciones;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/reservaapi")
public class reservaController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws JsonProcessingException, IOException{
        String dni      = request.getParameter("txtDNI");
        int sede        = Integer.parseInt(request.getParameter("sede"));
        int mesa        = Integer.parseInt(request.getParameter("mesa"));
        String fechaHoraReserva = request.getParameter("fecha");
        String mensaje  = request.getParameter("txtMensaje");
        
        //Instancia de la clase rservaciones
        reservaciones objReservaciones = new reservaciones();
        objReservaciones.setDni(dni);
        objReservaciones.setSedeid(sede);
        objReservaciones.setMesaid(mesa);
        objReservaciones.setFechahorareserva(fechaHoraReserva);
        objReservaciones.setMensaje(mensaje);
        
        //Convertimos clase en formato json
        ObjectMapper convert = new ObjectMapper();
        String json = convert.writeValueAsString(objReservaciones);
        
            //HttpClientBuilder clientBuilder = HttpClientBuilder.getInstance();
        
        //Creamos cuerpo de solicitud hTTP
        //HttpClient client = HttpClient.newHttpClient();
        //HttpRequest requesting = HttpRequest.newBuilder()
        //        .uri(URI.create("http://localhost:9090/apireservas/insertar"))
        //        .header("Content-type", "application/json")
        //        .POST(HttpRequest.BodyPublishers.ofString(json))
        //        .build();
        //try {
        //    HttpResponse<String> httpresponse = client.send(requesting,HttpResponse.BodyHandlers.ofString());
        //    System.out.println(httpresponse);
        //} catch (InterruptedException ex) {
        //    Logger.getLogger(reservaController.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
    }
}
