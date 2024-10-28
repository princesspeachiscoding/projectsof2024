/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylisthomework;

/**
 *
 * @author niyad
 */
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListHomework {

    public static void main (String [] args ){
    
        ArrayList<Question> quiz = new ArrayList <Question> ();
        quiz.add(new FreeResponse ("How did you spend summer vacation?"));
        quiz.add(new NumericQuestion ("How much is 6*7?",42));
        quiz.add(new FillQuestion("The first electronic computer was the ____", "Enaic"));
        for (Question q:quiz){
            q.display();
        }
    
        
        
        //sort the list after all questions are added 
        Collections.sort(quiz, new QuestionComparator());
    
    }
}

