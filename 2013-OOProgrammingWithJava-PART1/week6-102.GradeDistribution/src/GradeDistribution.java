
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class GradeDistribution {
    
    private ArrayList<Integer> grades;
    private String A = "";
    private String B = "";
    private String C = "";
    private String D = "";
    private String E = "";
    private String F = "";
    private int allScores = 0;
    private int accepted = 0;

    
    public GradeDistribution(){
        
        this.grades = new ArrayList();
    }
    
    public void addGrade(int grade){
        
        this.grades.add(grade);
    }
    
    public void calculateRankings(){
        
        
        for(int grade : grades){
           
            if(grade > 60){
                
            }
            else if(grade <= 60 && grade >= 50){
                A += "*";
                this.accepted++;
                this.allScores++;
        }else if(grade >= 45){
                B += "*";
                this.accepted++;
                this.allScores++;
    }else if(grade >= 40){
                C+= "*";
                this.accepted++;
                this.allScores++;
    }else if(grade >=35){
                D+= "*";
                this.accepted++;
                this.allScores++;
    }else if(grade >= 30){
                E+= "*";
                this.accepted++;
                this.allScores++;
    }else if(grade >= 0){
                F+= "*";
                this.allScores++;
    }
        }

    }
    
    public void printRankings(){
        
        System.out.println("Grade distribution:");
        System.out.println("5: "+A+"\n"+"4: "+B+"\n"+"3: "+C+"\n"+"2: "+D+"\n"+"1: "+E+"\n"+"0: "+F);
    }
    
    public double acceptance(){
        
        if(allScores > 0){
             return (double)(100*accepted)/allScores;
        }
            return 0;
       
    }
    
    
    
}
