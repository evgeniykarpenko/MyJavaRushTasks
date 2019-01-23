package com.javarush.task.task14.task1408;

import static com.javarush.task.task14.task1408.Country.RUSSIA;

/**
 * Created by IzIFRag on 19.07.2017.
 */
class RussianHen extends Hen
{

    public int getCountOfEggsPerMonth(){
        return 10;
    }

    String getDescription()
    {
        return super.getDescription()+ " Моя страна - " +  RUSSIA  + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}