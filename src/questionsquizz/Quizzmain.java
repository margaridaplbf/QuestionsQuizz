/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsquizz;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import static questionsquizz.QuestionsQuizz.answers;
import static questionsquizz.QuestionsQuizz.questions;
/**
 *
 * @author margaridaferreira
 */
public class Quizzmain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Integer> scores = new ArrayList<Integer>();
        ArrayList<Integer> failed = new ArrayList<Integer>();
        ArrayList<Integer> skipped = new ArrayList<Integer>();
        ArrayList<Integer> cheated = new ArrayList<Integer>();
        
        int actualscore, actualfailed, actualskipped, actualcheated;
        actualscore=0;
        actualfailed=0;
        actualskipped=0;
        actualcheated=0;
        
        // String[] questions = {"Capital of Portugal?","Capital of Hungary?","Capital of USA?"};
        // String[] answers = {"Lisbon","Budapest", "Washington"};
      QuestionsQuizz q =new QuestionsQuizz();
      q.read_answers("/Users/margaridaferreira/Desktop/answerscapitals.txt");
      QuestionsQuizz a =new QuestionsQuizz();
      a.read_questions("/Users/margaridaferreira/Desktop/capitals.txt");
      
     /* System.out.println(questions[3]);
      System.out.println(answers[3]);*/
        
        
        for (int index =0; index<questions.length; index++)
        {
        System.out.println(questions[index]);
        System.out.println("To submit your answer just write it down and press enter");
        System.out.println("To cheat press C");
        System.out.println("To skip question press S");
        System.out.println("To exit press E");

        String action= scan.next();
        
        if ((action.equalsIgnoreCase("C"))||(action.equalsIgnoreCase("S"))||(action.equalsIgnoreCase("E")))
                {
        switch(action)
        { 
            
            case ("c"):
            case ("C"):
                actualcheated++;
                System.out.println(answers[index]);
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
        
        else if((action.equalsIgnoreCase(answers[index])))
        actualscore++;
        
        else
            actualfailed++;
        
        }
        scores.add(actualscore);
        failed.add(actualfailed);
        skipped.add(actualskipped);
        cheated.add(actualcheated);
        System.out.println("You scored "+scores+"points"); //Do it for singular and plural
        System.out.println("You falied "+failed+"questions");
        System.out.println("You skipped "+skipped+"questions");
        System.out.println("You cheated "+cheated+"questions");
                
        }
        
        
        // TODO code application logic here
    }
    

