package AIDrivenResumeScreeningSystem;

import java.util.*;
class ResumeProcessor {
    public static void processResumes(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> r : resumes) {
            System.out.println("Processing resume of " + r.getCandidateName() +
                               " for role: " + r.getJobRole().getRoleName());
        }
    }
}

