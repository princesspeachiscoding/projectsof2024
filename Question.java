/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylisthomework;

/**
 *
 * @author niyad
 */
public class Question {
   private String text;
   private String answer;

   /**
      Constructs a question with empty question and 
      answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }

   /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String questionText)   
   {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, 
         false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.equals(answer);
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.println(text);
   }
   
   /**
      @return the text of this question
   */
   public String getText()
   {
      return text;
   } 
}
