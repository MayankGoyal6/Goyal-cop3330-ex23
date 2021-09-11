/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 23
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
      Scanner scanner = new Scanner(System.in);

      System.out.print("Is the car silent when you turn the key? ");
      boolean isSilent = scanner.nextBoolean();

      if(isSilent)
      {
        System.out.print("Are the battery terminals corroded? ");
        boolean isCorroded = scanner.nextBoolean();

        if(isCorroded)
        {
          System.out.print("Clean terminals and try starting again. ");
        }
        else
        {
          System.out.print("Replace cables and try again. ");
        }
      }
      else
      {
        System.out.print("Does the car make a slicking noise? ");
        boolean isSlickingNoise = scanner.nextBoolean();

          if(isSlickingNoise)
        {
          System.out.print("Replace the battery. ");
        }
        else
        {
          System.out.print("Does the car crank up but fail to start? ");
          boolean isCrankUp = scanner.nextBoolean();

            if(isCrankUp)
            {
              System.out.print("Check spark plug connections. ");
            }
            else
            {
              System.out.print("Does the engine start and then die? ");
              boolean isEngineStart = scanner.nextBoolean();

                if(isEngineStart)
                {
                  System.out.print("Does you car have fuel injection? ");
                  boolean hasFuelInjection = scanner.nextBoolean();

                    if(hasFuelInjection)
                    {
                      System.out.print("Get it in for service. ");
                    }
                    else
                    {
                      System.out.print("Check to ensure the choke is opening and closing. ");
                    }
                }
                else
                {
                  System.out.print("This should not be possible. ");
                }
            }
        }

      }


      

      

      

      

    
  }
}