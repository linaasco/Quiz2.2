/**
 * Clase principal
 */
public class Principal {
    /**
     * Metodo principal que es ejecutado
     * @param args
     *
     * Complejidad temporal: 0(1) Tiempo constante
     */
    public static void main(String[] args) {
        Estudiante estudianteLina = new Estudiante("Lina", "2006/02/24",3.0,4.5,4.4);
        Estudiante estudianteLaura = new Estudiante("Laura", "2006/03/02",4.2,4.0,4.8);
        Estudiante estudianteJuliana = new Estudiante("Juliana","2006/02/15",5.0,4.0,4.7);

        /**
         * Cambio de notas de la estudiante Lina
         */
        estudianteLina.setNotaMateria1(4.0);
        estudianteLina.setNotaMateria2(3.8);
        estudianteLina.setNotaMateria3(4.2);


        double promedioEstudianteLina = estudianteLina.getpromedio();
        System.out.println("El promedio de las notas de Lina es: "+ promedioEstudianteLina);

        double promedioEstudianteLaura = estudianteLaura.getpromedio();
        System.out.println("El promedio de las notas de Lina es: "+ promedioEstudianteLaura);

        double promedioEstudianteJuliana = estudianteJuliana.getpromedio();
        System.out.println("El promedio de las notas de Lina es: "+ promedioEstudianteJuliana);

        int edadEstudianteLina = estudianteLina.getedad();
        System.out.println("La edad de la estudiante Lina es :"+ edadEstudianteLina +" años");

        int edadEstudianteLaura = estudianteLaura.getedad();
        System.out.println("La edad de la estudiante Laura es :"+ edadEstudianteLaura +" años");

        int edadEstudianteJuliana = estudianteJuliana.getedad();
        System.out.println("La edad de la estudiante Juliana es :"+ edadEstudianteJuliana +" años");


    }

}