package Alexandr_Nikitchenko;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/



public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        int a = Integer.parseInt(d);
        String e = reader.readLine();
        int b = Integer.parseInt(e);
        String f = reader.readLine();
        int c = Integer.parseInt(f);

        if((a + b) > c){
            System.out.println("Треугольник существует.");
        } else{
            System.out.println("Треугольник не существует.");
        }

    }
}
