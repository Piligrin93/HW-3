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

    byte userOS =65;
    int userDeviceYear = 2015;

    if (userOS == 0 && userDeviceYear < 2015)
        System.out.println("Ustanovite prilogenie dlya iOS Lite po ssilke ");

    else if (userOS == 1 && userDeviceYear < 2015)
        System.out.println("Ustanovite prilogenie dlya Android Lite po ssilke ");

    else if (userOS == 1 && userDeviceYear >= 2015)
        System.out.println("Ustanovite prilogenie dlya Android Standart po ssilke ");

    else if (userOS == 0 && userDeviceYear >= 2015)
        System.out.println("Ustanovite prilogenie dlya iOS Standart po ssilke ");

    else
        System.out.println("Chto-to poshlo ne tak :(");


    // Задание 3 (По Юлианскому календарю)

    int year = 2016;
    byte indicatorLeapYear = 4; // Индикатор високосности года
    int findLeapYear = (year % indicatorLeapYear); // Берем % от остатка при делении на 4, если делится на цело - год высокосный, если есть остаток, год - не високосный
    if (findLeapYear == 0)
        System.out.println("Po Ulianskomu ---> God Visokosniy ");
    else
        System.out.println("Po Ulianskomu ---> God Ne Visokosniy ");


    // Задание 3.1 (По Григорианскому календарю - как в условии)

    int yearX = 2016;
    int A = yearX % 400;
    int B = yearX % 4;
    int C = yearX % 100;
    if (A == 0 && B == 0 && C != 0)
        System.out.println("Po Grigorianskomu ---> God Visokosniy");
    else
        System.out.println("Po Grigorianskomu ---> God Visokosniy");
    // Тут я сделла отдельно для Российского календаря - вписался так сказать, в условия.


    // Задание 4

    double deliveryDistance = 41; // Объявляем дистанцию до клиента
    double distanceStep = 40; // Шаг дистанции после 20км от офиса

    double distanceX = Math.ceil (deliveryDistance / distanceStep); // Округляем до большего при делении расстоянии до клиента на шаг дистанции
    var howManyDay1 = distanceX; // Объявляем переменную, когда не нужно добавлять один день
    var howManyDay2 = distanceX +1; // Объявляем переменную когда нужно добавить один день
    double X = deliveryDistance % distanceStep; // Тут беру остаток при делии, чтобы ограничить доставку при неправильных цифрах

    if (deliveryDistance <= 20) // Слушай когда клиент живет ближе 20км
        System.out.println("Dlya dostavki nugen 1 den");
    else if (X >= 1 && X <= 20) // Тут если остаток при делении дистанции варьируется от 1 до 20 включительно, то мы НЕ добавляем день к доставке
        System.out.println("Dlya dostavki nugno " + howManyDay1 + " dney");
    else // Тут наоборот добавляем, если при взятии остатка от деления мы не входим в нужны диапазон чисел
        System.out.println("Dlya dostavki nugno " + howManyDay2 + " dney");

    // Сейчас прога работате без боев. Почему я ограничил 1 <= X <= 20 ?
    // Все дело в том, что я ручным способом проверил. Допустим берем интервал от 60 до 100 км.
    // До середины интервала, не работала формула и нам НЕ нужен был этот дополнительный день, после 81 км все встает в норму.


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




