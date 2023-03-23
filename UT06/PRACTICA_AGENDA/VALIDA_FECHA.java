import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidarFecha {
    public static void main(String[] args) {
        String fechaString = "23-03-2023";
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        formatoFecha.setLenient(false);

        try {
            Date fecha = formatoFecha.parse(fechaString);
            System.out.println("Fecha válida: " + fechaString);
        } catch (ParseException e) {
            System.out.println("Fecha inválida: " + fechaString);
        }
    }
}
