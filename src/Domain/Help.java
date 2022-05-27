/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author 50685
 */
public class Help {

    public String getImplementedOperations() {

        String output = "1. Alineamiento gobal: Este metodo aplica el algoritmo de Needleman Wunsch, el cual \n"
                + "alinea las secuencias ingresadas y muestra cual es el alineamiento que \n"
                + "devuelve el mejor valor posible de similitud de las secuencias ingresadas."
                + "\n\n"
                + "2. Alineamiento local: Este metodo aplica el algoritmo de Smitch Waterman, el cual \n"
                + "toma las dos secuencias ingresadas las compara y devuelve unicamente los\n"
                + "sectores de las cadenas que son mas parecidos entre si. Esta suele ser la\n"
                + "mejor opción a no ser que se esté seguro de que lassecuencias deben de\n"
                + "parecerse a lo largo de toda su extensión."
                + "\n\n"
                + "3. Mapa de puntajes: Este metodo toma las secuencias ingresadas y los alineamientos \n"
                + "implementados y de esta forma devuelve un mapa de tamaño(n*m) en donde podemos \n"
                + "ver los resultados optenidos de todas las psoibles comvinaciones y el mejor \n"
                + "resultado. Para esto se utiliza un algoritmo dinamico de ordenamiento."
                + "\n\n"
                + "4. Mapa de puntajes con ruta: Este metodo es parecido al anterior ya que utiliza un \n"
                + "Algoritmo Dinamico para construir un mapa de (n*m) donde se muestran los \n"
                + "resultados posibles de las combionaciones entre las dos secuencias ingresadas\n"
                + "y mejor resultado, pero ademas muestra las rutas posibles.";

        return output;
    }

    public String getHandbook(String element) {
        String output = "";
        if (element.equalsIgnoreCase("Botones")) {
            output = "#Botones: \n\n"
                    + "1. Boton Aplicar: Este boton toma las secuencias ingresadas en los campos de texto y devuelve un\n"
                    + "mapa con los resultados de las comparaciones. Ademas, habilita el boton Activar Ruta.\n\n"
                    + "2. Boton Activar Ruta: Este boton toma el mapa anterior y lo devuelve con un dibujon de toddas las\n"
                    + "posibles rutas en el mapa, y habilita el boton Desactivar Ruta\n\n"
                    + "3. Boton Desactivar Ruta: Este boton regresa el mapa anterior pero sin las rutas.\n\n"
                    + "4. Boton Valores: Este boton muestra los campos de texto con los pesos utilizados para\n"
                    + "las comparaciones, ademas habilita la edicion de estos.\n\n"
                    + "5. Boton Listar: Este boton muestra un listados de los distintos algoritmos implementados\n"
                    + "en este programa.\n\n"
                    + "6. Boton Alineamiento Global: Este boton muestra la mejor alineaciones Global de las secuencias\n"
                    + "ingresadas aplicando el ALgoritmo de Needleman Wusch.\n\n"
                    + "7. Boton Alineamiento Local: Este boton muestra la mejor alineaciones Local de las secuencias\n"
                    + "ingresadas aplicando el ALgoritmo de Smith Waterman.\n\n"
                    + "8. Boton Salir: Este boton cierra el programa mostrando la memoria total utilizada y el tiempo\n"
                    + " de ejecucion del programa.";

        } else if (element.equalsIgnoreCase("Valores")) {
            output = "#Valores: \n\n"
                    + "Los valores se dividen en 3 pesos: Match, Mismatch y Gap.\n\n"
                    + "1. Match: Este valor es el puntaje que se dara por cada caracter igual en ambas secuencias.\n\n"
                    + "2. Mismatch: Este valor es el puntaje que se dara por cada caracter diferente en ambas secuencias.\n\n"
                    + "3. Gap: Este valor es el puntaje que se dara por espacio en blanco en cualquier secuencias.";
                    
                    
                    
        } else if (element.equalsIgnoreCase("Ingreso de datos")) {
            output = "#Ingreso de Datos: \n\n"
                    + "En este programa se pueden ingresar 2 datos diferentes los cuales son: secuencia1 y secuencia2.\n"
                    + "En estos espacios podremos ingresar las dos secuencias que deseamos alinear y comparar. Para esto\n"
                    + "tomamos en cuenta que los espacios en blanco ingresados y cualquier simbolo ingresado cuentan como\n"
                    + " parte de cada secuencia ingresada y seran tomados en cuenta en las comparaciones.";

        } else if (element.equalsIgnoreCase("Salidas")) {
            output = "#Salidas: \n\n"
                    + "En el espacio de texto dispuesto para mostrar las disintitas salidas podremos ver diferentes tipos de\n"
                    + "salidas, estas son: las alineaciones globales y locales, los mapas de puntajes y los mapas con rutas. y\n\n"
                    + "Para los mapas de puntajes con ruta tenemos que tomar en cuenta que: las (\\) representan (↖), \n"
                    + "las (|) representan (↑), y los (-) representan (←), esto por que el campo de texto utilizado para \n"
                    + "mostrar los resultados no admite el uso de estas flechas.";

        }

        return output;
    }

}
