package ru.skypro;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

    // Задание 1

    byte clientOS = 0;

    if (clientOS == 0) {
        System.out.println("Ustanovite versiu dlya iOS po ssilke "); // Устанавка приложения для iOS при 0
    } else if (clientOS == 1) {
        System.out.println("Ustanovite versiu dlya Android po ssilke "); // Установка приложения для Android при 1
    } else {
        System.out.println("Vasha OS ne opredelena "); // Если юзер ввел не одно из данных значений переменной, выдается ошибка
    }


    // Задание 2

    byte userOS =1;
    int userDeviceYear = 2015;

    if (userOS == 0 && userDeviceYear < 2015)
        System.out.println("Ustanovite prilogenie dlya iOS Lite po ssilke ");

    else if (userOS == 1 && userDeviceYear < 2015)
        System.out.println("Ustanovite prilogenie dlya Android Lite po ssilke ");

    else if (userOS == 1 && userDeviceYear >= 2015)
        System.out.println("Ustanovite prilogenie dlya Android Standart po ssilke ");

    else
        System.out.println("Ustanovite prilogenie dlya iOS Standart po ssilke ");

    // if (userOS != 0 && userOS != 1) System.out.println("Vasha OS ne opredelena");
    // Здесь я хотел добавить в код ту ситуацию, когда OS не определяется при userOS !=0 и userOS !=1,но я не знаю (а также не нашел) оператор, который помог бы мне игнорить userDeviceYear.


    // Задание 3

    int year = 2012;
    byte indicatorLeapYear = 4; // Индикатор високосности года
    int findLeapYear = (year % indicatorLeapYear); // Берем % от остатка при делении на 4, если делится на цело - год высокосный, если есть остаток, год - не високосный
    if (findLeapYear == 0)
        System.out.println("God Visokosniy ");
    else
        System.out.println("God Ne Visokosniy ");


    // Задание 4

    int deliveryDistance = 145; // Объявляем дистанцию до клиента
    byte distanceStep = 40; // Шаг дистанции после 20км от офиса

    int deliveryTime1 = deliveryDistance % distanceStep; // Ищем процентный остаток при делении

    int deliveryTime2 = deliveryDistance / distanceStep; // Делим дистанцию на шаг


    int howManyDay1 = deliveryTime2 + 1; // Если дистанция делится нацело,то добавляем 1
    int howManyDay2 = deliveryTime2 + 2; // Если дистанция не делится нацело, то добавляем 2, так как Java округляет в меньшую сторону, а не в большую как мне в данном случае надо
    int howManyDay3 = 1;

    if (deliveryTime1 == 0) // Если дистанция делится нацело, то мы выводим тот случай, когда добаляем 1 день
        System.out.println(howManyDay1 + " dney nugno dlya dostavki karty");
    else if (deliveryDistance <= 20) // Тут частный случай, когда клиент живет ближе, либо равно 20км до офиса
        System.out.println("1 den nugno dly dostavki karty");
    else // Ну либо тот вариант, когда не делиться нацело и Java округляет в меньшую сторону, то добавляем 2
        System.out.println(howManyDay2 + " dney nugno dlya dostavki karty");
    // Со стороны, код кажется корявым? Полностью согласен, но в данном случае меня ограничивает незнание большего числа операторов, для оптимизации кода
    // Но зато, задача решается при любых условиях, заданных клиентом.


    // Задание 5

    byte monthNumber = 9;

    switch (monthNumber) {
          case 1:
          case 2:
            System.out.println("Zima");
            break;
          case 3:
          case 4:
          case 5:
            System.out.println("Vesna");
            break;
          case 6:
          case 7:
          case 8:
             System.out.println("Leto");
             break;
          case 9:
          case 10:
          case 11:
             System.out.println("Osen");
             break;
          case 12:
             System.out.println("Zima");
             break;
          default:
             System.out.println("Takogo mesyaza net"); // Тут просто. Сделал по образцу из урока. Оператор switch сравнивает каждую единицу один раз и при совпадении выдает результат.
        }
    }
}




