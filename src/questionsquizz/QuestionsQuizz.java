/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsquizz;

import java.io.IOException;

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
     * @return
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
}
    /* public void print_answer(int number) throws IOException
     {
      QuestionsQuizz z= new QuestionsQuizz();
        String[] read_answers = z.read("/Users/margaridaferreira/Desktop/answerscapitals.txt");
      System.out.println( read_answers[number] ) ;
   
     }
      public void print_questions(int number) throws IOException
     {
      QuestionsQuizz z= new QuestionsQuizz();
        String[] read_answers = z.read("/Users/margaridaferreira/Desktop/capitals.txt");
      System.out.println( read_answers[number] ) ;
     
     }*/
     
    /*public static void main(String[] args)throws IOException {
        
      QuestionsQuizz q =new QuestionsQuizz();
      q.read_answers("/Users/margaridaferreira/Desktop/answerscapitals.txt");
      QuestionsQuizz a =new QuestionsQuizz();
      a.read_questions("/Users/margaridaferreira/Desktop/capitals.txt");
      
      System.out.println(questions[3]);
      System.out.println(answers[3]);
      
      
     /*String file_name2= "/Users/margaridaferreira/Desktop/answerscapitals.txt";
     ReadFile file2 = new ReadFile(file_name2);
     String[] aryLines2 = file2.OpenFile();
     System.out.print(aryLines2[9]);*/
     
      
     
        //QuestionsQuizz.read_questions("/Users/margaridaferreira/Desktop/capitals.txt", "/Users/margaridaferreira/Desktop/answerscapitals.txt");
    


