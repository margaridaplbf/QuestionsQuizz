/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsquizz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import static questionsquizz.QuestionsQuizz.answers;
import static questionsquizz.QuestionsQuizz.questions;

/**
 *
 * @author margaridaferreira
 */
public class computer {
    
    public boolean correct_game_type(String type){
        return (type.equalsIgnoreCase("F"))||(type.equalsIgnoreCase("C"));
    }
    public boolean correct_level (String lvl){
        return (lvl.equalsIgnoreCase("H")||lvl.equalsIgnoreCase("E")||lvl.equalsIgnoreCase("M"));
    }
   
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner scan = new Scanner(System.in);
        
        int actualscore, actualfailed, actualskipped, actualcheated;
        actualscore=0;
        actualfailed=0;
        actualskipped=0;
        actualcheated=0;
        
        int actualscore_computer, actualfailed_computer;
       
        actualscore_computer=0;
        actualfailed_computer=0;
       
      
      System.out.println("*************************************************************************");
      System.out.println("\t\t\tWELCOME TO YOUR QUIZZ");
      System.out.println("*************************************************************************");
      
      String game_type;
      System.out.println("\t\t\tWhat quizz would you like to play?");
      System.out.println("\t\t\tCapitals? (enter c)");
      System.out.println("\t\t\tFood? (enter f)");
      game_type = scan.next();
      
      
      computer m = new computer();
      
      while (m.correct_game_type(game_type)==false)
      {System.out.print("\nIncorrect Input!\nEnter a valid letter! ");
      System.out.println("- Only C or F allowed");
      game_type = scan.next();}
      
      if (m.correct_game_type(game_type)==true){
                if (game_type.equalsIgnoreCase("C"))
                { 
                QuestionsQuizz q =new QuestionsQuizz();
                q.read_answers("/Users/margaridaferreira/Desktop/answerscapitals.txt");
                QuestionsQuizz a =new QuestionsQuizz();
                a.read_questions("/Users/margaridaferreira/Desktop/capitals.txt");
                }
                if (game_type.equalsIgnoreCase("F"))
                {
                QuestionsQuizz q =new QuestionsQuizz();
                q.read_answers("/Users/margaridaferreira/Desktop/foodanswers.txt");
                QuestionsQuizz a =new QuestionsQuizz();
                a.read_questions("/Users/margaridaferreira/Desktop/foodquestions.txt");
                }
    }
    
      
     
     
    
      String level;
      System.out.println("\nChoose a level of difficulty");
      System.out.println("Press:\n\t\tH for hard\n\t\tM for medium\n\t\tE for easy");
      level = scan.next();
      
      
      while (m.correct_level(level)==false){
      System.out.print("Incorrect Input!\n Enter a valid letter! ");
      System.out.println("- Only H M or E allowed");
      level = scan.next();
      }
      
         
      int MAX_index, MIN_index;
    
      
      ArrayList<Integer> index_list = new ArrayList<Integer>();
      MAX_index=questions.length;
      MIN_index=0;
      
        
        for (int index =0; index<questions.length; index++)
        {
        QuestionsQuizz number =new QuestionsQuizz();
        int b = number.numGen(index_list,questions.length);
        System.out.println(questions[b]);
        System.out.println("To submit your answer just write it down and press enter");
        System.out.println("To cheat press C");
        System.out.println("To skip question press S");
        System.out.println("To exit press E");

        String action= scan.next();
        boolean letters =((action.equalsIgnoreCase("C"))||(action.equalsIgnoreCase("S"))||(action.equalsIgnoreCase("E")));
        
        if (letters==true)
                {
        switch(action)
        { 
            
            case ("c"):
            case ("C"):
                actualcheated++;
                actualscore_computer++;
                System.out.println(answers[b]);
                break;
            case ("s"):    
            case ("S"):
                actualskipped++;
                break;
            case ("e"):    
            case ("E"):
                index=questions.length;
        }
                }
        
        else if((action.equalsIgnoreCase(answers[b])))
        {actualscore++;
        System.out.println("You got it right!");}
        
        else
        { actualfailed++;
            System.out.println("You know nothing...");}
      
       if (letters==false){
        System.out.println("It's the computer's turn.\n Waith whilst the computer thinks.");
        Thread.sleep(3000);
         
                    //Level easy
         
                if (level.equalsIgnoreCase("E")){ 
                    int MAX, MIN;
                    MAX=4;
                    MIN=1;
                    int number_e = ((int)(Math.random()*(MAX+1-MIN)))+MIN;


                     switch(number_e){

                        case 1:
                            actualscore_computer++;
                            System.out.println("Computer got it right!");
                            break;
                        default:
                            System.out.println("Computer got it wrong.");
                            break;
                     }}
                     //Level medium 
                if (level.equalsIgnoreCase("M")){ 
                    int MAX_m, MIN_m;
                    MAX_m=2;
                    MIN_m=1;
                    int number_m = ((int)(Math.random()*(MAX_m+1-MIN_m)))+MIN_m;


                     switch(number_m){

                        case 1:
                            actualscore_computer++;
                            System.out.println("Computer got it right!");
                            break;
                        default:
                            System.out.println("Computer got it wrong.");
                            break;
                     }}
                     
                     //Level hard
                if (level.equalsIgnoreCase("H")){ 
                    int MAX_h, MIN_h;
                    MAX_h=4;
                    MIN_h=1;
                    int number_h = ((int)(Math.random()*(MAX_h+1-MIN_h)))+MIN_h;


                     switch(number_h){

                        case 1:
                            System.out.println("Computer got it wrong.");
                            break;
                        default:
                            actualscore_computer++;
                            System.out.println("Computer got it right!");
                            break;
                     }}
        }}

        
        
        
        //scores.add(actualscore);
        //failed.add(actualfailed);
        //skipped.add(actualskipped);
        //cheated.add(actualcheated);
        //scores_computer.add(actualscore_computer);
        //failed_computer.add(actualfailed_computer);

       
        System.out.print("You scored "+actualscore+" "); 
        if (actualscore==1)
            System.out.println("point");
        else            
            System.out.println("points");
        
        System.out.print("The computer scored "+actualscore_computer+" ");
        if (actualscore_computer==1)
            System.out.println("point");
        else            
            System.out.println("points");
        
        System.out.print("You falied "+actualfailed+" ");
        if (actualfailed==1)
            System.out.println("question");
        else            
            System.out.println("questions");
        
        System.out.print("You skipped "+actualskipped+" ");
        if (actualskipped==1)
            System.out.println("question");
        else            
            System.out.println("questions");
        
        System.out.print("You cheated "+actualcheated+" ");
        if (actualcheated==1)
            System.out.println("question");
        else            
            System.out.println("questions");
        
        if(actualscore>actualscore_computer)
            System.out.println("You win!");
        else if (actualscore==actualscore_computer)
            System.out.println("It's a tie");
        else
            System.out.println("The computer wins!");
                
        }
        

}
    

