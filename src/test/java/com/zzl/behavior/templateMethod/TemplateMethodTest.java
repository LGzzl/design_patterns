package com.zzl.behavior.templateMethod;

public class TemplateMethodTest {

    public static void main(String[] args) {
        Student studentA = new StudentA();
        Student studentB = new StudentB();

        studentA.admission();
        System.out.println();
        studentB.admission();
    }
}
