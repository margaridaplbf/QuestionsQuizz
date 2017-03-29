/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsquizz;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author margaridaferreira
 */
public class QuestionsQuizz {

    public QuestionsQuizz(){}
    /**
     * @param file_questions
     * @return 
     * @throws java.io.IOException 
     */
    //public String[] read_questions (String file_questions) throws IOException {
       
      //String file_questions= "/Users/margaridaferreira/Desktop/capitals.txt";
      //String file_answers="/Users/margaridaferreira/Desktop/answerscapitals.txt";
      //try{
         // ReadFile file = new ReadFile(file_questions);
         // String[] capital_questions = file.OpenFile();
         // return capital_questions;
    //}
    /**
     *
     * @throws IOException
     */
    public static String[] questions;
    public static String[] answers;

    public String[] read_questions (String file) throws IOException {
          
          ReadFile file2 = new ReadFile(file);
          questions = file2.OpenFile();
         // System.out.println(capital_answers[3]);
          return questions;
          
    }
    
    public String[] read_answers (String file) throws IOException {
          
          ReadFile file2 = new ReadFile(file);
          answers = file2.OpenFile();
         // System.out.println(capital_answers[3]);
          return answers;
          
    }  
    
    
    
  
          
          //Method to shuffle the questions
          
     public static int numGen(ArrayList<Integer> array, int max){ 
     
      int random = (int)(Math.random()*max);
      
      for ( int index=0; index<array.size(); index++){
          if (array.get(index)==random){
              return numGen(array,max);
              
          }
      }
      array.add(random);
      return random;
     }
    }

    