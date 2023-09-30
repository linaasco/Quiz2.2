import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * clase Estudiante
 */
public class Estudiante {
    private String nombre;
    private String fechaDeNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    /**
     * Metodo constructor para inicializar los atributos de la clase
     *
     * @param nombre            nombre del estudiante
     * @param fechaDeNacimiento fecha de nacimiento del estudiante
     * @param notaMateria1      Primera nota
     * @param notaMateria2      Segunda nota
     * @param notaMateria3      Tercera nota
     *                          <p>
     *                          complejidad temporal: 0(1) Tiempo constante
     */
    public Estudiante(String nombre, String fechaDeNacimiento, double notaMateria1, double notaMateria2, double notaMateria3) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.notaMateria1 = notaMateria1;
        this.notaMateria2 = notaMateria2;
        this.notaMateria3 = notaMateria3;
    }
    /****************************************************************************************************/
    /*************************************** MÉTODOS MODIFICADORES **************************************/
    /****************************************************************************************************/

    /**
     * Metodo que permite conocer la edad del estudiante
     *
     * @return edad
     * <p>
     * complejidad temporal : 0(1) Tiempo constante
     */

    public int getedad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fechaNacimiento = LocalDate.parse(fechaDeNacimiento, formatter);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        return periodo.getYears();
    }

    /**
     * Metodo que permite conocer el promedio del estudiante
     *
     * @return promedio
     * <p>
     * Complejidad temporal: 0(1) Tiempo Constante
     */

    public double getpromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3;
    }

    /**
     * Metodo para poder cambiar la materia 1
     * @param notaMateria1
     *
     * Complejidad temporal: 0(1): Tiempo constante
     */
    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    /**
     * Metodo para poder cambiar la materia 1
     * @param notaMateria2
     *
     * Complejidad temporal: 0(1): Tiempo constante
     */

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    /**
     * Metodo para poder cambiar la materia 1
     * @param notaMateria3
     *
     * Complejidad temporal: 0(1): Tiempo constante
     */

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }
}



