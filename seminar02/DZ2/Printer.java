import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log = new File("log.txt");
    private static FileWriter fileWriter;

    public static void sort(int[] arr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
             try {
            // Очищаем файл лога перед началом сортировки
            fileWriter = new FileWriter(log, false); // false для перезаписи файла
            boolean swapped;
            String lastEntry = ""; // Переменная для хранения последней записи
            for (int i = 0; i < arr.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) break;
                lastEntry = sdf.format(new Date()) + " [" + Arrays.toString(arr).replace("[", "").replace("]", "") + "]";
                fileWriter.write(lastEntry + "\n");
            }
            // Повторно записываем последнюю строку в лог
            fileWriter.write(lastEntry);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int[] arr = {};
 // При отправке кода на Выполнение, вы можете варьировать эти параметры
      if (args.length == 0) {
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     

      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}