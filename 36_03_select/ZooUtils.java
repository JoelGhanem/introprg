/*Classe en la que tenim utilitats pel Zoo com mostrarCategories*/
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
public class ZooUtils {
    public static void mostraCategories(List<Categoria> categories) {
        //System.out.println("Esto son las categorias");
        if (categories.isEmpty()) {
            System.out.println("Cap categoria");
        } else {
        System.out.println("Nombre de categories: " + categories.size());
        }
        for (Categoria categoria : categories) {
            System.out.println("    " + categoria);
        }
    }
}
