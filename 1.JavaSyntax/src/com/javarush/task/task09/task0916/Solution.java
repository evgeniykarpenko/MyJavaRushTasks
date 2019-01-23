package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution {
    public static void main(String[] args)throws NoSuchFieldException, RemoteException{
        processExceptions(new Solution());

    }

    public static void processExceptions(Solution obj) throws NoSuchFieldException, RemoteException{
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (NoSuchFieldException e)
        {
            System.out.println(e);
        }
        catch (RemoteException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }


    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
