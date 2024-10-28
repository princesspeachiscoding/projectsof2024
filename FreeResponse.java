/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylisthomework;

/**
 *
 * @author niyad
 */
public class FreeResponse extends Question {
    public FreeResponse(String questionText)
   {
      setText(questionText);
   }
   
   public boolean checkAnswer(String response)
   {
      setAnswer(response);
      return true;
   } 
}
