package AIDrivenResumeScreeningSystem;

import java.util.*;
public class ResumeScreening {
    
    public static void main(String[] args) {
        List<Resume<? extends JobRole>> resumeList = new ArrayList<>();
        resumeList.add(new Resume<>("Amit", new SoftwareEngineer()));
        resumeList.add(new Resume<>("Balram", new DataScientist()));
        resumeList.add(new Resume<>("Chaman", new ProductManager()));

        System.out.println("AI-Driven Resume Screening:\n");
        ResumeProcessor.processResumes(resumeList);
    }
}