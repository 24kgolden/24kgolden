//import java.io;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File archivo = new File("archivo.txt");
            if (archivo.exists()) {
                System.out.println("Archivo existente");
            }else{
                System.out.println("Archivo no existente");
            }

            //Escribir en el archivo
            FileWriter fw = new FileWriter(archivo);
            fw.write("Hola Mundo");
            fw.close();
            System.out.println("La escritura ha terminado");

            //leer el archivo
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            //Control de exceciones
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            br.close();

        }catch (IOException e){
            System.out.println("Ocurrio un Error en la lectura del archivo");
            e.printStackTrace();
        }
    }
}