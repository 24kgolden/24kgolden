import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try {
            //Intentar crear un archivo
            File file = new File("Excepciones.txt");
            file.createNewFile();

        }catch (IOException e){
            System.out.println("Ocurrio un error al crear el archivo");
            e.printStackTrace();
        }
        //arraylist
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
    }
}