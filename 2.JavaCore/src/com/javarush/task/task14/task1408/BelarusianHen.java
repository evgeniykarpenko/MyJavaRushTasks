package com.javarush.task.task14.task1408;

import static com.javarush.task.task14.task1408.Country.BELARUS;

/**
 * Created by IzIFRag on 19.07.2017.
 */
class BelarusianHen extends Hen
{

    public int getCountOfEggsPerMonth(){
        return 1;
    }

    String getDescription()
    {

                return super.getDescription()+ " Моя страна - " +  BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}