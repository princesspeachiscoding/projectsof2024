/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylisthomework;

/**
 *
 * @author niyad
 */
public class NumericQuestion extends Question {
     private double expected;
   
   public NumericQuestion(String questionText, double correctResponse)
   {
      setText(questionText);
      setAnswer(correctResponse);
   }
   
   public void display()
   {
      super.display();
   }
   public boolean checkAnswer(String response)
   {
      double value = Double.parseDouble(response);
      // return true if value and expected are very close
      return Math.abs(value - expected) < 1E-12;
   }
   public void setAnswer(double correctResponse)
   {
      expected = correctResponse;
   }
}
