package com.javarush.task.task14.task1408;

import static com.javarush.task.task14.task1408.Country.MOLDOVA;

/**
 * Created by IzIFRag on 19.07.2017.
 */
class MoldovanHen extends Hen
{

    public int getCountOfEggsPerMonth(){
        return 12;
    }

    String getDescription()
    {
        return super.getDescription()+ " Моя страна - " +  MOLDOVA  + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}