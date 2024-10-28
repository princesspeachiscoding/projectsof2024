/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylisthomework;

/**
 *
 * @author niyad
 */
import java.util.Comparator;
public class QuestionComparator implements Comparator <Question> {
    @Override
    public int compare(Question q1, Question q2) 
    {
        return q1.getText().compareTo(q2.getText());
    }
    
}
