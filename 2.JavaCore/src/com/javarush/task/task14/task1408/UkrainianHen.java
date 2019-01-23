package com.javarush.task.task14.task1408;

import static com.javarush.task.task14.task1408.Country.UKRAINE;

/**
 * Created by IzIFRag on 19.07.2017.
 */
class UkrainianHen extends Hen
{

    public int getCountOfEggsPerMonth(){
        return 11;
    }

    String getDescription()
    {
        return super.getDescription()+ " Моя страна - " + UKRAINE  + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
