/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author Aluno
 */
public class MediaHarmonica {

    public float CalcularMedia(Media m) {
        float a = m.getNota1();
        float b = m.getNota1();
        float c = m.getNota1();
        float d = m.getNota1();
        return 4/((1/a)+(1/b)+(1/c)+(1/d));
    }
    
}
