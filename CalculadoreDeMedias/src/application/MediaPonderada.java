/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author Aluno
 */
public class MediaPonderada extends Media {
    private float peso1; 
    private float peso2; 
    private float peso3; 
    private float peso4; 

    public MediaPonderada(float peso1, float peso2, float peso3, float peso4, float nota1, float nota2, float nota3, float nota4) {
        super(nota1, nota2, nota3, nota4);
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;
        this.peso4 = peso4;
    }

    public float getPeso1() {
        return peso1;
    }

    public void setPeso1(float peso1) {
        this.peso1 = peso1;
    }

    public float getPeso2() {
        return peso2;
    }

    public void setPeso2(float peso2) {
        this.peso2 = peso2;
    }

    public float getPeso3() {
        return peso3;
    }

    public void setPeso3(float peso3) {
        this.peso3 = peso3;
    }

    public float getPeso4() {
        return peso4;
    }

    public void setPeso4(float peso4) {
        this.peso4 = peso4;
    }

    

    public float CalcularMedia(MediaPonderada mp) {
        float a = mp.getNota1();
        float b = mp.getNota1();
        float c = mp.getNota1();
        float d = mp.getNota1();
        return (a*peso1*b*peso2*c*peso3*d*peso4)/(a+b+c+d);
    }
    
    
}
