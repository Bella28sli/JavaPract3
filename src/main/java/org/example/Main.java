package org.example;
import java.lang.Math.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // подключаем сканер
        int a = 0; // вводим переменные
        int b = 0;
        int c = 0;
        try {
            System.out.println("Введите сторону А"); // запрашиваем стороны треугольника
            a = sc.nextInt(); sc.nextLine();
            System.out.println("Введите сторону В");
            b = sc.nextInt(); sc.nextLine();
            System.out.println("Введите сторону С");
            c = sc.nextInt(); sc.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Неверный формат");
        }
        if ((Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) || // проверям на прямоугольный треугольник, объединяя условия
            (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)) ||
            (Math.pow(c,2) + Math.pow(a,2) == Math.pow(b,2))  ){
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        }
        else if (a==b && b==c){ // используем else if для нескольких условий, проверяем на равносторонность
            System.out.println("a, b и c являются сторонами равностороннего треугольника");
        }
        else if (a==b || b==c || c==a){ // проверяем на равнобедренность только после равносторонности во избежании ошибки
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        }
        else if (a + b <= c || b + c <= a || c + a <= b){ // проверяем отсутствие треугольника вовсе
            System.out.println("a, b и c не являются сторонами треугольника");
        }
        else{ // остальные треугольники
            System.out.println("a, b и c являются сторонами обычного треугольника");
        }
    }
}