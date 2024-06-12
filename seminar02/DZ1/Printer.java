// Дана строка sql-запроса:
// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
// String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
// Пример: Строка sql-запроса:
// select * from students where 
// Параметры для фильтрации:
//  {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат:
// select * from students where name='Ivanov' and country='Russia' and city='Moscow'

import java.util.HashMap;
import java.util.Map;

class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder whereClause = new StringBuilder();
        PARAMS = PARAMS.replaceAll("[{}\"]", ""); // Удаляем фигурные скобки и кавычки
        String[] pairs = PARAMS.split(","); // Разделяем строку на пары ключ-значение

        for (String pair : pairs) {
            String[] keyValue = pair.split(":"); // Разделяем пары на ключи и значения
            if (keyValue.length == 2 && !keyValue[1].trim().equals("null")) {
                whereClause.append(keyValue[0].trim()).append("='")
                           .append(keyValue[1].trim()).append("' and ");
            }
        }

        if (whereClause.length() > 0) {
            whereClause.delete(whereClause.length() - 5, whereClause.length()); // Удаляем последний AND
            return new StringBuilder(QUERY).append(whereClause);
        } else {
            return new StringBuilder(QUERY);
        }
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}