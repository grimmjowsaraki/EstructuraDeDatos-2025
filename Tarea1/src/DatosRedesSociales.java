import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatosRedesSociales {

    public static void main(String[] args) {
        List<Datos> datos = new ArrayList<>();
        leerDatos(datos);
        for (Datos dat : datos) {
            System.out.println(dat.getRedSocial());
        }
    }

    private static void leerDatos(List<Datos> lista) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\jamat\\OneDrive\\Documentos\\CuadroDatosRedesSociales.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) ;
            String[] bloques = linea.split(",");
            if (bloques.length == 15) {
                String redSocial = bloques[0];
                String concepto = bloques[1];
                int anio = Integer.parseInt(bloques[2]);
                int enero = Integer.parseInt(bloques[3]);
                int febrero = Integer.parseInt(bloques[4]);
                int marzo = Integer.parseInt(bloques[5]);
                int abril = Integer.parseInt(bloques[6]);
                int mayo = Integer.parseInt(bloques[7]);
                int junio = Integer.parseInt(bloques[8]);
                int julio = Integer.parseInt(bloques[9]);
                int agosto = Integer.parseInt(bloques[10]);
                int septiembre = Integer.parseInt(bloques[11]);
                int octubre = Integer.parseInt(bloques[12]);
                int noviembre = Integer.parseInt(bloques[13]);
                int diciembre = Integer.parseInt(bloques[14]);
                lista.add(new Datos(redSocial, concepto, anio, enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre));
            }

            lector.close();
        } catch (
                IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}

